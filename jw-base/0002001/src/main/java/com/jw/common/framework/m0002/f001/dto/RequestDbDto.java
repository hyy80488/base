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
2016/11/21|liubowen|新增|RequestDbDto.java新增
*/
public class RequestDbDto implements java.io.Serializable {

	private static final long serialVersionUID = 6039390965464215374L;
	
	/** 数据库source_nm，用于切换数据库 **/
	private String sourceNm;

	/** 追踪ID **/
	private String tracerId;
	
	/** 业务ID **/
	private String businessId;
	
	/** asyncId **/
	private String asyncId;
	
	public String getSourceNm() {
		return sourceNm;
	}

	public void setSourceNm(String sourceNm) {
		this.sourceNm = sourceNm;
	}

	public String getTracerId() {
		return tracerId;
	}

	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getAsyncId() {
		return asyncId;
	}

	public void setAsyncId(String asyncId) {
		this.asyncId = asyncId;
	}

}
