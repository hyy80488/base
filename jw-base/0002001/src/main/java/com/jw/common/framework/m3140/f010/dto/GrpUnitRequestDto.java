/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	单位入参
 * @author    [jianana]   
 * @version   [V1.0, 2018年4月19日]
 * @package com.jw.common.framework.m1410.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年4月19日|jianana|新增|GrpUnitRequestDto.java新增
 */
@DrptDto(dtonm = "GrpUnitRequestDto",dtodrpt="单位入参")
public class GrpUnitRequestDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 8021261651980719406L;
	@DrptField(fieldnm="unitUids", fielddrpt="酒店集合")
	private List<String> unitUids;
	public List<String> getUnitUids() {
		return unitUids;
	}
	public void setUnitUids(List<String> unitUids) {
		this.unitUids = unitUids;
	}
	
	
}
