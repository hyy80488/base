/**   
* @Title: SearchProductInfo.java 
* @Package com.jw.common.framework.m5300.f010.dto.ProductInfo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月3日 下午3:52:14 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.ProductInfo;


/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月3日]
 * @package com.jw.common.framework.m5300.f010.dto.ProductInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月3日|tianpei|新增|SearchProductInfo.java新增
*/
public class SearchProductInfo {

	/**厂商房型代码**/
	private String roomTypeCode;
	
	/**厂商价格代码**/
	private String ratePlanCode;

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public String getRatePlanCode() {
		return ratePlanCode;
	}

	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}
	
	
}
