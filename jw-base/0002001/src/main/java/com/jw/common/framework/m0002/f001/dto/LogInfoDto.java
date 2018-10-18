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
 * 	操作日志DTO
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月5日]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月5日|jianana|新增|LogInfoDto.java新增
 */
public class LogInfoDto extends RequestDbBaseDto implements java.io.Serializable {

	private static final long serialVersionUID = 1110707400761783985L;
	/** 集团代码 **/
	private String chainUid;
	private String chainCd;
	private String chainName;
	
	/** 酒店代码 **/
	
	private String unitUid;
	private String unitCd;
	private String unitName;
	
	/** 主键 **/
	private Integer id;
	/** 追踪ID **/
	private String tracerId;
	/** 业务ID **/
	private String businessId;
	/** asyncId **/
	private String asyncId;
	/** 类名 **/
	private String className;
	/** 方法名 **/
	private String methodName;
	
	/** 接口地址 **/
	private String infurl;
	/** 接口名称 **/
	private String infnm;
	
	/** 日志类型 **/
	private String logCD;
	/** 功能模块 **/
	private String funcCd;
	/** 当前操作系统 **/
	private String sysid;
	/** 操作类型 **/
	private String operationType;
	/** 操作时间 **/
	private Date logDhms;
	
	/** 操作人ID **/
	private String userUid;
	private String userCd;
	private String userName;
	
	/** 操作人所属酒店编码 **/
	private String userUnitUid;
	
	/** 操作人IP **/
	private String fromIp;
	/** 操作记录 **/
	private String entityId;
	/** 工作站号 **/
	private String clientUid;
	/** 备注 **/
	private String memo;
	
	/** 页面展现dto组件信息 **/
	private String displayData;
	/** 页面新值JSON串 **/
	private String submitData;
	/** 页面原值JSON串 **/
	private String originData;
	/** 请求数据**/
	private String requestData;
	/** 请求数据DTO名字**/
	private String requestDtoName;
	
	/** 创建人 */
	private String createdBy;
	/** 创建时间*/
	private Date createdDate;
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
	
	/** 关键键值 */
	private String keyNo;
	
	/** 内容 */
	private List<LogContentDto> content;
	/** keyNo转换内容 */
	private List<LogTranDto> tranContent;
	
