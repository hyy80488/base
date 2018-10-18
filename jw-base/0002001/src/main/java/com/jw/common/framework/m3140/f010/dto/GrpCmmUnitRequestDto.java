package com.jw.common.framework.m3140.f010.dto;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class GrpCmmUnitRequestDto extends RequestBaseDto implements Serializable  {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -515499173071712077L;
	
	private String chainUid;
	private List<String> unitUids;
	private String statusFlg;
	public String getChainUid() {
		return chainUid;
	}
	public List<String> getUnitUids() {
		return unitUids;
	}
	public String getStatusFlg() {
		return statusFlg;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setUnitUids(List<String> unitUids) {
		this.unitUids = unitUids;
	}
	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}
	

}
