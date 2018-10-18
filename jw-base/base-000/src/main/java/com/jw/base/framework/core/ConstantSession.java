package com.jw.base.framework.core;

public class ConstantSession {
	
	/** sessionkey过期时间：2个小时不操作过期  */
	public static final Integer SESSION_KEY_EXPIRED = 7200;
	/** token过期时间：48个小时不操作过期  */
	public static final Integer TOKEN_KEY_EXPIRED = 172800;
	/** TRACERID过期时间(生产者)：7*24个小时不操作过期  */
	public static final Integer TRACERID_KEY_EXPIRED_SEND = 604800;
	/** TRACERID过期时间(消费者)：3*24个小时不操作过期  */
	public static final Integer TRACERID_KEY_EXPIRED_RESIVE = 259200;
	
	/**
	 * 缓存中hotelCode对应酒店uid
	 */
	public static final String CACHE_KEY_SESSION_HOTELCODE = "SESSION_HOTELCODE";
	/**
	 * 临时缓存中SessionInfo对象的Key
	 */
	public static final String CACHE_KEY_SESSION_INFO = "SESSION_INFO";
	/**
	 * 临时缓存中UserInfo对象的Key
	 */
	public static final String CACHE_KEY_USER_INFO = "USER_INFO";
	/**
	 * 临时缓存中当前数据库标志
	 */
	public static final String CACHE_KEY_DB_TYP = "DB_TYP";

	/**
	 * ThreadLocal中销售点所选部门
	 */
	public static final String THREADLOCAL_KEY_DEPT_UID = "DEPT_UID";
	
