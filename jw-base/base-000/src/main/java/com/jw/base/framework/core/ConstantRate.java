package com.jw.base.framework.core;

import java.util.Objects;

public class ConstantRate {
	/**
	 * 价格属性
	 */
	public static enum ENUM_GRPRSVRATE_FLG {
		/** 基础价格 **/
		BASE("1"),
		/** Bar价格 **/
		BAR("2"),
		/** 促销价格 **/
		PROM("3");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_GRPRSVRATE_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 价格发布状态
	 */
	public static enum ENUM_GRPRSVRATE_PUBLISH_STUS {
		/** 未提交（默认） **/
		NONE("0"),
		/** 待审核 **/
		TODO("1"),
		/** 已发布 **/
		DONE("2");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_GRPRSVRATE_PUBLISH_STUS(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 收费方式
	 */
	public static enum ENUM_CHARGE_FLG {
		/** 内含 **/
		ALL("1"),
		/** 外收 **/
		ADD("2");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_CHARGE_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 自定义价格类型
	 * RT：无自定义
	 * RT+：只自定义房含
	 * RT*：价格、房含全按自定义
	 */
	public static enum ENUM_CUSTOMIZE_FLG {
		/** RT：无自定义 */
		RT("RT"),
		/** RT+：只自定义房含 */
		RTPLUS("RT+"),
		/** RT*：价格、房含全按自定义 */
		RTSTAR("RT*");
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
		
		public static Integer getIndex(String str){
			Integer index = 0;
			for(Integer i = 0 ; i<ENUM_CUSTOMIZE_FLG.values().length ; i++){
				if(Objects.equals(ENUM_CUSTOMIZE_FLG.values()[i].getValue(), str)){
					return i + 1;
				}
			}
			return index;
		}
	}

	/**
	 * 价格收费基准
	 */
	public static enum ENUM_RATE_STD {
		/** 1：每房间 **/
		ROOM("1"),
		/** 2：每人 **/
		ADULTCHILD("2"),
		/** 3：每人（分儿童） **/
		PERSON("3"),
		/** 4：纯儿童 **/
		CHILD("4");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_RATE_STD(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 1：每房间，2：每成人，3：每儿童，9：儿童分段
	 */
	public static enum ENUM_RATEDTL_STD {
		/** 1：每房间 **/
		ROOM("1"),
		/** 2：成人 **/
		ADULT("2"),
		/** 3：儿童 **/
		CHILD("3"),
		/** 9：儿童分段 **/
		CHILD_OTH("9");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_RATEDTL_STD(String value) {
			this._value = value;
		}
	}

	/**
	 * 价格收费基准
	 * 1：每天过费，2：第一天过
	 */
	public static enum ENUM_POST_RHYTHM {
		/** 1：每天过费 **/
		EVERY("1"),
		/** 2：第一天过 **/
		FIRST("2");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_POST_RHYTHM(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 房含收费基准
	 * 1：每房间，2：每人，3：每成人，4：每儿童，5：每账户
	 */
	public static enum ENUM_PKG_STD {
		/** 1：每房间 **/
		ROOM("1"),
		/** 2：每人（含儿童） **/
		PERSON("2"),
		/** 3：成人 **/
		ADULT("3"),
		/** 4：纯儿童 **/
		CHILD("4"),
		/** 5：每账户 **/
		ACCOUNT("5");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_PKG_STD(String value) {
			this._value = value;
		}
	}
	
	/** 房含账单  0：不显示（默认）；1：显示 **/
	public static enum ENUM_PKGFOLIO_FLG{
		/**  0：不显示（默认） */
		NO_SHOW("0"),
		/** 1：显示 */
		SHOW("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		private ENUM_PKGFOLIO_FLG(String value) {
			this._value = value;
		}
	}
	
	/** 房含属性 RC：房费，PKG：房含 **/
	public static enum ENUM_PACKAGEFLG{
		/** RC：房费 */
		RC("RC"),
		/** PKG：房含 */
		PKG("PKG");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		private ENUM_PACKAGEFLG(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_PACKAGE_FLG {
		/** 0：价格里含，但无效 */
		HAS_NONVALID("0"),
		/**1：价格里含，且有效 */
		HAS_VALID("1"),
		/**2：价格里不含，有效 */
		NONHAS_VALID("2");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_PACKAGE_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 免费自用标识
	 * 0：普通（默认）；1：免费；2：自用。
	*/
	public static enum ENUM_COHU_FLG{
		ORDINARY("0"),FREE("1"),USE("2"),DEFAULT("0");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_COHU_FLG(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 定价方式
	 * 0：普通定价，1：分段定价；2：小时定价；3：Yield
	 * **/
	public static enum ENUM_PRICE_TYP{
		/**0：普通定价**/
		GENERAL("0"),
		/**1：分段定价**/
		SUB("1"),
		/**2：小时定价**/
		HOUR("2"),
		/**3：Yield**/
		YIELD("3"),
		DEFAULT("0");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_PRICE_TYP(String value){
			this._value=value;
		}	
	}
	
	/**
	明细属性			SEG：基础分段价格；SPC：特殊价格
	 * **/
	public static enum ENUM_RATE_SET_FLG{
		/**SEG：基础分段价格**/
		SEG("SEG"),
		/**SPC：特殊价格**/
		SPC("SPC");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_RATE_SET_FLG(String value){
			this._value=value;
		}	
	}
	
	/*
	 * 
	 * 房费人数基准
	 10：单一价格；20：五人价格；21：五人含儿童；22：五段儿童；30：多人价格；31：多人含儿童价；32：多儿童段
	 */
	public static enum ENUM_PSN_STD{
		/** 10：单一价格**/
		ONLY("10"),
		/**20：五人价格**/
		FIVE("20"),
		/**21：五人含儿童**/
		FIVE_HASCHILD("21"),
		/**22：五段儿童**/
		FIVE_CHILD("22"),
		/** 30：多人价格 **/
		MORE("30"),
		/** 31：多人含儿童价 **/
		MORE_HASCHILD("31"),
		/** 32：多儿童段 **/
		MORE_CHILD("32");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_PSN_STD(String value){
			this._value=value;
		}	
	}
	
	
	// 全局标志 0：非全局。 1：全局。
	public static enum ENUM_GLOBAL_FLG {
		/** 0 非全局 **/
		NONGLOBAL("0"),
		/** 1 全局 **/
		GLOBAL("1");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_GLOBAL_FLG(String value) {
			this._value = value;
		}
	}
}
