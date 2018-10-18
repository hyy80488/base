/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3240.f010.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptField;

/**
 * 
 * ## 类说明：
 * 	销售点挂账
 * @author    [jianana]   
 * @version   [V1.0, 2017年6月7日]
 * @package com.jw.hms.pms.m3240.f010.dto.hptFinCom
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月21日|jianana|新增|SaleCreditParamDto.java新增
 */
public class SaleCreditParamDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -2382907350145158487L;
	/** 销售点  **/
	private Integer salesId;
	/** 餐点标识 0-早餐,1-午餐,2-下午茶,3-晚餐,4-夜宵,5-其他  **/
	private String periodFlg;
	/** 账号   **/
	private String acctNo;
	/** 房号 以账户号为准，如果有账户号，则使用账户号挂账，如果没有账户号，则以房号为准，用房号去获取账号，如果取到多个账户，则抛出错误。   **/
	private String roomNum;
	/** 入账金额    **/
	private BigDecimal inputAmt;
	/** 挂账标识 0-普通 1-强制 预留字段-----1的时候不需要判断账户是否有禁止挂帐标志，0的时候需要判断账户是否有禁止挂账标志，如果禁止挂账，则不能挂账，抛出错误。     **/
	private String overpost;
	/** 交易注释  **/
	private String trnCmnt;
	/** 账单交易号，保存在trn_ref  **/
	private String billtranNo;
	/** 工作站号   **/
	private String wsNo;
	/** 账务交易代码 **/
	private Integer trncdId;
	/** 账务税1交易代码 **/
	private Integer trnTax1Id;
	/** 账务税2交易代码 **/
	private Integer trnTax2Id;
	/** 账务税3交易代码 **/
	private Integer trnTax3Id;
	/** 账务税4交易代码 **/
	private Integer trnTax4Id;
	/** 账务税5交易代码 **/
	private Integer trnTax5Id;
	/** 账务服务费交易代码 **/
	private Integer trnsvcId;
	/** 账务服务费税1交易代码 **/
	private Integer trnsvcTax1Id;
	/** 账务服务费税2交易代码 **/
	private Integer trnsvcTax2Id;
	/** 账务服务费税3交易代码 **/
	private Integer trnsvcTax3Id;
	/** 账务服务费税4交易代码 **/
	private Integer trnsvcTax4Id;
	/** 账务服务费税5交易代码 **/
	private Integer trnsvcTax5Id;
	/** 净房价  默认为0 **/
	private BigDecimal trnNet;
	/** 税1  默认为0 **/
	private BigDecimal trnTax1;
	/** 税2  默认为0 **/
	private BigDecimal trnTax2;
	/** 税3   默认为0**/
	private BigDecimal trnTax3;
	/** 税4  默认为0 **/
	private BigDecimal trnTax4;
	/** 税5   默认为0**/
	private BigDecimal trnTax5;
	/** 服务费  默认为0 **/
	private BigDecimal trnsvc;
	/** 服务费税1   默认为0**/
	private BigDecimal trnsvcTax1;
	/** 服务费税2   默认为0**/
	private BigDecimal trnsvcTax2;
	/** 服务费税3   默认为0**/
	private BigDecimal trnsvcTax3;
	/** 服务费税4   默认为0**/
	private BigDecimal trnsvcTax4;
	/** 服务费税5   默认为0**/
	private BigDecimal trnsvcTax5;
	/** 餐饮单据内码 餐饮接口传入      **/
	private Integer posbillId;
	/** 发番获取Constant.TRN_ID     **/
	private Integer trnId;
	/** 净价税组号 Constant.TAX_SEQ     **/
	private String netTaxSeq;
	/** 服务费税组号 Constant.TAX_SEQ     **/
	private String svcTaxSeq;
	/** 单据号码     **/
	private String folioNo;
	/** 付款对象数组，银行卡类型：ccardtypId,应收账号：arNo,key包含有postrnId-销售点付款的交易id,trncdId--销售点付款的交易代码,trnAmt--销售点付款的金额(负数)  ,trnId 发番获取Constant.TRN_ID, taxSeq 税组号 Constant.TAX_SEQ      **/
	private List<Map<String, Object>> payments;
	
	
	@DrptField(fieldnm = "businessStatus", fielddrpt = "业务状态")
	private String businessStatus;

	public String getBusinessStatus() {
		return businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public Integer getTrnId() {
		return trnId;
	}

	public void setTrnId(Integer trnId) {
		this.trnId = trnId;
	}

	public String getNetTaxSeq() {
		return netTaxSeq;
	}

	public void setNetTaxSeq(String netTaxSeq) {
		this.netTaxSeq = netTaxSeq;
	}

	public String getSvcTaxSeq() {
		return svcTaxSeq;
	}

	public void setSvcTaxSeq(String svcTaxSeq) {
		this.svcTaxSeq = svcTaxSeq;
	}

	public String getFolioNo() {
		return folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public Integer getSalesId() {
		return salesId;
	}

	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}

	public String getPeriodFlg() {
		return periodFlg;
	}

	public void setPeriodFlg(String periodFlg) {
		this.periodFlg = periodFlg;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public Integer getTrncdId() {
		return trncdId;
	}

	public void setTrncdId(Integer trncdId) {
		this.trncdId = trncdId;
	}

	public BigDecimal getInputAmt() {
		return inputAmt;
	}

	public void setInputAmt(BigDecimal inputAmt) {
		this.inputAmt = inputAmt;
	}

	public String getOverpost() {
		return overpost != null ? overpost : "0";
	}

	public void setOverpost(String overpost) {
		this.overpost = overpost;
	}

	public String getTrnCmnt() {
		return trnCmnt;
	}

	public void setTrnCmnt(String trnCmnt) {
		this.trnCmnt = trnCmnt;
	}

	public String getBilltranNo() {
		return billtranNo;
	}

	public void setBilltranNo(String billtranNo) {
		this.billtranNo = billtranNo;
	}

	public String getWsNo() {
		return wsNo;
	}

	public void setWsNo(String wsNo) {
		this.wsNo = wsNo;
	}

	public BigDecimal getTrnNet() {
		return defValue(trnNet);
	}

	public void setTrnNet(BigDecimal trnNet) {
		this.trnNet = trnNet;
	}

	public BigDecimal getTrnTax1() {
		return defValue(trnTax1);
	}

	public void setTrnTax1(BigDecimal trnTax1) {
		this.trnTax1 = trnTax1;
	}

	public BigDecimal getTrnTax2() {
		return defValue(trnTax2);
	}

	public void setTrnTax2(BigDecimal trnTax2) {
		this.trnTax2 = trnTax2;
	}

	public BigDecimal getTrnTax3() {
		return defValue(trnTax3);
	}

	public void setTrnTax3(BigDecimal trnTax3) {
		this.trnTax3 = trnTax3;
	}

	public BigDecimal getTrnTax4() {
		return defValue(trnTax4);
	}

	public void setTrnTax4(BigDecimal trnTax4) {
		this.trnTax4 = trnTax4;
	}

	public BigDecimal getTrnTax5() {
		return defValue(trnTax5);
	}

	public void setTrnTax5(BigDecimal trnTax5) {
		this.trnTax5 = trnTax5;
	}

	public BigDecimal getTrnsvc() {
		return defValue(trnsvc);
	}

	public void setTrnsvc(BigDecimal trnsvc) {
		this.trnsvc = trnsvc;
	}

	public BigDecimal getTrnsvcTax1() {
		return defValue(trnsvcTax1);
	}

	public void setTrnsvcTax1(BigDecimal trnsvcTax1) {
		this.trnsvcTax1 = trnsvcTax1;
	}

	public BigDecimal getTrnsvcTax2() {
		return defValue(trnsvcTax2);
	}

	public void setTrnsvcTax2(BigDecimal trnsvcTax2) {
		this.trnsvcTax2 = trnsvcTax2;
	}

	public BigDecimal getTrnsvcTax3() {
		return defValue(trnsvcTax3);
	}

	public void setTrnsvcTax3(BigDecimal trnsvcTax3) {
		this.trnsvcTax3 = trnsvcTax3;
	}

	public BigDecimal getTrnsvcTax4() {
		return defValue(trnsvcTax4);
	}

	public void setTrnsvcTax4(BigDecimal trnsvcTax4) {
		this.trnsvcTax4 = trnsvcTax4;
	}

	public BigDecimal getTrnsvcTax5() {
		return defValue(trnsvcTax5);
	}

	public void setTrnsvcTax5(BigDecimal trnsvcTax5) {
		this.trnsvcTax5 = trnsvcTax5;
	}

	public Integer getPosbillId() {
		return posbillId;
	}

	public void setPosbillId(Integer posbillId) {
		this.posbillId = posbillId;
	}

	public List<Map<String, Object>> getPayments() {
		return payments;
	}

	public void setPayments(List<Map<String, Object>> payments) {
		this.payments = payments;
	}

	public Integer getTrnTax1Id() {
		return trnTax1Id;
	}

	public void setTrnTax1Id(Integer trnTax1Id) {
		this.trnTax1Id = trnTax1Id;
	}

	public Integer getTrnTax2Id() {
		return trnTax2Id;
	}

	public void setTrnTax2Id(Integer trnTax2Id) {
		this.trnTax2Id = trnTax2Id;
	}

	public Integer getTrnTax3Id() {
		return trnTax3Id;
	}

	public void setTrnTax3Id(Integer trnTax3Id) {
		this.trnTax3Id = trnTax3Id;
	}

	public Integer getTrnTax4Id() {
		return trnTax4Id;
	}

	public void setTrnTax4Id(Integer trnTax4Id) {
		this.trnTax4Id = trnTax4Id;
	}

	public Integer getTrnTax5Id() {
		return trnTax5Id;
	}

	public void setTrnTax5Id(Integer trnTax5Id) {
		this.trnTax5Id = trnTax5Id;
	}

	public Integer getTrnsvcId() {
		return trnsvcId;
	}

	public void setTrnsvcId(Integer trnsvcId) {
		this.trnsvcId = trnsvcId;
	}

	public Integer getTrnsvcTax1Id() {
		return trnsvcTax1Id;
	}

	public void setTrnsvcTax1Id(Integer trnsvcTax1Id) {
		this.trnsvcTax1Id = trnsvcTax1Id;
	}

	public Integer getTrnsvcTax2Id() {
		return trnsvcTax2Id;
	}

	public void setTrnsvcTax2Id(Integer trnsvcTax2Id) {
		this.trnsvcTax2Id = trnsvcTax2Id;
	}

	public Integer getTrnsvcTax3Id() {
		return trnsvcTax3Id;
	}

	public void setTrnsvcTax3Id(Integer trnsvcTax3Id) {
		this.trnsvcTax3Id = trnsvcTax3Id;
	}

	public Integer getTrnsvcTax4Id() {
		return trnsvcTax4Id;
	}

	public void setTrnsvcTax4Id(Integer trnsvcTax4Id) {
		this.trnsvcTax4Id = trnsvcTax4Id;
	}

	public Integer getTrnsvcTax5Id() {
		return trnsvcTax5Id;
	}

	public void setTrnsvcTax5Id(Integer trnsvcTax5Id) {
		this.trnsvcTax5Id = trnsvcTax5Id;
	}

	private BigDecimal defValue(BigDecimal value) {
		return value != null ? value : BigDecimal.ZERO;
	}
}
