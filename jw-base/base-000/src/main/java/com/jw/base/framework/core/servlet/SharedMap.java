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
import java.util.concurrent.ConcurrentHashMap;

import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.util.StringUtil;


//sql5.append("SELECT param_typ, ");
//sql5.append("case when paramsetting_typ = '91' or paramsetting_typ = '92' then '0' ");
//sql5.append("     when paramsetting_typ = '1' or paramsetting_typ = '2' then '1' else '3' end as paramsettingtyp ");
//sql5.append("FROM pcm_dev.plf_cmm_paramsettings ");
public class SharedMap {
	
	/**
	 * dto.field ==> paramtype(大类)
	 * loadConfigMapParam.(Map<String, String> paramtype, ...)
	 * 
	 * dtonm.fieldnm                                          ==>  paramtype
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom.phoneFlg    ==>  3
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。areaReal    ==>  1
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。floorId     ==>  1
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。buildingId  ==>  1
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。areaId      ==>  1
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。internetFlg ==>  3
	 */
	private static Map<String, String> configMap_dtoField_paramtype = new ConcurrentHashMap<String, String>(1000);
	
	
	/**
	 * dto.field ==> paramsubtype(小类)
	 * loadConfigMapParam.(..., Map<String, String> paramsubtype, ...)
	 * 
	 * dtonm.fieldnm                                          ==>  paramsubtype
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom.phoneFlg    ==>  HPT_HK_ROOM.PHONE_FLG
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。areaReal    ==>  AREA
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。floorId     ==>  FLOOR
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。buildingId  ==>  BUILDING
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。areaId      ==>  AREA
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。internetFlg ==>  HPT_HK_ROOM.INTERNET_FLG
	 */
	private static Map<String, String> configMap_dtoField_paramsubtype = new ConcurrentHashMap<String, String>(1000);
	
	
	/**
	 * dto.field ==> drptmap(Map描述信息)
	 * loadConfigMapParam.(..., Map<String, String> drptmap, ...)
	 * 
	 * dtonm.fieldnm                                                   ==>  drptmap
	 * com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto.drptMap  ==>  {"roomtypId":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto。roomtypId",
	 *                                                                       "salerId":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto。salerId",
	 *                                                                       "bkguestId":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto。bkguestId",
	 *                                                                       "negoCorpNo":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto。negoCorpNo",
	 *                                                                       "cancelUnitUid":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto。cancelUnitUid",
	 *                                                                       "reguestId":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto。reguestId"}
	 */
	private static Map<String, String> configMap_dtoField_drptmap = new ConcurrentHashMap<String, String>(1000);
	
	
	/**
	 * dto.field ==> trantype(特殊转换类型定义)
	 * loadConfigMapParam.(..., Map<String, String> tranType)
	 * 
	 * dtonm.fieldnm                                                              ==>  tranType
	 * com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountGuestDto.guestId        ==>  1 【宾客ID】
	 * com.jw.hms.pms.m3240.f010.dto.HptFinTransRequestDto.guestId                ==>  1 【宾客ID】
	 * com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountGuestLittleDto.guestId  ==>  1 【宾客ID】
	 */
	private static Map<String, String> configMap_dtoField_trantype = new ConcurrentHashMap<String, String>(1000);
	
	
	/**
	 * dto.field ==> field属性描述信息
	 * loadConfigMap(String languageId, Map<String, String> configMap, ...)
	 * 
	 * dtonm.fieldnm                                          ==>   fielddrpt
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom.phoneFlg    ==>   电话开通级别
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。areaReal    ==>   逻辑楼区
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。floorId     ==>   楼层代码
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。buildingId  ==>   楼座代码
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。areaId      ==>   楼区代码
	 * com.jw.hms.pms.m3250.f010.entity.HptHkRoom。internetFlg ==>   网络开通标识
	 */
	private static Map<String, String> configMap_zh = new ConcurrentHashMap<String, String>(1000);
	private static Map<String, String> configMap_en = new ConcurrentHashMap<String, String>(1000);
	private static Map<String, String> configMap_jp = new ConcurrentHashMap<String, String>(1000);
	
