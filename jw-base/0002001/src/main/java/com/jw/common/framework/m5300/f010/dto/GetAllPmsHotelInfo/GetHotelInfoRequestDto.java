
package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo;

import java.io.Serializable;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class GetHotelInfoRequestDto extends RequestBaseDto implements Serializable{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2356785293972018200L;
	protected String hotelGroupCode;
    protected Integer currentPage;
    protected String brand;
    protected String supplierId;
    private String url;
    private Integer sysChannelId;
    
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
     * 获取hotelGroupCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelGroupCode() {
        return hotelGroupCode;
    }

    /**
     * 设置hotelGroupCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelGroupCode(String value) {
        this.hotelGroupCode = value;
    }

    /**
     * 获取currentPage属性的值。
     * 
     */

    /**
     * 获取brand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
     * 设置brand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * 获取supplierId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * 设置supplierId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierId(String value) {
        this.supplierId = value;
    }

	public Integer getSysChannelId() {
		return sysChannelId;
	}

	public void setSysChannelId(Integer sysChannelId) {
		this.sysChannelId = sysChannelId;
	}

}
