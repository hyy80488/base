//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.22 时间 08:20:41 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.roomCount.res;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jw.hms.crs.m7550.f010.htng.dto.roomCount.res package. 
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

    private final static QName _NoRoomMsg_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "noRoomMsg");
    private final static QName _IsShareCount_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "isShareCount");
    private final static QName _RoomCount_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "roomCount");
    private final static QName _RoomTypeCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "roomTypeCode");
    private final static QName _BookDate_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "bookDate");
    private final static QName _HotelCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "hotelCode");
    private final static QName _RetCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "retCode");
    private final static QName _RatePlanCode_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "ratePlanCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jw.hms.crs.m7550.f010.htng.dto.roomCount.res
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductCountInfos }
     * 
     */
    public ProductCountInfos createProductCountInfos() {
        return new ProductCountInfos();
    }

    /**
     * Create an instance of {@link ProductCountInfo }
     * 
     */
    public ProductCountInfo createProductCountInfo() {
        return new ProductCountInfo();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link HotelproductCount }
     * 
     */
    public HotelproductCount createHotelproductCount() {
        return new HotelproductCount();
    }

    /**
     * Create an instance of {@link ErrorMsg }
     * 
     */
    public ErrorMsg createErrorMsg() {
        return new ErrorMsg();
    }

    /**
     * Create an instance of {@link QueryHotelRoomCountRS }
     * 
     */
    public QueryHotelRoomCountRS createQueryHotelRoomCountRS() {
        return new QueryHotelRoomCountRS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "noRoomMsg")
    public JAXBElement<String> createNoRoomMsg(String value) {
        return new JAXBElement<String>(_NoRoomMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "isShareCount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIsShareCount(String value) {
        return new JAXBElement<String>(_IsShareCount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "roomCount")
    public JAXBElement<BigInteger> createRoomCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_RoomCount_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "roomTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoomTypeCode(String value) {
        return new JAXBElement<String>(_RoomTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "bookDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBookDate(String value) {
        return new JAXBElement<String>(_BookDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "hotelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHotelCode(String value) {
        return new JAXBElement<String>(_HotelCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "retCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRetCode(String value) {
        return new JAXBElement<String>(_RetCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "ratePlanCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRatePlanCode(String value) {
        return new JAXBElement<String>(_RatePlanCode_QNAME, String.class, null, value);
    }

}
