/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5300.f010.dto.GetRoomProductInfo;

import java.io.Serializable;

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
public class RoomProductInfoDto implements Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -9209589581322753096L;
	/**携程子酒店 ID**/
	private String subHotelId;
	/**携程子房型 ID**/
	private String subRoomId;
	/**携程早餐数**/
	private String breakfast;
	/**携程支付类型  501-预付、16-现付**/
	private String balanceType;
	/**携程房型名称**/
	private String subRoomName;
	/**厂商房型编号**/
	private String pmsRoomTypeCode;
	/**厂商房型名称**/
	private String pmsRoomName;
	/**厂商酒店代码**/
	private String pmsHotelCode;
	/**厂商房价代码**/
	private String pmsRatePlanCode;
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
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getBalanceType() {
		return balanceType;
	}
	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}
	public String getSubRoomName() {
		return subRoomName;
	}
	public void setSubRoomName(String subRoomName) {
		this.subRoomName = subRoomName;
	}
	public String getPmsRoomTypeCode() {
		return pmsRoomTypeCode;
	}
	public void setPmsRoomTypeCode(String pmsRoomTypeCode) {
		this.pmsRoomTypeCode = pmsRoomTypeCode;
	}
	public String getPmsRoomName() {
		return pmsRoomName;
	}
	public void setPmsRoomName(String pmsRoomName) {
		this.pmsRoomName = pmsRoomName;
	}
	public String getPmsHotelCode() {
		return pmsHotelCode;
	}
	public void setPmsHotelCode(String pmsHotelCode) {
		this.pmsHotelCode = pmsHotelCode;
	}
	public String getPmsRatePlanCode() {
		return pmsRatePlanCode;
	}
	public void setPmsRatePlanCode(String pmsRatePlanCode) {
		this.pmsRatePlanCode = pmsRatePlanCode;
	}
	
}
