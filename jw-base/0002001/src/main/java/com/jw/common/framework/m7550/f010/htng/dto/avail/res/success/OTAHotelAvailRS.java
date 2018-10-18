//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:13:07 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.avail.res.success;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.jw.base.framework.core.util.DateUtil;
import com.jw.common.framework.m7550.f010.htng.dto.ResBaseDto;
import com.jw.common.framework.m7550.f010.htng.dto.avail.res.error.OTAHotelAvailRSError;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Success"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RoomStays"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
    "success",
    "roomStays"
})
@XmlRootElement(name = "OTA_HotelAvailRS")
public class OTAHotelAvailRS extends ResBaseDto{

    @XmlElement(name = "Success", required = true)
    protected Success success = new Success();
    @XmlElement(name = "RoomStays", required = true)
    protected RoomStays roomStays;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected String timeStamp= DateUtil.formatDate(new Date(), DateUtil.DATE_Timestamp_FORMAT);

    /**
     * 获取success属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Success }
     *     
     */
    public Success getSuccess() {
        return  new Success();
    }

    /**
     * 设置success属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Success }
     *     
     */
    public void setSuccess(Success value) {
        this.success = value;
    }

    /**
     * 获取roomStays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomStays }
     *     
     */
    public RoomStays getRoomStays() {
    	if(Objects.isNull(roomStays)){
    		roomStays = new RoomStays();
    	}
        return roomStays;
    }

    /**
     * 设置roomStays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStays }
     *     
     */
    public void setRoomStays(RoomStays value) {
        this.roomStays = value;
    }

    /**
     * 获取timeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getTimeStamp() {
    	return DateUtil.formatDate(new Date(), DateUtil.DATE_Timestamp_FORMAT);
    }

    /**
     * 设置timeStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}
