package com.jw.base.framework.core;

import com.jw.base.framework.core.util.StringUtil;

public class ConstantParm {
	/**
	 * 0：共同参数；1：集团酒店参数；2：集团销售点参数；3：系统参数；
	 */
	public static enum ENUM_PARA_TYPE {
		/**0：共同参数*/
		COMMON_PARA("COMMON_PARA"),
		/** BASE参数**/
		CHAIN_BASE_PARA("CHAIN_BASE_PARA"),
		/**1：集团酒店参数*/
		CHAIN_UNIT_PARA("CHAIN_UNIT_PARA"),
		/**2：集团销售点参数*/
		CHAIN_POS_PARA("CHAIN_POS_PARA"),
		/**3：系统参数*/
		SYS_PARA("SYS_PARA"),
		/**系统参数+sku*/
		SYS_PARA_SKU("SYS_PARA_SKU"),
		/**10：房含*/
		PARA_PACKAGE("PARA_PACKAGE"),
		/**11：房含分组*/
		PARA_PACKAGE_GROUP("PARA_PACKAGE_GROUP"),
		/**12：房型*/
		PARA_ROOMTYPE("PARA_ROOMTYPE"),
		/**13：交易代码*/
		PARA_TRNCODE("PARA_TRNCODE"),
		/**14：部门*/
		PARA_DEPT("PARA_DEPT"),
		/**15：职员*/
		PARA_EMP("PARA_EMP"),
		/**16：职员角色*/
		PARA_ROLE("PARA_ROLE"),
		/**17：销售员*/
		PARA_SALER("PARA_SALER"),
		/**18：操作员*/
		PARA_USER("PARA_USER"),
		/**19：房号*/
		PARA_ROOMNUM("PARA_ROOMNUM"),
		/**20：房价*/
		PARA_RATE("PARA_RATE"),
		/**20：房价*/
		PARA_BASE_RATE("PARA_BASE_RATE"),
		/**21：协议单位*/
		PARA_CORP("PARA_CORP"),
		/**22：权限*/
		PARA_PERMS("PARA_PERMS"),
		/**30：餐饮：销售点*/
		PARA_POS_SALES("PARA_POS_SALES"),
		/**31：餐饮：统计大类*/
		PARA_POS_STATSTYP_BIG("PARA_POS_STATSTYP_BIG"),
		/**32：餐饮：统计小类*/
		PARA_POS_STATSTYP_SMALL("PARA_POS_STATSTYP_SMALL"),
		/**33：餐饮：菜品*/
		PARA_POS_MENU("PARA_POS_MENU"),
		/**34:商品设置*/
		PARA_GOODS("PARA_GOODS"),
		/**35:消费品配置*/
		PARA_PRODUCT("PARA_PRODUCT"),
		/**36:酒店字典*/
		PARA_UNIT("PARA_UNIT"),
		/**37:班次*/
		PARA_TURN("PARA_TURN"),
		/**38:会员渠道信息*/
		PARA_CHANNEL("PARA_CHANNEL"),
		/**39:会员等级*/
		PARA_MEMBERRANK("PARA_MEMBERRANK"),
		/**40:会员卡类型*/
		PARA_MCARDTYPE("PARA_MCARDTYPE"),
		/**41:会员卡等级*/
		PARA_MCARDRANK("PARA_MCARDRANK"),
		/**42:优惠策略*/
		PARA_FAVOURPOLICY("PARA_FAVOURPOLICY"),
		/**43:积分累计策略*/
		PARA_POINTPOLICY("PARA_POINTPOLICY"),
		/**44:充值收费策略*/
		PARA_CHARGEPOLICY("PARA_CHARGEPOLICY"),
		/**45:升降级策略*/
		PARA_UPGRADEPOLICY("PARA_UPGRADEPOLICY"),
		/**46:商城商品*/
		PARA_SHOPGOODS("PARA_SHOPGOODS"),
		/**47:策略条件*/
		PARA_LPS_SET_POLICY_CONDITION("PARA_LPS_SET_POLICY_CONDITION"),
		/**48:媒体文件*/
		PARA_MEDIAFILE("PARA_MEDIAFILE"),
		/**99：税率*/
		TAX_NEW("TAX_NEW"),
		/**默认：空*/
		DEFAULT("");

		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_PARA_TYPE(String value) {
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
			for (ENUM_PARA_TYPE PARA : ENUM_PARA_TYPE.values()) {
				if (PARA.getValue().equals(value)) {
					flg = true;
					break;
				}
			}
			return flg;
		}
	}
	
