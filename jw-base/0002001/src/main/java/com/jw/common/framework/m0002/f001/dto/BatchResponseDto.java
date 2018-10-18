/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.Map;

/**
 * ## 类说明：
 * 	返回ID集合
 * @author    [jianana]   
 * @version   [V1.0, 2017年5月23日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年5月23日|jianana|新增|IdsResponseDto.java新增
 */
public class BatchResponseDto  extends ResponseBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4219302728011218133L;
	private String batchId;
	private String asyncStatus;
	private String totalNum;
	private String remainNum;
	private String remainTime;
	private Map<String, String> data;
	/**
	 * @return the batchId
	 */
	public String getBatchId() {
		return batchId;
	}
	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	/**
	 * @return the asyncStatus
	 */
	public String getAsyncStatus() {
		return asyncStatus;
	}
	/**
	 * @param asyncStatus the asyncStatus to set
	 */
	public void setAsyncStatus(String asyncStatus) {
		this.asyncStatus = asyncStatus;
	}
	/**
	 * @return the totalNum
	 */
	public String getTotalNum() {
		return totalNum;
	}
	/**
	 * @param totalNum the totalNum to set
	 */
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	/**
	 * @return the remainNum
	 */
	public String getRemainNum() {
		return remainNum;
	}
	/**
	 * @param remainNum the remainNum to set
	 */
	public void setRemainNum(String remainNum) {
		this.remainNum = remainNum;
	}
	/**
	 * @return the remainTime
	 */
	public String getRemainTime() {
		return remainTime;
	}
	/**
	 * @param remainTime the remainTime to set
	 */
	public void setRemainTime(String remainTime) {
		this.remainTime = remainTime;
	}
	/**
	 * @return the data
	 */
	public Map<String, String> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Map<String, String> data) {
		this.data = data;
	}

}
