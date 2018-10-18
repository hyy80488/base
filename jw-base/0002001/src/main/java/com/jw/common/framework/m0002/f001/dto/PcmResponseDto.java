/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	返回ID集合
 * @author    [jianana]   
 * @version   [V1.0, 2017年5月23日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年5月23日|jianana|新增|IdsResponseDto.java新增
 */
public class PcmResponseDto  extends Oauth2ResponseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 759617214329714922L;

	private String resultBody;

	/**
	 * @return the resultBody
	 */
	public String getResultBody() {
		return resultBody;
	}

	/**
	 * @param resultBody the resultBody to set
	 */
	public void setResultBody(String resultBody) {
		this.resultBody = resultBody;
	}
	
}
