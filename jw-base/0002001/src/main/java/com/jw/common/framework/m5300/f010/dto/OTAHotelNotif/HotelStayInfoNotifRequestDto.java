/**   
* @Title: HotelStayInfoNotifRequestDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月20日 下午1:33:48 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|tianpei|新增|HotelStayInfoNotifRequestDto.java新增
*/
public class HotelStayInfoNotifRequestDto  extends RequestBaseDto implements Serializable  {

	private static final long serialVersionUID = -8488854535774083602L;

	private List<StayInfoDto> stayInfos;
	
	private String reqUrl;

	private Integer ifId;
	
	private Integer syschannelId;
	
	private String hotelCode;
	
	public List<StayInfoDto> getStayInfos() {
		return stayInfos;
	}

	public void setStayInfos(List<StayInfoDto> stayInfos) {
		this.stayInfos = stayInfos;
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

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	
}
