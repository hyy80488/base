//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:57:00 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.account.res.success;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.jw.base.framework.core.util.DateUtil;
import com.jw.common.framework.m7550.f010.htng.dto.ResBaseDto;
import com.jw.common.framework.m7550.f010.htng.dto.error.Errors;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}HotelReservations"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ResResponseType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
    "errors",
    "success",
    "hotelReservations",
    "echoToken"
})
@XmlRootElement(name = "OTA_HotelResRS")
public class OTAHotelResRS extends ResBaseDto{
    @XmlElement(name = "Errors", required = true)
    protected Errors errors;
    @XmlElement(name = "Success", required = true)
    protected Success success;
    @XmlElement(name = "HotelReservations", required = true)
    protected HotelReservations hotelReservations;
    @XmlAttribute(name = "ResResponseType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String resResponseType;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "EchoToken", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String echoToken;
    /**
     * 获取echoToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * 设置echoToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }
	/**
     * 获取errors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
    	if(errors == null && success == null){
    		errors = new Errors();
    	}
        return errors;
    }

    /**
     * 设置errors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }
    /**
     * 获取success属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Success }
     *     
     */
    public Success getSuccess() {
        return success;
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
     * 获取hotelReservations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelReservations }
     *     
     */
    public HotelReservations getHotelReservations() {
    	if(hotelReservations == null){
    		hotelReservations = new HotelReservations();
    	}
        return hotelReservations;
    }

    /**
     * 设置hotelReservations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservations }
     *     
     */
    public void setHotelReservations(HotelReservations value) {
        this.hotelReservations = value;
    }

    /**
     * 获取resResponseType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResResponseType() {
        return resResponseType;
    }

    /**
     * 设置resResponseType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResResponseType(String value) {
        this.resResponseType = value;
    }

    /**
     * 获取timeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

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
