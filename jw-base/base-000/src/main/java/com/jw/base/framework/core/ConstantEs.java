/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core;

import java.util.HashMap;
import java.util.Map;

/**
 * ## 类说明：
 * 	ES常量
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|ConstantEs.java新增
 */
public class ConstantEs {

	public static final String LANGUAG_ZH = "1220";
	public static final String LANGUAG_EN = "1056";
	public static final String LANGUAG_JP = "1120";
	
	public static final String ACCOUNT_NUMBER_ZH = "账号";
	public static final String ACCOUNT_NUMBER_EN = "Account Number";
	public static final String ACCOUNT_NUMBER_JP = "アカウント";
	
	public static final String ROOM_NUMBER_ZH = "房号";
	public static final String ROOM_NUMBER_EN = "Room Number";
	public static final String ROOM_NUMBER_JP = "部屋番号";
	
	public static final String PMS_RA_SNAPSHOT = "3160001RA-1.0.0-SNAPSHOT";
	public static final String POS_RA_SNAPSHOT = "3161001RA-1.0.0-SNAPSHOT";
	public static final String LPS_RA_SNAPSHOT = "3162001RA-1.0.0-SNAPSHOT";
	public static final String CRM_RA_SNAPSHOT = "3163001RA-1.0.0-SNAPSHOT";
	public static final String CRS_RA_SNAPSHOT = "3164001RA-1.0.0-SNAPSHOT";
	public static final String EBS_RA_SNAPSHOT = "3165001RA-1.0.0-SNAPSHOT";
	public static final String SCM_RA_SNAPSHOT = "3166001RA-1.0.0-SNAPSHOT";
	public static final String GFC_RA_SNAPSHOT = "3167001RA-1.0.0-SNAPSHOT";
	public static final String GRP_RA_SNAPSHOT = "3168001RA-1.0.0-SNAPSHOT";
	public static final String CCS_RA_SNAPSHOT = "3169001RA-1.0.0-SNAPSHOT";
	public static final String CLDR_RA_SNAPSHOT = "3260001RA-1.0.0-SNAPSHOT";
	
	public static final String PMS_RA = "3160001RA";
	public static final String POS_RA = "3161001RA";
	public static final String LPS_RA = "3162001RA";
	public static final String CRM_RA = "3163001RA";
	public static final String CRS_RA = "3164001RA";
	public static final String EBS_RA = "3165001RA";
	public static final String SCM_RA = "3166001RA";
	public static final String GFC_RA = "3167001RA";
	public static final String GRP_RA = "3168001RA";
	public static final String CCS_RA = "3169001RA";
	public static final String CLDR_RA = "3260001RA";
	
	/** 分隔符  */
//	public static final String SPLIT_STR = " ; \n";
//	public static final String SPLIT_STR = " ; ";
	public static final String SPLIT_STR = " , ";
	
	public static final String SPLIT_LEFT = " [ ";
//	public static final String SPLIT_LEFT = " { \"";
	
	public static final String SPLIT_RIGHT = " ] ";
//	public static final String SPLIT_RIGHT = "\" } ";
	
	public static final String SPLIT_COMMA = " , ";
	
	public static final String SPLIT_MID = " : ";
//	public static final String SPLIT_MID = "\" : \"";
	
	public static Map<String, String> SPLIT_COVR_MAP = new HashMap<>();
	public static Map<String, String> SPLIT_OLD_MAP = new HashMap<>();
	public static Map<String, String> SPLIT_NEW_MAP = new HashMap<>();
	
	public static Map<String, String> OPT_PEOPLE = new HashMap<>();
	public static Map<String, String> OPT_DATE = new HashMap<>();
	public static Map<String, String> OPT_NAME = new HashMap<>();
	
	public static Map<String, String> RECORD_KEY = new HashMap<>();
	
	static {
		SPLIT_COVR_MAP.put(LANGUAG_ZH, "修改");
		SPLIT_COVR_MAP.put(LANGUAG_EN, "update");
		SPLIT_COVR_MAP.put(LANGUAG_JP, "改訂");
		
		SPLIT_OLD_MAP.put(LANGUAG_ZH, "原值");
		SPLIT_OLD_MAP.put(LANGUAG_EN, "old");
		SPLIT_OLD_MAP.put(LANGUAG_JP, "最初");
		
		SPLIT_NEW_MAP.put(LANGUAG_ZH, "新值");
		SPLIT_NEW_MAP.put(LANGUAG_EN, "new");
		SPLIT_NEW_MAP.put(LANGUAG_JP, "新しい");
		
		OPT_PEOPLE.put(LANGUAG_ZH, "操作人");
		OPT_PEOPLE.put(LANGUAG_EN, "update by");
		OPT_PEOPLE.put(LANGUAG_JP, "操作する人");
		
		OPT_DATE.put(LANGUAG_ZH, "操作时间");
		OPT_DATE.put(LANGUAG_EN, "update date");
		OPT_DATE.put(LANGUAG_JP, "操作時間");
		
		OPT_NAME.put(LANGUAG_ZH, "操作名称");
		OPT_NAME.put(LANGUAG_EN, "update");
		OPT_NAME.put(LANGUAG_JP, "操作する");
		
		RECORD_KEY.put(LANGUAG_ZH, "记录");
		RECORD_KEY.put(LANGUAG_EN, "record");
		RECORD_KEY.put(LANGUAG_JP, "記録");
	}
}
