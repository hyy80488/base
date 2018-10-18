//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.13 时间 10:43:32 AM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.notity.req;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jw.hms.crs.m7550.f010.htng.dto.notity.req package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TimeSpan_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "TimeSpan");
    private final static QName _RoomTypeCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "RoomTypeCode");
    private final static QName _RatePlanCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "RatePlanCode");
    private final static QName _OnlineStatus_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OnlineStatus");
    private final static QName _ChannelCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ChannelCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jw.hms.crs.m7550.f010.htng.dto.notity.req
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotifyOnOffInfoRQ }
     * 
     */
    public NotifyOnOffInfoRQ createNotifyOnOffInfoRQ() {
        return new NotifyOnOffInfoRQ();
    }

    /**
     * Create an instance of {@link NotityOnoffInfos }
     * 
     */
    public NotityOnoffInfos createNotityOnoffInfos() {
        return new NotityOnoffInfos();
    }

    /**
     * Create an instance of {@link OnOffHotelInfo }
     * 
     */
    public OnOffHotelInfo createOnOffHotelInfo() {
        return new OnOffHotelInfo();
    }

    /**
     * Create an instance of {@link OnOffProductInfos }
     * 
     */
    public OnOffProductInfos createOnOffProductInfos() {
        return new OnOffProductInfos();
    }

    /**
     * Create an instance of {@link OnOffProductInfo }
     * 
     */
    public OnOffProductInfo createOnOffProductInfo() {
        return new OnOffProductInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "TimeSpan")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimeSpan(String value) {
        return new JAXBElement<String>(_TimeSpan_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "RoomTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoomTypeCode(String value) {
        return new JAXBElement<String>(_RoomTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "RatePlanCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRatePlanCode(String value) {
        return new JAXBElement<String>(_RatePlanCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OnlineStatus")
    public JAXBElement<String> createOnlineStatus(String value) {
        return new JAXBElement<String>(_OnlineStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ChannelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChannelCode(String value) {
        return new JAXBElement<String>(_ChannelCode_QNAME, String.class, null, value);
    }

}
