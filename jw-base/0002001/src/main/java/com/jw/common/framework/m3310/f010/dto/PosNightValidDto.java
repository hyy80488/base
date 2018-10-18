package com.jw.common.framework.m3310.f010.dto;

import java.math.BigDecimal;

public class PosNightValidDto implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7367193717471739381L;

	private Integer salesId;
	
	private String salesCd;
	
	private String salesNm;
	
	private Integer salesSeq;
	
	private Integer billNum;
	
	private BigDecimal billAmount;
	
	public Integer getSalesId() {
		return salesId;
	}

	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}

	public String getSalesCd() {
		return salesCd;
	}

	public void setSalesCd(String salesCd) {
		this.salesCd = salesCd;
	}

	public String getSalesNm() {
		return salesNm;
	}

	public void setSalesNm(String salesNm) {
		this.salesNm = salesNm;
	}

	public Integer getSalesSeq() {
		return salesSeq;
	}

	public void setSalesSeq(Integer salesSeq) {
		this.salesSeq = salesSeq;
	}

	public Integer getBillNum() {
		return billNum;
	}

	public void setBillNum(Integer billNum) {
		this.billNum = billNum;
	}

	public BigDecimal getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
}
