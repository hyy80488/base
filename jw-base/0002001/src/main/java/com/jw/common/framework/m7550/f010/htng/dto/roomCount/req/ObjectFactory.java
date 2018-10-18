//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.23 时间 08:29:02 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.roomCount.req;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import com.jw.common.framework.m5300.f010.dto.ProductInfo.HotelInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jw.common.framework.m7550.f010.htng.dto.roomCount.req package. 
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

    private final static QName _ToDate_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "toDate");
    private final static QName _FromDate_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "fromDate");
/*    private final static QName _RoomTypeCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "roomTypeCode");
    private final static QName _HotelCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "hotelCode");
    private final static QName _RatePlanCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ratePlanCode");*/

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jw.common.framework.m7550.f010.htng.dto.roomCount.req
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryHotelRoomCountRQ }
     * 
     */
    public QueryHotelRoomCountRQ createQueryHotelRoomCountRQ() {
        return new QueryHotelRoomCountRQ();
    }

    /**
     * Create an instance of {@link HotelInfos }
     * 
     */
    public HotelInfos createHotelInfos() {
        return new HotelInfos();
    }

    /**
     * Create an instance of {@link HotelInfo }
     * 
     */
    public HotelInfoSb createHotelInfo() {
        return new HotelInfoSb();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "toDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createToDate(String value) {
        return new JAXBElement<String>(_ToDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "fromDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFromDate(String value) {
        return new JAXBElement<String>(_FromDate_QNAME, String.class, null, value);
    }

  /*  *//**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     *//*
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "roomTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoomTypeCode(String value) {
        return new JAXBElement<String>(_RoomTypeCode_QNAME, String.class, null, value);
    }

    *//**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     *//*
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "hotelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHotelCode(String value) {
        return new JAXBElement<String>(_HotelCode_QNAME, String.class, null, value);
    }

    *//**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     *//*
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ratePlanCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRatePlanCode(String value) {
        return new JAXBElement<String>(_RatePlanCode_QNAME, String.class, null, value);
    }*/

}
