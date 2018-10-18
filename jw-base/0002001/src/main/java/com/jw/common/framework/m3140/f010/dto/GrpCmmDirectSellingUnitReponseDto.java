
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseApiDto;

/**
 * 
 * ## 类说明：
 * 	直销查询酒店列表
 * @author    [zteng]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|zteng|新增|GrpCmmDirectSellingUnitQueryDto.java新增
 */
@DrptDto(dtonm = "直销查询酒店列表信息数据传输对象", dtodrpt = "直销查询酒店列表信息数据传输对象")
public class GrpCmmDirectSellingUnitReponseDto extends ResponseBaseApiDto implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1482174207499184048L;
	public List<GrpCmmDirectSellingUnitDto> result;

	public List<GrpCmmDirectSellingUnitDto> getResult() {
		return result;
	}

	public void setResult(List<GrpCmmDirectSellingUnitDto> result) {
		this.result = result;
	}
	
}
