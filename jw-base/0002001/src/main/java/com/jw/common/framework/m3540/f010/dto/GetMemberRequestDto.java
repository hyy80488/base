package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class GetMemberRequestDto extends RequestBaseDto implements Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -3402134231470397633L;
	private String memberNo;
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	private String indexNm;

	public String getIndexNm() {
		return indexNm;
	}
	public void setIndexNm(String indexNm) {
		this.indexNm = indexNm;
	}
	private String chainUid;
	private String unitUid;
	public String getChainUid() {
		return chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	private String fastQuery;
	public String getFastQuery() {
		return fastQuery;
	}

	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}
	
	
}
