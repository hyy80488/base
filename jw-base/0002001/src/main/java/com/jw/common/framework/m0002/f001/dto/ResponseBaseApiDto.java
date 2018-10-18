/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	通用响应DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|ResponseBaseDto.java新增
*/
@DrptDto(dtonm = "ResponseBaseApiDto", dtodrpt = "通用响应DTO")
public class ResponseBaseApiDto extends ResponseBaseDto {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 3913266799309624978L;
	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	public Integer currentPage;
	@DrptField(fieldnm = "pageSize", fielddrpt = "每页数")
	public Integer pageSize; 
	@DrptField(fieldnm = "recordsTotal", fielddrpt = "总数")
	public Integer recordsTotal;
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
	public Integer getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(Integer recordsTotal) {
		this.recordsTotal = recordsTotal;
	} 
	
}
