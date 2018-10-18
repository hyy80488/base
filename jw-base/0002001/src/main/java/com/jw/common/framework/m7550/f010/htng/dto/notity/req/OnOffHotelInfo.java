//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.13 时间 10:43:32 AM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.notity.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OnOffProductInfos"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HotelCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OnOffHotelInfo")
public class OnOffHotelInfo {

    @XmlElement(name = "OnOffProductInfos", required = true)
    protected OnOffProductInfos onOffProductInfos;
    
    @XmlAttribute(name = "HotelCode", required = true)
    protected String hotelCode;

    /**
     * 获取onOffProductInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OnOffProductInfos }
     *     
     */
    public OnOffProductInfos getOnOffProductInfos() {
        return onOffProductInfos;
    }

    /**
     * 设置onOffProductInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OnOffProductInfos }
     *     
     */
    public void setOnOffProductInfos(OnOffProductInfos value) {
        this.onOffProductInfos = value;
    }

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

}
