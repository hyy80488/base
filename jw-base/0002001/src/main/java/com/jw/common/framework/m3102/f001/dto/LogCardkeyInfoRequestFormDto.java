
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3102.f001.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.common.framework.m0002.f001.dto.api.LogOrigin;

/**
 * ## 类说明：
 * 	制卡日志表FORM信息数据传输对象
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-08-29]
 * @package com.jw.hms.cmm.m3102.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-08-29|zhangteng|新增|LogCardkeyInfoRequestFormDto新增
 */
@DrptDto(dtonm = "制卡日志表FORM信息数据传输对象",dtodrpt="制卡日志表FORM信息数据传输对象")
public class LogCardkeyInfoRequestFormDto extends RequestBaseDto implements LogOrigin<LogCardkeyInfoDto,LogCardkeyInfoDto>, java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2057720223824723765L;
	@DrptField(fieldnm="submitData",fielddrpt="制卡日志表新值")
	private LogCardkeyInfoDto submitData;
	
	@DrptField(fieldnm="originData",fielddrpt="制卡日志表原值")
	private LogCardkeyInfoDto originData;
	
	@Override
	public LogCardkeyInfoDto getSubmitData() {
		return submitData;
	}
	
	@Override
	public void setSubmitData(LogCardkeyInfoDto submitData) {
		this.submitData = submitData;
	}
	
	@Override
	public LogCardkeyInfoDto getOriginData() {
		return originData;
	}

	@Override
	public void setOriginData(LogCardkeyInfoDto originData) {
		this.originData = originData;
	}
	
}
