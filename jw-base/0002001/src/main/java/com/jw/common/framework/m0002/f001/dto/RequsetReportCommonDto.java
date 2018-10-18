package com.jw.common.framework.m0002.f001.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RequsetReportCommonDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2018494420939004017L;
	//查询条件
	private Map<String, Object> queryParam;
	//其他查询条件
	private Map<String, Object> othParam;

	public Map<String, Object> getQueryParam() {
		return queryParam;
	}

	public void setQueryParam(Map<String, Object> queryParam) {
		this.queryParam = queryParam;
	}
	
	
	
	public Map<String, Object> getOthParam() {
		return othParam;
	}

	public void setOthParam(Map<String, Object> othParam) {
		this.othParam = othParam;
	}


	//数据条数
	private Integer reportCnt;
	public Integer getReportCnt() {
		return reportCnt;
	}
	public void setReportCnt(Integer reportCnt) {
		this.reportCnt = reportCnt;
	}
	//条数
	private Integer reportCntNow;
	public Integer getReportCntNow() {
		return reportCntNow;
	}
	public void setReportCntNow(Integer reportCntNow) {
		this.reportCntNow = reportCntNow;
	}
	
	//行分组
	private String rowGrp;
	//列分组
	private String collGrp;
	//列分组数据
	private List<Map<String, Object>> collGrpLst;
	//国家
	private Integer country_id;

	public String getRowGrp() {
		return rowGrp;
	}

	public List<Map<String, Object>> getCollGrpLst() {
		return collGrpLst;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public void setRowGrp(String rowGrp) {
		this.rowGrp = rowGrp;
	}

	public void setCollGrpLst(List<Map<String, Object>> collGrpLst) {
		this.collGrpLst = collGrpLst;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getCollGrp() {
		return collGrp;
	}

	public void setCollGrp(String collGrp) {
		this.collGrp = collGrp;
	}
	
	
}
