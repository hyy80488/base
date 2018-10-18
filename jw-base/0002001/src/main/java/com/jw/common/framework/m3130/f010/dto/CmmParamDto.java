/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	用于自定义查询条件DTO
 * @author    [jianana]   
 * @version   [V1.0, 2017年3月9日]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月9日|jianana|新增|CmmParamDto.java新增
 */
@DrptDto(dtonm = "用于自定义查询条件DTO",dtodrpt="用于自定义查询条件DTO")
public class CmmParamDto  extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 7039796757024133688L;
	@DrptField(fieldnm="参数名称",fielddrpt="参数名称")
	private String[] propName;
	@DrptField(fieldnm="参数值",fielddrpt="参数值")
	private Object[] propValue;
	@DrptField(fieldnm="参数集合",fielddrpt="参数集合")
	private List<Map<String,Object>> params;
	public String[] getPropName() {
		return propName;
	}
	public void setPropName(String[] propName) {
		this.propName = propName;
	}
	public Object[] getPropValue() {
		return propValue;
	}
	public void setPropValue(Object[] propValue) {
		this.propValue = propValue;
	}
	public List<Map<String, Object>> getParams() {
		return params;
	}
	public void setParams(List<Map<String, Object>> params) {
		this.params = params;
	}

}
