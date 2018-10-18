/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

/**
 * ## 类说明：
 * 	Hibernate扩展工具类
 * @author    [guoc]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.dao
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|guoc|新增|HibernateExtend.java新增
*/
public class HibernateUtil {

	/**
	 * Force initialization of a persistent collection.
	 * <p/>
	 * Note: This only ensures intialization of a proxy object or collection; it
	 * is not guaranteed that the elements INSIDE the collection will be
	 * initialized/materialized.
	 * 
	 * @param proxies
	 *            some persistable objects, proxy, persistent collection or
	 *            <tt>null</tt>
	 * @param properties
	 *            a array of properties of the proxy.
	 * @throws HibernateException
	 *             if we can't initialize the proxy at this time, eg. the
	 *             <tt>Session</tt> was closed
	 */
	public static void initialize(Collection proxies, String[] properties) throws HibernateException {
		if (proxies == null || proxies.size() == 0) {
			return;
		}
		for (Object domain : proxies) {
			initialize(domain, properties);
		}
	}

	/**
	 * Force initialization of a proxy or persistent collection.
	 * <p/>
	 * Note: This only ensures intialization of a proxy object or collection; it
	 * is not guaranteed that the elements INSIDE the collection will be
	 * initialized/materialized.
	 * 
	 * @param proxy
	 *            a persistable object, proxy, persistent collection or
	 *            <tt>null</tt>
	 * @param properties
	 *            a array of properties of the proxy.
	 * @throws HibernateException
	 *             if we can't initialize the proxy at this time, eg. the
	 *             <tt>Session</tt> was closed
	 */
	public static void initialize(Object proxy, String[] properties) throws HibernateException {
		if (proxy == null || properties == null || properties.length == 0) {
			return;
		}
		for (String propertyName : properties) {
			if (StringUtils.isBlank(propertyName)) {
				continue;
			}
			if (!propertyName.contains(".")) {
				initializeEx(proxy, propertyName);
				continue;
			}

			String[] subPropertyNames = propertyName.split("\\.");
			if (subPropertyNames == null || subPropertyNames.length == 0) {
				continue;
			}
			initialize(proxy, subPropertyNames, 0);
		}
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param proxy
	 * @param subPropertyNames
	 * @param idx
	 */
	private static void initialize(Object proxy, String[] subPropertyNames, int idx) {
		if (idx >= subPropertyNames.length) {
			return;
		}
		if (proxy == null || 
				StringUtils.isBlank(subPropertyNames[idx])) {
			return;
		}
		if (proxy instanceof Collection) {
			for (Iterator iter = ((Collection) proxy).iterator(); iter.hasNext();) {
				initialize(initializeEx(iter.next(), subPropertyNames[idx]), subPropertyNames, idx + 1);
			}
		} else {
			initialize(initializeEx(proxy, subPropertyNames[idx]), subPropertyNames, idx + 1);
		}
	}

	/**
	 * Force initialization of a proxy or persistent collection.
	 * <p/>
	 * Note: This only ensures intialization of a proxy object or collection; it
	 * is not guaranteed that the elements INSIDE the collection will be
	 * initialized/materialized.
	 * 
	 * @param proxy
	 *            a persistable object, proxy, persistent collection or
	 *            <tt>null</tt>
	 */
	public static Object initializeEx(Object proxy, String propertyName) {
		Object propertyValue = getPropertyValue(proxy, propertyName);
		if (propertyValue != null) {
			Hibernate.initialize(propertyValue);
		}
		return propertyValue;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param proxy
	 * @param propertyName
	 * @return
	 */
	public static Object getPropertyValue(Object proxy, String propertyName) {
		try {
			return PropertyUtils.getSimpleProperty(proxy, propertyName);
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
}
