package com.jw.common.framework.m3260.f010.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class GrpArInvoicNightResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2636607849403192483L;

	private List<List<Map<String, Object>>> resultData;
	private Set<String> querys;
	public List<List<Map<String, Object>>> getResultData() {
		return resultData;
	}
	public Set<String> getQuerys() {
		return querys;
	}
	public void setResultData(List<List<Map<String, Object>>> resultData) {
		this.resultData = resultData;
	}
	public void setQuerys(Set<String> querys) {
		this.querys = querys;
	}
	
}
