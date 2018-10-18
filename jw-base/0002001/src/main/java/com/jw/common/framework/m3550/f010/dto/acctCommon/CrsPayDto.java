/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.math.BigDecimal;

import com.jw.common.framework.m0002.f001.dto.RequestBaseApiDto;

public class CrsPayDto extends RequestBaseApiDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 4953363378953292035L;
	private String crsNum;
	private BigDecimal payAmt;

	public BigDecimal getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}

	public String getCrsNum() {
		return crsNum;
	}

	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}

}
