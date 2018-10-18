/**   
* @Title: OrderApplyPaymentDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月21日 下午9:27:56 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;

import java.math.BigDecimal;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月21日]
 * @package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月21日|tianpei|新增|OrderApplyPaymentDto.java新增
*/
public class OrderApplyPaymentDto {

	private String htlConfirmNo;
	
	private BigDecimal otherCost;
	
	private String arriveTime;
	
	private String departureTime;
	
	private String roomNo;
	
	private String clientName;
	
	private String checkedOutStatus;

	public String getHtlConfirmNo() {
		return htlConfirmNo;
	}

	public void setHtlConfirmNo(String htlConfirmNo) {
		this.htlConfirmNo = htlConfirmNo;
	}

	public BigDecimal getOtherCost() {
		return otherCost;
	}

	public void setOtherCost(BigDecimal otherCost) {
		this.otherCost = otherCost;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCheckedOutStatus() {
		return checkedOutStatus;
	}

	public void setCheckedOutStatus(String checkedOutStatus) {
		this.checkedOutStatus = checkedOutStatus;
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
		result = prime * result + ((arriveTime == null) ? 0 : arriveTime.hashCode());
		result = prime * result + ((checkedOutStatus == null) ? 0 : checkedOutStatus.hashCode());
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((htlConfirmNo == null) ? 0 : htlConfirmNo.hashCode());
		result = prime * result + ((otherCost == null) ? 0 : otherCost.hashCode());
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
		OrderApplyPaymentDto other = (OrderApplyPaymentDto) obj;
		if (arriveTime == null) {
			if (other.arriveTime != null)
				return false;
		} else if (!arriveTime.equals(other.arriveTime))
			return false;
		if (checkedOutStatus == null) {
			if (other.checkedOutStatus != null)
				return false;
		} else if (!checkedOutStatus.equals(other.checkedOutStatus))
			return false;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (htlConfirmNo == null) {
			if (other.htlConfirmNo != null)
				return false;
		} else if (!htlConfirmNo.equals(other.htlConfirmNo))
			return false;
		if (otherCost == null) {
			if (other.otherCost != null)
				return false;
		} else if (!otherCost.equals(other.otherCost))
			return false;
		if (roomNo == null) {
			if (other.roomNo != null)
				return false;
		} else if (!roomNo.equals(other.roomNo))
			return false;
		return true;
	}
	
}
