package com.jw.common.framework.m0002.f001.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ResponseReportCommonDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8599164175735554464L;

	private List<Map<String, Object>> datas;

	public List<Map<String, Object>> getDatas() {
		return datas;
	}

	public void setDatas(List<Map<String, Object>> datas) {
		this.datas = datas;
	}
	
	private Map<Integer, Collection<Map<String, Object>>> mapDatas;

	public Map<Integer, Collection<Map<String, Object>>> getMapDatas() {
		return mapDatas;
	}

	public void setMapDatas(Map<Integer, Collection<Map<String, Object>>> mapDatas) {
		this.mapDatas = mapDatas;
	}
}