	/**
	 * clsnm.infmethod ==> API接口描述信息
	 * loadConfigMap(String languageId, Map<String, ..., Map<String, String> interfacedefMap)
	 * 
	 * clsnm.infmethod                                                         ==>   infnm
	 * com.jw.hms.pms.m3220.f010.controller.RsvAcctController.cancelPartner    ==>   取消同来人
	 * com.jw.hms.pms.m3220.f010.controller.RsvAcctController.getRsvAcct       ==>   获取账户基本信息
	 * com.jw.hms.pms.m3220.f010.controller.RsvAcctController.setPartner       ==>   设置同来人
	 * com.jw.hms.pms.m3220.f010.controller.RsvAcctController.queryLinkAcctNo  ==>   查询关联账号
	 * com.jw.hms.pms.m3220.f010.controller.RsvAcctController.queryRsvAcctList ==>   同来人列表查询
	 */
	private static Map<String, String> interfacedefMap_zh = new ConcurrentHashMap<String, String>(1000);
	private static Map<String, String> interfacedefMap_en = new ConcurrentHashMap<String, String>(1000);
	private static Map<String, String> interfacedefMap_jp = new ConcurrentHashMap<String, String>(1000);
	
	
	/**
	 * attribute_typ.attribute_vlu ==> attribute值的描述信息【ES翻译时暂不用】
	 */
	private static Map<String, String> clsnm_attribute_typ_value_map_zh = new ConcurrentHashMap<String, String>(1000);
	private static Map<String, String> clsnm_attribute_typ_value_map_en = new ConcurrentHashMap<String, String>(1000);
	private static Map<String, String> clsnm_attribute_typ_value_map_jp = new ConcurrentHashMap<String, String>(1000);
	
	
	/**
	 * 所有【从库】的数据库配置集合
	 */
	private static Map<String, Map<String, String>> configMap_db_slave = new ConcurrentHashMap<String, Map<String, String>>();
	
	
	/**
	 * 所有【主库】的数据库配置集合
	 */
	private static Map<String, Map<String, String>> configMap_db_master = new ConcurrentHashMap<String, Map<String, String>>();
	
	/**
	 * 特殊转换字典
	 * transform_type_id [1]  ==>  宾客信息
	 *                   [5]  ==>  账号信息
	 */
	private static Map<String, String> transformTypeMap_zh = new ConcurrentHashMap<String, String>(1000);
	private static Map<String, String> transformTypeMap_en = new ConcurrentHashMap<String, String>(1000);
	private static Map<String, String> transformTypeMap_jp = new ConcurrentHashMap<String, String>(1000);
	
	/**
	 * 特殊转换集合
	 * transform_type_id [1]  ==>  [{"transform_id":"10001","transform_type_name":"GUEST_INFO",  "table_name":"rsv_account_guest","where_field":"guest_id",...}]
	 *                   [5]  ==>  [{"transform_id":"10005","transform_type_name":"ACCOUNT_INFO","table_name":"rsv_account",      "where_field":"acct_no",...},
	 *                              {"transform_id":"10023","transform_type_name":"ACCOUNT_INFO","table_name":"rsv_account_guest","where_field":"acct_no",...}]
	 * 
	 */
	private static Map<String, List<Map<String, String>>> transformMap = new ConcurrentHashMap<String, List<Map<String, String>>>();
	
