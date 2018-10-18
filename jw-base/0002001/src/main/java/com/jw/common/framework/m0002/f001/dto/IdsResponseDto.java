/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
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
public class IdsResponseDto  extends ResponseBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -2376329563172419300L;
	
	private List<Integer> pkIds;

	public List<Integer> getPkIds() {
		return pkIds;
	}

	public void setPkIds(List<Integer> pkIds) {
		this.pkIds = pkIds;
	}
	
	

}
