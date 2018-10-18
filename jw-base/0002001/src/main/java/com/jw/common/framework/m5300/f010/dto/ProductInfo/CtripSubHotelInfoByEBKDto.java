
package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import java.io.Serializable;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class CtripSubHotelInfoByEBKDto implements Serializable{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1328556646959438413L;
    protected String hotelProperty;
    protected ArrayOfHotelInfo hotelInfos;


    /**
     * 获取hotelProperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelProperty() {
        return hotelProperty;
    }

    /**
     * 设置hotelProperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelProperty(String value) {
        this.hotelProperty = value;
    }

    /**
     * 获取hotelInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfo }
     *     
     */
    public ArrayOfHotelInfo getHotelInfos() {
        return hotelInfos;
    }

    /**
     * 设置hotelInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfo }
     *     
     */
    public void setHotelInfos(ArrayOfHotelInfo value) {
        this.hotelInfos = value;
    }

}
