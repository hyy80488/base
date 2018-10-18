/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.alibaba.druid.support.json.JSONUtils;


/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年7月31日]
 * @package com.jw.hms.gfc.m3260.f010.controller
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年7月31日|yingw|新增|TestXML.java新增
*/
public class XMLUtil {
    
    public static String objToXML(Object user){
        String str = "";
        JAXBContext context = null;
        StringWriter writer = null;
        try {
            context = JAXBContext.newInstance(user.getClass());
            Marshaller mar = context.createMarshaller();
            writer = new StringWriter();
            mar.marshal(user, writer);
            
            str = writer.toString();
            
        } catch (JAXBException e) {
            return FastJsonUtil.toJSONStringSerializer(user);
        }
        return str;
    }
}