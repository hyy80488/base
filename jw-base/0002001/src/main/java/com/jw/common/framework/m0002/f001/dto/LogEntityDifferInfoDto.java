/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	entity记录日志明细
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月5日]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月5日|jianana|新增|LogEntityDifferInfoDto.java新增
 */
public class LogEntityDifferInfoDto implements java.io.Serializable {

	private static final long serialVersionUID = -9108877320048681138L;
	/** 字段名 **/
	private String property;
	/** 原值 **/
	private String beforeValue;
	/** 新值 **/
	private String afterValue;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getBeforeValue() {
		return beforeValue;
	}

	public void setBeforeValue(String beforeValue) {
		this.beforeValue = beforeValue;
	}

	public String getAfterValue() {
		return afterValue;
	}

	public void setAfterValue(String afterValue) {
		this.afterValue = afterValue;
	}

}
