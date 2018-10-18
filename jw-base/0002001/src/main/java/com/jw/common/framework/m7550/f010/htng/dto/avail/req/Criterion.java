//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:48:01 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.avail.req;

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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}HotelRef"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}StayDateRange"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RateRange"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidates"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidates"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MemberType"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}MemberCard"/>
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
    "hotelRef",
    "stayDateRange",
    "rateRange",
    "roomStayCandidates",
    "ratePlanCandidates",
    "memberType",
    "memberCard"
})
@XmlRootElement(name = "Criterion")
public class Criterion {

    @XmlElement(name = "HotelRef", required = true)
    protected HotelRef hotelRef;
    @XmlElement(name = "StayDateRange", required = true)
    protected StayDateRange stayDateRange;
    @XmlElement(name = "RateRange", required = true)
    protected RateRange rateRange;
    @XmlElement(name = "RoomStayCandidates", required = true)
    protected RoomStayCandidates roomStayCandidates;
    @XmlElement(name = "RatePlanCandidates", required = true)
    protected RatePlanCandidates ratePlanCandidates;
    @XmlElement(name = "MemberType", required = true)
    protected BigInteger memberType;
    @XmlElement(name = "MemberCard", required = true)
    protected BigInteger memberCard;

    /**
     * 获取hotelRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRef }
     *     
     */
    public HotelRef getHotelRef() {
        return hotelRef;
    }

    /**
     * 设置hotelRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRef }
     *     
     */
    public void setHotelRef(HotelRef value) {
        this.hotelRef = value;
    }

    /**
     * 获取stayDateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StayDateRange }
     *     
     */
    public StayDateRange getStayDateRange() {
        return stayDateRange;
    }

    /**
     * 设置stayDateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StayDateRange }
     *     
     */
    public void setStayDateRange(StayDateRange value) {
        this.stayDateRange = value;
    }

    /**
     * 获取rateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateRange }
     *     
     */
    public RateRange getRateRange() {
        return rateRange;
    }

    /**
     * 设置rateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateRange }
     *     
     */
    public void setRateRange(RateRange value) {
        this.rateRange = value;
    }

    /**
     * 获取roomStayCandidates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomStayCandidates }
     *     
     */
    public RoomStayCandidates getRoomStayCandidates() {
        return roomStayCandidates;
    }

    /**
     * 设置roomStayCandidates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayCandidates }
     *     
     */
    public void setRoomStayCandidates(RoomStayCandidates value) {
        this.roomStayCandidates = value;
    }

    /**
     * 获取ratePlanCandidates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanCandidates }
     *     
     */
    public RatePlanCandidates getRatePlanCandidates() {
        return ratePlanCandidates;
    }

    /**
     * 设置ratePlanCandidates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanCandidates }
     *     
     */
    public void setRatePlanCandidates(RatePlanCandidates value) {
        this.ratePlanCandidates = value;
    }

    /**
     * 获取memberType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemberType() {
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
    public void setMemberType(BigInteger value) {
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
    public BigInteger getMemberCard() {
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
    public void setMemberCard(BigInteger value) {
        this.memberCard = value;
    }

}
