
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
 * 	制卡日志表FORM信息数据传输对象
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-08-29]
 * @package com.jw.hms.cmm.m3102.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-08-29|zhangteng|新增|LogCardkeyInfoResponseFormDto新增
 */
@DrptDto(dtonm = "制卡日志表FORM信息数据传输对象",dtodrpt="制卡日志表FORM信息数据传输对象")
public class LogCardkeyInfoResponseFormDto extends ResponseBaseDto implements java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4514292281625616362L;
	@DrptField(fieldnm="resultData",fielddrpt="制卡日志表返回值")
	private LogCardkeyInfoDto resultData;
	
	public LogCardkeyInfoDto getResultData() {
		return resultData;
	}
	public void setResultData(LogCardkeyInfoDto resultData) {
		this.resultData = resultData;
	}
	
}
