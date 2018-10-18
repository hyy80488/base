/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m7550.f011.order.dto;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;
/**
 * ## 类说明：
 * 	创建订单返回值
 * @author    [jianana]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m7550.f011.order.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|jianana|新增|OrderResDto.java新增
 */
public class OrderResDto extends ResponseBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 6417425761148610843L;
	private OrderResDtlDto result;
	public OrderResDtlDto getResult() {
		return result;
	}
	public void setResult(OrderResDtlDto result) {
		this.result = result;
	}
}
