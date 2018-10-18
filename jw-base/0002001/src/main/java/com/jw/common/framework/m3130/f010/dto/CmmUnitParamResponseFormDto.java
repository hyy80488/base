
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	CmmUnitParamFORM信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-17]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-17|jianana|新增|CmmUnitParamResponseFormDto新增
 */
@DrptDto(dtonm = "CmmUnitParamFORM信息数据传输对象",dtodrpt="CmmUnitParamFORM信息数据传输对象")
public class CmmUnitParamResponseFormDto extends ResponseBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 7115265502099132485L;
	@DrptField(fieldnm="CmmUnitParam对象",fielddrpt="CmmUnitParam对象")
	private CmmUnitParamDto resultData;
	
	public CmmUnitParamDto getResultData() {
		return resultData;
	}
	public void setResultData(CmmUnitParamDto resultData) {
		this.resultData = resultData;
	}
	
}
