/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
/**
 * ## 类说明：
 * 	共通返回值
 * @author    [jianana]   
 * @version   [V1.0, 2017年11月4日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年11月4日|jianana|新增|CommonResultDataDto.java新增
 */
@DrptDto(dtonm = "共通返回值",dtodrpt="共通返回值")
public class CommonResultDataDto  extends ResponseBaseDto implements java.io.Serializable{
	
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 1201870241852075677L;
	@DrptField(fieldnm="resultData",fielddrpt="返回值")
	private Object resultData;
	public Object getResultData() {
		return resultData;
	}
	public void setResultData(Object resultData) {
		this.resultData = resultData;
	}

}