	public static final String CTRL = "_CTRL";
	/**
	 * 共同参数：语言
	 */
	public static final String LANGUAGE = "LANGUAGE";
	/**
	 * 共同参数：国家
	 */
	public static final String COUNTRY = "COUNTRY";
	/**
	 * 共同参数：省
	 */
	public static final String PROVINCE = "PROVINCE";
	/**
	 * 共同参数：市
	 */
	public static final String CITY = "CITY";
	/**
	 * 共同参数：地区
	 */
	public static final String DISTRICT = "DISTRICT";
	/**
	 * 共同参数：民族
	 */
	public static final String NATION = "NATION";
	/**
	 * 共同参数：籍贯
	 */
	public static final String BIRTHPLACE = "BIRTHPLACE";
	/**
	 * 共同参数：职业
	 */
	public static final String OCCUPATION = "OCCUPATION";
	/**
	 * 共同参数：职位
	 */
	public static final String POSITION = "POSITION";
	/**
	 * 共同参数：教育程度
	 */
	public static final String EDUCATION = "EDUCATION";
	/**
	 * 共同参数：证件类型
	 */
	public static final String CERTIFICATETYP = "CERTIFICATETYP";
	/**
	 * 共同参数：行业
	 */
	public static final String INDUSTRY = "INDUSTRY";
	/**
	 * 共同参数：币种
	 */
	public static final String CURRENCY = "CURRENCY";
	/**
	 * 共同参数：接口类型
	 */
	public static final String IFTYPE = "IFTYPE";
	/**
	 * 共同参数：接口子类型
	 */
	public static final String IFSUBTYPE = "IFSUBTYPE";
	/**
	 * 共同参数：接口厂商
	 */
	public static final String IFMANUFACTURER = "IFMANUFACTURER";
	/**
	 * 共同参数：接口品牌
	 */
	public static final String IFBRAND = "IFBRAND";
	/**
	 * 共同参数：switch订单类型
	 */
	public static final String SWITCHORDERTYPE = "SWITCHORDERTYPE";
	/**
	 * 共同参数：系统定义分销渠道
	 */
	public static final String SYSCHANNEL = "SYSCHANNEL";
	/**
	 * 共同参数：授信机构
	 */
	public static final String CREDITINST = "CREDITINST";
	/**
	 * 集团酒店参数：VIP等级
	 */
	public static final String VIP = "VIP";
	/**
	 * 集团酒店参数：职务
	 */
	public static final String WORKTITLE = "WORKTITLE";
	/**
	 * 集团酒店参数：销售点类型
	 */
	public static final String POSTYP = "POSTYP";
	/**
	 * 集团酒店参数：市场分组
	 */
	public static final String MARKETGRP = "MARKETGRP";
	/**
	 * 集团酒店参数：市场
	 */
	public static final String MARKET = "MARKET";
	/**
	 * 集团酒店参数：客源
	 */
	public static final String SOURCE = "SOURCE";
	/**
	 * 集团酒店参数：客源分组
	 */
	public static final String SOURCEGRP = "SOURCEGRP";
	/**
	 * 集团酒店参数：部门类型
	 */
	public static final String DEPTTYP = "DEPTTYP";
	/**
	 * 平台参数参数：报表分组
	 */
	public static final String REPORTGROUP = "REPORTGROUP";
	/**
	 * 平台参数参数：参数类型分组
	 */
	public static final String PARAMTYPGRP = "PARAMTYPGRP";
	/**
	 * 平台参数参数：产品版式
	 */
	public static final String RPTPATTERN = "RPTPATTERN";
	/**
	 * 集团酒店参数：称谓
	 */
	public static final String TITLE = "TITLE";
	/**
	 * 集团酒店参数：品牌
	 */
	public static final String BRAND = "BRAND";
	/**
	 * 集团酒店参数：星级
	 */
	public static final String STAR = "STAR";
	/**
	 * 集团酒店参数：职能区域
	 */
	public static final String REGION = "REGION";
	/**
	 * 集团酒店参数：价格分组
	 */
	public static final String RATEGRP = "RATEGRP";
	/**
	 * 集团酒店参数：价格子分组
	 */
	public static final String RATESUBGRP = "RATESUBGRP";
	/**
	 * 集团酒店参数：价格分段
	 */
	public static final String TIER = "TIER";
	/**
	 * 集团酒店参数：床型
	 */
	public static final String BEDTYP = "BEDTYP";
	/**
	 * 集团酒店参数：房型分类
	 */
	public static final String ROOMTYPGRP = "ROOMTYPGRP";
	/**
	 * 集团酒店参数：房间特点分类
	 */
	public static final String ROOMFEATURETYP = "ROOMFEATURETYP";
	/**
	 * 集团酒店参数：楼座
	 */
	public static final String BUILDING = "BUILDING";
	/**
	 * 集团酒店参数：楼区
	 */
	public static final String AREA = "AREA";
	/**
	 * 集团酒店参数：楼层
	 */
	public static final String FLOOR = "FLOOR";
	/**
	 * 集团酒店参数：客房保留类型
	 */
	public static final String HOLDTYP = "HOLDTYP";
	/**
	 * 集团酒店参数：清扫分区
	 */
	public static final String HKSECTION = "HKSECTION";
	/**
	 * 集团酒店参数：晚间清扫分区
	 */
	public static final String HKEVENINGSECTION = "HKEVENINGSECTION";
	/**
	 * 集团酒店参数：维修房原因
	 */
	public static final String REPIARRSN = "REPIARRSN";
	/**
	 * 集团酒店参数：预订类型
	 */
	public static final String RESVTYP = "RESVTYP";
	/**
	 * 集团酒店参数：销售类型
	 */
	public static final String SALESPHASE = "SALESPHASE";
	/**
	 * 集团酒店参数：里程卡类型
	 */
	public static final String FFPTYP = "FFPTYP";
	/**
	 * 集团酒店参数：订单支付方式
	 */
	public static final String PAYMENTMETHOD = "PAYMENTMETHOD";
	/**
	 * 集团酒店参数：扩展统计代码1
	 */
	public static final String STATTYP1 = "STATTYP1";
	/**
	 * 集团酒店参数：扩展统计代码2
	 */
	public static final String STATTYP2 = "STATTYP2";
	/**
	 * 集团酒店参数：扩展统计代码3
	 */
	public static final String STATTYP3 = "STATTYP3";
	/**
	 * 集团酒店参数：扩展统计代码4
	 */
	public static final String STATTYP4 = "STATTYP4";
	/**
	 * 集团酒店参数：扩展统计代码5
	 */
	public static final String STATTYP5 = "STATTYP5";
	/**
	 * 集团酒店参数：扩展统计代码6
	 */
	public static final String STATTYP6 = "STATTYP6";
	/**
	 * 集团酒店参数：扩展统计代码7
	 */
	public static final String STATTYP7 = "STATTYP7";
	/**
	 * 集团酒店参数：扩展统计代码8
	 */
	public static final String STATTYP8 = "STATTYP8";
	/**
	 * 集团酒店参数：扩展统计代码9
	 */
	public static final String STATTYP9 = "STATTYP9";
	/**
	 * 集团酒店参数：扩展统计代码10
	 */
	public static final String STATTYP10 = "STATTYP10";
	/**
	 * 集团酒店参数：预登记卡format
	 */
	public static final String PRRGFMT = "PRRGFMT";
	/**
	 * 集团酒店参数：登记卡format
	 */
	public static final String REGICARDFMT = "REGICARDFMT";
	/**
	 * 集团酒店参数：确认信format
	 */
	public static final String CFMLETTERFMT = "CFMLETTERFMT";
	/**
	 * 集团酒店参数：订单取消原因
	 */
	public static final String CANCELRSN = "CANCELRSN";
	/**
	 * 集团酒店参数：签证类型
	 */
	public static final String VISATYP = "VISATYP";
	/**
	 * 集团酒店参数：签发机构
	 */
	public static final String VISAOFFICE = "VISAOFFICE";
	/**
	 * 集团酒店参数：佣金代码
	 */
	public static final String COMM = "COMM";
	/**
	 * 集团酒店参数：服务费率代码
	 */
	public static final String SVCTYP = "SVCTYP";
	/**
	 * 集团酒店参数：税率代码
	 */
	public static final String TAXRATE = "TAXRATE";
	/**
	 * 集团酒店参数：税率1代码
	 */
	public static final String TAX1 = "TAX1";
	/**
	 * 集团酒店参数：税率2代码
	 */
	public static final String TAX2 = "TAX2";
	/**
	 * 集团酒店参数：税率3代码
	 */
	public static final String TAX3 = "TAX3";
	/**
	 * 集团酒店参数：税率4代码
	 */
	public static final String TAX4 = "TAX4";
	/**
	 * 集团酒店参数：税率5代码
	 */
	public static final String TAX5 = "TAX5";
	/**
	 * 集团酒店参数：税率1代码
	 */
	public static final String TAX1_NEW = "TAX1_NEW";
	/**
	 * 集团酒店参数：税率2代码
	 */
	public static final String TAX2_NEW = "TAX2_NEW";
	/**
	 * 集团酒店参数：税率3代码
	 */
	public static final String TAX3_NEW = "TAX3_NEW";
	/**
	 * 集团酒店参数：税率4代码
	 */
	public static final String TAX4_NEW = "TAX4_NEW";
	/**
	 * 集团酒店参数：税率5代码
	 */
	public static final String TAX5_NEW = "TAX5_NEW";
	/**
	 * 集团酒店参数：信用卡类型
	 */
	public static final String CCARDTYP = "CCARDTYP";
	/**
	 * 集团酒店参数：联系方式
	 */
	public static final String CONTACTTYP = "CONTACTTYP";
	/**
	 * 集团酒店参数：黑名单撤销原因
	 */
	public static final String BLKLSTCXLRSN = "BLKLSTCXLRSN";
	/**
	 * 集团酒店参数：黑名单类型
	 */
	public static final String BLKLSTTYP = "BLKLSTTYP";
	/**
	 * 集团酒店参数：个人客户分类
	 */
	public static final String PRFCLS = "PRFCLS";
	/**
	 * 集团酒店参数：个人客户子分类
	 */
	public static final String PRFSUBCLS = "PRFSUBCLS";
	/**
	 * 集团酒店参数：客史备注
	 */
	public static final String PRFNOTICE = "PRFNOTICE";
	/**
	 * 集团酒店参数：法人客户类型
	 */
	public static final String CORPTYP = "CORPTYP";
	/**
	 * 集团酒店参数：管理单位公司类型
	 */
	public static final String CORPCLS = "CORPCLS";
	/**
	 * 集团酒店参数：管理单位公司子类型
	 */
	public static final String CORPSUBCLS = "CORPSUBCLS";
	/**
	 * 集团酒店参数：法人客户级别
	 */
	public static final String CORPRANK = "CORPRANK";
	/**
	 * 集团酒店参数：法人分组
	 */
	public static final String CORPGRP = "CORPGRP";
	/**
	 * 集团酒店参数：付款方式
	 */
	public static final String PAYMENT = "PAYMENT";
	/**
	 * 集团酒店参数：合同类型
	 */
	public static final String CONTRACTTYP = "CONTRACTTYP";
	/**
	 * 集团酒店参数：合同作废原因
	 */
	public static final String INVALIDRSN = "INVALIDRSN";
	/**
	 * 集团酒店参数：会员入会方式
	 */
	public static final String JOINTYP = "JOINTYP";
	/**
	 * 集团酒店参数：会员类型
	 */
	public static final String MEMBERTYP = "MEMBERTYP";
	/**
	 * 集团酒店参数：会员退会原因
	 */
	public static final String QUITREASON = "QUITREASON";
	/**
	 * 集团酒店参数：应收账户类型
	 */
	public static final String ARTYPE = "ARTYPE";
	/**
	 * 预定账户类型
	 */
	public static final String ACCTTYP="RSV_ACCOUNT.ACCT_TYP";
	/**
	 * 集团酒店参数：应收付款周期
	 */
	public static final String ARPAYCYCLE = "ARPAYCYCLE";
	/**
	 * 集团酒店参数：应收对账周期
	 */
	public static final String ARSTATCYCLE = "ARSTATCYCLE";
	/**
	 * 集团酒店参数：商城商品大类
	 */
	public static final String SHOPGOODSCLS = "SHOPGOODSCLS";
	/**
	 * 集团酒店参数：了解途径
	 */
	public static final String GETWAY = "GETWAY";
	/**
	 * 集团酒店参数：商城商品小类
	 */
	public static final String SHOPGOODSSUBCLS = "SHOPGOODSSUBCLS";
	/**
	 * 集团酒店参数：开票项目类型
	 */
	public static final String FINVCCHARGEITEM = "FINVCCHARGEITEM";
	/**
	 * 餐饮参数：账单类型
	 */
	public static final String BILLTYP = "BILLTYP";
	/**
	 * 餐饮参数：内部招待类型
	 */
	public static final String INSIDETYP = "INSIDETYP";
	/**
	 * 餐饮参数：餐饮事由
	 */
	public static final String POSCAUSE = "POSCAUSE";
	/**
	 * 餐饮参数：桌台类型
	 */
	public static final String BLOCKTYP = "BLOCKTYP";
	/**
	 * 餐饮参数：显示区域
	 */
	public static final String DISPLAYAREA = "DISPLAYAREA";
	/**
	 * 餐饮参数：打印区域
	 */
	public static final String PRINTAREA = "PRINTAREA";
	/**
	 * 餐饮参数：服务费区域
	 */
	public static final String SERVICEAREA = "SERVICEAREA";
	/**
	 * 餐饮参数：最低消费区域
	 */
	public static final String MINIMUMAREA = "MINIMUMAREA";
	/**
	 * 餐饮参数：销售点分组
	 */
	public static final String SALESGROUP = "SALESGROUP";
	/**
	 * 餐饮参数：出品部门
	 */
	public static final String PRODUCEDEPT = "PRODUCEDEPT";
	/**
	 * 餐饮参数：财务科目
	 */
	public static final String FINANCE = "FINANCE";
	/**
	 * 餐饮参数：菜品规格
	 */
	public static final String MENUSPEC = "MENUSPEC";
	/**
	 * 餐饮参数：账单备注
	 */
	public static final String BILLMEMO = "BILLMEMO";
	/** 消费点*/
	public static final String PRODUCT = "PRODUCT";
	/** 商品*/
	public static final String GOODS = "GOODS";
	
