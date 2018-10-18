/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	通用请求DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|RequestBaseDto.java新增
*/
@DrptDto(dtonm = "RequestBaseApiDto", dtodrpt = "通用请求DTO")
public class RequestBaseApiDto extends RequestBaseDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -5342261617663723959L;
	@DrptField(fieldnm = "jwAccessToken", fielddrpt = "分配的授权码")
	public String jwAccessToken;
	@DrptField(fieldnm = "jwClientCode", fielddrpt = "客户号")
	public String jwClientCode;
	@DrptField(fieldnm = "jwUniqCode", fielddrpt = "网站号")
	public String jwUniqCode;
	@DrptField(fieldnm = "jwHotelCode", fielddrpt = "众荟酒店编号")
	public String jwHotelCode;
	@DrptField(fieldnm = "language", fielddrpt = "语种")
	public String language;
	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	public Integer currentPage;
	@DrptField(fieldnm = "pageSize", fielddrpt = "每页数")
	public Integer pageSize;
	
	
	public String getJwHotelCode() {
		return jwHotelCode;
	}
	public void setJwHotelCode(String jwHotelCode) {
		this.jwHotelCode = jwHotelCode;
	}
	public String getJwAccessToken() {
		return jwAccessToken;
	}
	public void setJwAccessToken(String jwAccessToken) {
		this.jwAccessToken = jwAccessToken;
	}
	public String getJwClientCode() {
		return jwClientCode;
	}
	public void setJwClientCode(String jwClientCode) {
		this.jwClientCode = jwClientCode;
	}
	public String getJwUniqCode() {
		return jwUniqCode;
	}
	public void setJwUniqCode(String jwUniqCode) {
		this.jwUniqCode = jwUniqCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
