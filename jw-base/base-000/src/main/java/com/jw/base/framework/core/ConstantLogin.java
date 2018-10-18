package com.jw.base.framework.core;

public class ConstantLogin {
	
	/**
	 * 登录人员状态   0 普通用户（默认）
	 */
	public static final String PERSONNEL_STATUS_0 = "0";
	/**
	 * 登录人员状态   1 模拟用户（平台用户）
	 */
	public static final String PERSONNEL_STATUS_1 = "1";
	/**
	 * 特殊登录处理，sessionkey后缀
	 */
	public static final String KEY_SUFFIX = "_INTERFACE";
	
	/**
	 * 系统类别     1：集团系统；2：单店系统；
	 */
	public static enum ENUM_SYS_FLG {
		/** 集团系统 */
		GRP("1"),
		/** 单店系统 */
		UNIT("2"),
		/** 3：仅单体酒店使用； */
		ONLY_UNIT("3"),
		/** 4：仅集团版单店使用 */
		GRP_UNIT("4");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_SYS_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * 系统类别     1:集团权限;2:单体/单店公用权限;3:单体权限;4:单店权限
	 */
	public static enum ENUM_PERM_SYS_FLG {
		/** 1:集团权限 */
		GRP("1"),
		/** 2:单体/单店公用权限 */
		BOTH("2"),
		/** 3:单体权限 */
		UNIT1("3"),
		/** 4:单店权限 */
		UNIT2("4");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_PERM_SYS_FLG(String value) {
			this._value = value;
		}
	}
	
	
	/**登陆接口类型 1.正常登陆  2.接口登陆  3.切换酒店  4.ota请求*/
	public static enum ENUM_LOGIN_FLG{
		NORMAL("1"),
		PORT("2"),
		SWITCH("3"),
		INTERFER("4");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_LOGIN_FLG(String value){
			this._value=value;
		}	
	}
	
	/**产品关联项类型 */
	public static enum ENUM_PDTEXTRA_TYP_FLG {
		/** 菜单 */
		MNU ("MNU"),
		/** 报表 */
		RPT("RPT"),
		/** 权限 */
		PRM ("PRM"),
		/** 夜审 */
		NGT ("NGT");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_PDTEXTRA_TYP_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 0：单体客户，1：集团客户
	 */
	public static enum ENUM_CHAIN_FLG {
		/** 单体客户 */
		GRP("0"),
		/** 集团客户 */
		UNIT("1");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_CHAIN_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * 单位属性     0：职能单位，1：业务单位
	 */
	public static enum ENUM_UNIT_FLG {
		/** 职能单位(例如：集团) */
		GRP("0"),
		/** 业务单位(例如：酒店) */
		UNIT("1"),
		/** CTL：管控分组 */
		CTL("CTL"),
		/** MKT：市场分组 */
		MKT("MKT"),
		/** STT：统计分组 */
		STT("STT");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_UNIT_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 所属系统代码
	 */
	public static enum ENUM_SYSID {
		/** 集团 */
		GRP("GRP"),
		/** 酒店 */
		HPT("HPT"),
		HTL("HTL"),
		POS("POS"),
		LPS("LPS"),
		/** 集团和酒店 */
		GNH("GNH"),
		/** 其他部门 */
		DEP("DEP");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_SYSID(String value) {
			this._value = value;
		}
	}
	
	
	/**
	 * 系统类别     0：单体 1：集团系统；2：单店系统；
	 */
	public static enum ENUM_CU_FLG {
		/** 单体 */
		SINGEL("0"),
		/** 集团系统 */
		GRP("1"),
		/** 单店系统 */
		UNIT("2");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CU_FLG(String value) {
			this._value = value;
		}
	}
}