	/**
     * 预授权类型, PAU:新建预授权;ACP:预授权完成;AXL:预授权撤销
     */
    public static final String CARDTRNTYP = "FIN_CARDTRAN.CARDTRNTYP";
    /** 
     * 预授权状态, 1:正常;2:完成;3:取消
     */
    public static final String CARDTRNSTUS = "FIN_CARDTRAN.CARDTRNSTUS";
    /** 
     * 预授权方式, MM:手工处理;MC:会员卡;INF:接口
     */
    public static final String CARDTRNSRC = "FIN_CARDTRAN.CARDTRNSRC";
	
	
	// region 餐饮开关

	/**
	 * 餐饮开关：服务费率取销售点
	 */
	public static final String POSSERVICETAX = "POSSERVICETAX";
	/**
	 * 餐饮开关：税金收取方式开关，默认1
	 */
	public static final String POSTAXCHARGEFLG = "POSTAXCHARGEFLG";
	/**
	 * 餐饮开关：点菜单默认模板
	 */
	public static final String POSDEFAULTDISHTEMP = "3310-011-001";   
	/**
	 * 餐饮开关：传菜单默认模板
	 */
	public static final String POSDEFAULTTRANSFERTEMP = "3310-011-002"; 
	/**
	 * 餐饮开关：改菜单默认模板
	 */
	public static final String POSDEFAULTCHANGEMENUTEMP = "3310-011-003"; 
	/**
	 * 餐饮开关：换台默认模板
	 */
	public static final String POSDEFAULTCHANGEBLOCKTEMP = "3310-011-004";  
	/**
	 * 餐饮开关：改单默认模板
	 */
	public static final String POSDEFAULTCHANGEBILLTEMP = "3310-011-005"; 
	/**
	 * 餐饮开关：催菜默认模版
	 */
	public static final String POSDEFAULTURGETEMP = "3310-011-006"; 
	/**
     * 餐饮开关：等叫默认模板
     */
    public static final String POSDEFAULTWAITBILLTEMP = "3310-011-007"; 
    /**
     * 餐饮开关：叫起默认模版
     */
    public static final String POSDEFAULTWAKEUPBILLTEMP = "3310-011-008"; 
	
