/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	通用common请求DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|RequestCommonDto.java新增
*/
public class RequestCommonDto implements java.io.Serializable {

	private static final long serialVersionUID = -4299459129923446557L;
	
	/** 共享SessionKey **/
	private String sessionKey;
	
	/** 操作员身份 **/
	private String userUid;
	
	/** 重复提交 **/
	private String token;
	
	/** 追踪ID **/
	private String tracerId;
	
	/** 业务ID **/
	private String businessId;
	
	/** asyncId **/
	private String asyncId;
	
	/** 是否开启异步补偿 **/
	private boolean compensating = false;
	
	/** 追踪ID **/
	private String tracerIdVersion;
	
	/** 用于判断请求的dto的状态(例如：是否是重复提交、是否是非法登录) **/
	private String validReqDtoStatus;
	
	/** 酒店UID **/
	private String unitUidOper;
	
	/** 酒店UID **/
	private String unitUid;
	
	/** 集团UID **/
	private String chainUid;
	
	/** 是否存在token注解 **/
	private boolean tokenStatus = true;
	
	/** 系统类型，用于切换数据库判断 **/
	private String sysTypeName;
	
	/** 数据库source_nm，用于切换数据库 **/
	private String sourceNm;
	
	/**  专用于记录参数日志用 start **/
	/** 方法名 **/
	private String methodName;
	
	/** className **/
	private String className;
	
	/** 接口地址 **/
	private String infurl;
	
	/** 接口名称 **/
	private String infnm;
	
	/** 接口名称 **/
	private String logged;
	/**  专用于记录参数日志用 end **/

	/** 功能编码 **/
	private String funCode;
	
	/** logCd **/
	private String logCd;
	
	/** operationType **/
	private String operationType;
	
	/** 业务日期 **/
	private long businessDt;
	
	/** 工作站 **/
	private String wsno;
	
	/** 执行API的URL **/
	private String executeUrl;

	/** 处理状态 **/
	private String dealStatus;
	
	/** api调用开始时间 **/
	private long invokerStartTime;
	
	/** 访问IP **/
	private String fromIp;
	
	/**
	 * @return the sessionKey
	 */
	public String getSessionKey() {
		return sessionKey;
	}

	/**
	 * @param sessionKey the sessionKey to set
	 */
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
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
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
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
	 * @return the compensating
	 */
	public boolean isCompensating() {
		return compensating;
	}

	/**
	 * @param compensating the compensating to set
	 */
	public void setCompensating(boolean compensating) {
		this.compensating = compensating;
	}

	/**
	 * @return the tracerIdVersion
	 */
	public String getTracerIdVersion() {
		return tracerIdVersion;
	}

	/**
	 * @param tracerIdVersion the tracerIdVersion to set
	 */
	public void setTracerIdVersion(String tracerIdVersion) {
		this.tracerIdVersion = tracerIdVersion;
	}

	/**
	 * @return the validReqDtoStatus
	 */
	public String getValidReqDtoStatus() {
		return validReqDtoStatus;
	}

	/**
	 * @param validReqDtoStatus the validReqDtoStatus to set
	 */
	public void setValidReqDtoStatus(String validReqDtoStatus) {
		this.validReqDtoStatus = validReqDtoStatus;
	}

	/**
	 * @return the unitUidOper
	 */
	public String getUnitUidOper() {
		return unitUidOper;
	}

	/**
	 * @param unitUidOper the unitUidOper to set
	 */
	public void setUnitUidOper(String unitUidOper) {
		this.unitUidOper = unitUidOper;
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
	 * @return the tokenStatus
	 */
	public boolean isTokenStatus() {
		return tokenStatus;
	}

	/**
	 * @param tokenStatus the tokenStatus to set
	 */
	public void setTokenStatus(boolean tokenStatus) {
		this.tokenStatus = tokenStatus;
	}

	/**
	 * @return the sysTypeName
	 */
	public String getSysTypeName() {
		return sysTypeName;
	}

	/**
	 * @param sysTypeName the sysTypeName to set
	 */
	public void setSysTypeName(String sysTypeName) {
		this.sysTypeName = sysTypeName;
	}

	/**
	 * @return the sourceNm
	 */
	public String getSourceNm() {
		return sourceNm;
	}

	/**
	 * @param sourceNm the sourceNm to set
	 */
	public void setSourceNm(String sourceNm) {
		this.sourceNm = sourceNm;
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
	 * @return the funCode
	 */
	public String getFunCode() {
		return funCode;
	}

	/**
	 * @param funCode the funCode to set
	 */
	public void setFunCode(String funCode) {
		this.funCode = funCode;
	}

	/**
	 * @return the logCd
	 */
	public String getLogCd() {
		return logCd;
	}

	/**
	 * @param logCd the logCd to set
	 */
	public void setLogCd(String logCd) {
		this.logCd = logCd;
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
	 * @return the businessDt
	 */
	public long getBusinessDt() {
		return businessDt;
	}

	/**
	 * @param businessDt the businessDt to set
	 */
	public void setBusinessDt(long businessDt) {
		this.businessDt = businessDt;
	}

	/**
	 * @return the wsno
	 */
	public String getWsno() {
		return wsno;
	}

	/**
	 * @param wsno the wsno to set
	 */
	public void setWsno(String wsno) {
		this.wsno = wsno;
	}

	/**
	 * @return the executeUrl
	 */
	public String getExecuteUrl() {
		return executeUrl;
	}

	/**
	 * @param executeUrl the executeUrl to set
	 */
	public void setExecuteUrl(String executeUrl) {
		this.executeUrl = executeUrl;
	}

	/**
	 * @return the dealStatus
	 */
	public String getDealStatus() {
		return dealStatus;
	}

	/**
	 * @param dealStatus the dealStatus to set
	 */
	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	/**
	 * @return the invokerStartTime
	 */
	public long getInvokerStartTime() {
		return invokerStartTime;
	}

	/**
	 * @param invokerStartTime the invokerStartTime to set
	 */
	public void setInvokerStartTime(long invokerStartTime) {
		this.invokerStartTime = invokerStartTime;
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
}
