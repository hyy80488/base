package com.jw.common.framework.m3130.f010.dto.distribute;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class DistributeResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5956116377051308963L;
	//酒店数据
	private List<Map<String, Object>> listUnits;
	//不可分发数据
	private List<Map<String, Object>> notDistri;
	//可以分发数据
	private List<Map<String, Object>> distri;
	public List<Map<String, Object>> getListUnits() {
		return listUnits;
	}
	public List<Map<String, Object>> getNotDistri() {
		return notDistri;
	}
	public List<Map<String, Object>> getDistri() {
		return distri;
	}
	public void setListUnits(List<Map<String, Object>> listUnits) {
		this.listUnits = listUnits;
	}
	public void setNotDistri(List<Map<String, Object>> notDistri) {
		this.notDistri = notDistri;
	}
	public void setDistri(List<Map<String, Object>> distri) {
		this.distri = distri;
	}
}
