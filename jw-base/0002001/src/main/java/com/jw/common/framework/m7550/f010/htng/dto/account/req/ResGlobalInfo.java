//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.29 时间 05:16:03 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.account.req;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}InterFaceSendID"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OrderType"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}IsFlashLive"/>
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
    "interFaceSendID",
    "orderType",
    "isFlashLive",
    "depositAmount",
    "memberType",
    "memberCard"
})
@XmlRootElement(name = "ResGlobalInfo")
public class ResGlobalInfo {

    @XmlElement(name = "HotelReservationIDs", required = true)
    protected HotelReservationIDs hotelReservationIDs;
    @XmlElement(name = "InterFaceSendID", required = true)
    protected BigInteger interFaceSendID;
    @XmlElement(name = "OrderType", required = true)
    protected String orderType;
    @XmlElement(name = "IsFlashLive", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String isFlashLive;
    @XmlElement(name = "MemberType", required = true)
    protected String memberType;
    @XmlElement(name = "MemberCard", required = true)
    protected String memberCard;
    @XmlElement(name = "DepositAmount", required = true)
    protected BigDecimal depositAmount;

    /**
     * 获取hotelReservationIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationIDs }
     *     
     */
    public HotelReservationIDs getHotelReservationIDs() {
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
     * 获取interFaceSendID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInterFaceSendID() {
        return interFaceSendID;
    }

    /**
     * 设置interFaceSendID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInterFaceSendID(BigInteger value) {
        this.interFaceSendID = value;
    }

    /**
     * 获取orderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置orderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * 获取isFlashLive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFlashLive() {
        return isFlashLive;
    }

    /**
     * 设置isFlashLive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFlashLive(String value) {
        this.isFlashLive = value;
    }
    
    /**
     * 获取memberType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * 设置memberType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberType(String value) {
        this.memberType = value;
    }

    /**
     * 获取memberCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getMemberCard() {
        return memberCard;
    }

    /**
     * 设置memberCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemberCard(String value) {
        this.memberCard = value;
    }
    
    /**
     * 获取depositAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    /**
     * 设置depositAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmount(BigDecimal value) {
        this.depositAmount = value;
    }

}
