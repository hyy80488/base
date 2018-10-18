/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Map;

/**
 * ## 类说明：
 * 	列表展示通用DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016年12月27日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月27日|liubowen|新增|DataTableDto.java新增
 */
public class DataTableDto extends ResponseBaseDto implements java.io.Serializable {
	
	private static final long serialVersionUID = -8110598292660842271L;
	/** 列表数据 */
	private List data;
	/** 当前页数 */
	private int currentPage;
	/** 每页记录数量 */
	private int pageSize;
	/** 总记录数 */
	private int recordsTotal;
	/** 过滤后的总记录数 */
	private int recordsFiltered;
	/** 汇总数据 */
	private Map<String, Object> sumData;
	/** 备注 */
	private String memo;
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Map<String, Object> getSumData() {
		return sumData;
	}

	public void setSumData(Map<String, Object> sumData) {
		this.sumData = sumData;
	}

	public int getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	
}
