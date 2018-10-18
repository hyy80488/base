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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RoomRates"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}GuestCounts"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TimeSpan"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Guarantee"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Total"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfo"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHs"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SpecialRequests"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MarketCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PromotionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SourceOfBusiness" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "roomRates",
    "guestCounts",
    "timeSpan",
    "guarantee",
    "total",
    "basicPropertyInfo",
    "resGuestRPHs",
    "specialRequests"
})
@XmlRootElement(name = "RoomStay")
public class RoomStay {

    @XmlElement(name = "RoomRates", required = true)
    protected RoomRates roomRates;
    @XmlElement(name = "GuestCounts", required = true)
    protected GuestCounts guestCounts;
    @XmlElement(name = "TimeSpan", required = true)
    protected TimeSpan timeSpan;
    @XmlElement(name = "Guarantee", required = true)
    protected Guarantee guarantee;
    @XmlElement(name = "Total", required = true)
    protected Total total;
    @XmlElement(name = "BasicPropertyInfo", required = true)
    protected BasicPropertyInfo basicPropertyInfo;
    @XmlElement(name = "ResGuestRPHs", required = true)
    protected BigInteger resGuestRPHs;
    @XmlElement(name = "SpecialRequests", required = true)
    protected SpecialRequests specialRequests;
    @XmlAttribute(name = "MarketCode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String marketCode;
    @XmlAttribute(name = "PromotionCode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String promotionCode;
    @XmlAttribute(name = "SourceOfBusiness", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceOfBusiness;

    /**
     * 获取roomRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomRates }
     *     
     */
    public RoomRates getRoomRates() {
        return roomRates;
    }

    /**
     * 设置roomRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRates }
     *     
     */
    public void setRoomRates(RoomRates value) {
        this.roomRates = value;
    }

    /**
     * 获取guestCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestCounts }
     *     
     */
    public GuestCounts getGuestCounts() {
        return guestCounts;
    }

    /**
     * 设置guestCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCounts }
     *     
     */
    public void setGuestCounts(GuestCounts value) {
        this.guestCounts = value;
    }

    /**
     * 获取timeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    /**
     * 设置timeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setTimeSpan(TimeSpan value) {
        this.timeSpan = value;
    }

    /**
     * 获取guarantee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Guarantee }
     *     
     */
    public Guarantee getGuarantee() {
        return guarantee;
    }

    /**
     * 设置guarantee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Guarantee }
     *     
     */
    public void setGuarantee(Guarantee value) {
        this.guarantee = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Total }
     *     
     */
    public Total getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Total }
     *     
     */
    public void setTotal(Total value) {
        this.total = value;
    }

    /**
     * 获取basicPropertyInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfo }
     *     
     */
    public BasicPropertyInfo getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    /**
     * 设置basicPropertyInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfo }
     *     
     */
    public void setBasicPropertyInfo(BasicPropertyInfo value) {
        this.basicPropertyInfo = value;
    }

    /**
     * 获取resGuestRPHs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResGuestRPHs() {
        return resGuestRPHs;
    }

    /**
     * 设置resGuestRPHs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResGuestRPHs(BigInteger value) {
        this.resGuestRPHs = value;
    }

    /**
     * 获取specialRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequests }
     *     
     */
    public SpecialRequests getSpecialRequests() {
        return specialRequests;
    }

    /**
     * 设置specialRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequests }
     *     
     */
    public void setSpecialRequests(SpecialRequests value) {
        this.specialRequests = value;
    }

    /**
     * 获取marketCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * 设置marketCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * 获取promotionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * 设置promotionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * 获取sourceOfBusiness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }

    /**
     * 设置sourceOfBusiness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfBusiness(String value) {
        this.sourceOfBusiness = value;
    }

}