	/**
	 * ThreadLocal中SessionKey的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_KEY = "SESSION_KEY";
	
	/**
	 * ThreadLocal中SessionKey的Key
	 */
	public static final String THREADLOCAL_KEY_DB_TYP = "DB_TYP";
	/**
	 * ThreadLocal中Token的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_TOKEN = "SESSION_TOKEN";
	/**
	 * ThreadLocal中语种ID的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_LANGUAGE_ID = "SESSION_LANGUAGE_ID";
	/**
	 * ThreadLocal中语种代码的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_LANGUAGE_CD = "SESSION_LANGUAGE_CD";
	/**
	 * ThreadLocal中追踪ID的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_TRACER_ID = "SESSION_TRACER_ID";
	/**
	 * ThreadLocal中业务ID的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_BUSINESS_ID = "SESSION_BUSINESS_ID";
	/**
	 * ThreadLocal中ASYNCID的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_ASYNC_ID = "SESSION_ASYNC_ID";
	/**
	 * ThreadLocal中token标识的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_TOKEN_STATUS = "SESSION_TOKEN_STATUS";
	/**
	 * ThreadLocal中操作酒店UID
	 */
	public static final String THREADLOCAL_KEY_SESSION_UNITUID_OU = "SESSION_UNITUID_OU";
	/**
	 * ThreadLocal中操作系统(PMS,GRP)
	 */
	public static final String THREADLOCAL_KEY_SESSION_OPER_SYSTEM = "SESSION_OPER_SYSTEM";
	/**
	 * ThreadLocal中受控酒店List的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_UNITUID_POS = "SESSION_UNITUID_POS";
	/**
	 * ThreadLocal中执行酒店Code的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_UNITUID_EXCU = "SESSION_UNITUID_EXCU";
	/**
	 * ThreadLocal中系统类型 ，切换数据源用
	 */
	public static final String THREADLOCAL_KEY_SESSION_SYS_TYPE_NAME = "SESSION_UNITCD_EXCU";
	/**
	 * ThreadLocal中当前操作系统的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_SYSTEM = "SESSION_SYSTEM";
	/**
	 * ThreadLocal中权限Map的Key
	 */
	public static final String THREADLOCAL_KEY_USER_PERMISSION_MAP = "USER_PERMISSION_MAP";
	/**
	 * ThreadLocal中权限Map的Key
	 */
	public static final String THREADLOCAL_KEY_USER_DEPT_PERMISSION_MAP = "USER_DEPT_PERMISSION_MAP";
	/**
	 * ThreadLocal中报表权限Map的Key
	 */
	public static final String THREADLOCAL_KEY_USER_REPORT_MAP = "USER_REPORT_MAP";
	/**
	 * ThreadLocal中UrlMap的Key
	 */
	public static final String THREADLOCAL_KEY_SESSION_URL_MAP = "SESSION_URL_MAP";
	/**
	 * ThreadLocal中人员状态
	 */
	public static final String THREADLOCAL_KEY_SESSION_PERSONNEL_STATUS = "SESSION_PERSONNEL_STATUS";
	/**
	 * ThreadLocal中用户ID的Key
	 */
	public static final String THREADLOCAL_KEY_USER_ID = "USER_ID";
	/**
	 * ThreadLocal中用户Code的Key
	 */
	public static final String THREADLOCAL_KEY_USER_CD = "USER_CD";
	/**
	 * ThreadLocal中用户名的Key
	 */
	public static final String THREADLOCAL_KEY_USER_NAME = "USER_NAME";
	/**
	 * ThreadLocal中用户英文名的Key
	 */
	public static final String THREADLOCAL_KEY_USER_NAME_EN = "USER_NAME_EN";
	/**
	 * ThreadLocal中登录账号的UID
	 */
	public static final String THREADLOCAL_KEY_USER_UID = "USER_UID";
	/**
	 * ThreadLocal中登录IP的Key
	 */
	public static final String THREADLOCAL_KEY_USER_LOGIN_IP = "USER_LOGIN_IP";
	/**
	 * ThreadLocal中登录时间的Key
	 */
	public static final String THREADLOCAL_KEY_USER_LOGIN_DHMS = "USER_LOGIN_DHMS";
	/**
	 * ThreadLocal中用户状态的Key
	 */
	public static final String THREADLOCAL_KEY_USER_STATUS_FLG = "USER_STATUS_FLG";
	/**
	 * ThreadLocal中用户权级的Key
	 */
	public static final String THREADLOCAL_KEY_USER_RIGHTCLS = "USER_RIGHTCLS";
	/**
	 * ThreadLocal中用户所属酒店代码的UID
	 */
	public static final String THREADLOCAL_KEY_USER_UNITUID = "USER_UNITUID";
	/**
	 * ThreadLocal中用户所属集团代码的UID
	 */
	public static final String THREADLOCAL_KEY_USER_CHAINUID = "USER_CHAINUID";
	/**
	 * ThreadLocal中用户工作站代码
	 */
	public static final String THREADLOCAL_KEY_USER_WORKSTATION_NO = "USER_WORKSTATION_NO";
	/**
	 * ThreadLocal中用户角色List的Key
	 */
	public static final String THREADLOCAL_KEY_USER_ROLELIST = "USER_ROLELIST";
	/**
	 * ThreadLocal中供前端接口访问的用户权限信息的Key
	 */
	public static final String THREADLOCAL_KEY_USER_WEB_PERMS = "USER_WEB_PERMS";
	/**
	 * ThreadLocal中供前端接口访问的用户菜单信息的Key
	 */
	public static final String THREADLOCAL_KEY_USER_WEB_MENUS = "USER_WEB_MENUS";
	
	/**
	 * ThreadLocal中酒店UID的Key
	 */
	public static final String THREADLOCAL_KEY_USER_UNIT_UID = "USER_UNIT_UID";
	/**
	 * ThreadLocal中酒店Code的Key
	 */
	public static final String THREADLOCAL_KEY_USER_UNIT_CODE = "USER_UNIT_CODE";
	/**
	 * ThreadLocal中酒店名的Key
	 */
	public static final String THREADLOCAL_KEY_USER_UNIT_NAME = "USER_UNIT_NAME";
	
	
	/**
	 * ThreadLocal中酒店UID的上级管控酒店UID
	 */
	public static final String THREADLOCAL_KEY_CTRL_UNIT_UID = "CTRL_UNIT_UID";
	/**
	 * ThreadLocal中酒店UID的上级管控酒店UID
	 */
	public static final String THREADLOCAL_KEY_CTRL_UNIT_FLG = "CTRL_UNIT_FLG";
	
