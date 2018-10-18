/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	直销字典返回
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2017年1月9日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since 日期|作者|类型|内容
 * :----|:-----|:-----|:-----
 * 2017年1月9日|MiaoDaZhuang|新增|ResponseDictionaryDto.java新增
*/
@DrptDto(dtonm = "ResponseDirectDictionaryDto", dtodrpt = "根据请求的字典dto，返回对应的字典值")
public class ResponseDirectDictionaryDto extends ResponseBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 9196742029989099226L;

	@DrptField(fieldnm = "result", fielddrpt = "根据查询数据，返回字典dto")
	private Map<String, List<Map<String, Object>>> result;

	public Map<String, List<Map<String, Object>>> getResult() {
		return result;
	}

	public void setResult(Map<String, List<Map<String, Object>>> result) {
		this.result = result;
	}

	
}
