package com.jw.base.framework.core;

public class Constant3260010 {
	/** 数据是否搬移 **/
	public static enum ENUM_HIST_FLG {
		NOTMOVE("0"), ISMOVE("1"), DEFAULT("0");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_HIST_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 应收结转标志
	 * 0：未结转，1：已结转
	 */
	public static enum ENUM_AR_FLG{
		/**0：未结转**/
		NO_CARRYOVER("0"),
		/**1：已结转**/
		CARRYOVER("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_AR_FLG(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 交易状态
	 * N：正常，S：拆分对冲，C：对冲
	 */
	public static enum ENUM_TRN_STUS{
		/**N：正常**/
		N("N"),
		/**S：拆分对冲**/
		S("S"),
		/**C：对冲**/
		C("C"),
		/**D：费用**/
		D("D"),
		/**A：取消兑现*/
		A("A");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_TRN_STUS(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 交易类型
	 * 	O=Owner Transaction,N=Normal Transaction。
	 */
	public static enum ENUM_INVCTRN_FLG{
		/**O=Owner Transaction**/
		OWNER_TRAN("O"),
		/**N=Normal Transaction**/
		NORMAL_TRAN("N");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_INVCTRN_FLG(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 争议标志
	 *	0：无争议（默认），1：争议
	 */
	public static enum ENUM_DISPUTE_FLG{
		/**无争议（默认）**/
		NO_DISPUTE("0"),
		/**1：争议**/
		DISPUTE("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_DISPUTE_FLG(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 入账方式
	 *	POST：挂入明细；RECP：随收据建立；FRTBL：前台结账单转入；FRTCC：前台信用卡转入；ARCC：应收信用卡转入；RECO：对冲产生；
	 *	IMI：转单转入；IMO：转单转出；ITMI：明细转账转入；ITMO：明细转账转出
	 *	APPLY：兑现；RAPPL：取消兑现
	 */
	public static enum ENUM_AR_FUNC_TYP{
		/**POST：挂入明细**/
		POST("POST"),
		/**RECP：随收据建立**/
		RECP("RECP"),
		/**FRTBL：前台结账单转入**/
		FRTBL("FRTBL"),
		/**FRTCC：前台信用卡转入**/
		FRTCC("FRTCC"),
		/**ARCC：应收信用卡转入**/
		ARCC("ARCC"),
		/**IMI：转单转入**/
		IMI("IMI"),
		/**IMO：转单转出**/
		IMO("IMO"),
		/**ITMI：明细转账转入**/
		ITMI("ITMI"),
		/**ITMO：明细转账转出**/
		ITMO("ITMO"),
		/**APPLY：兑现**/
		APPLY("APPLY"),
		/**CXLAP：取消兑现**/
		CXLAP("CXLAP"),
		/**RMSV：客房服务**/
		RMSV("RMSV"),
		/**RMSVD：客房服务明细**/
		RMSVD("RMSVD"),
		/**MINVC：手工建立发票**/
		MINVC("MINVC"),
		/**RECO：对冲产生**/
		RECO("RECO"),
		/**收据对冲**/
		IRECO("IRECO"),
		/**发票明细对冲**/
		TRECO("TRECO");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_AR_FUNC_TYP(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 账务明细类型
	 *	REVN：收入；MOVE：明细转账；STAT：统计用；CORR：修改；OPER：日志
	 */
	public static enum ENUM_AR_JRNL_TYP{
		/**REVN：收入**/
		REVN("REVN"),
		/**MOVE：明细转账**/
		MOVE("MOVE"),
		/**STAT：统计用**/
		STAT("STAT"),
		/**CORR：修改**/
		CORR("CORR"),
		/**OPER：日志**/
		OPER("OPER");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_AR_JRNL_TYP(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 发票收据标志
	 *	I：invoice，R：Receipt，D：Deposit
	 */
	public static enum ENUM_AR_INVC_TYP{
		/**I：invoice**/
		I("I"),
		/**R：Receipt**/
		R("R"),
		/**D：Deposit**/
		D("D");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_AR_INVC_TYP(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 包属性
	 *	NML：未打包的普通票据，PKG：包，CMP：被打包的普通票据
	 */
	public static enum ENUM_AR_INVC_PKG_FLG{
		/**NML：未打包的普通票据**/
		NML("NML"),
		/**PKG：包**/
		PKG("PKG"),
		/**CMP：被打包的普通票据**/
		CMP("CMP");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_AR_INVC_PKG_FLG(String value){
			this._value=value;
		}	
	}
	
	/** 科目借贷属性  C：CREDIT；D：DEBIT **/
	public static enum ENUM_NORMAL{
		/** C：CREDIT */
		CREDIT("C"),
		/** D：DEBIT */
		DEBIT("D");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		private ENUM_NORMAL(String value) {
			this._value = value;
		}
	}
	public static enum ENUM_ARSTUS{
		/** NML */
		NML("NML"),
		/** PER */
		PER("PER"),
		/** CXL */
		CXL("CXL");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		private ENUM_ARSTUS(String value) {
			this._value = value;
		}
	}
	/**
	 * ## 类说明：
	 * 	AR:应收;AP:应付;NA:收据;CA:资金账户现付
	 */
	public static enum ENUM_LEDGER_FLG{
		/** AR:应收 */
		AR("AR"),
		/** AP:应付 */
		AP("AP"),
		/** NA:收据 */
		NA("NA"),
		/** CA:资金账户现付 */
		CA("CA");
		private String _value;
		public String getValue() {
			return _value;
		}
		private ENUM_LEDGER_FLG(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_LEDGER_TYP{
		/** ARNML：应收普通 */
		ARNML("ARNML"),
		/** ARMANU：应收手工*/
		ARMANU("ARMANU"),
		/** AROBLC：应收期初 */
		AROBLC("AROBLC"),
		/** APNML：应付普通 */
		APNML("APNML"),
		/** APMANU：应付手工*/
		APMANU("APMANU"),
		/** APOBLC：应付期初*/
		APOBLC("APOBLC"),
		/**MCHRG：会员储值**/
		MCHRG("MCHRG"),
		/**MREFD：会员退款**/
		MREFD("MREFD"),
		/**MPAY：会员消费**/
		MPAY("MPAY"),
		/**MRUPAY：会员取消消费**/
		MRUPAY("MRUPAY"),
		/**GARNML：结算中心应收普通**/
		GARNML("GARNML"),
		/**GARMANU：结算中心应收手工**/
		GARMANU("GARMANU"),
		/**GAROBLC：结算中心应收期初**/
		GAROBLC("GAROBLC"),
		/**GAPNML：结算中心应付普通**/
		GAPNML("GAPNML"),
		/**GAPMANU：结算中心应付手工**/
		GAPMANU("GAPMANU"),
		/**GAPOBLC：结算中心应付期初**/
		GAPOBLC("GAPOBLC")
		;
		private String _value;
		public String getValue() {
			return _value;
		}
		private ENUM_LEDGER_TYP(String value) {
			this._value = value;
		}
	}
}
