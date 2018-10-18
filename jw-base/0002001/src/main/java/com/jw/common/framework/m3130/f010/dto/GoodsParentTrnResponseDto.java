
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;


/** 
 * ## 类说明：
 * 	故障房表查询列表信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-27]
 * @package com.jw.hms.pms.m3250.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-27|jianana|新增|HptHkRoomRepairResultDto新增
 */
@DrptDto(dtonm = "故障房表查询列表信息数据传输对象",dtodrpt="故障房表查询列表信息数据传输对象")
public class GoodsParentTrnResponseDto extends ResponseBaseDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 2658708421411283881L;
	@DrptField(fieldnm="单位商品定义新值",fielddrpt="单位商品定义新值")
	private List<GoodsTrnDto> goodsTrnDto;
	public List<GoodsTrnDto> getGoodsTrnDto() {
		return goodsTrnDto;
	}
	public void setGoodsTrnDto(List<GoodsTrnDto> goodsTrnDto) {
		this.goodsTrnDto = goodsTrnDto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

