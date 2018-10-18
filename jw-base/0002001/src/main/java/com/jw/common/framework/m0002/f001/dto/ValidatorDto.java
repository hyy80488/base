/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	通用验证DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|ValidatorDto.java新增
*/
public class ValidatorDto  extends ResponseBaseDto implements java.io.Serializable{

	private static final long serialVersionUID = -5605818192100324534L;
	
	/** 验证消息 **/
	private String[] validMessages;

	public String[] getValidMessages() {
		return validMessages;
	}

	public void setValidMessages(String[] validMessages) {
		this.validMessages = validMessages;
	}

	


	
	
}
