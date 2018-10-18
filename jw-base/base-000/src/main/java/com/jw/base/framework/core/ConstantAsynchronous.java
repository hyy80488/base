package com.jw.base.framework.core;

public class ConstantAsynchronous {

	//当前批处理事务状态
	public static final String ASYNC_STATUS_NAME = "asyncStatus";
	//当前批处理事务,总条数
	public static final String TOTAL_NUM = "totalNum";
	//当前批处理事务,剩余条数
	public static final String REMAIN_NUM = "remainNum";
	//当前批处理事务,剩余预计时间
	public static final String REMAIN_TIME = "remainTime";
	
	// 当前批处理事务
	// 0：处理中
	// 1：已完成
	// 2：异常
	public static enum ENUM_ASYNC_STATUS {
		PROCESS("0"), FINISH("1"), ERROR("2");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_ASYNC_STATUS(String value) {
			this._value = value;
		}
	}
	
}
