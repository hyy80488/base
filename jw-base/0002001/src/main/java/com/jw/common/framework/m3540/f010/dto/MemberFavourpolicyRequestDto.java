package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;
import java.util.Date;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class MemberFavourpolicyRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6759990655023095532L;

	//会员号
	private String memberNo;
	//业务日期
	private Date bussDate;
	//会员等级
	private Integer memberrankId;
	//房型
	private Integer roomtypId;
	
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public Date getBussDate() {
		return bussDate;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public void setBussDate(Date bussDate) {
		this.bussDate = bussDate;
	}
	public Integer getMemberrankId() {
		return memberrankId;
	}
	public void setMemberrankId(Integer memberrankId) {
		this.memberrankId = memberrankId;
	}
}
