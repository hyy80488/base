/**   
* @Title: RoomTypeDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月20日 下午3:03:23 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;


/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|tianpei|新增|RoomTypeDto.java新增
*/
public class RoomTypeDto {

	private String roomTypeCode;
	
	private String roomId;

	private String roomTab;
	
	public RoomTypeDto(String roomTypeCode, String roomId, String roomTab) {
		super();
		this.roomTypeCode = roomTypeCode;
		this.roomId = roomId;
		this.roomTab = roomTab;
	}

	public RoomTypeDto() {
		super();
	}


	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomTab() {
		return roomTab;
	}

	public void setRoomTab(String roomTab) {
		this.roomTab = roomTab;
	}

	/** 
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @return
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((roomTab == null) ? 0 : roomTab.hashCode());
		result = prime * result + ((roomTypeCode == null) ? 0 : roomTypeCode.hashCode());
		return result;
	}

	/** 
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @param obj
	 * @return
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomTypeDto other = (RoomTypeDto) obj;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (roomTab == null) {
			if (other.roomTab != null)
				return false;
		} else if (!roomTab.equals(other.roomTab))
			return false;
		if (roomTypeCode == null) {
			if (other.roomTypeCode != null)
				return false;
		} else if (!roomTypeCode.equals(other.roomTypeCode))
			return false;
		return true;
	}
}
