package com.jw.base.framework.core;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

public class Constant3510010 {
	/**
	 * 休眠标识 0：正常（默认） 1：休眠
	 */
	public static enum ENUM_SLEEP_FLG {
		/** 正常（默认） **/
		NORMAL("0"),
		/** 休眠 **/
		SLEEP("1"),
		/** 正常（默认） **/
		DEFAULT("0");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_SLEEP_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 保密标识 0：不保密（默认） 1：保密
	 */
	public static enum ENUM_SECRET_FLG {
		/** 不保密（默认） **/
		PUBLIC("0"),
		/** 保密 **/
		PRIVATE("1"),
		/** 不保密（默认） **/
		DEFAULT("0");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_SECRET_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 默认标志 0：非默认 1：默认
	 */
	public static enum ENUM_DEFAULT_FLG {
		/** 0：非默认 **/
		NONDEFAULT("0"),
		/** 1：默认 **/
		DEFAULT("1");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_DEFAULT_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 联系方式类型 0：手机，1：电话，2：EMAIL，3：传真 4：微信 5：QQ  6：www
	 */
	public static enum ENUM_CONTACT_TYP {
		/** 0：手机 **/
		PHONE("0"),
		/**1：电话 **/
		TEL("1"),
		/** 2：EMAIL **/
		EMAIL("2"),
		/** 3：传真 **/
		Fax("3"),
		/** 4：微信  **/
		WECHAT("4"),
		/** 5：QQ **/
		QQ("5"),
		/** 6：www **/
		WWW("6");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		private ENUM_CONTACT_TYP(String value) {
			this._value = value;
		}
		
		public static  ENUM_CONTACT_TYP geTyp(String vlu){
			if(StringUtils.isBlank(vlu)){
				return null;
			}
			for (ENUM_CONTACT_TYP typ : ENUM_CONTACT_TYP.values()) {
				if(Objects.equals(vlu, typ.getValue())){
					return typ;
				}
			}
			return null;
		}
	}
	
	/** 客户类型 */
	public static enum ENUM_PROFILE_TYP {
		/** 0-临时 */
		TEMP("0"),
		/**1-永久 */
		FOREVER ("1"),
		/**夜审标识 */
		NIGHT_SNAP(FOREVER.getValue());
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_PROFILE_TYP(String value) {
			this._value = value;
		}
	}
	
	/** 联系方式类型 */
	public static enum ENUM_CONTACT_FLG {
		/** 0：私人 */
		PRIVATE("0"),
		/**1：工作 */
		JOB("1"),
		/**夜审标识 */
		NIGHT_SNAP(PRIVATE.getValue());
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CONTACT_FLG(String value) {
			this._value = value;
		}
	}
	
	/** 地址类型类型 */
	public static enum ENUM_ADDRESS_FLG {
		/** 	0：家庭住址 */
		HOME ("0"),
		/**1：工作地址 */
		WORK("1"),
		/**3：户籍地址 */
		CENSUS("3"),
		/**夜审标识 */
		NIGHT_SNAP(HOME.getValue());
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_ADDRESS_FLG(String value) {
			this._value = value;
		}
	}
	
	
	/** 通知接收类型 */
	public static enum ENUM_RECEIPT_FLG {
		/** 	0：全部 */
		ALL ("0"),
		/**1：营销类 */
		MARKETING("1"),
		/**2：服务类 */
		SERVICE ("2"),
		/**9：免扰 */
		IMMUNITY ("9"),
		/**夜审标识 */
		NIGHT_SNAP(ALL.getValue());
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_RECEIPT_FLG(String value) {
			this._value = value;
		}
	}
}
