//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:13:07 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.avail.res.success;

import java.math.BigInteger;
import java.util.Objects;

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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}RatePlanDescription"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RatePlanCategory" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RatePlanCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ratePlanDescription"
})
@XmlRootElement(name = "RatePlan")
public class RatePlan {

    @XmlElement(name = "RatePlanDescription", required = true)
    protected RatePlanDescription ratePlanDescription;
    @XmlAttribute(name = "RatePlanCategory", required = true)
    protected String ratePlanCategory;
    @XmlAttribute(name = "RatePlanCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ratePlanCode;

    /**
     * 获取ratePlanDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatePlanDescription }
     *     
     */
    public RatePlanDescription getRatePlanDescription() {
    	if(Objects.isNull(ratePlanDescription)){
    		ratePlanDescription = new RatePlanDescription();
    	}
        return ratePlanDescription;
    }

    /**
     * 设置ratePlanDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanDescription }
     *     
     */
    public void setRatePlanDescription(RatePlanDescription value) {
        this.ratePlanDescription = value;
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
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

}
