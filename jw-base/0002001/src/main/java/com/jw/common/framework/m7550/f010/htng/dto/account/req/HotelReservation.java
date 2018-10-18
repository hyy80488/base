//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.29 时间 05:16:03 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.account.req;

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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}UniqueID"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RoomStays"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ResGuests"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ResGlobalInfo"/>
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
    "uniqueID",
    "roomStays",
    "resGuests",
    "resGlobalInfo"
})
@XmlRootElement(name = "HotelReservation")
public class HotelReservation {

    @XmlElement(name = "UniqueID", required = true)
    protected UniqueID uniqueID;
    @XmlElement(name = "RoomStays", required = true)
    protected RoomStays roomStays;
    @XmlElement(name = "ResGuests", required = true)
    protected ResGuests resGuests;
    @XmlElement(name = "ResGlobalInfo", required = true)
    protected ResGlobalInfo resGlobalInfo;

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setUniqueID(UniqueID value) {
        this.uniqueID = value;
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
     * 获取resGuests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGuests }
     *     
     */
    public ResGuests getResGuests() {
        return resGuests;
    }

    /**
     * 设置resGuests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuests }
     *     
     */
    public void setResGuests(ResGuests value) {
        this.resGuests = value;
    }

    /**
     * 获取resGlobalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGlobalInfo }
     *     
     */
    public ResGlobalInfo getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * 设置resGlobalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGlobalInfo }
     *     
     */
    public void setResGlobalInfo(ResGlobalInfo value) {
        this.resGlobalInfo = value;
    }

}
