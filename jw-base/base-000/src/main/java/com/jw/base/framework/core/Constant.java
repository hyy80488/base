/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core;

import java.math.BigDecimal;

import com.jw.base.framework.core.util.StringUtil;

/**
 * ## 类说明：
 * 	系统常量
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|Constant.java新增
 */
public class Constant {

	/** redis cluster: keySlot算法中，如果key包含{}，就会使用第一个{}内部的字符串作为hash key，这样就可以保证拥有同样{}内部字符串的key就会拥有相同slot。 */
	private static String KEY_SPLIT = ":"; // 用于隔开缓存前缀与缓存键值
	private static String PREFIX = "jw:redis";
	private static String WS_PREFIX = "jw:ws";
	public static String KEY_SLOT = "{" + PREFIX + KEY_SPLIT + "}";
	public static String WS_KEY_SLOT = "{" + WS_PREFIX + KEY_SPLIT + "}";
	
	public final static int THREAD_COREPOOLSIZE = 5;
	public final static int THREAD_MAXIMUMPOOLSIZE = 5;
	public final static int THREAD_KEEPALIVETIME = 60;
	public final static int THREAD_MAX_QUEUE = 1000;
	
	
	
	
	/**默认*/
	public final static String SYS_PMS = "pms";

	
	/**默认允许查报表条数*/
	public final static Integer REPORTCOUNT = 500;
	/**允许查报表条数*/
	public final static Integer REPORTCOUNT1 = 800;
	/**允许查报表条数*/
	public final static Integer REPORTCOUNT2 = 1000;
	/**默认允许查报表天数*/
	public final static int REPORTDAYCOUNT = 100;
	/**允许查报表天数）*/
	public final static int REPORTDAYCOUNT1 = 200;
	/**允许查报表天数）*/
	public final static int REPORTDAYCOUNT2 = 400;
	/**查询时间跨度范围天数（一个月）*/
	public final static int MAXMONTH = 31;
	/**查询时间跨度范围天数（一个季度）*/
	public final static int MAXQUARTER = 92;
	/**查询时间跨度范围天数（半年）*/
	public final static int MAXHALFYEAR = 183;
	/**查询时间跨度范围天数（一年）*/
	public final static int MAXYEAR = 366;
	
	/**批量快速退房 主键前缀 **/
	public final static String GROUPCHECKOUT = "GROUPCO:";
	/**批量加收 主键前缀 **/
	public final static String GROUPADDCOST = "GROUPAC:";
	
	public final static BigDecimal CHANGERATE = new BigDecimal(1);
	
	/** 客户端IP在Nginx的头信息中  */
	public static final String X_REAL_IP = "X-Real-IP";
	
	/** 集团密钥的密钥  */
	public static final String CHAIN_SECKEY = "0!!0O5&1VU%AyjR0";
	
	//系统渠道 
	public final static int PARAMETER310001 = 310001;
	public final static int PARAMETER310002 = 310002;
	public final static int PARAMETER310005 = 310005;
	public final static String PARAMTYP_SYSCHANNEL = "SYSCHANNEL";
	
	public static final String PARAMTYP_LANGUAGE = "LANGUAGE";
	public static final String PARAMTYP_COUNTRY = "COUNTRY";
	public static final String PARAMTYP_PROVINCE = "PROVINCE";
	public static final String PARAMTYP_CITY = "CITY";
	public static final String PARAMTYP_DISTRICT = "DISTRICT";
	
	/** 快捷键默认版式 **/
	public static final String DEFAULT_SKPATTERN_ID= "330001";
	/** 默认语种CD:  */
	public static final String DEFAULT_LANGUAGE_CD = "zh-CN";
	/** 默认语种ID:【中文:1219】  */
//	public static final Integer DEFAULT_LANGUAGE_ID = 1219;
	public static final Integer DEFAULT_LANGUAGE_ID = 1220;
	/** 默认币种ID:【人民币:220037】  */
	public static final Integer DEFAULT_CURRENCY_ID = 220037;
//	/** 默认国家ID:【中国:1544】  */
//	public static final Integer DEFAULT_COUNTRY_ID = 1544;
	/** 默认国家ID:【中国:1711】  */
	public static final Integer DEFAULT_COUNTRY_ID = 1711;
	/** 小数位数*/
	public static final Integer DEFAULT_SCALE = 2;
	/** 小数处理方式*/
	public static final Integer DEFAULT_ROUNDMODE = 1;

	/** 线程池阻塞队列容量上线  */
	public static final Integer BLOCKING_QUEUE_NUMBER = 1000;

