package com.jw.base.framework.core;


import com.jw.base.framework.core.util.StringUtil;

public class ConstantParmTran {
	/**
	 * 日志拼接文档类型，根据ID，获取整套内容拼接 
	 */
	public static enum ENUM_TRAN_TYPE {
		/**2：房型信息 */
		ROOMTYPE_INFO("2"),
		/**4：平台参数分组 */
		PLFCMMPARAMGROUP_INFO("4"),
		/**5：账号 */
		ACCOUNT_INFO("5"),
		/**7：销售员 */
		SALER_ID("7"),
		/**8：会员卡类型 */
		MEMBERTYP_ID("8"),
		/**9：价格 */
		RATE_ID("9"),
		/**11：科目代码 */
		TRNCD_ID("11"),
		/**12：客账明细 */
		TRN_INFO("12"),
		/**13：卡等级 */
		MCARDRANK_INFO("13"),
		/**14：会员等级 */
		MEMBERRANK_INFO("14"),
		/**16：雇员 */
		REFEREMPLOYEE_INFO("16"),
		/**17：会员可升等级*/
		UPMEMBERRANK_INFO("17"),
		/**18：会员可降等级*/
		DOWNMEMBERRANK_INFO("18"),
		/**19：会员升级策略ID*/
		UPUPGRADEPOLICY_INFO("19"),
		/**20：会员降级策略ID*/
		DOWNUPGRADEPOLICY_INFO("20"),
		/**21：会员卡可升等级*/
		UPMCARDRANK_INFO("21"),
		/**22：会员卡可降等级*/
		DOWNMCARDRANK_INFO("22"),
		/**23：房含项目分组*/
		GRP_RSV_PACKAGE_GROUP("23"),
		/**24：应收帐号*/
		ARNO_INFO("24"),
		/**25：会员号*/
		MEMBER_NO("25"),
		/**26：班次信息*/
		TURN_INFO("26"),
		/**27：销售点信息*/
		POS_INFO("27"),
		/**28：会员发行信息*/
		PUBLISH_INFO("28"),
		/**29：会员使用信息*/
		USE_INFO("29"),
		/**30：协议价格信息*/
		CONTRACTRATE_INFO("30"),
		/**31：商品信息*/
		GOODS_INFO("31"),
		/**32：会员卡信息*/
		MCARD_INFO("32"),
		/**33：消费品信息*/
		PRODUCT_INFO("33"),
		/**34：渠道信息*/
		CHANNEL_INFO("34"),
		/**35：商城商品信息*/
		SHOPGOODS_INFO("35"),
		/**默认：空*/
		DEFAULT("");

		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_TRAN_TYPE(String value) {
			this._value = value;
		}

		/** 
		 * ## 方法说明：
		 * 	判断枚举中是否存在于传入参数相同的数据
		 * @param value
		 * @return 存在true  不存在false
		*/
		public static final Boolean some(String value) {
			Boolean flg = false;
			// 参数为空 返回false
			if (StringUtil.isEmpty(value)){
				return flg;
			}
			// 遍历枚举数据 存在相同数据 返回true
			for (ENUM_TRAN_TYPE PARA : ENUM_TRAN_TYPE.values()) {
				if (PARA.getValue().equals(value)) {
					flg = true;
					break;
				}
			}
			return flg;
		}
	}
	
	/**
	 * 本属性是否记录日志
	 */
	public static enum ENUM_LOGGED {
		/**1：记录 */
		YES("1"),
		/**2：不记录 */
		NO("0"),
		/**默认：1：记录*/
		DEFAULT("0");

		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_LOGGED(String value) {
			this._value = value;
		}

		/** 
		 * ## 方法说明：
		 * 	判断枚举中是否存在于传入参数相同的数据
		 * @param value
		 * @return 存在true  不存在false
		*/
		public static final Boolean some(String value) {
			Boolean flg = false;
			// 参数为空 返回false
			if (StringUtil.isEmpty(value)){
				return flg;
			}
			// 遍历枚举数据 存在相同数据 返回true
			for (ENUM_LOGGED PARA : ENUM_LOGGED.values()) {
				if (PARA.getValue().equals(value)) {
					flg = true;
					break;
				}
			}
			return flg;
		}
	}
	
	public static final String TYPE_STRING = "class java.lang.String";
	public static final String TYPE_INTEGER = "class java.lang.Integer";
	public static final String TYPE_BIGDECIMAL = "class java.math.BigDecimal";
	public static final String TYPE_BOOLEAN = "class java.lang.Boolean";
	public static final String TYPE_DATE = "class java.util.Date";
	public static final String TYPE_LIST = "java.util.List";
}
