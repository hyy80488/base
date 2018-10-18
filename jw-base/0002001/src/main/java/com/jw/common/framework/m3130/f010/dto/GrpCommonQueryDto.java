/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class GrpCommonQueryDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -180785995404008669L;
	
	private List<String> unitUids;
	
	private List<Object> ids;

	public List<String> getUnitUids() {
		return unitUids;
	}

	public void setUnitUids(List<String> unitUids) {
		this.unitUids = unitUids;
	}

	public List<Object> getIds() {
		return ids;
	}

	public void setIds(List<Object> ids) {
		this.ids = ids;
	}
	
	

}