	/** 数据源  */
	public static final String DATASOURCE_CONTEXT_HOLDER = "datasource_context_holder";
	/** SessionFactory */
	public static final String SESSIONFACTORY_CONTEXT_HOLDER = "sessionfactory_context_holder";
	/** 主从库标示  */
	public static final String SLAVE_CONTEXT_HOLDER = "slave_context_holder";

	public static final String DEFAULT_CHARSET = "UTF-8";

	/** 日志库名字 **/
	public static final String LOGDBNM = "log_dev";
	
	public static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

	public static final char pad = '=';

	/** 系统类型-HPT */
	public static final String SYS_TYP_HPT = "HPT";
	/** 系统类型-HPT-历史库 */
//	public static final String SYS_TYP_HPT_HIST = "HPT-HIST";
	/** 系统类型-GRP */
	public static final String SYS_TYP_GRP = "GRP";
	/** 系统类型-GRP-历史库 */
	public static final String SYS_TYP_GRP_HIST = "GRP-HIST";
	/** 系统类型-PCM */
	public static final String SYS_TYP_PCM = "PCM";
	/** 系统类型-CMS */
	public static final String SYS_TYP_CMS = "CMS";
	/** 系统类型-分析库 */
	public static final String SYS_TYP_STAT = "STAT";
	/** 系统类型-日志库 */
	public static final String SYS_TYP_LOG = "LOG";
	/** 系统类型-EXAMPLE */
	public static final String SYS_TYP_EXAMPLE = "EXAMPLE";
	/** 系统类型-NEC */
	public static final String SYS_TYP_NEC = "NEC";
	/** 系统类型-POS */
	public static final String SYS_TYP_POS = "POS";
	/** 系统类型-CCS */
	public static final String SYS_TYP_CCS = "CCS";
	/** 系统类型-CLDR */
	public static final String SYS_TYP_CLDR = "CLDR";
	/** 系统类型-CRS */
	public static final String SYS_TYP_CRS = "CRS";
	/** 系统类型-CRM */
	public static final String SYS_TYP_CRM = "CRM";
	/** 系统类型-LPS */
	public static final String SYS_TYP_LPS = "LPS";
	/** 系统类型-EBS */
	public static final String SYS_TYP_EBS = "EBS";
	/** 系统类型-SCM */
	public static final String SYS_TYP_SCM = "SCM";
	/** 系统类型-GFC */
	public static final String SYS_TYP_GFC = "GFC";
	/** 新增 */
	public static final String OPERATION_TYPE_SAVE = "save";
	/** 修改 */
	public static final String OPERATION_TYPE_UPDATE = "update";
	/** 删除 */
	public static final String OPERATION_TYPE_DELETE = "delete";
	/** 批量删除 */
	public static final String OPERATION_TYPE_DELETES = "deletes";
	/** 编辑 */
	public static final String OPERATION_TYPE_EDIT = "edit";
	/** 查询 */
	public static final String OPERATION_TYPE_SELECT = "select";

	/** 短信邮件开关 */
	public static final int MAIL_OPEN_STATS = 1; // 1：关闭

	/** 短信发送状态 1成功 */
	public static final String SMS_SEND_SUCCESS = "1";
	/** 短信发送状态 0失败 */
	public static final String SMS_SEND_FAILURE = "0";
	/** 短信发送状态 2未发送 */
	public static final String SMS_SEND_NOTSENT = "2";

	/** 操作结果 成功 */
	public static final String RESULT_SUCCESS = "SUCCESS";
	/** 操作结果 失败 */
	public static final String RESULT_FAILURE = "FAILURE";

	/** 是否字典 1是 */
	public static final String BOOLEAN_TRUE = "1";
	/** 是否字典 0否 */
	public static final String BOOLEAN_FALSE = "0";

	/** 是否有效状态 1有效 */
	public static final String VALID_VALID = "1";
	/** 是否有效状态 0无效 */
	public static final String VALID_INVALID = "0";

	/** 是否存在 1存在 */
	public static final String EXIST_EXIST = "1";
	/** 是否存在 0不存在 */
	public static final String EXIST_NOTEXIST = "0";

	/** 是否删除状态 1未删除 */
	public static final String DELETE_UNDELTE = "1";
	/** 是否删除状态 0已删除 */
	public static final String DELETE_DELTE = "0";

	/** 树形目录是否叶子节点 1叶子节点 */
	public static final String LEAF_LEAF = "1";
	/** 树形目录是否叶子节点 0文件夹节点 */
	public static final String LEAF_FOLDER = "0";

