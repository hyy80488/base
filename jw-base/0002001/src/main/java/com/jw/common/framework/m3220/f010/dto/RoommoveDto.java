package com.jw.common.framework.m3220.f010.dto;

import java.io.Serializable;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

@DrptDto(dtonm = "RoommoveDto",dtodrpt="房间变动DTO")
public class RoommoveDto implements Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 8292758962810709991L;

	@DrptField(fieldnm = "acctNo",fielddrpt = "账号")
	private String acctNo;
	@DrptField(fieldnm = "acctStus",fielddrpt = "状态")
	private String acctStus;
	@DrptField(fieldnm = "orgAreaId",fielddrpt = "原楼区")
	private Integer orgAreaId;
	@DrptField(fieldnm = "orgRoomNum",fielddrpt = "原房号")
	private String orgRoomNum;
	@DrptField(fieldnm = "newAreaId",fielddrpt = "新楼区")
	private Integer newAreaId;
	@DrptField(fieldnm = "newRoomNum",fielddrpt = "新房号")
	private String newRoomNum;
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getAcctStus() {
		return acctStus;
	}
	public void setAcctStus(String acctStus) {
		this.acctStus = acctStus;
	}
	public Integer getOrgAreaId() {
		return orgAreaId;
	}
	public void setOrgAreaId(Integer orgAreaId) {
		this.orgAreaId = orgAreaId;
	}
	public String getOrgRoomNum() {
		return orgRoomNum;
	}
	public void setOrgRoomNum(String orgRoomNum) {
		this.orgRoomNum = orgRoomNum;
	}
	public Integer getNewAreaId() {
		return newAreaId;
	}
	public void setNewAreaId(Integer newAreaId) {
		this.newAreaId = newAreaId;
	}
	public String getNewRoomNum() {
		return newRoomNum;
	}
	public void setNewRoomNum(String newRoomNum) {
		this.newRoomNum = newRoomNum;
	}
	
}
