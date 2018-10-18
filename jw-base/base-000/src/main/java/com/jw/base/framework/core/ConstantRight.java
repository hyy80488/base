package com.jw.base.framework.core;

public class ConstantRight {
	
	/**
	 * 用户权级   0 平台
	 */
	public static final String USER_RIGHTCLS_0 = "0";
	/**
	 * 用户权级   10 集团/集团联盟
	 */
	public static final String USER_RIGHTCLS_10 = "10";
	/**
	 * 用户权级   20 子集团
	 */
	public static final String USER_RIGHTCLS_20 = "20";
	/**
	 * 用户权级   30 酒店
	 */
	public static final String USER_RIGHTCLS_30 = "30";
	
	/**
	 * 权级 0：平台（虚拟操作用），10：集团，20：酒店
	 */
	public static enum ENUM_RIGHT_CLS {
		/** 0：平台（虚拟操作用） **/
		PLT("0"),
		/** 10：集团 **/
		CHAIN("10"),
		/** 20：酒店 **/
		UNIT("20");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_RIGHT_CLS(String value) {
			this._value = value;
		}
	}
	
	//购买的功能是否有效
	public static enum ENUM_PDTEXTRA_STATUS_FLG {
		//无效
		INV ("0"),
		//正常
		V("1"),
		M ("2"),
		T ("3");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_PDTEXTRA_STATUS_FLG(String value) {
			this._value = value;
		}
	}
}
