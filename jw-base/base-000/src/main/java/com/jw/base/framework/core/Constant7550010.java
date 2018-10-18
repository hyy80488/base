package com.jw.base.framework.core;

public class Constant7550010 {
	/**
	 * 501-预付、16-现付
	 */
	public static enum ENUM_RATEPLANCATEGORY {
		/** 501-预付 **/
		PAYMENT("501"),
		/** 16-现付 **/
		ADVANCE("16");
		private String _value;

		public String getValue() {
			return _value;
		}
		private ENUM_RATEPLANCATEGORY(String value) {
			this._value = value;
		}
	}
	public static enum ENUM_ISFLASHLIVE {
		/** 是 **/
		TRUE("T"),
		/** 否 **/
		FALSE("F");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		private ENUM_ISFLASHLIVE(String value) {
			this._value = value;
		}
	}
	/**
	 * GuaranteeType="None"表示“非担保”；GuaranteeType="GuaranteeRequired"表示“担保”；注：当该订单为预付订单时，则无 Guarantee 节点
	**/
	public static enum ENUM_GUARANTEETYPE {
		/** 非担保 **/
		NONE("None"),
		/** 担保 **/
		GUARANTEEREQUIRED("GuaranteeRequired");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		private ENUM_GUARANTEETYPE(String value) {
			this._value = value;
		}
	}
	
	
	public static enum ENUM_AGEQUALIFYINGCODE {
		/** 成人 **/
		ADULT("10"),
		/** 儿童 **/
		CHILDREN("8");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		private ENUM_AGEQUALIFYINGCODE(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_RESID_TYPE {
		/** 表示 OTA 订单号 **/
		OTA("24"),
		/** PMS 确认号：改单、取消单操作 时会传递这个号码 **/
		PMS("10");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		private ENUM_RESID_TYPE(String value) {
			this._value = value;
		}
	}
	
}
