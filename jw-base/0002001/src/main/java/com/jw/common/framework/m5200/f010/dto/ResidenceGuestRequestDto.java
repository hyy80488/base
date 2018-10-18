package com.jw.common.framework.m5200.f010.dto;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class ResidenceGuestRequestDto extends RequestBaseDto implements Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8268760929955972002L;
	private String chainUid;
	private String unitUid;
	private String acctNo;
	public String getChainUid() {
		return chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	
	private List<Integer> guestsYes;
	private List<Integer> guestsNot;
	public List<Integer> getGuestsYes() {
		return guestsYes;
	}
	public List<Integer> getGuestsNot() {
		return guestsNot;
	}
	public void setGuestsYes(List<Integer> guestsYes) {
		this.guestsYes = guestsYes;
	}
	public void setGuestsNot(List<Integer> guestsNot) {
		this.guestsNot = guestsNot;
	}
}
