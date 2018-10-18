
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	返回结果
 * @author    [jianana]   
 * @version   [V1.0, 2018年1月5日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年1月5日|jianana|新增|JrTermDataDto.java新增
 */
@DrptDto(dtonm="JrTermDataDto", dtodrpt="返回结果")
public class JrTermDataDto extends ResponseBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5180390550200995793L;

	@DrptField(fieldnm="outByte", fielddrpt="流", nullable = "true")
	private byte[] outByte;
	
	@DrptField(fieldnm="reportURL", fielddrpt="地址", nullable = "true")
	private String reportURL;
	
	@DrptField(fieldnm="cascaResultMap", fielddrpt="级联返回值", nullable = "true")
	private Map<String, List<Map<String, Object>>> cascaResultMap;
	
	

	public Map<String, List<Map<String, Object>>> getCascaResultMap() {
		return cascaResultMap;
	}



	public void setCascaResultMap(Map<String, List<Map<String, Object>>> cascaResultMap) {
		this.cascaResultMap = cascaResultMap;
	}



	public byte[] getOutByte() {
		return outByte;
	}



	public void setOutByte(byte[] outByte) {
		this.outByte = outByte;
	}



	public String getReportURL() {
		return reportURL;
	}



	public void setReportURL(String reportURL) {
		this.reportURL = reportURL;
	}



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

