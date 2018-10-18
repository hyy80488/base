/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class CrsRsvAcctCommonReqDto  extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5170774442390969132L;
	
	private List<CrsRsvOrderReqDto> orderDtos;

	public List<CrsRsvOrderReqDto> getOrderDtos() {
		return orderDtos;
	}

	public void setOrderDtos(List<CrsRsvOrderReqDto> orderDtos) {
		this.orderDtos = orderDtos;
	}
	
}
