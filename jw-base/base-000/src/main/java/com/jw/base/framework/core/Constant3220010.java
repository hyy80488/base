package com.jw.base.framework.core;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;

public class Constant3220010 {
	/**
	 *  0：ALL
		1：预订备注
		2：前台备注
		3：客房备注
		4：收银备注
		5：销售点备注
		C：渠道备注（OTA接口用，不可修改）
	 */
	public static enum ENUM_NOTICE_FLG {
		ALL("0"),
		RSV("1"),
		HTL("2"),
		ROOM("3"),
		HPT("4"),
		POS("5"),
		CHANNEL("C");
		private String _value;

		public String getValue() {
			return _value;
		}
		private ENUM_NOTICE_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * 占用标记 
	 * ARR：首日占用，STY：全占用，DEP：末日占用，DU：Dayuse
	 */
	public static enum ENUM_BLOCK_FLG {
		/** 首日占用 */
		ARR("ARR"),
		/** 全占用 */
		STY("STY"),
		/** 末日占用 */
		DEP("DEP"),
		/** Dayuse */
		Dayuse("DU");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_BLOCK_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 合住状态
	 * 优先顺序：STY,RSV,OUT,CXL 另外：OOS，OOO，NBA,BLK
	 */
	public static enum ENUM_SHARE_STUS {
		/** 入住 */
		STY("STY"),
		/** 预定 */
		RSV("RSV"),
		/** 结账 */
		OUT("OUT"),
		/** 取消 */
		CXL("CXL"),
		/** 维修房 */
		OOS("OOS"),
		/** 坏房 */
		OOO("OOO"),
		OOI("OOI"),
		/** 临时占用 */
		NBA("NBA"),
		/** 团队占用 */
		BLK("BLK");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_SHARE_STUS(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 占用标记 
	 * 'NML' 预订‘WI' = walkin散客‘ECI' = 预订意外来店  ‘NCI’=noshow来店 
	 * 优先顺序NML , ECI , NCI , WI
	 */
	public static enum ENUM_ARR_STUS {
		/** 预订 */
		NML("NML"),
		/** walkin散客 */
		WI("WI"),
		/** 预订意外来店 */
		ECI("ECI"),
		/** noshow来店 */
		NCI("NCI");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_ARR_STUS(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 离店标志
	 * ‘NML’：正常结帐‘ EBL’：提前结帐‘ECO’：意外离店
	 * 优先顺序：ECO,EBL,NML
	 */
	public static enum ENUM_DPT_STUS {
		/** 正常结帐 */
		NML("NML"),
		/** 提前结帐 */
		EBL("EBL"),
		/** 意外离店 */
		ECO("ECO");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_DPT_STUS(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 房间状态：  V（空房） O（占用）  
	 * 			 OOO（大维修）  OOS（小维修）   NBA（临时锁房）   
	 */
	public static enum ENUM_ROOM_STUS {
		/** V（空房） */
		VACANT("V"),
		/** O（占用） */
		OCC("O"),
		/** OOO（大维修） */
		OOO("OOO"),
		/** OOS（小维修） */
		OOS("OOS"),
		/** NBA（临时锁房）*/
		NBA("NBA");

		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_ROOM_STUS(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 前台房间状态：  V（空房） O（占用）  
	 * 			 OOO（大维修）  OOS（小维修）   NBA（临时锁房）   
	 */
	public static enum ENUM_FO_ROOM_STUS {
		/** V（空房） */
		VACANT("V"),
		/** O（占用） */
		OCC("O"),
		/** OOO（大维修） */
		OOO("OOO"),
		/** OOS（小维修） */
		OOS("OOS"),
		/** NBA（临时锁房）*/
		NBA("NBA");

		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_FO_ROOM_STUS(String value) {
			this._value = value;
		}
	}

	/**
	 * 业务类型
	 * 预订：RSV
	 * 故障房：OOX
	 * 高级团：GRP
	 */
	public static enum ENUM_BLOCK_TYP {
		/** 预订：RSV */
		RSV("RSV"),
		/** 故障房：OOX */
		OOX("OOX"),
		/** 高级团：GRP */
		GRP("GRP");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_BLOCK_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 付款标志
	 * 房费分摊标志 ‘E’：一人全付的付费方 ‘S’：平分房费 ‘N’：一人全付的不付费方  ‘F’:一人全价 ‘O’：原始态  
	 */
	public static enum ENUM_RC_FLG {
		/** F’:一人全价 */
		F("F",0),
		/** E’：一人全付的付费方 */
		E("E",1),
		/** S’：平分房费 */
		S("S",2),
		/** O’：原始态  */
		O("O",3),
		/** N’：一人全付的不付费方 */
		N("N",4);

		private String _value;

		public String getValue() {
			return _value;
		}
		private Integer _sort;

		public Integer getSort() {
			return _sort;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		public final static Boolean isSum2Block(String value) {
			if (ENUM_RC_FLG.E.isEquals(value) || ENUM_RC_FLG.S.isEquals(value) || ENUM_RC_FLG.N.isEquals(value)){
				return false;
			}
			return true;
		}
		
		public final static Boolean hasEnum(String value) {
			for (ENUM_RC_FLG e: ENUM_RC_FLG.values()) {
				if(Objects.equals(value, e.getValue())){
					return true;
				}
			}
			return false;
		}
		
		public final static ENUM_RC_FLG othRcFlg(ENUM_RC_FLG rcFlg) {
			if(ENUM_RC_FLG.E.equals(rcFlg)){
				return ENUM_RC_FLG.N;
			}
			return rcFlg;
		}
		
		public final static ENUM_RC_FLG getRcFlg(List<String> rcFlgs){
			if(rcFlgs.contains(ENUM_RC_FLG.E.getValue()) || rcFlgs.contains(ENUM_RC_FLG.N.getValue())){
				return ENUM_RC_FLG.E;
			}
			if(rcFlgs.contains(ENUM_RC_FLG.S.getValue())){
				return ENUM_RC_FLG.S;
			}
			if(rcFlgs.contains(ENUM_RC_FLG.F.getValue())){
				return ENUM_RC_FLG.F;
			}
			return ENUM_RC_FLG.O;
		}
		
		public final static ENUM_RC_FLG getRc(List<String> rcFlgs){
			if(rcFlgs.contains(ENUM_RC_FLG.E.getValue())){
				return ENUM_RC_FLG.E;
			}
			if(rcFlgs.contains(ENUM_RC_FLG.S.getValue())){
				return ENUM_RC_FLG.S;
			}
			if(rcFlgs.contains(ENUM_RC_FLG.F.getValue())){
				return ENUM_RC_FLG.F;
			}
			if(rcFlgs.contains(ENUM_RC_FLG.N.getValue())){
				return ENUM_RC_FLG.N;
			}
			return ENUM_RC_FLG.O;
		}

		private ENUM_RC_FLG(String value,Integer sort) {
			this._value = value;
			this._sort = sort;
		}
	}
	
	/**
	 * 时间
	 */
	public static enum ENUM_DATETIME {
		/** 00:00 */
		MINDT("00:00"),
		/** 24:00 */
		MAXDT("24:00"),
		/** 12:00 */
		DEPDT("12:00"),
		/** 14:00 */
		ARRDT("14:00"),
		/** 23:59 */
		DAYOUSDT("23:59");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_DATETIME(String value) {
			this._value = value;
		}
	}
	/**
	 * 挂入标志
	 *  '1'  已经挂入   ‘0’  未挂入
	 */
	public static enum ENUM_POST_FLG {
		POST("1"),
		NOPOST("0");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_POST_FLG(String value) {
			this._value = value;
		}
	}
	/** 记账方式 0：当日消费，1：次日消费 **/
	public static enum ENUM_AUDIT_TYP {
		ZERO("0"),
		ONE("1");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_AUDIT_TYP(String value) {
			this._value = value;
		}
	}
	/** 是否允许抛帐 0 不允许 1 允许**/
	public static enum ENUM_PERMITPOST_FLG {
		ZERO("0"),
		ONE("1");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PERMITPOST_FLG(String value) {
			this._value = value;
		}
	}
	/** 消费方式 1按金额消费 2按次消费**/
	public static enum ENUM_POST_TYP {
		TWO("2"),
		ONE("1");
		
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_POST_TYP(String value) {
			this._value = value;
		}
	}
	/** 房含属性  0普通 1早餐 2晚餐 RS客房服务**/
	public static enum ENUM_PRODUCT_FLG {
		ZERO("0"),
		ONE("1"),
		TWO("2"),
		RS("RS");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PRODUCT_FLG(String value) {
			this._value = value;
		}
	}
	/** 库存控制 0无库存管理 1库存管理**/
	public static enum ENUM_INVENTORYCONTROL_FLG {
		ZERO("0"),
		ONE("1");
		
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_INVENTORYCONTROL_FLG(String value) {
			this._value = value;
		}
	}
	/** 是否进行库存管理 **/
	public static enum ENUM_INVENTORY_FLG {
		NO("N"), YES("Y"), DEFAULT("N");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_INVENTORY_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * 状态枚举 0：无效 1：有效（默认）
	 */
	public static enum ENUM_STATUS_FLG {
		/** 无效 **/
		INVALID("0"),
		/** 有效（默认） **/
		VALID("1"),
		/** 全部 **/
		ALL("all"),
		/** 有效（默认） **/
		DEFAULT("1");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_STATUS_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * RsvAccountDto所有描述信息:drptMap
	 */
	public static final String DRPTMAPSTR = "{\"roomtypId\":\"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto.roomtypId\","
			                               + "\"salerId\":\"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto.salerId\","
			                               + "\"bkguestId\":\"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto.bkguestId\","
			                               + "\"negoCorpNo\":\"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto.negoCorpNo\","
			                               + "\"cancelUnitUid\":\"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto.cancelUnitUid\","
			                               + "\"reguestId\":\"com.jw.hms.pms.m3220.f010.dto.rsvAccount.RsvAccountDto.reguestId\"}";
	public static final String TRNTYP="140";
	//钟点房加收策略标记
	public static final String HOURADD_OPTION="3220-010-110";
	//更新价格房型
	public static final String UPD_RATE_ROOMTYP_ID="3220-010-112";
	//定金假房
	public static final String DEPOSIT_PFROOM="3220-010-027";
	
	
	public static enum ENUM_SALESPHASE_FLG {
		/** 1问询 */
		INQUIRE("1"),
		/** 2暂时 */
		TEMPORARY("2"),
		/** 3确定 */
		DETERMINE("3"),
		/** 4完成 */
		COMPLETE("4");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_SALESPHASE_FLG(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_ACCT_TYP {
		/** NML */
		NML("NML"),
		/** GRP */
		GRP("GRP");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_ACCT_TYP(String value) {
			this._value = value;
		}
	}
	
	/*
	 GRP：团队主账
	PTN：同来人主账
	CU：自定义
	 */
	public static enum ENUM_ROUTING_FLG {
		/** GRP：团队主账 */
		GRP("GRP", "RECV"),
		/** PTN：同来人主账 */
		PTN("PTN", "RECV"),
		/**CU：自定义 */
		CU("CU", "TRNSF");
		private String _value;
		public String getValue() {
			return _value;
		}
		private String _routingTyp;
		public String getRoutingTyp() {
			return _routingTyp;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_ROUTING_FLG(String value, String routingTyp) {
			this._value = value;
			this._routingTyp = routingTyp;
		}
		public static ENUM_ROUTING_FLG getRgFlg(String vlu){
			for (ENUM_ROUTING_FLG rFlg : ENUM_ROUTING_FLG.values()) {
				if(rFlg.isEquals(vlu)){
					return rFlg;
				}
			}
			return null;
		}
	}
	
	public static enum ENUM_PARTNERMAIN_FLG {
		/** 0：非同来人主账户，*/
		NO("0"),
		/** 1：同来人主账户 */
		YES("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_PARTNERMAIN_FLG(String value) {
			this._value = value;
		}
	}
	
	
	
	/**
	 * 发送or接收   渠道接口日志信息
	 * S：平台发送，R：平台接收；LS：本地发送；LR：本地接收
	*/
	public static enum ENUM_LOG_SOR_FLG {
		PALTFORM_SEND("S"),
		PALTFORM_RECEIVE("R"),
		LOCAL_RECEIVE("LR"),
		LOCAL_SEND("LS");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_LOG_SOR_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 发送or接收   渠道接口日志信息
	 * 	0：无效 1：成功  2：失败
	*/
	public static enum ENUM_LOG_SUCCESS_FLG {
		SUCCESS("1"),
		FAILED("2"),
		INVALID("0");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_LOG_SUCCESS_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 发送or接收   渠道接口日志信息
	 * 	1 请求 2响应
	*/
	public static enum ENUM_LOG_SEND_TYP {
		REQ("1"),
		REP("2");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_LOG_SEND_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 预订操作常量
	 */
	public static enum ENUM_ACCOUNR_FLG {
		/** 1	新建预订	**/
		NEW_ACCOUNT("1"),
		/** 2	复制合住 **/
		COPY_SHARE("2"),
		/** 3	修改预订 **/
		EDIT_ACCOUNT("3"),
		/** 4	NOSHOW **/
		NOSHOW("4"),
		/** 5	退房离店 **/
		OUT("5"),
		/** 9	待结结账 **/
		HOLD_OUT("9"),
		/** 7	提前退房离店 **/
		ADVANCE_OUT("7"),
		/** 6	复制预订 **/
		COPY_ACCOUNT("6"),
		/** 8	修改离期 **/
		EDIT_DPT_DT("8"),
		/** 10	CHECKIN预订开房  （房数只能为1，房号不为空，来期（业务日期）必须是当天）**/
		CHECKIN("10"),
		/** 11	WALKIN 散客入住	**/
		WALKIN("11"),
		/** 12	NOSHOW入住 **/
		NOSHOW_WALKIN("12"),
		/** 13	假房开房 **/
		PSEUDO_ROOM("13"),
		/** 14	假房修改 **/
		PSEUDO_ROOM_EDIT("14"),
		/** 20	入住取消	**/
		CXL_WALKIN("20"),
		/** 21	取消预定 **/
		CXL_ACCOUNT("21"),
		/** 22	恢复结账 **/
		CXL_OUT("22"),
		/** 30	恢复预订 **/
		RECOVERY_ACCOUNT("30"),
		/** 40	新建临时预订 **/
		TMP_NEW_ACCOUNT("40"),
		/** 41	修改临时预订 **/
		TMP_EDIT_ACCOUNT("41"),
		/** 42	取消临时预订 **/
		TMP_CXL_ACCOUNT("42"),
		/** 43	恢复临时预订 **/
		TMP_RECOVERY_ACCOUNT("43"),
		/** 50	延期 **/
		DELAY("50");

		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_ACCOUNR_FLG(String value) {
			this._value = value;
		}

		/** 根据Value获取枚举常量*/
		public static final ENUM_ACCOUNR_FLG returnEnum(String value) throws Exception {
			if (value == null) {
				return null;
			}
			//遍历枚举数据  存在相同数据
			for (ENUM_ACCOUNR_FLG PARA : ENUM_ACCOUNR_FLG.values()) {
				if (PARA.getValue().equals(value)) {
					return PARA;
				}
			}
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_100005, "枚举类型转换错误：ENUM_ACCOUNR_FLG", "枚举类型转换错误：ENUM_ACCOUNR_FLG",
					BsProcessErrorCode.ERROR_LEVEL_5);
		}
	}
	/**
	 * 开关标志U：未设置（默认），Y：有，N：无
	 */
	public static enum ENUM_SWITCH_FLG {
		YES("Y"),
		NO("N"),
		UNSET("U");
		private String _value;

		public String getValue() {
			return _value;
		}
		private ENUM_SWITCH_FLG(String value) {
			this._value = value;
		}
		public static Set<String> getValues() {
			Set<String> values = new HashSet<>();
			ENUM_SWITCH_FLG[] flgs = ENUM_SWITCH_FLG.values();
			for (ENUM_SWITCH_FLG flg : flgs) {
				values.add(flg.getValue());
			}
			return values;
		}
	}
	/**
	 * 开关等级L0，L1，L2~L9
	 */
	public static enum ENUM_SWITCH_LVL {
		L0("L0"),
		L1("L1"),
		L2("L2"),
		L3("L3"),
		L4("L4"),
		L5("L5"),
		L6("L6"),
		L7("L7"),
		L8("L8"),
		L9("L9");
		private String _value;

		public String getValue() {
			return _value;
		}
		private ENUM_SWITCH_LVL(String value) {
			this._value = value;
		}
		public static Set<String> getValues() {
			Set<String> values = new HashSet<>();
			ENUM_SWITCH_LVL[] flgs = ENUM_SWITCH_LVL.values();
			for (ENUM_SWITCH_LVL flg : flgs) {
				values.add(flg.getValue());
			}
			return values;
		}
	}
	
	/**
	 * 变动类型
	 */
	public static enum ENUM_MOVE_TYP {
		/**新建订单**/
		NA("NA"),
		/**排房**/
		RA("RA"),
		/**修改订单**/
		RM("RM"),
		/**换房**/
		CRBA("CRBA"),
		/**合住换房**/
		CR("CR"),
		SWAP("SWAP");
		private String _value;

		public String getValue() {
			return _value;
		}
		private ENUM_MOVE_TYP(String value) {
			this._value = value;
		}
	}
}