    public static final String CARD_HIDDEN_RULES = "3130-010-001";
	// endregion

	/**
	 * 集团酒店参数：换房原因
	 */
	public static final String RMCHANGERSN = "RMCHANGERSN";
	/**
	 * 集团酒店参数：折扣原因
	 */
	public static final String RATERSN = "RATERSN";
	/**
	 * 集团酒店参数：渠道
	 */
	public static final String CHANNEL = "CHANNEL";
	/**
	 * 集团酒店参数：应收账户状态原因
	 */
	public static final String ARFLGRSN = "ARFLGRSN";
	/**
	 * 集团酒店参数：税种名称
	 */
	public static final String TAXTYPE = "TAXTYPE";
	/**
	 * 集团酒店参数：价格大分类
	 */
	public static final String RATETYP = "RATETYP";
	/**
	 * 集团酒店参数：入住取消原因
	 */
	public static final String CANCELCIRSN = "CANCELCIRSN";
	/**
	 * 集团酒店参数：加收房费
	 */
	public static final String EXTRAROOMRATE = "EXTRAROOMRATE";
	/**
	 * 集团酒店参数：商品大类
	 */
	public static final String GOODSCLS = "GOODSCLS";
	/**
	 * 集团酒店参数：商品小类
	 */
	public static final String GOODSSUBCLS = "GOODSSUBCLS";
	/**
	 * 集团酒店参数：商品单位
	 */
	public static final String GOODSUNIT = "GOODSUNIT";
	/**
	 * 集团酒店参数：产品类别
	 */
	public static final String PRODUCTCLS = "PRODUCTCLS";
	/**
	 * 集团酒店参数：产品单位
	 */
	public static final String PRODUCTUNIT = "PRODUCTUNIT";
	/**
	 * 集团酒店参数：会员发行信息
	 */
	public static final String MEMBERISSUREINFO = "MEMBERISSUREINFO";
	/**
	 * 集团酒店参数：会员使用信息
	 */
	public static final String MEMBERUSEINFO = "MEMBERUSEINFO";
	/**
	 * 集团酒店参数：团队类型
	 */
	public static final String GROUPTYP = "GROUPTYP";
	/**
	 * 集团酒店参数：显示项目主题
	 */
	public static final String DISPITEMTHEME = "DISPITEMTHEME";
	/**
	 * 系统参数：创建来源类型
	 */
	public static final String CREATETYPE = "CREATETYPE";
	/**
	 * 系统参数：男女
	 */
	public static final String GENDER = "GENDER";
	/**
	 * 系统参数：是否
	 */
	public static final String YES_OR_NO = "YES_OR_NO";
	/**
	 * 系统参数：预定状态
	 */
	public static final String ACCT_STUS = "ACCT_STUS";
	/**
	 * 系统参数：报表甩宾客类型
	 */
	public static final String RPT_GUEST_STUS = "RPT_GUEST_STUS";
	/**
	 * 系统参数：入账代码类型
	 */
	public static final String TRANCODETYPE = "TRANCODETYPE";
	/**
	 * 系统参数：入账代码类型
	 */
	public static final String GRP_FIN_BASE_TRNCODE_TRN_TYP = "GRP_FIN_BASE_TRNCODE.TRN_TYP";
	/**
	 * 系统参数：媒体类型
	 */
	public static final String MEDIATYP = "MEDIATYP";
	/**
	 * 系统参数：应收状态
	 */
	public static final String GRP_AR_ACCOUNT_AR_STUS = "GRP_AR_ACCOUNT.AR_STUS";
	/**
	 * 房含
	 */
	public static final String PARA_PACKAGE = "PARA_PACKAGE";
	/**
	 * 房含分组
	 */
	public static final String PARA_PACKAGE_GROUP = "PARA_PACKAGE_GROUP";
	/**
	 * 财务日常操作审核报表项目
	 */
	public static final String REPORTITEMNM = "REPORTITEMNM";
	/**
	 * 房型
	 */
	public static final String PARA_ROOMTYPE = "PARA_ROOMTYPE";
	/**
	 * 交易代码
	 */
	public static final String PARA_TRNCODE = "PARA_TRNCODE";
	/**
	 * 部门
	 */
	public static final String PARA_DEPT = "PARA_DEPT";
	/**
	 * 职员
	 */
	public static final String PARA_EMP = "PARA_EMP";
	/**
	 * 职员角色
	 */
	public static final String PARA_ROLE = "PARA_ROLE";
	/**
	 * 销售员
	 */
	public static final String PARA_SALER = "PARA_SALER";
	/**
	 * 操作员
	 */
	public static final String PARA_USER = "PARA_USER";
	/**
	 * 房价
	 */
	public static final String PARA_RATE = "PARA_RATE";
	/**
	 * 协议单位
	 */
	public static final String PARA_CORP = "PARA_CORP";
	/**
	 * 权限
	 */
	public static final String PARA_PERMS = "PARA_PERMS";
	/**
	 * 餐饮：销售点
	 */
	public static final String PARA_POS_SALES = "PARA_POS_SALES";
	/**
	 * 餐饮：统计大类
	 */
	public static final String PARA_POS_STATSTYP_BIG = "PARA_POS_STATSTYP_BIG";
	/**
	 * 餐饮：统计小类
	 */
	public static final String PARA_POS_STATSTYP_SMALL = "PARA_POS_STATSTYP_SMALL";
	/**
	 * 餐饮：菜品
	 */
	public static final String PARA_POS_MENU = "PARA_POS_MENU";
	/**
	 * 商品设置
	 */
	public static final String PARA_GOODS = "PARA_GOODS";
	/**
	 * 消费品配置
	 */
	public static final String PARA_PRODUCT = "PARA_PRODUCT";
	/**
	 * 酒店字典
	 */
	public static final String PARA_UNIT = "PARA_UNIT";
	/**
	 * 班次
	 */
	public static final String PARA_TURN = "PARA_TURN";
	/**
	 * 会员渠道信息
	 */
	public static final String PARA_CHANNEL = "PARA_CHANNEL";
	/**
	 * 会员等级
	 */
	public static final String PARA_MEMBERRANK = "PARA_MEMBERRANK";
	/**
	 * 会员卡类型
	 */
	public static final String PARA_MCARDTYPE = "PARA_MCARDTYPE";
	/**
	 * 会员卡等级
	 */
	public static final String PARA_MCARDRANK = "PARA_MCARDRANK";
	
