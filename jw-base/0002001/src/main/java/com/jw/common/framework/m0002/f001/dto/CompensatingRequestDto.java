/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	单业务ID通用请求DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|IdRequestDto.java新增
 */
@DrptDto(dtonm = "CompensatingRequestDto", dtodrpt = "补偿消息dto")
public class CompensatingRequestDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2340077730420431454L;

	@DrptField(fieldnm = "businessId", fielddrpt = "业务ID")
	private String businessId;
	
	@DrptField(fieldnm = "businessStatus", fielddrpt = "业务状态")
	private String businessStatus;
	
	@DrptField(fieldnm = "reqJson", fielddrpt = "原处理请求JSON")
	private String reqJson;
	
	/**
	 * @return the businessId
	 */
	public String getBusinessId() {
		return businessId;
	}

	/**
	 * @param businessId the businessId to set
	 */
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	/**
	 * @return the businessStatus
	 */
	public String getBusinessStatus() {
		return businessStatus;
	}

	/**
	 * @param businessStatus the businessStatus to set
	 */
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	/**
	 * @return the reqJson
	 */
	public String getReqJson() {
		return reqJson;
	}

	/**
	 * @param reqJson the reqJson to set
	 */
	public void setReqJson(String reqJson) {
		this.reqJson = reqJson;
	}
	
}
