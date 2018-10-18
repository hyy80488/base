
package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;
import com.jw.common.framework.m5300.f010.dto.ProductInfo.ArrayOfSubHotelInfo;

public class GetHotelInfoResponseDto extends ResponseBaseDto{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7723906808501482732L;
	
	protected int retCode;
    protected String errorMsg;
    protected int totalPage;
    protected int totalNum;
    protected ArrayOfSubHotelInfo hotelInfos;

    /**
     * 获取retCode属性的值。
     * 
     */
    public int getRetCode() {
        return retCode;
    }

    /**
     * 设置retCode属性的值。
     * 
     */
    public void setRetCode(int value) {
        this.retCode = value;
    }

    /**
     * 获取errorMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置errorMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

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
