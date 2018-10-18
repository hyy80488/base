
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
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/** 
 * ## 类说明：
 * 	多个查询条件数据传输对象
 * @author    [liubowen]   
 * @version   [V1.0, 2017-05-19]
 * @package com.jw.hms.cmm.m3104.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-05-19|liubowen|新增|JasperQueryFieldResultDto新增
 */
@DrptDto(dtonm="JrTermSetDto", dtodrpt="多个查询条件数据传输对象")
public class JrTermSetDto extends ResponseBaseDto implements java.io.Serializable {

	private static final long serialVersionUID = 316303653020815094L;

	@DrptField(fieldnm="jasperQueryField", fielddrpt="多个查询条件", nullable = "true")
	private List<JrTermDto> jasperQueryField;
	
	@DrptField(fieldnm="cascadeFields", fielddrpt="级联关系", nullable = "true")
	private List<Map<String, Object>> cascadeFields;
	
	public List<JrTermDto> getJasperQueryField() {
		return jasperQueryField;
	}

	public void setJasperQueryField(List<JrTermDto> jasperQueryField) {
		this.jasperQueryField = jasperQueryField;
	}

	
	public List<Map<String, Object>> getCascadeFields() {
		return cascadeFields;
	}

	public void setCascadeFields(List<Map<String, Object>> cascadeFields) {
		this.cascadeFields = cascadeFields;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

