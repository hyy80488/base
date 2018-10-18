/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.Map;

/**
 * ## 类说明：
 * 	操作日志DTO
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月5日]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月5日|jianana|新增|LogInfoDto.java新增
 */
public class LogKeypropsDto extends RequestDbBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -2922215878046024278L;
	/** 集团代码 **/
	private String chainUid;
	/** 酒店代码 **/
	private String unitUid;
	/** 追踪ID **/
	private String tracerId;
	/**key:acctNo;vlu:F0002142**/
	private Map<String,Object> keypropsMap;
	/** 创建人 */
	private java.lang.String createdBy;
	/** 创建时间*/
	private java.util.Date createdDate;
	/** 创建人ID*/
	private String createdByUid;
	/** 创建人CODE */
	private String createdByCd;
	/** 创建人操作酒店编码 */
	private String createdUnitUid;
	/** 创建人操作酒店Cd */
	private String createdUnitCd;
	
	/** 当前集团对应日志库——数据源名称 */
	private String logDbName;
	/** 当前集团库——数据源名称 */
	private String chainDbName;
	/** 当前酒店库——数据源名称 */
	private String unitDbName;
	/** 当前统计库——数据源名称 */
	private String statDbName;
	


	public Map<String, Object> getKeypropsMap() {
		return keypropsMap;
	}

	public void setKeypropsMap(Map<String, Object> keypropsMap) {
		this.keypropsMap = keypropsMap;
	}

	public java.lang.String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedByUid() {
		return createdByUid;
	}

	public void setCreatedByUid(String createdByUid) {
		this.createdByUid = createdByUid;
	}

	public String getCreatedByCd() {
		return createdByCd;
	}

	public void setCreatedByCd(String createdByCd) {
		this.createdByCd = createdByCd;
	}

	public String getCreatedUnitUid() {
		return createdUnitUid;
	}

	public void setCreatedUnitUid(String createdUnitUid) {
		this.createdUnitUid = createdUnitUid;
	}

	public String getCreatedUnitCd() {
		return createdUnitCd;
	}

	public void setCreatedUnitCd(String createdUnitCd) {
		this.createdUnitCd = createdUnitCd;
	}

	public String getChainUid() {
		return chainUid;
	}

	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}

	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}


	public String getTracerId() {
		return tracerId;
	}

	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}


	public String getChainDbName() {
		return chainDbName;
	}

	public void setChainDbName(String chainDbName) {
		this.chainDbName = chainDbName;
	}

	public String getUnitDbName() {
		return unitDbName;
	}

	public void setUnitDbName(String unitDbName) {
		this.unitDbName = unitDbName;
	}

	public String getStatDbName() {
		return statDbName;
	}

	public void setStatDbName(String statDbName) {
		this.statDbName = statDbName;
	}

	public String getLogDbName() {
		return logDbName;
	}

	public void setLogDbName(String logDbName) {
		this.logDbName = logDbName;
	}


}
