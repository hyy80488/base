/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m7550.f011.order.dto;

import java.math.BigDecimal;

public class OrderResDtlDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -5797867073975644293L;
	/**订单确认号**/
	private String crsNum;
	/**众荟酒店编码**/
	private String jwHotelCode;
	private BigDecimal deductingAmt;
	
	
	public BigDecimal getDeductingAmt() {
		return deductingAmt;
	}
	public void setDeductingAmt(BigDecimal deductingAmt) {
		this.deductingAmt = deductingAmt;
	}
	public String getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}
	public String getJwHotelCode() {
		return jwHotelCode;
	}
	public void setJwHotelCode(String jwHotelCode) {
		this.jwHotelCode = jwHotelCode;
	}
	
	
}
