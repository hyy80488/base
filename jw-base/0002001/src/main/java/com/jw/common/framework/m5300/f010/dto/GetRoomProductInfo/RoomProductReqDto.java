/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5300.f010.dto.GetRoomProductInfo;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	获取携程产品信息
 * @author    [jianana]   
 * @version   [V1.0, 2018年8月1日]
 * @package com.jw.common.framework.m5300.f010.dto.GetRoomProductInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月1日|jianana|新增|RoomProductInfoDto.java新增
 */
public class RoomProductReqDto extends RequestBaseDto implements Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -9209589581322753096L;
	/**携程子酒店 ID  多个请用”,”分割，最多不超过 5 个**/
	private List<String> subHotelIds;
	/**请求类型  Mapping=匹配， Unmapping=未匹配**/
	private String type;
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
	public List<String> getSubHotelIds() {
		return subHotelIds;
	}
	public void setSubHotelIds(List<String> subHotelIds) {
		this.subHotelIds = subHotelIds;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
