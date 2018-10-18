/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.Map;

/**
 * 
 * ## 类说明：
 * 	开关信息返回dto
 * @author    [guoc]   
 * @version   [V1.0, 2017年3月14日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月14日|guoc|新增|ResponseOptionDto.java新增
 */
public class ResponseOptionDto extends ResponseBaseDto implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 4698894983679738251L;
	
	/** 
	* @Fields ResponseDtoDto : 根据查询数据，返回字典dto
	* 	请求：{optionCds:["typ1","typ2"]}
	* 	相应：{typ1:[{option_str1:"1",option_str2:"a"}],typ2:..}
	*/ 
	private Map<String, Map<String,Object>> responseDto;

	public Map<String, Map<String,Object>> getResponseDto() {
		return responseDto;
	}

	public void setResponseDto(Map<String, Map<String,Object>> responseDto) {
		this.responseDto = responseDto;
	}

}
