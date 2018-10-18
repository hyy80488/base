/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3220.f010.dto;

import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class RsvAccountSearchDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 8403262473988837680L;
	
	private String crsNum;
	private String crsacctNo;
	private List<String> acctStuss;
	private List<String> noAcctStus;
	private String histFlg;
	public String getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}
	public String getCrsacctNo() {
		return crsacctNo;
	}
	public void setCrsacctNo(String crsacctNo) {
		this.crsacctNo = crsacctNo;
	}
	public String getHistFlg() {
		return histFlg;
	}
	public void setHistFlg(String histFlg) {
		this.histFlg = histFlg;
	}
	public List<String> getAcctStuss() {
		return acctStuss;
	}
	public void setAcctStuss(List<String> acctStuss) {
		this.acctStuss = acctStuss;
	}
	public List<String> getNoAcctStus() {
		return noAcctStus;
	}
	public void setNoAcctStus(List<String> noAcctStus) {
		this.noAcctStus = noAcctStus;
	}
	
}
