package com.jw.common.framework.m0002.f001.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ResponseDirectCommonDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8599164175735554464L;

	private List<Map<String, Object>> result;

	public List<Map<String, Object>> getResult() {
		return result;
	}

	public void setResult(List<Map<String, Object>> result) {
		this.result = result;
	}

	
}
