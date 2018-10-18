//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.13 时间 10:43:32 AM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.notity.req;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OnOffHotelInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "NotityOnoffInfos")
public class NotityOnoffInfos {

    @XmlElement(name = "OnOffHotelInfo", required = true)
    protected List<OnOffHotelInfo> onOffHotelInfo;

    /**
     * Gets the value of the onOffHotelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onOffHotelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnOffHotelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnOffHotelInfo }
     * 
     * 
     */
    public List<OnOffHotelInfo> getOnOffHotelInfo() {
        if (onOffHotelInfo == null) {
            onOffHotelInfo = new ArrayList<OnOffHotelInfo>();
        }
        return this.onOffHotelInfo;
    }

	public void setOnOffHotelInfo(List<OnOffHotelInfo> onOffHotelInfo) {
		this.onOffHotelInfo = onOffHotelInfo;
	}
}
