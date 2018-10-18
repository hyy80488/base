package com.jw.base.framework.core;

public class ConstantRpt {
	/** 报表 表前缀 **/
	public static final String REPORTDBNM = "log_rptexport";
	
	/** 报表默认排序字段 */
	public static final String REPORT_DEFAULTQUERYBY = "default";
	/** 报表 查询条件   排序字段 */
	public static final String REPORT_QUERYBY = "query_orderby";
	/** 报表 查询条件   分组字段 */
	public static final String QUERY_GROUPBY = "query_groupby";
	/** 报表类型-单一数据源报表 */
	public static final String REPORT_SINGLE = "report_single";
	/** 报表类型-组合报表 */
	public static final String REPORT_MULTIPLE = "report_multiple";
	/** 报表类型-主子报表 */
	public static final String REPORT_MASTER_SLAVE = "report_master_slave";
	/** 主数据集 */
	public static final String DS_FLAG_MASTER = "1";
	/** 平级数据集 */
	public static final String DS_FLAG_MULTIPLE = "2";
	/** 从数据集 */
	public static final String DS_FLAG_SLAVE = "3";

	/** 等值条件 */
	public static final String WHERE_EQUALS = "EQUALS";
	/** IN条件 */
	public static final String WHERE_IN_LIST = "IN-LIST";
	/** 前%模糊条件 */
	public static final String WHERE_PRE_LIKE = "PRE-LIKE";
	/** 后%模糊条件 */
	public static final String WHERE_SUF_LIKE = "SUF-LIKE";
	/** 前后%模糊条件 */
	public static final String WHERE_ALL_LIKE = "ALL-LIKE";
	/** 集合过滤：等值条件 */
	public static final String WHERE_FILTER_EQUALS = "FILTER.EQUALS";
	/** 集合过滤：IN条件 */
	public static final String WHERE_FILTER_IN_LIST = "FILTER.IN-LIST";
	/** 集合过滤：前%模糊条件 */
	public static final String WHERE_FILTER_PRE_LIKE = "FILTER.PRE-LIKE";
	/** 集合过滤：后%模糊条件 */
	public static final String WHERE_FILTER_SUF_LIKE = "FILTER.SUF-LIKE";
	/** 集合过滤：前后%模糊条件 */
	public static final String WHERE_FILTER_ALL_LIKE = "FILTER.ALL-LIKE";
	
	/** DATATYP：【1、文本】 */
	public static final String DATATYP_STRING = "1";
	/** DATATYP：【2、整形】 */
	public static final String DATATYP_INTEGER = "2";
	/** DATATYP：【3、浮点型】 */
	public static final String DATATYP_FLOAT = "3";
	/** DATATYP：【4、日期】 */
	public static final String DATATYP_DATE = "4";
	/** DATATYP：【5、时间】 */
	public static final String DATATYP_TIMESTAMP = "5";

	/** BILLTYP：【1、账单PMS】 */
	public static final String BILLTYP_PMS = "FOLIO_DEFAULT";
	/** BILLTYP：【2、账单POS】 */
	public static final String BILLTYP_POS = "POSFOLIO_DEFAULT";
	/** BILLTYP：【3、入住单RC】 */
	public static final String BILLTYP_RC = "REGISTER_DEFAULT";
	/** BILLTYP：【4、押金单Depo】 */
	public static final String BILLTYP_DEPO = "DEPOSITE_DEFAULT";
	/** BILLTYP：【5、定单Adepo】 */
	public static final String BILLTYP_ADEPO = "ADVANCEDEPOSITE_DEFAULT";
	/** BILLTYP：【6、充值单】 */
	public static final String BILLTYP_LPSCHARGE = "LPSCHARGE_DEFAULT";
	/** BILLTYP：【7、退款单】 */
	public static final String BILLTYP_LPSREFUND = "LPSREFUND_DEFAULT";

	/**不限**/
	public static final String DTDOMAINTYP_1 = "1";
	/**范围**/
	public static final String DTDOMAINTYP_2 = "2";
	/**参数值**/
	public static final String DTDOMAINTYP_3 = "3";
	/**数据值**/
	public static final String DTDOMAINTYP_4 = "4";
	/**系统域**/
	public static final String DTDOMAINTYP_9 = "9";
	
	/**无默认值**/
	public static final String INPUTFLG_1 = "1";
	/**有默认值输入**/
	public static final String INPUTFLG_2 = "2";
	/**系统参数**/
	public static final String INPUTFLG_3 = "3";
	/**有默认值-公式**/
	public static final String INPUTFLG_4 = "4";
}