	/**
	 * ThreadLocal中酒店UID的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_UID = "UNIT_UID";
	/**
	 * ThreadLocal中酒店Code的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_CODE = "UNIT_CODE";
	/**
	 * ThreadLocal中酒店名的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_NAME = "UNIT_NAME";
	/**
	 * ThreadLocal中酒店英文名的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_NAME_EN = "UNIT_NAME_EN";
	/**
	 * ThreadLocal中酒店语种ID的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_LANGUAGE_ID = "UNIT_LANGUAGE_ID";
	/**
	 * ThreadLocal中酒店语种代码的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_LANGUAGE_CD = "UNIT_LANGUAGE_CD";
	/**
	 * ThreadLocal中酒店币种的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_CURRENCY = "UNIT_CURRENCY_ID";
	/**
	 * ThreadLocal中酒店币种的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_CURRENCY_CD = "UNIT_CURRENCY_CD";
	/**
	 * ThreadLocal中酒店币种的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_CURRENCY_NM = "UNIT_CURRENCY_NM";
	/**
	 * ThreadLocal中酒店所属国家的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_COUNTRY = "UNIT_COUNTRY";
	/**
	 * ThreadLocal中酒店小数处理方式的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_ROUND_MODE = "UNIT_ROUND_MODE";
	/**
	 * ThreadLocal中酒店保留小数位数的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_SCALE = "UNIT_SCALE";
	/**
	 * ThreadLocal中酒店保留小数位数的Key
	 */
	public static final String THREADLOCAL_KEY_FUNC_CODE = "_FUNC_CODE";
	/**
	 * ThreadLocal中酒店状态的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_STATUS = "UNIT_STATUS";
	/**
	 * ThreadLocal中酒店敏感信息密钥的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_CRYPTKEY = "UNIT_CRYPTKEY";
	/**
	 * ThreadLocal中酒店敏感信息密钥的Map
	 */
	public static final String THREADLOCAL_KEY_UNIT_CRYPTMAP = "UNIT_CRYPTMAP";
	/**
	 * ThreadLocal中酒店敏感信息展现方式的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_CRYPTFIELD_SHOWMODE = "UNIT_CRYPTFIELD_SHOWMODE";
	/**
	 * ThreadLocal中酒店操作的数据库名的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_DBNAME = "UNIT_DBNAME";
	/**
	 * ThreadLocal中酒店操作的数据库名的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_HIS_DBNAME = "UNIT_HIS_DBNAME";
	/**
	 * ThreadLocal中单位职能属性的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_FLG = "UNIT_FLG";
	/**
	 * ThreadLocal中管理模式的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_MNT_FLG = "UNIT_MNT_FLG";
	/**
	 * ThreadLocal中酒店购买的产品List的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_PRODUCTLIST = "UNIT_PRODUCTLIST";
	/**
	 * ThreadLocal中酒店购买的产品功能List的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_PRODUCT_PERMSLIST = "UNIT_PRODUCT_PERMSLIST";
	/**
	 * ThreadLocal中酒店购买的功能和产品对应关系的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_PP = "UNIT_PRODUCT_PP";
	/**
	 * ThreadLocal中酒店开关表数据的Key
	 */
	public static final String THREADLOCAL_KEY_UNIT_GRPCMMOPTIONMAP = "UNIT_GRPCMMOPTIONMAP";
	/**
	 * ThreadLocal中酒店开关表数据的Key  酒店业务日期
	 */
	public static final String THREADLOCAL_KEY_UNIT_BUSINESSDT = "UNIT_BUSINESSDT";
	/**
	 * ThreadLocal中酒店开关表数据的Key  酒店业审核日期
	 */
	public static final String THREADLOCAL_KEY_UNIT_AUDITDT = "UNIT_AUDITDT";
	/**
	 * ThreadLocal中酒店开关表数据的Key  酒店夜审日期
	 */
	public static final String THREADLOCAL_KEY_UNIT_NIGHTDT = "UNIT_NIGHTDT";
	/**
	 * ThreadLocal中酒店父集团
	 */
	public static final String THREADLOCAL_KEY_UNIT_UNIT_PARENT_MAP= "UNIT_PARENT_MAP";
	/**
	 * ThreadLocal中酒店父管控
	 */
	public static final String THREADLOCAL_KEY_UNIT_CTRL_UNIT_PARENT = "CTRL_UNIT_PARENT";
	/**
	 * ThreadLocal中酒店子管控
	 */
	public static final String THREADLOCAL_KEY_UNIT_CTRL_UNIT_CHILD = "CTRL_UNIT_CHILD";
	/**
	 * ThreadLocal中酒店父集团
	 */
	public static final String THREADLOCAL_KEY_UNIT_UNIT_PARENT = "UNIT_PARENT";
	/**
	 * ThreadLocal中酒店子集团
	 */
	public static final String THREADLOCAL_KEY_UNIT_UNIT_CHILD = "UNIT_CHILD";
	/**
	 * ThreadLocal中酒店开关表数据的Key  酒店日期标志段
	 */
	public static final String THREADLOCAL_KEY_UNIT_HOTELDTFLG = "UNIT_HOTELDTFLG";
	/**
	 * ThreadLocal中酒店开关表数据的Key  开始夜审标志
	 */
	public static final String THREADLOCAL_KEY_UNIT_CUTOFFFLG = "UNIT_CUTOFFFLG";
	/**
	 * ThreadLocal中酒店开关表数据的Key  交易审核标志
	 */
	public static final String THREADLOCAL_KEY_UNIT_AUDITFLG = "UNIT_AUDITFLG";
	/**
	 * ThreadLocal中酒店开关表数据的Key  结束夜审标志
	 */
	public static final String THREADLOCAL_KEY_UNIT_CLOSEFLG = "UNIT_CLOSEFLG";
	/**
	 * ThreadLocal中酒店开关表数据的Key  过房费标志
	 */
	public static final String THREADLOCAL_KEY_UNIT_UNIT_POSTRTFLG = "UNIT_POSTRTFLG";

