
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/** 
 * ## 类说明：
 * 	菜品类别DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosMenuTypResultDto新增
 */
@DrptDto(dtonm = "PosMenuTypMakeResponseDtoT",dtodrpt="菜品类别制法配置返回传输对象")
public class PosMenuTypMakeResponseDtoT extends ResponseBaseDto implements java.io.Serializable{
	@DrptField(fieldnm="posMenuTypMakeDtoTs",fielddrpt="小类菜品类别制法")
	private List<PosMenuTypMakeDtoT>  smallPosMenuTypMakes;
	
	@DrptField(fieldnm="posMenuTypMakeDtoTs",fielddrpt="大类菜品类别制法")
	private List<PosMenuTypMakeDtoT>  BigposMenuTypMakes;

	public List<PosMenuTypMakeDtoT> getSmallPosMenuTypMakes() {
		return smallPosMenuTypMakes;
	}

	public void setSmallPosMenuTypMakes(List<PosMenuTypMakeDtoT> smallPosMenuTypMakes) {
		this.smallPosMenuTypMakes = smallPosMenuTypMakes;
	}

	public List<PosMenuTypMakeDtoT> getBigposMenuTypMakes() {
		return BigposMenuTypMakes;
	}

	public void setBigposMenuTypMakes(List<PosMenuTypMakeDtoT> bigposMenuTypMakes) {
		BigposMenuTypMakes = bigposMenuTypMakes;
	}

	

	
	
}

