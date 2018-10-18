//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:13:07 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.avail.res.success;

import java.util.Objects;

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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RoomTypes"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RatePlans"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RoomRates"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfo"/>
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
    "roomTypes",
    "ratePlans",
    "roomRates",
    "basicPropertyInfo"
})
@XmlRootElement(name = "RoomStay")
public class RoomStay {

    @XmlElement(name = "RoomTypes", required = true)
    protected RoomTypes roomTypes;
    @XmlElement(name = "RatePlans", required = true)
    protected RatePlans ratePlans;
    @XmlElement(name = "RoomRates", required = true)
    protected RoomRates roomRates;
    @XmlElement(name = "BasicPropertyInfo", required = true)
    protected BasicPropertyInfo basicPropertyInfo;

    /**
     * 获取roomTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomTypes }
     *     
     */
    public RoomTypes getRoomTypes() {
    	if(Objects.isNull(roomTypes)){
    		roomTypes = new RoomTypes();
    	}
        return roomTypes;
    }

    /**
     * 设置roomTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypes }
     *     
     */
    public void setRoomTypes(RoomTypes value) {
        this.roomTypes = value;
    }

    /**
     * 获取ratePlans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlans }
     *     
     */
    public RatePlans getRatePlans() {
    	if(Objects.isNull(ratePlans)){
    		ratePlans = new RatePlans();
    	}
        return ratePlans;
    }

    /**
     * 设置ratePlans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlans }
     *     
     */
    public void setRatePlans(RatePlans value) {
        this.ratePlans = value;
    }

    /**
     * 获取roomRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomRates }
     *     
     */
    public RoomRates getRoomRates() {
    	if(Objects.isNull(roomRates)){
    		roomRates = new RoomRates();
    	}
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
     * 获取basicPropertyInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfo }
     *     
     */
    public BasicPropertyInfo getBasicPropertyInfo() {
    	if(Objects.isNull(basicPropertyInfo)){
    		basicPropertyInfo = new BasicPropertyInfo();
    	}
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

}
