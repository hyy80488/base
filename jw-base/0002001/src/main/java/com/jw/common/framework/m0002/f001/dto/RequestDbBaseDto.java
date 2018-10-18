/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	MQ消费，传递切换数据库用
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|RequestBaseDto.java新增
*/
public class RequestDbBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2749696039950077469L;
	
	/** 共通字段信息 **/
	private RequestDbDto requestDbDto;
	
	public RequestDbDto getRequestDbDto() {
		return requestDbDto;
	}
	public void setRequestDbDto(RequestDbDto requestDbDto) {
		this.requestDbDto = requestDbDto;
	}

}