	/**
	 * 特殊转换所需获取字段明细集合
	 * transform_type_id [1]  ==>  transform_id [10001]  ==>  [{"select_fields":"alt_nm",                           "select_fields_type":"class java.lang.String", "select_fields_as":"alt_nm",    "select_fields_drpt":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountGuestDto.altNm"},
	 *                                                         {"select_fields":"first_nm",                         "select_fields_type":"class java.lang.String", "select_fields_as":"first_nm",  "select_fields_drpt":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountGuestDto.firstNm"},
	 *                                                         {"select_fields":"to_char(birthdate, 'HH24:MI:SS')", "select_fields_type":"class java.lang.String", "select_fields_as":"birthdate", "select_fields_drpt":"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountGuestDto.birthdate"}]
	 */
	private static Map<String, Map<String, List<Map<String, String>>>> transformDetailMap = new ConcurrentHashMap<String, Map<String, List<Map<String, String>>>>();
	
	
	/**
	 * 初始化：dto.field ==> paramtype(大类)
	 * 初始化：dto.field ==> paramsubtype(小类)
	 * 初始化：dto.field ==> drptmap(map集合)
	 * 初始化：dto.field ==> tranType(特殊转换)
	 * @param paramtype
	 * @param paramsubtype
	 * @param drptmap
	 * @param tranType
	 */
	public static void loadConfigMapParam(Map<String, String> paramtype, Map<String, String> paramsubtype, Map<String, String> drptmap, Map<String, String> tranType){
		try {
			String url_platform = (String) PropertyConfigurer.getContextProperty("url.platform");
			String driverClassName_platform = (String) PropertyConfigurer.getContextProperty("driverClassName.platform");
			String username_platform = (String) PropertyConfigurer.getContextProperty("usr.platform");
			String password_platform = (String) PropertyConfigurer.getContextProperty("pwd.platform");
			
			Class.forName(driverClassName_platform);
			Properties props = new Properties();
			props.setProperty("user",username_platform);
			props.setProperty("password",password_platform);
//			props.setProperty("currentSchema","platform");
			Connection con = DriverManager.getConnection(url_platform, props);
			
			StringBuilder sql = new StringBuilder();
			sql.append("select id, dtonm, fieldnm, fielddrpt, paramtype, paramsubtype, trantype, drptmap from jw_platform.ind_dtofield ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("dtonm")) && StringUtil.isNotEmpty(rs.getString("fieldnm"))){
					paramtype.put(rs.getString("dtonm")+"."+rs.getString("fieldnm"), rs.getString("paramtype")==null ? "" : rs.getString("paramtype"));
					paramsubtype.put(rs.getString("dtonm")+"."+rs.getString("fieldnm"), rs.getString("paramsubtype")==null ? "" : rs.getString("paramsubtype"));
					drptmap.put(rs.getString("dtonm")+"."+rs.getString("fieldnm"), rs.getString("drptmap")==null ? "" : rs.getString("drptmap"));
					tranType.put(rs.getString("dtonm")+"."+rs.getString("fieldnm"), rs.getString("trantype")==null ? "" : rs.getString("trantype"));
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
			System.err.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("数据库连接失败！");
			e.printStackTrace();
		}
	}
	
	/**
	 * 初始化：dto.field ==> field属性描述信息
	 * 初始化：attribute_typ.attribute_vlu ==> attribute值的描述信息
	 * @param languageId
	 * @param configMapEn
	 * @param attributeEn
	 */
	public static void loadConfigMap(String languageId, Map<String, String> configMap, Map<String, String> attribute, Map<String, String> interfacedefMap, Map<String, String> transformTypeMap){
		try {
			/////////////////////////////////////////////////////////////////////////////////////
			/////////////////////////////jw_platform.ind_dtofield////////////////////////////////
			/////////////////////////////jw_platform.ind_dtofield_ml/////////////////////////////
			/////////////////////////////////////////////////////////////////////////////////////
			String url_platform = (String) PropertyConfigurer.getContextProperty("url.platform");
			String driverClassName_platform = (String) PropertyConfigurer.getContextProperty("driverClassName.platform");
			String username_platform = (String) PropertyConfigurer.getContextProperty("usr.platform");
			String password_platform = (String) PropertyConfigurer.getContextProperty("pwd.platform");
			
			Class.forName(driverClassName_platform);
			Properties props = new Properties();
			props.setProperty("user",username_platform);
			props.setProperty("password",password_platform);
//			props.setProperty("currentSchema","platform");
			Connection con = DriverManager.getConnection(url_platform, username_platform, password_platform);
			
			StringBuilder sql = new StringBuilder();
			sql.append("select t.id, t.dtonm, t.fieldnm, ");
			sql.append("case when t1.fielddrpt is null then t.fielddrpt else t1.fielddrpt end as fielddrpt, ");
			sql.append("t.paramtype, t.paramsubtype ");
			sql.append("from jw_platform.ind_dtofield t left join jw_platform.ind_dtofield_ml t1 on t.dtonm = t1.dtonm and t.fieldnm = t1.fieldnm ");
			sql.append("and t1.language_id in ("+languageId+") ");
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("dtonm")) && StringUtil.isNotEmpty(rs.getString("fieldnm"))){
					configMap.put(rs.getString("dtonm")+"."+rs.getString("fieldnm"), rs.getString("fielddrpt")==null ? "" : rs.getString("fielddrpt"));
				}
			}
			
