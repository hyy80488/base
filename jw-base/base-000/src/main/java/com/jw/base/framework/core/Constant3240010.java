package com.jw.base.framework.core;

public class Constant3240010 {
	/** 最大账页数 **/
	public final static String MAXPAGENUM = "3240-010-004";
	/** 间夜数  1，手工入日租和半日租时算间夜数，入账时有可配字段。 2.手工入日租和半日租时算间夜数，入账时无可配字段。**/
	public final static String NIGHTSFLG = "3240-010-008";
	/** 定金转入指定假房 **/
	public final static String DEPOSIT_ACCOUNT = "3220-010-027";
	/** 是否启用待结结账 **/
	public final static String WAIT_CHECKOUT = "3240-010-020";
	/** 是否使用原会员系统 **/
	public final static String USE_ORGMEMBERSYS = "9999-010-001";
	
	/**挂账标识   0普通**/
	public final static String POST_FLG_0 = "0";
	/**挂账标识   1挂当前账户**/
	public final static String POST_FLG_1 = "1";
	/**挂账标识   2挂目的账户**/
	public final static String POST_FLG_2 = "2";
	/**默认账页**/
	public final static String DEF_PAGE_NO = "1";
	
	public static enum ENUM_FLG {
		FLG_0("0"),
		FLG_1("1"),
		FLG_2("2");
		private String _value;

		public String getValue() {
			return _value;
		}
		private ENUM_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 过房费标记 0：未提前过，1：已提前过
	 */
	public static enum ENUM_PREPOST_FLG {
		/** 0：未提前过 */
		NO_ADVANCE_PASS("0"),
		/**1：已提前过 */
		ADVANCE_PASS("1");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PREPOST_FLG(String value) {
			this._value = value;
		}
	}
	
	// 是否从历史数据库查询
	// 1.从历史库查询
	// 2.不从历史库查询
	public static enum ENUM_HISTORY_FLG {
		YES("1"), NO("0"), DEFAULT("0");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_HISTORY_FLG(String value) {
			this._value = value;
		}
	}
	
	/**所属类型   ACCT：账户。GRP：团队，指团队主单上的定义**/
	public static enum ENUM_BELONG_TYP{
		/** ACCT：账户 */
		ACCT("ACCT"),
		/**GRP：团队，指团队主单上的定义 */
		GRP("GRP");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_BELONG_TYP(String value) {
			this._value = value;
		}
	}
	
	/**ROUTING类型  TRNSF：转账，DVD：分账页，CL：转应收Cityledger**/
	public static enum ENUM_ROUTING_TYP{
		/** TRNSF：转账 */
		TRNSF("TRNSF"),
		/**DVD：分账页 */
		DVD("DVD"),
		/**CL：转应收Cityledger */
		Cityledger("CL");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_ROUTING_TYP(String value) {
			this._value = value;
		}
	}
	
	/**PAU:新建预授权;ACP:完成预授权;AXL:取消预授权**/
	public static enum ENUM_CARDTRN_TYP{
		/** PAU：新建预授权 */
		PAU("PAU"),
		/**ACP：完成预授权 */
		ACP("ACP"),
		/**AXL：取消预授权 */
		AXL("AXL");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_CARDTRN_TYP(String value) {
			this._value = value;
		}
	}
	/**1:新建;2:完成;3:取消**/
	public static enum ENUM_TRN_STUS{
		/** 1：新建 */
		ONE("1"),
		/**2：完成*/
		TWO("2"),
		/**3：取消*/
		THREE("3");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_TRN_STUS(String value) {
			this._value = value;
		}
	}
	/**MM:手工处理;MC:会员卡;INF:接口**/
	public static enum ENUM_CARDTRN_SRC{
		/** MM：手工处理 */
		MM("MM"),
		/**MC：会员卡*/
		MC("MC"),
		/**INF：接口 */
		INF("INF");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_CARDTRN_SRC(String value) {
			this._value = value;
		}
	}
	
	/** 重新入住时是否对账务进行处理 **/
	public static enum ENUM_FINANCE_FLG{
		/** 不处理账务 */
		NO("0"),
		/**处理账务*/
		YES("1");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_FINANCE_FLG(String value) {
			this._value = value;
		}
	}
	/** 0：所有（默认）（手工加收时）  1：满足时间条件的（结账时） **/
	public static enum ENUM_QUERY_FLG{
		/** 所有 */
		All("0"),
		/**满足时间条件的*/
		CONDITION("1");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_QUERY_FLG(String value) {
			this._value = value;
		}
	}
	/***1：对冲     2交易拆分   3定金转账  4取消结账对冲结账付款交易 5账务对冲**/
	public static enum ENUM_HEDGE_OPER_FLG{
		HEDGE("1"),
		TRAN_RESOLUTION("2"),
		DEPOSIT("3"),
		TRN_HEDGE("5"),
		CXL_OUT("4");
		private String _value;
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_HEDGE_OPER_FLG(String value) {
			this._value = value;
		}
		
	}
	/** 禁止积分标志 **/
//	0：禁止；1：不禁止；默认不禁止
	public static enum ENUM_NOCREDIT_FLG{
		ALLOW("1"),
		FORBID("0"),
		DEFAULT("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
		
		private ENUM_NOCREDIT_FLG(String value) {
			this._value = value;
		}
		
	}
	
}
