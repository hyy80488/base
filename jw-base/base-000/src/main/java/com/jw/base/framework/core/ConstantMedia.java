package com.jw.base.framework.core;

public class ConstantMedia {
	// 媒体类型 10：图片
	// 11：ICON
	// 20：音频
	// 30：视频
	// 40：压缩包
	public static enum ENUM_MEDIA_TYP {
		PIC("10"), ICON("11"), AUDIO("20"), VIDEO("30"), ZIP("40");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_MEDIA_TYP(String value) {
			this._value = value;
		}
	}

	// 0：pc
	// 1：移动设备
	// 2：mobile
	// 3：pad
	public static enum ENUM_ENDPOINT_TYP {
		PC("0"), MOBILEDEVICE("1"), MOBILE("2"), PAD("3"), DEFAULT("0");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_ENDPOINT_TYP(String value) {
			this._value = value;
		}
	}
}
