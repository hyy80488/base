package com.jw.common.framework.m3130.f010.dto;


/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */

import com.jw.base.framework.core.annotation.DrptField;

/**
 * 
 * ## 类说明：
 * 	给IPad端返回需求的实体类
 * @author    [liyunlong]   
 * @version   [V1.0, 2018年9月12日]
 * @package com.jw.hms.cmm.m3130.f030.dto.posMenu
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月12日|liyunlong|新增|PosMakeForIPadInfo.java新增
 */
public class PosDemandForIPadInfo implements java.io.Serializable{
	
	private static final long serialVersionUID = 7240062576968117499L;

	@DrptField(fieldnm="需求名称",fielddrpt="需求名称")
	private String demandName;
	
	@DrptField(fieldnm="需求id",fielddrpt="需求id")
	private Integer demandId;
	
	@DrptField(fieldnm="需求(口味)代码",fielddrpt="需求(口味)代码")
	private String demandCd;
	
	@DrptField(fieldnm="需求用途",fielddrpt="需求用途,0-整单需求;1-菜品需求;2-配菜需求 这里只会出现1-菜品需求;2-配菜需求")
	private Integer demandFlg;

	
	
	/**
	 * @return the demandName
	 */
	public String getDemandName() {
		return demandName;
	}

	/**
	 * @param demandName the demandName to set
	 */
	public void setDemandName(String demandName) {
		this.demandName = demandName;
	}



	/**
	 * @return the demandId
	 */
	public Integer getDemandId() {
		return demandId;
	}

	/**
	 * @param demandId the demandId to set
	 */
	public void setDemandId(Integer demandId) {
		this.demandId = demandId;
	}

	/**
	 * @return the demandCd
	 */
	public String getDemandCd() {
		return demandCd;
	}

	/**
	 * @param demandCd the demandCd to set
	 */
	public void setDemandCd(String demandCd) {
		this.demandCd = demandCd;
	}

	/**
	 * @return the demandFlg
	 */
	public Integer getDemandFlg() {
		return demandFlg;
	}

	/**
	 * @param demandFlg the demandFlg to set
	 */
	public void setDemandFlg(Integer demandFlg) {
		this.demandFlg = demandFlg;
	}
	
	
}

