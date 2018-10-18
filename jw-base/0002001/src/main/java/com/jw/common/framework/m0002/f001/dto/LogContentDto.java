/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	操作日志DTO
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月5日]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月5日|jianana|新增|LogContentDto.java新增
 */
public class LogContentDto implements java.io.Serializable {

	private static final long serialVersionUID = -3483658384995254101L;

	/** 字段code **/
	private String fieldnm;
	
	/** 字段原值 **/
	private String fieldValueOld;
	
	/** 字段新值 **/
	private String fieldValueNew;
	
	/** 字典大分类 **/
	private String paramtype;
	
	/** 字典类型 **/
	private String paramsubtype;
	
	/** 主键ID **/
	private String keyValue;
	
	/**
	 * @return the fieldnm
	 */
	public String getFieldnm() {
		return fieldnm;
	}

	/**
	 * @param fieldnm the fieldnm to set
	 */
	public void setFieldnm(String fieldnm) {
		this.fieldnm = fieldnm;
	}

	/**
	 * @return the fieldValueOld
	 */
	public String getFieldValueOld() {
		return fieldValueOld;
	}

	/**
	 * @param fieldValueOld the fieldValueOld to set
	 */
	public void setFieldValueOld(String fieldValueOld) {
		this.fieldValueOld = fieldValueOld;
	}

	/**
	 * @return the fieldValueNew
	 */
	public String getFieldValueNew() {
		return fieldValueNew;
	}

	/**
	 * @param fieldValueNew the fieldValueNew to set
	 */
	public void setFieldValueNew(String fieldValueNew) {
		this.fieldValueNew = fieldValueNew;
	}

	/**
	 * @return the paramtype
	 */
	public String getParamtype() {
		return paramtype;
	}

	/**
	 * @param paramtype the paramtype to set
	 */
	public void setParamtype(String paramtype) {
		this.paramtype = paramtype;
	}

	/**
	 * @return the paramsubtype
	 */
	public String getParamsubtype() {
		return paramsubtype;
	}

	/**
	 * @param paramsubtype the paramsubtype to set
	 */
	public void setParamsubtype(String paramsubtype) {
		this.paramsubtype = paramsubtype;
	}

	/**
	 * @return the keyValue
	 */
	public String getKeyValue() {
		return keyValue;
	}

	/**
	 * @param keyValue the keyValue to set
	 */
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}
	
}
