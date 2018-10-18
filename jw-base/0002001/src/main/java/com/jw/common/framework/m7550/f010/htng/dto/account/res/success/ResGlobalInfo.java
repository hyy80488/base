//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:57:00 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.account.res.success;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDs"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OrderStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelReservationIDs",
    "orderStatus"
})
@XmlRootElement(name = "ResGlobalInfo")
public class ResGlobalInfo {

    @XmlElement(name = "HotelReservationIDs", required = true)
    protected HotelReservationIDs hotelReservationIDs;
    @XmlElement(name = "OrderStatus", required = true)
    protected String orderStatus;

    /**
     * 获取hotelReservationIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationIDs }
     *     
     */
    public HotelReservationIDs getHotelReservationIDs() {
    	if(hotelReservationIDs == null){
    		hotelReservationIDs = new HotelReservationIDs();
    	}
        return hotelReservationIDs;
    }

    /**
     * 设置hotelReservationIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationIDs }
     *     
     */
    public void setHotelReservationIDs(HotelReservationIDs value) {
        this.hotelReservationIDs = value;
    }

    /**
     * 获取orderStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置orderStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

}
