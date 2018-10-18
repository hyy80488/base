/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	房量推送(ARI规则)
 * @author    [lilin]   
 * @version   [V1.0, 2018年8月6日]
 * @package com.jw.common.framework.m5300.f010.dto.HotelInvCountNotifRequestDto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月6日|lilin|新增|HotelInvCountNotifRequestDto.java新增 	**/
public class HotelInvCountNotifRequestDto extends RequestBaseDto implements Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5813356793836600881L;
	private List<HotelInvCountNotifInfoDto> infos;
	/**PMS 酒店代码**/
	private String hotelCode;
	/**PMS 酒店Uid**/
	private String unitUid;
	/**系统渠道**/
	private Integer sysChannelId;
	/**接口版本号**/
	private Integer ifsvcverId;
	
	public List<HotelInvCountNotifInfoDto> getInfos() {
		return infos;
	}
	public void setInfos(List<HotelInvCountNotifInfoDto> infos) {
		this.infos = infos;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public Integer getSysChannelId() {
		return sysChannelId;
	}
	public void setSysChannelId(Integer sysChannelId) {
		this.sysChannelId = sysChannelId;
	}
	public Integer getIfsvcverId() {
		return ifsvcverId;
	}
	public void setIfsvcverId(Integer ifsvcverId) {
		this.ifsvcverId = ifsvcverId;
	}
	
	
}
