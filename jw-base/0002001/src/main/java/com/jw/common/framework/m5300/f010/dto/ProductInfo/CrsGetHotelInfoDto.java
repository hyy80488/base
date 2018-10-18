
package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import java.io.Serializable;

public class CrsGetHotelInfoDto implements Serializable{

	
    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7588131286880760434L;
	protected int totalPage;
    protected int totalNum;
    protected ArrayOfSubHotelInfo hotelInfos;


    /**
     * 获取totalPage属性的值。
     * 
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * 设置totalPage属性的值。
     * 
     */
    public void setTotalPage(int value) {
        this.totalPage = value;
    }

    /**
     * 获取totalNum属性的值。
     * 
     */
    public int getTotalNum() {
        return totalNum;
    }

    /**
     * 设置totalNum属性的值。
     * 
     */
    public void setTotalNum(int value) {
        this.totalNum = value;
    }

    /**
     * 获取hotelInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubHotelInfo }
     *     
     */
    public ArrayOfSubHotelInfo getHotelInfos() {
        return hotelInfos;
    }

    /**
     * 设置hotelInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubHotelInfo }
     *     
     */
    public void setHotelInfos(ArrayOfSubHotelInfo value) {
        this.hotelInfos = value;
    }

}