	/** 数据类型 文本 */
	public static final String DATATYPE_VARCHAR2 = "VARCHAR2";
	/** 数据类型 数字 */
	public static final String DATATYPE_NUMBER = "NUMBER";
	/** 数据类型 日期 */
	public static final String DATATYPE_DATE = "DATE";

	/** 数据源的beanId */
	public static final String DATA_SOURCE_BEAN_ID = "dataSource";
	/** Redis缓存当前操作员key */
	public static final String REDIS_KEY_USER = "REDIS_KEY_USER";

	public static final String METHOD_GET_PRE = "get";

	public static final String METHOD_SET_PRE = "set";

	/**
	 * 下划线
	 */
	public static final String CHAR_UNDERLINE = "_";

	/** STR_="-"; */
	public final static String CHAR_SLASH = "-";

	/**
	 * 点
	 */
	public static final String CHAR_DOT = ".";

	/**
	 * 逗号
	 */
	public static final String CHAR_COMMA = ",";

	/**
	 * Json字符串用冒号
	 */
	public static final String CHAR_JSON_COLON = "\\:";

	/**
	 * Json字符串用回车换行符
	 */
	public static final String CHAR_JSON_NEWLINE = "\\r\\n";

	/**
	 * 点
	 */
	public static final String CHAR_DOT_FOR_SPLIT = "\\.";

	/**
	 * 用于数据库查询的降序
	 */
	public static final String SORT_DESC = "desc";
	/**
	 * 用于数据库查询的升序
	 */
	public static final String SORT_ASC = "asc";

	/**
	 * 标识校验token失败用的常量 传入的需要校验的dto的token为空
	 */
	public static final String VALID_TOKEN_ERROR_NULL = "validTokenErrorNull";

	/**
	 * 标识校验token失败用的常量 传入的dto的token与redis缓存中的不一致
	 */
	public static final String VALID_TOKEN_ERROR_REPEAT = "validTokenErrorRepeat";

	/**
	 * 标识非法登录的常量
	 */
	public static final String VALID_LOGIN_ERROR = "validLoginError";

	/**
	 * RequestHead中包含的sessionKey标识
	 */
	public static final String REQUEST_HEAD_SESSIONKEY = "JW_DATA";

	/**
	 * RequestHead中包含的userUid标识
	 */
	public static final String REQUEST_HEAD_UID = "JW_UID";
	
	public static final String REQUEST_HEAD_CHAIN = "JW_CHAIN";
	
	public static final String REQUEST_HEAD_JW_UNIT = "JW_UNIT";
	
	public static final String REQUEST_HEAD_JW_WSNO = "JW_WSNO";
	
	public static final String REQUEST_HEAD_TRACERID = "JW_TRACERID";
	
	public static final String REQUEST_HEAD_TRACERID_VERSION = "JW_TRACERID_VERSION";

	public static final String REQUEST_HEAD_BUSINESSID = "JW_BUSINESSID";
	
	public static final String REQUEST_HEAD_ASYNCID = "JW_ASYNCID";
	
	/**
	 * RequestHead中包含的Token标识
	 */
	public static final String REQUEST_HEAD_TOKEN = "JW_TOKEN";

	/**
	 * RequestHead中包含的酒店日期
	 */
	public static final String REQUEST_HEAD_HOTEL_DT = "JW_HOTEL_DT";

	/**
	 * 标识该字段是电话号码类型，且需要加解密处理
	 */
	public static final String CRYPT_FIELD_SUFFIX_TLNO = "_tlno";

	/**
	 * 缓存在redis中的电话号码敏感信息显示方式的Key
	 */
	public static final String CRYPT_TYPE_MAPKEY_TLNO = "TLNO";

	/**
	 * 标识该字段是手机号码类型，且需要加解密处理
	 */
	public static final String CRYPT_FIELD_SUFFIX_PHNO = "_phno";

	/**
	 * 缓存在redis中的手机号码敏感信息显示方式的Key
	 */
	public static final String CRYPT_TYPE_MAPKEY_PHNO = "PHNO";

	/**
	 * 标识该字段是信用卡号码类型，且需要加解密处理
	 */
	public static final String CRYPT_FIELD_SUFFIX_CDNO = "_cdno";

	/**
	 * 缓存在redis中的信用卡号敏感信息显示方式的Key
	 */
	public static final String CRYPT_TYPE_MAPKEY_CDNO = "CDNO";