	/**
	 * 升降级/保级策略(策略属性)
	 */
	public static final String LPS_SET_UPGRADEPOLICY_UPGRADEPOLICY_FLG = "LPS_SET_UPGRADEPOLICY.UPGRADEPOLICY_FLG";
	/**
	 * 升降级/保级策略-验证方式
	 */
	public static final String LPS_SET_POLICY_CONDITION_OPERATOR_TYP = "LPS_SET_POLICY_CONDITION.OPERATOR_TYP";
	/**
	 * 升降级/保级策略-条件
	 */
	public static final String LPS_SET_POLICY_CONDITION_UPDATEPOLICY_POLICYCONDITION_TYP = "LPS_SET_POLICY_CONDITION.UPDATEPOLICY.POLICYCONDITION_TYP";
	/**
	 * 升降级/保级策略-条件-限制条件
	 */
	public static final String LPS_SET_POLICY_CONDITION_UPDATEPOLICYLIMIT_POLICYCONDITION_TYP = "LPS_SET_POLICY_CONDITION.UPDATEPOLICYLIMIT.POLICYCONDITION_TYP";
	/**
	 * 升降级/保级策略-条件-限制条件-是否本人入住标识
	 */
	
	public static final String LPS_SET_POLICY_CONDITION_UPDATEPOLICYLIMIT_POLICYCONDITION_TYP_OWNSELF_MARK = "LPS_SET_POLICY_CONDITION.UPDATEPOLICYLIMIT.POLICYCONDITION_TYP.OWNSELF_MARK";
	/** 职员角色*/
	public static final String EMPLROLE = "EMPLROLE";
	