			/////////////////////////////////////////////////////////////////////////////////////
			/////////////////////////////jw_platform.ifd_interfacedef////////////////////////////
			/////////////////////////////jw_platform.ifd_interfacedef_ml/////////////////////////
			/////////////////////////////////////////////////////////////////////////////////////
			StringBuilder sqlinterfacedef = new StringBuilder();
			sqlinterfacedef.append("select t.id, t.clsnm, t.infmethod, ");
			sqlinterfacedef.append("case when t1.infnm is null then t.infnm else t1.infnm end as infnm ");
			sqlinterfacedef.append("from jw_platform.ifd_interfacedef t left join jw_platform.ifd_interfacedef_ml t1 on t.clsnm = t1.clsnm and t.infmethod = t1.infmethod ");
			sqlinterfacedef.append("and t1.language_id in ("+languageId+") ");
			PreparedStatement psinterfacedef = con.prepareStatement(sqlinterfacedef.toString());
			ResultSet rsinterfacedef = psinterfacedef.executeQuery();
			
			while (rsinterfacedef.next()) {
				if(StringUtil.isNotEmpty(rsinterfacedef.getString("clsnm")) && StringUtil.isNotEmpty(rsinterfacedef.getString("infmethod"))){
					interfacedefMap.put(rsinterfacedef.getString("clsnm")+"."+rsinterfacedef.getString("infmethod"), rsinterfacedef.getString("infnm")==null ? "" : rsinterfacedef.getString("infnm"));
				}
			}
			
			/////////////////////////////////////////////////////////////////////////////////////
			/////////////////////////////jw_platform.ifd_transform_dic///////////////////////////
			/////////////////////////////jw_platform.ifd_transform_dic_ml////////////////////////
			/////////////////////////////////////////////////////////////////////////////////////
			StringBuilder sqlIfdTransformDic = new StringBuilder();
			sqlIfdTransformDic.append("select t.id, t.transform_type_id, ");
			sqlIfdTransformDic.append("case when t1.transform_type_drpt is null then t.transform_type_drpt else t1.transform_type_drpt end as transform_type_drpt ");
			sqlIfdTransformDic.append("from jw_platform.ifd_transform_dic t left join jw_platform.ifd_transform_dic_ml t1 on t.transform_type_id = t1.transform_type_id ");
			sqlIfdTransformDic.append("and t1.language_id in ("+languageId+") ");
			PreparedStatement psIfdTransformDic = con.prepareStatement(sqlIfdTransformDic.toString());
			ResultSet rsIfdTransformDic = psIfdTransformDic.executeQuery();
			
			while (rsIfdTransformDic.next()) {
				if(StringUtil.isNotEmpty(rsIfdTransformDic.getString("transform_type_id"))){
					transformTypeMap.put(rsIfdTransformDic.getString("transform_type_id"), rsIfdTransformDic.getString("transform_type_drpt")==null ? "" : rsIfdTransformDic.getString("transform_type_drpt"));
				}
			}
			
			/////////////////////////////////////////////////////////////////////////////////////
			/////////////////////////////pcm_dev.plf_dd_attribute////////////////////////////////
			/////////////////////////////pcm_dev.plf_dd_attribute_ml/////////////////////////////
			/////////////////////////////////////////////////////////////////////////////////////
			String url_pcm = (String) PropertyConfigurer.getContextProperty("url.pcm");
			String driverClassName_pcm = (String) PropertyConfigurer.getContextProperty("driverClassName.pcm");
			String username_pcm = (String) PropertyConfigurer.getContextProperty("usr.pcm");
			String password_pcm = (String) PropertyConfigurer.getContextProperty("pwd.pcm");
			
			Class.forName(driverClassName_pcm);
			Properties props2 = new Properties();
			props2.setProperty("user",username_pcm);
			props2.setProperty("password",password_pcm);
//			props2.setProperty("currentSchema","pcm_dev");
			Connection con_pcm = DriverManager.getConnection(url_pcm, props2);
			
