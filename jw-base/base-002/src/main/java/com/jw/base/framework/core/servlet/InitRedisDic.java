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

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.cache.JwCache;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.util.AppUtil;
import com.jw.base.framework.core.util.StringUtil;

//测试
//hgetAll BLKLSTCXLRSN_1220
//hmget BLKLSTCXLRSN_1220 1
//hmget MARKET_1220_grp_dev 1000313
//echo -e -n "\xe5\x85\x8d\xe8\xb4\xb9\xe6\x88\xbf"
public class InitRedisDic {
	
	public static void initCacheDic(){
		
		long invokerStart = System.nanoTime();
		//redis中【系统参数】字典类型对应的大类的初始化
		//initSysParamType();
		//redis中【共同参数、集团酒店参数、集团餐饮参数】字典类型对应的大类的初始化
		initParamType();
		//初始化字典管控标示
		initParamCtrlType();
		
		//初始化不同语种的共同参数
		//（中文：1220）
		initCommonParam("1220");
		//（英语：1056）
		initCommonParam("1056");
		//（日语：1120）
		initCommonParam("1120");
		
		//初始化系统参数
		initSysParam("1220");
		initSysParam("1056");
		initSysParam("1120");
		
		//初始化各个集团库的base参数，base参数是总集，包含各个unit的子集
		initBaseParam("1220");
		initBaseParam("1056");
		initBaseParam("1120");
		
		long invokerEnd = System.nanoTime();
		long invokerElapsed = invokerEnd - invokerStart;
		BigDecimal b1 = BigDecimal.valueOf(invokerElapsed);
		System.err.println("初始化RedisDic...完成...耗时："+b1.divide(BigDecimal.valueOf(1000*1000*1000))+"s");
	}
	
	public static void initBaseParam(String languageId){
		//获取grp_开头的有效的master库的信息
		List<Map<String, String>> list = getDbName();
		for (Map<String, String> map : list){
			initGrpParam(map, languageId);
		}
	}
	
