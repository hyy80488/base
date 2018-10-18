package com.jw.common.framework.m0002.f001.dto.snap;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class ListDataResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2789686319387854860L;
	
	private List<Map<String, Object>> list;
	private List<List<Map<String, Object>>> lists;
	public List<Map<String, Object>> getList() {
		return list;
	}
	public List<List<Map<String, Object>>> getLists() {
		return lists;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	public void setLists(List<List<Map<String, Object>>> lists) {
		this.lists = lists;
	}
	
	/*
	 *  条数数组
	 */
	private Set<String> querys;
	public Set<String> getQuerys() {
		return querys;
	}
	public void setQuerys(Set<String> querys) {
		this.querys = querys;
	}
	

}
