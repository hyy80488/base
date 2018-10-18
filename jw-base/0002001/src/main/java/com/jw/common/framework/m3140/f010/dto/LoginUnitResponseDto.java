package com.jw.common.framework.m3140.f010.dto;

import java.util.Map;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class LoginUnitResponseDto extends ResponseBaseDto implements java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1012990375795798103L;
	private Map<String,String> operUnitInfo;

	public Map<String, String> getOperUnitInfo() {
		return operUnitInfo;
	}

	public void setOperUnitInfo(Map<String, String> operUnitInfo) {
		this.operUnitInfo = operUnitInfo;
	}
	
}
