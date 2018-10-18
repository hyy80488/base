package com.jw.base.framework.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constant3130010 {
	/**trn_typ唯一的入账代码*/
	public static final String[] TRN_TYP_ONLY = { "500", "588", "589", "591", "592", "593", "809", "910", "911", "991", "993", "994", "995", "996", "997", "998" };

	/** 入账代码类型  1，前台入账类型   5：应收类型*/
	public static final String[] TRN_TYP_15 = { "100", "109", "500", "588", "589", "590", "591", "592", "593", "860", "904", "910", "911", "931", "932", "935", "936", "950", "990", "991", "993", "994", "995", "996", "997", "998" };

	/** 入账代码类型  2，结账类 */
	public static final String[] TRN_TYP_2 = { "100", "101", "109", "280", "290", "300", "350", "370", "500", "588", "589", "590", "591", "592", "593", "931", "932", "935", "936", "950", "990", "991", "993", "994", "995", "996", "997", "998" };

	/** 入账代码类型   3，押金类型  4：定金类型*/
	public static final String[] TRN_TYP_34 = { "100", "101", "109", "280", "290", "300", "350", "370", "500", "588", "589", "590", "591", "592", "593", "860", "910", "911", "991", "993", "994", "995", "996", "997", "998" };

	/** 入账代码类型   6、加收 小于500的费用类型*/
	public static final String[] TRN_TYP_6 = { "100", "101", "109", "140", "280", "290", "300", "350", "370", "380", "450", "460", "461" };

	/** 入账代码类型   7、房含使用 小于500的部分费用类型*/
	public static final String[] TRN_TYP_7 = { "109", "140", "300", "350", "380", "550", "560", "570", "571", "572", "588", "589", "590", "591", "592", "593" };

	/**费用入账代码 D*/
	public static final String[] TRN_TYP_DEBIT = { "100", "101", "109", "140", "280", "290", "300", "350", "370", "380", "450", "460", "461" };
	/**费用入账代码 D 包含系统使用*/
	public static final String[] TRN_TYP_DEBIT_CONTAINSYS = { "100", "101", "109", "140", "280", "290", "300", "350", "370", "380", "450", "460", "461", "550", "560", "570", "571", "572", "5	88", "589", "590", "591", "592", "593" };

	/**付款入账代码 C*/
	public static final String[] TRN_TYP_CREDIT = { "800", "809", "810", "820", "821", "850", "860", "861", "862", "890", "899" };
	/**付款入账代码 C 包含系统使用*/
	public static final String[] TRN_TYP_CREDIT_CONTAINSYS = { "800", "809", "810", "820", "821", "850", "860", "861", "862", "890", "899", "904", "910", "911", "912", "931", "932", "935", "936", "940", "941", "942", "950", "990", "991", "993", "994", "995", "996" };

	public static Map<String, String> funCodeMap = new HashMap<>();
	public static Map<String, String> logCodeMap = new HashMap<>();
	public static Map<String, String> funCodeCtlMap = new HashMap<>();
	public static Map<String, String> logCodeCtlMap = new HashMap<>();
	public static final String SHOW = "SHOW";
	public static final String DELETE = "DELETE";
	public static final String UPDATE = "UPDATE";
	public static final String ENABLE = "ENABLE";
	public static final String TAKEOVER = "TAKEOVER";
	public static final String DISTRIBUTE = "DISTRIBUTE";
	
	//RMS
	public static final Integer RMSIFSVCVERID = 1100011;
	public static final String RMSKEY = "jointwisdom";
    
    static {
		//-----------------------------桌台类型--------------------------------------
		funCodeMap.put(ConstantParm.BLOCKTYP, FunConstant.FUN_33200011);
		funCodeMap.put(ConstantParm.BLOCKTYP + UPDATE, FunConstant.FUN_33200011);
//		funCodeMap.put(ConstantParm.BLOCKTYP + SHOW, FunConstant.FUN_32804002);
		funCodeMap.put(ConstantParm.BLOCKTYP + DELETE, FunConstant.FUN_33200012);

		logCodeMap.put(ConstantParm.BLOCKTYP, LogConstant.LOG_33200013);
//		logCodeMap.put(ConstantParm.BLOCKTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.BLOCKTYP + UPDATE, LogConstant.LOG_33200014);
		logCodeMap.put(ConstantParm.BLOCKTYP + DELETE, LogConstant.LOG_33200015);
		//-----------------------------显示区域--------------------------------------
		funCodeMap.put(ConstantParm.DISPLAYAREA, FunConstant.FUN_33200014);
		funCodeMap.put(ConstantParm.DISPLAYAREA + UPDATE, FunConstant.FUN_33200014);
		funCodeMap.put(ConstantParm.DISPLAYAREA + DELETE, FunConstant.FUN_33200015);	
		
		logCodeMap.put(ConstantParm.DISPLAYAREA, LogConstant.LOG_33200016);
		logCodeMap.put(ConstantParm.DISPLAYAREA + UPDATE, LogConstant.LOG_33200017);
		logCodeMap.put(ConstantParm.DISPLAYAREA + DELETE, LogConstant.LOG_33200018);
		//-----------------------------打印区域--------------------------------------
		funCodeMap.put(ConstantParm.PRINTAREA, FunConstant.FUN_33200017);
		funCodeMap.put(ConstantParm.PRINTAREA + UPDATE, FunConstant.FUN_33200017);
		funCodeMap.put(ConstantParm.PRINTAREA + DELETE, FunConstant.FUN_33200018);
		
		logCodeMap.put(ConstantParm.PRINTAREA, LogConstant.LOG_33200019);
		logCodeMap.put(ConstantParm.PRINTAREA + UPDATE, LogConstant.LOG_33200020);
		logCodeMap.put(ConstantParm.PRINTAREA + DELETE, LogConstant.LOG_33200021);
		//-----------------------------菜品规格--------------------------------------
		funCodeMap.put(ConstantParm.MENUSPEC, FunConstant.FUN_33200042);
		funCodeMap.put(ConstantParm.MENUSPEC + UPDATE, FunConstant.FUN_33200042);
		funCodeMap.put(ConstantParm.MENUSPEC + DELETE, FunConstant.FUN_33200043);
		
		logCodeMap.put(ConstantParm.MENUSPEC, LogConstant.LOG_33200046);
		logCodeMap.put(ConstantParm.MENUSPEC + UPDATE, LogConstant.LOG_33200047);
		logCodeMap.put(ConstantParm.MENUSPEC + DELETE, LogConstant.LOG_33200048);
		//-----------------------------餐饮事由--------------------------------------
		funCodeMap.put(ConstantParm.POSCAUSE, FunConstant.FUN_33200045);
		funCodeMap.put(ConstantParm.POSCAUSE + UPDATE, FunConstant.FUN_33200045);
		funCodeMap.put(ConstantParm.POSCAUSE + DELETE, FunConstant.FUN_33200046);
		
		logCodeMap.put(ConstantParm.POSCAUSE, LogConstant.LOG_33200049);
		logCodeMap.put(ConstantParm.POSCAUSE + UPDATE, LogConstant.LOG_33200050);
		logCodeMap.put(ConstantParm.POSCAUSE + DELETE, LogConstant.LOG_33200051);
		//-----------------------------账单类型--------------------------------------
		funCodeMap.put(ConstantParm.BILLTYP, FunConstant.FUN_33200048);
		funCodeMap.put(ConstantParm.BILLTYP + UPDATE, FunConstant.FUN_33200048);
		funCodeMap.put(ConstantParm.BILLTYP + DELETE, FunConstant.FUN_33200049);
		
		logCodeMap.put(ConstantParm.BILLTYP, LogConstant.LOG_33200052);
		logCodeMap.put(ConstantParm.BILLTYP + UPDATE, LogConstant.LOG_33200053);
		logCodeMap.put(ConstantParm.BILLTYP + DELETE, LogConstant.LOG_33200054);
		//-----------------------------销售点分组--------------------------------------
		funCodeMap.put(ConstantParm.SALESGROUP, FunConstant.FUN_33200051);
		funCodeMap.put(ConstantParm.SALESGROUP + UPDATE, FunConstant.FUN_33200051);
		funCodeMap.put(ConstantParm.SALESGROUP + DELETE, FunConstant.FUN_33200052);
		
		logCodeMap.put(ConstantParm.SALESGROUP, LogConstant.LOG_33200055);
		logCodeMap.put(ConstantParm.SALESGROUP + UPDATE, LogConstant.LOG_33200056);
		logCodeMap.put(ConstantParm.SALESGROUP + DELETE, LogConstant.LOG_33200057);
		//-----------------------------财务科目--------------------------------------
		funCodeMap.put(ConstantParm.FINANCE, FunConstant.FUN_33200054);
		funCodeMap.put(ConstantParm.FINANCE + UPDATE, FunConstant.FUN_33200054);
		funCodeMap.put(ConstantParm.FINANCE + DELETE, FunConstant.FUN_33200055);
		
		logCodeMap.put(ConstantParm.FINANCE, LogConstant.LOG_33200058);
		logCodeMap.put(ConstantParm.FINANCE + UPDATE, LogConstant.LOG_33200059);
		logCodeMap.put(ConstantParm.FINANCE + DELETE, LogConstant.LOG_33200060);
		//-----------------------------账单备注--------------------------------------
		funCodeMap.put(ConstantParm.BILLMEMO, FunConstant.FUN_33200057);
		funCodeMap.put(ConstantParm.BILLMEMO + UPDATE, FunConstant.FUN_33200057);
		funCodeMap.put(ConstantParm.BILLMEMO + DELETE, FunConstant.FUN_33200058);
		
		logCodeMap.put(ConstantParm.BILLMEMO, LogConstant.LOG_33200061);
		logCodeMap.put(ConstantParm.BILLMEMO + UPDATE, LogConstant.LOG_33200062);
		logCodeMap.put(ConstantParm.BILLMEMO + DELETE, LogConstant.LOG_33200063);
		
		//-----------------------------登记卡--------------------------------------
		funCodeMap.put(ConstantParm.REGICARDFMT, FunConstant.FUN_32804001);
		funCodeMap.put(ConstantParm.REGICARDFMT + SHOW, FunConstant.FUN_32804002);
		funCodeMap.put(ConstantParm.REGICARDFMT + DELETE, FunConstant.FUN_32804003);
		funCodeMap.put(ConstantParm.REGICARDFMT + ENABLE, FunConstant.FUN_32804003);

		logCodeMap.put(ConstantParm.REGICARDFMT, LogConstant.LOG_328040040);
		logCodeMap.put(ConstantParm.REGICARDFMT + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.REGICARDFMT + DELETE, LogConstant.LOG_328040060);
		logCodeMap.put(ConstantParm.REGICARDFMT + ENABLE, LogConstant.LOG_328040060);

		//-----------------------------确认信--------------------------------------
		funCodeMap.put(ConstantParm.CFMLETTERFMT, FunConstant.FUN_32804004);
		funCodeMap.put(ConstantParm.CFMLETTERFMT + SHOW, FunConstant.FUN_32804005);
		funCodeMap.put(ConstantParm.CFMLETTERFMT + DELETE, FunConstant.FUN_32804006);
		funCodeMap.put(ConstantParm.CFMLETTERFMT + ENABLE, FunConstant.FUN_32804006);

		logCodeMap.put(ConstantParm.CFMLETTERFMT, LogConstant.LOG_328040070);
		logCodeMap.put(ConstantParm.CFMLETTERFMT + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CFMLETTERFMT + DELETE, LogConstant.LOG_328040090);
		logCodeMap.put(ConstantParm.CFMLETTERFMT + ENABLE, LogConstant.LOG_328040090);

		//-----------------------------预定取消原因---------------------------------
		funCodeMap.put(ConstantParm.CANCELRSN, FunConstant.FUN_32804010);
		funCodeMap.put(ConstantParm.CANCELRSN + SHOW, FunConstant.FUN_32804011);
		funCodeMap.put(ConstantParm.CANCELRSN + DELETE, FunConstant.FUN_32804012);
		funCodeMap.put(ConstantParm.CANCELRSN + ENABLE, FunConstant.FUN_32804012);

		logCodeMap.put(ConstantParm.CANCELRSN, LogConstant.LOG_328040100);
		logCodeMap.put(ConstantParm.CANCELRSN + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CANCELRSN + DELETE, LogConstant.LOG_328040120);
		logCodeMap.put(ConstantParm.CANCELRSN + ENABLE, LogConstant.LOG_328040121);

		//-----------------------------折扣原因-------------------------------------
		funCodeMap.put(ConstantParm.RATERSN, FunConstant.FUN_32804013);
		funCodeMap.put(ConstantParm.RATERSN + SHOW, FunConstant.FUN_32804014);
		funCodeMap.put(ConstantParm.RATERSN + DELETE, FunConstant.FUN_32804015);
		funCodeMap.put(ConstantParm.RATERSN + ENABLE, FunConstant.FUN_32804015);

		logCodeMap.put(ConstantParm.RATERSN, LogConstant.LOG_328040130);
		logCodeMap.put(ConstantParm.RATERSN + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.RATERSN + DELETE, LogConstant.LOG_328040150);
		logCodeMap.put(ConstantParm.RATERSN + ENABLE, LogConstant.LOG_328040151);

		//-----------------------------换房原因-------------------------------------
		funCodeMap.put(ConstantParm.RMCHANGERSN, FunConstant.FUN_32803028);
		funCodeMap.put(ConstantParm.RMCHANGERSN + SHOW, FunConstant.FUN_32803029);
		funCodeMap.put(ConstantParm.RMCHANGERSN + DELETE, FunConstant.FUN_32803030);
		funCodeMap.put(ConstantParm.RMCHANGERSN + ENABLE, FunConstant.FUN_32803030);

		logCodeMap.put(ConstantParm.RMCHANGERSN, LogConstant.LOG_328030280);
		logCodeMap.put(ConstantParm.RMCHANGERSN + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.RMCHANGERSN + DELETE, LogConstant.LOG_328030300);
		logCodeMap.put(ConstantParm.RMCHANGERSN + ENABLE, LogConstant.LOG_328030301);

		//-----------------------------价格分组-------------------------------------
		funCodeMap.put(ConstantParm.RATEGRP, FunConstant.FUN_32802001);
		funCodeMap.put(ConstantParm.RATEGRP + SHOW, FunConstant.FUN_32802002);
		funCodeMap.put(ConstantParm.RATEGRP + DELETE, FunConstant.FUN_32802003);
		funCodeMap.put(ConstantParm.RATEGRP + ENABLE, FunConstant.FUN_32802003);

		logCodeMap.put(ConstantParm.RATEGRP, LogConstant.LOG_328020010);
		logCodeMap.put(ConstantParm.RATEGRP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.RATEGRP + DELETE, LogConstant.LOG_328020030);
		logCodeMap.put(ConstantParm.RATEGRP + ENABLE, LogConstant.LOG_328020031);

		//-----------------------------价格子分组-----------------------------------
		funCodeMap.put(ConstantParm.RATESUBGRP, FunConstant.FUN_32802004);
		funCodeMap.put(ConstantParm.RATESUBGRP + SHOW, FunConstant.FUN_32802005);
		funCodeMap.put(ConstantParm.RATESUBGRP + DELETE, FunConstant.FUN_32802006);
		funCodeMap.put(ConstantParm.RATESUBGRP + ENABLE, FunConstant.FUN_32802006);

		logCodeMap.put(ConstantParm.RATESUBGRP, LogConstant.LOG_328020040);
		logCodeMap.put(ConstantParm.RATESUBGRP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.RATESUBGRP + DELETE, LogConstant.LOG_328020060);
		logCodeMap.put(ConstantParm.RATESUBGRP + ENABLE, LogConstant.LOG_328020061);

		//-----------------------------房型分组------------------------------------
		funCodeMap.put(ConstantParm.ROOMTYPGRP, FunConstant.FUN_32803001);
		funCodeMap.put(ConstantParm.ROOMTYPGRP + SHOW, FunConstant.FUN_32803002);
		funCodeMap.put(ConstantParm.ROOMTYPGRP + DELETE, FunConstant.FUN_32803003);
		funCodeMap.put(ConstantParm.ROOMTYPGRP + ENABLE, FunConstant.FUN_32803003);

		logCodeMap.put(ConstantParm.ROOMTYPGRP, LogConstant.LOG_328030010);
		logCodeMap.put(ConstantParm.ROOMTYPGRP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.ROOMTYPGRP + DELETE, LogConstant.LOG_328030030);
		logCodeMap.put(ConstantParm.ROOMTYPGRP + ENABLE, LogConstant.LOG_328030031);

		//-----------------------------楼座---------------------------------------
		funCodeMap.put(ConstantParm.BUILDING, FunConstant.FUN_32803010);
		funCodeMap.put(ConstantParm.BUILDING + SHOW, FunConstant.FUN_32803011);
		funCodeMap.put(ConstantParm.BUILDING + DELETE, FunConstant.FUN_32803012);
		funCodeMap.put(ConstantParm.BUILDING + ENABLE, FunConstant.FUN_32803012);

		logCodeMap.put(ConstantParm.BUILDING, LogConstant.LOG_328030100);
		logCodeMap.put(ConstantParm.BUILDING + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.BUILDING + DELETE, LogConstant.LOG_328030120);
		logCodeMap.put(ConstantParm.BUILDING + ENABLE, LogConstant.LOG_328030121);

		//-----------------------------楼区---------------------------------------
		funCodeMap.put(ConstantParm.AREA, FunConstant.FUN_32803013);
		funCodeMap.put(ConstantParm.AREA + SHOW, FunConstant.FUN_32803014);
		funCodeMap.put(ConstantParm.AREA + DELETE, FunConstant.FUN_32803015);
		funCodeMap.put(ConstantParm.AREA + ENABLE, FunConstant.FUN_32803015);

		logCodeMap.put(ConstantParm.AREA, LogConstant.LOG_328030130);
		logCodeMap.put(ConstantParm.AREA + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.AREA + DELETE, LogConstant.LOG_328030150);
		logCodeMap.put(ConstantParm.AREA + ENABLE, LogConstant.LOG_328030151);

		//-----------------------------楼层--------------------------------------
		funCodeMap.put(ConstantParm.FLOOR, FunConstant.FUN_32803016);
		funCodeMap.put(ConstantParm.FLOOR + SHOW, FunConstant.FUN_32803017);
		funCodeMap.put(ConstantParm.FLOOR + DELETE, FunConstant.FUN_32803018);
		funCodeMap.put(ConstantParm.FLOOR + ENABLE, FunConstant.FUN_32803018);

		logCodeMap.put(ConstantParm.FLOOR, LogConstant.LOG_328030160);
		logCodeMap.put(ConstantParm.FLOOR + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.FLOOR + DELETE, LogConstant.LOG_328030180);
		logCodeMap.put(ConstantParm.FLOOR + ENABLE, LogConstant.LOG_328030181);

		//-----------------------------床型--------------------------------------
		funCodeMap.put(ConstantParm.BEDTYP, FunConstant.FUN_32803019);
		funCodeMap.put(ConstantParm.BEDTYP + SHOW, FunConstant.FUN_32803020);
		funCodeMap.put(ConstantParm.BEDTYP + DELETE, FunConstant.FUN_32803021);
		funCodeMap.put(ConstantParm.BEDTYP + ENABLE, FunConstant.FUN_32803021);

		logCodeMap.put(ConstantParm.BEDTYP, LogConstant.LOG_328030190);
		logCodeMap.put(ConstantParm.BEDTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.BEDTYP + DELETE, LogConstant.LOG_328030210);
		logCodeMap.put(ConstantParm.BEDTYP + ENABLE, LogConstant.LOG_328030211);

		//-----------------------------维修房原因------------------------------------
		funCodeMap.put(ConstantParm.REPIARRSN, FunConstant.FUN_32803022);
		funCodeMap.put(ConstantParm.REPIARRSN + SHOW, FunConstant.FUN_32803023);
		funCodeMap.put(ConstantParm.REPIARRSN + DELETE, FunConstant.FUN_32803024);
		funCodeMap.put(ConstantParm.REPIARRSN + ENABLE, FunConstant.FUN_32803024);

		logCodeMap.put(ConstantParm.REPIARRSN, LogConstant.LOG_328030220);
		logCodeMap.put(ConstantParm.REPIARRSN + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.REPIARRSN + DELETE, LogConstant.LOG_328030240);
		logCodeMap.put(ConstantParm.REPIARRSN + ENABLE, LogConstant.LOG_328030241);

		//-----------------------------房间特点--------------------------------------
		funCodeMap.put(ConstantParm.ROOMFEATURETYP, FunConstant.FUN_32803025);
		funCodeMap.put(ConstantParm.ROOMFEATURETYP + SHOW, FunConstant.FUN_32803026);
		funCodeMap.put(ConstantParm.ROOMFEATURETYP + DELETE, FunConstant.FUN_32803027);
		funCodeMap.put(ConstantParm.ROOMFEATURETYP + ENABLE, FunConstant.FUN_32803027);

		logCodeMap.put(ConstantParm.ROOMFEATURETYP, LogConstant.LOG_328030250);
		logCodeMap.put(ConstantParm.ROOMFEATURETYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.ROOMFEATURETYP + DELETE, LogConstant.LOG_328030270);
		logCodeMap.put(ConstantParm.ROOMFEATURETYP + ENABLE, LogConstant.LOG_328030271);

		//-----------------------------入账代码分组--------------------------------------
		funCodeMap.put(ConstantParm.TRNCLS, FunConstant.FUN_32805001);
		funCodeMap.put(ConstantParm.TRNCLS + SHOW, FunConstant.FUN_32805002);
		funCodeMap.put(ConstantParm.TRNCLS + DELETE, FunConstant.FUN_32805003);
		funCodeMap.put(ConstantParm.TRNCLS + ENABLE, FunConstant.FUN_32805003);

		logCodeMap.put(ConstantParm.TRNCLS, LogConstant.LOG_328050010);
		logCodeMap.put(ConstantParm.TRNCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.TRNCLS + DELETE, LogConstant.LOG_328050030);
		logCodeMap.put(ConstantParm.TRNCLS + ENABLE, LogConstant.LOG_328050031);

		//-----------------------------入账代码子分组--------------------------------------
		funCodeMap.put(ConstantParm.TRNSUBCLS, FunConstant.FUN_32805004);
		funCodeMap.put(ConstantParm.TRNSUBCLS + SHOW, FunConstant.FUN_32805005);
		funCodeMap.put(ConstantParm.TRNSUBCLS + DELETE, FunConstant.FUN_32805006);
		funCodeMap.put(ConstantParm.TRNSUBCLS + ENABLE, FunConstant.FUN_32805006);

		logCodeMap.put(ConstantParm.TRNSUBCLS, LogConstant.LOG_328050040);
		logCodeMap.put(ConstantParm.TRNSUBCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.TRNSUBCLS + DELETE, LogConstant.LOG_328050060);
		logCodeMap.put(ConstantParm.TRNSUBCLS + ENABLE, LogConstant.LOG_328050061);

		//-----------------------------服务费率--------------------------------------
		funCodeMap.put(ConstantParm.SVCTYP, FunConstant.FUN_32805010);
		funCodeMap.put(ConstantParm.SVCTYP + SHOW, FunConstant.FUN_32805011);
		funCodeMap.put(ConstantParm.SVCTYP + DELETE, FunConstant.FUN_32805012);
		funCodeMap.put(ConstantParm.SVCTYP + ENABLE, FunConstant.FUN_32805012);

		logCodeMap.put(ConstantParm.SVCTYP, LogConstant.LOG_328050100);
		logCodeMap.put(ConstantParm.SVCTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.SVCTYP + DELETE, LogConstant.LOG_328050120);
		logCodeMap.put(ConstantParm.SVCTYP + ENABLE, LogConstant.LOG_328050121);

		//-----------------------------银行卡类型--------------------------------------
		funCodeMap.put(ConstantParm.CCARDTYP, FunConstant.FUN_32805016);
		funCodeMap.put(ConstantParm.CCARDTYP + SHOW, FunConstant.FUN_32805017);
		funCodeMap.put(ConstantParm.CCARDTYP + DELETE, FunConstant.FUN_32805018);
		funCodeMap.put(ConstantParm.CCARDTYP + ENABLE, FunConstant.FUN_32805018);

		logCodeMap.put(ConstantParm.CCARDTYP, LogConstant.LOG_328050160);
		logCodeMap.put(ConstantParm.CCARDTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CCARDTYP + DELETE, LogConstant.LOG_328050180);
		logCodeMap.put(ConstantParm.CCARDTYP + ENABLE, LogConstant.LOG_328050181);

		//-----------------------------市场分组--------------------------------------
		funCodeMap.put(ConstantParm.MARKETGRP, FunConstant.FUN_32804016);
		funCodeMap.put(ConstantParm.MARKETGRP + SHOW, FunConstant.FUN_32804017);
		funCodeMap.put(ConstantParm.MARKETGRP + DELETE, FunConstant.FUN_32804018);
		funCodeMap.put(ConstantParm.MARKETGRP + ENABLE, FunConstant.FUN_32804018);

		logCodeMap.put(ConstantParm.MARKETGRP, LogConstant.LOG_328040160);
		logCodeMap.put(ConstantParm.MARKETGRP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.MARKETGRP + DELETE, LogConstant.LOG_328040180);
		logCodeMap.put(ConstantParm.MARKETGRP + ENABLE, LogConstant.LOG_328040181);

		//-----------------------------市场--------------------------------------
		funCodeMap.put(ConstantParm.MARKET, FunConstant.FUN_32804019);
		funCodeMap.put(ConstantParm.MARKET + SHOW, FunConstant.FUN_32804020);
		funCodeMap.put(ConstantParm.MARKET + DELETE, FunConstant.FUN_32804021);
		funCodeMap.put(ConstantParm.MARKET + ENABLE, FunConstant.FUN_32804021);

		logCodeMap.put(ConstantParm.MARKET, LogConstant.LOG_328040190);
		logCodeMap.put(ConstantParm.MARKET + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.MARKET + DELETE, LogConstant.LOG_328040210);
		logCodeMap.put(ConstantParm.MARKET + ENABLE, LogConstant.LOG_328040211);

		//-----------------------------客源分组--------------------------------------
		funCodeMap.put(ConstantParm.SOURCEGRP, FunConstant.FUN_32804022);
		funCodeMap.put(ConstantParm.SOURCEGRP + SHOW, FunConstant.FUN_32804023);
		funCodeMap.put(ConstantParm.SOURCEGRP + DELETE, FunConstant.FUN_32804024);
		funCodeMap.put(ConstantParm.SOURCEGRP + ENABLE, FunConstant.FUN_32804024);

		logCodeMap.put(ConstantParm.SOURCEGRP, LogConstant.LOG_328040220);
		logCodeMap.put(ConstantParm.SOURCEGRP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.SOURCEGRP + DELETE, LogConstant.LOG_328040240);

		//-----------------------------客源--------------------------------------
		funCodeMap.put(ConstantParm.SOURCE, FunConstant.FUN_32804025);
		funCodeMap.put(ConstantParm.SOURCE + SHOW, FunConstant.FUN_32804026);
		funCodeMap.put(ConstantParm.SOURCE + DELETE, FunConstant.FUN_32804027);
		funCodeMap.put(ConstantParm.SOURCE + ENABLE, FunConstant.FUN_32804027);

		logCodeMap.put(ConstantParm.SOURCE, LogConstant.LOG_328040250);
		logCodeMap.put(ConstantParm.SOURCE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.SOURCE + DELETE, LogConstant.LOG_328040270);

		//-----------------------------职务--------------------------------------
		funCodeMap.put(ConstantParm.WORKTITLE, FunConstant.FUN_32800004);
		funCodeMap.put(ConstantParm.WORKTITLE + SHOW, FunConstant.FUN_32800005);
		funCodeMap.put(ConstantParm.WORKTITLE + DELETE, FunConstant.FUN_32800006);
		funCodeMap.put(ConstantParm.WORKTITLE + ENABLE, FunConstant.FUN_32800006);

		logCodeMap.put(ConstantParm.WORKTITLE, LogConstant.LOG_328000040);
		logCodeMap.put(ConstantParm.WORKTITLE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.WORKTITLE + DELETE, LogConstant.LOG_328000060);
		logCodeMap.put(ConstantParm.WORKTITLE + ENABLE, LogConstant.LOG_328000061);

		//-----------------------------职员角色--------------------------------------
		funCodeMap.put(ConstantParm.EMPLROLE, FunConstant.FUN_32800010);
		funCodeMap.put(ConstantParm.EMPLROLE + SHOW, FunConstant.FUN_32800011);
		funCodeMap.put(ConstantParm.EMPLROLE + DELETE, FunConstant.FUN_32800012);
		funCodeMap.put(ConstantParm.EMPLROLE + ENABLE, FunConstant.FUN_32800012);

		logCodeMap.put(ConstantParm.EMPLROLE, LogConstant.LOG_328000100);
		logCodeMap.put(ConstantParm.EMPLROLE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.EMPLROLE + DELETE, LogConstant.LOG_328000120);
		logCodeMap.put(ConstantParm.EMPLROLE + ENABLE, LogConstant.LOG_328000121);

		//-----------------------------销售员分组--------------------------------------
		funCodeMap.put(ConstantParm.SALERGRP, FunConstant.FUN_32800013);
		funCodeMap.put(ConstantParm.SALERGRP + SHOW, FunConstant.FUN_32800014);
		funCodeMap.put(ConstantParm.SALERGRP + DELETE, FunConstant.FUN_32800015);
		funCodeMap.put(ConstantParm.SALERGRP + ENABLE, FunConstant.FUN_32800015);

		logCodeMap.put(ConstantParm.SALERGRP, LogConstant.LOG_328000130);
		logCodeMap.put(ConstantParm.SALERGRP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.SALERGRP + DELETE, LogConstant.LOG_328000150);
		logCodeMap.put(ConstantParm.SALERGRP + ENABLE, LogConstant.LOG_328000151);

		//-----------------------------VIP--------------------------------------
		funCodeMap.put(ConstantParm.VIP, FunConstant.FUN_32806043);
		funCodeMap.put(ConstantParm.VIP + SHOW, FunConstant.FUN_32806044);
		funCodeMap.put(ConstantParm.VIP + DELETE, FunConstant.FUN_32806045);
		funCodeMap.put(ConstantParm.VIP + ENABLE, FunConstant.FUN_32806045);

		logCodeMap.put(ConstantParm.VIP, LogConstant.LOG_328060430);
		logCodeMap.put(ConstantParm.VIP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.VIP + DELETE, LogConstant.LOG_328060450);
		logCodeMap.put(ConstantParm.VIP + ENABLE, LogConstant.LOG_328060451);

		//-----------------------------协议客户分组--------------------------------------
		funCodeMap.put(ConstantParm.CORPGRP, FunConstant.FUN_32806034);
		funCodeMap.put(ConstantParm.CORPGRP + SHOW, FunConstant.FUN_32806035);
		funCodeMap.put(ConstantParm.CORPGRP + DELETE, FunConstant.FUN_32806036);
		funCodeMap.put(ConstantParm.CORPGRP + ENABLE, FunConstant.FUN_32806036);

		logCodeMap.put(ConstantParm.CORPGRP, LogConstant.LOG_328060340);
		logCodeMap.put(ConstantParm.CORPGRP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CORPGRP + DELETE, LogConstant.LOG_328060360);
		logCodeMap.put(ConstantParm.CORPGRP + ENABLE, LogConstant.LOG_328060361);

		//-----------------------------联系方式--------------------------------------
		funCodeMap.put(ConstantParm.CONTACTTYP, FunConstant.FUN_32806004);
		funCodeMap.put(ConstantParm.CONTACTTYP + SHOW, FunConstant.FUN_32806005);
		funCodeMap.put(ConstantParm.CONTACTTYP + DELETE, FunConstant.FUN_32806006);
		funCodeMap.put(ConstantParm.CONTACTTYP + ENABLE, FunConstant.FUN_32806006);

		logCodeMap.put(ConstantParm.CONTACTTYP, LogConstant.LOG_328060040);
		logCodeMap.put(ConstantParm.CONTACTTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CONTACTTYP + DELETE, LogConstant.LOG_328060060);
		logCodeMap.put(ConstantParm.CONTACTTYP + ENABLE, LogConstant.LOG_328060061);

		//-----------------------------黑名单撤销原因--------------------------------------
		funCodeMap.put(ConstantParm.BLKLSTCXLRSN, FunConstant.FUN_32806007);
		funCodeMap.put(ConstantParm.BLKLSTCXLRSN + SHOW, FunConstant.FUN_32806008);
		funCodeMap.put(ConstantParm.BLKLSTCXLRSN + DELETE, FunConstant.FUN_32806009);
		funCodeMap.put(ConstantParm.BLKLSTCXLRSN + ENABLE, FunConstant.FUN_32806009);

		logCodeMap.put(ConstantParm.BLKLSTCXLRSN, LogConstant.LOG_328060070);
		logCodeMap.put(ConstantParm.BLKLSTCXLRSN + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.BLKLSTCXLRSN + DELETE, LogConstant.LOG_328060090);
		logCodeMap.put(ConstantParm.BLKLSTCXLRSN + ENABLE, LogConstant.LOG_328060091);

		//-----------------------------黑名单类型--------------------------------------
		funCodeMap.put(ConstantParm.BLKLSTTYP, FunConstant.FUN_32806010);
		funCodeMap.put(ConstantParm.BLKLSTTYP + SHOW, FunConstant.FUN_32806011);
		funCodeMap.put(ConstantParm.BLKLSTTYP + DELETE, FunConstant.FUN_32806012);
		funCodeMap.put(ConstantParm.BLKLSTTYP + ENABLE, FunConstant.FUN_32806012);

		logCodeMap.put(ConstantParm.BLKLSTTYP, LogConstant.LOG_328060100);
		logCodeMap.put(ConstantParm.BLKLSTTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.BLKLSTTYP + DELETE, LogConstant.LOG_328060120);
		logCodeMap.put(ConstantParm.BLKLSTTYP + ENABLE, LogConstant.LOG_328060121);

		//-----------------------------客史分类--------------------------------------
		funCodeMap.put(ConstantParm.PRFCLS, FunConstant.FUN_32806025);
		funCodeMap.put(ConstantParm.PRFCLS + SHOW, FunConstant.FUN_32806026);
		funCodeMap.put(ConstantParm.PRFCLS + DELETE, FunConstant.FUN_32806027);
		funCodeMap.put(ConstantParm.PRFCLS + ENABLE, FunConstant.FUN_32806027);

		logCodeMap.put(ConstantParm.PRFCLS, LogConstant.LOG_328060250);
		logCodeMap.put(ConstantParm.PRFCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.PRFCLS + DELETE, LogConstant.LOG_328060270);
		logCodeMap.put(ConstantParm.PRFCLS + ENABLE, LogConstant.LOG_328060271);

		//-----------------------------客史子分类--------------------------------------
		funCodeMap.put(ConstantParm.PRFSUBCLS, FunConstant.FUN_32806028);
		funCodeMap.put(ConstantParm.PRFSUBCLS + SHOW, FunConstant.FUN_32806029);
		funCodeMap.put(ConstantParm.PRFSUBCLS + DELETE, FunConstant.FUN_32806030);
		funCodeMap.put(ConstantParm.PRFSUBCLS + ENABLE, FunConstant.FUN_32806031);

		logCodeMap.put(ConstantParm.PRFSUBCLS, LogConstant.LOG_328060280);
		logCodeMap.put(ConstantParm.PRFSUBCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.PRFSUBCLS + DELETE, LogConstant.LOG_328060300);
		logCodeMap.put(ConstantParm.PRFSUBCLS + ENABLE, LogConstant.LOG_328060301);

		//-----------------------------备注模板--------------------------------------
		funCodeMap.put(ConstantParm.PRFNOTICE, FunConstant.FUN_32806019);
		funCodeMap.put(ConstantParm.PRFNOTICE + SHOW, FunConstant.FUN_32806020);
		funCodeMap.put(ConstantParm.PRFNOTICE + DELETE, FunConstant.FUN_32806021);
		funCodeMap.put(ConstantParm.PRFNOTICE + ENABLE, FunConstant.FUN_32806021);

		logCodeMap.put(ConstantParm.PRFNOTICE, LogConstant.LOG_328060190);
		logCodeMap.put(ConstantParm.PRFNOTICE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.PRFNOTICE + DELETE, LogConstant.LOG_328060210);
		logCodeMap.put(ConstantParm.PRFNOTICE + ENABLE, LogConstant.LOG_328060211);

		//-----------------------------协议客户类型--------------------------------------
		funCodeMap.put(ConstantParm.CORPTYP, FunConstant.FUN_32806022);
		funCodeMap.put(ConstantParm.CORPTYP + SHOW, FunConstant.FUN_32806023);
		funCodeMap.put(ConstantParm.CORPTYP + DELETE, FunConstant.FUN_32806024);
		funCodeMap.put(ConstantParm.CORPTYP + ENABLE, FunConstant.FUN_32806024);

		logCodeMap.put(ConstantParm.CORPTYP, LogConstant.LOG_328060220);
		logCodeMap.put(ConstantParm.CORPTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CORPTYP + DELETE, LogConstant.LOG_328060240);
		logCodeMap.put(ConstantParm.CORPTYP + ENABLE, LogConstant.LOG_328060241);

		//-----------------------------协议客户分类--------------------------------------
		funCodeMap.put(ConstantParm.CORPCLS, FunConstant.FUN_32806025);
		funCodeMap.put(ConstantParm.CORPCLS + SHOW, FunConstant.FUN_32806026);
		funCodeMap.put(ConstantParm.CORPCLS + DELETE, FunConstant.FUN_32806027);
		funCodeMap.put(ConstantParm.CORPCLS + ENABLE, FunConstant.FUN_32806027);

		logCodeMap.put(ConstantParm.CORPCLS, LogConstant.LOG_328060250);
		logCodeMap.put(ConstantParm.CORPCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CORPCLS + DELETE, LogConstant.LOG_328060270);
		logCodeMap.put(ConstantParm.CORPCLS + ENABLE, LogConstant.LOG_328060271);

		//-----------------------------协议客户子分类--------------------------------------
		funCodeMap.put(ConstantParm.CORPSUBCLS, FunConstant.FUN_32806028);
		funCodeMap.put(ConstantParm.CORPSUBCLS + SHOW, FunConstant.FUN_32806029);
		funCodeMap.put(ConstantParm.CORPSUBCLS + DELETE, FunConstant.FUN_32806030);
		funCodeMap.put(ConstantParm.CORPSUBCLS + ENABLE, FunConstant.FUN_32806030);

		logCodeMap.put(ConstantParm.CORPSUBCLS, LogConstant.LOG_328060280);
		logCodeMap.put(ConstantParm.CORPSUBCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CORPSUBCLS + DELETE, LogConstant.LOG_328060300);
		logCodeMap.put(ConstantParm.CORPSUBCLS + ENABLE, LogConstant.LOG_328060301);

		//-----------------------------协议客户级别--------------------------------------
		funCodeMap.put(ConstantParm.CORPRANK, FunConstant.FUN_32806031);
		funCodeMap.put(ConstantParm.CORPRANK + SHOW, FunConstant.FUN_32806032);
		funCodeMap.put(ConstantParm.CORPRANK + DELETE, FunConstant.FUN_32806033);
		funCodeMap.put(ConstantParm.CORPRANK + ENABLE, FunConstant.FUN_32806033);

		logCodeMap.put(ConstantParm.CORPRANK, LogConstant.LOG_328060310);
		logCodeMap.put(ConstantParm.CORPRANK + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CORPRANK + DELETE, LogConstant.LOG_328060330);
		logCodeMap.put(ConstantParm.CORPRANK + ENABLE, LogConstant.LOG_328060331);

		//-----------------------------协议客户分组--------------------------------------
		funCodeMap.put(ConstantParm.CORPGRP, FunConstant.FUN_32806034);
		funCodeMap.put(ConstantParm.CORPGRP + SHOW, FunConstant.FUN_32806035);
		funCodeMap.put(ConstantParm.CORPGRP + DELETE, FunConstant.FUN_32806036);
		funCodeMap.put(ConstantParm.CORPGRP + ENABLE, FunConstant.FUN_32806036);

		logCodeMap.put(ConstantParm.CORPGRP, LogConstant.LOG_328060340);
		logCodeMap.put(ConstantParm.CORPGRP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CORPGRP + DELETE, LogConstant.LOG_328060360);
		logCodeMap.put(ConstantParm.CORPGRP + ENABLE, LogConstant.LOG_328060361);

		//-----------------------------合同类型--------------------------------------
		funCodeMap.put(ConstantParm.CONTRACTTYP, FunConstant.FUN_32806037);
		funCodeMap.put(ConstantParm.CONTRACTTYP + SHOW, FunConstant.FUN_32806038);
		funCodeMap.put(ConstantParm.CONTRACTTYP + DELETE, FunConstant.FUN_32806039);
		funCodeMap.put(ConstantParm.CONTRACTTYP + ENABLE, FunConstant.FUN_32806039);

		logCodeMap.put(ConstantParm.CONTRACTTYP, LogConstant.LOG_328060370);
		logCodeMap.put(ConstantParm.CONTRACTTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.CONTRACTTYP + DELETE, LogConstant.LOG_328060390);
		logCodeMap.put(ConstantParm.CONTRACTTYP + ENABLE, LogConstant.LOG_328060391);

		//-----------------------------合同作废原因--------------------------------------
		funCodeMap.put(ConstantParm.INVALIDRSN, FunConstant.FUN_32806040);
		funCodeMap.put(ConstantParm.INVALIDRSN + SHOW, FunConstant.FUN_32806041);
		funCodeMap.put(ConstantParm.INVALIDRSN + DELETE, FunConstant.FUN_32806042);
		funCodeMap.put(ConstantParm.INVALIDRSN + ENABLE, FunConstant.FUN_32806042);

		logCodeMap.put(ConstantParm.INVALIDRSN, LogConstant.LOG_328060400);
		logCodeMap.put(ConstantParm.INVALIDRSN + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.INVALIDRSN + DELETE, LogConstant.LOG_328060420);
		logCodeMap.put(ConstantParm.INVALIDRSN + ENABLE, LogConstant.LOG_328060421);

		//-----------------------------入会途径--------------------------------------
		funCodeMap.put(ConstantParm.JOINTYP, FunConstant.FUN_32808001);
		funCodeMap.put(ConstantParm.JOINTYP + SHOW, FunConstant.FUN_32808002);
		funCodeMap.put(ConstantParm.JOINTYP + DELETE, FunConstant.FUN_32808003);
		funCodeMap.put(ConstantParm.JOINTYP + ENABLE, FunConstant.FUN_32808003);

		logCodeMap.put(ConstantParm.JOINTYP, LogConstant.LOG_328080010);
		logCodeMap.put(ConstantParm.JOINTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.JOINTYP + DELETE, LogConstant.LOG_328080030);
		logCodeMap.put(ConstantParm.JOINTYP + ENABLE, LogConstant.LOG_328080030);

		//-----------------------------会员类型--------------------------------------
		funCodeMap.put(ConstantParm.MEMBERTYP, FunConstant.FUN_32808004);
		funCodeMap.put(ConstantParm.MEMBERTYP + SHOW, FunConstant.FUN_32808005);
		funCodeMap.put(ConstantParm.MEMBERTYP + DELETE, FunConstant.FUN_32808006);
		funCodeMap.put(ConstantParm.MEMBERTYP + ENABLE, FunConstant.FUN_32808006);

		logCodeMap.put(ConstantParm.MEMBERTYP, LogConstant.LOG_328080040);
		logCodeMap.put(ConstantParm.MEMBERTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.MEMBERTYP + DELETE, LogConstant.LOG_328080060);
		logCodeMap.put(ConstantParm.MEMBERTYP + ENABLE, LogConstant.LOG_328080060);

		//-----------------------------退会原因--------------------------------------
		funCodeMap.put(ConstantParm.QUITREASON, FunConstant.FUN_32808007);
		funCodeMap.put(ConstantParm.QUITREASON + SHOW, FunConstant.FUN_32808008);
		funCodeMap.put(ConstantParm.QUITREASON + DELETE, FunConstant.FUN_32808009);
		funCodeMap.put(ConstantParm.QUITREASON + ENABLE, FunConstant.FUN_32808009);

		logCodeMap.put(ConstantParm.QUITREASON, LogConstant.LOG_328080070);
		logCodeMap.put(ConstantParm.QUITREASON + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.QUITREASON + DELETE, LogConstant.LOG_328080090);
		logCodeMap.put(ConstantParm.QUITREASON + ENABLE, LogConstant.LOG_328080090);
		
		//-----------------------------应收账户类型--------------------------------------
		funCodeMap.put(ConstantParm.ARTYPE, FunConstant.FUN_32805501);
		funCodeMap.put(ConstantParm.ARTYPE + SHOW, FunConstant.FUN_32805502);
		funCodeMap.put(ConstantParm.ARTYPE + DELETE, FunConstant.FUN_32805503);
		funCodeMap.put(ConstantParm.ARTYPE + ENABLE, FunConstant.FUN_32805503);
		
		logCodeMap.put(ConstantParm.ARTYPE, LogConstant.LOG_328055010);
		logCodeMap.put(ConstantParm.ARTYPE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.ARTYPE + DELETE, LogConstant.LOG_328055030);
		logCodeMap.put(ConstantParm.ARTYPE + ENABLE, LogConstant.LOG_328055031);
		
		//-----------------------------应收付款周期--------------------------------------
		funCodeMap.put(ConstantParm.ARPAYCYCLE, FunConstant.FUN_32805504);
		funCodeMap.put(ConstantParm.ARPAYCYCLE + SHOW, FunConstant.FUN_32805505);
		funCodeMap.put(ConstantParm.ARPAYCYCLE + DELETE, FunConstant.FUN_32805506);
		funCodeMap.put(ConstantParm.ARPAYCYCLE + ENABLE, FunConstant.FUN_32805506);
		
		logCodeMap.put(ConstantParm.ARPAYCYCLE, LogConstant.LOG_328055040);
		logCodeMap.put(ConstantParm.ARPAYCYCLE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.ARPAYCYCLE + DELETE, LogConstant.LOG_328055060);
		logCodeMap.put(ConstantParm.ARPAYCYCLE + ENABLE, LogConstant.LOG_328055061);
		
		//-----------------------------应收对账周期--------------------------------------
		funCodeMap.put(ConstantParm.ARSTATCYCLE, FunConstant.FUN_32805507);
		funCodeMap.put(ConstantParm.ARSTATCYCLE + SHOW, FunConstant.FUN_32805508);
		funCodeMap.put(ConstantParm.ARSTATCYCLE + DELETE, FunConstant.FUN_32805509);
		funCodeMap.put(ConstantParm.ARSTATCYCLE + ENABLE, FunConstant.FUN_32805509);
		
		logCodeMap.put(ConstantParm.ARSTATCYCLE, LogConstant.LOG_328055070);
		logCodeMap.put(ConstantParm.ARSTATCYCLE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.ARSTATCYCLE + DELETE, LogConstant.LOG_328055090);
		logCodeMap.put(ConstantParm.ARSTATCYCLE + ENABLE, LogConstant.LOG_328055091);
		
		//-----------------------------发票项目--------------------------------------
		funCodeMap.put(ConstantParm.FINVCCHARGEITEM, FunConstant.FUN_32805059);
		funCodeMap.put(ConstantParm.FINVCCHARGEITEM + SHOW, FunConstant.FUN_32805060);
		funCodeMap.put(ConstantParm.FINVCCHARGEITEM + DELETE, FunConstant.FUN_32805061);
		funCodeMap.put(ConstantParm.FINVCCHARGEITEM + ENABLE, FunConstant.FUN_32805061);
		
		logCodeMap.put(ConstantParm.FINVCCHARGEITEM, LogConstant.LOG_328050590);
		logCodeMap.put(ConstantParm.FINVCCHARGEITEM + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.FINVCCHARGEITEM + DELETE, LogConstant.LOG_328050610);
		logCodeMap.put(ConstantParm.FINVCCHARGEITEM + ENABLE, LogConstant.LOG_328050610);
		//-----------------------------商品单位--------------------------------------
		funCodeMap.put(ConstantParm.GOODSUNIT, FunConstant.FUN_32805028);
		funCodeMap.put(ConstantParm.GOODSUNIT + SHOW, FunConstant.FUN_32805029);
		funCodeMap.put(ConstantParm.GOODSUNIT + DELETE, FunConstant.FUN_32805030);
		funCodeMap.put(ConstantParm.GOODSUNIT + ENABLE, FunConstant.FUN_32805030);
		
		logCodeMap.put(ConstantParm.GOODSUNIT, LogConstant.LOG_328050280);
		logCodeMap.put(ConstantParm.GOODSUNIT + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.GOODSUNIT + DELETE, LogConstant.LOG_328050300);
		logCodeMap.put(ConstantParm.GOODSUNIT + ENABLE, LogConstant.LOG_328050301);
		//-----------------------------商品小类--------------------------------------
		funCodeMap.put(ConstantParm.GOODSSUBCLS, FunConstant.FUN_32805025);
		funCodeMap.put(ConstantParm.GOODSSUBCLS + SHOW, FunConstant.FUN_32805026);
		funCodeMap.put(ConstantParm.GOODSSUBCLS + DELETE, FunConstant.FUN_32805027);
		funCodeMap.put(ConstantParm.GOODSSUBCLS + ENABLE, FunConstant.FUN_32805027);
		
		logCodeMap.put(ConstantParm.GOODSSUBCLS, LogConstant.LOG_328050250);
		logCodeMap.put(ConstantParm.GOODSSUBCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.GOODSSUBCLS + DELETE, LogConstant.LOG_328050270);
		logCodeMap.put(ConstantParm.GOODSSUBCLS + ENABLE, LogConstant.LOG_328050271);
		//-----------------------------商品大类--------------------------------------
		funCodeMap.put(ConstantParm.GOODSCLS, FunConstant.FUN_32805022);
		funCodeMap.put(ConstantParm.GOODSCLS + SHOW, FunConstant.FUN_32805023);
		funCodeMap.put(ConstantParm.GOODSCLS + DELETE, FunConstant.FUN_32805024);
		funCodeMap.put(ConstantParm.GOODSCLS + ENABLE, FunConstant.FUN_32805024);
		
		logCodeMap.put(ConstantParm.GOODSCLS, LogConstant.LOG_328050220);
		logCodeMap.put(ConstantParm.GOODSCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.GOODSCLS + DELETE, LogConstant.LOG_328050240);
		logCodeMap.put(ConstantParm.GOODSCLS + ENABLE, LogConstant.LOG_328050241);
		//-----------------------------加收房费--------------------------------------
		funCodeMap.put(ConstantParm.EXTRAROOMRATE, FunConstant.FUN_32805037);
		funCodeMap.put(ConstantParm.EXTRAROOMRATE + SHOW, FunConstant.FUN_32805038);
		funCodeMap.put(ConstantParm.EXTRAROOMRATE + DELETE, FunConstant.FUN_32805039);
		funCodeMap.put(ConstantParm.EXTRAROOMRATE + ENABLE, FunConstant.FUN_32805039);
		
		logCodeMap.put(ConstantParm.EXTRAROOMRATE, LogConstant.LOG_328050370);
		logCodeMap.put(ConstantParm.EXTRAROOMRATE + SHOW, LogConstant.LOG_328050380);
		logCodeMap.put(ConstantParm.EXTRAROOMRATE + DELETE, LogConstant.LOG_328050390);
		logCodeMap.put(ConstantParm.EXTRAROOMRATE + ENABLE, LogConstant.LOG_328050391);
		//-----------------------------入住取消原因--------------------------------------
		funCodeMap.put(ConstantParm.REINSTATERSN, FunConstant.FUN_32804086);
		funCodeMap.put(ConstantParm.REINSTATERSN + SHOW, FunConstant.FUN_32804088);
		funCodeMap.put(ConstantParm.REINSTATERSN + DELETE, FunConstant.FUN_32804089);
		funCodeMap.put(ConstantParm.REINSTATERSN + ENABLE, FunConstant.FUN_32804089);
		
		logCodeMap.put(ConstantParm.REINSTATERSN, LogConstant.LOG_328040860);
		logCodeMap.put(ConstantParm.REINSTATERSN + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.REINSTATERSN + DELETE, LogConstant.LOG_328040890);
		logCodeMap.put(ConstantParm.REINSTATERSN + ENABLE, LogConstant.LOG_328040890);
		
		//-----------------------------部门类型--------------------------------------
		funCodeMap.put(ConstantParm.DEPTTYP, FunConstant.FUN_32800028);
		funCodeMap.put(ConstantParm.DEPTTYP + SHOW, FunConstant.FUN_32800029);
		funCodeMap.put(ConstantParm.DEPTTYP + DELETE, FunConstant.FUN_32800030);
		funCodeMap.put(ConstantParm.DEPTTYP + ENABLE, FunConstant.FUN_32800030);
		
		logCodeMap.put(ConstantParm.DEPTTYP, LogConstant.LOG_328000280);
		logCodeMap.put(ConstantParm.DEPTTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.DEPTTYP + DELETE, LogConstant.LOG_328000300);
		logCodeMap.put(ConstantParm.DEPTTYP + ENABLE, LogConstant.LOG_328000301);
		
		//-----------------------------称谓--------------------------------------
		funCodeMap.put(ConstantParm.TITLE, FunConstant.FUN_32806046);
		funCodeMap.put(ConstantParm.TITLE + SHOW, FunConstant.FUN_32806047);
		funCodeMap.put(ConstantParm.TITLE + DELETE, FunConstant.FUN_32806048);
		funCodeMap.put(ConstantParm.TITLE + ENABLE, FunConstant.FUN_32806048);
		
		logCodeMap.put(ConstantParm.TITLE, LogConstant.LOG_328060460);
		logCodeMap.put(ConstantParm.TITLE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.TITLE + DELETE, LogConstant.LOG_328060480);
		logCodeMap.put(ConstantParm.TITLE + ENABLE, LogConstant.LOG_328060481);
		
		//-----------------------------销售点类型--------------------------------------
		funCodeMap.put(ConstantParm.POSTYP, FunConstant.FUN_33200072);
		funCodeMap.put(ConstantParm.POSTYP + SHOW, FunConstant.FUN_33200071);
		funCodeMap.put(ConstantParm.POSTYP + DELETE, FunConstant.FUN_33200073);
		funCodeMap.put(ConstantParm.POSTYP + ENABLE, FunConstant.FUN_33200073);
		
		logCodeMap.put(ConstantParm.POSTYP, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.POSTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.POSTYP + DELETE, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.POSTYP + ENABLE, LogConstant.LOG_328000000);
		
		//-----------------------------商城商品大分类--------------------------------------
		funCodeMap.put(ConstantParm.SHOPGOODSCLS, FunConstant.FUN_32806546);
		funCodeMap.put(ConstantParm.SHOPGOODSCLS + SHOW, FunConstant.FUN_32806548);
		funCodeMap.put(ConstantParm.SHOPGOODSCLS + DELETE, FunConstant.FUN_32806549);
		funCodeMap.put(ConstantParm.SHOPGOODSCLS + ENABLE, FunConstant.FUN_32806549);
		
		logCodeMap.put(ConstantParm.SHOPGOODSCLS, LogConstant.LOG_328065460);
		logCodeMap.put(ConstantParm.SHOPGOODSCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.SHOPGOODSCLS + DELETE, LogConstant.LOG_328065490);
		logCodeMap.put(ConstantParm.SHOPGOODSCLS + ENABLE, LogConstant.LOG_328065491);
		
		//-----------------------------商城商品小分类--------------------------------------
		funCodeMap.put(ConstantParm.SHOPGOODSSUBCLS, FunConstant.FUN_32806550);
		funCodeMap.put(ConstantParm.SHOPGOODSSUBCLS + SHOW, FunConstant.FUN_32806552);
		funCodeMap.put(ConstantParm.SHOPGOODSSUBCLS + DELETE, FunConstant.FUN_32806553);
		funCodeMap.put(ConstantParm.SHOPGOODSSUBCLS + ENABLE, FunConstant.FUN_32806553);
		
		logCodeMap.put(ConstantParm.SHOPGOODSSUBCLS, LogConstant.LOG_328065500);
		logCodeMap.put(ConstantParm.SHOPGOODSSUBCLS + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.SHOPGOODSSUBCLS + DELETE, LogConstant.LOG_328065530);
		logCodeMap.put(ConstantParm.SHOPGOODSSUBCLS + ENABLE, LogConstant.LOG_328065531);
		
		//-----------------------------团队类型--------------------------------------
		funCodeMap.put(ConstantParm.GROUPTYP, FunConstant.FUN_32809502);
		funCodeMap.put(ConstantParm.GROUPTYP + SHOW, FunConstant.FUN_32809501);
		funCodeMap.put(ConstantParm.GROUPTYP + DELETE, FunConstant.FUN_32809504);
		funCodeMap.put(ConstantParm.GROUPTYP + ENABLE, FunConstant.FUN_32809504);
		
		logCodeMap.put(ConstantParm.GROUPTYP, LogConstant.LOG_L328095020);
		logCodeMap.put(ConstantParm.GROUPTYP + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.GROUPTYP + DELETE, LogConstant.LOG_L328095040);
		logCodeMap.put(ConstantParm.GROUPTYP + ENABLE, LogConstant.LOG_L328095041);
		
		//-----------------------------销售状态--------------------------------------
		funCodeMap.put(ConstantParm.SALESPHASE, FunConstant.FUN_32809506);
		funCodeMap.put(ConstantParm.SALESPHASE + SHOW, FunConstant.FUN_32809505);
		funCodeMap.put(ConstantParm.SALESPHASE + DELETE, FunConstant.FUN_32809508);
		funCodeMap.put(ConstantParm.SALESPHASE + ENABLE, FunConstant.FUN_32809508);
		
		logCodeMap.put(ConstantParm.SALESPHASE, LogConstant.LOG_L328095060);
		logCodeMap.put(ConstantParm.SALESPHASE + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.SALESPHASE + DELETE, LogConstant.LOG_L328095080);
		logCodeMap.put(ConstantParm.SALESPHASE + ENABLE, LogConstant.LOG_L328095081);
		
		//-----------------------------品牌--------------------------------------
		funCodeMap.put(ConstantParm.BRAND, FunConstant.FUN_32809004);
		funCodeMap.put(ConstantParm.BRAND + SHOW, FunConstant.FUN_32809005);
		funCodeMap.put(ConstantParm.BRAND + DELETE, FunConstant.FUN_32809006);
		funCodeMap.put(ConstantParm.BRAND + ENABLE, FunConstant.FUN_32809006);
		
		logCodeMap.put(ConstantParm.BRAND, LogConstant.LOG_328090040);
		logCodeMap.put(ConstantParm.BRAND + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.BRAND + DELETE, LogConstant.LOG_328090060);
		logCodeMap.put(ConstantParm.BRAND + ENABLE, LogConstant.LOG_328090060);
		
		//-----------------------------星级--------------------------------------
		funCodeMap.put(ConstantParm.STAR, FunConstant.FUN_32809007);
		funCodeMap.put(ConstantParm.STAR + SHOW, FunConstant.FUN_32809008);
		funCodeMap.put(ConstantParm.STAR + DELETE, FunConstant.FUN_32809009);
		funCodeMap.put(ConstantParm.STAR + ENABLE, FunConstant.FUN_32809009);
		
		logCodeMap.put(ConstantParm.STAR, LogConstant.LOG_328090070);
		logCodeMap.put(ConstantParm.STAR + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.STAR + DELETE, LogConstant.LOG_328090090);
		logCodeMap.put(ConstantParm.STAR + ENABLE, LogConstant.LOG_328090090);
		
		//-----------------------------职能区域--------------------------------------
		funCodeMap.put(ConstantParm.REGION, FunConstant.FUN_32809010);
		funCodeMap.put(ConstantParm.REGION + SHOW, FunConstant.FUN_32809011);
		funCodeMap.put(ConstantParm.REGION + DELETE, FunConstant.FUN_32809012);
		funCodeMap.put(ConstantParm.REGION + ENABLE, FunConstant.FUN_32809012);
		
		logCodeMap.put(ConstantParm.REGION, LogConstant.LOG_328090100);
		logCodeMap.put(ConstantParm.REGION + SHOW, LogConstant.LOG_328000000);
		logCodeMap.put(ConstantParm.REGION + DELETE, LogConstant.LOG_328090120);
		logCodeMap.put(ConstantParm.REGION + ENABLE, LogConstant.LOG_328090120);
		
		//-----------------------------酒店设施类型--------------------------------------
		funCodeMap.put(ConstantParm.UNITPROP, FunConstant.FUN_32809023);
		funCodeMap.put(ConstantParm.UNITPROP + SHOW, FunConstant.FUN_32809022);
		funCodeMap.put(ConstantParm.UNITPROP + DELETE, FunConstant.FUN_32809025);
		funCodeMap.put(ConstantParm.UNITPROP + ENABLE, FunConstant.FUN_32809025);
		
		logCodeMap.put(ConstantParm.UNITPROP, LogConstant.LOG_L328090230);
		logCodeMap.put(ConstantParm.UNITPROP + SHOW, LogConstant.LOG_L328090220);
		logCodeMap.put(ConstantParm.UNITPROP + DELETE, LogConstant.LOG_L328090250);
		logCodeMap.put(ConstantParm.UNITPROP + ENABLE, LogConstant.LOG_L328090251);
		
		//-----------------------------酒店设施--------------------------------------
		funCodeMap.put(ConstantParm.UNITPROPVLU, FunConstant.FUN_32809028);
		funCodeMap.put(ConstantParm.UNITPROPVLU + SHOW, FunConstant.FUN_32809027);
		funCodeMap.put(ConstantParm.UNITPROPVLU + DELETE, FunConstant.FUN_32809030);
		funCodeMap.put(ConstantParm.UNITPROPVLU + ENABLE, FunConstant.FUN_32809030);

		logCodeMap.put(ConstantParm.UNITPROPVLU, LogConstant.LOG_L328090280);
		logCodeMap.put(ConstantParm.UNITPROPVLU + SHOW, LogConstant.LOG_L328090270);
		logCodeMap.put(ConstantParm.UNITPROPVLU + DELETE, LogConstant.LOG_L328090300);
		logCodeMap.put(ConstantParm.UNITPROPVLU + ENABLE, LogConstant.LOG_L328090300);

		//-----------------------------房型设施类型--------------------------------------
		funCodeMap.put(ConstantParm.RMTYPPROP, FunConstant.FUN_32809033);
		funCodeMap.put(ConstantParm.RMTYPPROP + SHOW, FunConstant.FUN_32809033);
		funCodeMap.put(ConstantParm.RMTYPPROP + DELETE, FunConstant.FUN_32809035);
		funCodeMap.put(ConstantParm.RMTYPPROP + ENABLE, FunConstant.FUN_32809035);

		logCodeMap.put(ConstantParm.RMTYPPROP, LogConstant.LOG_L328090330);
		logCodeMap.put(ConstantParm.RMTYPPROP + SHOW, LogConstant.LOG_L328090330);
		logCodeMap.put(ConstantParm.RMTYPPROP + DELETE, LogConstant.LOG_L328090350);
		logCodeMap.put(ConstantParm.RMTYPPROP + ENABLE, LogConstant.LOG_L328090350);

		//-----------------------------房型设施--------------------------------------
		funCodeMap.put(ConstantParm.RMTYPPROPVLU, FunConstant.FUN_32809038);
		funCodeMap.put(ConstantParm.RMTYPPROPVLU + SHOW, FunConstant.FUN_32809037);
		funCodeMap.put(ConstantParm.RMTYPPROPVLU + DELETE, FunConstant.FUN_32809040);
		funCodeMap.put(ConstantParm.RMTYPPROPVLU + ENABLE, FunConstant.FUN_32809040);

		logCodeMap.put(ConstantParm.RMTYPPROPVLU, LogConstant.LOG_L328090380);
		logCodeMap.put(ConstantParm.RMTYPPROPVLU + SHOW, LogConstant.LOG_L328090370);
		logCodeMap.put(ConstantParm.RMTYPPROPVLU + DELETE, LogConstant.LOG_L328090400);
		logCodeMap.put(ConstantParm.RMTYPPROPVLU + ENABLE, LogConstant.LOG_L328090400);
		
		//-----------------------------酒店标签--------------------------------------
		funCodeMap.put(ConstantParm.UNITTAG, FunConstant.FUN_32809043);
		funCodeMap.put(ConstantParm.UNITTAG + SHOW, FunConstant.FUN_32809042);
		funCodeMap.put(ConstantParm.UNITTAG + DELETE, FunConstant.FUN_32809044);
		funCodeMap.put(ConstantParm.UNITTAG + ENABLE, FunConstant.FUN_32809044);
		
		logCodeMap.put(ConstantParm.UNITTAG, LogConstant.LOG_L328090430);
		logCodeMap.put(ConstantParm.UNITTAG + SHOW, LogConstant.LOG_L328090420);
		logCodeMap.put(ConstantParm.UNITTAG + DELETE, LogConstant.LOG_L328090440);
		logCodeMap.put(ConstantParm.UNITTAG + ENABLE, LogConstant.LOG_L328090440);
		//-----------------------------房型标签--------------------------------------
		funCodeMap.put(ConstantParm.RMTYPTAG, FunConstant.FUN_32809047);
		funCodeMap.put(ConstantParm.RMTYPTAG + SHOW, FunConstant.FUN_32809046);
		funCodeMap.put(ConstantParm.RMTYPTAG + DELETE, FunConstant.FUN_32809048);
		funCodeMap.put(ConstantParm.RMTYPTAG + ENABLE, FunConstant.FUN_32809048);
		
		logCodeMap.put(ConstantParm.RMTYPTAG, LogConstant.LOG_L328090470);
		logCodeMap.put(ConstantParm.RMTYPTAG + SHOW, LogConstant.LOG_L328090460);
		logCodeMap.put(ConstantParm.RMTYPTAG + DELETE, LogConstant.LOG_L328090480);
		logCodeMap.put(ConstantParm.RMTYPTAG + ENABLE, LogConstant.LOG_L328090480);
		//-----------------------------图片分组--------------------------------------
		funCodeMap.put(ConstantParm.UNITPICGRP, FunConstant.FUN_32809051);
		funCodeMap.put(ConstantParm.UNITPICGRP + SHOW, FunConstant.FUN_32809050);
		funCodeMap.put(ConstantParm.UNITPICGRP + DELETE, FunConstant.FUN_32809052);
		funCodeMap.put(ConstantParm.UNITPICGRP + ENABLE, FunConstant.FUN_32809052);
		
		logCodeMap.put(ConstantParm.UNITPICGRP, LogConstant.LOG_L328090510);
		logCodeMap.put(ConstantParm.UNITPICGRP + SHOW, LogConstant.LOG_L328090500);
		logCodeMap.put(ConstantParm.UNITPICGRP + DELETE, LogConstant.LOG_L328090520);
		logCodeMap.put(ConstantParm.UNITPICGRP + ENABLE, LogConstant.LOG_L328090520);

		List<String> temp = Arrays.asList("G","H");
		Map<String, String> tempMap = new HashMap<>();
		funCodeMap.forEach((key, vlu) -> {
			temp.forEach(m -> {
				tempMap.put(key + m, vlu + m);
			});
		});
		funCodeMap.putAll(tempMap);
		Map<String, String> tempLogMap = new HashMap<>();
		logCodeMap.forEach((key, vlu) -> {
			temp.forEach(m -> {
				tempLogMap.put(key + m, vlu);
			});
		});
		logCodeMap.putAll(tempLogMap);
		
		//-----------------------------折扣原因-------------------------------------
		funCodeMap.put(ConstantParm.RATERSN + SHOW+"H", FunConstant.FUN_32804014);
		funCodeMap.put(ConstantParm.RATERSN + DELETE+"H", FunConstant.FUN_32804015);
		funCodeMap.put(ConstantParm.RATERSN + ENABLE+"H", FunConstant.FUN_32804015);
		
		//-----------------------------换房原因-------------------------------------
		funCodeMap.put(ConstantParm.RMCHANGERSN + SHOW+"H", FunConstant.FUN_32803029);
		funCodeMap.put(ConstantParm.RMCHANGERSN + DELETE+"H", FunConstant.FUN_32803030);
		funCodeMap.put(ConstantParm.RMCHANGERSN + ENABLE+"H", FunConstant.FUN_32803030);
		
		//-----------------------------房型分组------------------------------------
		funCodeMap.put(ConstantParm.ROOMTYPGRP + SHOW+"H", FunConstant.FUN_32803002);
		funCodeMap.put(ConstantParm.ROOMTYPGRP + DELETE+"H", FunConstant.FUN_32803003);
		funCodeMap.put(ConstantParm.ROOMTYPGRP + ENABLE+"H", FunConstant.FUN_32803003);
		
		//-----------------------------楼座---------------------------------------
		funCodeMap.put(ConstantParm.BUILDING + SHOW+"H", FunConstant.FUN_32803011);
		funCodeMap.put(ConstantParm.BUILDING + DELETE+"H", FunConstant.FUN_32803012);
		funCodeMap.put(ConstantParm.BUILDING + ENABLE+"H", FunConstant.FUN_32803012);
		
		//-----------------------------楼区---------------------------------------
		funCodeMap.put(ConstantParm.AREA + SHOW+"H", FunConstant.FUN_32803014);
		funCodeMap.put(ConstantParm.AREA + DELETE+"H", FunConstant.FUN_32803015);
		funCodeMap.put(ConstantParm.AREA + ENABLE+"H", FunConstant.FUN_32803015);
		
		//-----------------------------楼层--------------------------------------
		funCodeMap.put(ConstantParm.FLOOR + SHOW+"H", FunConstant.FUN_32803017);
		funCodeMap.put(ConstantParm.FLOOR + DELETE+"H", FunConstant.FUN_32803018);
		funCodeMap.put(ConstantParm.FLOOR + ENABLE+"H", FunConstant.FUN_32803018);
		
		//-----------------------------床型--------------------------------------
		funCodeMap.put(ConstantParm.BEDTYP + SHOW+"H", FunConstant.FUN_32803020);
		funCodeMap.put(ConstantParm.BEDTYP + DELETE+"H", FunConstant.FUN_32803021);
		funCodeMap.put(ConstantParm.BEDTYP + ENABLE+"H", FunConstant.FUN_32803021);
		
		//-----------------------------维修房原因------------------------------------
		funCodeMap.put(ConstantParm.REPIARRSN + SHOW+"H", FunConstant.FUN_32803023);
		funCodeMap.put(ConstantParm.REPIARRSN + DELETE+"H", FunConstant.FUN_32803024);
		funCodeMap.put(ConstantParm.REPIARRSN + ENABLE+"H", FunConstant.FUN_32803024);
		
		//-----------------------------房间特点--------------------------------------
		funCodeMap.put(ConstantParm.ROOMFEATURETYP + SHOW+"H", FunConstant.FUN_32803026);
		funCodeMap.put(ConstantParm.ROOMFEATURETYP + DELETE+"H", FunConstant.FUN_32803027);
		funCodeMap.put(ConstantParm.ROOMFEATURETYP + ENABLE+"H", FunConstant.FUN_32803027);
		
		//-----------------------------入账代码分组--------------------------------------
		funCodeMap.put(ConstantParm.TRNCLS + SHOW+"H", FunConstant.FUN_32805002);
		funCodeMap.put(ConstantParm.TRNCLS + DELETE+"H", FunConstant.FUN_32805003);
		funCodeMap.put(ConstantParm.TRNCLS + ENABLE+"H", FunConstant.FUN_32805003);
		
		//-----------------------------入账代码子分组--------------------------------------
		funCodeMap.put(ConstantParm.TRNSUBCLS + SHOW+"H", FunConstant.FUN_32805005);
		funCodeMap.put(ConstantParm.TRNSUBCLS + DELETE+"H", FunConstant.FUN_32805006);
		funCodeMap.put(ConstantParm.TRNSUBCLS + ENABLE+"H", FunConstant.FUN_32805006);
		
		//-----------------------------服务费率--------------------------------------
		funCodeMap.put(ConstantParm.SVCTYP + SHOW+"H", FunConstant.FUN_32805011);
		funCodeMap.put(ConstantParm.SVCTYP + DELETE+"H", FunConstant.FUN_32805012);
		funCodeMap.put(ConstantParm.SVCTYP + ENABLE+"H", FunConstant.FUN_32805012);
		
		//-----------------------------银行卡类型--------------------------------------
		funCodeMap.put(ConstantParm.CCARDTYP + SHOW+"H", FunConstant.FUN_32805017);
		funCodeMap.put(ConstantParm.CCARDTYP + DELETE+"H", FunConstant.FUN_32805018);
		funCodeMap.put(ConstantParm.CCARDTYP + ENABLE+"H", FunConstant.FUN_32805018);
		
		//-----------------------------市场分组--------------------------------------
		funCodeMap.put(ConstantParm.MARKETGRP + SHOW+"H", FunConstant.FUN_32804017);
		funCodeMap.put(ConstantParm.MARKETGRP + DELETE+"H", FunConstant.FUN_32804018);
		funCodeMap.put(ConstantParm.MARKETGRP + ENABLE+"H", FunConstant.FUN_32804018);
		
		//-----------------------------市场--------------------------------------
		funCodeMap.put(ConstantParm.MARKET + SHOW+"H", FunConstant.FUN_32804020);
		funCodeMap.put(ConstantParm.MARKET + DELETE+"H", FunConstant.FUN_32804021);
		funCodeMap.put(ConstantParm.MARKET + ENABLE+"H", FunConstant.FUN_32804021);
		
		//-----------------------------职务--------------------------------------
		funCodeMap.put(ConstantParm.WORKTITLE + SHOW+"H", FunConstant.FUN_32800005);
		funCodeMap.put(ConstantParm.WORKTITLE + DELETE+"H", FunConstant.FUN_32800006);
		funCodeMap.put(ConstantParm.WORKTITLE + ENABLE+"H", FunConstant.FUN_32800006);
		
		//-----------------------------职员角色--------------------------------------
		funCodeMap.put(ConstantParm.EMPLROLE + SHOW+"H", FunConstant.FUN_32800011);
		funCodeMap.put(ConstantParm.EMPLROLE + DELETE+"H", FunConstant.FUN_32800012);
		funCodeMap.put(ConstantParm.EMPLROLE + ENABLE+"H", FunConstant.FUN_32800012);
		
		//-----------------------------销售员分组--------------------------------------
		funCodeMap.put(ConstantParm.SALERGRP + SHOW+"H", FunConstant.FUN_32800014);
		funCodeMap.put(ConstantParm.SALERGRP + DELETE+"H", FunConstant.FUN_32800015);
		funCodeMap.put(ConstantParm.SALERGRP + ENABLE+"H", FunConstant.FUN_32800015);
		
		//-----------------------------VIP--------------------------------------
		funCodeMap.put(ConstantParm.VIP + SHOW+"H", FunConstant.FUN_32806044);
		funCodeMap.put(ConstantParm.VIP + DELETE+"H", FunConstant.FUN_32806045);
		funCodeMap.put(ConstantParm.VIP + ENABLE+"H", FunConstant.FUN_32806045);
		
		//-----------------------------协议客户分组--------------------------------------
		funCodeMap.put(ConstantParm.CORPGRP + SHOW+"H", FunConstant.FUN_32806035);
		funCodeMap.put(ConstantParm.CORPGRP + DELETE+"H", FunConstant.FUN_32806036);
		funCodeMap.put(ConstantParm.CORPGRP + ENABLE+"H", FunConstant.FUN_32806036);
		
		//-----------------------------备注模板--------------------------------------
		funCodeMap.put(ConstantParm.PRFNOTICE + SHOW+"H", FunConstant.FUN_32806020);
		funCodeMap.put(ConstantParm.PRFNOTICE + DELETE+"H", FunConstant.FUN_32806021);
		funCodeMap.put(ConstantParm.PRFNOTICE + ENABLE+"H", FunConstant.FUN_32806021);
		
		//-----------------------------协议客户类型--------------------------------------
		funCodeMap.put(ConstantParm.CORPTYP + SHOW+"H", FunConstant.FUN_32806023);
		funCodeMap.put(ConstantParm.CORPTYP + DELETE+"H", FunConstant.FUN_32806024);
		funCodeMap.put(ConstantParm.CORPTYP + ENABLE+"H", FunConstant.FUN_32806024);
		
		//-----------------------------协议客户分类--------------------------------------
		funCodeMap.put(ConstantParm.CORPCLS + SHOW+"H", FunConstant.FUN_32806026);
		funCodeMap.put(ConstantParm.CORPCLS + DELETE+"H", FunConstant.FUN_32806027);
		funCodeMap.put(ConstantParm.CORPCLS + ENABLE+"H", FunConstant.FUN_32806027);
		
		//-----------------------------协议客户子分类--------------------------------------
		funCodeMap.put(ConstantParm.CORPSUBCLS + SHOW+"H", FunConstant.FUN_32806029);
		funCodeMap.put(ConstantParm.CORPSUBCLS + DELETE+"H", FunConstant.FUN_32806030);
		funCodeMap.put(ConstantParm.CORPSUBCLS + ENABLE+"H", FunConstant.FUN_32806030);
		
		//-----------------------------协议客户级别--------------------------------------
		funCodeMap.put(ConstantParm.CORPRANK + SHOW+"H", FunConstant.FUN_32806032);
		funCodeMap.put(ConstantParm.CORPRANK + DELETE+"H", FunConstant.FUN_32806033);
		funCodeMap.put(ConstantParm.CORPRANK + ENABLE+"H", FunConstant.FUN_32806033);
		
		//-----------------------------协议客户分组--------------------------------------
		funCodeMap.put(ConstantParm.CORPGRP + SHOW+"H", FunConstant.FUN_32806035);
		funCodeMap.put(ConstantParm.CORPGRP + DELETE+"H", FunConstant.FUN_32806036);
		funCodeMap.put(ConstantParm.CORPGRP + ENABLE+"H", FunConstant.FUN_32806036);
		
		//-----------------------------合同类型--------------------------------------
		funCodeMap.put(ConstantParm.CONTRACTTYP + SHOW+"H", FunConstant.FUN_32806038);
		funCodeMap.put(ConstantParm.CONTRACTTYP + DELETE+"H", FunConstant.FUN_32806039);
		funCodeMap.put(ConstantParm.CONTRACTTYP + ENABLE+"H", FunConstant.FUN_32806039);
		
		//-----------------------------合同作废原因--------------------------------------
		funCodeMap.put(ConstantParm.INVALIDRSN + SHOW+"H", FunConstant.FUN_32806041);
		funCodeMap.put(ConstantParm.INVALIDRSN + DELETE+"H", FunConstant.FUN_32806042);
		funCodeMap.put(ConstantParm.INVALIDRSN + ENABLE+"H", FunConstant.FUN_32806042);
		
		//-----------------------------应收账户类型--------------------------------------
		funCodeMap.put(ConstantParm.ARTYPE + SHOW+"H", FunConstant.FUN_32805502);
		funCodeMap.put(ConstantParm.ARTYPE + DELETE+"H", FunConstant.FUN_32805503);
		funCodeMap.put(ConstantParm.ARTYPE + ENABLE+"H", FunConstant.FUN_32805503);
		
		//-----------------------------应收付款周期--------------------------------------
		funCodeMap.put(ConstantParm.ARPAYCYCLE + SHOW+"H", FunConstant.FUN_32805505);
		funCodeMap.put(ConstantParm.ARPAYCYCLE + DELETE+"H", FunConstant.FUN_32805506);
		funCodeMap.put(ConstantParm.ARPAYCYCLE + ENABLE+"H", FunConstant.FUN_32805506);
		
		//-----------------------------应收对账周期--------------------------------------
		funCodeMap.put(ConstantParm.ARSTATCYCLE + SHOW+"H", FunConstant.FUN_32805508);
		funCodeMap.put(ConstantParm.ARSTATCYCLE + DELETE+"H", FunConstant.FUN_32805509);
		funCodeMap.put(ConstantParm.ARSTATCYCLE + ENABLE+"H", FunConstant.FUN_32805509);
		
		//-----------------------------预定取消原因---------------------------------
		funCodeMap.put(ConstantParm.CANCELRSN + SHOW+"H", FunConstant.FUN_32804011);
		funCodeMap.put(ConstantParm.CANCELRSN + DELETE+"H", FunConstant.FUN_32804012);
		funCodeMap.put(ConstantParm.CANCELRSN + ENABLE+"H", FunConstant.FUN_32804012);
		
		//-----------------------------发票项目--------------------------------------
		funCodeMap.put(ConstantParm.FINVCCHARGEITEM+"H", FunConstant.FUN_32805059H);
		funCodeMap.put(ConstantParm.FINVCCHARGEITEM + SHOW+"H", FunConstant.FUN_32805060);
		funCodeMap.put(ConstantParm.FINVCCHARGEITEM + DELETE+"H", FunConstant.FUN_32805061);
		funCodeMap.put(ConstantParm.FINVCCHARGEITEM + ENABLE+"H", FunConstant.FUN_32805061);
		
		//-----------------------------商品单位--------------------------------------
		funCodeMap.put(ConstantParm.GOODSUNIT + SHOW+"H", FunConstant.FUN_32805029);
		funCodeMap.put(ConstantParm.GOODSUNIT + DELETE+"H", FunConstant.FUN_32805030);
		funCodeMap.put(ConstantParm.GOODSUNIT + ENABLE+"H", FunConstant.FUN_32805030);
		
		//-----------------------------商品小类--------------------------------------
		funCodeMap.put(ConstantParm.GOODSSUBCLS + SHOW+"H", FunConstant.FUN_32805026);
		funCodeMap.put(ConstantParm.GOODSSUBCLS + DELETE+"H", FunConstant.FUN_32805027);
		funCodeMap.put(ConstantParm.GOODSSUBCLS + ENABLE+"H", FunConstant.FUN_32805027);
		
		//-----------------------------商品大类--------------------------------------
		funCodeMap.put(ConstantParm.GOODSCLS + SHOW+"H", FunConstant.FUN_32805023);
		funCodeMap.put(ConstantParm.GOODSCLS + DELETE+"H", FunConstant.FUN_32805024);
		funCodeMap.put(ConstantParm.GOODSCLS + ENABLE+"H", FunConstant.FUN_32805024);
		
		//-----------------------------加收房费--------------------------------------
		funCodeMap.put(ConstantParm.EXTRAROOMRATE + "H", FunConstant.FUN_32805037);
		funCodeMap.put(ConstantParm.EXTRAROOMRATE + SHOW+"H", FunConstant.FUN_32805038);
		funCodeMap.put(ConstantParm.EXTRAROOMRATE + DELETE+"H", FunConstant.FUN_32805039);
		funCodeMap.put(ConstantParm.EXTRAROOMRATE + ENABLE+"H", FunConstant.FUN_32805039);
		
		//-----------------------------入住取消原因--------------------------------------
		funCodeMap.put(ConstantParm.REINSTATERSN + SHOW+"H", FunConstant.FUN_32804088);
		funCodeMap.put(ConstantParm.REINSTATERSN + DELETE+"H", FunConstant.FUN_32804089);
		funCodeMap.put(ConstantParm.REINSTATERSN + ENABLE+"H", FunConstant.FUN_32804089);
		
		//-----------------------------部门类型--------------------------------------
		funCodeMap.put(ConstantParm.DEPTTYP + SHOW  +"H", FunConstant.FUN_32800029);
		funCodeMap.put(ConstantParm.DEPTTYP + DELETE  +"H", FunConstant.FUN_32800030);
		funCodeMap.put(ConstantParm.DEPTTYP + ENABLE  +"H", FunConstant.FUN_32800030);
		
		//-----------------------------销售点类型--------------------------------------
		funCodeMap.put(ConstantParm.POSTYP +"H", FunConstant.FUN_33200072);
		funCodeMap.put(ConstantParm.POSTYP + SHOW  +"H", FunConstant.FUN_33200071);
		funCodeMap.put(ConstantParm.POSTYP + DELETE  +"H", FunConstant.FUN_33200073);
		funCodeMap.put(ConstantParm.POSTYP + ENABLE  +"H", FunConstant.FUN_33200073);
		
		//-----------------------------价格分组-------------------------------------
		funCodeMap.put(ConstantParm.RATEGRP + SHOW +"H", FunConstant.FUN_32802002);
		funCodeMap.put(ConstantParm.RATEGRP + DELETE +"H", FunConstant.FUN_32802003);
		funCodeMap.put(ConstantParm.RATEGRP + ENABLE +"H", FunConstant.FUN_32802003);

		//-----------------------------价格子分组-----------------------------------
		funCodeMap.put(ConstantParm.RATESUBGRP + SHOW +"H", FunConstant.FUN_32802005);
		funCodeMap.put(ConstantParm.RATESUBGRP + DELETE +"H", FunConstant.FUN_32802006);
		funCodeMap.put(ConstantParm.RATESUBGRP + ENABLE +"H", FunConstant.FUN_32802006);
		
		//-----------------------------联系方式--------------------------------------
		funCodeMap.put(ConstantParm.CONTACTTYP + SHOW +"H", FunConstant.FUN_32806005);
		funCodeMap.put(ConstantParm.CONTACTTYP + DELETE +"H", FunConstant.FUN_32806006);
		funCodeMap.put(ConstantParm.CONTACTTYP + ENABLE +"H", FunConstant.FUN_32806006);

		//-----------------------------黑名单撤销原因--------------------------------------
		funCodeMap.put(ConstantParm.BLKLSTCXLRSN + SHOW +"H", FunConstant.FUN_32806008);
		funCodeMap.put(ConstantParm.BLKLSTCXLRSN + DELETE +"H", FunConstant.FUN_32806009);
		funCodeMap.put(ConstantParm.BLKLSTCXLRSN + ENABLE +"H", FunConstant.FUN_32806009);

		//-----------------------------黑名单类型--------------------------------------
		funCodeMap.put(ConstantParm.BLKLSTTYP + SHOW +"H", FunConstant.FUN_32806011);
		funCodeMap.put(ConstantParm.BLKLSTTYP + DELETE +"H", FunConstant.FUN_32806012);
		funCodeMap.put(ConstantParm.BLKLSTTYP + ENABLE +"H", FunConstant.FUN_32806012);
		
		//-----------------------------客史分类--------------------------------------
		funCodeMap.put(ConstantParm.PRFCLS + SHOW +"H", FunConstant.FUN_32806026);
		funCodeMap.put(ConstantParm.PRFCLS + DELETE +"H", FunConstant.FUN_32806027);
		funCodeMap.put(ConstantParm.PRFCLS + ENABLE +"H", FunConstant.FUN_32806027);

		//-----------------------------客史子分类--------------------------------------
		funCodeMap.put(ConstantParm.PRFSUBCLS + SHOW +"H", FunConstant.FUN_32806029);
		funCodeMap.put(ConstantParm.PRFSUBCLS + DELETE +"H", FunConstant.FUN_32806030);
		funCodeMap.put(ConstantParm.PRFSUBCLS + ENABLE +"H", FunConstant.FUN_32806031);

		//-----------------------------团队类型--------------------------------------
		funCodeMap.put(ConstantParm.GROUPTYP + SHOW+"H", FunConstant.FUN_32809501);
		funCodeMap.put(ConstantParm.GROUPTYP + DELETE+"H", FunConstant.FUN_32809504);
		funCodeMap.put(ConstantParm.GROUPTYP + ENABLE+"H", FunConstant.FUN_32809504);
		
		//-----------------------------销售状态--------------------------------------
		funCodeMap.put(ConstantParm.SALESPHASE + SHOW+"H", FunConstant.FUN_32809505);
		funCodeMap.put(ConstantParm.SALESPHASE + DELETE+"H", FunConstant.FUN_32809508);
		funCodeMap.put(ConstantParm.SALESPHASE + ENABLE+"H", FunConstant.FUN_32809508);
		
		//-----------------------------品牌--------------------------------------
		funCodeMap.put(ConstantParm.BRAND + SHOW+"H", FunConstant.FUN_32809005);
		funCodeMap.put(ConstantParm.BRAND + DELETE+"H", FunConstant.FUN_32809006);
		funCodeMap.put(ConstantParm.BRAND + ENABLE+"H", FunConstant.FUN_32809006);
		
		//-----------------------------星级--------------------------------------
		funCodeMap.put(ConstantParm.STAR + SHOW+"H", FunConstant.FUN_32809008);
		funCodeMap.put(ConstantParm.STAR + DELETE+"H", FunConstant.FUN_32809009);
		funCodeMap.put(ConstantParm.STAR + ENABLE+"H", FunConstant.FUN_32809009);
		
		//-----------------------------职能区域--------------------------------------
		funCodeMap.put(ConstantParm.REGION + SHOW+"H", FunConstant.FUN_32809011);
		funCodeMap.put(ConstantParm.REGION + DELETE+"H", FunConstant.FUN_32809012);
		funCodeMap.put(ConstantParm.REGION + ENABLE+"H", FunConstant.FUN_32809012);

		//-----------------------------酒店设施类型--------------------------------------
		funCodeMap.put(ConstantParm.UNITPROP+"H", FunConstant.FUN_32809023);
		funCodeMap.put(ConstantParm.UNITPROP + SHOW+"H", FunConstant.FUN_32809022);
		funCodeMap.put(ConstantParm.UNITPROP + DELETE+"H", FunConstant.FUN_32809025);
		funCodeMap.put(ConstantParm.UNITPROP + ENABLE+"H", FunConstant.FUN_32809025);

		//-----------------------------酒店设施--------------------------------------
		funCodeMap.put(ConstantParm.UNITPROPVLU+"H", FunConstant.FUN_32809028);
		funCodeMap.put(ConstantParm.UNITPROPVLU + SHOW+"H", FunConstant.FUN_32809027);
		funCodeMap.put(ConstantParm.UNITPROPVLU + DELETE+"H", FunConstant.FUN_32809030);
		funCodeMap.put(ConstantParm.UNITPROPVLU + ENABLE+"H", FunConstant.FUN_32809030);

		//-----------------------------房型设施类型--------------------------------------
		funCodeMap.put(ConstantParm.RMTYPPROP+"H", FunConstant.FUN_32809033);
		funCodeMap.put(ConstantParm.RMTYPPROP + SHOW+"H", FunConstant.FUN_32809033);
		funCodeMap.put(ConstantParm.RMTYPPROP + DELETE+"H", FunConstant.FUN_32809035);
		funCodeMap.put(ConstantParm.RMTYPPROP + ENABLE+"H", FunConstant.FUN_32809035);

		//-----------------------------房型设施--------------------------------------
		funCodeMap.put(ConstantParm.RMTYPPROPVLU+"H", FunConstant.FUN_32809038);
		funCodeMap.put(ConstantParm.RMTYPPROPVLU + SHOW+"H", FunConstant.FUN_32809037);
		funCodeMap.put(ConstantParm.RMTYPPROPVLU + DELETE+"H", FunConstant.FUN_32809040);
		funCodeMap.put(ConstantParm.RMTYPPROPVLU + ENABLE+"H", FunConstant.FUN_32809040);
		
		//-----------------------------酒店标签--------------------------------------
		funCodeMap.put(ConstantParm.UNITTAG+"H", FunConstant.FUN_32809043);
		funCodeMap.put(ConstantParm.UNITTAG + SHOW+"H", FunConstant.FUN_32809042);
		funCodeMap.put(ConstantParm.UNITTAG + DELETE+"H", FunConstant.FUN_32809044);
		funCodeMap.put(ConstantParm.UNITTAG + ENABLE+"H", FunConstant.FUN_32809044);

		//-----------------------------房型标签--------------------------------------
		funCodeMap.put(ConstantParm.RMTYPTAG+"H", FunConstant.FUN_32809047);
		funCodeMap.put(ConstantParm.RMTYPTAG + SHOW+"H", FunConstant.FUN_32809046);
		funCodeMap.put(ConstantParm.RMTYPTAG + DELETE+"H", FunConstant.FUN_32809048);
		funCodeMap.put(ConstantParm.RMTYPTAG + ENABLE+"H", FunConstant.FUN_32809048);

		//-----------------------------图片分组--------------------------------------
		funCodeMap.put(ConstantParm.UNITPICGRP+"H", FunConstant.FUN_32809051);
		funCodeMap.put(ConstantParm.UNITPICGRP + SHOW+"H", FunConstant.FUN_32809050);
		funCodeMap.put(ConstantParm.UNITPICGRP + DELETE+"H", FunConstant.FUN_32809052);
		funCodeMap.put(ConstantParm.UNITPICGRP + ENABLE+"H", FunConstant.FUN_32809052);
		
		//-----------------------------商城商品大分类--------------------------------------
		funCodeMap.remove(ConstantParm.SHOPGOODSCLS +"H");
		funCodeMap.remove(ConstantParm.SHOPGOODSCLS + SHOW +"H");
		funCodeMap.remove(ConstantParm.SHOPGOODSCLS + DELETE +"H");
		funCodeMap.remove(ConstantParm.SHOPGOODSCLS + ENABLE +"H");
		
		//-----------------------------商城商品小分类--------------------------------------
		funCodeMap.remove(ConstantParm.SHOPGOODSSUBCLS +"H");
		funCodeMap.remove(ConstantParm.SHOPGOODSSUBCLS + SHOW +"H");
		funCodeMap.remove(ConstantParm.SHOPGOODSSUBCLS + DELETE +"H");
		funCodeMap.remove(ConstantParm.SHOPGOODSSUBCLS + ENABLE +"H");
		
		
		//-----------------------------市场分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.MARKETGRP + UPDATE, FunConstant.FUN_40804016);
		logCodeCtlMap.put(ConstantParm.MARKETGRP + UPDATE, LogConstant.LOG_L408040160);
		funCodeCtlMap.put(ConstantParm.MARKETGRP + SHOW, FunConstant.FUN_40804017);
		logCodeCtlMap.put(ConstantParm.MARKETGRP + SHOW, LogConstant.LOG_L408040170);
		funCodeCtlMap.put(ConstantParm.MARKETGRP + ENABLE, FunConstant.FUN_40804018);
		logCodeCtlMap.put(ConstantParm.MARKETGRP + ENABLE, LogConstant.LOG_L408040180);
		funCodeCtlMap.put(ConstantParm.MARKETGRP + TAKEOVER, FunConstant.FUN_40804081);
		logCodeCtlMap.put(ConstantParm.MARKETGRP + TAKEOVER, LogConstant.LOG_L408040810);
		funCodeCtlMap.put(ConstantParm.MARKETGRP + DISTRIBUTE, FunConstant.FUN_40814081);
		logCodeCtlMap.put(ConstantParm.MARKETGRP + DISTRIBUTE, LogConstant.LOG_L408140810);
		//-----------------------------市场--------------------------------------
		funCodeCtlMap.put(ConstantParm.MARKET + UPDATE, FunConstant.FUN_40804019);
		logCodeCtlMap.put(ConstantParm.MARKET + UPDATE, LogConstant.LOG_L408040190);
		funCodeCtlMap.put(ConstantParm.MARKET + SHOW, FunConstant.FUN_40804020);
		logCodeCtlMap.put(ConstantParm.MARKET + SHOW, LogConstant.LOG_L408040200);
		funCodeCtlMap.put(ConstantParm.MARKET + ENABLE, FunConstant.FUN_40804021);
		logCodeCtlMap.put(ConstantParm.MARKET + ENABLE, LogConstant.LOG_L408040210);
		funCodeCtlMap.put(ConstantParm.MARKET + TAKEOVER, FunConstant.FUN_40804082);
		logCodeCtlMap.put(ConstantParm.MARKET + TAKEOVER, LogConstant.LOG_L408040820);
		funCodeCtlMap.put(ConstantParm.MARKET + DISTRIBUTE, FunConstant.FUN_40814082);
		logCodeCtlMap.put(ConstantParm.MARKET + DISTRIBUTE, LogConstant.LOG_L408140820);
		//-----------------------------客源分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + UPDATE, FunConstant.FUN_40804022);
		logCodeCtlMap.put(ConstantParm.SOURCEGRP + UPDATE, LogConstant.LOG_L408040220);
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + SHOW, FunConstant.FUN_40804023);
		logCodeCtlMap.put(ConstantParm.SOURCEGRP + SHOW, LogConstant.LOG_L408040230);
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + ENABLE, FunConstant.FUN_40804024);
		logCodeCtlMap.put(ConstantParm.SOURCEGRP + ENABLE, LogConstant.LOG_L408040240);
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + TAKEOVER, FunConstant.FUN_40804090);
		logCodeCtlMap.put(ConstantParm.SOURCEGRP + TAKEOVER, LogConstant.LOG_L408040900);
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + DISTRIBUTE, FunConstant.FUN_40814090);
		logCodeCtlMap.put(ConstantParm.SOURCEGRP + DISTRIBUTE, LogConstant.LOG_L408140900);
		//-----------------------------客源--------------------------------------
		funCodeCtlMap.put(ConstantParm.SOURCE + UPDATE, FunConstant.FUN_40804025);
		logCodeCtlMap.put(ConstantParm.SOURCE + UPDATE, LogConstant.LOG_L408040250);
		funCodeCtlMap.put(ConstantParm.SOURCE + SHOW, FunConstant.FUN_40804026);
		logCodeCtlMap.put(ConstantParm.SOURCE + SHOW, LogConstant.LOG_L408040260);
		funCodeCtlMap.put(ConstantParm.SOURCE + ENABLE, FunConstant.FUN_40804027);
		logCodeCtlMap.put(ConstantParm.SOURCE + ENABLE, LogConstant.LOG_L408040270);
		funCodeCtlMap.put(ConstantParm.SOURCE + TAKEOVER, FunConstant.FUN_40804091);
		logCodeCtlMap.put(ConstantParm.SOURCE + TAKEOVER, LogConstant.LOG_L408040910);
		funCodeCtlMap.put(ConstantParm.SOURCE + DISTRIBUTE, FunConstant.FUN_40814091);
		logCodeCtlMap.put(ConstantParm.SOURCE + DISTRIBUTE, LogConstant.LOG_L408140910);
		//-----------------------------预订取消原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.CANCELRSN + UPDATE, FunConstant.FUN_40804010);
		logCodeCtlMap.put(ConstantParm.CANCELRSN + UPDATE, LogConstant.LOG_L408040100);
		funCodeCtlMap.put(ConstantParm.CANCELRSN + SHOW, FunConstant.FUN_40804011);
		logCodeCtlMap.put(ConstantParm.CANCELRSN + SHOW, LogConstant.LOG_L408040110);
		funCodeCtlMap.put(ConstantParm.CANCELRSN + ENABLE, FunConstant.FUN_40804012);
		logCodeCtlMap.put(ConstantParm.CANCELRSN + ENABLE, LogConstant.LOG_L408040120);
		funCodeCtlMap.put(ConstantParm.CANCELRSN + TAKEOVER, FunConstant.FUN_40804083);
		logCodeCtlMap.put(ConstantParm.CANCELRSN + TAKEOVER, LogConstant.LOG_L408040830);
		funCodeCtlMap.put(ConstantParm.CANCELRSN + DISTRIBUTE, FunConstant.FUN_40814083);
		logCodeCtlMap.put(ConstantParm.CANCELRSN + DISTRIBUTE, LogConstant.LOG_L408140830);
		//-----------------------------折扣原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.RATERSN + UPDATE, FunConstant.FUN_40804013);
		logCodeCtlMap.put(ConstantParm.RATERSN + UPDATE, LogConstant.LOG_L408040130);
		funCodeCtlMap.put(ConstantParm.RATERSN + SHOW, FunConstant.FUN_40804014);
		logCodeCtlMap.put(ConstantParm.RATERSN + SHOW, LogConstant.LOG_L408040140);
		funCodeCtlMap.put(ConstantParm.RATERSN + ENABLE, FunConstant.FUN_40804015);
		logCodeCtlMap.put(ConstantParm.RATERSN + ENABLE, LogConstant.LOG_L408040150);
		funCodeCtlMap.put(ConstantParm.RATERSN + TAKEOVER, FunConstant.FUN_40804084);
		logCodeCtlMap.put(ConstantParm.RATERSN + TAKEOVER, LogConstant.LOG_L408040840);
		funCodeCtlMap.put(ConstantParm.RATERSN + DISTRIBUTE, FunConstant.FUN_40814084);
		logCodeCtlMap.put(ConstantParm.RATERSN + DISTRIBUTE, LogConstant.LOG_L408140840);
		//-----------------------------入住取消原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + UPDATE, FunConstant.FUN_40804086);
		logCodeCtlMap.put(ConstantParm.REINSTATERSN + UPDATE, LogConstant.LOG_L408040860);
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + SHOW, FunConstant.FUN_40804088);
		logCodeCtlMap.put(ConstantParm.REINSTATERSN + SHOW, LogConstant.LOG_L408040880);
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + ENABLE, FunConstant.FUN_40804089);
		logCodeCtlMap.put(ConstantParm.REINSTATERSN + ENABLE, LogConstant.LOG_L408040890);
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + TAKEOVER, FunConstant.FUN_40804085);
		logCodeCtlMap.put(ConstantParm.REINSTATERSN + TAKEOVER, LogConstant.LOG_L408040850);
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + DISTRIBUTE, FunConstant.FUN_40814085);
		logCodeCtlMap.put(ConstantParm.REINSTATERSN + DISTRIBUTE, LogConstant.LOG_L408140850);
		//-----------------------------楼区--------------------------------------
		funCodeCtlMap.put(ConstantParm.AREA + UPDATE, FunConstant.FUN_40803013);
		logCodeCtlMap.put(ConstantParm.AREA + UPDATE, LogConstant.LOG_L408030130);
		funCodeCtlMap.put(ConstantParm.AREA + SHOW, FunConstant.FUN_40803014);
		logCodeCtlMap.put(ConstantParm.AREA + SHOW, LogConstant.LOG_L408030140);
		funCodeCtlMap.put(ConstantParm.AREA + ENABLE, FunConstant.FUN_40803015);
		logCodeCtlMap.put(ConstantParm.AREA + ENABLE, LogConstant.LOG_L408030150);
		funCodeCtlMap.put(ConstantParm.AREA + TAKEOVER, FunConstant.FUN_40803081);
		logCodeCtlMap.put(ConstantParm.AREA + TAKEOVER, LogConstant.LOG_L408030810);
		funCodeCtlMap.put(ConstantParm.AREA + DISTRIBUTE, FunConstant.FUN_40813081);
		logCodeCtlMap.put(ConstantParm.AREA + DISTRIBUTE, LogConstant.LOG_L408130810);
		//-----------------------------楼座--------------------------------------
		funCodeCtlMap.put(ConstantParm.BUILDING + UPDATE, FunConstant.FUN_40803010);
		logCodeCtlMap.put(ConstantParm.BUILDING + UPDATE, LogConstant.LOG_L408030100);
		funCodeCtlMap.put(ConstantParm.BUILDING + SHOW, FunConstant.FUN_40803011);
		logCodeCtlMap.put(ConstantParm.BUILDING + SHOW, LogConstant.LOG_L408030110);
		funCodeCtlMap.put(ConstantParm.BUILDING + ENABLE, FunConstant.FUN_40803012);
		logCodeCtlMap.put(ConstantParm.BUILDING + ENABLE, LogConstant.LOG_L408030120);
		funCodeCtlMap.put(ConstantParm.BUILDING + TAKEOVER, FunConstant.FUN_40803082);
		logCodeCtlMap.put(ConstantParm.BUILDING + TAKEOVER, LogConstant.LOG_L408030820);
		funCodeCtlMap.put(ConstantParm.BUILDING + DISTRIBUTE, FunConstant.FUN_40813082);
		logCodeCtlMap.put(ConstantParm.BUILDING + DISTRIBUTE, LogConstant.LOG_L408130820);
		//-----------------------------楼层--------------------------------------
		funCodeCtlMap.put(ConstantParm.FLOOR + UPDATE, FunConstant.FUN_40803016);
		logCodeCtlMap.put(ConstantParm.FLOOR + UPDATE, LogConstant.LOG_L408030160);
		funCodeCtlMap.put(ConstantParm.FLOOR + SHOW, FunConstant.FUN_40803017);
		logCodeCtlMap.put(ConstantParm.FLOOR + SHOW, LogConstant.LOG_L408030170);
		funCodeCtlMap.put(ConstantParm.FLOOR + ENABLE, FunConstant.FUN_40803018);
		logCodeCtlMap.put(ConstantParm.FLOOR + ENABLE, LogConstant.LOG_L408030180);
		funCodeCtlMap.put(ConstantParm.FLOOR + TAKEOVER, FunConstant.FUN_40803083);
		logCodeCtlMap.put(ConstantParm.FLOOR + TAKEOVER, LogConstant.LOG_L408030830);
		funCodeCtlMap.put(ConstantParm.FLOOR + DISTRIBUTE, FunConstant.FUN_40813083);
		logCodeCtlMap.put(ConstantParm.FLOOR + DISTRIBUTE, LogConstant.LOG_L408130830);
		//-----------------------------床型--------------------------------------
		funCodeCtlMap.put(ConstantParm.BEDTYP + UPDATE, FunConstant.FUN_40803019);
		logCodeCtlMap.put(ConstantParm.BEDTYP + UPDATE, LogConstant.LOG_L408030190);
		funCodeCtlMap.put(ConstantParm.BEDTYP + SHOW, FunConstant.FUN_40803020);
		logCodeCtlMap.put(ConstantParm.BEDTYP + SHOW, LogConstant.LOG_L408030200);
		funCodeCtlMap.put(ConstantParm.BEDTYP + ENABLE, FunConstant.FUN_40803021);
		logCodeCtlMap.put(ConstantParm.BEDTYP + ENABLE, LogConstant.LOG_L408030210);
		funCodeCtlMap.put(ConstantParm.BEDTYP + TAKEOVER, FunConstant.FUN_40803084);
		logCodeCtlMap.put(ConstantParm.BEDTYP + TAKEOVER, LogConstant.LOG_L408030840);
		funCodeCtlMap.put(ConstantParm.BEDTYP + DISTRIBUTE, FunConstant.FUN_40813084);
		logCodeCtlMap.put(ConstantParm.BEDTYP + DISTRIBUTE, LogConstant.LOG_L408130840);
		//-----------------------------换房原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + UPDATE, FunConstant.FUN_40803028);
		logCodeCtlMap.put(ConstantParm.RMCHANGERSN + UPDATE, LogConstant.LOG_L408030280);
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + SHOW, FunConstant.FUN_40803029);
		logCodeCtlMap.put(ConstantParm.RMCHANGERSN + SHOW, LogConstant.LOG_L408030290);
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + ENABLE, FunConstant.FUN_40803030);
		logCodeCtlMap.put(ConstantParm.RMCHANGERSN + ENABLE, LogConstant.LOG_L408030300);
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + TAKEOVER, FunConstant.FUN_40803085);
		logCodeCtlMap.put(ConstantParm.RMCHANGERSN + TAKEOVER, LogConstant.LOG_L408030850);
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + DISTRIBUTE, FunConstant.FUN_40813085);
		logCodeCtlMap.put(ConstantParm.RMCHANGERSN + DISTRIBUTE, LogConstant.LOG_L408130850);
		//-----------------------------房间特点--------------------------------------
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + UPDATE, FunConstant.FUN_40803025);
		logCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + UPDATE, LogConstant.LOG_L408030250);
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + SHOW, FunConstant.FUN_40803026);
		logCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + SHOW, LogConstant.LOG_L408030260);
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + ENABLE, FunConstant.FUN_40803027);
		logCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + ENABLE, LogConstant.LOG_L408030270);
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + TAKEOVER, FunConstant.FUN_40803086);
		logCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + TAKEOVER, LogConstant.LOG_L408030860);
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + DISTRIBUTE, FunConstant.FUN_40813086);
		logCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + DISTRIBUTE, LogConstant.LOG_L408130860);
		//-----------------------------房型分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + UPDATE, FunConstant.FUN_40803001);
		logCodeCtlMap.put(ConstantParm.ROOMTYPGRP + UPDATE, LogConstant.LOG_L408030010);
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + SHOW, FunConstant.FUN_40803002);
		logCodeCtlMap.put(ConstantParm.ROOMTYPGRP + SHOW, LogConstant.LOG_L408030020);
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + ENABLE, FunConstant.FUN_40803003);
		logCodeCtlMap.put(ConstantParm.ROOMTYPGRP + ENABLE, LogConstant.LOG_L408030030);
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + TAKEOVER, FunConstant.FUN_40803087);
		logCodeCtlMap.put(ConstantParm.ROOMTYPGRP + TAKEOVER, LogConstant.LOG_L408030870);
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + DISTRIBUTE, FunConstant.FUN_40813087);
		logCodeCtlMap.put(ConstantParm.ROOMTYPGRP + DISTRIBUTE, LogConstant.LOG_L408130870);
		//-----------------------------维修房原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.REPIARRSN + UPDATE, FunConstant.FUN_40803022);
		logCodeCtlMap.put(ConstantParm.REPIARRSN + UPDATE, LogConstant.LOG_L408030220);
		funCodeCtlMap.put(ConstantParm.REPIARRSN + SHOW, FunConstant.FUN_40803023);
		logCodeCtlMap.put(ConstantParm.REPIARRSN + SHOW, LogConstant.LOG_L408030230);
		funCodeCtlMap.put(ConstantParm.REPIARRSN + ENABLE, FunConstant.FUN_40803024);
		logCodeCtlMap.put(ConstantParm.REPIARRSN + ENABLE, LogConstant.LOG_L408030240);
		funCodeCtlMap.put(ConstantParm.REPIARRSN + TAKEOVER, FunConstant.FUN_40803089);
		logCodeCtlMap.put(ConstantParm.REPIARRSN + TAKEOVER, LogConstant.LOG_L408030890);
		funCodeCtlMap.put(ConstantParm.REPIARRSN + DISTRIBUTE, FunConstant.FUN_40813089);
		logCodeCtlMap.put(ConstantParm.REPIARRSN + DISTRIBUTE, LogConstant.LOG_L408130890);
		//-----------------------------交易代码分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.TRNCLS + UPDATE, FunConstant.FUN_40805001);
		logCodeCtlMap.put(ConstantParm.TRNCLS + UPDATE, LogConstant.LOG_L408050010);
		funCodeCtlMap.put(ConstantParm.TRNCLS + SHOW, FunConstant.FUN_40805002);
		logCodeCtlMap.put(ConstantParm.TRNCLS + SHOW, LogConstant.LOG_L408050020);
		funCodeCtlMap.put(ConstantParm.TRNCLS + ENABLE, FunConstant.FUN_40805003);
		logCodeCtlMap.put(ConstantParm.TRNCLS + ENABLE, LogConstant.LOG_L408050030);
		funCodeCtlMap.put(ConstantParm.TRNCLS + TAKEOVER, FunConstant.FUN_40805081);
		logCodeCtlMap.put(ConstantParm.TRNCLS + TAKEOVER, LogConstant.LOG_L408050810);
		funCodeCtlMap.put(ConstantParm.TRNCLS + DISTRIBUTE, FunConstant.FUN_40815081);
		logCodeCtlMap.put(ConstantParm.TRNCLS + DISTRIBUTE, LogConstant.LOG_L408150810);
		//-----------------------------交易代码子分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + UPDATE, FunConstant.FUN_40805004);
		logCodeCtlMap.put(ConstantParm.TRNSUBCLS + UPDATE, LogConstant.LOG_L408050040);
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + SHOW, FunConstant.FUN_40805005);
		logCodeCtlMap.put(ConstantParm.TRNSUBCLS + SHOW, LogConstant.LOG_L408050050);
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + ENABLE, FunConstant.FUN_40805006);
		logCodeCtlMap.put(ConstantParm.TRNSUBCLS + ENABLE, LogConstant.LOG_L408050060);
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + TAKEOVER, FunConstant.FUN_40805082);
		logCodeCtlMap.put(ConstantParm.TRNSUBCLS + TAKEOVER, LogConstant.LOG_L408050820);
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + DISTRIBUTE, FunConstant.FUN_40815082);
		logCodeCtlMap.put(ConstantParm.TRNSUBCLS + DISTRIBUTE, LogConstant.LOG_L408150820);
		//-----------------------------服务费率--------------------------------------
		funCodeCtlMap.put(ConstantParm.SVCTYP + UPDATE, FunConstant.FUN_40805010);
		logCodeCtlMap.put(ConstantParm.SVCTYP + UPDATE, LogConstant.LOG_L408050100);
		funCodeCtlMap.put(ConstantParm.SVCTYP + SHOW, FunConstant.FUN_40805011);
		logCodeCtlMap.put(ConstantParm.SVCTYP + SHOW, LogConstant.LOG_L408050110);
		funCodeCtlMap.put(ConstantParm.SVCTYP + ENABLE, FunConstant.FUN_40805012);
		logCodeCtlMap.put(ConstantParm.SVCTYP + ENABLE, LogConstant.LOG_L408050120);
		funCodeCtlMap.put(ConstantParm.SVCTYP + TAKEOVER, FunConstant.FUN_40805084);
		logCodeCtlMap.put(ConstantParm.SVCTYP + TAKEOVER, LogConstant.LOG_L408050840);
		funCodeCtlMap.put(ConstantParm.SVCTYP + DISTRIBUTE, FunConstant.FUN_40815084);
		logCodeCtlMap.put(ConstantParm.SVCTYP + DISTRIBUTE, LogConstant.LOG_L408150840);
		//-----------------------------银行卡类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.CCARDTYP + UPDATE, FunConstant.FUN_40805016);
		logCodeCtlMap.put(ConstantParm.CCARDTYP + UPDATE, LogConstant.LOG_L408050160);
		funCodeCtlMap.put(ConstantParm.CCARDTYP + SHOW, FunConstant.FUN_40805017);
		logCodeCtlMap.put(ConstantParm.CCARDTYP + SHOW, LogConstant.LOG_L408050170);
		funCodeCtlMap.put(ConstantParm.CCARDTYP + ENABLE, FunConstant.FUN_40805018);
		logCodeCtlMap.put(ConstantParm.CCARDTYP + ENABLE, LogConstant.LOG_L408050180);
		funCodeCtlMap.put(ConstantParm.CCARDTYP + TAKEOVER, FunConstant.FUN_40805086);
		logCodeCtlMap.put(ConstantParm.CCARDTYP + TAKEOVER, LogConstant.LOG_L408050860);
		funCodeCtlMap.put(ConstantParm.CCARDTYP + DISTRIBUTE, FunConstant.FUN_40815086);
		logCodeCtlMap.put(ConstantParm.CCARDTYP + DISTRIBUTE, LogConstant.LOG_L408150860);
		//-----------------------------商品大类配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.GOODSCLS + UPDATE, FunConstant.FUN_40805022);
		logCodeCtlMap.put(ConstantParm.GOODSCLS + UPDATE, LogConstant.LOG_L408050220);
		funCodeCtlMap.put(ConstantParm.GOODSCLS + SHOW, FunConstant.FUN_40805023);
		logCodeCtlMap.put(ConstantParm.GOODSCLS + SHOW, LogConstant.LOG_L408050230);
		funCodeCtlMap.put(ConstantParm.GOODSCLS + ENABLE, FunConstant.FUN_40805024);
		logCodeCtlMap.put(ConstantParm.GOODSCLS + ENABLE, LogConstant.LOG_L408050240);
		funCodeCtlMap.put(ConstantParm.GOODSCLS + TAKEOVER, FunConstant.FUN_40805087);
		logCodeCtlMap.put(ConstantParm.GOODSCLS + TAKEOVER, LogConstant.LOG_L408050870);
		funCodeCtlMap.put(ConstantParm.GOODSCLS + DISTRIBUTE, FunConstant.FUN_40815087);
		logCodeCtlMap.put(ConstantParm.GOODSCLS + DISTRIBUTE, LogConstant.LOG_L408150870);
		//-----------------------------商品小类配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + UPDATE, FunConstant.FUN_40805025);
		logCodeCtlMap.put(ConstantParm.GOODSSUBCLS + UPDATE, LogConstant.LOG_L408050250);
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + SHOW, FunConstant.FUN_40805026);
		logCodeCtlMap.put(ConstantParm.GOODSSUBCLS + SHOW, LogConstant.LOG_L408050260);
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + ENABLE, FunConstant.FUN_40805027);
		logCodeCtlMap.put(ConstantParm.GOODSSUBCLS + ENABLE, LogConstant.LOG_L408050270);
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + TAKEOVER, FunConstant.FUN_40805088);
		logCodeCtlMap.put(ConstantParm.GOODSSUBCLS + TAKEOVER, LogConstant.LOG_L408050880);
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + DISTRIBUTE, FunConstant.FUN_40815088);
		logCodeCtlMap.put(ConstantParm.GOODSSUBCLS + DISTRIBUTE, LogConstant.LOG_L408150880);
		//-----------------------------商品单位配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + UPDATE, FunConstant.FUN_40805028);
		logCodeCtlMap.put(ConstantParm.GOODSUNIT + UPDATE, LogConstant.LOG_L408050280);
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + SHOW, FunConstant.FUN_40805029);
		logCodeCtlMap.put(ConstantParm.GOODSUNIT + SHOW, LogConstant.LOG_L408050290);
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + ENABLE, FunConstant.FUN_40805030);
		logCodeCtlMap.put(ConstantParm.GOODSUNIT + ENABLE, LogConstant.LOG_L408050300);
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + TAKEOVER, FunConstant.FUN_40805089);
		logCodeCtlMap.put(ConstantParm.GOODSUNIT + TAKEOVER, LogConstant.LOG_L408050890);
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + DISTRIBUTE, FunConstant.FUN_40815089);
		logCodeCtlMap.put(ConstantParm.GOODSUNIT + DISTRIBUTE, LogConstant.LOG_L408150890);
		//-----------------------------全日/半日房费配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + UPDATE, FunConstant.FUN_40805037);
		logCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + UPDATE, LogConstant.LOG_L408050370);
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + SHOW, FunConstant.FUN_40805038);
		logCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + SHOW, LogConstant.LOG_L408050380);
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + ENABLE, FunConstant.FUN_40805039);
		logCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + ENABLE, LogConstant.LOG_L408050390);
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + TAKEOVER, FunConstant.FUN_40805093);
		logCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + TAKEOVER, LogConstant.LOG_L408050930);
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + DISTRIBUTE, FunConstant.FUN_40815093);
		logCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + DISTRIBUTE, LogConstant.LOG_L408150930);
		//-----------------------------发票项目配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + UPDATE, FunConstant.FUN_40805059);
		logCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + UPDATE, LogConstant.LOG_L408050590);
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + SHOW, FunConstant.FUN_40805060);
		logCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + SHOW, LogConstant.LOG_L408050600);
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + ENABLE, FunConstant.FUN_40805061);
		logCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + ENABLE, LogConstant.LOG_L408050610);
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + TAKEOVER, FunConstant.FUN_40805092);
		logCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + TAKEOVER, LogConstant.LOG_L408050920);
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + DISTRIBUTE, FunConstant.FUN_40815092);
		logCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + DISTRIBUTE, LogConstant.LOG_L408150920);
		//-----------------------------应收账户类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.ARTYPE + UPDATE, FunConstant.FUN_40805501);
		logCodeCtlMap.put(ConstantParm.ARTYPE + UPDATE, LogConstant.LOG_L408055010);
		funCodeCtlMap.put(ConstantParm.ARTYPE + SHOW, FunConstant.FUN_40805502);
		logCodeCtlMap.put(ConstantParm.ARTYPE + SHOW, LogConstant.LOG_L408055020);
		funCodeCtlMap.put(ConstantParm.ARTYPE + ENABLE, FunConstant.FUN_40805503);
		logCodeCtlMap.put(ConstantParm.ARTYPE + ENABLE, LogConstant.LOG_L408055030);
		funCodeCtlMap.put(ConstantParm.ARTYPE + TAKEOVER, FunConstant.FUN_40805580);
		logCodeCtlMap.put(ConstantParm.ARTYPE + TAKEOVER, LogConstant.LOG_L408055800);
		funCodeCtlMap.put(ConstantParm.ARTYPE + DISTRIBUTE, FunConstant.FUN_40815580);
		logCodeCtlMap.put(ConstantParm.ARTYPE + DISTRIBUTE, LogConstant.LOG_L408155800);
		//-----------------------------应收付款周期--------------------------------------
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + UPDATE, FunConstant.FUN_40805504);
		logCodeCtlMap.put(ConstantParm.ARPAYCYCLE + UPDATE, LogConstant.LOG_L408055040);
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + SHOW, FunConstant.FUN_40805505);
		logCodeCtlMap.put(ConstantParm.ARPAYCYCLE + SHOW, LogConstant.LOG_L408055050);
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + ENABLE, FunConstant.FUN_40805506);
		logCodeCtlMap.put(ConstantParm.ARPAYCYCLE + ENABLE, LogConstant.LOG_L408055060);
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + TAKEOVER, FunConstant.FUN_40805581);
		logCodeCtlMap.put(ConstantParm.ARPAYCYCLE + TAKEOVER, LogConstant.LOG_L408055810);
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + DISTRIBUTE, FunConstant.FUN_40815581);
		logCodeCtlMap.put(ConstantParm.ARPAYCYCLE + DISTRIBUTE, LogConstant.LOG_L408155810);
		//-----------------------------应收对账周期--------------------------------------
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + UPDATE, FunConstant.FUN_40805507);
		logCodeCtlMap.put(ConstantParm.ARSTATCYCLE + UPDATE, LogConstant.LOG_L408055070);
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + SHOW, FunConstant.FUN_40805508);
		logCodeCtlMap.put(ConstantParm.ARSTATCYCLE + SHOW, LogConstant.LOG_L408055080);
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + ENABLE, FunConstant.FUN_40805509);
		logCodeCtlMap.put(ConstantParm.ARSTATCYCLE + ENABLE, LogConstant.LOG_L408055090);
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + TAKEOVER, FunConstant.FUN_40805582);
		logCodeCtlMap.put(ConstantParm.ARSTATCYCLE + TAKEOVER, LogConstant.LOG_L408055820);
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + DISTRIBUTE, FunConstant.FUN_40815582);
		logCodeCtlMap.put(ConstantParm.ARSTATCYCLE + DISTRIBUTE, LogConstant.LOG_L408155820);
		//-----------------------------价格大分类--------------------------------------
		funCodeCtlMap.put(ConstantParm.RATEGRP + UPDATE, FunConstant.FUN_40802001);
		logCodeCtlMap.put(ConstantParm.RATEGRP + UPDATE, LogConstant.LOG_L408020010);
		funCodeCtlMap.put(ConstantParm.RATEGRP + SHOW, FunConstant.FUN_40802002);
		logCodeCtlMap.put(ConstantParm.RATEGRP + SHOW, LogConstant.LOG_L408020020);
		funCodeCtlMap.put(ConstantParm.RATEGRP + ENABLE, FunConstant.FUN_40802003);
		logCodeCtlMap.put(ConstantParm.RATEGRP + ENABLE, LogConstant.LOG_L408020030);
		funCodeCtlMap.put(ConstantParm.RATEGRP + TAKEOVER, FunConstant.FUN_40802080);
		logCodeCtlMap.put(ConstantParm.RATEGRP + TAKEOVER, LogConstant.LOG_L408020800);
		funCodeCtlMap.put(ConstantParm.RATEGRP + DISTRIBUTE, FunConstant.FUN_40812080);
		logCodeCtlMap.put(ConstantParm.RATEGRP + DISTRIBUTE, LogConstant.LOG_L408120800);
		//-----------------------------价格小分类--------------------------------------
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + UPDATE, FunConstant.FUN_40802004);
		logCodeCtlMap.put(ConstantParm.RATESUBGRP + UPDATE, LogConstant.LOG_L408020040);
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + SHOW, FunConstant.FUN_40802005);
		logCodeCtlMap.put(ConstantParm.RATESUBGRP + SHOW, LogConstant.LOG_L408020050);
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + ENABLE, FunConstant.FUN_40802006);
		logCodeCtlMap.put(ConstantParm.RATESUBGRP + ENABLE, LogConstant.LOG_L408020060);
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + TAKEOVER, FunConstant.FUN_40802081);
		logCodeCtlMap.put(ConstantParm.RATESUBGRP + TAKEOVER, LogConstant.LOG_L408020810);
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + DISTRIBUTE, FunConstant.FUN_40812081);
		logCodeCtlMap.put(ConstantParm.RATESUBGRP + DISTRIBUTE, LogConstant.LOG_L408120810);
		//-----------------------------团队类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.GROUPTYP + UPDATE, FunConstant.FUN_40809501);
		logCodeCtlMap.put(ConstantParm.GROUPTYP + UPDATE, LogConstant.LOG_L408095010);
		funCodeCtlMap.put(ConstantParm.GROUPTYP + SHOW, FunConstant.FUN_40809502);
		logCodeCtlMap.put(ConstantParm.GROUPTYP + SHOW, LogConstant.LOG_L408095020);
		funCodeCtlMap.put(ConstantParm.GROUPTYP + ENABLE, FunConstant.FUN_40809504);
		logCodeCtlMap.put(ConstantParm.GROUPTYP + ENABLE, LogConstant.LOG_L408095040);
		funCodeCtlMap.put(ConstantParm.GROUPTYP + TAKEOVER, FunConstant.FUN_40809503);
		logCodeCtlMap.put(ConstantParm.GROUPTYP + TAKEOVER, LogConstant.LOG_L408095030);
		funCodeCtlMap.put(ConstantParm.GROUPTYP + DISTRIBUTE, FunConstant.FUN_40819503);
		logCodeCtlMap.put(ConstantParm.GROUPTYP + DISTRIBUTE, LogConstant.LOG_L408195030);
		//-----------------------------销售类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.SALESPHASE + UPDATE, FunConstant.FUN_40809505);
		logCodeCtlMap.put(ConstantParm.SALESPHASE + UPDATE, LogConstant.LOG_L408095050);
		funCodeCtlMap.put(ConstantParm.SALESPHASE + SHOW, FunConstant.FUN_40809506);
		logCodeCtlMap.put(ConstantParm.SALESPHASE + SHOW, LogConstant.LOG_L408095060);
		funCodeCtlMap.put(ConstantParm.SALESPHASE + ENABLE, FunConstant.FUN_40809508);
		logCodeCtlMap.put(ConstantParm.SALESPHASE + ENABLE, LogConstant.LOG_L408095080);
		funCodeCtlMap.put(ConstantParm.SALESPHASE + TAKEOVER, FunConstant.FUN_40809507);
		logCodeCtlMap.put(ConstantParm.SALESPHASE + TAKEOVER, LogConstant.LOG_L408095070);
		funCodeCtlMap.put(ConstantParm.SALESPHASE + DISTRIBUTE, FunConstant.FUN_40819507);
		logCodeCtlMap.put(ConstantParm.SALESPHASE + DISTRIBUTE, LogConstant.LOG_L408195070);
		//-----------------------------部门类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.DEPTTYP + UPDATE, FunConstant.FUN_40800028);
		logCodeCtlMap.put(ConstantParm.DEPTTYP + UPDATE, LogConstant.LOG_L408000280);
		funCodeCtlMap.put(ConstantParm.DEPTTYP + SHOW, FunConstant.FUN_40800029);
		logCodeCtlMap.put(ConstantParm.DEPTTYP + SHOW, LogConstant.LOG_L408000290);
		funCodeCtlMap.put(ConstantParm.DEPTTYP + ENABLE, FunConstant.FUN_40800030);
		logCodeCtlMap.put(ConstantParm.DEPTTYP + ENABLE, LogConstant.LOG_L408000300);
		funCodeCtlMap.put(ConstantParm.DEPTTYP + TAKEOVER, FunConstant.FUN_40800034);
		logCodeCtlMap.put(ConstantParm.DEPTTYP + TAKEOVER, LogConstant.LOG_L408000340);
		funCodeCtlMap.put(ConstantParm.DEPTTYP + DISTRIBUTE, FunConstant.FUN_40810034);
		logCodeCtlMap.put(ConstantParm.DEPTTYP + DISTRIBUTE, LogConstant.LOG_L408100340);
		//-----------------------------职务--------------------------------------
		funCodeCtlMap.put(ConstantParm.WORKTITLE + UPDATE, FunConstant.FUN_40800004);
		logCodeCtlMap.put(ConstantParm.WORKTITLE + UPDATE, LogConstant.LOG_L408000040);
		funCodeCtlMap.put(ConstantParm.WORKTITLE + SHOW, FunConstant.FUN_40800005);
		logCodeCtlMap.put(ConstantParm.WORKTITLE + SHOW, LogConstant.LOG_L408000050);
		funCodeCtlMap.put(ConstantParm.WORKTITLE + ENABLE, FunConstant.FUN_40800006);
		logCodeCtlMap.put(ConstantParm.WORKTITLE + ENABLE, LogConstant.LOG_L408000060);
		funCodeCtlMap.put(ConstantParm.WORKTITLE + TAKEOVER, FunConstant.FUN_40800031);
		logCodeCtlMap.put(ConstantParm.WORKTITLE + TAKEOVER, LogConstant.LOG_L408000310);
		funCodeCtlMap.put(ConstantParm.WORKTITLE + DISTRIBUTE, FunConstant.FUN_40810031);
		logCodeCtlMap.put(ConstantParm.WORKTITLE + DISTRIBUTE, LogConstant.LOG_L408100310);
		//-----------------------------职员角色--------------------------------------
		funCodeCtlMap.put(ConstantParm.EMPLROLE + UPDATE, FunConstant.FUN_40800010);
		logCodeCtlMap.put(ConstantParm.EMPLROLE + UPDATE, LogConstant.LOG_L408000100);
		funCodeCtlMap.put(ConstantParm.EMPLROLE + SHOW, FunConstant.FUN_40800011);
		logCodeCtlMap.put(ConstantParm.EMPLROLE + SHOW, LogConstant.LOG_L408000110);
		funCodeCtlMap.put(ConstantParm.EMPLROLE + ENABLE, FunConstant.FUN_40800012);
		logCodeCtlMap.put(ConstantParm.EMPLROLE + ENABLE, LogConstant.LOG_L408000120);
		funCodeCtlMap.put(ConstantParm.EMPLROLE + TAKEOVER, FunConstant.FUN_40800032);
		logCodeCtlMap.put(ConstantParm.EMPLROLE + TAKEOVER, LogConstant.LOG_L408000320);
		funCodeCtlMap.put(ConstantParm.EMPLROLE + DISTRIBUTE, FunConstant.FUN_40810032);
		logCodeCtlMap.put(ConstantParm.EMPLROLE + DISTRIBUTE, LogConstant.LOG_L408100320);
		//-----------------------------销售员分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.SALERGRP + UPDATE, FunConstant.FUN_40800013);
		logCodeCtlMap.put(ConstantParm.SALERGRP + UPDATE, LogConstant.LOG_L408000130);
		funCodeCtlMap.put(ConstantParm.SALERGRP + SHOW, FunConstant.FUN_40800014);
		logCodeCtlMap.put(ConstantParm.SALERGRP + SHOW, LogConstant.LOG_L408000140);
		funCodeCtlMap.put(ConstantParm.SALERGRP + ENABLE, FunConstant.FUN_40800015);
		logCodeCtlMap.put(ConstantParm.SALERGRP + ENABLE, LogConstant.LOG_L408000150);
		funCodeCtlMap.put(ConstantParm.SALERGRP + TAKEOVER, FunConstant.FUN_40800033);
		logCodeCtlMap.put(ConstantParm.SALERGRP + TAKEOVER, LogConstant.LOG_L408000330);
		funCodeCtlMap.put(ConstantParm.SALERGRP + DISTRIBUTE, FunConstant.FUN_40810033);
		logCodeCtlMap.put(ConstantParm.SALERGRP + DISTRIBUTE, LogConstant.LOG_L408100330);
		//-----------------------------设施服务类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.UNITPROP + SHOW, FunConstant.FUN_40809022);
		funCodeCtlMap.put(ConstantParm.UNITPROP + UPDATE, FunConstant.FUN_40809023);
		funCodeCtlMap.put(ConstantParm.UNITPROP + ENABLE, FunConstant.FUN_40809025);
		funCodeCtlMap.put(ConstantParm.UNITPROP + TAKEOVER, FunConstant.FUN_40809026);
		funCodeCtlMap.put(ConstantParm.UNITPROP + DISTRIBUTE, FunConstant.FUN_40819026);
		logCodeCtlMap.put(ConstantParm.UNITPROP + SHOW, LogConstant.LOG_L408090220);
		logCodeCtlMap.put(ConstantParm.UNITPROP + UPDATE, LogConstant.LOG_L408090230);
		logCodeCtlMap.put(ConstantParm.UNITPROP + ENABLE, LogConstant.LOG_L408090250);
		logCodeCtlMap.put(ConstantParm.UNITPROP + TAKEOVER, LogConstant.LOG_L408090260);
		logCodeCtlMap.put(ConstantParm.UNITPROP + DISTRIBUTE, LogConstant.LOG_L408190260);
		//-----------------------------酒店设施服--------------------------------------
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + SHOW, FunConstant.FUN_40809027);
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + UPDATE, FunConstant.FUN_40809028);
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + ENABLE, FunConstant.FUN_40809030);
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + TAKEOVER, FunConstant.FUN_40809031);
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + DISTRIBUTE, FunConstant.FUN_40819031);
		logCodeCtlMap.put(ConstantParm.UNITPROPVLU + SHOW, LogConstant.LOG_L408090270);
		logCodeCtlMap.put(ConstantParm.UNITPROPVLU + UPDATE, LogConstant.LOG_L408090280);
		logCodeCtlMap.put(ConstantParm.UNITPROPVLU + ENABLE, LogConstant.LOG_L408090300);
		logCodeCtlMap.put(ConstantParm.UNITPROPVLU + TAKEOVER, LogConstant.LOG_L408090310);
		logCodeCtlMap.put(ConstantParm.UNITPROPVLU + DISTRIBUTE, LogConstant.LOG_L408190310);
		//-----------------------------房型设施类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + SHOW, FunConstant.FUN_40809032);
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + UPDATE, FunConstant.FUN_40809033);
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + ENABLE, FunConstant.FUN_40809035);
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + TAKEOVER, FunConstant.FUN_40809036);
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + DISTRIBUTE, FunConstant.FUN_40819036);
		logCodeCtlMap.put(ConstantParm.RMTYPPROP + SHOW, LogConstant.LOG_L408090320);
		logCodeCtlMap.put(ConstantParm.RMTYPPROP + UPDATE, LogConstant.LOG_L408090330);
		logCodeCtlMap.put(ConstantParm.RMTYPPROP + ENABLE, LogConstant.LOG_L408090350);
		logCodeCtlMap.put(ConstantParm.RMTYPPROP + TAKEOVER, LogConstant.LOG_L408090360);
		logCodeCtlMap.put(ConstantParm.RMTYPPROP + DISTRIBUTE, LogConstant.LOG_L408190360);
		//-----------------------------房型设施--------------------------------------
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + SHOW, FunConstant.FUN_40809037);
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + UPDATE, FunConstant.FUN_40809038);
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + ENABLE, FunConstant.FUN_40809040);
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + TAKEOVER, FunConstant.FUN_40809041);
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + DISTRIBUTE, FunConstant.FUN_40819041);
		logCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + SHOW, LogConstant.LOG_L408090370);
		logCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + UPDATE, LogConstant.LOG_L408090380);
		logCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + ENABLE, LogConstant.LOG_L408090400);
		logCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + TAKEOVER, LogConstant.LOG_L408090410);
		logCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + DISTRIBUTE, LogConstant.LOG_L408190410);
		//-----------------------------酒店标签--------------------------------------
		funCodeCtlMap.put(ConstantParm.UNITTAG + SHOW, FunConstant.FUN_40809042);
		funCodeCtlMap.put(ConstantParm.UNITTAG + UPDATE, FunConstant.FUN_40809043);
		funCodeCtlMap.put(ConstantParm.UNITTAG + ENABLE, FunConstant.FUN_40809044);
		funCodeCtlMap.put(ConstantParm.UNITTAG + TAKEOVER, FunConstant.FUN_40809045);
		funCodeCtlMap.put(ConstantParm.UNITTAG + DISTRIBUTE, FunConstant.FUN_40819045);
		logCodeCtlMap.put(ConstantParm.UNITTAG + SHOW, LogConstant.LOG_L408090420);
		logCodeCtlMap.put(ConstantParm.UNITTAG + UPDATE, LogConstant.LOG_L408090430);
		logCodeCtlMap.put(ConstantParm.UNITTAG + ENABLE, LogConstant.LOG_L408090440);
		logCodeCtlMap.put(ConstantParm.UNITTAG + TAKEOVER, LogConstant.LOG_L408090450);
		logCodeCtlMap.put(ConstantParm.UNITTAG + DISTRIBUTE, LogConstant.LOG_L408190450);
		//-----------------------------房型标签--------------------------------------
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + SHOW, FunConstant.FUN_40809046);
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + UPDATE, FunConstant.FUN_40809047);
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + ENABLE, FunConstant.FUN_40809048);
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + TAKEOVER, FunConstant.FUN_40809049);
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + DISTRIBUTE, FunConstant.FUN_40819049);
		logCodeCtlMap.put(ConstantParm.RMTYPTAG + SHOW, LogConstant.LOG_L408090460);
		logCodeCtlMap.put(ConstantParm.RMTYPTAG + UPDATE, LogConstant.LOG_L408090470);
		logCodeCtlMap.put(ConstantParm.RMTYPTAG + ENABLE, LogConstant.LOG_L408090480);
		logCodeCtlMap.put(ConstantParm.RMTYPTAG + TAKEOVER, LogConstant.LOG_L408090490);
		logCodeCtlMap.put(ConstantParm.RMTYPTAG + DISTRIBUTE, LogConstant.LOG_L408190490);
		//-----------------------------图片标签--------------------------------------
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + SHOW, FunConstant.FUN_40809050);
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + UPDATE, FunConstant.FUN_40809051);
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + ENABLE, FunConstant.FUN_40809052);
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + TAKEOVER, FunConstant.FUN_40809053);
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + DISTRIBUTE, FunConstant.FUN_40819053);
		logCodeCtlMap.put(ConstantParm.UNITPICGRP + SHOW, LogConstant.LOG_L408090500);
		logCodeCtlMap.put(ConstantParm.UNITPICGRP + UPDATE, LogConstant.LOG_L408090510);
		logCodeCtlMap.put(ConstantParm.UNITPICGRP + ENABLE, LogConstant.LOG_L408090520);
		logCodeCtlMap.put(ConstantParm.UNITPICGRP + TAKEOVER, LogConstant.LOG_L408090530);
		logCodeCtlMap.put(ConstantParm.UNITPICGRP + DISTRIBUTE, LogConstant.LOG_L408190530);
		
		Map<String, String> tempCtlMap = new HashMap<String, String>();
		funCodeCtlMap.forEach((k, v) -> {
			tempCtlMap.put(k + "G", v + "G");
		});
		funCodeCtlMap.putAll(tempCtlMap);
		
		//-----------------------------市场分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.MARKETGRP + UPDATE+"H", FunConstant.FUN_40804016H);
		funCodeCtlMap.put(ConstantParm.MARKETGRP + SHOW+"H", FunConstant.FUN_40804017H);
		funCodeCtlMap.put(ConstantParm.MARKETGRP + ENABLE+"H", FunConstant.FUN_40804018H);
		funCodeCtlMap.put(ConstantParm.MARKETGRP + TAKEOVER+"H", FunConstant.FUN_40804081H);
		funCodeCtlMap.put(ConstantParm.MARKETGRP + DISTRIBUTE+"H", FunConstant.FUN_40814081H);
		//-----------------------------市场--------------------------------------
		funCodeCtlMap.put(ConstantParm.MARKET + UPDATE+"H", FunConstant.FUN_40804019H);
		funCodeCtlMap.put(ConstantParm.MARKET + SHOW+"H", FunConstant.FUN_40804020H);
		funCodeCtlMap.put(ConstantParm.MARKET + ENABLE+"H", FunConstant.FUN_40804021H);
		funCodeCtlMap.put(ConstantParm.MARKET + TAKEOVER+"H", FunConstant.FUN_40804082H);
		funCodeCtlMap.put(ConstantParm.MARKET + DISTRIBUTE+"H", FunConstant.FUN_40814082H);
		//-----------------------------客源分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + UPDATE+"H", FunConstant.FUN_40804022H);
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + SHOW+"H", FunConstant.FUN_40804023H);
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + ENABLE+"H", FunConstant.FUN_40804024H);
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + TAKEOVER+"H", FunConstant.FUN_40804090H);
		funCodeCtlMap.put(ConstantParm.SOURCEGRP + DISTRIBUTE+"H", FunConstant.FUN_40814090H);
		//-----------------------------客源--------------------------------------
		funCodeCtlMap.put(ConstantParm.SOURCE + UPDATE+"H", FunConstant.FUN_40804025H);
		funCodeCtlMap.put(ConstantParm.SOURCE + SHOW+"H", FunConstant.FUN_40804026H);
		funCodeCtlMap.put(ConstantParm.SOURCE + ENABLE+"H", FunConstant.FUN_40804027H);
		funCodeCtlMap.put(ConstantParm.SOURCE + TAKEOVER+"H", FunConstant.FUN_40804091H);
		funCodeCtlMap.put(ConstantParm.SOURCE + DISTRIBUTE+"H", FunConstant.FUN_40814091H);
		//-----------------------------预订取消原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.CANCELRSN + UPDATE+"H", FunConstant.FUN_40804010H);
		funCodeCtlMap.put(ConstantParm.CANCELRSN + SHOW+"H", FunConstant.FUN_40804011H);
		funCodeCtlMap.put(ConstantParm.CANCELRSN + ENABLE+"H", FunConstant.FUN_40804012H);
		funCodeCtlMap.put(ConstantParm.CANCELRSN + TAKEOVER+"H", FunConstant.FUN_40804083H);
		funCodeCtlMap.put(ConstantParm.CANCELRSN + DISTRIBUTE+"H", FunConstant.FUN_40814083H);
		//-----------------------------折扣原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.RATERSN + UPDATE+"H", FunConstant.FUN_40804013H);
		funCodeCtlMap.put(ConstantParm.RATERSN + SHOW+"H", FunConstant.FUN_40804014H);
		funCodeCtlMap.put(ConstantParm.RATERSN + ENABLE+"H", FunConstant.FUN_40804015H);
		funCodeCtlMap.put(ConstantParm.RATERSN + TAKEOVER+"H", FunConstant.FUN_40804084H);
		funCodeCtlMap.put(ConstantParm.RATERSN + DISTRIBUTE+"H", FunConstant.FUN_40814084H);
		//-----------------------------入住取消原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + UPDATE+"H", FunConstant.FUN_40804086H);
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + SHOW+"H", FunConstant.FUN_40804088H);
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + ENABLE+"H", FunConstant.FUN_40804089H);
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + TAKEOVER+"H", FunConstant.FUN_40804085H);
		funCodeCtlMap.put(ConstantParm.REINSTATERSN + DISTRIBUTE+"H", FunConstant.FUN_40814085H);
		//-----------------------------楼区--------------------------------------
		funCodeCtlMap.put(ConstantParm.AREA + UPDATE+"H", FunConstant.FUN_40803013H);
		funCodeCtlMap.put(ConstantParm.AREA + SHOW+"H", FunConstant.FUN_40803014H);
		funCodeCtlMap.put(ConstantParm.AREA + ENABLE+"H", FunConstant.FUN_40803015H);
		funCodeCtlMap.put(ConstantParm.AREA + TAKEOVER+"H", FunConstant.FUN_40803081H);
		funCodeCtlMap.put(ConstantParm.AREA + DISTRIBUTE+"H", FunConstant.FUN_40813081H);
		//-----------------------------楼座--------------------------------------
		funCodeCtlMap.put(ConstantParm.BUILDING + UPDATE+"H", FunConstant.FUN_40803010H);
		funCodeCtlMap.put(ConstantParm.BUILDING + SHOW+"H", FunConstant.FUN_40803011H);
		funCodeCtlMap.put(ConstantParm.BUILDING + ENABLE+"H", FunConstant.FUN_40803012H);
		funCodeCtlMap.put(ConstantParm.BUILDING + TAKEOVER+"H", FunConstant.FUN_40803082H);
		funCodeCtlMap.put(ConstantParm.BUILDING + DISTRIBUTE+"H", FunConstant.FUN_40813082H);
		//-----------------------------楼层--------------------------------------
		funCodeCtlMap.put(ConstantParm.FLOOR + UPDATE+"H", FunConstant.FUN_40803016H);
		funCodeCtlMap.put(ConstantParm.FLOOR + SHOW+"H", FunConstant.FUN_40803017H);
		funCodeCtlMap.put(ConstantParm.FLOOR + ENABLE+"H", FunConstant.FUN_40803018H);
		funCodeCtlMap.put(ConstantParm.FLOOR + TAKEOVER+"H", FunConstant.FUN_40803083H);
		funCodeCtlMap.put(ConstantParm.FLOOR + DISTRIBUTE+"H", FunConstant.FUN_40813083H);
		//-----------------------------床型--------------------------------------
		funCodeCtlMap.put(ConstantParm.BEDTYP + UPDATE+"H", FunConstant.FUN_40803019H);
		funCodeCtlMap.put(ConstantParm.BEDTYP + SHOW+"H", FunConstant.FUN_40803020H);
		funCodeCtlMap.put(ConstantParm.BEDTYP + ENABLE+"H", FunConstant.FUN_40803021H);
		funCodeCtlMap.put(ConstantParm.BEDTYP + TAKEOVER+"H", FunConstant.FUN_40803084H);
		funCodeCtlMap.put(ConstantParm.BEDTYP + DISTRIBUTE+"H", FunConstant.FUN_40813084H);
		//-----------------------------换房原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + UPDATE+"H", FunConstant.FUN_40803028H);
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + SHOW+"H", FunConstant.FUN_40803029H);
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + ENABLE+"H", FunConstant.FUN_40803030H);
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + TAKEOVER+"H", FunConstant.FUN_40803085H);
		funCodeCtlMap.put(ConstantParm.RMCHANGERSN + DISTRIBUTE+"H", FunConstant.FUN_40813085H);
		//-----------------------------房间特点--------------------------------------
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + UPDATE+"H", FunConstant.FUN_40803025H);
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + SHOW+"H", FunConstant.FUN_40803026H);
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + ENABLE+"H", FunConstant.FUN_40803027H);
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + TAKEOVER+"H", FunConstant.FUN_40803086H);
		funCodeCtlMap.put(ConstantParm.ROOMFEATURETYP + DISTRIBUTE+"H", FunConstant.FUN_40813086H);
		//-----------------------------房型分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + UPDATE+"H", FunConstant.FUN_40803001H);
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + SHOW+"H", FunConstant.FUN_40803002H);
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + ENABLE+"H", FunConstant.FUN_40803003H);
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + TAKEOVER+"H", FunConstant.FUN_40803087H);
		funCodeCtlMap.put(ConstantParm.ROOMTYPGRP + DISTRIBUTE+"H", FunConstant.FUN_40813087H);
		//-----------------------------维修房原因--------------------------------------
		funCodeCtlMap.put(ConstantParm.REPIARRSN + UPDATE+"H", FunConstant.FUN_40803022H);
		funCodeCtlMap.put(ConstantParm.REPIARRSN + SHOW+"H", FunConstant.FUN_40803023H);
		funCodeCtlMap.put(ConstantParm.REPIARRSN + ENABLE+"H", FunConstant.FUN_40803024H);
		funCodeCtlMap.put(ConstantParm.REPIARRSN + TAKEOVER+"H", FunConstant.FUN_40803089H);
		funCodeCtlMap.put(ConstantParm.REPIARRSN + DISTRIBUTE+"H", FunConstant.FUN_40813089H);
		//-----------------------------交易代码分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.TRNCLS + UPDATE+"H", FunConstant.FUN_40805001H);
		funCodeCtlMap.put(ConstantParm.TRNCLS + SHOW+"H", FunConstant.FUN_40805002H);
		funCodeCtlMap.put(ConstantParm.TRNCLS + ENABLE+"H", FunConstant.FUN_40805003H);
		funCodeCtlMap.put(ConstantParm.TRNCLS + TAKEOVER+"H", FunConstant.FUN_40805081H);
		funCodeCtlMap.put(ConstantParm.TRNCLS + DISTRIBUTE+"H", FunConstant.FUN_40815081H);
		//-----------------------------交易代码子分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + UPDATE+"H", FunConstant.FUN_40805004H);
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + SHOW+"H", FunConstant.FUN_40805005H);
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + ENABLE+"H", FunConstant.FUN_40805006H);
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + TAKEOVER+"H", FunConstant.FUN_40805082H);
		funCodeCtlMap.put(ConstantParm.TRNSUBCLS + DISTRIBUTE+"H", FunConstant.FUN_40815082H);
		//-----------------------------服务费率--------------------------------------
		funCodeCtlMap.put(ConstantParm.SVCTYP + UPDATE+"H", FunConstant.FUN_40805010H);
		funCodeCtlMap.put(ConstantParm.SVCTYP + SHOW+"H", FunConstant.FUN_40805011H);
		funCodeCtlMap.put(ConstantParm.SVCTYP + ENABLE+"H", FunConstant.FUN_40805012H);
		funCodeCtlMap.put(ConstantParm.SVCTYP + TAKEOVER+"H", FunConstant.FUN_40805084H);
		funCodeCtlMap.put(ConstantParm.SVCTYP + DISTRIBUTE+"H", FunConstant.FUN_40815084H);
		//-----------------------------银行卡类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.CCARDTYP + UPDATE+"H", FunConstant.FUN_40805016H);
		funCodeCtlMap.put(ConstantParm.CCARDTYP + SHOW+"H", FunConstant.FUN_40805017H);
		funCodeCtlMap.put(ConstantParm.CCARDTYP + ENABLE+"H", FunConstant.FUN_40805018H);
		funCodeCtlMap.put(ConstantParm.CCARDTYP + TAKEOVER+"H", FunConstant.FUN_40805086H);
		funCodeCtlMap.put(ConstantParm.CCARDTYP + DISTRIBUTE+"H", FunConstant.FUN_40815086H);
		//-----------------------------商品大类配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.GOODSCLS + UPDATE+"H", FunConstant.FUN_40805022H);
		funCodeCtlMap.put(ConstantParm.GOODSCLS + SHOW+"H", FunConstant.FUN_40805023H);
		funCodeCtlMap.put(ConstantParm.GOODSCLS + ENABLE+"H", FunConstant.FUN_40805024H);
		funCodeCtlMap.put(ConstantParm.GOODSCLS + TAKEOVER+"H", FunConstant.FUN_40805087H);
		funCodeCtlMap.put(ConstantParm.GOODSCLS + DISTRIBUTE+"H", FunConstant.FUN_40815087H);
		//-----------------------------商品小类配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + UPDATE+"H", FunConstant.FUN_40805025H);
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + SHOW+"H", FunConstant.FUN_40805026H);
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + ENABLE+"H", FunConstant.FUN_40805027H);
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + TAKEOVER+"H", FunConstant.FUN_40805088H);
		funCodeCtlMap.put(ConstantParm.GOODSSUBCLS + DISTRIBUTE+"H", FunConstant.FUN_40805088H);
		//-----------------------------商品单位配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + UPDATE+"H", FunConstant.FUN_40805028H);
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + SHOW+"H", FunConstant.FUN_40805029H);
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + ENABLE+"H", FunConstant.FUN_40805030H);
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + TAKEOVER+"H", FunConstant.FUN_40805089H);
		funCodeCtlMap.put(ConstantParm.GOODSUNIT + DISTRIBUTE+"H", FunConstant.FUN_40805089H);
		//-----------------------------全日/半日房费配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + UPDATE+"H", FunConstant.FUN_40805037H);
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + SHOW+"H", FunConstant.FUN_40805038H);
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + ENABLE+"H", FunConstant.FUN_40805039H);
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + TAKEOVER+"H", FunConstant.FUN_40805093H);
		funCodeCtlMap.put(ConstantParm.EXTRAROOMRATE + DISTRIBUTE+"H", FunConstant.FUN_40815093H);
		//-----------------------------发票项目配置--------------------------------------
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + UPDATE+"H", FunConstant.FUN_40805059H);
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + SHOW+"H", FunConstant.FUN_40805060H);
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + ENABLE+"H", FunConstant.FUN_40805061H);
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + TAKEOVER+"H", FunConstant.FUN_40805092H);
		funCodeCtlMap.put(ConstantParm.FINVCCHARGEITEM + DISTRIBUTE+"H", FunConstant.FUN_40815092H);
		//-----------------------------应收账户类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.ARTYPE + UPDATE+"H", FunConstant.FUN_40805501H);
		funCodeCtlMap.put(ConstantParm.ARTYPE + SHOW+"H", FunConstant.FUN_40805502H);
		funCodeCtlMap.put(ConstantParm.ARTYPE + ENABLE+"H", FunConstant.FUN_40805503H);
		funCodeCtlMap.put(ConstantParm.ARTYPE + TAKEOVER+"H", FunConstant.FUN_40805580H);
		funCodeCtlMap.put(ConstantParm.ARTYPE + DISTRIBUTE+"H", FunConstant.FUN_40815580H);
		//-----------------------------应收付款周期--------------------------------------
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + UPDATE+"H", FunConstant.FUN_40805504H);
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + SHOW+"H", FunConstant.FUN_40805505H);
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + ENABLE+"H", FunConstant.FUN_40805506H);
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + TAKEOVER+"H", FunConstant.FUN_40805581H);
		funCodeCtlMap.put(ConstantParm.ARPAYCYCLE + DISTRIBUTE+"H", FunConstant.FUN_40815581H);
		//-----------------------------应收对账周期--------------------------------------
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + UPDATE+"H", FunConstant.FUN_40805507H);
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + SHOW+"H", FunConstant.FUN_40805508H);
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + ENABLE+"H", FunConstant.FUN_40805509H);
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + TAKEOVER+"H", FunConstant.FUN_40805582H);
		funCodeCtlMap.put(ConstantParm.ARSTATCYCLE + DISTRIBUTE+"H", FunConstant.FUN_40815582H);
		//-----------------------------价格大分类--------------------------------------
		funCodeCtlMap.put(ConstantParm.RATEGRP + UPDATE+"H", FunConstant.FUN_40802001H);
		funCodeCtlMap.put(ConstantParm.RATEGRP + SHOW+"H", FunConstant.FUN_40802002H);
		funCodeCtlMap.put(ConstantParm.RATEGRP + ENABLE+"H", FunConstant.FUN_40802003H);
		funCodeCtlMap.put(ConstantParm.RATEGRP + TAKEOVER+"H", FunConstant.FUN_40802080H);
		funCodeCtlMap.put(ConstantParm.RATEGRP + DISTRIBUTE+"H", FunConstant.FUN_40812080H);
		//-----------------------------价格小分类--------------------------------------
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + UPDATE+"H", FunConstant.FUN_40802004H);
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + SHOW+"H", FunConstant.FUN_40802005H);
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + ENABLE+"H", FunConstant.FUN_40802006H);
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + TAKEOVER+"H", FunConstant.FUN_40802081H);
		funCodeCtlMap.put(ConstantParm.RATESUBGRP + DISTRIBUTE+"H", FunConstant.FUN_40812081H);
		//-----------------------------团队类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.GROUPTYP + UPDATE+"H", FunConstant.FUN_40809501H);
		funCodeCtlMap.put(ConstantParm.GROUPTYP + SHOW+"H", FunConstant.FUN_40809502H);
		funCodeCtlMap.put(ConstantParm.GROUPTYP + ENABLE+"H", FunConstant.FUN_40809504H);
		funCodeCtlMap.put(ConstantParm.GROUPTYP + TAKEOVER+"H", FunConstant.FUN_40809503H);
		funCodeCtlMap.put(ConstantParm.GROUPTYP + DISTRIBUTE+"H", FunConstant.FUN_40819503H);
		//-----------------------------销售类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.SALESPHASE + UPDATE+"H", FunConstant.FUN_40809505H);
		funCodeCtlMap.put(ConstantParm.SALESPHASE + SHOW+"H", FunConstant.FUN_40809506H);
		funCodeCtlMap.put(ConstantParm.SALESPHASE + ENABLE+"H", FunConstant.FUN_40809508H);
		funCodeCtlMap.put(ConstantParm.SALESPHASE + TAKEOVER+"H", FunConstant.FUN_40809507H);
		funCodeCtlMap.put(ConstantParm.SALESPHASE + DISTRIBUTE+"H", FunConstant.FUN_40819507H);
		//-----------------------------部门类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.DEPTTYP + UPDATE+"H", FunConstant.FUN_40800028H);
		funCodeCtlMap.put(ConstantParm.DEPTTYP + SHOW+"H", FunConstant.FUN_40800029H);
		funCodeCtlMap.put(ConstantParm.DEPTTYP + ENABLE+"H", FunConstant.FUN_40800030H);
		funCodeCtlMap.put(ConstantParm.DEPTTYP + TAKEOVER+"H", FunConstant.FUN_40800034H);
		funCodeCtlMap.put(ConstantParm.DEPTTYP + DISTRIBUTE+"H", FunConstant.FUN_40810034H);
		//-----------------------------职务--------------------------------------
		funCodeCtlMap.put(ConstantParm.WORKTITLE + UPDATE+"H", FunConstant.FUN_40800004H);
		funCodeCtlMap.put(ConstantParm.WORKTITLE + SHOW+"H", FunConstant.FUN_40800005H);
		funCodeCtlMap.put(ConstantParm.WORKTITLE + ENABLE+"H", FunConstant.FUN_40800006H);
		funCodeCtlMap.put(ConstantParm.WORKTITLE + TAKEOVER+"H", FunConstant.FUN_40800031H);
		funCodeCtlMap.put(ConstantParm.WORKTITLE + DISTRIBUTE+"H", FunConstant.FUN_40810031H);
		//-----------------------------职员角色--------------------------------------
		funCodeCtlMap.put(ConstantParm.EMPLROLE + UPDATE+"H", FunConstant.FUN_40800010H);
		funCodeCtlMap.put(ConstantParm.EMPLROLE + SHOW+"H", FunConstant.FUN_40800011H);
		funCodeCtlMap.put(ConstantParm.EMPLROLE + ENABLE+"H", FunConstant.FUN_40800012H);
		funCodeCtlMap.put(ConstantParm.EMPLROLE + TAKEOVER+"H", FunConstant.FUN_40800032H);
		funCodeCtlMap.put(ConstantParm.EMPLROLE + DISTRIBUTE+"H", FunConstant.FUN_40810032H);
		//-----------------------------销售员分组--------------------------------------
		funCodeCtlMap.put(ConstantParm.SALERGRP + UPDATE+"H", FunConstant.FUN_40800013H);
		funCodeCtlMap.put(ConstantParm.SALERGRP + SHOW+"H", FunConstant.FUN_40800014H);
		funCodeCtlMap.put(ConstantParm.SALERGRP + ENABLE+"H", FunConstant.FUN_40800015H);
		funCodeCtlMap.put(ConstantParm.SALERGRP + TAKEOVER+"H", FunConstant.FUN_40800033H);
		funCodeCtlMap.put(ConstantParm.SALERGRP + DISTRIBUTE+"H", FunConstant.FUN_40810033H);
		//-----------------------------设施服务类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.UNITPROP + SHOW+"H", FunConstant.FUN_40809022H);
		funCodeCtlMap.put(ConstantParm.UNITPROP + UPDATE+"H", FunConstant.FUN_40809023H);
		funCodeCtlMap.put(ConstantParm.UNITPROP + ENABLE+"H", FunConstant.FUN_40809025H);
		funCodeCtlMap.put(ConstantParm.UNITPROP + TAKEOVER+"H", FunConstant.FUN_40809026H);
		funCodeCtlMap.put(ConstantParm.UNITPROP + DISTRIBUTE+"H", FunConstant.FUN_40819026H);
		//-----------------------------酒店设施服--------------------------------------
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + SHOW+"H", FunConstant.FUN_40809027H);
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + UPDATE+"H", FunConstant.FUN_40809028H);
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + ENABLE+"H", FunConstant.FUN_40809030H);
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + TAKEOVER+"H", FunConstant.FUN_40809031H);
		funCodeCtlMap.put(ConstantParm.UNITPROPVLU + DISTRIBUTE+"H", FunConstant.FUN_40819031H);
		//-----------------------------房型设施类型--------------------------------------
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + SHOW+"H", FunConstant.FUN_40809032H);
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + UPDATE+"H", FunConstant.FUN_40809033H);
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + ENABLE+"H", FunConstant.FUN_40809035H);
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + TAKEOVER+"H", FunConstant.FUN_40809036H);
		funCodeCtlMap.put(ConstantParm.RMTYPPROP + DISTRIBUTE+"H", FunConstant.FUN_40819036H);
		//-----------------------------房型设施--------------------------------------
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + SHOW+"H", FunConstant.FUN_40809037H);
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + UPDATE+"H", FunConstant.FUN_40809038H);
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + ENABLE+"H", FunConstant.FUN_40809040H);
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + TAKEOVER+"H", FunConstant.FUN_40809041H);
		funCodeCtlMap.put(ConstantParm.RMTYPPROPVLU + DISTRIBUTE+"H", FunConstant.FUN_40819041H);
		//-----------------------------酒店标签--------------------------------------
		funCodeCtlMap.put(ConstantParm.UNITTAG + SHOW+"H", FunConstant.FUN_40809042H);
		funCodeCtlMap.put(ConstantParm.UNITTAG + UPDATE+"H", FunConstant.FUN_40809043H);
		funCodeCtlMap.put(ConstantParm.UNITTAG + ENABLE+"H", FunConstant.FUN_40809044H);
		funCodeCtlMap.put(ConstantParm.UNITTAG + TAKEOVER+"H", FunConstant.FUN_40809045H);
		funCodeCtlMap.put(ConstantParm.UNITTAG + DISTRIBUTE+"H", FunConstant.FUN_40819045H);
		//-----------------------------房型标签--------------------------------------
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + SHOW+"H", FunConstant.FUN_40809046H);
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + UPDATE+"H", FunConstant.FUN_40809047H);
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + ENABLE+"H", FunConstant.FUN_40809048H);
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + TAKEOVER+"H", FunConstant.FUN_40809049H);
		funCodeCtlMap.put(ConstantParm.RMTYPTAG + DISTRIBUTE+"H", FunConstant.FUN_40819049H);
		//-----------------------------图片标签--------------------------------------
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + SHOW+"H", FunConstant.FUN_40809050H);
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + UPDATE+"H", FunConstant.FUN_40809051H);
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + ENABLE+"H", FunConstant.FUN_40809052H);
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + TAKEOVER+"H", FunConstant.FUN_40809053H);
		funCodeCtlMap.put(ConstantParm.UNITPICGRP + DISTRIBUTE+"H", FunConstant.FUN_40819053H);

	}
	
	/**
	 * 科目类型
	 */
	public static enum ENUM_TRN_TYP {
		/** 自动房费 **/
		AUTORM("100"),
		/** 手工房费 **/
		MANUALRM("101"),
		/** PKG房费 **/
		PKGRM("109"),
		/** 140客房服务 **/
		ROOM_SERVICE("140"),
		/** 普通费用 **/
		GENERAL("280"),
		/** 代收 **/
		COLLECTION("290"),
		/** 服务费 **/
		SVC("300"),
		/** 税费 **/
		TAX("350"),
		/** 税费1 **/
		TAX1("351"),
		/** 税费2 **/
		TAX2("352"),
		/** 税费3 **/
		TAX3("353"),
		/** 税费4 **/
		TAX4("354"),
		/** 税费5 **/
		TAX5("355"),
		/** NAR **/
		NAR("370"),
		/** 佣金生成**/
		RAKEOFF("500"),
		/** 金额转入房间**/
		INPUTRM("588"),
		/** 金额转出房间**/
		OUTPUTRM("589"),
		/** 信用卡手续费**/
		CREDIT("590"),
		/** 前台转应收生成发票**/
		CHARGEINVFRO("591"),
		/** 应收期初发票**/
		REVINV("592"),
		/** 应收中发票兑现**/
		REVINVCASH("593"),
		/** 现金 **/
		CASH("800"),
		/** Paid Out **/
		PAID("809"),
		/** 支票 **/
		CHECK("810"),
		/** 微信 **/
		WEPAY("820"),
		/** 支付宝 **/
		ALIPAY("821"),
		/** 银行转账 **/
		BANKTRNS("850"),
		/** 会员卡 **/
		MEMB("860"),
		/** 免费券 **/
		RMCP("861"),
		/** 升级券 **/
		UPGCP("862"),
		/** 银行卡 **/
		CARD("890"),
		/** 转应收发票 **/
		CHARGEINV("910"),
		/** 转应收收据 **/
		CHARGERCP("911"),
		/** 其他结算方式 **/
		OTHER("920"),
		/** 预定金转押金转出 **/
		AD2GLOUT("931"),
		/** 预定金转押金转入 **/
		AD2GLIN("932"),
		/** 宴请 **/
		DINE("950"),
		/** 信用卡回款 **/
		CARDBACK("990"),
		/** 前台转应收生成收据 **/
		TRNS1("991"),
		/** 应收中收据兑现 **/
		TRNS2("993"),
		/** 应收中发票兑现 **/
		TRNS3("994"),
		/** 预定金转押金转出 **/
		TRNS4("995"),
		/** 预定金转押金转入 **/
		TRNS5("996"),
		/** 保证金转出 **/
		TRNS6("997"),
		/** 保证金转入收据 **/
		TRNS7("998"),
		/**会员充值**/
		MEMBER_RECHARGE("940"),
		/**会员充值赠送储值**/
		MEMBER_RECHARGE_GIVE("941"),
		/**会员消费**/
		MEMBER_CONSUME("942");

		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_TRN_TYP(String value) {
			this._value = value;
		}
	}
	
	//消费品模块 start
	public static enum ENUM_INVENTORY_FLG{
		/**0：无库存管理，1：库存管理**/
		GENERAL("0"),
		INV("1"),
		DEFAULT("0");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_INVENTORY_FLG(String value){
			this._value=value;
		}	
	}
	
	//是否允许抛账
	public static enum ENUM_PERMITPOST_FLG{
		//0：不允许，1：允许
		NOPERMI("0"),
		PERMI("1"),
		DEFAULT("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_PERMITPOST_FLG(String value){
			this._value=value;
		}	
	}
	
	//房含属性
	public static enum ENUM_PRODUCT_FLG{
		//0：普通，1：早餐，2：晚餐
		COMMON("0"),
		BREAKFAST("1"),
		DINNER("2"),
		RS("RS"),
		DEFAULT("0");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_PRODUCT_FLG(String value){
			this._value=value;
		}	
	}
	
	//记账方式
	public static enum ENUM_AUDIT_TYP{
		//0：当日消费，1：次日消费
		TODAY("0"),
		TOMORROW("1"),
		DEFAULT("0");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_AUDIT_TYP(String value){
			this._value=value;
		}	
	}
	
	//消费方式
	public static enum ENUM_POST_TYP{
		//1：按金额消费，2：按次消费
		MONEY("0"),
		NUMBER("1"),
		DEFAULT("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_POST_TYP(String value){
			this._value=value;
		}	
	}
	
	//1：文本  	2：整形   	3：浮点 	4：日期	5：时间
	public static enum ENUM_FIELD_TYP{
		TAXT("1"),
		NUMBER("2"),
		FLOAT("3"),
		DATE("4"),
		TIME("5");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_FIELD_TYP(String value){
			this._value=value;
		}	
	}
	
	/**
	 * 1：按指定时间，2：按限定时长，9：不可转正常
	*/
	public static enum ENUM_CLK2NML_TYP{
		OVERTIME ("1"),
		TIMEOUT("2"),
		NO("9");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_CLK2NML_TYP(String value){
			this._value=value;
		}	
	}
	/**
	 * 文字型参数
	 * FUN：功能
		MNU：菜单
		LOC：定位
		CMM：共通
	 */
	public static enum ENUM_SHORTKEY_TYP{
		FUN ("FUN"),
		MNU("MNU"),
		LOC("LOC"),
		CMM("CMM");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_SHORTKEY_TYP(String value){
			this._value=value;
		}	
	}
	//IMP：仅供导入
