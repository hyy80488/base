/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
/**
 * ## 类说明：
 * 	EsLogOperate查询返回集合
 * @author    [liubowen]   
 * @version   [V1.0, 2017/10/06]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017/10/06|liubowen|新增|EsLogOperateResponseDto.java新增
 */
@DrptDto(dtonm = "EsLogOperateResponseDto", dtodrpt = "EsLogOperate查询返回集合")
public class EsLogOperateResponseDto  extends ResponseBaseDto implements java.io.Serializable{

	private static final long serialVersionUID = 808359071338235940L;

	@DrptField(fieldnm = "esId", fielddrpt = "esId")
	private List<EsLogOperateDomainDto> logOperatelist;

	public List<EsLogOperateDomainDto> getLogOperatelist() {
		return logOperatelist;
	}

	public void setLogOperatelist(List<EsLogOperateDomainDto> logOperatelist) {
		this.logOperatelist = logOperatelist;
	}
	
}
