package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class CtripSubHotelInfoByEBKQueryDto extends RequestBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5412610227748486237L;

	private String name;
    private String password;
    private String url;
    private Integer sysChannelId;
    
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getSysChannelId() {
		return sysChannelId;
	}
	public void setSysChannelId(Integer sysChannelId) {
		this.sysChannelId = sysChannelId;
	}
    
}
