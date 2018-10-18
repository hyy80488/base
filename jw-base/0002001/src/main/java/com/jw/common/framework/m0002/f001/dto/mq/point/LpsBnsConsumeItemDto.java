package com.jw.common.framework.m0002.f001.dto.mq.point;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

import com.jw.base.framework.core.annotation.DrptField;

public class LpsBnsConsumeItemDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1569137830410542721L;

	@DrptField(fieldnm = "valueTyp", fielddrpt = "金额类型", nullable = "false", length = "3")
	private String valueTyp;
	
	@DrptField(fieldnm = "taxtypeId", fielddrpt = "税种ID", nullable = "true", length = "10")
	private Integer taxtypeId;
	
	@DrptField(fieldnm = "taxrateId", fielddrpt = "税率ID", nullable = "true", length = "10")
	private Integer taxrateId;
	
	@DrptField(fieldnm = "consumeUnitUid", fielddrpt = "消费单位", nullable = "true", length = "40")
	private String consumeUnitUid;
	
	@DrptField(fieldnm = "consumePosId", fielddrpt = "消费地点", nullable = "true", length = "10")
	private Integer consumePosId;
	
	@DrptField(fieldnm = "consumeTurnId", fielddrpt = "班次", nullable = "true", length = "10")
	private Integer consumeTurnId;
	
	@DrptField(fieldnm = "consumeWsNo", fielddrpt = "工作站号", nullable = "true", length = "20")
	private String consumeWsNo;
	
	@DrptField(fieldnm = "csmdtlBusinessDt", fielddrpt = "业务日期", nullable = "false", length = "13")
	private java.util.Date csmdtlBusinessDt;
	
	@DrptField(fieldnm = "csmdtlPostDhms", fielddrpt = "入账日期时间", nullable = "false", length = "26")
	private java.util.Date csmdtlPostDhms;
	
	@DrptField(fieldnm = "funcTyp", fielddrpt = "入账方式", nullable = "false", length = "5")
	private String funcTyp;
	
	@DrptField(fieldnm = "trnId", fielddrpt = "客账交易ID", nullable = "true", length = "10")
	private Integer trnId;
	
	@DrptField(fieldnm = "mtrnId", fielddrpt = "客账交易ID", nullable = "true", length = "10")
	private Integer mtrnId;
	
	@DrptField(fieldnm = "thirdsysTrnNo", fielddrpt = "第三方交易内码", nullable = "true", length = "40")
	private String thirdsysTrnNo;
	
	@DrptField(fieldnm = "taxSeq", fielddrpt = "税组号", nullable = "true", length = "20")
	private String taxSeq;
	
	@DrptField(fieldnm = "acctNo", fielddrpt = "发生前台账号", nullable = "false", length = "20")
	private String acctNo;
	
	@DrptField(fieldnm = "roomNum", fielddrpt = "发生房号", nullable = "true", length = "20")
	private String roomNum;
	
	@DrptField(fieldnm = "areaId", fielddrpt = "账务发生楼区代码", nullable = "true", length = "10")
	private Integer areaId;
	
	@DrptField(fieldnm = "turnId", fielddrpt = "班次", nullable = "true", length = "10")
	private Integer turnId;
	
	@DrptField(fieldnm = "wsNo", fielddrpt = "工作站号", nullable = "true", length = "20")
	private String wsNo;
	
	@DrptField(fieldnm = "trncdId", fielddrpt = "科目ID", nullable = "true", length = "10")
	private Integer trncdId;
	
	@DrptField(fieldnm = "trnCd", fielddrpt = "科目编码", nullable = "true", length = "20")
	private String trnCd;
	
	@DrptField(fieldnm = "trnDrpt", fielddrpt = "科目名称（单位本地语种）", nullable = "true", length = "200")
	private String trnDrpt;
	
	@DrptField(fieldnm = "trnclsId", fielddrpt = "科目大分类", nullable = "true", length = "10")
	private Integer trnclsId;
	
	@DrptField(fieldnm = "trnsubclsId", fielddrpt = "科目小分类", nullable = "true", length = "10")
	private Integer trnsubclsId;
	
	@DrptField(fieldnm = "normal", fielddrpt = "科目借贷属性", nullable = "true", length = "3")
	private String normal;
	
	@DrptField(fieldnm = "trnTyp", fielddrpt = "科目类型", nullable = "true", length = "3")
	private String trnTyp;
	
	@DrptField(fieldnm = "posbillId", fielddrpt = "餐饮单据内码", nullable = "true", length = "10")
	private Integer posbillId;
	
	@DrptField(fieldnm = "folioNo", fielddrpt = "单据内码", nullable = "true", length = "20")
	@Size(max=20)
	private String folioNo;
	
	@DrptField(fieldnm = "mlPrd", fielddrpt = "餐点", nullable = "true", length = "3")
	@Size(max=3)
	private String mlPrd;
	
	@DrptField(fieldnm = "currencyId", fielddrpt = "入账币种", nullable = "true", length = "10")
	private Integer currencyId;
	
	@DrptField(fieldnm = "exchangeRate", fielddrpt = "汇率", nullable = "true", length = "16")
	private BigDecimal exchangeRate;
	
	@DrptField(fieldnm = "consumeCurrencyId", fielddrpt = "入账单位币种", nullable = "true", length = "10")
	private Integer consumeCurrencyId;
	
	@DrptField(fieldnm = "uniExchangeRate", fielddrpt = "汇率", nullable = "true", length = "16")
	private BigDecimal uniExchangeRate;
	
	@DrptField(fieldnm = "uniCurrencyId", fielddrpt = "统一币种", nullable = "true", length = "10")
	private Integer uniCurrencyId;
	
	@DrptField(fieldnm = "shopgoodsId", fielddrpt = "商城商品ID", nullable = "true", length = "10")
	private Integer shopgoodsId;
	
	@DrptField(fieldnm = "productId", fielddrpt = "消费品ID", nullable = "true", length = "10")
	private Integer productId;
	
	@DrptField(fieldnm = "goodsId", fielddrpt = "商品ID", nullable = "true", length = "10")
	private Integer goodsId;
	
	@DrptField(fieldnm = "goodsPrice", fielddrpt = "单价", nullable = "true", length = "16")
	private BigDecimal goodsPrice;

	@DrptField(fieldnm = "goodstdQuant", fielddrpt = "标准数量", nullable = "true", length = "12")
	private BigDecimal goodstdQuant;
	
	@DrptField(fieldnm = "goodsQuant", fielddrpt = "数量", nullable = "true", length = "12")
	private BigDecimal goodsQuant;

	@DrptField(fieldnm = "trnAmt", fielddrpt = "金额", nullable = "false", length = "16")
	private BigDecimal trnAmt;

	@DrptField(fieldnm = "rateId", fielddrpt = "房价代码", nullable = "true", length = "10")
	private Integer rateId;
	
	@DrptField(fieldnm = "cohuFlg", fielddrpt = "免费自用标识", nullable = "true", length = "3")
	private String cohuFlg;
	
	@DrptField(fieldnm = "nocreditFlg", fielddrpt = "禁止积分标识", nullable = "false", length = "3")
	private String nocreditFlg;
	
	@DrptField(fieldnm = "marketId", fielddrpt = "市场代码", nullable = "true", length = "10")
	private Integer marketId;
	
	@DrptField(fieldnm = "sourceId", fielddrpt = "客源代码", nullable = "true", length = "10")
	private Integer sourceId;
	
	@DrptField(fieldnm = "channelNo", fielddrpt = "渠道客户代码", nullable = "true", length = "20")
	private String channelNo;
	
	@DrptField(fieldnm = "igFlg", fielddrpt = "团散区分", nullable = "true", length = "3")
	private String igFlg;

	public String getValueTyp() {
		return valueTyp;
	}

	public Integer getTaxtypeId() {
		return taxtypeId;
	}

	public Integer getTaxrateId() {
		return taxrateId;
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

	public String getConsumeWsNo() {
		return consumeWsNo;
	}

	public java.util.Date getCsmdtlBusinessDt() {
		return csmdtlBusinessDt;
	}

	public java.util.Date getCsmdtlPostDhms() {
		return csmdtlPostDhms;
	}

	public String getFuncTyp() {
		return funcTyp;
	}

	public Integer getTrnId() {
		return trnId;
	}

	public Integer getMtrnId() {
		return mtrnId;
	}

	public String getThirdsysTrnNo() {
		return thirdsysTrnNo;
	}

	public String getTaxSeq() {
		return taxSeq;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public Integer getTurnId() {
		return turnId;
	}

	public String getWsNo() {
		return wsNo;
	}

	public Integer getTrncdId() {
		return trncdId;
	}

	public String getTrnCd() {
		return trnCd;
	}

	public String getTrnDrpt() {
		return trnDrpt;
	}

	public Integer getTrnclsId() {
		return trnclsId;
	}

	public Integer getTrnsubclsId() {
		return trnsubclsId;
	}

	public String getNormal() {
		return normal;
	}

	public String getTrnTyp() {
		return trnTyp;
	}

	public Integer getPosbillId() {
		return posbillId;
	}

	public String getFolioNo() {
		return folioNo;
	}

	public String getMlPrd() {
		return mlPrd;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
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

	public Integer getShopgoodsId() {
		return shopgoodsId;
	}

	public Integer getProductId() {
		return productId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public BigDecimal getGoodstdQuant() {
		return goodstdQuant;
	}

	public BigDecimal getGoodsQuant() {
		return goodsQuant;
	}

	public BigDecimal getTrnAmt() {
		return trnAmt;
	}

	public Integer getRateId() {
		return rateId;
	}

	public String getCohuFlg() {
		return cohuFlg;
	}

	public String getNocreditFlg() {
		return nocreditFlg;
	}

	public Integer getMarketId() {
		return marketId;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public String getIgFlg() {
		return igFlg;
	}

	public void setValueTyp(String valueTyp) {
		this.valueTyp = valueTyp;
	}

	public void setTaxtypeId(Integer taxtypeId) {
		this.taxtypeId = taxtypeId;
	}

	public void setTaxrateId(Integer taxrateId) {
		this.taxrateId = taxrateId;
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

	public void setConsumeWsNo(String consumeWsNo) {
		this.consumeWsNo = consumeWsNo;
	}

	public void setCsmdtlBusinessDt(java.util.Date csmdtlBusinessDt) {
		this.csmdtlBusinessDt = csmdtlBusinessDt;
	}

	public void setCsmdtlPostDhms(java.util.Date csmdtlPostDhms) {
		this.csmdtlPostDhms = csmdtlPostDhms;
	}

	public void setFuncTyp(String funcTyp) {
		this.funcTyp = funcTyp;
	}

	public void setTrnId(Integer trnId) {
		this.trnId = trnId;
	}

	public void setMtrnId(Integer mtrnId) {
		this.mtrnId = mtrnId;
	}

	public void setThirdsysTrnNo(String thirdsysTrnNo) {
		this.thirdsysTrnNo = thirdsysTrnNo;
	}

	public void setTaxSeq(String taxSeq) {
		this.taxSeq = taxSeq;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public void setTurnId(Integer turnId) {
		this.turnId = turnId;
	}

	public void setWsNo(String wsNo) {
		this.wsNo = wsNo;
	}

	public void setTrncdId(Integer trncdId) {
		this.trncdId = trncdId;
	}

	public void setTrnCd(String trnCd) {
		this.trnCd = trnCd;
	}

	public void setTrnDrpt(String trnDrpt) {
		this.trnDrpt = trnDrpt;
	}

	public void setTrnclsId(Integer trnclsId) {
		this.trnclsId = trnclsId;
	}

	public void setTrnsubclsId(Integer trnsubclsId) {
		this.trnsubclsId = trnsubclsId;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

	public void setTrnTyp(String trnTyp) {
		this.trnTyp = trnTyp;
	}

	public void setPosbillId(Integer posbillId) {
		this.posbillId = posbillId;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public void setMlPrd(String mlPrd) {
		this.mlPrd = mlPrd;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
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

	public void setShopgoodsId(Integer shopgoodsId) {
		this.shopgoodsId = shopgoodsId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public void setGoodstdQuant(BigDecimal goodstdQuant) {
		this.goodstdQuant = goodstdQuant;
	}

	public void setGoodsQuant(BigDecimal goodsQuant) {
		this.goodsQuant = goodsQuant;
	}

	public void setTrnAmt(BigDecimal trnAmt) {
		this.trnAmt = trnAmt;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	public void setCohuFlg(String cohuFlg) {
		this.cohuFlg = cohuFlg;
	}

	public void setNocreditFlg(String nocreditFlg) {
		this.nocreditFlg = nocreditFlg;
	}

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public void setIgFlg(String igFlg) {
		this.igFlg = igFlg;
	}
}
