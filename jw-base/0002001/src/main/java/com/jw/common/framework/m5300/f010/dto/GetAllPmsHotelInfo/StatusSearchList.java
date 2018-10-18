/**   
* @Title: StatusSearchList.java 
* @Package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月3日 下午4:54:35 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo;

import java.util.List;

import com.jw.common.framework.m5300.f010.dto.ProductInfo.ProductSearchResultDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月3日]
 * @package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月3日|tianpei|新增|StatusSearchList.java新增
*/
public class StatusSearchList {

	/** 厂商酒店代码**/
	private String hotelCode;
	
	/** 携程母酒店ID**/
	private String masterHotelId;
	
	/** 携程子酒店ID**/
	private String subHotelId;
	
	/** 酒店状态**/
	private Integer hotelStatus;
	
	/** 备注**/
	private String reMark;
	
	private List<ProductSearchResultDto> productSearchResults;

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getMasterHotelId() {
		return masterHotelId;
	}

	public void setMasterHotelId(String masterHotelId) {
		this.masterHotelId = masterHotelId;
	}

	public String getSubHotelId() {
		return subHotelId;
	}

	public void setSubHotelId(String subHotelId) {
		this.subHotelId = subHotelId;
	}

	public Integer getHotelStatus() {
		return hotelStatus;
	}

	public void setHotelStatus(Integer hotelStatus) {
		this.hotelStatus = hotelStatus;
	}

	public String getReMark() {
		return reMark;
	}

	public void setReMark(String reMark) {
		this.reMark = reMark;
	}

	public List<ProductSearchResultDto> getProductSearchResults() {
		return productSearchResults;
	}

	public void setProductSearchResults(List<ProductSearchResultDto> productSearchResults) {
		this.productSearchResults = productSearchResults;
	}
	
}
