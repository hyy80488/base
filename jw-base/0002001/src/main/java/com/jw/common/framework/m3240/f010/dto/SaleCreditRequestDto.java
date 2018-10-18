/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3240.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	接口挂账
 * @author    [jianana]   
 * @version   [V1.0, 2018年5月24日]
 * @package com.jw.common.framework.m3240.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年5月24日|jianana|新增|SaleCreditRequestDto.java新增
 */
@DrptDto(dtonm = "预定初始化参数",dtodrpt="接口挂账")
public class SaleCreditRequestDto extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 6270764461878435236L;
	@DrptField(fieldnm="saleCreditParamDto", fielddrpt="saleCreditParamDto")
	private SaleCreditParamDto saleCreditParamDto;
	@DrptField(fieldnm="trncodeIds", fielddrpt="科目代码")
	private List<Integer> trncodeIds;
	public SaleCreditParamDto getSaleCreditParamDto() {
		return saleCreditParamDto;
	}
	public void setSaleCreditParamDto(SaleCreditParamDto saleCreditParamDto) {
		this.saleCreditParamDto = saleCreditParamDto;
	}
	public List<Integer> getTrncodeIds() {
		return trncodeIds;
	}
	public void setTrncodeIds(List<Integer> trncodeIds) {
		this.trncodeIds = trncodeIds;
	}
	
}