	/**
	 * ThreadLocal中集团UID
	 */
	public static final String THREADLOCAL_KEY_CHAIN_UID = "CHAIN_UID";
	/**
	 * ThreadLocal中集团代码
	 */
	public static final String THREADLOCAL_KEY_CHAIN_CODE = "CHAIN_CODE";
	/**
	 * ThreadLocal中集团名称
	 */
	public static final String THREADLOCAL_KEY_CHAIN_NAME = "CHAIN_NAME";
	/**
	 * ThreadLocal中集团描述
	 */
	public static final String THREADLOCAL_KEY_CHAIN_DRPT = "CHAIN_DRPT";
	/**
	 * ThreadLocal中集团属性
	 */
	public static final String THREADLOCAL_KEY_CHAIN_FLG = "CHAIN_FLG";
	/**
	 * ThreadLocal中集团购买的产品List的Key
	 */
	public static final String THREADLOCAL_KEY_CHAIN_PRODUCTLIST = "CHAIN_PRODUCTLIST";
	/**
	 * ThreadLocal中集团购买的产品功能List的Key
	 */
	public static final String THREADLOCAL_KEY_CHAIN_PRODUCT_PERMSLIST = "CHAIN_PRODUCT_PERMSLIST";
	/**
	 * ThreadLocal中集团购买的功能和产品对应关系
	 */
	public static final String THREADLOCAL_KEY_CHAIN_PP = "CHAIN_PP";
	/**
	 * ThreadLocal中集团dbname
	 */
	public static final String THREADLOCAL_KEY_CHAIN_DBNAME = "CHAIN_DBNAME";
	/**
	 * ThreadLocal中集团dbname
	 */
	public static final String THREADLOCAL_KEY_CHAIN_HIS_DBNAME = "CHAIN_HIS_DBNAME";
	/**
	 * ThreadLocal中集团POS dbname
	 */
	public static final String THREADLOCAL_KEY_POS_DBNAME = "POS_DBNAME";
	/**
	 * ThreadLocal中集团POS dbname
	 */
	public static final String THREADLOCAL_KEY_POS_HIS_DBNAME = "POS_HIS_DBNAME";
	/**
	 * ThreadLocal中集团CCS dbname
	 */
	public static final String THREADLOCAL_KEY_CCS_DBNAME = "CCS_DBNAME";
	/**
	 * ThreadLocal中集团CLDR dbname
	 */
	public static final String THREADLOCAL_KEY_CLDR_DBNAME = "CLDR_DBNAME";
	/**
	 * ThreadLocal中集团CRM dbname
	 */
	public static final String THREADLOCAL_KEY_CRM_DBNAME = "CRM_DBNAME";
	/**
	 * ThreadLocal中集团CRS dbname
	 */
	public static final String THREADLOCAL_KEY_CRS_DBNAME = "CRS_DBNAME";
	/**
	 * ThreadLocal中集团LPS dbname
	 */
	public static final String THREADLOCAL_KEY_LPS_DBNAME = "LPS_DBNAME";
	/**
	 * ThreadLocal中集团EBS dbname
	 */
	public static final String THREADLOCAL_KEY_EBS_DBNAME = "EBS_DBNAME";
	/**
	 * ThreadLocal中集团SCM dbname
	 */
	public static final String THREADLOCAL_KEY_SCM_DBNAME = "SCM_DBNAME";
	/**
	 * ThreadLocal中集团GFC dbname
	 */
	public static final String THREADLOCAL_KEY_GFC_DBNAME = "GFC_DBNAME";
	/**
	 * ThreadLocal中 酒店购买的sku
	 */
	public static final String THREADLOCAL_KEY_UNIT_SKU = "UNIT_SKU";
	/**
	 * ThreadLocal中机器名称
	 */
	public static final String THREADLOCAL_KEY_USER_MACHINENAME = "USER_MACHINENAME";
	/**
	 * ThreadLocal中机器mac地址
	 */
	public static final String THREADLOCAL_KEY_USER_MACADDR = "USER_MACADDR";
	/**
	 * ThreadLocal中操作员属性
	 */
	public static final String THREADLOCAL_KEY_USER_FLG = "USER_FLG";
	/**
	 * ThreadLocal中平台库数据源名的Key
	 */
	public static final String THREADLOCAL_KEY_PCM_DBNAME = "PCM_DBNAME";
	/**
	 * ThreadLocal中cms库数据源名的Key
	 */
	public static final String THREADLOCAL_KEY_CMS_DBNAME = "CMS_DBNAME";
	/**
	 * ThreadLocal中报表库数据源名的Key
	 */
	public static final String THREADLOCAL_KEY_RPT_DBNAME = "RTP_DBNAME";
	/**
	 * ThreadLocal中日志库数据源名的Key
	 */
	public static final String THREADLOCAL_KEY_LOG_DBNAME = "LOG_DBNAME";
	/**
	 * ThreadLocal中日志库数据源名的Key
	 */
	public static final String THREADLOCAL_KEY_STAT_DBNAME = "STAT_DBNAME";
	/**
	 * ThreadLocal中班次id的Key
	 */
	public static final String THREADLOCAL_KEY_TURN_ID = "TURN_ID";
	/**
	 * ThreadLocal中班次CD的Key
	 */
	public static final String THREADLOCAL_KEY_TURN_CD = "TURN_CD";
	/**
	 * ThreadLocal中工作站代码
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_NO = "WORKSTATION_NO";
	/**
	 * ThreadLocal中工作站集团uid
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_CHAINUID = "WORKSTATION_CHAINUID";
	/**
	 * ThreadLocal中工作站单位uid
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_UNITUID = "WORKSTATION_UNITUID";
	/**
	 * ThreadLocal中工作站名称
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_NM = "WORKSTATION_NM";
	/**
	 * ThreadLocal中工作站机器名
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_MACHINE_NM = "WORKSTATION_MACHINE_NM";
	/**
	 * ThreadLocal中工作站描述
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_MACHINE_DRPT = "WORKSTATION_MACHINE_DRPT";
	/**
	 * ThreadLocal中工作站IP
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_IP = "WORKSTATION_IP";
	/**
	 * ThreadLocal中工作站公网IP
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_NETIP = "WORKSTATION_NETIP";
	/**
	 * ThreadLocal中工作站MAC
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_MAC = "WORKSTATION_MAC";
	/**
	 * ThreadLocal中工作站楼区
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_AREA = "WORKSTATION_AREA";
	/**
	 * ThreadLocal中上次活动时间
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_ACTIVITY_DHMS = "WORKSTATION_ACTIVITY_DHMS";
	/**
	 * ThreadLocal中主服务版本
	 */
	public static final String THREADLOCAL_KEY_WORKSTATION_SERVICE_VER = "WORKSTATION_SERVICE_VER";
	
	/**
	 * ThreadLocal中酒店联系方式类型
	 */
	public static final String THREADLOCAL_CONTACTTYP = "CONTACTTYP";
	/**
	 * ThreadLocal中酒店联系方式类型
	 */
	public static final String THREADLOCAL_SYSCHANNEL = "SYSCHANNEL";

}
