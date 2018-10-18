package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.util.HashMap;
import java.util.Map;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class GrpRsvRateSvcAndTax extends RequestBaseDto implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1808850171583707665L;
	private Map<String, Object> queryMap=new HashMap<>();

	public Map<String, Object> getQueryMap() {
		return queryMap;
	}

	public void setQueryMap(Map<String, Object> queryMap) {
		this.queryMap = queryMap;
	}
	
}