	/**
	 * 标识该字段是会员卡号码类型，且需要加解密处理
	 */
	public static final String CRYPT_FIELD_SUFFIX_MBNO = "_mbno";

	/**
	 * 缓存在redis中的会员卡号敏感信息显示方式的Key
	 */
	public static final String CRYPT_TYPE_MAPKEY_MBNO = "MBNO";

	/**
	 * 标识该字段是身份证号码类型，且需要加解密处理
	 */
	public static final String CRYPT_FIELD_SUFFIX_IDCD = "_idcd";

	/**
	 * 缓存在redis中的身份证号敏感信息显示方式的Key
	 */
	public static final String CRYPT_TYPE_MAPKEY_IDCD = "IDCD";

	/**
	 * 标识该字段是通用联系方式类型(例如：QQ号、手机号、电话号码等)，且需要加解密处理
	 */
	public static final String CRYPT_FIELD_SUFFIX_CONTACT_NO = "_ctno";

	/**
	 * 缓存在redis中的通用联系方式(例如：QQ号、手机号、电话号码等)敏感信息显示方式的Key
	 */
	public static final String CRYPT_TYPE_MAPKEY_CONTACT_NO = "CTNO";

	/**
	 * 标识该字段是电子邮件类型，且需要加解密处理
	 */
	public static final String CRYPT_FIELD_SUFFIX_EMAIL = "_eml";

	/**
	 * 缓存在redis中的电子邮件敏感信息显示方式的Key
	 */
	public static final String CRYPT_TYPE_MAPKEY_EMAIL = "EML";

	/**
	 * 敏感信息隐藏字符
	 */
	public static final String CRYPT_CHAR = "*";

	/**
	 * 系统类型HPT的酒店代码
	 */
	public static final String UNIT_CD_OU = "_ou";
	/**
	 * 系统类型CRS的酒店代码
	 */
	public static final String UNIT_CD_POS = "_pos";
	
	/**
	 * 渠道接口版本号ifsvc_id
	 */
	public static final Integer[] IFSVCID = { 80001, 80002, 100001 };

	/**
	 *	RMS消息key值后缀
	 */
	public static final String RMSMQ_KEY = "RMS_PULL";
	/**
	 *	计算会员保级 消息key值后缀
	 */
	public static final String KEEPLEVELMQ_KEY = "CALCULATE_KEEPLEVEL";
	/**
	 *	计算会员积分过期清零 消息key值后缀
	 */
	public static final String POINTSEXPIREDMQ_KEY = "CALCULATE_POINTSEXPIRED";
	
	/**
	 * 状态枚举 0：无效 1：有效（默认）2：过期
	 */
	public static enum ENUM_STATUS_FLG {
		/** 无效 **/
		INVALID("0"),
		/** 有效（默认） **/
		VALID("1"),
		/** 过期 **/
		OVERDUE("2"),
		/** 全部 **/
		ALL("all"),
		/** 有效（默认） **/
		DEFAULT("1");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_STATUS_FLG(String value) {
			this._value = value;
		}
	}

	/**
	 * 性别 0：男（默认） 1：女 2：未知
	 */
	public static enum ENUM_GENDER {
		/** 男（默认） **/
		MAN("0"),
		/** 女 **/
		WOMAN("1"),
		/** 未知 **/
		OTHER("2"),
		/** 男（默认） **/
		DEFAULT("0");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_GENDER(String value) {
			this._value = value;
		}
	}

	/**
	 * 建立方式 1：酒店 2：网站 3：线下会员系统 4：CRS
	 */
	public static enum ENUM_CREATE_TYP {
		/** 1：酒店 **/
		HOTEL("1"),
		/** 2：网站 **/
		WEB("2"),
		/** 3：线下会员系统 **/
		OFFLINE("3"),
		/** 4：CRS **/
		CRS("4");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CREATE_TYP(String value) {
			this._value = value;
		}
	}

	/**
	 * 是否标识：1：是    0：否
	 */
	public static enum ENUM_YES_OR_NO {
		/** 0：否 **/
		NO("0"),
		/** 1：是 **/
		YES("1");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_YES_OR_NO(String value) {
			this._value = value;
		}
	}

	/**
	 * null标识：isnull：NULL    isnotnull：NOT NULL
	 */
	public static enum ENUM_NULL_OR_NOT {
		/** isnull：NULL **/
		NULL("isnull"),
		/** isnotnull：NOT NULL **/
		NOTNULL("isnotnull");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_NULL_OR_NOT(String value) {
			this._value = value;
		}
	}

