//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:57:00 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.account.res.success;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jw.common.framework.m7550.f010.htng.dto.account.res.success package. 
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

    private final static QName _OrderStatus_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "OrderStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jw.common.framework.m7550.f010.htng.dto.account.res.success
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResHotelReservation }
     * 
     */
    public ResHotelReservation createHotelReservation() {
        return new ResHotelReservation();
    }

    /**
     * Create an instance of {@link ResGlobalInfo }
     * 
     */
    public ResGlobalInfo createResGlobalInfo() {
        return new ResGlobalInfo();
    }

    /**
     * Create an instance of {@link HotelReservationIDs }
     * 
     */
    public HotelReservationIDs createHotelReservationIDs() {
        return new HotelReservationIDs();
    }

    /**
     * Create an instance of {@link ResHotelReservationID }
     * 
     */
    public ResHotelReservationID createHotelReservationID() {
        return new ResHotelReservationID();
    }

    /**
     * Create an instance of {@link OTAHotelResRS }
     * 
     */
    public OTAHotelResRS createOTAHotelResRS() {
        return new OTAHotelResRS();
    }

    /**
     * Create an instance of {@link Success }
     * 
     */
    public Success createSuccess() {
        return new Success();
    }

    /**
     * Create an instance of {@link HotelReservations }
     * 
     */
    public HotelReservations createHotelReservations() {
        return new HotelReservations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "OrderStatus")
    public JAXBElement<BigInteger> createOrderStatus(BigInteger value) {
        return new JAXBElement<BigInteger>(_OrderStatus_QNAME, BigInteger.class, null, value);
    }

}
