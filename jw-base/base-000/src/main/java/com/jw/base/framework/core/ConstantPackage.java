package com.jw.base.framework.core;

public class ConstantPackage {
	// 可自定义抛账金额
	public static enum ENUM_ALLOWANCE_FLG {
		// 0：不可以，1：可以。默认0
		// 当addon_flg=1时，且在预订处理时有效
		NO("0"), CAN("1"), DEFAULT("0");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_ALLOWANCE_FLG(String value) {
			this._value = value;
		}
	}

	// 影响Fixed Rate
	public static enum ENUM_FIXEDRATE_FLG {
		// 0：不影响Fixed Rate，1：影响。默认0
		NO("0"), AFFECT("1"), DEFAULT("0");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_FIXEDRATE_FLG(String value) {
			this._value = value;
		}
	}

	// 是否可在web销售
	public static enum ENUM_WEBSELL_FLG {
		// 0：不可以，1：可以。默认1
		NO("0"), CAN("1"), DEFAULT("1");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_WEBSELL_FLG(String value) {
			this._value = value;
		}
	}

	// 账单显示
	public static enum ENUM_PGKFOLIO_FLG {
		// 0：不显示（默认）；1：显示
		NOSHOW("0"), SHOW("1"), DEFAULT("0");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PGKFOLIO_FLG(String value) {
			this._value = value;
		}
	}

	// 积分兑换项目
	public static enum ENUM_REDEMPTION_FLG {
		// 0：普通项目，1：积分兑换项目。默认0
		COMMON("0"), EXCHANGE("1"), DEFAULT("0");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_REDEMPTION_FLG(String value) {
			this._value = value;
		}
	}

}
