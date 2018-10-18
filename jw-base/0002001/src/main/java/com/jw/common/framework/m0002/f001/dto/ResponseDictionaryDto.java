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
import com.jw.base.framework.core.util.CodeBean;

/**
 * ## 类说明：
 * 	根据请求的字典dto，返回对应的字典值
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2017年1月9日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since 日期|作者|类型|内容
 * :----|:-----|:-----|:-----
 * 2017年1月9日|MiaoDaZhuang|新增|ResponseDictionaryDto.java新增
*/
@DrptDto(dtonm = "ResponseDictionaryDto", dtodrpt = "根据请求的字典dto，返回对应的字典值")
public class ResponseDictionaryDto extends ResponseBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 9196742029989099226L;

	/** 
	* @Fields ResponseDtoDto : 根据查询数据，返回字典dto
	* 	请求：{typs:["typ1","typ2"]}
	* 	相应：{typ1:[{key:"1",value:"a"},{key:"2",value:"b"}],typ2:..}
	*/
	@DrptField(fieldnm = "responseDto", fielddrpt = "根据查询数据，返回字典dto")
	private Map<String, List<CodeBean>> responseDto;

	@DrptField(fieldnm = "responseData", fielddrpt = "根据查询数据，返回字典dto")
	private Map<String, List<Map<String, Object>>> responseData;

	@DrptField(fieldnm = "paramDrpt", fielddrpt = "key:paramId,value:描述")
	private Map<String, String> paramDrpt;

	@DrptField(fieldnm = "paramObject", fielddrpt = "key:id,value:map")
	private Map<String, Map<String, Object>> paramObject;

	@DrptField(fieldnm = "paramObj", fielddrpt = "key:objId,value:obj")
	private Map<String, Object> paramObj;

	public Map<String, List<Map<String, Object>>> getResponseData() {
		return responseData;
	}

	public void setResponseData(Map<String, List<Map<String, Object>>> responseData) {
		this.responseData = responseData;
	}

	public Map<String, List<CodeBean>> getResponseDto() {
		return responseDto;
	}

	public void setResponseDto(Map<String, List<CodeBean>> responseDto) {
		this.responseDto = responseDto;
	}

	public Map<String, String> getParamDrpt() {
		return paramDrpt;
	}

	public void setParamDrpt(Map<String, String> paramDrpt) {
		this.paramDrpt = paramDrpt;
	}

	public Map<String, Map<String, Object>> getParamObject() {
		return paramObject;
	}

	public void setParamObject(Map<String, Map<String, Object>> paramObject) {
		this.paramObject = paramObject;
	}

	public Map<String, Object> getParamObj() {
		return paramObj;
	}

	public void setParamObj(Map<String, Object> paramObj) {
		this.paramObj = paramObj;
	}

}
