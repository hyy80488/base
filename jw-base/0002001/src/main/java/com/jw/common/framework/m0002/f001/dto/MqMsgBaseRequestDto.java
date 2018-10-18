package com.jw.common.framework.m0002.f001.dto;

import java.io.Serializable;

public class MqMsgBaseRequestDto extends RequestBaseDto implements Serializable {
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2033560644870758743L;
	/** 集团代码 **/
	private String chainUid;
	/** 集团cd **/
	private String chainCd;
	/** 酒店代码 **/
	private String unitUid;
	/** 数据库类型 **/
	private String dbTyp;
	/** 语种cd **/
	private String languageCd;
	
	/** 追踪ID **/
	private String tracerId;
	/** 类名 **/
	private String className;
	/** 方法名 **/
	private String methodName;
	/** 接口地址 **/
	private String infurl;
	/** 接口名称 **/
	private String infnm;
	/** 当前操作系统 **/
	private java.lang.String sysid;
	/** 操作类型 **/
	private java.lang.String operationType;
	/** 操作时间 **/
	private java.util.Date logDhms;
	/** 操作人ID **/
	private java.lang.String userUid;
	/** 操作人CODE **/
	private java.lang.String userCd;
	/** 操作人所属酒店编码 **/
	private java.lang.String userUnitUid;
	/** 操作人IP **/
	private java.lang.String fromIp;
	/** 操作记录 **/
	private java.lang.String entityId;
	/** 工作站号 **/
	private String clientUid;
	
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
	
	/** 工作站号 */
	private String workstationNo;
	
	/** 当前集团对应日志库——数据源名称 */
	private String logDbName;
	/** 当前集团库——数据源名称 */
	private String chainDbName;
	/** 当前酒店库——数据源名称 */
	private String unitDbName;
	/** 当前统计库——数据源名称 */
	private String statDbName;
	public String getChainUid() {
		return chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public String getTracerId() {
		return tracerId;
	}
	public String getClassName() {
		return className;
	}
	public String getMethodName() {
		return methodName;
	}
	public String getInfurl() {
		return infurl;
	}
	public String getInfnm() {
		return infnm;
	}
	public java.lang.String getSysid() {
		return sysid;
	}
	public java.lang.String getOperationType() {
		return operationType;
	}
	public java.util.Date getLogDhms() {
		return logDhms;
	}
	public java.lang.String getUserUid() {
		return userUid;
	}
	public java.lang.String getUserCd() {
		return userCd;
	}
	public java.lang.String getUserUnitUid() {
		return userUnitUid;
	}
	public java.lang.String getFromIp() {
		return fromIp;
	}
	public java.lang.String getEntityId() {
		return entityId;
	}
	public String getClientUid() {
		return clientUid;
	}
	public java.lang.String getCreatedBy() {
		return createdBy;
	}
	public java.util.Date getCreatedDate() {
		return createdDate;
	}
	public String getCreatedByUid() {
		return createdByUid;
	}
	public String getCreatedByCd() {
		return createdByCd;
	}
	public String getCreatedUnitUid() {
		return createdUnitUid;
	}
	public String getCreatedUnitCd() {
		return createdUnitCd;
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
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public void setInfurl(String infurl) {
		this.infurl = infurl;
	}
	public void setInfnm(String infnm) {
		this.infnm = infnm;
	}
	public void setSysid(java.lang.String sysid) {
		this.sysid = sysid;
	}
	public void setOperationType(java.lang.String operationType) {
		this.operationType = operationType;
	}
	public void setLogDhms(java.util.Date logDhms) {
		this.logDhms = logDhms;
	}
	public void setUserUid(java.lang.String userUid) {
		this.userUid = userUid;
	}
	public void setUserCd(java.lang.String userCd) {
		this.userCd = userCd;
	}
	public void setUserUnitUid(java.lang.String userUnitUid) {
		this.userUnitUid = userUnitUid;
	}
	public void setFromIp(java.lang.String fromIp) {
		this.fromIp = fromIp;
	}
	public void setEntityId(java.lang.String entityId) {
		this.entityId = entityId;
	}
	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
	}
	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}
	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}
	public void setCreatedByUid(String createdByUid) {
		this.createdByUid = createdByUid;
	}
	public void setCreatedByCd(String createdByCd) {
		this.createdByCd = createdByCd;
	}
	public void setCreatedUnitUid(String createdUnitUid) {
		this.createdUnitUid = createdUnitUid;
	}
	public void setCreatedUnitCd(String createdUnitCd) {
		this.createdUnitCd = createdUnitCd;
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
	public String getChainCd() {
		return chainCd;
	}
	public void setChainCd(String chainCd) {
		this.chainCd = chainCd;
	}
	public String getDbTyp() {
		return dbTyp;
	}
	public String getLanguageCd() {
		return languageCd;
	}
	public void setDbTyp(String dbTyp) {
		this.dbTyp = dbTyp;
	}
	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}
	public String getWorkstationNo() {
		return workstationNo;
	}
	public void setWorkstationNo(String workstationNo) {
		this.workstationNo = workstationNo;
	}
	
	
}
