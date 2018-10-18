/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m7550.f011.order.dto;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseApiDto;
/**
 * ## 类说明：
 * 	直销会员信息返回对象
 * @author    [jianana]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m7550.f011.order.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|jianana|新增|OrderResDto.java新增
 */
public class DirectMemberResDto extends ResponseBaseApiDto implements java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2238656437905592212L;
	private Object result;
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
}
