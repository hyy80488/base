/**   
* @Title: HotelReservationIDDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月20日 下午3:11:40 
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
2018年8月20日|tianpei|新增|HotelReservationIDDto.java新增
*/
public class HotelReservationIDDto {

	/** 订单编号类别**/
	private String resID_Type;
	
	/** 订单号值**/
	private String resID_Value;

	public HotelReservationIDDto(String resID_Type, String resID_Value) {
		super();
		this.resID_Type = resID_Type;
		this.resID_Value = resID_Value;
	}

	public HotelReservationIDDto() {
		super();
	}

	public String getResID_Type() {
		return resID_Type;
	}

	public void setResID_Type(String resID_Type) {
		this.resID_Type = resID_Type;
	}

	public String getResID_Value() {
		return resID_Value;
	}

	public void setResID_Value(String resID_Value) {
		this.resID_Value = resID_Value;
	}
	
}