	/**
	 * 数据库操作标识
	 * 1：增加(Create)
	 * 2：读取查询(Retrieve)
	 * 3：更新(Update)
	 * 4：删除(Delete)
	 */
	public static enum ENUM_CRUD {
		/**1：增加(Create)*/
		CREATE("1"),
		/**2：读取查询(Retrieve)*/
		RETRIEVE("2"),
		/**3：更新(Update)*/
		UPDATE("3"),
		/**4：删除(Delete)*/
		DELETE("4");
		private String _value;

		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_CRUD(String value) {
			this._value = value;
		}

		/** 
		 * ## 方法说明：
		 * 	判断枚举中是否存在于传入参数相同的数据
		 * @param value
		 * @return 存在true  不存在false
		*/
		public static final Boolean some(String value) {
			Boolean flg = false;
			// 参数为空 返回false
			if (StringUtil.isEmpty(value)){
				return flg;
			}
			// 遍历枚举数据 存在相同数据 返回true
			for (ENUM_CRUD CRUD : ENUM_CRUD.values()) {
				if (CRUD.getValue().equals(value)) {
					flg = true;
					break;
				}
			}
			return flg;
		}
		
		public static ENUM_CRUD hasEnum(String value) throws Exception{
			ENUM_CRUD typ = null;
			for (ENUM_CRUD t : ENUM_CRUD.values()) {
				if(t.isEquals(value)){
					typ = t;
					break;
				}
			}
			return typ;
		}
	}

	/**
	 * 排序用枚举
	 */
	public static enum ENUM_SORT {
		/** 升序 */
		ASC(1),
		/** 降序 */
		DESC(-1);
		private int _value;

		public int getValue() {
			return _value;
		}

		public Boolean isEquals(int value) {
			return this._value == value;
		}

		private ENUM_SORT(int value) {
			this._value = value;
		}
	}

	public static enum ENUM_MAX_SQL_LEN {
		POSTGRESQL(1024 * 256), ORACLE(1024 * 32), MYSQL(1024 * 32), SQLSERVER(1024 * 32), DEFAULT(1024 * 4);
		private Integer _value;

		public Integer getValue() {
			return _value;
		}

		private ENUM_MAX_SQL_LEN(Integer value) {
			this._value = value;
		}
	}
	
	/*
	 * 预定锁表 -- 预订类别
	 */
	public static enum ENUM_ACCT_MODE{
		/** 新建 */
		NEW,
		/** 追加 */
		ADD,
		/** 更新 */
		UPD,
		/** 取消 */
		CXL,
		/** 入住 */
		CI,
		/** 取消入住 */
		CICXL,
		/** 在住复制 */
		SCOPY,
		/** 历史预定复制 */
		HCOPY,
		/** 带客人信息的复制 */
		RCOPY,
		/** 打破合住 */
		BREAKSHARE,
		/** 合住 */
		FINDSHARE,
		/** 延期 */
		PUTOFF,
	}
	/*
	 * 结账类型
	 */
	public static enum ENUM_CHECKKBN{
		/** 退房 */
		CHECKOUT,
		/** 待结 */
		HOLD,
		/** 中途结算 */
		WEEK,
		/** 自动结账 */
		AUTO,
		/** 提前结账 */
		SHORTCO,
		/** 更新预定 */
		UPDACCT,
		/** 取消退房 */
		CANCELCO,
		/** 转帐页  */
		MOVEPAGE,
		/** 银行卡挂账取消  */
		VOIDBILL,
		/** 账单结算方式变更 */
		KESSAICHG,
		/** 账务打包 */
		ACCTPKG
	}
	
	
	
	/**
	 * 房型修改校验结果
	 * // 0.未被占用，可以修改   1.被占用，不允许修改
	 */
	public static enum ENUM_ROOMTYP_CHECK_TYP {
		/** 未被占用，可以修改 */
		NOUSE("0"),
		/** 被占用，不允许修改 */
		USE("1");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value == value;
		}
		
