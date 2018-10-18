package com.jw.base.framework.core.jasper.dto;

import java.util.List;

public class ListrptConditionDto {
	// LIST报表ID
	private Integer listrptId;
	// 处理标志 0:导出PDF；1：输出Html
	private Integer dealflg;
	// LIST报表-数据集
	private List<ListrptdsDto> listrptdsDto;
	// 样式条件
	private List<ListrptSlCondDto> listrptSlCondDto;

	public Integer getListrptId() {
		return listrptId;
	}

	public void setListrptId(Integer listrptId) {
		this.listrptId = listrptId;
	}

	public Integer getDealflg() {
		return dealflg;
	}

	public void setDealflg(Integer dealflg) {
		this.dealflg = dealflg;
	}

	public List<ListrptdsDto> getListrptdsDto() {
		return listrptdsDto;
	}

	public void setListrptdsDto(List<ListrptdsDto> listrptdsDto) {
		this.listrptdsDto = listrptdsDto;
	}

	public List<ListrptSlCondDto> getListrptSlCondDto() {
		return listrptSlCondDto;
	}

	public void setListrptSlCondDto(List<ListrptSlCondDto> listrptSlCondDto) {
		this.listrptSlCondDto = listrptSlCondDto;
	}

}
