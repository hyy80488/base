/**   
* @Title: OrderCheckInNoticeRequestDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月21日 下午9:22:24 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;

import java.io.Serializable;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月21日]
 * @package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月21日|tianpei|新增|OrderCheckInNoticeRequestDto.java新增
*/
public class OrderCheckInNoticeRequestDto extends RequestBaseDto implements Serializable {

	private static final long serialVersionUID = 1506652395461204369L;

	private String orderId;
	
	private String hotelId;
	
	private String reqUrl;
	
	private Integer ifId;
	
	private Integer syschannelId;
	
	private Set<OrderCheckInInfoDto> orderCheckInInfoList;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public Set<OrderCheckInInfoDto> getOrderCheckInInfoList() {
		return orderCheckInInfoList;
	}

	public void setOrderCheckInInfoList(Set<OrderCheckInInfoDto> orderCheckInInfoList) {
		this.orderCheckInInfoList = orderCheckInInfoList;
	}

	public String getReqUrl() {
		return reqUrl;
	}

	public void setReqUrl(String reqUrl) {
		this.reqUrl = reqUrl;
	}

	public Integer getIfId() {
		return ifId;
	}

	public void setIfId(Integer ifId) {
		this.ifId = ifId;
	}

	public Integer getSyschannelId() {
		return syschannelId;
	}

	public void setSyschannelId(Integer syschannelId) {
		this.syschannelId = syschannelId;
	}
	
}
