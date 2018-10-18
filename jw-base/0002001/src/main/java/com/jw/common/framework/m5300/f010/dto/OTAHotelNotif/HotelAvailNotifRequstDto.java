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
 * 	描述
 * @author    [lilin]   
 * @version   [V1.0, 2018年8月7日]
 * @package com.jw.common.framework.m5300.f010.dto.HotelAvailNotifRequstDto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月7日|lilin|新增|HotelAvailNotifRequstDto.java新增
*/
public class HotelAvailNotifRequstDto extends RequestBaseDto implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -3222913514551837313L;
	
	private List<HotelAvailNotifInfoDto> infos;
	/**PMS 酒店代码**/
	private String hotelCode;
	/**PMS 酒店Uid**/
	private String unitUid;
	/**系统渠道**/
	private Integer sysChannelId;
	/**接口版本号**/
	private Integer ifsvcverId;
	
	public List<HotelAvailNotifInfoDto> getInfos() {
		return infos;
	}
	public void setInfos(List<HotelAvailNotifInfoDto> infos) {
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
