/**   
* @Title: CrsChnlMapReqDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.channel 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月23日 下午8:25:59 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.channel;

import java.io.Serializable;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月23日]
 * @package com.jw.common.framework.m3550.f010.dto.channel
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月23日|tianpei|新增|CrsChnlMapReqDto.java新增
*/
public class CrsChnlMapReqDto extends RequestBaseDto implements Serializable {

	private static final long serialVersionUID = -7847129004787444938L;

	private Set<CrsChnlMapDto> crsChnlMapDtoSet;
	
	private String hotelCode;

	public Set<CrsChnlMapDto> getCrsChnlMapDtoSet() {
		return crsChnlMapDtoSet;
	}

	public void setCrsChnlMapDtoSet(Set<CrsChnlMapDto> crsChnlMapDtoSet) {
		this.crsChnlMapDtoSet = crsChnlMapDtoSet;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	
}
