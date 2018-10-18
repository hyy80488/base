package com.jw.common.framework.m0002.f001.dto.mq.point;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptField;

public class LpsBnsConsumeDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 9080090608107209742L;
	@DrptField(fieldnm = "consumeBdt", fielddrpt = "消费业务日期", nullable = "true", length = "13")
	private java.util.Date consumeBdt;
	
	@DrptField(fieldnm = "mlPrd", fielddrpt = "餐点", nullable = "true", length = "3")
	private String mlPrd;
	
	@DrptField(fieldnm = "consumeUnitUid", fielddrpt = "消费单位", nullable = "true", length = "40")
	private String consumeUnitUid;
	
	@DrptField(fieldnm = "consumePosId", fielddrpt = "消费地点", nullable = "true", length = "10")
	private Integer consumePosId;
	
	@DrptField(fieldnm = "consumeTurnId", fielddrpt = "班次", nullable = "true", length = "10")
	private Integer consumeTurnId;
	
	@DrptField(fieldnm = "consumeStus", fielddrpt = "消费记录状态", nullable = "true", length = "3")
	private String consumeStus;
	
	@DrptField(fieldnm = "consumeTyp", fielddrpt = "消费类型", nullable = "true", length = "5")
	private String consumeTyp;
	
	@DrptField(fieldnm = "relConsumeId", fielddrpt = "关联消费记录ID", nullable = "true", length = "10")
	private Integer relConsumeId;
	
	@DrptField(fieldnm = "consumeSysid", fielddrpt = "消费使用系统", nullable = "true", length = "10")
	private String consumeSysid;
	
	@DrptField(fieldnm = "creditFlg", fielddrpt = "是否累计积分", nullable = "true", length = "3")
	private String creditFlg;
	
	@DrptField(fieldnm = "cosumeNum", fielddrpt = "消费单据号码", nullable = "true", length = "200")
	private String cosumeNum;
	
	@DrptField(fieldnm = "acctNo", fielddrpt = "前台账号", nullable = "true", length = "20")
	private String acctNo;
	
	@DrptField(fieldnm = "folioNo", fielddrpt = "前台结账单号", nullable = "true", length = "20")
	private String folioNo;
	
	@DrptField(fieldnm = "posbillId", fielddrpt = "餐饮单据内码", nullable = "true", length = "10")
	private Integer posbillId;
	
	@DrptField(fieldnm = "billNo", fielddrpt = "POS结账单号", nullable = "true", length = "20")
	private String billNo;
	
	@DrptField(fieldnm = "arNo", fielddrpt = "应收账号", nullable = "true", length = "20")
	private String arNo;
	
	@DrptField(fieldnm = "invcNo", fielddrpt = "应收票据编码", nullable = "false", length = "20")
	private String invcNo;
	
	@DrptField(fieldnm = "orderNo", fielddrpt = "商城订单号", nullable = "true", length = "20")
	private String orderNo;
	
	@DrptField(fieldnm = "thirdsysBillNo", fielddrpt = "第三方系统单据号", nullable = "true", length = "40")
	private String thirdsysBillNo;
	
	@DrptField(fieldnm = "roomNum", fielddrpt = "房间号", nullable = "true", length = "20")
	private String roomNum;
	
	@DrptField(fieldnm = "bedNum", fielddrpt = "床号", nullable = "true", length = "20")
	private String bedNum;
	
	@DrptField(fieldnm = "tableNum", fielddrpt = "桌台号", nullable = "true", length = "20")
	private String tableNum;
	
	@DrptField(fieldnm = "posNum", fielddrpt = "收银机号", nullable = "true", length = "20")
	private String posNum;
	
	@DrptField(fieldnm = "adultCnt", fielddrpt = "成人数", nullable = "true", length = "5")
	private Integer adultCnt;
	
	@DrptField(fieldnm = "childrenCnt", fielddrpt = "儿童数", nullable = "true", length = "5")
	private Integer childrenCnt;
	
	@DrptField(fieldnm = "arrDt", fielddrpt = "入住日期", nullable = "true", length = "13")
	private java.util.Date arrDt;
	
	@DrptField(fieldnm = "dptDt", fielddrpt = "离店日期", nullable = "true", length = "13")
	private java.util.Date dptDt;
	
	@DrptField(fieldnm = "nights", fielddrpt = "房晚数", nullable = "true", length = "5")
	private BigDecimal nights;
	
	@DrptField(fieldnm = "marketId", fielddrpt = "市场代码", nullable = "true", length = "10")
	private Integer marketId;
	
	@DrptField(fieldnm = "sourceId", fielddrpt = "客源代码", nullable = "true", length = "10")
	private Integer sourceId;
	
	@DrptField(fieldnm = "salerId", fielddrpt = "销售员编号", nullable = "true", length = "10")
	private Integer salerId;
	
	@DrptField(fieldnm = "channelNo", fielddrpt = "渠道客户代码", nullable = "true", length = "20")
	private String channelNo;
	
	@DrptField(fieldnm = "consumeCurrencyId", fielddrpt = "消费币种", nullable = "false", length = "10")
	private Integer consumeCurrencyId;
	
	@DrptField(fieldnm = "uniExchangeRate", fielddrpt = "汇率", nullable = "false", length = "16")
	private BigDecimal uniExchangeRate;
	
	@DrptField(fieldnm = "uniCurrencyId", fielddrpt = "统一币种", nullable = "false", length = "10")
	private Integer uniCurrencyId;
	
	/*@DrptField(fieldnm = "consumeTotalAmt", fielddrpt = "消费金额", nullable = "false", length = "16")
	private BigDecimal consumeTotalAmt;
	
	@DrptField(fieldnm = "consumeTotalNet", fielddrpt = "净费用", nullable = "false", length = "16")
	private BigDecimal consumeTotalNet;
	
	@DrptField(fieldnm = "consumeTotalTax", fielddrpt = "税", nullable = "true", length = "16")
	private BigDecimal consumeTotalTax;
	
	@DrptField(fieldnm = "consumeTotalSvcnet", fielddrpt = "服务费", nullable = "true", length = "16")
	private BigDecimal consumeTotalSvcnet;

	@DrptField(fieldnm = "consumeTotalSvctax", fielddrpt = "服务费税", nullable = "true", length = "16")
	private BigDecimal consumeTotalSvctax;
	
	@DrptField(fieldnm = "uniTotalAmt", fielddrpt = "统计金额", nullable = "false", length = "16")
	private BigDecimal uniTotalAmt;
	
	@DrptField(fieldnm = "uniTotalNet", fielddrpt = "净费用", nullable = "false", length = "16")
	private BigDecimal uniTotalNet;
	
	@DrptField(fieldnm = "uniTotalTax", fielddrpt = "税", nullable = "true", length = "16")
	private BigDecimal uniTotalTax;
	
	@DrptField(fieldnm = "uniTotalSvcnet", fielddrpt = "服务费", nullable = "true", length = "16")
	private BigDecimal uniTotalSvcnet;
	
	@DrptField(fieldnm = "uniTotalSvctax", fielddrpt = "服务费税", nullable = "true", length = "16")
	private BigDecimal uniTotalSvctax;*/
	@DrptField(fieldnm = "consumeWsNo", fielddrpt = "consumeWsNo", nullable = "true", length = "20")
	private String consumeWsNo;
	
	public String getConsumeWsNo() {
		return consumeWsNo;
	}
	public void setConsumeWsNo(String consumeWsNo) {
		this.consumeWsNo = consumeWsNo;
	}

	@DrptField(fieldnm = "items", fielddrpt = "明细")
	private List<LpsBnsConsumeItemDto> items;

	public java.util.Date getConsumeBdt() {
		return consumeBdt;
	}

	public String getMlPrd() {
		return mlPrd;
	}

	public String getConsumeUnitUid() {
		return consumeUnitUid;
	}

	public Integer getConsumePosId() {
		return consumePosId;
	}

	public Integer getConsumeTurnId() {
		return consumeTurnId;
	}

	public String getConsumeStus() {
		return consumeStus;
	}

	public String getConsumeTyp() {
		return consumeTyp;
	}

	public Integer getRelConsumeId() {
		return relConsumeId;
	}

	public String getConsumeSysid() {
		return consumeSysid;
	}

	public String getCreditFlg() {
		return creditFlg;
	}

	public String getCosumeNum() {
		return cosumeNum;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public String getFolioNo() {
		return folioNo;
	}

	public Integer getPosbillId() {
		return posbillId;
	}

	public String getBillNo() {
		return billNo;
	}

	public String getArNo() {
		return arNo;
	}

	public String getInvcNo() {
		return invcNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public String getThirdsysBillNo() {
		return thirdsysBillNo;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public String getBedNum() {
		return bedNum;
	}

	public String getTableNum() {
		return tableNum;
	}

	public String getPosNum() {
		return posNum;
	}

	public Integer getAdultCnt() {
		return adultCnt;
	}

	public Integer getChildrenCnt() {
		return childrenCnt;
	}

	public java.util.Date getArrDt() {
		return arrDt;
	}

	public java.util.Date getDptDt() {
		return dptDt;
	}

	public BigDecimal getNights() {
		return nights;
	}

	public Integer getMarketId() {
		return marketId;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public Integer getSalerId() {
		return salerId;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public Integer getConsumeCurrencyId() {
		return consumeCurrencyId;
	}

	public BigDecimal getUniExchangeRate() {
		return uniExchangeRate;
	}

	public Integer getUniCurrencyId() {
		return uniCurrencyId;
	}

	public List<LpsBnsConsumeItemDto> getItems() {
		return items;
	}

	public void setConsumeBdt(java.util.Date consumeBdt) {
		this.consumeBdt = consumeBdt;
	}

	public void setMlPrd(String mlPrd) {
		this.mlPrd = mlPrd;
	}

	public void setConsumeUnitUid(String consumeUnitUid) {
		this.consumeUnitUid = consumeUnitUid;
	}

	public void setConsumePosId(Integer consumePosId) {
		this.consumePosId = consumePosId;
	}

	public void setConsumeTurnId(Integer consumeTurnId) {
		this.consumeTurnId = consumeTurnId;
	}

	public void setConsumeStus(String consumeStus) {
		this.consumeStus = consumeStus;
	}

	public void setConsumeTyp(String consumeTyp) {
		this.consumeTyp = consumeTyp;
	}

	public void setRelConsumeId(Integer relConsumeId) {
		this.relConsumeId = relConsumeId;
	}

	public void setConsumeSysid(String consumeSysid) {
		this.consumeSysid = consumeSysid;
	}

	public void setCreditFlg(String creditFlg) {
		this.creditFlg = creditFlg;
	}

	public void setCosumeNum(String cosumeNum) {
		this.cosumeNum = cosumeNum;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public void setPosbillId(Integer posbillId) {
		this.posbillId = posbillId;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public void setInvcNo(String invcNo) {
		this.invcNo = invcNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public void setThirdsysBillNo(String thirdsysBillNo) {
		this.thirdsysBillNo = thirdsysBillNo;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}

	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

	public void setPosNum(String posNum) {
		this.posNum = posNum;
	}

	public void setAdultCnt(Integer adultCnt) {
		this.adultCnt = adultCnt;
	}

	public void setChildrenCnt(Integer childrenCnt) {
		this.childrenCnt = childrenCnt;
	}

	public void setArrDt(java.util.Date arrDt) {
		this.arrDt = arrDt;
	}

	public void setDptDt(java.util.Date dptDt) {
		this.dptDt = dptDt;
	}

	public void setNights(BigDecimal nights) {
		this.nights = nights;
	}

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public void setSalerId(Integer salerId) {
		this.salerId = salerId;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public void setConsumeCurrencyId(Integer consumeCurrencyId) {
		this.consumeCurrencyId = consumeCurrencyId;
	}

	public void setUniExchangeRate(BigDecimal uniExchangeRate) {
		this.uniExchangeRate = uniExchangeRate;
	}

	public void setUniCurrencyId(Integer uniCurrencyId) {
		this.uniCurrencyId = uniCurrencyId;
	}

	public void setItems(List<LpsBnsConsumeItemDto> items) {
		this.items = items;
	}
}
