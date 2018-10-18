/**   
* @Title: OrderApplyPaymentRequestDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月21日 下午9:27:09 
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
2018年8月21日|tianpei|新增|OrderApplyPaymentRequestDto.java新增
*/
public class OrderApplyPaymentRequestDto extends RequestBaseDto implements Serializable {

	private static final long serialVersionUID = 7695935868805013844L;

	private String orderId;
	
	private String hotelId;
	
	private String reqUrl;
	
	private Integer ifId;
	
	private Set<OrderApplyPaymentDto> orderApplyPaymentRequests;
	
	private Integer syschannelId;

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

	public String getReqUrl() {
		return reqUrl;
	}

	public void setReqUrl(String reqUrl) {
		this.reqUrl = reqUrl;
	}

	public Set<OrderApplyPaymentDto> getOrderApplyPaymentRequests() {
		return orderApplyPaymentRequests;
	}

	public void setOrderApplyPaymentRequests(Set<OrderApplyPaymentDto> orderApplyPaymentRequests) {
		this.orderApplyPaymentRequests = orderApplyPaymentRequests;
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
