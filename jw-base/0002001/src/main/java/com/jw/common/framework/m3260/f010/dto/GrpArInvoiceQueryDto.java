
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	应收票据QUERY信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-07-19]
 * @package com.jw.hms.group.m3260.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-07-19|jianana|新增|GrpArInvoiceQueryDto新增
 */
@DrptDto(dtonm = "应收票据QUERY信息数据传输对象",dtodrpt="应收票据QUERY信息数据传输对象")
public class GrpArInvoiceQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 2761437977928947632L;
	@DrptField(fieldnm="orderColumn",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="currentPage",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="pageSize ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="id", fielddrpt="ID ID字段", nullable = "false", length = "10")
	private Integer id;
	@DrptField(fieldnm = "fastQuery", fielddrpt = "快速查询 ", nullable = "true", length = "500")
	private String fastQuery;
	public String getFastQuery() {
		return fastQuery;
	}

	public void setFastQuery(String fastSearch) {
		this.fastQuery = fastSearch;
	}

	@DrptField(fieldnm="chainUid", fielddrpt="集团代码 ", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm="unitUid", fielddrpt="单位代码 ", nullable = "false", length = "40")
	private String unitUid;
	
	@DrptField(fieldnm="invcNo", fielddrpt="应收票据编码 发番", nullable = "false", length = "20")
	private String invcNo;
	@DrptField(fieldnm="arNos", fielddrpt="应收账户编码 ", nullable = "true", length = "20")
	private List<String> arNos;
	@DrptField(fieldnm="invcNos", fielddrpt="票据号编码 ", nullable = "true", length = "20")
	private List<String> invcNos;
	/**AR:应收;AP:应付;NA:收据;CA:资金账户现付*/
	@DrptField(fieldnm="ledgerFlg", fielddrpt="分类账属性 ", nullable = "true", length = "3")
	private String ledgerFlg;
	public List<String> getArNos() {
		return arNos;
	}

	public void setArNos(List<String> arNos) {
		this.arNos = arNos;
	}

	public List<String> getInvcNos() {
		return invcNos;
	}

	public void setInvcNos(List<String> invcNos) {
		this.invcNos = invcNos;
	}

	@DrptField(fieldnm="arNo", fielddrpt="应收账户编号 ", nullable = "false", length = "20")
	private String arNo;
	
	@DrptField(fieldnm="orgArNo", fielddrpt="原应收账户编号 ", nullable = "false", length = "20")
	private String orgArNo;
	
	
	@DrptField(fieldnm="businessDt", fielddrpt="业务日期 业务日期", nullable = "false", length = "13")
	private java.util.Date businessDt;
	
	@DrptField(fieldnm="invcDhms", fielddrpt="票据建立时间 ", nullable = "false", length = "26")
	private java.util.Date invcDhms;
	@DrptField(fieldnm="invcDhStms", fielddrpt="票据建立时间开始点 ", nullable = "false", length = "26")
	private java.util.Date invcDhStms;
	@DrptField(fieldnm="invcDhStms", fielddrpt="票据建立时间结束点 ", nullable = "false", length = "26")
	private java.util.Date invcDhEdms;
	
	@DrptField(fieldnm="invcAgeDt", fielddrpt="账龄日期 账龄统计日期。前台转入时为前台结账日期；手工建立时，可以自己输入", nullable = "false", length = "13")
	private java.util.Date invcAgeDt;
	
	@DrptField(fieldnm="invcTyp", fielddrpt="发票收据标志 I：invoice，R：Recipe，D：Deposit", nullable = "false", length = "3")
	private String invcTyp;

	

	@DrptField(fieldnm="turnCd", fielddrpt="班次 ", nullable = "true", length = "3")
	private String turnCd;
	
	@DrptField(fieldnm="wsNo", fielddrpt="工作站号 ", nullable = "true", length = "20")
	private String wsNo;
	
	@DrptField(fieldnm="invcNm", fielddrpt="票据名称 前台转入时为客人姓名（含英文）；手工输入时填写", nullable = "false", length = "500")
	private String invcNm;
	
	@DrptField(fieldnm="acctNo", fielddrpt="前台账号 ", nullable = "true", length = "20")
	private String acctNo;
	
	@DrptField(fieldnm="roomNum", fielddrpt="房间号 ", nullable = "true", length = "20")
	private String roomNum;
	
	public java.util.Date getInvcDhStms() {
		return invcDhStms;
	}

	public void setInvcDhStms(java.util.Date invcDhStms) {
		this.invcDhStms = invcDhStms;
	}

	public java.util.Date getInvcDhEdms() {
		return invcDhEdms;
	}

	public void setInvcDhEdms(java.util.Date invcDhEdms) {
		this.invcDhEdms = invcDhEdms;
	}

	public java.util.Date getArrStDt() {
		return arrStDt;
	}

	public void setArrStDt(java.util.Date arrStDt) {
		this.arrStDt = arrStDt;
	}

	public java.util.Date getArrEdDt() {
		return arrEdDt;
	}

	public void setArrEdDt(java.util.Date arrEdDt) {
		this.arrEdDt = arrEdDt;
	}

	public java.util.Date getDptStDt() {
		return dptStDt;
	}

	public void setDptStDt(java.util.Date dptStDt) {
		this.dptStDt = dptStDt;
	}

	public java.util.Date getDptEdDt() {
		return dptEdDt;
	}

	public void setDptEdDt(java.util.Date dptEdDt) {
		this.dptEdDt = dptEdDt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@DrptField(fieldnm="arrDt", fielddrpt="入住日期 ", nullable = "true", length = "13")
	private java.util.Date arrDt;
	@DrptField(fieldnm="arrStDt", fielddrpt="入住日期开始点 ", nullable = "true", length = "13")
	private java.util.Date arrStDt;
	@DrptField(fieldnm="arrEdDt", fielddrpt="入住日期 结束点", nullable = "true", length = "13")
	private java.util.Date arrEdDt;
	@DrptField(fieldnm="dptDt", fielddrpt="离店日期 ", nullable = "true", length = "13")
	private java.util.Date dptDt;
	@DrptField(fieldnm="dptStDt", fielddrpt="离店日期开始点 ", nullable = "true", length = "13")
	private java.util.Date dptStDt;
	@DrptField(fieldnm="dptEdDt", fielddrpt="离店日期结束点 ", nullable = "true", length = "13")
	private java.util.Date dptEdDt;
	
	@DrptField(fieldnm="marketId", fielddrpt="市场代码 ", nullable = "true", length = "10")
	private Integer marketId;
	
	@DrptField(fieldnm="sourceId", fielddrpt="客源代码 ", nullable = "true", length = "10")
	private Integer sourceId;
	
	@DrptField(fieldnm="salerId", fielddrpt="销售员编号 ", nullable = "true", length = "10")
	private Integer salerId;
	
	@DrptField(fieldnm="billNo", fielddrpt="结账单号 前台转入时为HPT_FIN_FOLIO.folio_no，手工建立时为null", nullable = "true", length = "20")
	private String billNo;
	
	@DrptField(fieldnm="folioNum", fielddrpt="印单号码 前台转入时为HPT_FIN_FOLIO.folio_num，手工建立时为输入", nullable = "true", length = "40")
	private String folioNum;
	
	@DrptField(fieldnm="currencyId", fielddrpt="币种 指产生该发票的Unit使用的本位币种", nullable = "false", length = "10")
	private Integer currencyId;
	
	@DrptField(fieldnm="orgAmt", fielddrpt="源金额 从前台转入的金额", nullable = "false", length = "12")
	private BigDecimal orgAmt;
	
	@DrptField(fieldnm="invcAmt", fielddrpt="金额 包含手工调整后的金额", nullable = "false", length = "12")
	private BigDecimal invcAmt;
	
	@DrptField(fieldnm="invcBal", fielddrpt="余额 兑现后的金额", nullable = "false", length = "12")
	private BigDecimal invcBal;
	
	@DrptField(fieldnm="disputeAmt", fielddrpt="争议金额 ", nullable = "false", length = "12")
	private BigDecimal disputeAmt;
	
	@DrptField(fieldnm="invcStus", fielddrpt="状态 N：正常 C：对冲", nullable = "false", length = "3")
	private String invcStus;
	
	public String getBalanceFlg() {
		return balanceFlg;
	}

	public void setBalanceFlg(String balanceFlg) {
		this.balanceFlg = balanceFlg;
	}

	public String getTypeFlg() {
		return typeFlg;
	}

	public void setTypeFlg(String typeFlg) {
		this.typeFlg = typeFlg;
	}

	@DrptField(fieldnm="adjFlg", fielddrpt="调整标记 0：未调整过，1：调整过", nullable = "false", length = "3")
	private String adjFlg;
	@DrptField(fieldnm="balanceFlg", fielddrpt="余额为零 0：否，1：是", nullable = "false", length = "3")
	private String balanceFlg;
	@DrptField(fieldnm="typeFlg", fielddrpt="票据类型 0：发票，1：收据", nullable = "false", length = "3")
	private String typeFlg;
	@DrptField(fieldnm="cashierUnitUid", fielddrpt="前台结账操作员单位uid ", nullable = "true", length = "40")
	private String cashierUnitUid;
	
	@DrptField(fieldnm="cashierUnitCd", fielddrpt="前台结账操作员单位cd ", nullable = "true", length = "20")
	private String cashierUnitCd;
	
	@DrptField(fieldnm="cashierUserUid", fielddrpt="前台结账操作员uid ", nullable = "true", length = "40")
	private String cashierUserUid;
	
	@DrptField(fieldnm="cashierUserCd", fielddrpt="前台结账操作员cd ", nullable = "true", length = "20")
	private String cashierUserCd;
	
	@DrptField(fieldnm="cashierUserNm", fielddrpt="前台结账操作员姓名 ", nullable = "true", length = "200")
	private String cashierUserNm;
	
	@DrptField(fieldnm="invcRecoSeq", fielddrpt="对冲号 对冲时发番", nullable = "true", length = "20")
	private String invcRecoSeq;
	
	@DrptField(fieldnm="invcPkgFlg", fielddrpt="包属性 NML：未打包的普通票据，PKG：包，CMP：被打包的普通票据", nullable = "true", length = "3")
	private String invcPkgFlg;
	
	@DrptField(fieldnm="invcPkgNo", fielddrpt="票据包编号 包编号", nullable = "true", length = "20")
	private String invcPkgNo;
	
	@DrptField(fieldnm="issureNum", fielddrpt="发行次数 ", nullable = "true", length = "10")
	private Integer issureNum;
	
	@DrptField(fieldnm="issureDt", fielddrpt="最近一次发行日期 ", nullable = "true", length = "13")
	private java.util.Date issureDt;
	
	@DrptField(fieldnm="arMemo", fielddrpt="备注 ", nullable = "true", length = "500")
	private String arMemo;
	
	@DrptField(fieldnm="funcTyp", fielddrpt="入账方式 FRTBL：前台结账单转入；FRTCC：前台信用卡转入；ARCC：应收信用卡转入；MINVC：手工建立发票；RECP：建立收据；RECO：对冲产生；", nullable = "false", length = "5")
	private String funcTyp;
	
	@DrptField(fieldnm="histFlg", fielddrpt="是否已搬移历史记录 0：未搬移（默认） 1：已搬移", nullable = "true", length = "1")
	private String histFlg;
	
	@DrptField(fieldnm="businessDtStart", fielddrpt="日期起始 ")
	private Date businessDtStart;
	
	@DrptField(fieldnm="businessDtEnd", fielddrpt="日期结束 ")
	private Date businessDtEnd;
	
	@DrptField(fieldnm="minAmt", fielddrpt="最小金额 ")
	private BigDecimal minAmt;
	
	@DrptField(fieldnm="maxAmt", fielddrpt="最大金额 ")
	private BigDecimal maxAmt;
	
	@DrptField(fieldnm="minBal", fielddrpt="最小余额")
	private BigDecimal minBal;
	
	@DrptField(fieldnm="maxBal", fielddrpt="最大余额")
	private BigDecimal maxBal;
	
	@DrptField(fieldnm="trncdId", fielddrpt="交易代码ID")
	private Integer trncdId;
	
	@DrptField(fieldnm="funTyp", fielddrpt="入账方式类型 ")
	private List<String> funTyp;
	
	@DrptField(fieldnm="exceptInvcNo", fielddrpt="忽略发票账号 ")
	private String exceptInvcNo;
	
	@DrptField(fieldnm="recoTyp", fielddrpt="对冲1 ")
	private String recoTyp;
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer value) {
		this.id = value;
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
	public String getInvcNo() {
		return this.invcNo;
	}
	
	public void setInvcNo(String value) {
		this.invcNo = value;
	}
	public String getArNo() {
		return this.arNo;
	}
	
	public void setArNo(String value) {
		this.arNo = value;
	}
	public String getOrgArNo() {
		return this.orgArNo;
	}
	
	public void setOrgArNo(String value) {
		this.orgArNo = value;
	}
	public java.util.Date getBusinessDt() {
		return this.businessDt;
	}
	
	public void setBusinessDt(java.util.Date value) {
		this.businessDt = value;
	}
	public java.util.Date getInvcDhms() {
		return this.invcDhms;
	}
	
	public void setInvcDhms(java.util.Date value) {
		this.invcDhms = value;
	}
	public java.util.Date getInvcAgeDt() {
		return this.invcAgeDt;
	}
	
	public void setInvcAgeDt(java.util.Date value) {
		this.invcAgeDt = value;
	}
	public String getInvcTyp() {
		return this.invcTyp;
	}
	
	public void setInvcTyp(String value) {
		this.invcTyp = value;
	}
	public String getTurnCd() {
		return this.turnCd;
	}
	
	public void setTurnCd(String value) {
		this.turnCd = value;
	}
	public String getWsNo() {
		return this.wsNo;
	}
	
	public void setWsNo(String value) {
		this.wsNo = value;
	}
	public String getInvcNm() {
		return this.invcNm;
	}
	
	public void setInvcNm(String value) {
		this.invcNm = value;
	}
	public String getAcctNo() {
		return this.acctNo;
	}
	
	public void setAcctNo(String value) {
		this.acctNo = value;
	}
	public String getRoomNum() {
		return this.roomNum;
	}
	
	public void setRoomNum(String value) {
		this.roomNum = value;
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
	public Integer getMarketId() {
		return this.marketId;
	}
	
	public void setMarketId(Integer value) {
		this.marketId = value;
	}
	public Integer getSourceId() {
		return this.sourceId;
	}
	
	public void setSourceId(Integer value) {
		this.sourceId = value;
	}
	public Integer getSalerId() {
		return this.salerId;
	}
	
	public void setSalerId(Integer value) {
		this.salerId = value;
	}
	public String getBillNo() {
		return this.billNo;
	}
	
	public void setBillNo(String value) {
		this.billNo = value;
	}
	public String getFolioNum() {
		return this.folioNum;
	}
	
	public void setFolioNum(String value) {
		this.folioNum = value;
	}
	public Integer getCurrencyId() {
		return this.currencyId;
	}
	
	public void setCurrencyId(Integer value) {
		this.currencyId = value;
	}
	public BigDecimal getOrgAmt() {
		return this.orgAmt;
	}
	
	public void setOrgAmt(BigDecimal value) {
		this.orgAmt = value;
	}
	public BigDecimal getInvcAmt() {
		return this.invcAmt;
	}
	
	public void setInvcAmt(BigDecimal value) {
		this.invcAmt = value;
	}
	public BigDecimal getInvcBal() {
		return this.invcBal;
	}
	
	public void setInvcBal(BigDecimal value) {
		this.invcBal = value;
	}
	public BigDecimal getDisputeAmt() {
		return this.disputeAmt;
	}
	
	public void setDisputeAmt(BigDecimal value) {
		this.disputeAmt = value;
	}
	public String getInvcStus() {
		return this.invcStus;
	}
	
	public void setInvcStus(String value) {
		this.invcStus = value;
	}
	public String getAdjFlg() {
		return this.adjFlg;
	}
	
	public void setAdjFlg(String value) {
		this.adjFlg = value;
	}
	public String getCashierUnitUid() {
		return this.cashierUnitUid;
	}
	
	public void setCashierUnitUid(String value) {
		this.cashierUnitUid = value;
	}
	public String getCashierUnitCd() {
		return this.cashierUnitCd;
	}
	
	public void setCashierUnitCd(String value) {
		this.cashierUnitCd = value;
	}
	public String getCashierUserUid() {
		return this.cashierUserUid;
	}
	
	public void setCashierUserUid(String value) {
		this.cashierUserUid = value;
	}
	public String getCashierUserCd() {
		return this.cashierUserCd;
	}
	
	public void setCashierUserCd(String value) {
		this.cashierUserCd = value;
	}
	public String getCashierUserNm() {
		return this.cashierUserNm;
	}
	
	public void setCashierUserNm(String value) {
		this.cashierUserNm = value;
	}
	public String getInvcRecoSeq() {
		return this.invcRecoSeq;
	}
	
	public void setInvcRecoSeq(String value) {
		this.invcRecoSeq = value;
	}
	public String getInvcPkgFlg() {
		return this.invcPkgFlg;
	}
	
	public void setInvcPkgFlg(String value) {
		this.invcPkgFlg = value;
	}
	public String getInvcPkgNo() {
		return this.invcPkgNo;
	}
	
	public void setInvcPkgNo(String value) {
		this.invcPkgNo = value;
	}
	public Integer getIssureNum() {
		return this.issureNum;
	}
	
	public void setIssureNum(Integer value) {
		this.issureNum = value;
	}
	public java.util.Date getIssureDt() {
		return this.issureDt;
	}
	
	public void setIssureDt(java.util.Date value) {
		this.issureDt = value;
	}
	public String getArMemo() {
		return this.arMemo;
	}
	
	public void setArMemo(String value) {
		this.arMemo = value;
	}
	public String getFuncTyp() {
		return this.funcTyp;
	}
	
	public void setFuncTyp(String value) {
		this.funcTyp = value;
	}
	public String getHistFlg() {
		return this.histFlg;
	}
	
	public void setHistFlg(String value) {
		this.histFlg = value;
	}
	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}
	
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public String getLedgerFlg() {
		return ledgerFlg;
	}

	public void setLedgerFlg(String ledgerFlg) {
		this.ledgerFlg = ledgerFlg;
	}

	
	public Date getBusinessDtStart() {
		return businessDtStart;
	}

	public void setBusinessDtStart(Date businessDtStart) {
		this.businessDtStart = businessDtStart;
	}

	public Date getBusinessDtEnd() {
		return businessDtEnd;
	}

	public void setBusinessDtEnd(Date businessDtEnd) {
		this.businessDtEnd = businessDtEnd;
	}

	public BigDecimal getMinAmt() {
		return minAmt;
	}

	public void setMinAmt(BigDecimal minAmt) {
		this.minAmt = minAmt;
	}

	public BigDecimal getMaxAmt() {
		return maxAmt;
	}

	public void setMaxAmt(BigDecimal maxAmt) {
		this.maxAmt = maxAmt;
	}

	public BigDecimal getMinBal() {
		return minBal;
	}

	public void setMinBal(BigDecimal minBal) {
		this.minBal = minBal;
	}

	public BigDecimal getMaxBal() {
		return maxBal;
	}

	public void setMaxBal(BigDecimal maxBal) {
		this.maxBal = maxBal;
	}

	public Integer getTrncdId() {
		return trncdId;
	}

	public void setTrncdId(Integer trncdId) {
		this.trncdId = trncdId;
	}

	public List<String> getFunTyp() {
		return funTyp;
	}

	public void setFunTyp(List<String> funTyp) {
		this.funTyp = funTyp;
	}

	
	public String getExceptInvcNo() {
		return exceptInvcNo;
	}

	public void setExceptInvcNo(String exceptInvcNo) {
		this.exceptInvcNo = exceptInvcNo;
	}

	public String getRecoTyp() {
		return recoTyp;
	}

	public void setRecoTyp(String recoTyp) {
		this.recoTyp = recoTyp;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

