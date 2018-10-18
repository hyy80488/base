package com.jw.base.framework.core;

public class ConstantPrint {
	// 证件扫描状态
	// 0无效；1成功；2失败
	public static enum ENUM_SUCCESS_FLG {
		INVALI("0"), VALI("1"), FAIL("2"), DEFAULT("1");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_SUCCESS_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 	附属信息类型
	 */
	public static enum ENUM_ACCE_TYP{
		/**证扫类型**/
		IDS("IDS");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_ACCE_TYP(String value){
			this._value=value;
		}	
	}
}
