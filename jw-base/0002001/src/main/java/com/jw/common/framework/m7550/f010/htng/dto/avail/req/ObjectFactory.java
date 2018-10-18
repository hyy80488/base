//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:48:01 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.avail.req;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jw.common.framework.m7550.f010.htng.dto.avail.req package. 
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

    private final static QName _MemberType_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "MemberType");
    private final static QName _MemberCard_QNAME = new QName("http://www.opentravel.org/OTA/2003/05", "MemberCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jw.common.framework.m7550.f010.htng.dto.avail.req
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RatePlanCandidate }
     * 
     */
    public RatePlanCandidate createRatePlanCandidate() {
        return new RatePlanCandidate();
    }

    /**
     * Create an instance of {@link HotelRef }
     * 
     */
    public HotelRef createHotelRef() {
        return new HotelRef();
    }

    /**
     * Create an instance of {@link StayDateRange }
     * 
     */
    public StayDateRange createStayDateRange() {
        return new StayDateRange();
    }

    /**
     * Create an instance of {@link GuestCounts }
     * 
     */
    public GuestCounts createGuestCounts() {
        return new GuestCounts();
    }

    /**
     * Create an instance of {@link GuestCount }
     * 
     */
    public GuestCount createGuestCount() {
        return new GuestCount();
    }

    /**
     * Create an instance of {@link RateRange }
     * 
     */
    public RateRange createRateRange() {
        return new RateRange();
    }

    /**
     * Create an instance of {@link RatePlanCandidates }
     * 
     */
    public RatePlanCandidates createRatePlanCandidates() {
        return new RatePlanCandidates();
    }

    /**
     * Create an instance of {@link RoomStayCandidates }
     * 
     */
    public RoomStayCandidates createRoomStayCandidates() {
        return new RoomStayCandidates();
    }

    /**
     * Create an instance of {@link RoomStayCandidate }
     * 
     */
    public RoomStayCandidate createRoomStayCandidate() {
        return new RoomStayCandidate();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRQ }
     * 
     */
    public OTAHotelAvailRQ createOTAHotelAvailRQ() {
        return new OTAHotelAvailRQ();
    }

    /**
     * Create an instance of {@link POS }
     * 
     */
    public POS createPOS() {
        return new POS();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link RequestorID }
     * 
     */
    public RequestorID createRequestorID() {
        return new RequestorID();
    }

    /**
     * Create an instance of {@link AvailRequestSegments }
     * 
     */
    public AvailRequestSegments createAvailRequestSegments() {
        return new AvailRequestSegments();
    }

    /**
     * Create an instance of {@link AvailRequestSegment }
     * 
     */
    public AvailRequestSegment createAvailRequestSegment() {
        return new AvailRequestSegment();
    }

    /**
     * Create an instance of {@link HotelSearchCriteria }
     * 
     */
    public HotelSearchCriteria createHotelSearchCriteria() {
        return new HotelSearchCriteria();
    }

    /**
     * Create an instance of {@link Criterion }
     * 
     */
    public Criterion createCriterion() {
        return new Criterion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "MemberType")
    public JAXBElement<BigInteger> createMemberType(BigInteger value) {
        return new JAXBElement<BigInteger>(_MemberType_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opentravel.org/OTA/2003/05", name = "MemberCard")
    public JAXBElement<BigInteger> createMemberCard(BigInteger value) {
        return new JAXBElement<BigInteger>(_MemberCard_QNAME, BigInteger.class, null, value);
    }

}
