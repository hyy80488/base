/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * 
 * ## 类说明：
 * 	价格列表信息对象
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rsvRateQuery
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月11日|guoc|新增|GrpRsvRateListInfoResponseFormDto.java新增
 */
@DrptDto(dtonm = "价格列表信息对象",dtodrpt="价格列表信息对象")
public class GrpRsvRateListInfoResponseFormDto extends ResponseBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -1455492836775529120L;
	
	@DrptField(fieldnm="resultData",fielddrpt="价格列表信息对象")
	private List<GrpRsvRateListInfoDto> resultData;

	public List<GrpRsvRateListInfoDto> getResultData() {
		return resultData;
	}

	public void setResultData(List<GrpRsvRateListInfoDto> resultData) {
		this.resultData = resultData;
	}

}
