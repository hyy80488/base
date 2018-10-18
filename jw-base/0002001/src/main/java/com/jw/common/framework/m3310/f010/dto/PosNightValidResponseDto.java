package com.jw.common.framework.m3310.f010.dto;

import java.util.List;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class PosNightValidResponseDto extends ResponseBaseDto implements java.io.Serializable {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 3468595253256787739L;

	/**
	 * @Fields 出错销售点
	 */
	private List<PosNightValidDto> errorSales;
	
	public List<PosNightValidDto> getErrorSales() {
		return errorSales;
	}

	public void setErrorSales(List<PosNightValidDto> errorSales) {
		this.errorSales = errorSales;
	}

}
