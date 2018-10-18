package com.jw.common.framework.m5100.f010.dto;

import java.io.Serializable;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class CompanyResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6811453218932016010L;
	
	private String companyNm;

	/**
	 * @return the companyNm
	 */
	public String getCompanyNm() {
		return companyNm;
	}

	/**
	 * @param companyNm the companyNm to set
	 */
	public void setCompanyNm(String companyNm) {
		this.companyNm = companyNm;
	}
	
	
}
