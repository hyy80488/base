/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
/**
 * ## 类说明：
 * 	报表查询条件
 * @author    [liubowen]   
 * @version   [V1.0, 2017年5月22日]
 * @package com.jw.hms.cmm.m3104.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年5月22日|liubowen|新增|JasperQueryFieldDto.java新增
 */
@DrptDto(dtonm="JrTermDto", dtodrpt="报表查询条件")
public class JrTermDto implements java.io.Serializable {
	
	private static final long serialVersionUID = -4167655759728729018L;

	@DrptField(fieldnm = "jasperQueryFieldParam", fielddrpt = "条件属性，仿PlfCmmParamsetFieldDto的PlfCmmParamsetField", nullable = "true")
	private JrTermParamDto jasperQueryFieldParam;
	
	//resultSelects: [{key:'', code:'', name:''}]
	@DrptField(fieldnm = "resultSelects", fielddrpt = "字典默认值", nullable = "true")
	private List<Map<String,Object>> resultSelects;

	public JrTermParamDto getJasperQueryFieldParam() {
		return jasperQueryFieldParam;
	}

	public void setJasperQueryFieldParam(JrTermParamDto jasperQueryFieldParam) {
		this.jasperQueryFieldParam = jasperQueryFieldParam;
	}

	public List<Map<String, Object>> getResultSelects() {
		return resultSelects;
	}

	public void setResultSelects(List<Map<String, Object>> resultSelects) {
		this.resultSelects = resultSelects;
	}

}
