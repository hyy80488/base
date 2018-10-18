/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	渠道入参
 * @author    [jianana]   
 * @version   [V1.0, 2018年4月19日]
 * @package com.jw.common.framework.m1410.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年4月19日|jianana|新增|GrpUnitRequestDto.java新增
 */
@DrptDto(dtonm = "ChannelRequestDto",dtodrpt="渠道入参")
public class ChannelRequestDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 6777463521312035719L;
	@DrptField(fieldnm="channelNos", fielddrpt="集合")
	private List<String> channelNos;
	public List<String> getChannelNos() {
		return channelNos;
	}
	public void setChannelNos(List<String> channelNos) {
		this.channelNos = channelNos;
	}
}
