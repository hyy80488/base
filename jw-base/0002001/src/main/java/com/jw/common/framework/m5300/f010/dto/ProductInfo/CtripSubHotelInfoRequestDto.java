package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class CtripSubHotelInfoRequestDto extends RequestBaseDto implements java.io.Serializable{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 9104696366635677046L;
	private List<String> masterHotelIds;
	private String url;
	private Integer sysChannelId;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<String> getMasterHotelIds() {
		return masterHotelIds;
	}

	public void setMasterHotelIds(List<String> masterHotelIds) {
		this.masterHotelIds = masterHotelIds;
	}

	public Integer getSysChannelId() {
		return sysChannelId;
	}

	public void setSysChannelId(Integer sysChannelId) {
		this.sysChannelId = sysChannelId;
	}
    
}
