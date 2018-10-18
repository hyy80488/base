package com.jw.base.framework.core;

public class ConstantRounting {
	/**
	 *  特殊付款唯一号
	 */
	public static final String ROUNTING_ID = "routing_id";
	/**
	 * ROUTING类型
	 */
	public static enum ENUM_ROUTING_TYP {
		/** 转账 **/
		TRANSFER("TRNSF"),
		/** 分帐页 **/
		LEDGERPAGE("DVD"),
		/** 应收 **/
		INVC("CL"),
		/** 转入 **/
		RECV("RECV");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_ROUTING_TYP(String value) {
			this._value = value;
		}
	}

	/**
	 *所属类型
	 */
	public static enum ENUM_BELONG_TYP {
		/** ACCT：账户 **/
		ACCOUNT("ACCT"),
		/** GRP：团队，指团队主单上的定义 **/
		GRP("GRP");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_BELONG_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 *自定义routing属性
	 */
	public static enum ENUM_CUSTOMIZE_FLG {
		/** CF：预定义rounting **/
		CF("CF"),
		/** CU：自定义rounting **/
		CU("CU");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CUSTOMIZE_FLG(String value) {
			this._value = value;
		}
	}
	
	
}
