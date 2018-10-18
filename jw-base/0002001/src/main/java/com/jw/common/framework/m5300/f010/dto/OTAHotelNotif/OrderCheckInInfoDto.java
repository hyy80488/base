/**   
* @Title: OrderCheckInInfoDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月21日 下午9:23:35 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;


/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月21日]
 * @package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月21日|tianpei|新增|OrderCheckInInfoDto.java新增
*/
public class OrderCheckInInfoDto {

	private String htlConfirmNo;
	
	private String checkInStatus;
	
	private String roomNo;

	public String getHtlConfirmNo() {
		return htlConfirmNo;
	}

	public void setHtlConfirmNo(String htlConfirmNo) {
		this.htlConfirmNo = htlConfirmNo;
	}

	public String getCheckInStatus() {
		return checkInStatus;
	}

	public void setCheckInStatus(String checkInStatus) {
		this.checkInStatus = checkInStatus;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
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
		result = prime * result + ((checkInStatus == null) ? 0 : checkInStatus.hashCode());
		result = prime * result + ((htlConfirmNo == null) ? 0 : htlConfirmNo.hashCode());
		result = prime * result + ((roomNo == null) ? 0 : roomNo.hashCode());
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
		OrderCheckInInfoDto other = (OrderCheckInInfoDto) obj;
		if (checkInStatus == null) {
			if (other.checkInStatus != null)
				return false;
		} else if (!checkInStatus.equals(other.checkInStatus))
			return false;
		if (htlConfirmNo == null) {
			if (other.htlConfirmNo != null)
				return false;
		} else if (!htlConfirmNo.equals(other.htlConfirmNo))
			return false;
		if (roomNo == null) {
			if (other.roomNo != null)
				return false;
		} else if (!roomNo.equals(other.roomNo))
			return false;
		return true;
	}
}
