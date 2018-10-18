/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;


/**
 * ## 类说明：
 * 	操作日志明细DTO
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月1日]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月1日|jianana|新增|LogDifferInfoDto.java新增
 */
public class LogDifferInfoDto implements java.io.Serializable {
	private static final long serialVersionUID = 2424174651438532725L;
	/** 日志类型 User.name **/
	private String logType;
	/** 列名称 name **/
	private String fieldnm;
	/** 原值 **/
	private String pfieldvalue;
	/** 现值 **/
	private String fieldvalue;

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getFieldnm() {
		return fieldnm;
	}

	public void setFieldnm(String fieldnm) {
		this.fieldnm = fieldnm;
	}

	public Object getPfieldvalue() {
		return pfieldvalue;
	}

	public void setPfieldvalue(String pfieldvalue) {
		this.pfieldvalue = pfieldvalue;
	}

	public Object getFieldvalue() {
		return fieldvalue;
	}

	public void setFieldvalue(String fieldvalue) {
		this.fieldvalue = fieldvalue;
	}

	@Override
	public String toString() {
		String str = "fieldnm:" + fieldnm + ";pfieldvalue:" + pfieldvalue + ";fieldvalue:" + fieldvalue;
		return str;
	}
}