	/** POS接口配置-销售点标识 */
	public static final String POSIFCONFIG = "POSIFCONFIG";
	
	/** 销售员分组ID*/
	public static final String SALERGRP = "SALERGRP";
	
	/** 入账代码分组*/
	public static final String TRNCLS = "TRNCLS";
	
	/** 入账代码子分组*/
	public static final String TRNSUBCLS = "TRNSUBCLS";
	/** 入住取消原因 **/
	public static final String REINSTATERSN = "REINSTATERSN";
	/** 策略条件 **/
	public static final String POLICYCONDITION = "POLICYCONDITION";
	/** 系统假房默认定义 **/
	public static final String SYSPSEUDOROOM = "SYSPSEUDOROOM";
	/** 假房标志 **/
	public static final String RSVACCOUNTPSEUDOFLG  = "RSV_ACCOUNT.PSEUDO_FLG";
	/**
	 * 媒体文件
	 */
	public static final String PARA_MEDIAFILE = "PARA_MEDIAFILE";
	/** 酒店标签**/
	public static final String UNITTAG = "UNITTAG";
	/** 房型标签**/
	public static final String RMTYPTAG = "RMTYPTAG";
	/** 图片分组**/
	public static final String UNITPICGRP = "UNITPICGRP";
	/** 酒店扩展属性类型**/
	public static final String UNITPROP = "UNITPROP";
	/** 酒店扩展属性值**/
	public static final String UNITPROPVLU = "UNITPROPVLU";
	/** 房型扩展属性类型**/
	public static final String RMTYPPROP = "RMTYPPROP";
	/** 房型扩展属性值**/
	public static final String RMTYPPROPVLU = "RMTYPPROPVLU";
	
	
	/**
	 * P：主表取值、A：固定配置取值，J自定义json数据
	 */
	public static enum ENUM_DATAPICK_PARAM {
		/**P：主表取值 */
		PARAM("P"),
		/**A：固定配置取值 */
		OPTION("A"),
		/** J自定义json数据 */
		JSON("J");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_DATAPICK_PARAM(String value) {
			this._value = value;
		}
	}
	
