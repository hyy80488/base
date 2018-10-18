
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
 * 	CmmBaseParamFORM信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-17]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-17|jianana|新增|CmmBaseParamResponseFormDto新增
 */
@DrptDto(dtonm = "CmmBaseParamFORM信息数据传输对象",dtodrpt="CmmBaseParamFORM信息数据传输对象")
public class CmmBaseParamResponseFormDto extends ResponseBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 3572207393258200757L;
	@DrptField(fieldnm="CmmBaseParam对象",fielddrpt="CmmBaseParam对象")
	private CmmBaseParamDto resultData;
	
	public CmmBaseParamDto getResultData() {
		return resultData;
	}
	public void setResultData(CmmBaseParamDto resultData) {
		this.resultData = resultData;
	}
	
}
