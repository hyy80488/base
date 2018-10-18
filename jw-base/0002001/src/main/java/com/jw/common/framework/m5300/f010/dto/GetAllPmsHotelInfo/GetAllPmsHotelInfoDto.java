/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	创建酒店与产品
 * @author    [jianana]   
 * @version   [V1.0, 2018年8月1日]
 * @package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月1日|jianana|新增|GetAllPmsHotelInfoDto.java新增
 */
public class GetAllPmsHotelInfoDto extends RequestBaseDto implements Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -4072473416009342985L;
	
	public List<PmsBaseHotelInfoDto> baseHotelInfoDtos;
	private Integer sysChannelId;
	
	private String reqUrl;
	
	private Integer ifsvcverId;

	
	public Integer getIfsvcverId() {
		return ifsvcverId;
	}

	public void setIfsvcverId(Integer ifsvcverId) {
		this.ifsvcverId = ifsvcverId;
	}

	public String getReqUrl() {
		return reqUrl;
	}

	public void setReqUrl(String reqUrl) {
		this.reqUrl = reqUrl;
	}

	public Integer getSysChannelId() {
		return sysChannelId;
	}

	public void setSysChannelId(Integer sysChannelId) {
		this.sysChannelId = sysChannelId;
	}
	public List<PmsBaseHotelInfoDto> getBaseHotelInfoDtos() {
		return baseHotelInfoDtos;
	}

	public void setBaseHotelInfoDtos(List<PmsBaseHotelInfoDto> baseHotelInfoDtos) {
		this.baseHotelInfoDtos = baseHotelInfoDtos;
	}
	

}
