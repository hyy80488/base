/**   
* @Title: ProductSearchResultDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.ProductInfo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月3日 下午5:01:23 
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
2018年8月3日|tianpei|新增|ProductSearchResultDto.java新增
*/
public class ProductSearchResultDto {

	/** 厂商房型代码**/
	private String roomTypeCode;
	
	/** 厂商价格代码**/
	private String ratePlanCode;
	
	/** 携程房型ID**/
	private String subRoomId;
	
	/** 匹配结果状态码**/
	private Integer resultCode;
	
	/** 原因**/
	private String resultMsg;

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

	public String getSubRoomId() {
		return subRoomId;
	}

	public void setSubRoomId(String subRoomId) {
		this.subRoomId = subRoomId;
	}

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
}
