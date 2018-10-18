/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.SerializationUtils;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;

/**
 * ## 类说明：
 * 	Bean工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BeanUtils.java新增
 */
public class BeanUtil extends org.apache.commons.beanutils.BeanUtils {

	private static final Log log = LogFactory.getLog(BeanUtil.class);

	private static Set<String> notCopyProperties = new HashSet<String>();

	static {
		notCopyProperties.add("class");
		notCopyProperties.add("propName");
		notCopyProperties.add("propValue");
		notCopyProperties.add("currentPage");
		notCopyProperties.add("maxResults");
		notCopyProperties.add("sortColumns");
		notCopyProperties.add("cmd");
	}
	

	/**
	 * ## 方法说明：
	 * 	对象转换成集合，revise BeanUtils describe method do not copy data type
	 * @param bean 对象
	 * @throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	 */
	public static Map describe(Object bean) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		if (bean == null) {
			return (new java.util.HashMap<String, Object>());
		}
		Map<String, Object> description = new HashMap<String, Object>();
		PropertyDescriptor[] descriptors = BeanUtilsBean.getInstance().getPropertyUtils().getPropertyDescriptors(bean);
		Class<?> clazz = bean.getClass();
		for (int i = 0; i < descriptors.length; i++) {
			String name = descriptors[i].getName();
			if (MethodUtils.getAccessibleMethod(clazz, descriptors[i].getReadMethod()) != null) {
				description.put(name, PropertyUtils.getNestedProperty(bean, name));
			}
		}
		return (description);
	}

	/**
	 * ## 方法说明：
	 * 	对象属性复制
	 * @param dest 原对象
	 * @param orig 目标对象
	 * @throws IllegalAccessException, InvocationTargetException
	 */
	public static void copyProperties(Object dest, Object orig) throws IllegalAccessException, InvocationTargetException {

		// Validate existence of the specified beans
		if (dest == null) {
			throw new IllegalArgumentException("No destination bean specified");
		}
		if (orig == null) {
			throw new IllegalArgumentException("No origin bean specified");
		}
		if (log.isDebugEnabled()) {
			log.debug("BeanUtils.copyProperties(" + dest + ", " + orig + ")");
		}

		// Copy the properties, converting as necessary
		BeanUtilsBean bub = BeanUtilsBean.getInstance();
		if (orig instanceof Map) {
			Iterator entries = ((Map) orig).entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry entry = (Map.Entry) entries.next();
				String name = (String) entry.getKey();
				if (bub.getPropertyUtils().isWriteable(dest, name)) {
					bub.copyProperty(dest, name, entry.getValue());
				}
			}
		} else /* if (orig is a standard JavaBean) */{
			PropertyDescriptor[] origDescriptors = bub.getPropertyUtils().getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if (notCopyProperties.contains(name) || name.startsWith("$")) {
					//System.out.println(name);
					continue; // No point in trying to set an object's class
				}
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					try {
						Object value = bub.getPropertyUtils().getSimpleProperty(orig, name);
						bub.copyProperty(dest, name, value);
					} catch (NoSuchMethodException e) {
						// Should not happen
					}
				}
			}
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	置空对象属性
	 * @param obj 对象
	 * @param properties 需要制空的属性
	 * @throws Exception
	 */
	public static void setObjNullProperties(Object obj,Object[] properties) throws Exception{
		if(properties!= null && properties.length != 0){
			for(Object propertyObj : properties){
				String property = propertyObj.toString();
				property = property.trim();
				Field field = obj.getClass().getDeclaredField(property);
				String setter = "set" + property.substring(0,1).toUpperCase() + property.substring(1,property.length());
				Method setterMethod = obj.getClass().getMethod(setter, field.getType());
				setterMethod.invoke(obj,new Object[]{null});
			}
		}
	}

	/**
	 * ## 方法说明：
	 * 	对象非空属性复制
	 * @param dest 原对象
	 * @param orig 目标对象
	 * @throws IllegalAccessException, InvocationTargetException
	 */
	public static void copyPropertiesExceptNull(Object dest, Object orig) throws IllegalAccessException, InvocationTargetException {
		// Validate existence of the specified beans
		if (dest == null) {
			throw new IllegalArgumentException("No destination bean specified");
		}
		if (orig == null) {
			throw new IllegalArgumentException("No origin bean specified");
		}
		if (log.isDebugEnabled()) {
			log.debug("BeanUtils.copyProperties(" + dest + ", " + orig + ")");
		}

		// Copy the properties, converting as necessary
		BeanUtilsBean bub = BeanUtilsBean.getInstance();
		if (orig instanceof Map) {
			Iterator entries = ((Map) orig).entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry entry = (Map.Entry) entries.next();
				String name = (String) entry.getKey();
				if (bub.getPropertyUtils().isWriteable(dest, name)) {
					bub.copyProperty(dest, name, entry.getValue());
				}
			}
		} else /* if (orig is a standard JavaBean) */{
			PropertyDescriptor[] origDescriptors = bub.getPropertyUtils().getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if ("class".equals(name) || "propName".equals(name) || "propValue".equals(name)) {
					System.out.println(name);
					continue; // No point in trying to set an object's class
				}
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					try {
						Object value = bub.getPropertyUtils().getSimpleProperty(orig, name);
						if (value != null) {
							bub.copyProperty(dest, name, value);
						}
					} catch (NoSuchMethodException e) {
						// Should not happen
					}
				}
			}
		}
	}

	/**
	 * ## 方法说明：
	 * 	排除部分属性后，对象属性复制
	 * @param dest 原对象
	 * @param orig 目标对象
	 * @param excludedProp 排除属性集合
	 * @throws IllegalAccessException, InvocationTargetException
	 */
	public static void copyProperties(Object dest, Object orig, List<String> excludedProp) throws IllegalAccessException, InvocationTargetException {
		// Validate existence of the specified beans
		if (dest == null) {
			throw new IllegalArgumentException("No destination bean specified");
		}
		if (orig == null) {
			throw new IllegalArgumentException("No origin bean specified");
		}
		if (log.isDebugEnabled()) {
			log.debug("BeanUtils.copyProperties(" + dest + ", " + orig + ")");
		}

		// Copy the properties, converting as necessary
		BeanUtilsBean bub = BeanUtilsBean.getInstance();
		if (orig instanceof Map) {
			Iterator entries = ((Map) orig).entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry entry = (Map.Entry) entries.next();
				String name = (String) entry.getKey();
				if (bub.getPropertyUtils().isWriteable(dest, name)) {
					bub.copyProperty(dest, name, entry.getValue());
				}
			}
		} else /* if (orig is a standard JavaBean) */{
			PropertyDescriptor[] origDescriptors = bub.getPropertyUtils().getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if ("class".equals(name) || excludedProp.contains(name)) {
					continue; // No point in trying to set an object's class
				}
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					try {
						Object value = bub.getPropertyUtils().getSimpleProperty(orig, name);
						bub.copyProperty(dest, name, value);
					} catch (NoSuchMethodException e) {
						// Should not happen
					}
				}
			}
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	对target对象中，带有TrimProcessNeeded注解的属性进行trim处理
	 * @param target
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public static final void trimProperties(Object target)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Field[] fields = target.getClass().getDeclaredFields();
		for (Field field : fields) {
			TrimProcessNeeded trimAnno = field.getAnnotation(TrimProcessNeeded.class);
			if (trimAnno == null) {
				continue;
			}
			if (field.getType().isAssignableFrom(String.class)) {
				String propertyValue = BeanUtil.getSimpleProperty(target, field.getName());
				if (propertyValue != null && PropertyUtils.isWriteable(target, field.getName())) {
					BeanUtil.setProperty(target, field.getName(), propertyValue.trim());
				}
			}
		}
	}


	/**
	 * 
	 * ## 方法说明：
	 * 	通过反射获取对象的属性值
	 * 	注意：该方法只能获取对象中以get开头的方法，且返回值是String类型的
	 * @param bean	对象
	 * @param name	方法名
	 * @return	getXXX()的返回值String
	 * @throws Exception
	 */
	public static String getStringProperty(Object bean, String name) throws Exception {
		Class[] parameterTypes = null;
		StringBuffer methodName = new StringBuffer();
		try {
			if (bean == null) {
				return "";
			}
			if (StringUtil.isEmpty(name)) {
				return "";
			}
			methodName.append(Constant.METHOD_GET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}
			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), parameterTypes);
			return (String) m.invoke(bean);
		} finally {
			methodName = null;
		}
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	通过反射获取对象的属性值
	 * 	注意：该方法只能获取对象中以get开头的方法，且返回值是Integer类型的
	 * @param bean	对象
	 * @param name	方法名
	 * @return	getXXX()的返回值Integer
	 * @throws Exception
	 */
	public static Integer getIntegerProperty(Object bean, String name) throws Exception {
		Class[] parameterTypes = null;
		StringBuffer methodName = new StringBuffer();
		try {
			if (bean == null) {
				return null;
			}
			if (StringUtil.isEmpty(name)) {
				return null;
			}
			methodName.append(Constant.METHOD_GET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}
			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), parameterTypes);
			return (Integer) m.invoke(bean);
		} finally {
			methodName = null;
		}
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	通过反射获取对象设置对象的属性值
	 * 	注意：该方法只能获取对象中以set开头的方法，且参数类型是String类型的方法
	 * @param bean	对象
	 * @param name	方法名
	 * @param value	方法参数
	 * @throws Exception
	 */
	public static void setStringProperty(Object bean, String name, String value) throws Exception {
		StringBuffer methodName = new StringBuffer();
		try {
			if (bean == null) {
				return;
			}
			if (StringUtil.isEmpty(name)) {
				return;
			}
			methodName.append(Constant.METHOD_SET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}
			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), String.class);
			m.invoke(bean, value);
		} finally {
			methodName = null;
		}
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	通过反射获取对象设置对象的属性值
	 * 	注意：该方法只能获取对象中以set开头的方法，且参数类型是Integer类型的方法
	 * @param bean	对象
	 * @param name	方法名
	 * @param value	方法参数
	 * @throws Exception
	 */
	public static void setIntegerProperty(Object bean, String name, Integer value) throws Exception {
		StringBuffer methodName = new StringBuffer();
		try {
			if (bean == null) {
				return;
			}
			if (StringUtil.isEmpty(name)) {
				return;
			}
			methodName.append(Constant.METHOD_SET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}
			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), Integer.class);
			m.invoke(bean, value);
		} finally {
			methodName = null;
		}
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	通过反射获取对象设置对象的属性值
	 * 	注意：该方法只能获取对象中以set开头的方法，且参数类型是Integer类型的方法
	 * @param bean	对象
	 * @param name	方法名
	 * @param value	方法参数
	 * @throws Exception
	 */
	public static void setDateProperty(Object bean, String name, Date value) throws Exception {
		StringBuffer methodName = new StringBuffer();
		try {
			if (bean == null) {
				return;
			}
			if (StringUtil.isEmpty(name)) {
				return;
			}
			methodName.append(Constant.METHOD_SET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}
			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), Date.class);
			m.invoke(bean, value);
		} finally {
			methodName = null;
		}
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	通过反射获取对象的属性值
	 * 	注意：该方法只能获取对象中以get开头的方法，且返回值是BigDecimal类型的
	 * @param bean	对象
	 * @param name	方法名
	 * @return	getXXX()的返回值BigDecimal
	 * @throws Exception
	 */
	public static BigDecimal getDecimalProperty(Object bean, String name) throws Exception {
		Class[] parameterTypes = null;
		StringBuffer methodName = new StringBuffer();
		
		try {
			if (bean == null) {
				return null;
			}
			
			if (StringUtil.isEmpty(name)) {
				return null;
			}

			methodName.append(Constant.METHOD_GET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}

			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), parameterTypes);

			return (BigDecimal) m.invoke(bean);
			
		} finally {
			methodName = null;
		}
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	通过反射获取对象的属性值
	 * 	注意：该方法只能获取对象中以get开头的方法，且返回值是BigDecimal类型的
	 * @param bean	对象
	 * @param name	方法名
	 * @return	getXXX()的返回值BigDecimal
	 * @throws Exception
	 */
	public static Date getDateProperty(Object bean, String name) throws Exception {
		Class[] parameterTypes = null;
		StringBuffer methodName = new StringBuffer();
		
		try {
			if (bean == null) {
				return null;
			}
			
			if (StringUtil.isEmpty(name)) {
				return null;
			}

			methodName.append(Constant.METHOD_GET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}

			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), parameterTypes);

			return (Date) m.invoke(bean);
			
		} finally {
			methodName = null;
		}
	}
	
	public static Object getObjectProperty(Object bean, String name) throws Exception {
		Class[] parameterTypes = null;
		StringBuffer methodName = new StringBuffer();
		
		try {
			if (bean == null) {
				return null;
			}
			
			if (StringUtil.isEmpty(name)) {
				return null;
			}

			methodName.append(Constant.METHOD_GET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}

			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), parameterTypes);

			return m.invoke(bean);
			
		} finally {
			methodName = null;
		}
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	通过反射获取对象设置对象的属性值
	 * 	注意：该方法只能获取对象中以set开头的方法，且参数类型是BigDecimal类型的方法
	 * @param bean	对象
	 * @param name	方法名
	 * @param value	方法参数
	 * @throws Exception
	 */
	public static void setDecimalProperty(Object bean, String name, BigDecimal value) throws Exception {
		StringBuffer methodName = new StringBuffer();
		
		try {
			
			if (bean == null) {
				return;
			}
			
			if (StringUtil.isEmpty(name)) {
				return;
			}
			
			methodName.append(Constant.METHOD_SET_PRE + name.substring(0, 1).toUpperCase());
			if (name.length() > 1) {
				methodName.append(name.substring(1));
			}
				
			Method m = bean.getClass().getDeclaredMethod(methodName.toString(), BigDecimal.class);
			
			m.invoke(bean, value);
			
		} finally {
			methodName = null;
		}
	}
	
	/**
     * 对一个bean进行深度复制，所有的属性节点全部会被复制
     * @param source
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @see [类、类#方法、类#成员]
     */
    public static <T> T deepCopyBean(T source)
    {
        if (source == null)
        {
            return null;
        }
        try
        {
            if (source instanceof Collection)
            {
                return (T)deepCopyCollection((Collection)source);
            }
            if (source.getClass().isArray())
            {
                return (T)deepCopyArray(source);
            }
            if (source instanceof Map)
            {
                return (T)deepCopyMap((Map)source);
            }
            if (source instanceof Date)
            {
                return (T)new Date(((Date)source).getTime());
            }
            if (source instanceof Timestamp)
            {
                return (T)new Timestamp(((Timestamp)source).getTime());
            }
            // 基本类型直接返回原值
            if (source.getClass().isPrimitive() || source instanceof String || source instanceof Boolean
                || Number.class.isAssignableFrom(source.getClass()))
            {
                return source;
            }
            if (source instanceof StringBuilder)
            {
                return (T)new StringBuilder(source.toString());
            }
            if (source instanceof StringBuffer)
            {
                return (T)new StringBuffer(source.toString());
            }
            Object dest = source.getClass().newInstance();
            BeanUtilsBean bean = BeanUtilsBean.getInstance();
            PropertyDescriptor[] origDescriptors = bean.getPropertyUtils().getPropertyDescriptors(source);
            for (int i = 0; i < origDescriptors.length; i++)
            {
                String name = origDescriptors[i].getName();
                if ("class".equals(name))
                {
                    continue;
                }
                 
                if (bean.getPropertyUtils().isReadable(source, name) && bean.getPropertyUtils().isWriteable(dest, name))
                {
                    try
                    {
                        Object value = deepCopyBean(bean.getPropertyUtils().getSimpleProperty(source, name));
                        bean.getPropertyUtils().setSimpleProperty(dest, name, value);
                    }
                    catch (NoSuchMethodException e)
                    {
                    }
                }
            }
            return (T)dest;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Description: 通过序列化、反序列化方式实现对象深拷贝
     * @param clazz
     * @param srcDto
     * @return
     * @throws Exception
     */
    public static <T extends java.io.Serializable> T deepCopyDtoBySerialization(Class<T> clazz, T srcDto)
            throws Exception {
        if (!clazz.equals(srcDto.getClass())) {
            throw new Exception("类型不匹配！");
        }
        T destDto = (T) srcDto.getClass().newInstance();
        byte[] srcByte = SerializationUtils.serialize(srcDto);
        Object obj = SerializationUtils.deserialize(srcByte);
        destDto = clazz.cast(obj);
        return destDto;
    }
    
    private static Collection deepCopyCollection(Collection source) throws InstantiationException, IllegalAccessException
    {
        Collection dest = source.getClass().newInstance();
        for (Object o : source)
        {
            dest.add(deepCopyBean(o));
        }
        return dest;
    }
     
    private static Object deepCopyArray(Object source) throws InstantiationException, IllegalAccessException, ArrayIndexOutOfBoundsException, IllegalArgumentException
    {
        int length = Array.getLength(source);
        Object dest = Array.newInstance(source.getClass().getComponentType(), length);
        if (length == 0)
        {
            return dest;
        }
        for (int i = 0; i < length; i++)
        {
            Array.set(dest, i, deepCopyBean(Array.get(source, i)));
        }
        return dest;
    }
     
    private static Map deepCopyMap(Map source) throws InstantiationException, IllegalAccessException
    {
        Map dest = source.getClass().newInstance();
        for (Object o : source.entrySet())
        {
            Entry e = (Entry)o;
            dest.put(deepCopyBean(e.getKey()), deepCopyBean(e.getValue()));
        }
        return dest;
    }
    
    /**
	 * ## 方法说明：
	 * 	对象是否空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(Object obj) {
		if (obj == null) {
			return true;
		}

		if (obj.getClass().isArray()) {
			return Array.getLength(obj) == 0;
		}
		if (obj instanceof CharSequence) {
			return ((CharSequence) obj).length() == 0;
		}
		if (obj instanceof Collection) {
			return ((Collection) obj).isEmpty();
		}
		if (obj instanceof Map) {
			return ((Map) obj).isEmpty();
		}

		// else
		return false;
	}
	
	//在Cahce的设计中，一般会考虑两种对象管理方法，一是按对象大小，比如开一个10M字节的cahce空间。另外一个是按对象的数量，比如1000个对象的cache空间。
	//对于按对象尺寸管理的cache,由于Java对象的实际内存大小不好获得，所以一般就使用一个Serializable对象的序列化尺寸来代替，
	//序列化时通常把一个对象序列化到一个字节buffer里，那么就可以获得这个buffer的字节数。
	//但这样做太浪费空间，也可以如下做，只计数，不产生字节转移，那么就不会耗费内存空间了。
	public static int calcSize(Object object) {
		int ret = 0;

		class DumbOutputStream extends OutputStream {
			int count = 0;
			@Override
			public void write(int b) throws IOException {
				count++; // 只计数，不产生字节转移
			}
		}

		DumbOutputStream buf = new DumbOutputStream();
		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(buf);
			os.writeObject(object);
			ret = buf.count;
		} catch (IOException e) {
			// No need handle this exception
			e.printStackTrace();
			ret = -1;
		} finally {
			try {
				os.close();
			} catch (Exception e) {
			}
		}
		return ret;
	}
	
	public static Method getMethod(Class<?> clazz, String name, Class<?> clazzTyp) throws Exception {
		if (clazz == null) {
			return null;
		}
		if (StringUtil.isEmpty(name)) {
			return null;
		}
		String methodName = Constant.METHOD_GET_PRE + name.substring(0, 1).toUpperCase()+ name.substring(1);
		Method m = clazz.getDeclaredMethod(methodName, null);
		return m;
	}
	
	public static Method setMethod(Class<?> clazz, String name, Class<?> clazzTyp) throws Exception {
		if (clazz == null) {
			return null;
		}
		if (StringUtil.isEmpty(name)) {
			return null;
		}
		String methodName = Constant.METHOD_SET_PRE + name.substring(0, 1).toUpperCase()+ name.substring(1);
		Method m = clazz.getDeclaredMethod(methodName, clazzTyp);
		return m;
	}
}
