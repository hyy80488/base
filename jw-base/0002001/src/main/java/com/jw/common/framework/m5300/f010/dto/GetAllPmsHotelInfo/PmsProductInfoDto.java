/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo;

import java.io.Serializable;
/**
 * ## 类说明：
 * 	PMS 产品列表
 * @author    [jianana]   
 * @version   [V1.0, 2018年8月1日]
 * @package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月1日|jianana|新增|PmsProductInfoDto.java新增
 */
public class PmsProductInfoDto implements Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 245392574771631311L;
	private Integer roomTypId;
	/**Y	厂商房型代码**/
	private String roomTypeCode;
	/**Y	厂商房型名称**/
	private String roomTypeName;
	private Integer rateId;
	/**Y	厂商价格代码**/
	private String ratePlanCode;
	/**Y	厂商价格名称**/
	private String ratePlanName;
	/**Y	现预付类型 501-预付、16-现付**/
	private String balanceType;
	/**Y	渠道 携程：CTRIP；艺龙：ELONG；去哪儿：QUNAR；赫程：EASYTRIP，同程：LY**/
	private String channel;
	/**Y	产品类型 0-正价，1-活动（不传默认正价）**/
	private String poductType;
	/**Y	早餐数**/
	private String numberOfBreakfast;
	/**Y	提前预订天数**/
	private String bookingAdvance;
	
	public Integer getRoomTypId() {
		return roomTypId;
	}
	public void setRoomTypId(Integer roomTypId) {
		this.roomTypId = roomTypId;
	}
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public String getRoomTypeCode() {
		return roomTypeCode;
	}
	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}
	public String getRatePlanCode() {
		return ratePlanCode;
	}
	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}
	public String getRatePlanName() {
		return ratePlanName;
	}
	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}
	public String getBalanceType() {
		return balanceType;
	}
	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getPoductType() {
		return poductType;
	}
	public void setPoductType(String poductType) {
		this.poductType = poductType;
	}
	public String getNumberOfBreakfast() {
		return numberOfBreakfast;
	}
	public void setNumberOfBreakfast(String numberOfBreakfast) {
		this.numberOfBreakfast = numberOfBreakfast;
	}
	public String getBookingAdvance() {
		return bookingAdvance;
	}
	public void setBookingAdvance(String bookingAdvance) {
		this.bookingAdvance = bookingAdvance;
	}
	
}
