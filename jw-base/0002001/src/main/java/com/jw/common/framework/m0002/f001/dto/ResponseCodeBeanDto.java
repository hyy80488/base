/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;

import com.jw.base.framework.core.util.CodeBean;


/**
 * ## 类说明：
 * 	CodeBeanDto下拉框返回结果使用
 * @author    [jianana]   
 * @version   [V1.0, 2017年2月17日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年2月17日|jianana|新增|ResponseCodeBeanDto.java新增
 */
public class ResponseCodeBeanDto extends ResponseBaseDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -9007129603920354761L;
	private List<CodeBean> responseDto;
	public List<CodeBean> getResponseDto() {
		return responseDto;
	}
	public void setResponseDto(List<CodeBean> responseDto) {
		this.responseDto = responseDto;
	}



}
