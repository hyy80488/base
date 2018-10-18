/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Objects;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.api.LogDiffer;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

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
//@Getter
//@Setter
//@Data
@DrptDto(dtonm = "RequestBaseDto", dtodrpt = "通用请求DTO")
public class RequestBaseDto implements LogDiffer, java.io.Serializable {

	private static final long serialVersionUID = -3006794017466327030L;

	@DrptField(fieldnm = "requestCommonDto", fielddrpt = "共通字段信息")
	private RequestCommonDto requestCommonDto;
	
	@DrptField(fieldnm = "displayData", fielddrpt = "展示数据（包含临时字段）")
	private String displayData;
	
	@DrptField(fieldnm = "reportdtld", fielddrpt = "报表详情ID：权限拦截用")
	private Integer reportdtld;

	public RequestBaseDto() {
		setRequestCommonDto(new RequestCommonDto());
	}

	/**
	 * @return the requestCommonDto
	 */
	public RequestCommonDto getRequestCommonDto() {
		if(Objects.isNull(requestCommonDto)){
			requestCommonDto = new RequestCommonDto();
		}
		return requestCommonDto;
	}

	/**
	 * @param requestCommonDto
	 *            the requestCommonDto to set
	 */
	public void setRequestCommonDto(RequestCommonDto requestCommonDto) {
		this.requestCommonDto = requestCommonDto;
	}

	public String getDisplayData() {
		return displayData;
	}

	public void setDisplayData(String displayData) {
		this.displayData = displayData;
	}

	public Integer getReportdtld() {
		return reportdtld;
	}

	public void setReportdtld(Integer reportdtld) {
		this.reportdtld = reportdtld;
	}

	@Override
	public List<LogDifferInfoDto> getLogDiffer() {
		// TODO Auto-generated method stub
		return null;
	}

}
