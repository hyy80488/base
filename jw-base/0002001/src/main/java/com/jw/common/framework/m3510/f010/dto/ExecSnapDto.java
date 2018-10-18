/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3510.f010.dto;

import java.io.Serializable;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

@DrptDto(dtonm = "ExecSnapDto",dtodrpt="夜审执行客史号返回相关信息")
public class ExecSnapDto extends ResponseBaseDto implements Serializable{
	/** 
	* @Fields serialVersionUID : gwm 
	*/ 
	private static final long serialVersionUID = -3889609805191725247L;
	@DrptField(fieldnm = "profileNo", fielddrpt = "客史号")
	private String profileNo;
	/**
	 * @return the profileNo
	 */
	public String getProfileNo() {
		return profileNo;
	}
	/**
	 * @param profileNo the profileNo to set
	 */
	public void setProfileNo(String profileNo) {
		this.profileNo = profileNo;
	}
	@DrptField(fieldnm = "profileMap", fielddrpt = "客史号s")
	private Map<Integer, String> profileMap;
	public Map<Integer, String> getProfileMap() {
		return profileMap;
	}
	public void setProfileMap(Map<Integer, String> profileMap) {
		this.profileMap = profileMap;
	}
	
	
}