	/**
	 * 初始化集团参数redis中缓存字典
	 * 类型_语种_master库名.param_id.param_drpt
	 * @param map
	 * @param languageId
	 */
	private static void initGrpParam(Map<String, String> map, String languageId){
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
			sql.append("select t.id, t.param_typ, t.param_id, t.param_cd, ");
			sql.append("case when t1.param_drpt is null then t.param_drpt else t1.param_drpt end as param_drpt ");
			sql.append("from "+source_nm+".cmm_base_param t left join "+source_nm+".cmm_base_param_multilang t1 ");
			sql.append("on t.param_typ = t1.param_typ and t.param_id=t1.param_id and t1.language_id in ("+languageId+") ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("param_typ")) && StringUtil.isNotEmpty(rs.getString("param_id"))){
					jwCache.hset(rs.getString("param_typ")+"_"+languageId+"_"+source_nm, rs.getString("param_id") ,rs.getString("param_drpt")==null ? "" : rs.getString("param_drpt"));
					jwCache.hset("cd_"+rs.getString("param_typ")+"_"+languageId+"_"+source_nm, rs.getString("param_id") ,rs.getString("param_cd")==null ? "" : rs.getString("param_cd"));
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
	
	/**
	 * 获取grp_开头的有效的master库的信息
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
			sql.append("select source_nm, source_url, driver_cls, user_nm, user_pwd from pcm_dev.plf_ops_dbinfo where source_nm like 'grp_%' and master_flg='1' and status_flg='1' ");
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
	 * 初始化共同参数redis中缓存字典
	 * 类型_语种.param_id.param_drpt
	 */
	public static void initCommonParam(String languageId){
		JwCache jwCache = (JwCache) AppUtil.getBean("redisImpl");
		
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
			sql.append("select t.id, t.param_typ, t.param_id, t.param_cd, ");
			sql.append("case when t1.param_drpt is null then t.param_drpt else t1.param_drpt end as param_drpt ");
			sql.append("from pcm_dev.plf_cmm_parameter t left join pcm_dev.plf_cmm_param_multilang t1 ");
			sql.append("on t.param_typ = t1.param_typ and t.param_id=t1.param_id and t1.language_id in ("+languageId+") ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("param_typ")) && StringUtil.isNotEmpty(rs.getString("param_id"))){
					jwCache.hset(rs.getString("param_typ")+"_"+languageId, rs.getString("param_id") ,rs.getString("param_drpt")==null ? "" : rs.getString("param_drpt"));
					jwCache.hset("cd_"+rs.getString("param_typ")+"_"+languageId, rs.getString("param_id") ,rs.getString("param_cd")==null ? "" : rs.getString("param_cd"));
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
	
	/**
	 * 初始化系统参数redis中缓存字典
	 * 类型_语种.attribute_vlu.attribute_drpt
	 */
	public static void initSysParam(String languageId){
		JwCache jwCache = (JwCache) AppUtil.getBean("redisImpl");
		
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
			sql.append("select t.id, t.attribute_typ, t.attribute_vlu, ");
			sql.append("case when t1.attribute_drpt is null then t.attribute_drpt else t1.attribute_drpt end as attribute_drpt ");
			sql.append("from pcm_dev.plf_dd_attribute t left join pcm_dev.plf_dd_attribute_ml t1 ");
			sql.append("on t.attribute_typ = t1.attribute_typ and t.attribute_vlu=t1.attribute_vlu and t1.language_id in ("+languageId+") ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("attribute_typ")) && StringUtil.isNotEmpty(rs.getString("attribute_vlu"))){
					jwCache.hset(rs.getString("attribute_typ")+"_"+languageId, rs.getString("attribute_vlu") ,rs.getString("attribute_drpt")==null ? "" : rs.getString("attribute_drpt"));
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
	
	/**
	 * redis中【系统参数】字典类型对应的大类的初始化
	 */
	public static void initSysParamType(){
		JwCache jwCache = (JwCache) AppUtil.getBean("redisImpl");
		
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
			sql.append("select distinct attribute_typ from pcm_dev.plf_dd_attribute where status_flg='1' ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("attribute_typ"))){
					jwCache.setString(rs.getString("attribute_typ"), ConstantParm.ENUM_PARA_TYPE.SYS_PARA.getValue());
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
	
	public static void initParamType(){
		JwCache jwCache = (JwCache) AppUtil.getBean("redisImpl");
		
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
			sql.append("SELECT param_typ,(case when setting_typ='C' then 'COMMON_PARA' ");
			                       sql.append("when setting_typ='B' then 'CHAIN_BASE_PARA' ");
			                       sql.append("when setting_typ='P' then 'CHAIN_UNIT_PARA' ");
			                       sql.append("when setting_typ='D' then 'CHAIN_POS_PARA' ");
			                       sql.append("when setting_typ='TAX' then 'TAX_NEW' ");
			                       sql.append("when setting_typ='A' and (sku_flg is null or sku_flg='' or sku_flg='N') then 'SYS_PARA' ");
			                       sql.append("when setting_typ='A' and sku_flg='Y' then 'SYS_PARA_SKU' ");
			                       sql.append("when setting_typ='S' then param_typ ");
			                       sql.append("else '' end) as ptype ");
			sql.append("FROM pcm_dev.plf_cmm_paramsettings ");
			sql.append("where setting_typ in ('C','B','P','D','TAX','A','S') and status_flg='1' ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("param_typ")) && StringUtil.isNotEmpty(rs.getString("ptype"))){
					jwCache.setString(rs.getString("param_typ"), rs.getString("ptype"));
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
	
	public static void initParamCtrlType(){
		JwCache jwCache = (JwCache) AppUtil.getBean("redisImpl");
		
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
			sql.append("SELECT param_typ,(case when ctrl_flg='N' then 'N' ");
			sql.append("when ctrl_flg='Y' then 'Y' ");
			sql.append("else 'N' end) as ctrl_flg ");
			sql.append("FROM pcm_dev.plf_cmm_paramsettings ");
			sql.append("where status_flg='1' ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("param_typ")) && StringUtil.isNotEmpty(rs.getString("ctrl_flg"))){
					jwCache.setString(rs.getString("param_typ")+ConstantParm.CTRL, rs.getString("ctrl_flg"));
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
