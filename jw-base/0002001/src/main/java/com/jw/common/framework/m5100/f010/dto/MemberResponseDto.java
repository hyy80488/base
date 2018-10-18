package com.jw.common.framework.m5100.f010.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class MemberResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4312644524300095444L;
	private List<UserInfoCommom> data = new ArrayList<>();
	public List<UserInfoCommom> getData() {
		return data;
	}
	public void setData(List<UserInfoCommom> data) {
		this.data = data;
	}
	
	
}