			StringBuilder sql5 = new StringBuilder();
			sql5.append("SELECT t.id, t.attribute_typ, t.attribute_vlu, ");
			sql5.append("case when t1.attribute_drpt is null then t.attribute_drpt else t1.attribute_drpt end as attribute_drpt ");
			sql5.append("FROM pcm_dev.plf_dd_attribute t left join pcm_dev.plf_dd_attribute_ml t1 ");
			sql5.append("on t.attribute_typ = t1.attribute_typ and t.attribute_vlu = t1.attribute_vlu and t1.language_id in ("+languageId+") ");
			PreparedStatement ps5 = con_pcm.prepareStatement(sql5.toString());
			ResultSet rs5 = ps5.executeQuery();
			
			while (rs5.next()) {
				if(StringUtil.isNotEmpty(rs5.getString("attribute_typ")) && StringUtil.isNotEmpty(rs5.getString("attribute_vlu"))){
					attribute.put(rs5.getString("attribute_typ")+"."+rs5.getString("attribute_vlu"), rs5.getString("attribute_drpt"));
				}
			}
			
			/////////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////释放资源/////////////////////////////////////////
			/////////////////////////////////////////////////////////////////////////////////////
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
			
			if (rsinterfacedef != null) { // 关闭记录集
				try {
					rsinterfacedef.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (psinterfacedef != null) { // 关闭声明
				try {
					psinterfacedef.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (rsIfdTransformDic != null) { // 关闭记录集
				try {
					rsIfdTransformDic.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (psIfdTransformDic != null) { // 关闭声明
				try {
					psIfdTransformDic.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (rs5 != null) { // 关闭记录集
				try {
					rs5.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps5 != null) { // 关闭声明
				try {
					ps5.close();
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
			if (con_pcm != null) { // 关闭连接对象
				try {
					con_pcm.close();
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
	}
	
	public static void initMap(){
		
		long invokerStart = System.nanoTime();
		
		configMap_dtoField_paramtype = null;
		configMap_dtoField_paramsubtype = null;
		configMap_dtoField_drptmap = null;
		configMap_dtoField_trantype = null;
		
		configMap_zh = null;
		interfacedefMap_zh = null;
		clsnm_attribute_typ_value_map_zh = null;
		transformTypeMap_zh = null;
		
		configMap_en = null;
		interfacedefMap_en = null;
		clsnm_attribute_typ_value_map_en = null;
		transformTypeMap_en = null;
		
		configMap_jp = null;
		interfacedefMap_jp = null;
		clsnm_attribute_typ_value_map_jp = null;
		transformTypeMap_jp = null;
		
		configMap_db_slave = null;
		configMap_db_master = null;
		
		//初始化paramtype(大类) + paramsubtype(小类)
		Map<String, String> paramtype = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> paramsubtype = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> drptmap = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> trantype = new ConcurrentHashMap<String, String>(1000);
		loadConfigMapParam(paramtype, paramsubtype, drptmap, trantype);
		configMap_dtoField_paramtype = paramtype;
		configMap_dtoField_paramsubtype = paramsubtype;
		configMap_dtoField_drptmap = drptmap;
		configMap_dtoField_trantype = trantype;
		
		//zh-CN（中文简体：1220）
		Map<String, String> configMapZh = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> interfacedefMapZh = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> attributeZh = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> transformTypeMapZh = new ConcurrentHashMap<String, String>(1000);
		loadConfigMap("1220", configMapZh, attributeZh, interfacedefMapZh, transformTypeMapZh);
		configMap_zh = configMapZh;
		interfacedefMap_zh = interfacedefMapZh;
		clsnm_attribute_typ_value_map_zh = attributeZh;
		transformTypeMap_zh = transformTypeMapZh;
		
		//en-US（英语（美国：1056））
		Map<String, String> configMapEn = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> interfacedefMapEn = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> attributeEn = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> transformTypeMapEn = new ConcurrentHashMap<String, String>(1000);
		loadConfigMap("1056", configMapEn, attributeEn, interfacedefMapEn, transformTypeMapEn);
		//每次初始化，把map指针指向新创建的map
		configMap_en = configMapEn;
		interfacedefMap_en = interfacedefMapEn;
		clsnm_attribute_typ_value_map_en = attributeEn;
		transformTypeMap_en = transformTypeMapEn;
		
		//ja-JP（日语（日本：1120））
		Map<String, String> configMapJp = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> interfacedefMapJp = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> attributeJp = new ConcurrentHashMap<String, String>(1000);
		Map<String, String> transformTypeMapJp = new ConcurrentHashMap<String, String>(1000);
		loadConfigMap("1120", configMapJp, attributeJp, interfacedefMapJp, transformTypeMapJp);
		//每次初始化，把map指针指向新创建的map
		configMap_jp = configMapJp;
		interfacedefMap_jp = interfacedefMapJp;
		clsnm_attribute_typ_value_map_jp = attributeJp;
		transformTypeMap_jp = transformTypeMapJp;
		
		Map<String, Map<String, String>> configMapSlave = new ConcurrentHashMap<String, Map<String, String>>(1000);
		Map<String, Map<String, String>> configMapMaster = new ConcurrentHashMap<String, Map<String, String>>(1000);
		loadConfigMapDb(configMapSlave, configMapMaster);
		configMap_db_slave = configMapSlave;
		configMap_db_master = configMapMaster;
		
		Map<String, List<Map<String, String>>> tMap = new ConcurrentHashMap<String, List<Map<String, String>>>(1000);
		Map<String, Map<String, List<Map<String, String>>>> tDetailMap = new ConcurrentHashMap<String, Map<String, List<Map<String, String>>>>(1000);
		loadTransformMap(tMap, tDetailMap);
		transformMap = tMap;
		transformDetailMap = tDetailMap;
		
		long invokerEnd = System.nanoTime();
		long invokerElapsed = invokerEnd - invokerStart;
		BigDecimal b1 = BigDecimal.valueOf(invokerElapsed);
		System.err.println("初始化SharedMap...完成...耗时："+b1.divide(BigDecimal.valueOf(1000*1000*1000))+"s");
	}
	
	/**
	 * 初始化：所有【从库】+【主库】的数据库配置集合
	 * @param configMapSlave
	 * @param configMapMaster
	 */
	public static void loadConfigMapDb(Map<String, Map<String, String>> configMapSlave, Map<String, Map<String, String>> configMapMaster){
		try {
			String url_pcm = (String) PropertyConfigurer.getContextProperty("url.pcm");
			String driverClassName_pcm = (String) PropertyConfigurer.getContextProperty("driverClassName.pcm");
			String username_pcm = (String) PropertyConfigurer.getContextProperty("usr.pcm");
			String password_pcm = (String) PropertyConfigurer.getContextProperty("pwd.pcm");
			
			Class.forName(driverClassName_pcm);
			Properties props = new Properties();
			props.setProperty("user",username_pcm);
			props.setProperty("password",password_pcm);
//			props2.setProperty("currentSchema","pcm_dev");
			Connection con_pcm = DriverManager.getConnection(url_pcm, props);
			
			StringBuilder sql = new StringBuilder();
			sql.append("select db_id, master_db_id, source_nm, driver_cls, source_url, user_nm, user_pwd, master_flg from pcm_dev.plf_ops_dbinfo where status_flg='1' ");
			PreparedStatement ps = con_pcm.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				if(StringUtil.isNotEmpty(rs.getString("source_nm")) && StringUtil.isNotEmpty(rs.getString("source_url")) && StringUtil.isNotEmpty(rs.getString("driver_cls")) && StringUtil.isNotEmpty(rs.getString("user_nm")) && StringUtil.isNotEmpty(rs.getString("user_pwd")) && StringUtil.isNotEmpty(rs.getString("master_flg"))){
					Map<String, String> m = new HashMap<String, String>();
					m.put("source_nm", rs.getString("source_nm"));
					m.put("source_url", rs.getString("source_url"));
					m.put("driver_cls", rs.getString("driver_cls"));
					m.put("user_nm", rs.getString("user_nm"));
					m.put("user_pwd", rs.getString("user_pwd"));
					if("0".equals(rs.getString("master_flg"))){
						configMapSlave.put(rs.getString("source_nm"), m);
					}else
					if("1".equals(rs.getString("master_flg"))){
						configMapMaster.put(rs.getString("source_nm"), m);
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
			if (con_pcm != null) { // 关闭连接对象
				try {
					con_pcm.close();
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
	}
	
	/**
	 * 初始化：特殊转换集合
	 * @param transformMap
	 */
	public static void loadTransformMap(Map<String, List<Map<String, String>>> transformMap, Map<String, Map<String, List<Map<String, String>>>> transformDetailMap){
		try {
			String url_platform = (String) PropertyConfigurer.getContextProperty("url.platform");
			String driverClassName_platform = (String) PropertyConfigurer.getContextProperty("driverClassName.platform");
			String username_platform = (String) PropertyConfigurer.getContextProperty("usr.platform");
			String password_platform = (String) PropertyConfigurer.getContextProperty("pwd.platform");
			
			Class.forName(driverClassName_platform);
			Properties props = new Properties();
			props.setProperty("user",username_platform);
			props.setProperty("password",password_platform);
			Connection con_platform = DriverManager.getConnection(url_platform, props);
			
			StringBuilder sqlMain = new StringBuilder();
			sqlMain.append("SELECT transform_type_id FROM jw_platform.ifd_transform_dic where active='1' ");
			PreparedStatement psMain = con_platform.prepareStatement(sqlMain.toString());
			ResultSet rsMain = psMain.executeQuery();
			while (rsMain.next()) {
				if (StringUtil.isNotEmpty(rsMain.getString("transform_type_id"))){
					StringBuilder sql = new StringBuilder();
					sql.append("SELECT transform_id,transform_type_id,transform_type_name,transform_db_type,table_name,where_field,where_field_type FROM jw_platform.ifd_transform_def where active='1' and transform_type_id='"+rsMain.getString("transform_type_id")+"' ");
					PreparedStatement ps = con_platform.prepareStatement(sql.toString());
					ResultSet rs = ps.executeQuery();
					List<Map<String, String>> listMain = new ArrayList<Map<String, String>>();
					Map<String, List<Map<String, String>>> listMainDetail = new HashMap<String, List<Map<String, String>>>();
					while (rs.next()) {
						if(StringUtil.isNotEmpty(rs.getString("transform_id")) && StringUtil.isNotEmpty(rs.getString("transform_type_id")) && StringUtil.isNotEmpty(rs.getString("transform_db_type")) && StringUtil.isNotEmpty(rs.getString("table_name")) && StringUtil.isNotEmpty(rs.getString("where_field")) && StringUtil.isNotEmpty(rs.getString("where_field_type"))){
							Map<String, String> m = new HashMap<String, String>();
							m.put("transform_id", rs.getString("transform_id").trim());
							m.put("transform_type_id", rs.getString("transform_type_id").trim());
							m.put("transform_db_type", rs.getString("transform_db_type").trim());
							m.put("table_name", rs.getString("table_name").trim());
							m.put("where_field", rs.getString("where_field").trim());
							m.put("where_field_type", rs.getString("where_field_type").trim());
							listMain.add(m);
							
							//组装transformDetailMap
							StringBuilder sqlDetail = new StringBuilder();
							sqlDetail.append("SELECT transform_id,select_fields,select_fields_type,select_fields_as,select_fields_drpt FROM jw_platform.ifd_transform_detail where active='1' and transform_id="+rs.getString("transform_id"));
							PreparedStatement psDetail = con_platform.prepareStatement(sqlDetail.toString());
							ResultSet rsDetail = psDetail.executeQuery();
							List<Map<String, String>> listDetail = new ArrayList<Map<String, String>>();
							while (rsDetail.next()) {
								if(StringUtil.isNotEmpty(rsDetail.getString("transform_id")) && StringUtil.isNotEmpty(rsDetail.getString("select_fields")) && StringUtil.isNotEmpty(rsDetail.getString("select_fields_type")) && StringUtil.isNotEmpty(rsDetail.getString("select_fields_as")) && StringUtil.isNotEmpty(rsDetail.getString("select_fields_drpt"))){
									Map<String, String> mDetail = new HashMap<String, String>();
									mDetail.put("transform_id", rsDetail.getString("transform_id").trim());
									mDetail.put("select_fields", rsDetail.getString("select_fields").trim());
									mDetail.put("select_fields_type", rsDetail.getString("select_fields_type").trim());
									mDetail.put("select_fields_as", rsDetail.getString("select_fields_as").trim());
									mDetail.put("select_fields_drpt", rsDetail.getString("select_fields_drpt").trim());
									listDetail.add(mDetail);
								}
							}
							listMainDetail.put(rs.getString("transform_id").trim(), listDetail);
							if (rsDetail != null) { // 关闭记录集
								try {
									rsDetail.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
							if (psDetail != null) { // 关闭声明
								try {
									psDetail.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
						}
					}
					transformMap.put(rsMain.getString("transform_type_id").trim(), listMain);
					transformDetailMap.put(rsMain.getString("transform_type_id").trim(), listMainDetail);
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
			}
			
			if (rsMain != null) { // 关闭记录集
				try {
					rsMain.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (psMain != null) { // 关闭声明
				try {
					psMain.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con_platform != null) { // 关闭连接对象
				try {
					con_platform.close();
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
	}
	
	/**
	 * ## 方法说明：
	 * 	获取中文描述信息
	 * @return
	 */
	public static Map<String, String> getConfigZh() {
		return configMap_zh;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取英文描述信息
	 * @return
	 */
	public static Map<String, String> getConfigEn() {
		return configMap_en;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取日文描述信息
	 * @return
	 */
	public static Map<String, String> getConfigJp() {
		return configMap_jp;
	}
	
	/**
	 * @return the interfacedefMap_zh
	 */
	public static Map<String, String> getInterfacedefMapZh() {
		return interfacedefMap_zh;
	}

	/**
	 * @return the interfacedefMap_en
	 */
	public static Map<String, String> getInterfacedefMapEn() {
		return interfacedefMap_en;
	}

	/**
	 * @return the interfacedefMap_jp
	 */
	public static Map<String, String> getInterfacedefMapJp() {
		return interfacedefMap_jp;
	}

	/**
	 * ## 方法说明：
	 * 	获取attribute的type和值的对应
	 * @return
	 */
	public static Map<String, String> getAttributeDrptZh() {
		return clsnm_attribute_typ_value_map_zh;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取attribute的type和值的对应
	 * @return
	 */
	public static Map<String, String> getAttributeDrptEn() {
		return clsnm_attribute_typ_value_map_en;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取attribute的type和值的对应
	 * @return
	 */
	public static Map<String, String> getAttributeDrptJp() {
		return clsnm_attribute_typ_value_map_jp;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取字段名对应的paramtype
	 * @return
	 */
	public static Map<String, String> getParamTypeName() {
		return configMap_dtoField_paramtype;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取字段名对应的paramsubtype
	 * @return
	 */
	public static Map<String, String> getParamSubTypeName() {
		return configMap_dtoField_paramsubtype;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取字段名对应的drptmap
	 * @return
	 */
	public static Map<String, String> getDrptmap() {
		return configMap_dtoField_drptmap;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取字段名对应的特殊转换类型定义
	 * @return
	 */
	public static Map<String, String> getTrantype() {
		return configMap_dtoField_trantype;
	}

	/**
	 * ## 方法说明：
	 * 	所有【从库】的数据库配置集合
	 * @return
	 */
	public static Map<String, Map<String, String>> getConfigMapDbSlave() {
		return configMap_db_slave;
	}

	/**
	 * ## 方法说明：
	 * 	所有【主库】的数据库配置集合
	 * @return
	 */
	public static Map<String, Map<String, String>> getConfigMapDbMaster() {
		return configMap_db_master;
	}
	
	/**
	 * ## 方法说明：
	 * 	特殊转换集合
	 * @return
	 */
	public static Map<String, List<Map<String, String>>> getTransformMap() {
		return transformMap;
	}
	
	/**
	 * ## 方法说明：
	 * 	特殊转换所需获取字段明细集合
	 * @return
	 */
	public static Map<String, Map<String, List<Map<String, String>>>> getTransformDetailMap() {
		return transformDetailMap;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取中文特殊转换字典
	 * @return
	 */
	public static Map<String, String> getTransformTypeMapZh() {
		return transformTypeMap_zh;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取英文特殊转换字典
	 * @return
	 */
	public static Map<String, String> getTransformTypeMapEn() {
		return transformTypeMap_en;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取日文特殊转换字典
	 * @return
	 */
	public static Map<String, String> getTransformTypeMapJp() {
		return transformTypeMap_jp;
	}
}
