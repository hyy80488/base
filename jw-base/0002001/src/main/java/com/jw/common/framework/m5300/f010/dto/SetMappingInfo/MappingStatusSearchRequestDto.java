/**   
* @Title: MappingStatusSearchDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.SetMappingInfo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月3日 下午3:48:45 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.SetMappingInfo;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.common.framework.m5300.f010.dto.ProductInfo.SearchProductInfo;

/**
 * ## 类说明：
 * 	产品审核结果查询
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月3日]
 * @package com.jw.common.framework.m5300.f010.dto.SetMappingInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月3日|tianpei|新增|MappingStatusSearchDto.java新增
*/
public class MappingStatusSearchRequestDto extends RequestBaseDto implements Serializable {

	private static final long serialVersionUID = 4119604170417944811L;
	
	/** 厂商酒店代码**/
	private String hotelCode;
	
	/** 携程子酒店ID**/
	private String subHotelId;
	
	/** 厂商产品信息**/
	private List<SearchProductInfo> searchProductInfos;
	
	private Integer sysChannelId;
	
	private String reqUrl;
	private Integer ifsvcverId;

	
	public Integer getIfsvcverId() {
		return ifsvcverId;
	}

	public void setIfsvcverId(Integer ifsvcverId) {
		this.ifsvcverId = ifsvcverId;
	}

	public String getReqUrl() {
		return reqUrl;
	}

	public void setReqUrl(String reqUrl) {
		this.reqUrl = reqUrl;
	}

	public Integer getSysChannelId() {
		return sysChannelId;
	}

	public void setSysChannelId(Integer sysChannelId) {
		this.sysChannelId = sysChannelId;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getSubHotelId() {
		return subHotelId;
	}

	public void setSubHotelId(String subHotelId) {
		this.subHotelId = subHotelId;
	}

	public List<SearchProductInfo> getSearchProductInfos() {
		return searchProductInfos;
	}

	public void setSearchProductInfos(List<SearchProductInfo> searchProductInfos) {
		this.searchProductInfos = searchProductInfos;
	}
	
}
