/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;

/**
 * 
 * ## 类说明：
 * 	开关信息请求dto
 * @author    [guoc]   
 * @version   [V1.0, 2017年3月14日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月14日|guoc|新增|RequestOptionDto.java新增
 */
public class RequestOptionDto extends RequestBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID 
	*/ 
	private static final long serialVersionUID = -8813963767883535016L;
	
	/** 单位unitUid */
	private String unitUid;
	/** 开关代码List */
	private List<String> optionCds;
	
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public List<String> getOptionCds() {
		return optionCds;
	}
	public void setOptionCds(List<String> optionCds) {
		this.optionCds = optionCds;
	}

}
