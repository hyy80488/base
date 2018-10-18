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
 * 	Es转换结果dto
 * @author    [liubowen]   
 * @version   [V1.0, 2017/10/06]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017/10/06|liubowen|新增|EsTransformResponseDto.java新增
 */
@DrptDto(dtonm = "EsLogOperateResponseDto", dtodrpt = "EsLogOperate查询返回集合")
public class EsTransformResponseDto  extends ResponseBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5522026496315983046L;
	
	@DrptField(fieldnm = "transformStr", fielddrpt = "transformStr")
	private String transformStr;
	
	@DrptField(fieldnm = "transformKeyStr", fielddrpt = "transformKeyStr")
	private String transformKeyStr;

	/**
	 * @return the transformStr
	 */
	public String getTransformStr() {
		return transformStr;
	}

	/**
	 * @param transformStr the transformStr to set
	 */
	public void setTransformStr(String transformStr) {
		this.transformStr = transformStr;
	}

	/**
	 * @return the transformKeyStr
	 */
	public String getTransformKeyStr() {
		return transformKeyStr;
	}

	/**
	 * @param transformKeyStr the transformKeyStr to set
	 */
	public void setTransformKeyStr(String transformKeyStr) {
		this.transformKeyStr = transformKeyStr;
	}

}
