/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5100.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	公司查询
 * @author    [bwliu]   
 * @version   [V1.0, 2018年4月19日]
 * @package com.jw.common.framework.m5100.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年4月19日|jianana|新增|CompanyQueryReqDto.java新增
 */
@DrptDto(dtonm = "CompanyQueryReqDto",dtodrpt="公司查询")
public class CompanyQueryReqDto extends RequestBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 6011637225662795454L;

    private String companyNum;
    private String companyNm;
    private String chanelCd;
	/**
	 * @return the companyNum
	 */
	public String getCompanyNum() {
		return companyNum;
	}
	/**
	 * @param companyNum the companyNum to set
	 */
	public void setCompanyNum(String companyNum) {
		this.companyNum = companyNum;
	}
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
	/**
	 * @return the chanelCd
	 */
	public String getChanelCd() {
		return chanelCd;
	}
	/**
	 * @param chanelCd the chanelCd to set
	 */
	public void setChanelCd(String chanelCd) {
		this.chanelCd = chanelCd;
	}
    
    
}
