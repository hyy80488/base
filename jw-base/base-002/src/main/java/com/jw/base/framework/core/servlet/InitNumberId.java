package com.jw.base.framework.core.servlet;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.jw.base.framework.core.cache.JwCache;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.util.AppUtil;
import com.jw.base.framework.core.util.StringUtil;

public class InitNumberId {
	public static void initSerialNumber(){
		long invokerStart = System.nanoTime();
		
		initNumberId();
		
		long invokerEnd = System.nanoTime();
		long invokerElapsed = invokerEnd - invokerStart;
		BigDecimal b1 = BigDecimal.valueOf(invokerElapsed);
		System.err.println("初始化发番...完成...耗时："+b1.divide(BigDecimal.valueOf(1000*1000*1000))+"s");
	}
	
	public static void initNumberId(){
		//获取grp_开头的有效的master库的信息
		List<Map<String, String>> list = getDbName();
		for (Map<String, String> map : list){
			setNumberId(map);
		}
	}
	
	/**
	 * 获取pcm_\grp_\log_\pms_开头的有效的master库的信息
	 * @return
	 */
	private static List<Map<String, String>> getDbName(){
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		
		try {
			String url_pcm = (String) PropertyConfigurer.getContextProperty("url.pcm");
			String driverClassName_pcm = (String) PropertyConfigurer.getContextProperty("driverClassName.pcm");
			String username_pcm = (String) PropertyConfigurer.getContextProperty("usr.pcm");
			String password_pcm = (String) PropertyConfigurer.getContextProperty("pwd.pcm");
			
			Class.forName(driverClassName_pcm);
			Properties props = new Properties();
			props.setProperty("user",username_pcm);
			props.setProperty("password",password_pcm);
//			props.setProperty("currentSchema","pcm_dev");
			Connection con = DriverManager.getConnection(url_pcm, props);
			
			StringBuilder sql = new StringBuilder();
			sql.append("select source_nm, source_url, driver_cls, user_nm, user_pwd from pcm_dev.plf_ops_dbinfo ");
			sql.append("where (source_nm like 'pcm_%' "
					     + "or source_nm like 'cms_%' "
					     + "or source_nm like 'ccs_%' "
					     + "or source_nm like 'cldr_%' "
					     + "or source_nm like 'crm_%' "
					     + "or source_nm like 'crs_%' "
					     + "or source_nm like 'ebs_%' "
					     + "or source_nm like 'gfc_%' "
					     + "or source_nm like 'grp_%' "
					     + "or source_nm like 'log_%' "
					     + "or source_nm like 'lps_%' "
					     + "or source_nm like 'pms_%' "
					     + "or source_nm like 'pos_%' "
					     + "or source_nm like 'scm_%') ");
			sql.append("and master_flg='1' and status_flg='1' ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("source_nm")) && StringUtil.isNotEmpty(rs.getString("source_url")) && StringUtil.isNotEmpty(rs.getString("driver_cls")) && StringUtil.isNotEmpty(rs.getString("user_nm")) && StringUtil.isNotEmpty(rs.getString("user_pwd"))){
					Map<String, String> m = new HashMap<String, String>();
					m.put("source_nm", rs.getString("source_nm"));
					m.put("source_url", rs.getString("source_url"));
					m.put("driver_cls", rs.getString("driver_cls"));
					m.put("user_nm", rs.getString("user_nm"));
					m.put("user_pwd", rs.getString("user_pwd"));
					list.add(m);
				}
			}
			
			if (rs != null) { // 关闭记录集
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) { // 关闭声明
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) { // 关闭连接对象
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接失败！");
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	/**
	 * 初始化各个库的发番缓存
	 * 如果缓存中没有，才根据cmm_number表中current_seq值初始化缓存
	 * 发番类型_master库名.current_seq
	 * @param map
	 */
	private static void setNumberId(Map<String, String> map){
		JwCache jwCache = (JwCache) AppUtil.getBean("redisImpl");
		try {
			String source_nm = map.get("source_nm");
			String url = map.get("source_url");
			String driverClassName = map.get("driver_cls");
			String username = map.get("user_nm");
			String password = map.get("user_pwd");
			
			Class.forName(driverClassName);
			Properties props = new Properties();
			props.setProperty("user",username);
			props.setProperty("password",password);
//			props.setProperty("currentSchema",source_nm);
			Connection con = DriverManager.getConnection(url, props);
			
			StringBuilder sql = new StringBuilder();
			sql.append("select id, number_typ, current_seq from "+source_nm+".cmm_number ");
			System.out.println(sql.toString());
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("number_typ")) && StringUtil.isNotEmpty(rs.getString("current_seq"))){
					//添加一条记录，仅当给定的key不存在时才插入
					//result 状态码，1插入成功且key不存在，0未插入，key存在
					long result = jwCache.setnx(rs.getString("number_typ")+"_"+source_nm, rs.getString("current_seq"));
//					System.out.println("set======================="+rs.getString("number_typ")+"_"+source_nm+"===================result===================="+result);
				}
			}
			
			if (rs != null) { // 关闭记录集
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) { // 关闭声明
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) { // 关闭连接对象
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接失败！");
			e.printStackTrace();
		}
	}
}
