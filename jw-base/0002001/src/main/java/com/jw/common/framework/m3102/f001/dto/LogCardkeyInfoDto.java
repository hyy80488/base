
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3102.f001.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.annotation.DrptEntity;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	制卡日志表基础字段
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-08-29]
 * @package com.jw.hms.cmm.m3102.f001.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-08-29|zhangteng|新增|LogCardkeyInfo新增
 */
@DrptEntity(ennm = "制卡日志表基础字段", endrpt = "制卡日志表基础字段")
public class LogCardkeyInfoDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4911313713007920546L;

	
	@DrptField(fieldnm = "acctStus", fielddrpt = "账户状态 ", nullable = "false", length = "10")
	private String acctStus;
	
	@DrptField(fieldnm = "keyroomNum", fielddrpt = "制卡房号 ", nullable = "false", length = "20")
	private String keyroomNum;
	@DrptField(fieldnm = "beginDhtm", fielddrpt = "卡有效起始时间 ", nullable = "false", length = "20")
	private Date beginDhtm;
	@DrptField(fieldnm = "endDhtm", fielddrpt = "卡有效终止时间 ", nullable = "false", length = "20")
	private Date endDhtm;
	
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码 ", nullable = "false", length = "40")
	
	
	private String chainUid;
	
	
	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码 ", nullable = "false", length = "40")
	
	
	private String unitUid;
	
	// key：门锁，其他待添加
	
	@DrptField(fieldnm = "cardTyp", fielddrpt = "卡类型", nullable = "false", length = "3")
	

	private String cardTyp;
	
	
	@DrptField(fieldnm = "cardNum", fielddrpt = "卡号 ", nullable = "false", length = "40")
	
	
	private String cardNum;
	
	
	@DrptField(fieldnm = "roomNum", fielddrpt = "房间号 ", nullable = "false", length = "20")
	
	
	private String roomNum;
	
	
	@DrptField(fieldnm = "acctNo", fielddrpt = "预定账号 ", nullable = "true", length = "20")
	
	private String acctNo;
	
	
	@DrptField(fieldnm = "guestNm", fielddrpt = "宾客姓名 ", nullable = "true", length = "200")
	
	private String guestNm;
	
	//1：新建卡 2：修改卡 3：复制卡 4：作废卡
	
	@DrptField(fieldnm = "printTyp", fielddrpt = "制卡类型 ", paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.LOG_CARDKEY_INFO_PRINT_TYP,nullable = "false", length = "3")
	

	private String printTyp;
	
	
	@DrptField(fieldnm = "arrDt", fielddrpt = "来期 ", nullable = "true", length = "13")
	private java.util.Date arrDt;
	
	
	@DrptField(fieldnm = "dptDt", fielddrpt = "离期 ", nullable = "true", length = "13")
	private java.util.Date dptDt;
	
	
	@DrptField(fieldnm = "printNums", fielddrpt = "制卡数量 ", nullable = "true", length = "5")
	private Integer printNums;
	
	
	@DrptField(fieldnm = "parentcardNum", fielddrpt = "父卡卡号 ", nullable = "true", length = "50")

	private String parentcardNum;
	
	
	@DrptField(fieldnm = "wsNo", fielddrpt = "制卡工作站号 ", nullable = "true", length = "40")
	
	private String wsNo;
	
	
	@DrptField(fieldnm = "orgwsNo", fielddrpt = "发卡工作站号 ", nullable = "true", length = "40")
	
	private String orgwsNo;
	
	
	@DrptField(fieldnm = "realcardNum", fielddrpt = "物理卡号 ", nullable = "true", length = "40")
	
	private String realcardNum;
	
	
	@DrptField(fieldnm = "track1", fielddrpt = "磁道信息1 ", nullable = "true", length = "200")
	
	private String track1;
	
	
	@DrptField(fieldnm = "track2", fielddrpt = "磁道信息2 ", nullable = "true", length = "200")
	
	private String track2;
	
	
	@DrptField(fieldnm = "track3", fielddrpt = "磁道信息3 ", nullable = "true", length = "200")
	
	private String track3;
	
	
	@DrptField(fieldnm = "track4", fielddrpt = "磁道信息4 ", nullable = "true", length = "200")
	
	private String track4;
	
	
	@DrptField(fieldnm = "track5", fielddrpt = "磁道信息5 ", nullable = "true", length = "200")
	
	private String track5;
	
	
	@DrptField(fieldnm = "track6", fielddrpt = "磁道信息6 ", nullable = "true", length = "200")
	
	private String track6;
	
	
	@DrptField(fieldnm = "track7", fielddrpt = "磁道信息7 ", nullable = "true", length = "200")
	
	private String track7;
	
	
	@DrptField(fieldnm = "track8", fielddrpt = "磁道信息8 ", nullable = "true", length = "200")
	
	private String track8;
	
	
	@DrptField(fieldnm = "track9", fielddrpt = "磁道信息9 ", nullable = "true", length = "200")
	
	private String track9;
	
	
	@DrptField(fieldnm = "track10", fielddrpt = "磁道信息10 ", nullable = "true", length = "200")
	
	private String track10;
	
	
	@DrptField(fieldnm = "block1", fielddrpt = "写入区1 ", nullable = "true", length = "1000")
	
	private String block1;
	
	
	@DrptField(fieldnm = "block2", fielddrpt = "写入区2 ", nullable = "true", length = "1000")
	
	private String block2;
	
	
	@DrptField(fieldnm = "block3", fielddrpt = "写入区3 ", nullable = "true", length = "1000")
	
	private String block3;
	
	
	@DrptField(fieldnm = "block4", fielddrpt = "写入区4 ", nullable = "true", length = "1000")
	
	private String block4;
	
	
	@DrptField(fieldnm = "block5", fielddrpt = "写入区5 ", nullable = "true", length = "1000")
	
	private String block5;
	// 1：成功 2：失败
	
	@DrptField(fieldnm = "successFlg", fielddrpt = "制卡结果",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.LOG_CARDKEY_INFO_SUCCESS_FLG, nullable = "true", length = "3")

	private String successFlg;
	
	
	@DrptField(fieldnm = "printBdt", fielddrpt = "制卡日期 ", nullable = "true", length = "13")
	private java.util.Date printBdt;
	
	
	@DrptField(fieldnm = "printDhms", fielddrpt = "制卡时间 ", nullable = "true", length = "29")
	private java.util.Date printDhms;
	
	
	@DrptField(fieldnm = "printUnitUid", fielddrpt = "制卡单位uid ", nullable = "true", length = "40")
	
	private String printUnitUid;
	
	
	@DrptField(fieldnm = "printUnitCd", fielddrpt = "制卡单位cd ", nullable = "true", length = "20")
	
	private String printUnitCd;
	
	
	@DrptField(fieldnm = "printUserUid", fielddrpt = "制卡操作员uid ", nullable = "true", length = "40")
	
	private String printUserUid;
	
	
	@DrptField(fieldnm = "printUserCd", fielddrpt = "制卡操作员代码 ", nullable = "true", length = "20")
	
	private String printUserCd;
	
	
	@DrptField(fieldnm = "printUserNm", fielddrpt = "制卡操作员姓名 ", nullable = "true", length = "200")
	
	private String printUserNm;
	
	
	@DrptField(fieldnm = "paramStr1", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr1;
	
	
	@DrptField(fieldnm = "paramStr2", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr2;
	
	
	@DrptField(fieldnm = "paramStr3", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr3;
	
	
	@DrptField(fieldnm = "paramStr4", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr4;
	
	
	@DrptField(fieldnm = "paramStr5", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr5;
	
	
	@DrptField(fieldnm = "paramStr6", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr6;
	
	
	@DrptField(fieldnm = "paramStr7", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr7;
	
	
	@DrptField(fieldnm = "paramStr8", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr8;
	
	
	@DrptField(fieldnm = "paramStr9", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr9;
	
	
	@DrptField(fieldnm = "paramStr10", fielddrpt = "文字型参数 ", nullable = "true", length = "200")
	
	private String paramStr10;
	
	
	@DrptField(fieldnm = "paramNum1", fielddrpt = "数字型参数 ", nullable = "true", length = "12")
	private BigDecimal paramNum1;
	
	
	@DrptField(fieldnm = "paramNum2", fielddrpt = "数字型参数 ", nullable = "true", length = "12")
	private BigDecimal paramNum2;
	
	
	@DrptField(fieldnm = "paramNum3", fielddrpt = "数字型参数 ", nullable = "true", length = "12")
	private BigDecimal paramNum3;
	
	
	@DrptField(fieldnm = "paramNum4", fielddrpt = "数字型参数 ", nullable = "true", length = "12")
	private BigDecimal paramNum4;
	
	
	@DrptField(fieldnm = "paramNum5", fielddrpt = "数字型参数 ", nullable = "true", length = "12")
	private BigDecimal paramNum5;
	
	
	@DrptField(fieldnm = "paramDt1", fielddrpt = "日期型参数 ", nullable = "true", length = "13")
	private java.util.Date paramDt1;
	
	
	@DrptField(fieldnm = "paramDt2", fielddrpt = "日期型参数 ", nullable = "true", length = "13")
	private java.util.Date paramDt2;
	
	
	@DrptField(fieldnm = "paramDt3", fielddrpt = "日期型参数 ", nullable = "true", length = "13")
	private java.util.Date paramDt3;
	
	
	@DrptField(fieldnm = "paramDt4", fielddrpt = "日期型参数 ", nullable = "true", length = "13")
	private java.util.Date paramDt4;
	
	
	@DrptField(fieldnm = "paramDt5", fielddrpt = "日期型参数 ", nullable = "true", length = "13")
	private java.util.Date paramDt5;
	


	public LogCardkeyInfoDto(){
	}
	
	public String getChainUid() {
		return this.chainUid;
	}
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public String getCardTyp() {
		return this.cardTyp;
	}
	public void setCardTyp(String value) {
		this.cardTyp = value;
	}
	public String getCardNum() {
		return this.cardNum;
	}
	public void setCardNum(String value) {
		this.cardNum = value;
	}
	public String getRoomNum() {
		return this.roomNum;
	}
	public void setRoomNum(String value) {
		this.roomNum = value;
	}
	public String getAcctNo() {
		return this.acctNo;
	}
	public void setAcctNo(String value) {
		this.acctNo = value;
	}
	public String getGuestNm() {
		return this.guestNm;
	}
	public void setGuestNm(String value) {
		this.guestNm = value;
	}
	public String getPrintTyp() {
		return this.printTyp;
	}
	public void setPrintTyp(String value) {
		this.printTyp = value;
	}
	public java.util.Date getArrDt() {
		return this.arrDt;
	}
	public void setArrDt(java.util.Date value) {
		this.arrDt = value;
	}
	public java.util.Date getDptDt() {
		return this.dptDt;
	}
	public void setDptDt(java.util.Date value) {
		this.dptDt = value;
	}
	public Integer getPrintNums() {
		return this.printNums;
	}
	public void setPrintNums(Integer value) {
		this.printNums = value;
	}
	public String getParentcardNum() {
		return this.parentcardNum;
	}
	public void setParentcardNum(String value) {
		this.parentcardNum = value;
	}
	public String getWsNo() {
		return this.wsNo;
	}
	public void setWsNo(String value) {
		this.wsNo = value;
	}
	public String getOrgwsNo() {
		return this.orgwsNo;
	}
	public void setOrgwsNo(String value) {
		this.orgwsNo = value;
	}
	public String getRealcardNum() {
		return this.realcardNum;
	}
	public void setRealcardNum(String value) {
		this.realcardNum = value;
	}
	public String getTrack1() {
		return this.track1;
	}
	public void setTrack1(String value) {
		this.track1 = value;
	}
	public String getTrack2() {
		return this.track2;
	}
	public void setTrack2(String value) {
		this.track2 = value;
	}
	public String getTrack3() {
		return this.track3;
	}
	public void setTrack3(String value) {
		this.track3 = value;
	}
	public String getTrack4() {
		return this.track4;
	}
	public void setTrack4(String value) {
		this.track4 = value;
	}
	public String getTrack5() {
		return this.track5;
	}
	public void setTrack5(String value) {
		this.track5 = value;
	}
	public String getTrack6() {
		return this.track6;
	}
	public void setTrack6(String value) {
		this.track6 = value;
	}
	public String getTrack7() {
		return this.track7;
	}
	public void setTrack7(String value) {
		this.track7 = value;
	}
	public String getTrack8() {
		return this.track8;
	}
	public void setTrack8(String value) {
		this.track8 = value;
	}
	public String getTrack9() {
		return this.track9;
	}
	public void setTrack9(String value) {
		this.track9 = value;
	}
	public String getTrack10() {
		return this.track10;
	}
	public void setTrack10(String value) {
		this.track10 = value;
	}
	public String getBlock1() {
		return this.block1;
	}
	public void setBlock1(String value) {
		this.block1 = value;
	}
	public String getBlock2() {
		return this.block2;
	}
	public void setBlock2(String value) {
		this.block2 = value;
	}
	public String getBlock3() {
		return this.block3;
	}
	public void setBlock3(String value) {
		this.block3 = value;
	}
	public String getBlock4() {
		return this.block4;
	}
	public void setBlock4(String value) {
		this.block4 = value;
	}
	public String getBlock5() {
		return this.block5;
	}
	public void setBlock5(String value) {
		this.block5 = value;
	}
	public String getSuccessFlg() {
		return this.successFlg;
	}
	public void setSuccessFlg(String value) {
		this.successFlg = value;
	}
	public java.util.Date getPrintBdt() {
		return this.printBdt;
	}
	public void setPrintBdt(java.util.Date value) {
		this.printBdt = value;
	}
	public java.util.Date getPrintDhms() {
		return this.printDhms;
	}
	public void setPrintDhms(java.util.Date value) {
		this.printDhms = value;
	}
	public String getPrintUnitUid() {
		return this.printUnitUid;
	}
	public void setPrintUnitUid(String value) {
		this.printUnitUid = value;
	}
	public String getPrintUnitCd() {
		return this.printUnitCd;
	}
	public void setPrintUnitCd(String value) {
		this.printUnitCd = value;
	}
	public String getPrintUserUid() {
		return this.printUserUid;
	}
	public void setPrintUserUid(String value) {
		this.printUserUid = value;
	}
	public String getPrintUserCd() {
		return this.printUserCd;
	}
	public void setPrintUserCd(String value) {
		this.printUserCd = value;
	}
	public String getPrintUserNm() {
		return this.printUserNm;
	}
	public void setPrintUserNm(String value) {
		this.printUserNm = value;
	}
	public String getParamStr1() {
		return this.paramStr1;
	}
	public void setParamStr1(String value) {
		this.paramStr1 = value;
	}
	public String getParamStr2() {
		return this.paramStr2;
	}
	public void setParamStr2(String value) {
		this.paramStr2 = value;
	}
	public String getParamStr3() {
		return this.paramStr3;
	}
	public void setParamStr3(String value) {
		this.paramStr3 = value;
	}
	public String getParamStr4() {
		return this.paramStr4;
	}
	public void setParamStr4(String value) {
		this.paramStr4 = value;
	}
	public String getParamStr5() {
		return this.paramStr5;
	}
	public void setParamStr5(String value) {
		this.paramStr5 = value;
	}
	public String getParamStr6() {
		return this.paramStr6;
	}
	public void setParamStr6(String value) {
		this.paramStr6 = value;
	}
	public String getParamStr7() {
		return this.paramStr7;
	}
	public void setParamStr7(String value) {
		this.paramStr7 = value;
	}
	public String getParamStr8() {
		return this.paramStr8;
	}
	public void setParamStr8(String value) {
		this.paramStr8 = value;
	}
	public String getParamStr9() {
		return this.paramStr9;
	}
	public void setParamStr9(String value) {
		this.paramStr9 = value;
	}
	public String getParamStr10() {
		return this.paramStr10;
	}
	public void setParamStr10(String value) {
		this.paramStr10 = value;
	}
	public BigDecimal getParamNum1() {
		return this.paramNum1;
	}
	public void setParamNum1(BigDecimal value) {
		this.paramNum1 = value;
	}
	public BigDecimal getParamNum2() {
		return this.paramNum2;
	}
	public void setParamNum2(BigDecimal value) {
		this.paramNum2 = value;
	}
	public BigDecimal getParamNum3() {
		return this.paramNum3;
	}
	public void setParamNum3(BigDecimal value) {
		this.paramNum3 = value;
	}
	public BigDecimal getParamNum4() {
		return this.paramNum4;
	}
	public void setParamNum4(BigDecimal value) {
		this.paramNum4 = value;
	}
	public BigDecimal getParamNum5() {
		return this.paramNum5;
	}
	public void setParamNum5(BigDecimal value) {
		this.paramNum5 = value;
	}
	public java.util.Date getParamDt1() {
		return this.paramDt1;
	}
	public void setParamDt1(java.util.Date value) {
		this.paramDt1 = value;
	}
	public java.util.Date getParamDt2() {
		return this.paramDt2;
	}
	public void setParamDt2(java.util.Date value) {
		this.paramDt2 = value;
	}
	public java.util.Date getParamDt3() {
		return this.paramDt3;
	}
	public void setParamDt3(java.util.Date value) {
		this.paramDt3 = value;
	}
	public java.util.Date getParamDt4() {
		return this.paramDt4;
	}
	public void setParamDt4(java.util.Date value) {
		this.paramDt4 = value;
	}
	public java.util.Date getParamDt5() {
		return this.paramDt5;
	}
	public void setParamDt5(java.util.Date value) {
		this.paramDt5 = value;
	}

	public String getAcctStus() {
		return acctStus;
	}

	public void setAcctStus(String acctStus) {
		this.acctStus = acctStus;
	}

	public String getKeyroomNum() {
		return keyroomNum;
	}

	public void setKeyroomNum(String keyroomNum) {
		this.keyroomNum = keyroomNum;
	}

	public Date getBeginDhtm() {
		return beginDhtm;
	}

	public void setBeginDhtm(Date beginDhtm) {
		this.beginDhtm = beginDhtm;
	}

	public Date getEndDhtm() {
		return endDhtm;
	}

	public void setEndDhtm(Date endDhtm) {
		this.endDhtm = endDhtm;
	}
	
	/**LogCardkeyInfo对应的子DTO**/
//	private LogCardkeyInfoSubDto logCardkeyInfoSubDto;
	/**
	 * 
	 * ## 方法说明：
	 * 	LogCardkeyInfo对应的子DTO
	 * @return
	 */
//	@Transient
//	public LogCardkeyInfoSubDto getLogCardkeyInfoSubDto() {
//		return logCardkeyInfoSubDto;
//	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	LogCardkeyInfo对应的子DTO
	 * @param
	 */
//	public void setLogCardkeyInfoSubDto(LogCardkeyInfoSubDto logCardkeyInfoSubDto) {
//		this.logCardkeyInfoSubDto = logCardkeyInfoSubDto;
//	}
	

	
	/**
	 * ## 方法说明：
	 * 	复制字段值
	 * @param submitData 传入数据
	 * @param isNullCopy 是否复制空值   true：复制   false：不复制
	 */
//	@Transient
//	public void copyEntity(LogCardkeyInfo submitData, Boolean isNullCopy) {
//		if (submitData != null) {
//			String chainUid = submitData.getChainUid() != null ? submitData.getChainUid().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(chainUid)) {
//				setChainUid(submitData.getChainUid());
//			}
//			String unitUid = submitData.getUnitUid() != null ? submitData.getUnitUid().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(unitUid)) {
//				setUnitUid(submitData.getUnitUid());
//			}
//			String cardTyp = submitData.getCardTyp() != null ? submitData.getCardTyp().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(cardTyp)) {
//				setCardTyp(submitData.getCardTyp());
//			}
//			String cardNum = submitData.getCardNum() != null ? submitData.getCardNum().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(cardNum)) {
//				setCardNum(submitData.getCardNum());
//			}
//			String roomNum = submitData.getRoomNum() != null ? submitData.getRoomNum().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(roomNum)) {
//				setRoomNum(submitData.getRoomNum());
//			}
//			String acctNo = submitData.getAcctNo() != null ? submitData.getAcctNo().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(acctNo)) {
//				setAcctNo(submitData.getAcctNo());
//			}
//			String guestNm = submitData.getGuestNm() != null ? submitData.getGuestNm().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(guestNm)) {
//				setGuestNm(submitData.getGuestNm());
//			}
//			String printTyp = submitData.getPrintTyp() != null ? submitData.getPrintTyp().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printTyp)) {
//				setPrintTyp(submitData.getPrintTyp());
//			}
//			String arrDt = submitData.getArrDt() != null ? submitData.getArrDt().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(arrDt)) {
//				setArrDt(submitData.getArrDt());
//			}
//			String dptDt = submitData.getDptDt() != null ? submitData.getDptDt().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(dptDt)) {
//				setDptDt(submitData.getDptDt());
//			}
//			String printNums = submitData.getPrintNums() != null ? submitData.getPrintNums().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printNums)) {
//				setPrintNums(submitData.getPrintNums());
//			}
//			String parentcardNum = submitData.getParentcardNum() != null ? submitData.getParentcardNum().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(parentcardNum)) {
//				setParentcardNum(submitData.getParentcardNum());
//			}
//			String wsNo = submitData.getWsNo() != null ? submitData.getWsNo().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(wsNo)) {
//				setWsNo(submitData.getWsNo());
//			}
//			String orgwsNo = submitData.getOrgwsNo() != null ? submitData.getOrgwsNo().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(orgwsNo)) {
//				setOrgwsNo(submitData.getOrgwsNo());
//			}
//			String realcardNum = submitData.getRealcardNum() != null ? submitData.getRealcardNum().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(realcardNum)) {
//				setRealcardNum(submitData.getRealcardNum());
//			}
//			String track1 = submitData.getTrack1() != null ? submitData.getTrack1().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track1)) {
//				setTrack1(submitData.getTrack1());
//			}
//			String track2 = submitData.getTrack2() != null ? submitData.getTrack2().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track2)) {
//				setTrack2(submitData.getTrack2());
//			}
//			String track3 = submitData.getTrack3() != null ? submitData.getTrack3().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track3)) {
//				setTrack3(submitData.getTrack3());
//			}
//			String track4 = submitData.getTrack4() != null ? submitData.getTrack4().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track4)) {
//				setTrack4(submitData.getTrack4());
//			}
//			String track5 = submitData.getTrack5() != null ? submitData.getTrack5().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track5)) {
//				setTrack5(submitData.getTrack5());
//			}
//			String track6 = submitData.getTrack6() != null ? submitData.getTrack6().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track6)) {
//				setTrack6(submitData.getTrack6());
//			}
//			String track7 = submitData.getTrack7() != null ? submitData.getTrack7().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track7)) {
//				setTrack7(submitData.getTrack7());
//			}
//			String track8 = submitData.getTrack8() != null ? submitData.getTrack8().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track8)) {
//				setTrack8(submitData.getTrack8());
//			}
//			String track9 = submitData.getTrack9() != null ? submitData.getTrack9().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track9)) {
//				setTrack9(submitData.getTrack9());
//			}
//			String track10 = submitData.getTrack10() != null ? submitData.getTrack10().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(track10)) {
//				setTrack10(submitData.getTrack10());
//			}
//			String block1 = submitData.getBlock1() != null ? submitData.getBlock1().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(block1)) {
//				setBlock1(submitData.getBlock1());
//			}
//			String block2 = submitData.getBlock2() != null ? submitData.getBlock2().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(block2)) {
//				setBlock2(submitData.getBlock2());
//			}
//			String block3 = submitData.getBlock3() != null ? submitData.getBlock3().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(block3)) {
//				setBlock3(submitData.getBlock3());
//			}
//			String block4 = submitData.getBlock4() != null ? submitData.getBlock4().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(block4)) {
//				setBlock4(submitData.getBlock4());
//			}
//			String block5 = submitData.getBlock5() != null ? submitData.getBlock5().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(block5)) {
//				setBlock5(submitData.getBlock5());
//			}
//			String successFlg = submitData.getSuccessFlg() != null ? submitData.getSuccessFlg().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(successFlg)) {
//				setSuccessFlg(submitData.getSuccessFlg());
//			}
//			String printBdt = submitData.getPrintBdt() != null ? submitData.getPrintBdt().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printBdt)) {
//				setPrintBdt(submitData.getPrintBdt());
//			}
//			String printDhms = submitData.getPrintDhms() != null ? submitData.getPrintDhms().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printDhms)) {
//				setPrintDhms(submitData.getPrintDhms());
//			}
//			String printUnitUid = submitData.getPrintUnitUid() != null ? submitData.getPrintUnitUid().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printUnitUid)) {
//				setPrintUnitUid(submitData.getPrintUnitUid());
//			}
//			String printUnitCd = submitData.getPrintUnitCd() != null ? submitData.getPrintUnitCd().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printUnitCd)) {
//				setPrintUnitCd(submitData.getPrintUnitCd());
//			}
//			String printUserUid = submitData.getPrintUserUid() != null ? submitData.getPrintUserUid().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printUserUid)) {
//				setPrintUserUid(submitData.getPrintUserUid());
//			}
//			String printUserCd = submitData.getPrintUserCd() != null ? submitData.getPrintUserCd().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printUserCd)) {
//				setPrintUserCd(submitData.getPrintUserCd());
//			}
//			String printUserNm = submitData.getPrintUserNm() != null ? submitData.getPrintUserNm().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(printUserNm)) {
//				setPrintUserNm(submitData.getPrintUserNm());
//			}
//			String paramStr1 = submitData.getParamStr1() != null ? submitData.getParamStr1().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr1)) {
//				setParamStr1(submitData.getParamStr1());
//			}
//			String paramStr2 = submitData.getParamStr2() != null ? submitData.getParamStr2().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr2)) {
//				setParamStr2(submitData.getParamStr2());
//			}
//			String paramStr3 = submitData.getParamStr3() != null ? submitData.getParamStr3().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr3)) {
//				setParamStr3(submitData.getParamStr3());
//			}
//			String paramStr4 = submitData.getParamStr4() != null ? submitData.getParamStr4().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr4)) {
//				setParamStr4(submitData.getParamStr4());
//			}
//			String paramStr5 = submitData.getParamStr5() != null ? submitData.getParamStr5().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr5)) {
//				setParamStr5(submitData.getParamStr5());
//			}
//			String paramStr6 = submitData.getParamStr6() != null ? submitData.getParamStr6().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr6)) {
//				setParamStr6(submitData.getParamStr6());
//			}
//			String paramStr7 = submitData.getParamStr7() != null ? submitData.getParamStr7().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr7)) {
//				setParamStr7(submitData.getParamStr7());
//			}
//			String paramStr8 = submitData.getParamStr8() != null ? submitData.getParamStr8().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr8)) {
//				setParamStr8(submitData.getParamStr8());
//			}
//			String paramStr9 = submitData.getParamStr9() != null ? submitData.getParamStr9().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr9)) {
//				setParamStr9(submitData.getParamStr9());
//			}
//			String paramStr10 = submitData.getParamStr10() != null ? submitData.getParamStr10().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramStr10)) {
//				setParamStr10(submitData.getParamStr10());
//			}
//			String paramNum1 = submitData.getParamNum1() != null ? submitData.getParamNum1().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramNum1)) {
//				setParamNum1(submitData.getParamNum1());
//			}
//			String paramNum2 = submitData.getParamNum2() != null ? submitData.getParamNum2().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramNum2)) {
//				setParamNum2(submitData.getParamNum2());
//			}
//			String paramNum3 = submitData.getParamNum3() != null ? submitData.getParamNum3().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramNum3)) {
//				setParamNum3(submitData.getParamNum3());
//			}
//			String paramNum4 = submitData.getParamNum4() != null ? submitData.getParamNum4().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramNum4)) {
//				setParamNum4(submitData.getParamNum4());
//			}
//			String paramNum5 = submitData.getParamNum5() != null ? submitData.getParamNum5().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramNum5)) {
//				setParamNum5(submitData.getParamNum5());
//			}
//			String paramDt1 = submitData.getParamDt1() != null ? submitData.getParamDt1().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramDt1)) {
//				setParamDt1(submitData.getParamDt1());
//			}
//			String paramDt2 = submitData.getParamDt2() != null ? submitData.getParamDt2().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramDt2)) {
//				setParamDt2(submitData.getParamDt2());
//			}
//			String paramDt3 = submitData.getParamDt3() != null ? submitData.getParamDt3().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramDt3)) {
//				setParamDt3(submitData.getParamDt3());
//			}
//			String paramDt4 = submitData.getParamDt4() != null ? submitData.getParamDt4().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramDt4)) {
//				setParamDt4(submitData.getParamDt4());
//			}
//			String paramDt5 = submitData.getParamDt5() != null ? submitData.getParamDt5().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(paramDt5)) {
//				setParamDt5(submitData.getParamDt5());
//			}
//			String version = submitData.getVersion() != null ? submitData.getVersion().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(version)) {
//				setVersion(submitData.getVersion());
//			}
//		}
//	}
	/**
	 * ## 方法说明：
	 * 	将数据拼接成select 
	 * @param index 索引
	 * @param map 参数值
	 */
//	@Transient
//	public String selectSql(Integer index,Map<String, Map<Object, Type>> map){
//		StringBuilder insertSql = new StringBuilder("insert into log_cardkey_info (id,chain_uid,unit_uid,card_typ,card_num,room_num,acct_no,guest_nm,print_typ,arr_dt,dpt_dt,print_nums,parentcard_num,ws_no,orgws_no,realcard_num,track1,track2,track3,track4,track5,track6,track7,track8,track9,track10,block1,block2,block3,block4,block5,success_flg,print_bdt,print_dhms,print_unit_uid,print_unit_cd,print_user_uid,print_user_cd,print_user_nm,param_str1,param_str2,param_str3,param_str4,param_str5,param_str6,param_str7,param_str8,param_str9,param_str10,param_num1,param_num2,param_num3,param_num4,param_num5,param_dt1,param_dt2,param_dt3,param_dt4,param_dt5,created_by_uid,created_date,created_by,created_by_cd,created_unit_cd,created_unit_uid,modified_by_uid,modified_date,modified_by,modified_by_cd,modified_unit_cd,modified_unit_uid,trace_uid,version)");
//		StringBuilder sql=new StringBuilder(" SELECT ");
//		sql.append(String.format(":chain_uid_%s,",index));
//		map.put("chain_uid_"+index, new HashMap<>());
//		map.get("chain_uid_"+index).put(getChainUid(), StandardBasicTypes.STRING);
//		sql.append(String.format(":unit_uid_%s,",index));
//		map.put("unit_uid_"+index, new HashMap<>());
//		map.get("unit_uid_"+index).put(getUnitUid(), StandardBasicTypes.STRING);
//		sql.append(String.format(":card_typ_%s,",index));
//		map.put("card_typ_"+index, new HashMap<>());
//		map.get("card_typ_"+index).put(getCardTyp(), StandardBasicTypes.STRING);
//		sql.append(String.format(":card_num_%s,",index));
//		map.put("card_num_"+index, new HashMap<>());
//		map.get("card_num_"+index).put(getCardNum(), StandardBasicTypes.STRING);
//		sql.append(String.format(":room_num_%s,",index));
//		map.put("room_num_"+index, new HashMap<>());
//		map.get("room_num_"+index).put(getRoomNum(), StandardBasicTypes.STRING);
//		sql.append(String.format(":acct_no_%s,",index));
//		map.put("acct_no_"+index, new HashMap<>());
//		map.get("acct_no_"+index).put(getAcctNo(), StandardBasicTypes.STRING);
//		sql.append(String.format(":guest_nm_%s,",index));
//		map.put("guest_nm_"+index, new HashMap<>());
//		map.get("guest_nm_"+index).put(getGuestNm(), StandardBasicTypes.STRING);
//		sql.append(String.format(":print_typ_%s,",index));
//		map.put("print_typ_"+index, new HashMap<>());
//		map.get("print_typ_"+index).put(getPrintTyp(), StandardBasicTypes.STRING);
//		sql.append(String.format(":arr_dt_%s,",index));
//		map.put("arr_dt_"+index, new HashMap<>());
//		map.get("arr_dt_"+index).put(getArrDt(), StandardBasicTypes.DATE);
//		sql.append(String.format(":dpt_dt_%s,",index));
//		map.put("dpt_dt_"+index, new HashMap<>());
//		map.get("dpt_dt_"+index).put(getDptDt(), StandardBasicTypes.DATE);
//		sql.append(String.format(":print_nums_%s,",index));
//		map.put("print_nums_"+index, new HashMap<>());
//		map.get("print_nums_"+index).put(getPrintNums(), StandardBasicTypes.INTEGER);
//		sql.append(String.format(":parentcard_num_%s,",index));
//		map.put("parentcard_num_"+index, new HashMap<>());
//		map.get("parentcard_num_"+index).put(getParentcardNum(), StandardBasicTypes.STRING);
//		sql.append(String.format(":ws_no_%s,",index));
//		map.put("ws_no_"+index, new HashMap<>());
//		map.get("ws_no_"+index).put(getWsNo(), StandardBasicTypes.STRING);
//		sql.append(String.format(":orgws_no_%s,",index));
//		map.put("orgws_no_"+index, new HashMap<>());
//		map.get("orgws_no_"+index).put(getOrgwsNo(), StandardBasicTypes.STRING);
//		sql.append(String.format(":realcard_num_%s,",index));
//		map.put("realcard_num_"+index, new HashMap<>());
//		map.get("realcard_num_"+index).put(getRealcardNum(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track1_%s,",index));
//		map.put("track1_"+index, new HashMap<>());
//		map.get("track1_"+index).put(getTrack1(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track2_%s,",index));
//		map.put("track2_"+index, new HashMap<>());
//		map.get("track2_"+index).put(getTrack2(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track3_%s,",index));
//		map.put("track3_"+index, new HashMap<>());
//		map.get("track3_"+index).put(getTrack3(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track4_%s,",index));
//		map.put("track4_"+index, new HashMap<>());
//		map.get("track4_"+index).put(getTrack4(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track5_%s,",index));
//		map.put("track5_"+index, new HashMap<>());
//		map.get("track5_"+index).put(getTrack5(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track6_%s,",index));
//		map.put("track6_"+index, new HashMap<>());
//		map.get("track6_"+index).put(getTrack6(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track7_%s,",index));
//		map.put("track7_"+index, new HashMap<>());
//		map.get("track7_"+index).put(getTrack7(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track8_%s,",index));
//		map.put("track8_"+index, new HashMap<>());
//		map.get("track8_"+index).put(getTrack8(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track9_%s,",index));
//		map.put("track9_"+index, new HashMap<>());
//		map.get("track9_"+index).put(getTrack9(), StandardBasicTypes.STRING);
//		sql.append(String.format(":track10_%s,",index));
//		map.put("track10_"+index, new HashMap<>());
//		map.get("track10_"+index).put(getTrack10(), StandardBasicTypes.STRING);
//		sql.append(String.format(":block1_%s,",index));
//		map.put("block1_"+index, new HashMap<>());
//		map.get("block1_"+index).put(getBlock1(), StandardBasicTypes.STRING);
//		sql.append(String.format(":block2_%s,",index));
//		map.put("block2_"+index, new HashMap<>());
//		map.get("block2_"+index).put(getBlock2(), StandardBasicTypes.STRING);
//		sql.append(String.format(":block3_%s,",index));
//		map.put("block3_"+index, new HashMap<>());
//		map.get("block3_"+index).put(getBlock3(), StandardBasicTypes.STRING);
//		sql.append(String.format(":block4_%s,",index));
//		map.put("block4_"+index, new HashMap<>());
//		map.get("block4_"+index).put(getBlock4(), StandardBasicTypes.STRING);
//		sql.append(String.format(":block5_%s,",index));
//		map.put("block5_"+index, new HashMap<>());
//		map.get("block5_"+index).put(getBlock5(), StandardBasicTypes.STRING);
//		sql.append(String.format(":success_flg_%s,",index));
//		map.put("success_flg_"+index, new HashMap<>());
//		map.get("success_flg_"+index).put(getSuccessFlg(), StandardBasicTypes.STRING);
//		sql.append(String.format(":print_bdt_%s,",index));
//		map.put("print_bdt_"+index, new HashMap<>());
//		map.get("print_bdt_"+index).put(getPrintBdt(), StandardBasicTypes.DATE);
//		sql.append(String.format(":print_dhms_%s,",index));
//		map.put("print_dhms_"+index, new HashMap<>());
//		map.get("print_dhms_"+index).put(getPrintDhms(), StandardBasicTypes.DATE);
//		sql.append(String.format(":print_unit_uid_%s,",index));
//		map.put("print_unit_uid_"+index, new HashMap<>());
//		map.get("print_unit_uid_"+index).put(getPrintUnitUid(), StandardBasicTypes.STRING);
//		sql.append(String.format(":print_unit_cd_%s,",index));
//		map.put("print_unit_cd_"+index, new HashMap<>());
//		map.get("print_unit_cd_"+index).put(getPrintUnitCd(), StandardBasicTypes.STRING);
//		sql.append(String.format(":print_user_uid_%s,",index));
//		map.put("print_user_uid_"+index, new HashMap<>());
//		map.get("print_user_uid_"+index).put(getPrintUserUid(), StandardBasicTypes.STRING);
//		sql.append(String.format(":print_user_cd_%s,",index));
//		map.put("print_user_cd_"+index, new HashMap<>());
//		map.get("print_user_cd_"+index).put(getPrintUserCd(), StandardBasicTypes.STRING);
//		sql.append(String.format(":print_user_nm_%s,",index));
//		map.put("print_user_nm_"+index, new HashMap<>());
//		map.get("print_user_nm_"+index).put(getPrintUserNm(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str1_%s,",index));
//		map.put("param_str1_"+index, new HashMap<>());
//		map.get("param_str1_"+index).put(getParamStr1(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str2_%s,",index));
//		map.put("param_str2_"+index, new HashMap<>());
//		map.get("param_str2_"+index).put(getParamStr2(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str3_%s,",index));
//		map.put("param_str3_"+index, new HashMap<>());
//		map.get("param_str3_"+index).put(getParamStr3(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str4_%s,",index));
//		map.put("param_str4_"+index, new HashMap<>());
//		map.get("param_str4_"+index).put(getParamStr4(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str5_%s,",index));
//		map.put("param_str5_"+index, new HashMap<>());
//		map.get("param_str5_"+index).put(getParamStr5(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str6_%s,",index));
//		map.put("param_str6_"+index, new HashMap<>());
//		map.get("param_str6_"+index).put(getParamStr6(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str7_%s,",index));
//		map.put("param_str7_"+index, new HashMap<>());
//		map.get("param_str7_"+index).put(getParamStr7(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str8_%s,",index));
//		map.put("param_str8_"+index, new HashMap<>());
//		map.get("param_str8_"+index).put(getParamStr8(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str9_%s,",index));
//		map.put("param_str9_"+index, new HashMap<>());
//		map.get("param_str9_"+index).put(getParamStr9(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_str10_%s,",index));
//		map.put("param_str10_"+index, new HashMap<>());
//		map.get("param_str10_"+index).put(getParamStr10(), StandardBasicTypes.STRING);
//		sql.append(String.format(":param_num1_%s,",index));
//		map.put("param_num1_"+index, new HashMap<>());
//		map.get("param_num1_"+index).put(getParamNum1(), StandardBasicTypes.BIG_DECIMAL);
//		sql.append(String.format(":param_num2_%s,",index));
//		map.put("param_num2_"+index, new HashMap<>());
//		map.get("param_num2_"+index).put(getParamNum2(), StandardBasicTypes.BIG_DECIMAL);
//		sql.append(String.format(":param_num3_%s,",index));
//		map.put("param_num3_"+index, new HashMap<>());
//		map.get("param_num3_"+index).put(getParamNum3(), StandardBasicTypes.BIG_DECIMAL);
//		sql.append(String.format(":param_num4_%s,",index));
//		map.put("param_num4_"+index, new HashMap<>());
//		map.get("param_num4_"+index).put(getParamNum4(), StandardBasicTypes.BIG_DECIMAL);
//		sql.append(String.format(":param_num5_%s,",index));
//		map.put("param_num5_"+index, new HashMap<>());
//		map.get("param_num5_"+index).put(getParamNum5(), StandardBasicTypes.BIG_DECIMAL);
//		sql.append(String.format(":param_dt1_%s,",index));
//		map.put("param_dt1_"+index, new HashMap<>());
//		map.get("param_dt1_"+index).put(getParamDt1(), StandardBasicTypes.DATE);
//		sql.append(String.format(":param_dt2_%s,",index));
//		map.put("param_dt2_"+index, new HashMap<>());
//		map.get("param_dt2_"+index).put(getParamDt2(), StandardBasicTypes.DATE);
//		sql.append(String.format(":param_dt3_%s,",index));
//		map.put("param_dt3_"+index, new HashMap<>());
//		map.get("param_dt3_"+index).put(getParamDt3(), StandardBasicTypes.DATE);
//		sql.append(String.format(":param_dt4_%s,",index));
//		map.put("param_dt4_"+index, new HashMap<>());
//		map.get("param_dt4_"+index).put(getParamDt4(), StandardBasicTypes.DATE);
//		sql.append(String.format(":param_dt5_%s,",index));
//		map.put("param_dt5_"+index, new HashMap<>());
//		map.get("param_dt5_"+index).put(getParamDt5(), StandardBasicTypes.DATE);
//		sql.append(String.format(":created_by_uid_%s,",index));
//		map.put("created_by_uid_"+index, new HashMap<>());
//		map.get("created_by_uid_"+index).put(getCreatedByUid(), StandardBasicTypes.STRING);
//		sql.append(String.format(":created_date_%s,",index));
//		map.put("created_date_"+index, new HashMap<>());
//		map.get("created_date_"+index).put(getCreatedDate(), StandardBasicTypes.DATE);
//		sql.append(String.format(":created_by_%s,",index));
//		map.put("created_by_"+index, new HashMap<>());
//		map.get("created_by_"+index).put(getCreatedBy(), StandardBasicTypes.STRING);
//		sql.append(String.format(":created_by_cd_%s,",index));
//		map.put("created_by_cd_"+index, new HashMap<>());
//		map.get("created_by_cd_"+index).put(getCreatedByCd(), StandardBasicTypes.STRING);
//		sql.append(String.format(":created_unit_cd_%s,",index));
//		map.put("created_unit_cd_"+index, new HashMap<>());
//		map.get("created_unit_cd_"+index).put(getCreatedUnitCd(), StandardBasicTypes.STRING);
//		sql.append(String.format(":created_unit_uid_%s,",index));
//		map.put("created_unit_uid_"+index, new HashMap<>());
//		map.get("created_unit_uid_"+index).put(getCreatedUnitUid(), StandardBasicTypes.STRING);
//		sql.append(String.format(":version_%s,",index));
//		map.put("version_"+index, new HashMap<>());
//		map.get("version_"+index).put(getVersion(), StandardBasicTypes.INTEGER);
//		return sql.toString();
//	}
//	
//	/**
//	 * ## 方法说明：
//	 * 	字典字段获取
//	 * @param submitData 传入数据
//	 * @param isNullCopy 是否复制空值   true：复制   false：不复制
//	 */
//	@Transient
//	@JSONField(serialize = false)
//	public Map<String, List<Integer>> getDictionary() {
//		Map<String, List<Integer>> map=new HashMap<>();
//		return map;
//	}
//	
//	@Transient
//	public void conventMapToEntity(Map<String, Object> map) throws Exception {
//		if(MapUtils.isNotEmpty(map)){
//				setId(NumberUtil.toInt(map.get("id"), null));
//				setChainUid(Objects.toString(map.get("chain_uid"), null));
//				setUnitUid(Objects.toString(map.get("unit_uid"), null));
//				setCardTyp(Objects.toString(map.get("card_typ"), null));
//				setCardNum(Objects.toString(map.get("card_num"), null));
//				setRoomNum(Objects.toString(map.get("room_num"), null));
//				setAcctNo(Objects.toString(map.get("acct_no"), null));
//				setGuestNm(Objects.toString(map.get("guest_nm"), null));
//				setPrintTyp(Objects.toString(map.get("print_typ"), null));
//				setArrDt(DateUtil.toDate(map.get("arr_dt"), null));
//				setDptDt(DateUtil.toDate(map.get("dpt_dt"), null));
//				setPrintNums(NumberUtil.toInt(map.get("print_nums"), null));
//				setParentcardNum(Objects.toString(map.get("parentcard_num"), null));
//				setWsNo(Objects.toString(map.get("ws_no"), null));
//				setOrgwsNo(Objects.toString(map.get("orgws_no"), null));
//				setRealcardNum(Objects.toString(map.get("realcard_num"), null));
//				setTrack1(Objects.toString(map.get("track1"), null));
//				setTrack2(Objects.toString(map.get("track2"), null));
//				setTrack3(Objects.toString(map.get("track3"), null));
//				setTrack4(Objects.toString(map.get("track4"), null));
//				setTrack5(Objects.toString(map.get("track5"), null));
//				setTrack6(Objects.toString(map.get("track6"), null));
//				setTrack7(Objects.toString(map.get("track7"), null));
//				setTrack8(Objects.toString(map.get("track8"), null));
//				setTrack9(Objects.toString(map.get("track9"), null));
//				setTrack10(Objects.toString(map.get("track10"), null));
//				setBlock1(Objects.toString(map.get("block1"), null));
//				setBlock2(Objects.toString(map.get("block2"), null));
//				setBlock3(Objects.toString(map.get("block3"), null));
//				setBlock4(Objects.toString(map.get("block4"), null));
//				setBlock5(Objects.toString(map.get("block5"), null));
//				setSuccessFlg(Objects.toString(map.get("success_flg"), null));
//				setPrintBdt(DateUtil.toDate(map.get("print_bdt"), null));
//				setPrintDhms(DateUtil.toDate(map.get("print_dhms"), null));
//				setPrintUnitUid(Objects.toString(map.get("print_unit_uid"), null));
//				setPrintUnitCd(Objects.toString(map.get("print_unit_cd"), null));
//				setPrintUserUid(Objects.toString(map.get("print_user_uid"), null));
//				setPrintUserCd(Objects.toString(map.get("print_user_cd"), null));
//				setPrintUserNm(Objects.toString(map.get("print_user_nm"), null));
//				setParamStr1(Objects.toString(map.get("param_str1"), null));
//				setParamStr2(Objects.toString(map.get("param_str2"), null));
//				setParamStr3(Objects.toString(map.get("param_str3"), null));
//				setParamStr4(Objects.toString(map.get("param_str4"), null));
//				setParamStr5(Objects.toString(map.get("param_str5"), null));
//				setParamStr6(Objects.toString(map.get("param_str6"), null));
//				setParamStr7(Objects.toString(map.get("param_str7"), null));
//				setParamStr8(Objects.toString(map.get("param_str8"), null));
//				setParamStr9(Objects.toString(map.get("param_str9"), null));
//				setParamStr10(Objects.toString(map.get("param_str10"), null));
//				setParamNum1(NumberUtil.toBigDecimal(map.get("param_num1"), null));
//				setParamNum2(NumberUtil.toBigDecimal(map.get("param_num2"), null));
//				setParamNum3(NumberUtil.toBigDecimal(map.get("param_num3"), null));
//				setParamNum4(NumberUtil.toBigDecimal(map.get("param_num4"), null));
//				setParamNum5(NumberUtil.toBigDecimal(map.get("param_num5"), null));
//				setParamDt1(DateUtil.toDate(map.get("param_dt1"), null));
//				setParamDt2(DateUtil.toDate(map.get("param_dt2"), null));
//				setParamDt3(DateUtil.toDate(map.get("param_dt3"), null));
//				setParamDt4(DateUtil.toDate(map.get("param_dt4"), null));
//				setParamDt5(DateUtil.toDate(map.get("param_dt5"), null));
//				setVersion(NumberUtil.toInt(map.get("version"), null));
//		}
//	}

}

