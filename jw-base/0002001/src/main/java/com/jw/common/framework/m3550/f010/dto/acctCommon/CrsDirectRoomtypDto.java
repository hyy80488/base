/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import com.jw.common.framework.m0002.f001.dto.RequestBaseApiDto;

public class CrsDirectRoomtypDto extends RequestBaseApiDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4707319669669412061L;

	private String memberNo;
	private String fastQuery;
	private Integer roomtypId;
	private Long arrDt;
	private Long dptDt;
	/**查询类型：1房型房价 2仅房型*/
	private String getRate;
	
	
	public String getGetRate() {
		return getRate;
	}
	public void setGetRate(String getRate) {
		this.getRate = getRate;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getFastQuery() {
		return fastQuery;
	}
	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public Long getArrDt() {
		return arrDt;
	}
	public void setArrDt(Long arrDt) {
		this.arrDt = arrDt;
	}
	public Long getDptDt() {
		return dptDt;
	}
	public void setDptDt(Long dptDt) {
		this.dptDt = dptDt;
	}
	
}
