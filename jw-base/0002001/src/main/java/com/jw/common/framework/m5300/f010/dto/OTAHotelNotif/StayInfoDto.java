/**   
* @Title: StayInfoDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月20日 下午2:41:05 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;

import java.util.List;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|tianpei|新增|StayInfoDto.java新增
*/
public class StayInfoDto {

	/** 订单审核状态**/
	private String resStatus;

	private List<RoomStayDto> roomStays;
	
	private List<CustomerDto> resGuests;
	
	private List<HotelReservationIDDto> hotelReservationIDs;

	public String getResStatus() {
		return resStatus;
	}

	public void setResStatus(String resStatus) {
		this.resStatus = resStatus;
	}

	public List<RoomStayDto> getRoomStays() {
		return roomStays;
	}

	public void setRoomStays(List<RoomStayDto> roomStays) {
		this.roomStays = roomStays;
	}

	public List<CustomerDto> getResGuests() {
		return resGuests;
	}

	public void setResGuests(List<CustomerDto> customers) {
		this.resGuests = customers;
	}

	public List<HotelReservationIDDto> getHotelReservationIDs() {
		return hotelReservationIDs;
	}

	public void setHotelReservationIDs(List<HotelReservationIDDto> hotelReservationIDs) {
		this.hotelReservationIDs = hotelReservationIDs;
	}
	
}