	/** 语种 */
	private String language_id;
	/** 接口是否记录ES日志 */
	private String logged;
	/** 所属工程标示 */
	private String projectName;
	/**
	 * @return the chainUid
	 */
	public String getChainUid() {
		return chainUid;
	}
	/**
	 * @param chainUid the chainUid to set
	 */
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	/**
	 * @return the chainCd
	 */
	public String getChainCd() {
		return chainCd;
	}
	/**
	 * @param chainCd the chainCd to set
	 */
	public void setChainCd(String chainCd) {
		this.chainCd = chainCd;
	}
	/**
	 * @return the chainName
	 */
	public String getChainName() {
		return chainName;
	}
	/**
	 * @param chainName the chainName to set
	 */
	public void setChainName(String chainName) {
		this.chainName = chainName;
	}
	/**
	 * @return the unitUid
	 */
	public String getUnitUid() {
		return unitUid;
	}
	/**
	 * @param unitUid the unitUid to set
	 */
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	/**
	 * @return the unitCd
	 */
	public String getUnitCd() {
		return unitCd;
	}
	/**
	 * @param unitCd the unitCd to set
	 */
	public void setUnitCd(String unitCd) {
		this.unitCd = unitCd;
	}
	/**
	 * @return the unitName
	 */
	public String getUnitName() {
		return unitName;
	}
	/**
	 * @param unitName the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the tracerId
	 */
	public String getTracerId() {
		return tracerId;
	}
	/**
	 * @param tracerId the tracerId to set
	 */
	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}
	
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
	 * @return the asyncId
	 */
	public String getAsyncId() {
		return asyncId;
	}
	/**
	 * @param asyncId the asyncId to set
	 */
	public void setAsyncId(String asyncId) {
		this.asyncId = asyncId;
	}
	
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the methodName
	 */
	public String getMethodName() {
		return methodName;
	}
	/**
	 * @param methodName the methodName to set
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	/**
	 * @return the infurl
	 */
	public String getInfurl() {
		return infurl;
	}
	/**
	 * @param infurl the infurl to set
	 */
	public void setInfurl(String infurl) {
		this.infurl = infurl;
	}
	/**
	 * @return the infnm
	 */
	public String getInfnm() {
		return infnm;
	}
	/**
	 * @param infnm the infnm to set
	 */
	public void setInfnm(String infnm) {
		this.infnm = infnm;
	}
	/**
	 * @return the logCD
	 */
	public String getLogCD() {
		return logCD;
	}
	/**
	 * @param logCD the logCD to set
	 */
	public void setLogCD(String logCD) {
		this.logCD = logCD;
	}
	/**
	 * @return the funcCd
	 */
	public String getFuncCd() {
		return funcCd;
	}
	/**
	 * @param funcCd the funcCd to set
	 */
	public void setFuncCd(String funcCd) {
		this.funcCd = funcCd;
	}
	/**
	 * @return the sysid
	 */
	public String getSysid() {
		return sysid;
	}
	/**
	 * @param sysid the sysid to set
	 */
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	/**
	 * @return the operationType
	 */
	public String getOperationType() {
		return operationType;
	}
	/**
	 * @param operationType the operationType to set
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	/**
	 * @return the logDhms
	 */
	public Date getLogDhms() {
		return logDhms;
	}
	/**
	 * @param logDhms the logDhms to set
	 */
	public void setLogDhms(Date logDhms) {
		this.logDhms = logDhms;
	}
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
	/**
	 * @return the userCd
	 */
	public String getUserCd() {
		return userCd;
	}
	/**
	 * @param userCd the userCd to set
	 */
	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userUnitUid
	 */
	public String getUserUnitUid() {
		return userUnitUid;
	}
	/**
	 * @param userUnitUid the userUnitUid to set
	 */
	public void setUserUnitUid(String userUnitUid) {
		this.userUnitUid = userUnitUid;
	}
	/**
	 * @return the fromIp
	 */
	public String getFromIp() {
		return fromIp;
	}
	/**
	 * @param fromIp the fromIp to set
	 */
	public void setFromIp(String fromIp) {
		this.fromIp = fromIp;
	}
	/**
	 * @return the entityId
	 */
	public String getEntityId() {
		return entityId;
	}
	/**
	 * @param entityId the entityId to set
	 */
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	/**
	 * @return the clientUid
	 */
	public String getClientUid() {
		return clientUid;
	}
	/**
	 * @param clientUid the clientUid to set
	 */
	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
	}
	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	/**
	 * @return the displayData
	 */
	public String getDisplayData() {
		return displayData;
	}
	/**
	 * @param displayData the displayData to set
	 */
	public void setDisplayData(String displayData) {
		this.displayData = displayData;
	}
	/**
	 * @return the submitData
	 */
	public String getSubmitData() {
		return submitData;
	}
	/**
	 * @param submitData the submitData to set
	 */
	public void setSubmitData(String submitData) {
		this.submitData = submitData;
	}
	/**
	 * @return the originData
	 */
	public String getOriginData() {
		return originData;
	}
	/**
	 * @param originData the originData to set
	 */
	public void setOriginData(String originData) {
		this.originData = originData;
	}
	/**
	 * @return the requestData
	 */
	public String getRequestData() {
		return requestData;
	}
	/**
	 * @param requestData the requestData to set
	 */
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}
	/**
	 * @return the requestDtoName
	 */
	public String getRequestDtoName() {
		return requestDtoName;
	}
	/**
	 * @param requestDtoName the requestDtoName to set
	 */
	public void setRequestDtoName(String requestDtoName) {
		this.requestDtoName = requestDtoName;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the createdByUid
	 */
	public String getCreatedByUid() {
		return createdByUid;
	}
	/**
	 * @param createdByUid the createdByUid to set
	 */
	public void setCreatedByUid(String createdByUid) {
		this.createdByUid = createdByUid;
	}
	/**
	 * @return the createdByCd
	 */
	public String getCreatedByCd() {
		return createdByCd;
	}
	/**
	 * @param createdByCd the createdByCd to set
	 */
	public void setCreatedByCd(String createdByCd) {
		this.createdByCd = createdByCd;
	}
	/**
	 * @return the createdUnitUid
	 */
	public String getCreatedUnitUid() {
		return createdUnitUid;
	}
	/**
	 * @param createdUnitUid the createdUnitUid to set
	 */
	public void setCreatedUnitUid(String createdUnitUid) {
		this.createdUnitUid = createdUnitUid;
	}
	/**
	 * @return the createdUnitCd
	 */
	public String getCreatedUnitCd() {
		return createdUnitCd;
	}
	/**
	 * @param createdUnitCd the createdUnitCd to set
	 */
	public void setCreatedUnitCd(String createdUnitCd) {
		this.createdUnitCd = createdUnitCd;
	}
	/**
	 * @return the logDbName
	 */
	public String getLogDbName() {
		return logDbName;
	}
	/**
	 * @param logDbName the logDbName to set
	 */
	public void setLogDbName(String logDbName) {
		this.logDbName = logDbName;
	}
	/**
	 * @return the chainDbName
	 */
	public String getChainDbName() {
		return chainDbName;
	}
	/**
	 * @param chainDbName the chainDbName to set
	 */
	public void setChainDbName(String chainDbName) {
		this.chainDbName = chainDbName;
	}
	/**
	 * @return the unitDbName
	 */
	public String getUnitDbName() {
		return unitDbName;
	}
	/**
	 * @param unitDbName the unitDbName to set
	 */
	public void setUnitDbName(String unitDbName) {
		this.unitDbName = unitDbName;
	}
	/**
	 * @return the statDbName
	 */
	public String getStatDbName() {
		return statDbName;
	}
	/**
	 * @param statDbName the statDbName to set
	 */
	public void setStatDbName(String statDbName) {
		this.statDbName = statDbName;
	}
	/**
	 * @return the posDbName
	 */
	public String getPosDbName() {
		return posDbName;
	}
	/**
	 * @param posDbName the posDbName to set
	 */
	public void setPosDbName(String posDbName) {
		this.posDbName = posDbName;
	}
	/**
	 * @return the ccsDbName
	 */
	public String getCcsDbName() {
		return ccsDbName;
	}
	/**
	 * @param ccsDbName the ccsDbName to set
	 */
	public void setCcsDbName(String ccsDbName) {
		this.ccsDbName = ccsDbName;
	}
	/**
	 * @return the cldrDbName
	 */
	public String getCldrDbName() {
		return cldrDbName;
	}
	/**
	 * @param cldrDbName the cldrDbName to set
	 */
	public void setCldrDbName(String cldrDbName) {
		this.cldrDbName = cldrDbName;
	}
	/**
	 * @return the crsDbName
	 */
	public String getCrsDbName() {
		return crsDbName;
	}
	/**
	 * @param crsDbName the crsDbName to set
	 */
	public void setCrsDbName(String crsDbName) {
		this.crsDbName = crsDbName;
	}
	/**
	 * @return the crmDbName
	 */
	public String getCrmDbName() {
		return crmDbName;
	}
	/**
	 * @param crmDbName the crmDbName to set
	 */
	public void setCrmDbName(String crmDbName) {
		this.crmDbName = crmDbName;
	}
	/**
	 * @return the lpsDbName
	 */
	public String getLpsDbName() {
		return lpsDbName;
	}
	/**
	 * @param lpsDbName the lpsDbName to set
	 */
	public void setLpsDbName(String lpsDbName) {
		this.lpsDbName = lpsDbName;
	}
	/**
	 * @return the ebsDbName
	 */
	public String getEbsDbName() {
		return ebsDbName;
	}
	/**
	 * @param ebsDbName the ebsDbName to set
	 */
	public void setEbsDbName(String ebsDbName) {
		this.ebsDbName = ebsDbName;
	}
	/**
	 * @return the keyNo
	 */
	public String getKeyNo() {
		return keyNo;
	}
	/**
	 * @param keyNo the keyNo to set
	 */
	public void setKeyNo(String keyNo) {
		this.keyNo = keyNo;
	}
	/**
	 * @return the content
	 */
	public List<LogContentDto> getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(List<LogContentDto> content) {
		this.content = content;
	}
	/**
	 * @return the tranContent
	 */
	public List<LogTranDto> getTranContent() {
		return tranContent;
	}
	/**
	 * @param tranContent the tranContent to set
	 */
	public void setTranContent(List<LogTranDto> tranContent) {
		this.tranContent = tranContent;
	}
	/**
	 * @return the language_id
	 */
	public String getLanguage_id() {
		return language_id;
	}
	/**
	 * @param language_id the language_id to set
	 */
	public void setLanguage_id(String language_id) {
		this.language_id = language_id;
	}
	/**
	 * @return the logged
	 */
	public String getLogged() {
		return logged;
	}
	/**
	 * @param logged the logged to set
	 */
	public void setLogged(String logged) {
		this.logged = logged;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the scmDbName
	 */
	public String getScmDbName() {
		return scmDbName;
	}
	/**
	 * @param scmDbName the scmDbName to set
	 */
	public void setScmDbName(String scmDbName) {
		this.scmDbName = scmDbName;
	}
	/**
	 * @return the gfcDbName
	 */
	public String getGfcDbName() {
		return gfcDbName;
	}
	/**
	 * @param gfcDbName the gfcDbName to set
	 */
	public void setGfcDbName(String gfcDbName) {
		this.gfcDbName = gfcDbName;
	}
	

}
