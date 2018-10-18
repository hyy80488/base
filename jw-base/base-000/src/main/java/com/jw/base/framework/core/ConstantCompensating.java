package com.jw.base.framework.core;

public class ConstantCompensating {

	public static final String BUSINESS_STATUS = "businessStatus";
	
	public static final String API_LIST = "-api-list";
	
	public static final String DEAL_URL = "deal_url";
	
	public static final String ROLLBACK_URL = "rollback_url";
	
//	public static final String REQ_DTO = "req_dto";
	
	public static final String SYS_TYPE = "sys_type";
	
	public static final int REPEAT_SEND = 10;
	
	// 0：主业务处理中
	// 1：主业务正常完成
	// 2：主业务异常完成
	// 3：主业务异常，被最终补偿回滚
	public static enum ENUM_BUSINESS_STATUS {
		PROCESS("0"), FINISH("1"), ERROR("2"), FINALLY_ROLLBACK("3");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_BUSINESS_STATUS(String value) {
			this._value = value;
		}
	}
	
	// 0：执行，并设置为，可查，不可用
	// 1：执行，并设置为，可查，可用
	// 2：deal，并设置为，可查，可用
	// 3：rollback，并设置为，不可查，不可用
	public static enum ENUM_DEAL_METHOD {
		EXECUTE("0"), EXECUTE_AND_DEAL("1"), DEAL("2"), ROLLBACK("3");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_DEAL_METHOD(String value) {
			this._value = value;
		}
	}
	
	// 0：不可查，不可用
	// 1：可查，不可用
	// 2：可查，可用
	public static enum ENUM_DEAL_STATUS {
		NO_SHOW("0"), SHOW("1"), USABLE("2");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_DEAL_STATUS(String value) {
			this._value = value;
		}
	}
}
