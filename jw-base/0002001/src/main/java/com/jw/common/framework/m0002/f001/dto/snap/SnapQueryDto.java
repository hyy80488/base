package com.jw.common.framework.m0002.f001.dto.snap;

import java.io.Serializable;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.common.framework.m0002.f001.dto.RequestCommonDto;

public class SnapQueryDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 780052035641253688L;
	
	public SnapQueryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SnapQueryDto(String chainUid, String unitUid, String auditDt) {
		super();
		this.chainUid = chainUid;
		this.unitUid = unitUid;
		this.auditDt = auditDt;
	}
	
	public SnapQueryDto(String auditDt) {
		super();
		this.auditDt = auditDt;
	}
	
	/*
	 * 集团代码
	 */
	private String chainUid;
	/*
	 * 酒店代码
	 */
	private String unitUid;
	/*
	 * 审计日期
	 */
	private String auditDt;
	/*
	 * 查询条数
	 */
	private Integer queryCnt;
	/*
	 *  条数数组
	 */
	private Set<String> querys;
	
	private String stepSubQuery;
	
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
	public String getAuditDt() {
		return auditDt;
	}
	public void setAuditDt(String auditDt) {
		this.auditDt = auditDt;
	}
	@Override
	public String toString() {
		return "SnapQueryDto [chainUid=" + chainUid + ", unitUid=" + unitUid + ", auditDt=" + auditDt + "]";
	}
	
	/*private RequestCommonDto requestCommonDto;

	public RequestCommonDto getRequestCommonDto() {
		return requestCommonDto;
	}
	public void setRequestCommonDto(RequestCommonDto requestCommonDto) {
		this.requestCommonDto = requestCommonDto;
	}*/
	public Integer getQueryCnt() {
		return queryCnt;
	}
	public void setQueryCnt(Integer queryCnt) {
		this.queryCnt = queryCnt;
	}
	public String getStepSubQuery() {
		return stepSubQuery;
	}
	public void setStepSubQuery(String stepSubQuery) {
		this.stepSubQuery = stepSubQuery;
	}
	
	
	private Boolean isFinish = false;

	public Boolean getIsFinish() {
		return isFinish;
	}
	public void setIsFinish(Boolean isFinish) {
		this.isFinish = isFinish;
	}
	public Set<String> getQuerys() {
		return querys;
	}
	public void setQuerys(Set<String> querys) {
		this.querys = querys;
	}

	
}
