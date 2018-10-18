/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.base.framework.core;

public class Constant3540010 {
	/**会员信息key**/
	public static final String MEMBER_INFO = "MEMBER_INFO";
	/**会员卡信息key**/
	public static final String MCARD_INFO = "MCARD_INFO";
	/**物理卡信息key**/
	public static final String REALCARD_INFO = "REALCARD_INFO";
	
	/**
	 * 优惠策略类型
	 **/
	public static enum ENUM_FAVOURPOLICY_TYP {
		/**100 折扣价格*/
		DISCOUNT_RATE("100"),
		/** 101 会员时租折扣价格**/
		HOUR_DISCOUNT_RATE("101"),
		POS("POS"),
		/** 501 订单时间**/
		ORDER_TIME("501"),
		/** 801 订单限制数量**/
		ORDER_QUANTITY("801");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_FAVOURPOLICY_TYP(String value) {
			this._value = value;
		}
		
		public static Boolean hasEnum(String typNm){
			for (ENUM_FAVOURPOLICY_TYP typ : ENUM_FAVOURPOLICY_TYP.values()) {
				if(typ.isEquals(typNm)){
					return true;
				}
			}
			return false;
		}
	}
	/**
	 * 附加明细类型
	 **/
	public static enum ENUM_FPITEM_TYP {
		/**房型*/
		ROOMTYP("ROOMTYP"),
		/**销售点**/
		POS("POS"),
		/**销售点大类**/
		POSTRNCLS("POSTRNCLS"),
		/**销售点小类**/
		POSTRNSUBCLS("POSTRNSUBCLS"),
		/**销售点品目**/
		POSTRNCODE("POSTRNCODE");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_FPITEM_TYP(String value) {
			this._value = value;
		}
	}
	/***
	 * 会员卡状态    0： 未激活 ，1：有效，2：挂失，3：冻结，8：作废（比如记次卡到达次数，或到达使用期限），9：取消
	 */
	public static enum ENUM_MCARD_STUS{
		/** 0： 未激活**/
		NOT_ACTIVE("0"),
		/** 1：有效**/
		EFFECTIVE("1"),
		/** 2：挂失**/
		REPORT_THE_LOSS("2"),
		/** 3：冻结**/
		FROZEN("3"),
		/** 8：作废（比如记次卡到达次数，或到达使用期限）**/
		TO_VOID("8"),
		/** 9：取消**/
		CANCEL("9");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MCARD_STUS(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 0：未发行，1：已发行，2：挂失，3：报废
	 */
	public static enum ENUM_REALCARD_STUS{
		/** 0： 未发行**/
		UNISSUED("0"),
		/** 1：已发行**/
		ISSUED("1"),
		/** 2：挂失**/
		REPORT_THE_LOSS("2"),
		/** 3：作废**/
		TO_VOID("8");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_REALCARD_STUS(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 充值类型
	 */
	public static enum ENUM_MCTRN_FUNC_TYP{
		CHRG("CHRG"),//续费
		FSTCHRG("FSTCHRG"),//首充
		RCHRG("RCHRG"),
		RECHG("RECHG"),
		TCHRG("TCHRG"),
		PAY("PAY"),
		PUPAY("PUPAY"),
		RETCHRG("RETCHRG"),
		REFND("REFND"),
		TREFND("TREFND"),
		RUPAY("RUPAY");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MCTRN_FUNC_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 充值明细类型
	 */
	public static enum ENUM_MCTRN_JRNL_TYP{
		REVN("REVN"),
		CORR("CORR");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MCTRN_JRNL_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 充值单据类型
	 */
	public static enum ENUM_MCTRN_FOLIO_TYP{
		CHRG("CHRG"),
		FSTCHRG("FSTCHRG"),
		PAY("PAY"),
		RUPAY("RUPAY"),
		TCHRG("TCHRG"),
		REFND("REFND"),
		RETCHRG("RETCHRG"),
		RECHG("RECHG");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MCTRN_FOLIO_TYP(String value) {
			this._value = value;
		}
	}
	/**
	 * 值类型
	 */
	public static enum ENUM_MCTRN_VALUE_TYP{
		NET("NET"),
		TAX("TAX"),
		SVC("SVC"),
		STX("STX");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MCTRN_VALUE_TYP(String value) {
			this._value = value;
		}
	}
	/**
	 * 交易请求系统
	 */
	public static enum ENUM_MCTRN_SYSID{
		HTL("HTL"),
		POS("POS"),
		LPS("LPS");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MCTRN_SYSID(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_CHARGEPOLICY_TYP{
		FIRST_CHARGE("501"),
		RENEW("502");
		private String _value;
		public String getValue() {
			return _value;
		}
		private ENUM_CHARGEPOLICY_TYP(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_CPADDITION_TYP{
		/**R01：赠储值**/
		R01("R01"),
		/**R02：赠积分**/
		R02("R02");
		private String _value;
		public String getValue() {
			return _value;
		}
		private ENUM_CPADDITION_TYP(String value) {
			this._value = value;
		}
	}
	/**
	 * ## 类说明：
	 * 	N：普通（不分级，不分阶梯），C：分级，L：阶梯
	 */
	public static enum ENUM_CALC_MODE{
		/**N：普通（不分级，不分阶梯）**/
		N("N"),
		/**C：分级**/
		C("C"),
		/**L：阶梯*/
		L("L");
		private String _value;
		public String getValue() {
			return _value;
		}
		private ENUM_CALC_MODE(String value) {
			this._value = value;
		}
	}
	/**
	 * ## 类说明：优惠策略属性
	 * 	BS：基本策略，ATT：附加策略
	 */
	public static enum ENUM_FAVOURPOLICY_FLG{
		/**BS：基本策略**/
		BS("BS"),
		/**ATT：附加策略**/
		ATT("ATT");
		private String _value;
		public String getValue() {
			return _value;
		}
		private ENUM_FAVOURPOLICY_FLG(String value) {
			this._value = value;
		}
	}
}
