//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.08.09 时间 01:05:27 PM CST 
//


package com.jw.common.framework.m7550.f010.htng.dto.avail.res.error;

import javax.xml.bind.annotation.XmlRegistry;

import com.jw.common.framework.m7550.f010.htng.dto.avail.res.success.OTAHotelAvailRS;
import com.jw.common.framework.m7550.f010.htng.dto.error.Errors;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jw.common.framework.m7550.f010.htng.dto.avail.res.error package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jw.common.framework.m7550.f010.htng.dto.avail.res.error
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRS }
     * 
     */
    public OTAHotelAvailRSError createOTAHotelAvailRS() {
        return new OTAHotelAvailRSError();
    }

}