		private ENUM_ROOMTYP_CHECK_TYP(String value) {
			this._value = value;
		}
	}
	/**
	 * 房型修改校验方式
	 * // //1.房型无效校验   2. 修改房型属性校验   0.两者都校验
	 */
	public static enum ENUM_ROOMTYP_CHECKMODE_TYP {
		/** 两者都校验 */
		ALL("0"),
		/** .房型无效校验 */
		CHINV("1"),
		/** 修改房型属性校验 */
		CHMOD("2");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value == value;
		}
		
		private ENUM_ROOMTYP_CHECKMODE_TYP(String value) {
			this._value = value;
		}
	}
	
	
	/**
	 * 加房费 加收标准
	 * //1.总房价 2.实收房费
	 */
	public static enum ENUM_CHARGING_MORE_TYP {
		/** 总房价 */
		TOTAL("1"),
		/** 实收房费 */
		ACTUAL("2"),
		/** 固定费用 */
		FIX("3"),
		/** 默认 */
		DEFAULT("1");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value == value;
		}
		
		private ENUM_CHARGING_MORE_TYP(String value) {
			this._value = value;
		}
	}
	/**
	 * 校验标志结果
	 * 0.通过 1.不通过 2.没有权限
	 */
	public static enum ENUM_CHECK_FLG {
		/** 0.通过  */
		PASS("0"),
		/** 1.不通过 */
		NOPASS("1"),
		/**  2.没有权限 */
		NOPERM("2");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value == value;
		}
		
		private ENUM_CHECK_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * 校验类型标志
	 * 
	 */
	public static enum ENUM_CHECK_QUERY_FLG {
		/** 1.退房结账  */
		CHECKOUT("1"),
		/** 2.提前退房结账 */
		ADVANCECHECKOUT("2"),
		/** 3.待结结账 */
		WAITCHECKOUT("3");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value == value;
		}
		
		private ENUM_CHECK_QUERY_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 证件类别
	 * 
	 */
	public static enum ENUM_CARD_FLG {
		/** 1.身份证 默认  */
		CHCARD("1"),
		/** 2.美国护照  */
		USCARD("2"),
		DEFAULT("1");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value == value;
		}
		
		private ENUM_CARD_FLG(String value) {
			this._value = value;
		}
	}
	
	/** 报表日志删除 默认删除日期天数之前  **/
	public final static Integer REPORTRETAINDAY = 30;
	/** 报表日志删除 默认一次删除的数量  **/
	public final static Integer DELETECOUNT = 500;
	/** 最大账页数的默认值 **/
	public final static Integer DEFAULTMAXPAGENUM = 6;
	/** 是 **/
	public final static String YES = "Y";
	/** 否 **/
	public final static String NO = "N";
	
	
	/** 
	* 数据类型
    * 	110：平台库；120：报表库；
	*	210：集团库；220：集团历史库；
	*	310：PMS库；320：PMS历史库；
	*	410：日志库；510：STAT库；
	*	330：POS库；340：CRS库；
	*	350：CRM库；360：LPS库；
	*	370：EBS库
	*/ 
	public static enum ENUM_DATA_TYP{
		PLT("110"),RPT("120"),CMS("130"),
		GRP("210"),GRP_HIS("220"),
		PMS("310"),PMS_HIS("320"),
		POS("330"),POS_HIS("331"),
		CRS("340"),CRM("350"),LPS("360"),EBS("370"),SCM("380"),GFC("390"),
		CCS("400"),LOG("410"),CLDR("420"),STAT("510");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_DATA_TYP(String value){
			this._value=value;
		}	
	}
	
	public static enum ENUM_SYS_NM{
		LOG("LOG"),
		STAT("STAT"),
		
		PMS("PMS"),
		POS("POS"),
		LPS("LPS"),
		CRM("CRM"),
		CRS("CRS"),
		EBS("EBS"),
		SCM("SCM"),
		GFC("GFC"),
		GRP("GRP"),
		
		CCS("CCS"),
		CLDR("CLDR"),

		RPT("RPT"),
		IIR("IIR"),
		CMS("CMS"),
		PCM("PCM"),
		IFSVC1("IFSVC1"),
		OPEN("OPEN"),
		DEFAULT("");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_SYS_NM(String value){
			this._value=value;
		}	
	}
	
	public static enum ENUM_SESSION_TYPE{
		API("API"),
		SERVICE("SERVICE");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_SESSION_TYPE(String value){
			this._value=value;
		}	
	}
	/**
	 *  积分类型  FRT：客房消费；POS：消费点消费
	 */
	public static enum ENUM_POINTPOLICY_TYP{
		FRT("FRT"),
		POS("POS"),
		DEFAULT("FRT");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_POINTPOLICY_TYP(String value){
			this._value=value;
		}	
	}
	//积分操作 1累积积分  0取消积分
	public static enum ENUM_POINTOPER_TYP{
		ADD("1"),
		CANCEL("0");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_POINTOPER_TYP(String value){
			this._value=value;
		}	
	}
}