	/**
	 * P:配置主表;O:开关表;S:专有配置
	 */
	public static enum ENUM_SETTING_TYP {
		/**P:配置主表 */
		PARAM("P"),
		/**O:开关表 */
		OPTION("O"),
		/** S:专有配置 */
		S("S");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_SETTING_TYP(String value) {
			this._value = value;
		}
	}

	/**
	 * 参数配置类型	
	 * 	1：集团 
		4：集团+单体
		9：单店 +集团+单体
	 */
	public static enum ENUM_PARAMSETTING_TYP {
		/** 999：系统。试图进行修改时，需要报错 **/
		SYSTEM("999"),
		/**1：集团 */
		GROUP("1"),
		/**4：集团+单体 */
		GROUP_MONOMER("4"),
		/**9：单店 +集团+单体 */
		HOTEL_GROUP_MONOMER("9");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PARAMSETTING_TYP(String value) {
			this._value = value;
		}
	}
	
	// 操作表标识（防止集团/酒店分开操作） 0 集团 1 单体 2单店
	public static enum ENUM_PARAM_OPERA_FLG {
		/** 0集团 **/
		GROUP("0"),
		/** 1 单体 **/
		MONOMER("1"),
		/** 2单店 **/
		HOTEL("2");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PARAM_OPERA_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * ## 类说明：参数配置类型
	 * 	描述
	 * @author    [tianpei]   
	 * @version   [V1.0, 2018年4月27日]
	 * @package com.jw.base.framework.core
	 * @since
	日期|作者|类型|内容
	:----|:-----|:-----|:-----
	2018年4月27日|tianpei|新增|ConstantParm.java新增
	 */
	public static enum ENUM_PARAM_TYP {
		/** 1集团 **/
		GROUP("1"),
		/** 2单店 **/
		HOTEL("2"),
		/** 3 单体 **/
		MONOMER("3"),
		/** 4 集团+单店 **/
		GROUP_HOTEL("4"),
		/** 5单体+单店 **/
		MONOMER_HOTEL("5"),
		/** 6集团+单体 **/
		GROUP_MONOMER("6"),
		/** 7集团+单体+单店 **/
		GROUP_HOTEL_MONOMER("7");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PARAM_TYP(String value) {
			this._value = value;
		}
	}
	/**
	 * 单位属性类型	
	 * 	0：集团 
		1：门店
		CTL：管控分组
	 */
	public static enum ENUM_PARAM_CTRL_UNIT_FLG {
		/** 0集团 **/
		CHAIN("0"),
		/** 1 酒店 **/
		HOTEL("1"),
		/** CTL 管控分组 **/
		CTRL_UNIT("CTL");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PARAM_CTRL_UNIT_FLG(String value) {
			this._value = value;
		}
	}
	/** 支付类型 **/
	public static final String EASYTRIPCHNLINFO_TYP  = "EASYTRIP.CHNLINFO_TYP";
	public static final String EASYTRIPCHNLINFO_STUS  = "EASYTRIP.CHNLINFO_STUS";
	
	/** 参数独享标记 0：非独享，1：独享，Null：非独享**/
	public static enum ENUM_EXCLUSIVE_FLG {
		YES("1"), NO("0");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_EXCLUSIVE_FLG(String value) {
			this._value = value;
		}
	}
}
