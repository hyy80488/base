package com.jw.common.framework.m3540.f010.constant;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class LpsBnsPointConstant {
	/** 积分记录ID **/
	public static final String POINTTRN_ID = "pointtrn_id";
	/** 积分Folio号 **/
	public static final String POINTFOLIO_NO = "pointfolio_no";
	
	/**
	 *过期清除状态
	 * 0：未清除，1：已过期清除
	 */
	public static enum ENUM_EXPCLEAR_STUS{
		NO("0"), 
		YES("1");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return Objects.equals(this._value, value);
		}
		private ENUM_EXPCLEAR_STUS(String value){
			this._value=value;
		}	
	}
	
	
	
	/**
	 *是否可积分
	 * Y：可积分（默认Y），N：不可积分
	 */
	public static enum ENUM_CREDIT_FLG{
		Y("Y"), 
		N("N");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return Objects.equals(this._value, value);
		}
		private ENUM_CREDIT_FLG(String value){
			this._value=value;
		}	
	}
	
	/**
	 *交易请求系统
	 * HTL：酒店前台，POS：消费点，LPS：会员
	 */
	public static enum ENUM_POINTTRN_SYSID{
		HTL("HTL"), 
		POS("POS"),
		LPS("LPS");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return Objects.equals(this._value, value);
		}
		private ENUM_POINTTRN_SYSID(String value){
			this._value=value;
		}	
	}
	
	public static enum ENUM_POINTTRN_STUS{
		N("N"), 
		C("C");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return Objects.equals(this._value, value);
		}
		private ENUM_POINTTRN_STUS(String value){
			this._value=value;
		}	
	}
	
	/**
	 *积分单据类型
	 * EXSHP：商城兑换；EXRGT：积分兑换权益；EXPAY：积分兑换储值；
	 */
	public static enum ENUM_POINTFOLIO_TYP{
		MADD("MADD"),
		
		PAY("PAY"),
		ESPAY("ESPAY"),
		THPAY("THPAY"),
		MUSE("MUSE"),
		EXRGT("EXRGT"),
		EXPAY("EXPAY"),
		
		ACLR("ACLR"),
		MCLR("MCLR"),
		
		REMA("REMA"),
		
		RUPAY("RUPAY"),
		RUESP("RUESP"),
		RUTHP("RUTHP"),
		RUMU("RUMU"),
		RUEX("RUEX"),
		RUNCP("RUNCP"),
		RUEXP("RUEXP");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return Objects.equals(this._value, value);
		}
		private ENUM_POINTFOLIO_TYP(String value){
			this._value=value;
		}	
	}
	
	/**
	 *账务明细类型
	 *POINT：积分交易；REPT：二次分摊；
	 *ADJ：调整；MOVE：明细转账；TSFM：转换；STAT：统计用；CORR：修改；OPER：日志
	 */
	public static enum ENUM_JRNL_TYP{
		/** 积分交易  **/
		POINT("POINT"), 
		/** 二次分摊  **/
		REPT("REPT"),
		/** 调整  **/
		ADJ("ADJ"),
		/** 明细转账  **/
		MOVE("MOVE"),
		/** 转换  **/
		TSFM("TSFM"),
		/** 统计用  **/
		STAT("STAT"),
		/** 修改  **/
		CORR("CORR"),
		/** 日志  **/
		OPER("OPER");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return Objects.equals(this._value, value);
		}
		private ENUM_JRNL_TYP(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 积分操作类型
	 * 	C：创建；
	 * 	U：使用；
	 * 	D：清零；
	 * 	R：取消创建；
	 * 	RU：取消使用；
	 * 	S：特殊；
	 */
	public static enum ENUM_POINT_OPER{
		C("C"), U("U"),D("D"),R("R"),RU("S"),S("S");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return Objects.equals(this._value, value);
		}
		private ENUM_POINT_OPER(String value){
			this._value=value;
		}	
	}
	
	public static enum ENUM_FUNC_TYP{
		/** 消费累计积分 **/
		CP("CP", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.C),
		/** 注册会员奖励 **/
		RWRGM("RWRGM", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.C),
		/** 充值收费奖励 **/
		RCHRG("RCHRG", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.C),
		/** 升级奖励 **/
		RUPG("RUPG", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.C),
		/** 促销奖励 **/
		RPROM("RPROM", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.C),
		/** 手工增加积分 **/
		MADD("MADD", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.C, true, ENUM_POINTFOLIO_TYP.MADD),
		
		/** 使用积分付款 **/
		PAY("PAY", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U, true, ENUM_POINTFOLIO_TYP.PAY),
		/** 商城使用积分付款 **/
		ESPAY("ESPAY", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U, true, ENUM_POINTFOLIO_TYP.ESPAY),
		/** 第三方使用积分付款 **/
		THPAY("THPAY", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U, true, ENUM_POINTFOLIO_TYP.THPAY),
		/** 消费扣减积分（负消费累计） **/
		NCP("NCP", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U),
		/** 手工使用积分 **/
		MUSE("MUSE", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U, true, ENUM_POINTFOLIO_TYP.MUSE),
		/** 积分兑换权益 **/
		EXRGT("EXRGT", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U, true, ENUM_POINTFOLIO_TYP.EXRGT),
		/** 积分兑换储值（消费） **/
		EXPAY("EXPAY", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U, true,ENUM_POINTFOLIO_TYP.EXPAY),
		/** 充值收费扣减 **/
		CCHRG("CCHRG", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U),
		/** 升级扣减 **/
		CUPG("CUPG", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.U),
		
		/** 到期自动清零扣减 **/
		ACLR("ACLR", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.D, true,ENUM_POINTFOLIO_TYP.ACLR),
		/** 手工清零扣减 **/
		MCLR("MCLR", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.D, true,ENUM_POINTFOLIO_TYP.MCLR),
		/** 冲消费时被动清零扣减 **/
		PCLR("PCLR", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.D),
		
		/** 取消消费累计积分 **/
		RECP("RECP", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.R),
		/** 取消注册会员奖励 **/
		RERR("RERR", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.R),
		/** 取消充值收费奖励 **/
		RERC("RERC", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.R),
		/** 取消升级奖励 **/
		RERU("RERU", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.R),
		/** 取消促销奖励 **/
		RERP("RERP", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.R),
		/** 取消手工增加积分 **/
		REMA("REMA", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.R, false, ENUM_POINTFOLIO_TYP.REMA),
		
		/** 使用积分付款 **/
		RUPAY("RUPAY", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU, false,ENUM_POINTFOLIO_TYP.RUPAY),
		/** 商城使用积分付款 **/
		RUESP("RUESP", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU, false,ENUM_POINTFOLIO_TYP.RUESP),
		/** 取消第三方使用积分付款 **/
		RUTHP("RUTHP", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU, false,ENUM_POINTFOLIO_TYP.RUTHP),
		/** 手工使用积分 **/
		RUMU("RUMU", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU, false,ENUM_POINTFOLIO_TYP.RUMU),
		/** 积分兑换权益 **/
		RUEX("RUEX", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU, false,ENUM_POINTFOLIO_TYP.RUEX),
		/** 积分兑换储值（消费） **/
		RUEXP("RUEXP", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU, false,ENUM_POINTFOLIO_TYP.RUEXP),
		/** 取消消费扣减积分（负消费累计） **/
		RUNCP("RUNCP", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU, false,ENUM_POINTFOLIO_TYP.RUNCP),
		/** 充值收费扣减 **/
		RUCC("RUCC", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU),
		/** 升级扣减 **/
		RUCU("RUCU", ENUM_JRNL_TYP.POINT, ENUM_POINT_OPER.RU),
		
		/** *RUSE：冲累积时取消消费 **/
		STAR_RUSE("*RUSE", ENUM_JRNL_TYP.ADJ, ENUM_POINT_OPER.S),
		/** *USE：冲累积时再消费 **/
		STAR_USE("*USE", ENUM_JRNL_TYP.ADJ, ENUM_POINT_OPER.S),
		/** *NCP：冲累积时负积分 **/
		STAR_NCP("*NCP", ENUM_JRNL_TYP.ADJ, ENUM_POINT_OPER.S),
		/** *RRU：冲消费时取消消费 **/
		STAR_RRU("*RRU", ENUM_JRNL_TYP.ADJ, ENUM_POINT_OPER.S),
		/** *CRE：冲消费时正消费 **/
		STAR_CRE("*CRE", ENUM_JRNL_TYP.ADJ, ENUM_POINT_OPER.S),
		/** *NPRU冲消费时抵负积分 **/
		STAR_NPRU("*NPRU", ENUM_JRNL_TYP.ADJ, ENUM_POINT_OPER.S),
		/** *AUSE：积分时自动消费 **/
		STAR_AUSE("*AUSE", ENUM_JRNL_TYP.ADJ, ENUM_POINT_OPER.S),
		/** *NPU：积分时抵负积分 **/
		STAR_NPU("*NPU", ENUM_JRNL_TYP.ADJ, ENUM_POINT_OPER.S);
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		private ENUM_POINT_OPER _oper;
		public ENUM_POINT_OPER getOper() {
			return _oper;
		}
		private ENUM_JRNL_TYP _typ;
		public ENUM_JRNL_TYP getTyp() {
			return _typ;
		}
		private Boolean _createFolio = false;
		public Boolean getCreateFolio() {
			return _createFolio;
		}
		
		private ENUM_POINTFOLIO_TYP _folitTyp = ENUM_POINTFOLIO_TYP.EXRGT;
		public ENUM_POINTFOLIO_TYP getFolitTyp() {
			return _folitTyp;
		}
		public Boolean isEquals(String value){
			return Objects.equals(this._value, value);
		}
		
		private ENUM_FUNC_TYP _cxlFuncTyp;
		public ENUM_FUNC_TYP getCxlFuncTyp() {
			return _cxlFuncTyp;
		}
		
		private ENUM_FUNC_TYP(String value, ENUM_JRNL_TYP typ, ENUM_POINT_OPER oper){
			this._value=value;
			this._typ = typ;
			this._oper = oper;
			//this._cxlFuncTyp= cxlFuncTyp;
		}	
		private ENUM_FUNC_TYP(String value, ENUM_JRNL_TYP typ, ENUM_POINT_OPER oper, 
				Boolean createFolio){
			this._value=value;
			this._typ = typ;
			this._oper = oper;
			this._createFolio = createFolio;
		}	
		private ENUM_FUNC_TYP(String value, ENUM_JRNL_TYP typ, ENUM_POINT_OPER oper, 
				Boolean createFolio, 
				ENUM_POINTFOLIO_TYP folitTyp){
			this._value=value;
			this._typ = typ;
			this._oper = oper;
			this._createFolio = createFolio;
			this._folitTyp = folitTyp;
		}	
		
		public static ENUM_FUNC_TYP getEnum(String vlu){
			if(StringUtils.isEmpty(vlu)){
				return null;
			}
			ENUM_FUNC_TYP func_typ = null;
			for (ENUM_FUNC_TYP typ : ENUM_FUNC_TYP.values()) {
				if(Objects.equals(vlu, typ.getValue())){
					func_typ = typ;
					break;
				}
			}
			return func_typ;
		}
		
		public static Set<String> getTyps(ENUM_POINT_OPER oper){
			Set<String> set = new HashSet<>();
			for (ENUM_FUNC_TYP typ : ENUM_FUNC_TYP.values()) {
				if(typ.getOper().equals(oper)){
					set.add(typ.getValue());
				}
			}
			return set;
		}
		
		public static ENUM_FUNC_TYP getFuncTyp(ENUM_FUNC_TYP funcTyp){
			if(Objects.isNull(funcTyp)){
				return null;
			}
			return funcTypMap.get(funcTyp);
		}
		
		private static final EnumMap<ENUM_FUNC_TYP, ENUM_FUNC_TYP> funcTypMap;
		static{
			funcTypMap = new EnumMap<>(ENUM_FUNC_TYP.class);
			funcTypMap.put(ENUM_FUNC_TYP.CP, ENUM_FUNC_TYP.RECP);//消费累计积分-1
			funcTypMap.put(ENUM_FUNC_TYP.RWRGM, ENUM_FUNC_TYP.RERR);//注册会员奖励
			funcTypMap.put(ENUM_FUNC_TYP.RCHRG, ENUM_FUNC_TYP.RERC);//充值收费奖励
			funcTypMap.put(ENUM_FUNC_TYP.RUPG, ENUM_FUNC_TYP.RERU);//升级奖励
			funcTypMap.put(ENUM_FUNC_TYP.RPROM, ENUM_FUNC_TYP.RERP);//促销奖励
			funcTypMap.put(ENUM_FUNC_TYP.MADD, ENUM_FUNC_TYP.REMA);//手工增加积分
			
			funcTypMap.put(ENUM_FUNC_TYP.PAY, ENUM_FUNC_TYP.RUPAY);//使用积分付款
			funcTypMap.put(ENUM_FUNC_TYP.ESPAY, ENUM_FUNC_TYP.RUESP);//商城使用积分付款
			funcTypMap.put(ENUM_FUNC_TYP.THPAY, ENUM_FUNC_TYP.RUTHP);//第三方使用积分付款
			funcTypMap.put(ENUM_FUNC_TYP.MUSE, ENUM_FUNC_TYP.RUMU);//手工使用积分
			funcTypMap.put(ENUM_FUNC_TYP.EXRGT, ENUM_FUNC_TYP.RUEX);//积分兑换权益
			funcTypMap.put(ENUM_FUNC_TYP.EXPAY, ENUM_FUNC_TYP.RUEXP);//积分兑换储值（消费）
			funcTypMap.put(ENUM_FUNC_TYP.NCP, ENUM_FUNC_TYP.RUNCP);//消费扣减积分（负消费累计）
			funcTypMap.put(ENUM_FUNC_TYP.CCHRG, ENUM_FUNC_TYP.RUCC);//充值收费扣减
			funcTypMap.put(ENUM_FUNC_TYP.CUPG, ENUM_FUNC_TYP.RUCU);//升级扣减
			
		}
	}
	
	public static void main(String[] args) {
		System.err.println(ENUM_FUNC_TYP.getFuncTyp(null));
	}
	
	
}
