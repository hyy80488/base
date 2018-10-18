/**   
* @Title: HotelStayInfoNotifResponseDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月20日 下午1:35:07 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|tianpei|新增|HotelStayInfoNotifResponseDto.java新增
*/
public class HotelStayInfoNotifResponseDto extends ResponseBaseDto implements Serializable {

	private static final long serialVersionUID = -3026847178081093882L;

	private List<Object> successOrErrors;

	public List<Object> getSuccessOrErrors() {
		return successOrErrors;
	}

	public void setSuccessOrErrors(List<Object> successOrErrors) {
		this.successOrErrors = successOrErrors;
	}
	
}
