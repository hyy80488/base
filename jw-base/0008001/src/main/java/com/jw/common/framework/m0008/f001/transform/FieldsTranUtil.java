package com.jw.common.framework.m0008.f001.transform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections.MapUtils;

import com.jw.base.framework.core.ConstantEs;
import com.jw.base.framework.core.ConstantParmTran;
import com.jw.base.framework.core.servlet.SharedMap;
import com.jw.base.framework.core.util.ListUtil;
import com.jw.base.framework.core.util.StringUtil;

public class FieldsTranUtil {

	//dto.field ==> 特殊定义属性
	private static Map<String, Map<String, String>> configMap_db_master = SharedMap.getConfigMapDbMaster();
	
	/**
	 * 特殊转换集合
	 * transform_type_id [1]  ==>  [{"transform_id":"10001","transform_type_name":"GUEST_INFO",  "table_name":"rsv_account_guest","where_field":"guest_id",...}]
	 *                   [5]  ==>  [{"transform_id":"10005","transform_type_name":"ACCOUNT_INFO","table_name":"rsv_account",      "where_field":"acct_no",...},
	 *                              {"transform_id":"10023","transform_type_name":"ACCOUNT_INFO","table_name":"rsv_account_guest","where_field":"acct_no",...}]
	 * 
	 */
	private static Map<String, List<Map<String, String>>> transformMap = SharedMap.getTransformMap();
	/**
	 * 特殊转换所需获取字段明细集合
	 * transform_type_id [1]  ==>  transform_id [10001]  ==>  [{"select_fields":"alt_nm",                           "select_fields_type":"class java.lang.String", "select_fields_as":"alt_nm",    "select_fields_drpt":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountGuestDto.altNm"},
	 *                                                         {"select_fields":"first_nm",                         "select_fields_type":"class java.lang.String", "select_fields_as":"first_nm",  "select_fields_drpt":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountGuestDto.firstNm"},
	 *                                                         {"select_fields":"to_char(birthdate, 'HH24:MI:SS')", "select_fields_type":"class java.lang.String", "select_fields_as":"birthdate", "select_fields_drpt":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountGuestDto.birthdate"}]
	 */
	private static Map<String, Map<String, List<Map<String, String>>>> transformDetailMap = SharedMap.getTransformDetailMap();
	
	private static Map<String, String> transformTypeMap_zh = SharedMap.getTransformTypeMapZh();
	private static Map<String, String> transformTypeMap_en = SharedMap.getTransformTypeMapEn();
	private static Map<String, String> transformTypeMap_jp = SharedMap.getTransformTypeMapJp();
	
	private static Map<String, String> getTransformTypeMap(String languageId){
		switch (languageId) {
			case ConstantEs.LANGUAG_ZH:
				return transformTypeMap_zh;
			case ConstantEs.LANGUAG_EN:
				return transformTypeMap_en;
			case ConstantEs.LANGUAG_JP:
				return transformTypeMap_jp;
			default:
				return transformTypeMap_zh;
		}
	}
	
	//特殊属性，通过sql查询特定表，获取内容拼接
	public static String tranBySqls(String trantype, Map<String, String> dbmap, Object value, String objectType, Map<String, String> configMap, String languageId){
		StringBuilder sb = new StringBuilder();
		Map<String, String> transformTypeMap = getTransformTypeMap(languageId);
		if (null!=transformMap && null!=configMap_db_master && ListUtil.isNotEmpty(transformMap.get(trantype)) && MapUtils.isNotEmpty(transformDetailMap.get(trantype)) && null!=transformTypeMap){
			if (StringUtil.isNotEmpty(transformTypeMap.get(trantype))){
				sb.append(transformTypeMap.get(trantype) + ConstantEs.SPLIT_COMMA);
			}
			for (Map<String, String> mm : transformMap.get(trantype)){
				Map<String, String> m = configMap_db_master.get(dbmap.get(mm.get("transform_db_type")));
				if (MapUtils.isNotEmpty(m) && ListUtil.isNotEmpty(transformDetailMap.get(trantype).get(mm.get("transform_id")))){
					sb.append(doInfo(m, value, trantype, objectType, mm.get("table_name"), mm.get("where_field"), transformDetailMap.get(trantype).get(mm.get("transform_id")), configMap));
				}
			}
		}
		if (StringUtil.isNotEmpty(sb.toString())){
			sb.delete(sb.length()-3, sb.length()-1);
		}
		return sb.toString();
	}
	
	//获取信息
	private static String doInfo(Map<String, String> map, Object value, String trantype, String objectType, String tableName, String whereField, List<Map<String, String>> lDetail, Map<String, String> configMap){
		StringBuilder sb = new StringBuilder();
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
			Connection con = DriverManager.getConnection(url, props);
			
			StringBuilder sql = new StringBuilder();
			
			String whereValue = "";
			if (ConstantParmTran.TYPE_STRING.equals(objectType)){
				whereValue = "'"+String.valueOf(value)+"'";
			}else
			if (ConstantParmTran.TYPE_INTEGER.equals(objectType)){
				whereValue = ""+value+"";
			}
			
			StringBuilder selectStr = new StringBuilder();
			if (ListUtil.isNotEmpty(lDetail)){
				for (Map<String, String> m : lDetail){
					selectStr.append(m.get("select_fields") + " as " + m.get("select_fields_as") + ",");
				}
				if (StringUtil.isNotEmpty(selectStr.toString())){
					selectStr.deleteCharAt(selectStr.length()-1);
				}
			}
			
			if (StringUtil.isNotEmpty(whereValue) && StringUtil.isNotEmpty(selectStr.toString())){
				sql.append("select "+selectStr.toString()
						+" from "+source_nm+"."+tableName
						+" where "+whereField
						+" = "+whereValue+" ");
				PreparedStatement ps = con.prepareStatement(sql.toString());
				ResultSet rs = ps.executeQuery();
				
				while (rs.next()) {
					for (Map<String, String> m : lDetail){
						if (ConstantParmTran.TYPE_STRING.equals(m.get("select_fields_type"))){
							if (StringUtil.isNotEmpty(rs.getString(m.get("select_fields_as")))){
								sb.append(configMap.get(m.get("select_fields_drpt")) + ConstantEs.SPLIT_MID + rs.getString(m.get("select_fields_as")) + ConstantEs.SPLIT_COMMA);
							}
						}else
						if (ConstantParmTran.TYPE_INTEGER.equals(m.get("select_fields_type"))){
							sb.append(configMap.get(m.get("select_fields_drpt")) + ConstantEs.SPLIT_MID + String.valueOf(rs.getInt(m.get("select_fields_as"))) + ConstantEs.SPLIT_COMMA);
						}
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
			}
			if (con != null) { // 关闭连接对象
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			System.err.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("数据库连接失败！");
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
