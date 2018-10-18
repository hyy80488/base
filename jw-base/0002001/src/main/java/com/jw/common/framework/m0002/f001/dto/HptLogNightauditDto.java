/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Map;

import javax.persistence.Transient;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.DateUtil;

public class HptLogNightauditDto  implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -463771355211242750L;

	@DrptField(fieldnm="id", fielddrpt="id", nullable = "false", length = "40")
	private Integer id;
	
	@DrptField(fieldnm="chainUid", fielddrpt="集团UID ", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm="unitUid", fielddrpt="单位UID ", nullable = "false", length = "40")
	private String unitUid;
	
	@DrptField(fieldnm="auditDt", fielddrpt="审计日期 ", nullable = "false", length = "13")
	private java.util.Date auditDt;
	
	@DrptField(fieldnm="nightauditstepCd", fielddrpt="夜审步骤 ", nullable = "false", length = "20")
	private String nightauditstepCd;
	
	@DrptField(fieldnm="startTm", fielddrpt="开始时间 ", nullable = "true", length = "29")
	private java.util.Date startTm;
	
	@DrptField(fieldnm="endTm", fielddrpt="结束时间 ", nullable = "true", length = "29")
	private java.util.Date endTm;
	
	@DrptField(fieldnm="memo", fielddrpt="备注 ", nullable = "true", length = "4000")
	private String memo;
	
	@DrptField(fieldnm="ngtWsNo", fielddrpt="工作站 ", nullable = "true", length = "40")
	private String ngtWsNo;
	
	@DrptField(fieldnm="ngtOper", fielddrpt="操作员 ", nullable = "true", length = "40")
	private String ngtOper;
	
	@DrptField(fieldnm="waitFlg", fielddrpt="等待执行方式 0：依赖步骤完毕后执行 1：所有序号小于此步骤的步骤执行完毕后执行", nullable = "true", length = "3")
	private String waitFlg;
	
	@DrptField(fieldnm="sysid", fielddrpt="所属系统代码 IF ,FW,GRP,CMM,CRS, CRM,CCM,CMS,CSO,WDS,IDS", nullable = "false", length = "10")
	private String sysid;
	
	@DrptField(fieldnm="stepUrl", fielddrpt="调用地址 接入第三方使用", nullable = "true", length = "500")
	private String stepUrl;
	
	@DrptField(fieldnm="stepPhase", fielddrpt="夜审步骤所属阶段 0：夜审前检查 1：账务处理 2：夜审开始 3：夜审审核 4：夜审结束", nullable = "true", length = "3")
	private String stepPhase;
	
	@DrptField(fieldnm="preSteps", fielddrpt="前置步骤 所有的前置步骤，逗号隔开", nullable = "true", length = "500")
	private String preSteps;
	
	@DrptField(fieldnm="stepoverFlg", fielddrpt="单步执行标志 0：不可单步执行（默认） 1：可以单步执行", nullable = "true", length = "1")
	private String stepoverFlg;
	
	@DrptField(fieldnm="nightauditstepStat", fielddrpt="执行状态 0：未执行 1：执行中 2：成功 3：失败 4：跳过", nullable = "true", length = "3")
	private String nightauditstepStat;
	@DrptField(fieldnm="stepNm", fielddrpt="夜审步骤名称 ", nullable = "true", length = "200")
	private String stepNm;
	
	@DrptField(fieldnm="stepDrpt", fielddrpt="夜审步骤描述 ", nullable = "true", length = "500")
	private String stepDrpt;
	
	@DrptField(fieldnm="failoverFlg", fielddrpt="出错继续执行 0：出错停止（默认） 1：出错可以继续执行下一步", nullable = "true", length = "1")
	private String failoverFlg;
	@DrptField(fieldnm = "ignoreFlg", fielddrpt = "可以忽略标志 0：不可以忽略（默认） 1：可以忽略", nullable = "true", length = "1")
	private String ignoreFlg;
	@DrptField(fieldnm="stepDefaultIndex", fielddrpt="夜审步骤执行序号 默认执行步骤号，配置时需要隔开一定数量，有可能会有插入步骤", nullable = "true", length = "10")
	private Integer stepDefaultIndex;
	@DrptField(fieldnm="errorMsg", fielddrpt="错误信息", nullable = "false")
	private String errorMsg;
	@DrptField(fieldnm="errorCode", fielddrpt="错误代码", nullable = "false")
	private String errorCode;
	@DrptField(fieldnm="errorKey", fielddrpt="错误数据主键	例如  key:acctNo,value:['F000100','F000102']", nullable = "false")
	private Map<String,List<Object>> errorKey;
	@DrptField(fieldnm="quantity", fielddrpt="正确数据数量", nullable = "false")
	private Integer quantity;
	@DrptField(fieldnm="totalQuant", fielddrpt="总条数", nullable = "false")
	private Integer totalQuant;
	

	public Integer getTotalQuant() {
		return totalQuant;
	}

	public void setTotalQuant(Integer totalQuant) {
		this.totalQuant = totalQuant;
	}

	public String getStepNm() {
		return stepNm;
	}

	public void setStepNm(String stepNm) {
		this.stepNm = stepNm;
	}

	public String getStepDrpt() {
		return stepDrpt;
	}

	public void setStepDrpt(String stepDrpt) {
		this.stepDrpt = stepDrpt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIgnoreFlg() {
		return ignoreFlg;
	}

	public void setIgnoreFlg(String ignoreFlg) {
		this.ignoreFlg = ignoreFlg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Map<String, List<Object>> getErrorKey() {
		return errorKey;
	}

	public void setErrorKey(Map<String, List<Object>> errorKey) {
		this.errorKey = errorKey;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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

	public java.util.Date getAuditDt() {
		return auditDt;
	}

	public void setAuditDt(java.util.Date auditDt) {
		this.auditDt = auditDt;
	}

	public String getNightauditstepCd() {
		return nightauditstepCd;
	}

	public void setNightauditstepCd(String nightauditstepCd) {
		this.nightauditstepCd = nightauditstepCd;
	}

	public java.util.Date getStartTm() {
		return startTm;
	}

	public void setStartTm(java.util.Date startTm) {
		this.startTm = startTm;
	}

	public java.util.Date getEndTm() {
		return endTm;
	}

	public void setEndTm(java.util.Date endTm) {
		this.endTm = endTm;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNgtWsNo() {
		return ngtWsNo;
	}

	public void setNgtWsNo(String ngtWsNo) {
		this.ngtWsNo = ngtWsNo;
	}

	public String getNgtOper() {
		return ngtOper;
	}

	public void setNgtOper(String ngtOper) {
		this.ngtOper = ngtOper;
	}

	public String getWaitFlg() {
		return waitFlg;
	}

	public void setWaitFlg(String waitFlg) {
		this.waitFlg = waitFlg;
	}

	public String getSysid() {
		return sysid;
	}

	public void setSysid(String sysid) {
		this.sysid = sysid;
	}

	public String getStepUrl() {
		return stepUrl;
	}

	public void setStepUrl(String stepUrl) {
		this.stepUrl = stepUrl;
	}

	public String getStepPhase() {
		return stepPhase;
	}

	public void setStepPhase(String stepPhase) {
		this.stepPhase = stepPhase;
	}

	public String getPreSteps() {
		return preSteps;
	}

	public void setPreSteps(String preSteps) {
		this.preSteps = preSteps;
	}

	public String getStepoverFlg() {
		return stepoverFlg;
	}

	public void setStepoverFlg(String stepoverFlg) {
		this.stepoverFlg = stepoverFlg;
	}

	public String getNightauditstepStat() {
		return nightauditstepStat;
	}

	public void setNightauditstepStat(String nightauditstepStat) {
		this.nightauditstepStat = nightauditstepStat;
	}

	public String getFailoverFlg() {
		return failoverFlg;
	}

	public void setFailoverFlg(String failoverFlg) {
		this.failoverFlg = failoverFlg;
	}

	public Integer getStepDefaultIndex() {
		return stepDefaultIndex;
	}

	public void setStepDefaultIndex(Integer stepDefaultIndex) {
		this.stepDefaultIndex = stepDefaultIndex;
	}
	
	@Transient
	public void copyMapToDto(Map<String,Object> map) throws Exception {
		if (map != null) {
			setId(map.containsKey("id") && map.get("id") != null ? (Integer)map.get("id") : null);
			setAuditDt(map.containsKey("audit_dt") && map.get("audit_dt") != null ? DateUtil.parse(map.get("audit_dt").toString(), DateUtil.DATE_FORMAT) : null);
			setNightauditstepCd(map.containsKey("nightauditstep_cd") && map.get("nightauditstep_cd") != null ? map.get("nightauditstep_cd").toString() : null);
			setMemo(map.containsKey("memo") && map.get("memo") != null ? map.get("memo").toString() : null);
			setNgtWsNo(map.containsKey("ngt_ws_no") && map.get("ngt_ws_no") != null ? map.get("ngt_ws_no").toString() : null);
			setNgtOper(map.containsKey("ngt_oper") && map.get("ngt_oper") != null ? map.get("ngt_oper").toString() : null);
			setWaitFlg(map.containsKey("wait_flg") && map.get("wait_flg") != null ? map.get("wait_flg").toString() : null);
			setSysid(map.containsKey("sysid") && map.get("sysid") != null ? map.get("sysid").toString() : null);
			setStepUrl(map.containsKey("step_url") && map.get("step_url") != null ? map.get("step_url").toString() : null);
			setStepPhase(map.containsKey("step_phase") && map.get("step_phase") != null ? map.get("step_phase").toString() : null);
			setPreSteps(map.containsKey("pre_steps") && map.get("pre_steps") != null ? map.get("pre_steps").toString() : null);
			setStepoverFlg(map.containsKey("stepover_flg") && map.get("stepover_flg") != null ? map.get("stepover_flg").toString() : null);
			setNightauditstepStat(map.containsKey("nightauditstep_stat") && map.get("nightauditstep_stat") != null ? map.get("nightauditstep_stat").toString() : null);
			setFailoverFlg(map.containsKey("failover_flg") && map.get("failover_flg") != null ? map.get("failover_flg").toString() : null);
			setIgnoreFlg(map.containsKey("ignore_flg") && map.get("ignore_flg") != null ? map.get("ignore_flg").toString() : null);
			setStepDefaultIndex(map.containsKey("step_default_index") && map.get("step_default_index") != null ? Integer.valueOf(map.get("step_default_index").toString()) : null);
			setStepNm(map.containsKey("step_nm") && map.get("step_nm") != null ? map.get("step_nm").toString() : null);
			setStepDrpt(map.containsKey("step_drpt") && map.get("step_drpt") != null ? map.get("step_drpt").toString() : null);
		}
	}
	
}
