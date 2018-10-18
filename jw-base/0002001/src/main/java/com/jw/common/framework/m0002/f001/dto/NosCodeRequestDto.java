package com.jw.common.framework.m0002.f001.dto;

import java.io.Serializable;
import java.util.Collection;

public class NosCodeRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -9027409784555156310L;
	private Collection<String> nos;

	public Collection<String> getNos() {
		return nos;
	}

	public void setNos(Collection<String> nos) {
		this.nos = nos;
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
	
}
