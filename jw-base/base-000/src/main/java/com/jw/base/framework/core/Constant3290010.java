package com.jw.base.framework.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

public class Constant3290010 {
	/**当日预计离店帐户未结帐检查**/
	public static final String N_0_DUEOUT = "0-DUEOUT";
	/**当日预订到店宾客未到检查	**/
	public static final String N_0_NOSHOW = "0-NOSHOW";
	/**周边接口假房在店检查		**/
	public static final String N_0_PSEUDO_STAY = "0-PSEUDO-STAY";
	/**餐饮检查		**/
	public static final String N_0_POS_CHECK = "0-POS-CHECK";
	/**定金假房账户检查		**/
	public static final String N_0_PSEUDO_ADEPO = "0-PSEUDO-ADEPO";
	/**团队预定释放检查		**/
	public static final String N_0_GRP_CHECK = "0-GRP-CHECK";
	
	/**餐厅夜审                              **/
	public static final String N_1_POS_NA = "1-POS-NA";
	/**过房费                                **/
	public static final String N_1_POSTRATE = "1-POSTRATE";
	/**团队预定释放                                **/
	public static final String N_2_GRP_RELEASE = "2-GRP-RELEASE";
	/**预订快照                              **/
	public static final String N_2_SNAPSHOT_ACCT = "2-SNAPSHOT-ACCT";
	/**占房快照                              **/
	public static final String N_2_SNAPSHOT_HB = "2-SNAPSHOT-HB";
	/**房间快照                              **/
	public static final String N_2_SNAPSHOT_ROOM = "2-SNAPSHOT-ROOM";
	/**账务明细快照                          **/
	public static final String N_2_SNAPSHOT_TRNJ = "2-SNAPSHOT-TRNJ";
	/**应收快照                          **/
	//public static final String N_2_SNAPSHOT_INVC = "2-SNAPSHOT-INVC";
	public static final String N_2_SNAPSHOT_ARJ = "2-SNAPSHOT-ARJ";
	/**更新业务日期                          **/
	public static final String N_2_UPDATE_BIZ_DT = "2-UPDATE-BIZ-DT";
	/**2-UPDATE-NOSHOW	当日预订到店宾客自动No Show **/
	public static final String N_2_UPDATE_NOSHOW = "2-UPDATE-NOSHOW";
	/**维修房、停用房、NBA按照设定自动释放   **/
	public static final String N_2_UPDATE_OOO = "2-UPDATE-OOO";
	/**住店客人房间的房态更改为脏房          **/
	public static final String N_2_UPDATE_RM_STAT = "2-UPDATE-RM-STAT";
	/**2-CLEAR-DPTPOSTFLG	加收标记清除          **/
	public static final String N_2_CLEAR_DPTPOSTFLG = "2-CLEAR-DPTPOSTFLG";
	
	
	/**数据清除                              **/
	public static final String N_3_HISTORY_DEL = "3-HISTORY-DEL";
	/**数据搬移                              **/
	public static final String N_3_HISTORY_MOV = "3-HISTORY-MOV";
	/**顾客信息处理                          **/
	public static final String N_3_PROFILE = "3-PROFILE";
	/**会员间夜数处理                         **/
	public static final String N_3_MEM_NIGHTS = "3-MEM-NIGHTS";
	/**宾客应收账处理                          **/
	public static final String N_3_CLTOAR = "3-CLTOAR";
	/**3-AR-MOV	应收数据搬移                      **/
	public static final String N_3_AR_MOV = "3-AR-MOV";
	/**3-AR-DEL	应收数据清除                    **/
	public static final String N_3_AR_DEL = "3-AR-DEL";
	/**系统账户处理                 **/
	public static final String N_3_SYSACCT = "3-SYSACCT";
	/** 房间信息统计 **/
	public static final String N_4_SUM_RMSTAT = "4-SUM-RMSTAT";
	/** 预订信息统计 **/
	public static final String N_4_SUM_RSVSTAT = "4-SUM-RSVSTAT";
	/** 预订杂项统计 **/
	public static final String N_4_SUM_RSVMISC = "4-SUM-RSVMISC";
	/** CRS审核 **/
	public static final String N_4_CRSAUDIT = "4-CRSAUDIT";
	
	/**批量提交条数                          **/
	public final static Integer SUBMINT_COUNT=50;
	
