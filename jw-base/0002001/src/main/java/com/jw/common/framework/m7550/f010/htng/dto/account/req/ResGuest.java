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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Profiles"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ArrivalTransport"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EarlyArrivalTime" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="LastArrivalTime" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="ResGuestRPH" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profiles",
    "arrivalTransport"
})
@XmlRootElement(name = "ResGuest")
public class ResGuest {

    @XmlElement(name = "Profiles", required = true)
    protected Profiles profiles;
    @XmlElement(name = "ArrivalTransport", required = true)
    protected ArrivalTransport arrivalTransport;
    @XmlAttribute(name = "EarlyArrivalTime", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String earlyArrivalTime;
    @XmlAttribute(name = "LastArrivalTime", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lastArrivalTime;
    @XmlAttribute(name = "ResGuestRPH", required = true)
    protected BigInteger resGuestRPH;

    /**
     * 获取profiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Profiles }
     *     
     */
    public Profiles getProfiles() {
        return profiles;
    }

    /**
     * 设置profiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Profiles }
     *     
     */
    public void setProfiles(Profiles value) {
        this.profiles = value;
    }

    /**
     * 获取arrivalTransport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrivalTransport }
     *     
     */
    public ArrivalTransport getArrivalTransport() {
        return arrivalTransport;
    }

    /**
     * 设置arrivalTransport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalTransport }
     *     
     */
    public void setArrivalTransport(ArrivalTransport value) {
        this.arrivalTransport = value;
    }

    /**
     * 获取earlyArrivalTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyArrivalTime() {
        return earlyArrivalTime;
    }

    /**
     * 设置earlyArrivalTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyArrivalTime(String value) {
        this.earlyArrivalTime = value;
    }

    /**
     * 获取lastArrivalTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastArrivalTime() {
        return lastArrivalTime;
    }

    /**
     * 设置lastArrivalTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastArrivalTime(String value) {
        this.lastArrivalTime = value;
    }

    /**
     * 获取resGuestRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResGuestRPH() {
        return resGuestRPH;
    }

    /**
     * 设置resGuestRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResGuestRPH(BigInteger value) {
        this.resGuestRPH = value;
    }

}
