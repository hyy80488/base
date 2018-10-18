/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5300.f010.dto.SetMappingInfo;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	设置 Mapping 关系
 * @author    [jianana]   
 * @version   [V1.0, 2018年8月2日]
 * @package com.jw.common.framework.m5300.f010.dto.SetMappingInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月2日|jianana|新增|SetMappingReqDto.java新增
 */
public class SetMappingReqDto extends RequestBaseDto implements Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 6601646727860434041L;
	/** 厂商酒店代码 多个请用”,”分割，最多不超过 5 个**/
	private List<String> hotelCodes;
	/** 厂商房型代码 Mapping=匹配， Unmapping=未匹配**/
	private String roomTypeCode;
	/** 厂商价格代码**/
	private String ratePlanCode;
	/** 厂商路由组代码501-预付、16-现付 传多个子酒店时，需要相同的支付类型**/
	private String HotelGroupCode;
	/** 携程母酒店 ID**/
	private String masterHotelId;
	/** 携程子酒店代码**/
	private String subHotelId;
	/** 携程子房型代码**/
	private String subRoomId;
	/**设置类型 1-新增,0-删除**/
	private Integer setType;
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

	public List<String> getHotelCodes() {
		return hotelCodes;
	}
	public void setHotelCodes(List<String> hotelCodes) {
		this.hotelCodes = hotelCodes;
	}
	public String getRoomTypeCode() {
		return roomTypeCode;
	}
	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}
	public String getRatePlanCode() {
		return ratePlanCode;
	}
	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}
	public String getHotelGroupCode() {
		return HotelGroupCode;
	}
	public void setHotelGroupCode(String hotelGroupCode) {
		HotelGroupCode = hotelGroupCode;
	}
	public String getMasterHotelId() {
		return masterHotelId;
	}
	public void setMasterHotelId(String masterHotelId) {
		this.masterHotelId = masterHotelId;
	}
	public String getSubHotelId() {
		return subHotelId;
	}
	public void setSubHotelId(String subHotelId) {
		this.subHotelId = subHotelId;
	}
	public String getSubRoomId() {
		return subRoomId;
	}
	public void setSubRoomId(String subRoomId) {
		this.subRoomId = subRoomId;
	}
	public Integer getSetType() {
		return setType;
	}
	public void setSetType(Integer setType) {
		this.setType = setType;
	}
	
}
