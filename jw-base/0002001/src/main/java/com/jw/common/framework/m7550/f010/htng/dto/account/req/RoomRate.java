//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.29 时间 05:16:03 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.account.req;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Rates"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsHoldRoom" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NumberOfUnits" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="OtaSubRoomTypeName" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RatePlanCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RatePlanCode" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RoomTypeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rates"
})
@XmlRootElement(name = "RoomRate")
public class RoomRate {

    @XmlElement(name = "Rates", required = true)
    protected Rates rates;
    @XmlAttribute(name = "IsHoldRoom", required = true)
    protected boolean isHoldRoom;
    @XmlAttribute(name = "NumberOfUnits", required = true)
    protected BigInteger numberOfUnits;
    @XmlAttribute(name = "OtaSubRoomTypeName", required = true)
    protected String otaSubRoomTypeName;
    @XmlAttribute(name = "RatePlanCategory", required = true)
    protected String ratePlanCategory;
    @XmlAttribute(name = "RatePlanCode", required = true)
    protected String ratePlanCode;
    @XmlAttribute(name = "RoomTypeCode", required = true)
    protected String roomTypeCode;

    /**
     * 获取rates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Rates }
     *     
     */
    public Rates getRates() {
        return rates;
    }

    /**
     * 设置rates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rates }
     *     
     */
    public void setRates(Rates value) {
        this.rates = value;
    }

    /**
     * 获取isHoldRoom属性的值。
     * 
     */
    public boolean isIsHoldRoom() {
        return isHoldRoom;
    }

    /**
     * 设置isHoldRoom属性的值。
     * 
     */
    public void setIsHoldRoom(boolean value) {
        this.isHoldRoom = value;
    }

    /**
     * 获取numberOfUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * 设置numberOfUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * 获取otaSubRoomTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getOtaSubRoomTypeName() {
        return otaSubRoomTypeName;
    }

    /**
     * 设置otaSubRoomTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtaSubRoomTypeName(String value) {
        this.otaSubRoomTypeName = value;
    }

    /**
     * 获取ratePlanCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getRatePlanCategory() {
        return ratePlanCategory;
    }

    /**
     * 设置ratePlanCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatePlanCategory(String value) {
        this.ratePlanCategory = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取roomTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * 设置roomTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

}
