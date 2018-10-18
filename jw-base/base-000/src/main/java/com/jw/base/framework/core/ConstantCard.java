package com.jw.base.framework.core;

public class ConstantCard {

	// 门卡类型 其他待添加
	public static enum ENUM_CARD_TYP {
		KEY("key");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_CARD_TYP(String value) {
			this._value = value;
		}
	}

	// 1：新建卡
	// 2：修改卡
	// 3：复制卡
	// 4：作废卡
	public static enum ENUM_PRINT_TYP {
		CREAT("1"), UPDATE("2"), COPY("3"), DELETE("4");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PRINT_TYP(String value) {
			this._value = value;
		}
	}
}