	/** 夜审删除 默认保留日期天数  **/
	public final static Integer RETAINDAY = 30;
	/** 开关表中 夜审删除日期天数  **/
//	public final static String DELAYSPAN = "DELAYSPAN";
	public final static String DELAYSPAN = "3290-010-001";
	/** 开关表中 应收删除日期天数  **/
	public final static String DELAYARSPAN = "3260-010-002";
	/** 开关表中的其中一个字段**/
	public final static String OPTIONNUM1 = "option_num1";
	/** 开关表中的其中一个字段**/
	public final static String OPTIONSTR1 = "option_str1";
	public final static String OPTION_DT1 = "option_dt1";
	public final static String OPTION_DT2 = "option_dt2";
	
	/*
	 * 
	 * 统计类型
	 * ALLR：全部房数，COR：免费房数，HUR：自用房数，VIPR：VIP房数，ONER：1人住房数，TWOR：2人住房数，
	 * 		TOMR：3人及以上住房数（Three Or More），CHLDR：纯儿童房数，HCHR：带儿童房数，CLKR：钟点房数，LSR：长包房数
	 * ALLP：全部人数，COP：免费人数，HOP：自用人数，VIPP：VIP人数，CLKP：钟点房人数，LSP：长包房人数
	 */
	public static enum ENUM_STAT_TYP {
		/** ALLR：全部房数 **/
		ALLR("ALLR", "R", "CAST('1' AS VARCHAR)"),
		/** COR：免费房数 **/
		COR("COR", "R", "CASE cohu_flg WHEN '1' THEN '1' ELSE '0' END"),
		/** HUR：自用房数 **/
		HUR("HUR", "R", "CASE cohu_flg WHEN '2' THEN '1' ELSE '0' END"),
		/** VIPR：VIP房数 **/
		VIPR("VIPR", "R", "vip_flg"),
		/** ONER：1人住房数 **/
		ONER("ONER", "R", "CASE adult_cnt WHEN 1 THEN '1' ELSE '0' END"),
		/** TWOR：2人住房数 **/
		TWOR("TWOR", "R", "CASE adult_cnt WHEN 2 THEN '1' ELSE '0' END"),
		/** TOMR：3人及以上住房数（Three Or More） **/
		TOMR("TOMR", "R", "CASE WHEN adult_cnt > 2 THEN '1' ELSE '0' END"),
		/** CHLDR：纯儿童房数 **/
		CHLDR("CHLDR", "R", "CASE WHEN (adult_cnt IS NULL OR adult_cnt = 0) AND child_cnt > 0 THEN '1' ELSE '0' END"),
		/** HCHR：带儿童房数 **/
		HCHR("HCHR", "R", "CASE WHEN adult_cnt> 0 AND child_cnt > 0 THEN '1' ELSE '0' END"),
		/** CLKR：钟点房数 **/
		CLKR("CLKR", "R", "CASE WHEN stay_typ = 'CR' THEN '1' ELSE '0' END"),
		/** LSR：长包房数 **/
		LSR("LSR", "R", "CASE WHEN stay_typ = 'LS' THEN '1' ELSE '0' END"),
		/** ALLP：全部人数 **/
		ALLP("ALLP", "P", "CAST('1' AS VARCHAR)"),
		/** COP：免费人数 **/
		COP("COP", "P", "CASE cohu_flg WHEN '1' THEN '1' ELSE '0' END"),
		/** HOP：自用人数 **/
		HOP("HOP", "P", "CASE cohu_flg WHEN '2' THEN '1' ELSE '0' END"),
		/** VIPP：VIP人数 **/
		VIPP("VIPP", "P", "vip_flg"),
		/** CLKP：钟点房人数 **/
		CLKP("CLKP", "P", "CASE WHEN stay_typ = 'CR' THEN '1' ELSE '0' END"),
		/** LSP：长包房人数 **/
		LSP("LSP", "P", "CASE WHEN stay_typ = 'LS' THEN '1' ELSE '0' END");
		// 值
		private String _value;
		private String _group;
		private String _groupSql;

		public String getValue() {
			return _value;
		}
		public String getGroup() {
			return _group;
		}
		public String getGroupSql() {
			return " "+ _groupSql+ " " + this.getValue() + ", ";
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_STAT_TYP(String value, String group, String groupSql) {
			this._value = value;
			this._group = group;
			this._groupSql = groupSql;
		}
		
		public static Map<String, ENUM_STAT_TYP> getGroupVlu(String group){
			Map<String, ENUM_STAT_TYP> map = new HashMap<>();
			if(StringUtils.isBlank(group)){
				return map;
			}
			for (ENUM_STAT_TYP typ : ENUM_STAT_TYP.values()) {
				if(Objects.equals(typ.getGroup(), group)){
					map.put(typ.getValue(), typ);
				}
			}
			return map;
		}
	}
}
