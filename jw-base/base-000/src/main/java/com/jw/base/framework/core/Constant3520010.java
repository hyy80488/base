package com.jw.base.framework.core;

public class Constant3520010 {
	
	/**
	 * 常用标志 0：非常用（默认） 1：常用
	 */
	public static enum ENUM_COMMON_FLG {
		/** 0：非常用（默认） **/
		NONUSING("0"),
		/** 1：常用 **/
		USING("1"),
		/** 0：非常用（默认）**/
		DEFAULT("0");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_COMMON_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 0：普通；1：子客户；2：母客户；默认0：普通
	 */
	public static enum ENUM_CHILD {
		/**0：普通*/
		NORMAL("0"),
		/**1：子客户*/
		CHILD("1"),
		/**2：母客户*/
		PARENT("2"),
		/**默认0：普通*/
		DEFAULT("0");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CHILD(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 协议客户标识 1：有效（默认）0：无效
	 */
	public static enum ENUM_CONTRACT_FLG {
		/** 无效 **/
		INVALID("0"),
		/** 有效（默认） **/
		VALID("1"),
		/** 有效（默认） **/
		DEFAULT(VALID.getValue());
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CONTRACT_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 联系人类型  0：普通（默认）1：应收联系人
	 */
	public static enum ENUM_CONTACT_TYP {
		/**0：普通*/
		NORMAL("0"),
		/** 应收联系人 **/
		AR("1"),
		/** 默认（普通） **/
		DEFAULT(NORMAL.getValue());
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CONTACT_TYP(String value) {
			this._value = value;
		}
	}
	
	
	/**
	 * 备注类型
	 * 
	 * 0：ALL
		1：预订备注
		2：前台备注
		3：客房备注
		4：收银备注
		5：销售点备注
	 */
	public static enum ENUM_NOTICE_FLG {
		/**0：ALL*/
		ALL("0"),
		/** 1：预订备注 **/
		RSV("1"),
		/** 2：前台备注 **/
		PMS("2"),
		/** 3：客房备注 **/
		ROOM("3"),
		/** 4：收银备注 **/
		CASH("4"),
		/** 5：销售点备注 **/
		SALE("5");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_NOTICE_FLG(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_HANDLE_FLG {
		/**0：已导入*/
		IMPORT("0"),
		/** 1： 未导入**/
		NOIMPORT("1"),
		/** 2：不可编辑 **/
		NOEDIT("2");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_HANDLE_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * 
	 * ## 类说明：
	 * 	协议客户&客户绑定应收帐号时的二次确认弹框标识
	 * @author    [liyunlong]   
	 * @version   [V1.0, 2018年8月17日]
	 * @package com.jw.base.framework.core
	 * @since
	日期|作者|类型|内容
	:----|:-----|:-----|:-----
	2018年8月17日|liyunlong|新增|Constant3520010.java新增
	 */
	public static enum ENUM_CONFIM_FLG {
		/**0：不进行强制更新*/
		FIRST("0"),
		/** 1： 进行强制更新**/
		SECOND("1");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CONFIM_FLG(String value) {
			this._value = value;
		}
	}
}
