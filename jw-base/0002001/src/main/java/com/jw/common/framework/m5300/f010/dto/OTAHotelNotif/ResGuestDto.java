/**   
* @Title: ResGuestDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月20日 下午3:04:43 
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
2018年8月20日|tianpei|新增|ResGuestDto.java新增
*/
public class ResGuestDto {
//
//	private List<ProfileDto> profiles;
//
//	public List<ProfileDto> getProfiles() {
//		return profiles;
//	}
//
//	public void setProfiles(List<ProfileDto> profiles) {
//		this.profiles = profiles;
//	}
//	
	private List<CustomerDto> customers;

	public List<CustomerDto> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerDto> customers) {
		this.customers = customers;
	}
	
}
