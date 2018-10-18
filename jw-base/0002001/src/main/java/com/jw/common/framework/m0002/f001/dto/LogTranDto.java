/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	操作日志特殊转换说明
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月5日]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月5日|jianana|新增|LogTranDto.java新增
 */
public class LogTranDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -7970058613189470427L;

	/** 特殊标记keyno处理用 **/
	private String trantype;
	
	/** 字段code **/
	private String fieldnm;
	
	/** 字段值 **/
	private String fieldvalue;
	
	/** 字段类型 **/
	private String fieldtype;

	/** 主键ID **/
	private String keyValue;
	
	/**
	 * @return the trantype
	 */
	public String getTrantype() {
		return trantype;
	}

	/**
	 * @param trantype the trantype to set
	 */
	public void setTrantype(String trantype) {
		this.trantype = trantype;
	}

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
	 * @return the fieldvalue
	 */
	public String getFieldvalue() {
		return fieldvalue;
	}

	/**
	 * @param fieldvalue the fieldvalue to set
	 */
	public void setFieldvalue(String fieldvalue) {
		this.fieldvalue = fieldvalue;
	}

	/**
	 * @return the fieldtype
	 */
	public String getFieldtype() {
		return fieldtype;
	}

	/**
	 * @param fieldtype the fieldtype to set
	 */
	public void setFieldtype(String fieldtype) {
		this.fieldtype = fieldtype;
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
