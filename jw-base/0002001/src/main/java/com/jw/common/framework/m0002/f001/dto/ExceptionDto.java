/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	异常通用DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|ExceptionDto.java新增
*/
public class ExceptionDto extends ResponseBaseDto implements java.io.Serializable {

	private static final long serialVersionUID = -545875070664508536L;
	/** 错误 **/
	private String error;
	/** 错误CODE **/
	private String errorCode;
	/** 错误描述 **/
	private String errorDes;
	/** 错误信息 **/
	private String errorMessage;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDes() {
		return errorDes;
	}
	public void setErrorDes(String errorDes) {
		this.errorDes = errorDes;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
