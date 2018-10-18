/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.util.Date;

import com.jw.common.framework.m0002.f001.dto.RequestBaseApiDto;

public class CrsDirectOrderDto extends RequestBaseApiDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4707319669669412061L;

	private String memberNo;
	private String contactCtno;
	private String crsNum;
	private String crsorderStus;
	private String crsacctStus;
	private String onlinepaymentStus;
	private Integer roomtypId;
	private Date startDt;
	private Date endDt;
	
	
	public String getContactCtno() {
		return contactCtno;
	}
	public void setContactCtno(String contactCtno) {
		this.contactCtno = contactCtno;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}
	public String getCrsorderStus() {
		return crsorderStus;
	}
	public void setCrsorderStus(String crsorderStus) {
		this.crsorderStus = crsorderStus;
	}
	public String getCrsacctStus() {
		return crsacctStus;
	}
	public void setCrsacctStus(String crsacctStus) {
		this.crsacctStus = crsacctStus;
	}
	public String getOnlinepaymentStus() {
		return onlinepaymentStus;
	}
	public void setOnlinepaymentStus(String onlinepaymentStus) {
		this.onlinepaymentStus = onlinepaymentStus;
	}
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public Date getStartDt() {
		return startDt;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	
}