//	USE：仅自用
//	INU：自用切供导入
	public static enum ENUM_USE_FLG{
		IMP ("IMP"),
		USE("USE"),
		INU("INU");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_USE_FLG(String value){
			this._value=value;
		}	
	}
	//0：非独享，1：独享，Null：非独享
	public static enum ENUM_EXCLUSIVE_FLG{
		NOEXCLUSIVE("0"),
		EXCLUSIVE("1"),
		DEFAULT("0");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_EXCLUSIVE_FLG(String value){
			this._value=value;
		}	
	}
	
	/*
	 * 钟点房允许入住时间段	例：00:00:00--23:59:59
	 */
	public final static String OPT_3220_010_101 = "3220-010-101";
	/*
	 * 转为正常入住条件
	 */
	public final static String OPT_3220_010_102 = "3220-010-102";
	/*
	 * 转为正常入住条件：最晚停留时间
	 */
	public final static String OPT_3220_010_103 = "3220-010-103";
	/*
	 * 转为正常入住条件：入住超时
	 */
	public final static String OPT_3220_010_104 = "3220-010-104";
	/*
	 * 钟点房到时间之前提醒操作员
	 */
	public final static String OPT_3220_010_105 = "3220-010-105";
	/*
	 * 钟点房计费减免时间
	 */
	public final static String OPT_3220_010_106 = "3220-010-106";
	/*
	 * 是否启用最小计费时间功能	启用，不启用
	 */
	public final static String OPT_3220_010_108 = "3220-010-108";
	/*
	 * 钟点房计费宽容时间
	 */
	public final static String OPT_3220_010_111 = "3220-010-111";
	
	/*
	 * 消费点表名
	 */
	public final static String PRODUCTCL = "PARA_PRODUCT";
	/*
	 * 消费点表名
	 */
	public final static String GOODSCL = "PARA_GOODS";
	
	/*
	 * 消费点管控字段
	 */
	public final static String PRODUCTCDCL = "productCd";
	public final static String PRODUCTNMCL = "productNm";
	// 班次管控类型
	public final static String TURNCL = "PARA_TURN";
	
	//房含管控 typ
	public final static String RSVPACKAGE = "PARA_PACKAGE";
	public final static String PACKAGECDCL = "package_cd";
	public final static String PACKAGENMCL = "package_nm";
	public final static String PACKAGEDRPTCL = "package_drpt";
	public final static String AUDITYPCL = "audit_typ";
	public final static String AUDITTRNCDIDCL = "audittrncd_id";
	public final static String PKGSTDCL = "pkg_std";
	public final static String PKGCHARGEFLGCL = "pkgcharge_flg";
	public final static String POSTRHYTHMCL = "post_rhythm";
	public final static String PKGFOLIOFLGCL = "pkgfolio_flg";
	public final static String ADDONFLGCL = "addon_flg";
	public final static String POSID = "pos_id";
	public final static String USEFLG = "use_flg";
	public final static String SEQCL = "seq";
	public final static String STATUSFLGCL = "status_flg";
	public final static String PRODUCTFLG = "product_flg";
	
	// 入账代码管控 typ
	public final static String GRPFINTRNCODE = "PARA_TRNCODE";
	public final static String TRNCD_STATUSFLG = "statusFlg";
	public final static String TRNCD_SEQ = "seq";
	public final static String TRNCD_SVCTYPID = "svctypId";
	public final static String TRNCD_SVCFOLIOFLG = "svcfolioFlg";
	public final static String TRNCD_SVCCHARGEFLG = "svcchargeFlg";
	public final static String TRNCD_TAX1ID = "tax1Id";
	public final static String TRNCD_TAX1FOLIOFLG = "tax1folioFlg";
	public final static String TRNCD_TAX1CHARGEFLG = "tax1chargeFlg";
	public final static String TRNCD_TAX2ID = "tax2Id";
	public final static String TRNCD_TAX2FOLIOFLG = "tax2folioFlg";
	public final static String TRNCD_TAX2CHARGEFLG = "tax2chargeFlg";
	public final static String TRNCD_TAX3ID = "tax3Id";
	public final static String TRNCD_TAX3FOLIOFLG = "tax3folioFlg";
	public final static String TRNCD_TAX3CHARGEFLG = "tax3chargeFlg";
	public final static String TRNCD_TAX4ID = "tax4Id";
	public final static String TRNCD_TAX4FOLIOFLG = "tax4folioFlg";
	public final static String TRNCD_TAX4CHARGEFLG = "tax4chargeFlg";
	public final static String TRNCD_TAX5ID = "tax5Id";
	public final static String TRNCD_TAX5FOLIOFLG = "tax5folioFlg";
	public final static String TRNCD_TAX5CHARGEFLG = "tax5chargeFlg";
	
	
	public final static String TRNCD_TRNCLSID = "trnclsId";
	public final static String TRNCD_TRNSUBCLSID = "trnsubclsId";
	public final static String TRNCD_NORMAL = "normal";
	public final static String TRNCD_TRNTYP = "trnTyp";
	public final static String TRNCD_FRONTUSEFLG = "frontuseFlg";
	public final static String TRNCD_ARUSEFLG = "aruseFlg";
	public final static String TRNCD_POSUSEFLG = "posuseFlg";
	public final static String TRNCD_APUSEFLG = "apuseFlg";
	public final static String TRNCD_MCUSEFLG = "mcuseFlg";
	public final static String TRNCD_CRSUSEFLG = "crsuseFlg";
	public final static String TRNCD_LOGUSEFLG = "loguseFlg";
	public final static String TRNCD_GFCUSEFLG = "gfcuseFlg";
	public final static String TRNCD_EBSUSEFLG = "ebsuseFlg";
	public final static String TRNCD_ADVDEPOSITFLG = "advdepositFlg";
	public final static String TRNCD_DEPOSITFLG = "depositFlg";
	public final static String TRNCD_CHECKFLG = "checkFlg";
	public final static String TRNCD_ARRECEIPTFLG = "arreceiptFlg";
	public final static String TRNCD_POSTFLG = "postFlg";
	public final static String TRNCD_PLUSFLG = "plusFlg";
	public final static String TRNCD_REVENUEFLG = "revenueFlg";
	public final static String TRNCD_NIGHTSFLG = "nightsFlg";
	public final static String TRNCD_INTERNALFLG = "internalFlg";
	public final static String TRNCD_ONLINEFLG = "onlineFlg";
	public final static String TRNCD_POINTFLG = "pointFlg";
	public final static String TRNCD_SPLITFLG = "splitFlg";
	public final static String TRNCD_RVNTRNCDID = "rvntrncdId";
	public final static String TRNCD_ADJTRNCDID = "adjtrncdId";
	public final static String TRNCD_CCARDTYPID = "ccardtypId";
	public final static String TRNCD_ARNO = "arNo";
	public final static String TRNCD_IFSVCVERID = "ifsvcverId";
	public final static String TRNCD_TAXTYPEID = "taxtypeId";
	public final static String TRNCD_PSNCNTFLG = "psncntFlg";
	
	
	public static enum ENUM_OPERATOR{
		IN("1"),
		NOT_IN("2"),
		EQUALS("3"),
		NO_EQUALS("4");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_OPERATOR(String value){
			this._value=value;
		}	
	}
	public static enum ENUM_PARAM_FLG{
		UNQ("UNQ"),
		PLF("PLF"),
		UNT("UNT"),
		LOC("LOC"),
		DEV("DEV");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_PARAM_FLG(String value){
			this._value=value;
		}	
	}
	public static enum ENUM_DECORATE_TYP{
		/**面积**/
		AREA("AREA"),
		/**摆床**/
		BEDTYP("BEDTYP");
		private String _value;
		public String getValue() {
			return _value;
		}
		private ENUM_DECORATE_TYP(String value){
			this._value=value;
		}	
	}
}
