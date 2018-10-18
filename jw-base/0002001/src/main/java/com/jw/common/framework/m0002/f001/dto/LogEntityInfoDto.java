/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.Date;
import java.util.List;

/**
 * ## 类说明：
 * 	entity记录日志DTO
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月5日]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月5日|jianana|新增|LogEntityInfoDto.java新增
 */
public class LogEntityInfoDto extends RequestDbBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = -1243040935340235161L;
	/** 集团代码 **/
	private String chainUid;
	/** 酒店代码 **/
	private String unitUid;
	/** 追踪ID **/
	private String tracerId;
	/** 模块名 **/
	private String entityClass;
	/** 模块ID **/
	private Integer entityId;
	/** 描述 **/
	private String operationDrpt;
	/** 操作类型 **/
	private String operationType;
	/** 模块主键 **/
	private String keyCd;
	/** 操作时间 **/
	private Date operationTime;
	/** 加密Key **/
	private String unitCryptKey;
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
	/** 日志明细DTO集合 **/
	private List<LogEntityDifferInfoDto> bsBeanModifyLogDetails;

	/** 日志数据源名称 */
	private String dbName;
	
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

	public String getKeyCd() {
		return keyCd;
	}

	public void setKeyCd(String keyCd) {
		this.keyCd = keyCd;
	}

	public String getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(String entityClass) {
		this.entityClass = entityClass;
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public Date getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
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

	public String getOperationDrpt() {
		return operationDrpt;
	}

	public void setOperationDrpt(String operationDrpt) {
		this.operationDrpt = operationDrpt;
	}

	public String getTracerId() {
		return tracerId;
	}

	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}

	public List<LogEntityDifferInfoDto> getBsBeanModifyLogDetails() {
		return bsBeanModifyLogDetails;
	}

	public void setBsBeanModifyLogDetails(List<LogEntityDifferInfoDto> bsBeanModifyLogDetails) {
		this.bsBeanModifyLogDetails = bsBeanModifyLogDetails;
	}

	public String getUnitCryptKey() {
		return unitCryptKey;
	}

	public void setUnitCryptKey(String unitCryptKey) {
		this.unitCryptKey = unitCryptKey;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

}
