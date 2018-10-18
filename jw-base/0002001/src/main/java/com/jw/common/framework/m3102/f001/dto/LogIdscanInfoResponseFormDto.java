
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3102.f001.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	证件扫描信息表FORM信息数据传输对象
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-08-29]
 * @package com.jw.hms.cmm.m3102.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-08-29|zhangteng|新增|LogIdscanInfoResponseFormDto新增
 */
@DrptDto(dtonm = "证件扫描信息表FORM信息数据传输对象",dtodrpt="证件扫描信息表FORM信息数据传输对象")
public class LogIdscanInfoResponseFormDto extends ResponseBaseDto implements java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1754384911371125768L;
	
	@DrptField(fieldnm="resultData",fielddrpt="证件扫描信息表返回值")
	private LogIdscanInfoComDto resultData;

	public LogIdscanInfoComDto getResultData() {
		return resultData;
	}

	public void setResultData(LogIdscanInfoComDto resultData) {
		this.resultData = resultData;
	}
	
	
}
