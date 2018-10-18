package com.jw.common.framework.m0002.f001.dto;

import java.io.Serializable;

public class MqParamDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4747887367814229574L;
	/** 当前集团对应日志库——数据源名称 */
	private String logDbName;
	/** 当前集团库——数据源名称 */
	private String chainDbName;
	/** 当前酒店库——数据源名称 */
	private String unitDbName;
	/** 当前统计库——数据源名称 */
	private String statDbName;
	/** 当前餐饮库——数据源名称 */
	private String posDbName;
	/** 当前票券库——数据源名称 */
	private String ccsDbName;
	/** 当前日历库——数据源名称 */
	private String cldrDbName;
	/** 当前CRS库——数据源名称 */
	private String crsDbName;
	/** 当前CRM库——数据源名称 */
	private String crmDbName;
	/** 当前会员库——数据源名称 */
	private String lpsDbName;
	/** 当前EBS库——数据源名称 */
	private String ebsDbName;
	/** 当前SCM库——数据源名称 */
	private String scmDbName;
	/** 当前GFC库——数据源名称 */
	private String gfcDbName;
	private String pcmDbName;
	private String dbType;

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getLogDbName() {
		return logDbName;
	}

	public String getChainDbName() {
		return chainDbName;
	}

	public String getUnitDbName() {
		return unitDbName;
	}

	public String getStatDbName() {
		return statDbName;
	}

	public String getPosDbName() {
		return posDbName;
	}

	public String getCcsDbName() {
		return ccsDbName;
	}

	public String getCldrDbName() {
		return cldrDbName;
	}

	public String getCrsDbName() {
		return crsDbName;
	}

	public String getCrmDbName() {
		return crmDbName;
	}

	public String getLpsDbName() {
		return lpsDbName;
	}

	public String getEbsDbName() {
		return ebsDbName;
	}

	public String getScmDbName() {
		return scmDbName;
	}

	public String getGfcDbName() {
		return gfcDbName;
	}

	public void setLogDbName(String logDbName) {
		this.logDbName = logDbName;
	}

	public void setChainDbName(String chainDbName) {
		this.chainDbName = chainDbName;
	}

	public void setUnitDbName(String unitDbName) {
		this.unitDbName = unitDbName;
	}

	public void setStatDbName(String statDbName) {
		this.statDbName = statDbName;
	}

	public void setPosDbName(String posDbName) {
		this.posDbName = posDbName;
	}

	public void setCcsDbName(String ccsDbName) {
		this.ccsDbName = ccsDbName;
	}

	public void setCldrDbName(String cldrDbName) {
		this.cldrDbName = cldrDbName;
	}

	public void setCrsDbName(String crsDbName) {
		this.crsDbName = crsDbName;
	}

	public void setCrmDbName(String crmDbName) {
		this.crmDbName = crmDbName;
	}

	public void setLpsDbName(String lpsDbName) {
		this.lpsDbName = lpsDbName;
	}

	public void setEbsDbName(String ebsDbName) {
		this.ebsDbName = ebsDbName;
	}

	public void setScmDbName(String scmDbName) {
		this.scmDbName = scmDbName;
	}

	public void setGfcDbName(String gfcDbName) {
		this.gfcDbName = gfcDbName;
	}

	public String getPcmDbName() {
		return pcmDbName;
	}

	public void setPcmDbName(String pcmDbName) {
		this.pcmDbName = pcmDbName;
	}
	
	private String sessionKey;

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	
	private String tracerId;
	private String businessId;

	public String getTracerId() {
		return tracerId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	
	private String asyncId;

	public String getAsyncId() {
		return asyncId;
	}

	public void setAsyncId(String asyncId) {
		this.asyncId = asyncId;
	}
	
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
	/** 更新人 */
	private java.lang.String modifiedBy;
	/** 更新时间 */
	private java.util.Date modifiedDate;
	/** 更新人ID */
	private String modifiedByUid;
	/** 更新人CODE */
	private String modifiedByCd;
	/** 更新人操作酒店编码 */
	private String modifiedUnitUid;
	/** 更新人操作酒店Cd */
	private String modifiedUnitCd;
	private String userUid;

	
	/**
	 * @return the userUid
	 */
	public String getUserUid() {
		return userUid;
	}

	/**
	 * @param userUid the userUid to set
	 */
	public void setUserUid(String userUid) {
		this.userUid = userUid;
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

	public java.lang.String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(java.lang.String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public java.util.Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedByUid() {
		return modifiedByUid;
	}

	public void setModifiedByUid(String modifiedByUid) {
		this.modifiedByUid = modifiedByUid;
	}

	public String getModifiedByCd() {
		return modifiedByCd;
	}

	public void setModifiedByCd(String modifiedByCd) {
		this.modifiedByCd = modifiedByCd;
	}

	public String getModifiedUnitUid() {
		return modifiedUnitUid;
	}

	public void setModifiedUnitUid(String modifiedUnitUid) {
		this.modifiedUnitUid = modifiedUnitUid;
	}

	public String getModifiedUnitCd() {
		return modifiedUnitCd;
	}

	public void setModifiedUnitCd(String modifiedUnitCd) {
		this.modifiedUnitCd = modifiedUnitCd;
	}
	
	
}
