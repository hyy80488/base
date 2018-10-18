/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3510.f010.dto;

import java.io.Serializable;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


@DrptDto(dtonm = "CheckHasProfileNoDto",dtodrpt="校验客史号是否存在DTO")
public class CheckHasProfileNoDto extends RequestBaseDto implements Serializable{
	/** 
	* @Fields serialVersionUID : gwm 
	*/ 
	private static final long serialVersionUID = 5535400604707633975L;
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
	
}
