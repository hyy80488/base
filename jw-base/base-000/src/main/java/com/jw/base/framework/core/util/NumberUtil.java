package com.jw.base.framework.core.util;

import java.math.BigDecimal;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * ## 类说明：
 * 	描述
 * @author    [mdz]   
 * @version   [V1.0, 2017年5月25日]
 * @package com.jw.base.framework.core.util
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2017年5月25日|MiaoDaZhuang|新增|NumberUtil.java新增
*/
public class NumberUtil {

	public static int compareInteger(Integer obj1, Integer obj2) {
		if (obj1 == null && obj2 == null) {
			return 0;
		} else if (obj1 != null && obj2 == null) {
			return 1;
		} else if (obj1 == null && obj2 != null) {
			return -1;
		} else {
			return obj1.compareTo(obj2);
		}
	}

	public static int compareBigDecimal(BigDecimal obj1, BigDecimal obj2) {
		if (obj1 == null && obj2 == null) {
			return 0;
		} else if (obj1 != null && obj2 == null) {
			return 1;
		} else if (obj1 == null && obj2 != null) {
			return -1;
		} else {
			return obj1.compareTo(obj2);
		}
	}
	
	public static<T extends Comparable<T>> int compare(T obj1, T obj2) {
		if (obj1 == null && obj2 == null) {
			return 0;
		} else if (obj1 != null && obj2 == null) {
			return 1;
		} else if (obj1 == null && obj2 != null) {
			return -1;
		} else {		
			return obj1.compareTo(obj2);
		}
	}
	
	/** 
	 * ## 方法说明：
	 * 	最小数据
	 * @param dates
	 * @return
	*/
	public static <T extends Comparable<T>> T getLeast(T... t){
		if(ArrayUtils.isNotEmpty(t)){
			if(t.length != 1){
				Arrays.sort(t, (d1,d2)-> d1.compareTo(d2));
			}
			return t[0];
		}
		return null;
	}
	
	/** 
	 * ## 方法说明：
	 * 	最大数据
	 * @param dates
	 * @return
	*/
	public static <T extends Comparable<T>> T getGreatest(T... t){
		if(ArrayUtils.isNotEmpty(t)){
			if(t.length != 1){
				Arrays.sort(t, (d1,d2)-> d2.compareTo(d1));
			}
			return t[0];
		}
		return null;
	}

	public static Integer bigDecimal2Int(final BigDecimal o, final Integer defaultValue) {
		if (o == null) {
			return defaultValue;
		}
		return o.intValue();
	}

	public static Integer toInt(final Object o, final Integer defaultValue) {
		if (o == null) {
			return defaultValue;
		}
		String tmp = o.toString();
		if(StringUtils.isBlank(tmp)){
			return defaultValue;
		}
		return Integer.parseInt(o.toString());
	}

	public static Integer toPlusInt(final Object o, final Integer defaultValue) {
		if (o == null) {
			return defaultValue;
		}
		Integer i = Integer.parseInt(o.toString());
		if (i < 0) {
			i = defaultValue;
		}
		return i;
	}

	public static Long toLong(final Object o, final Long defaultValue) {
		if (o == null) {
			return defaultValue;
		}
		return Long.parseLong(o.toString());
	}

	public static Double toDouble(final Object o, final Double defaultValue) {
		if (o == null) {
			return defaultValue;
		}
		return Double.parseDouble(o.toString());
	}

	public static BigDecimal toBigDecimal(final Object o, final BigDecimal defaultValue) {
		if (o == null) {
			return defaultValue;
		}
		return new BigDecimal(o.toString());
	}
	
	  public static <T> T firstNonNull( T first, T second) {
		    return first != null ? first : second;
	  }
	  /** 
	 * ## 方法说明：
	 * 	 在范围内 
	 * @param begin
	 * @param end
	 * @param now
	 * @return 不在范围内 返回false  在范围内 返回true
	*/
	public static  <T extends Comparable<T>> Boolean isExtent(T begin, T end, T now){
		  if(compare(now, begin) == -1){
			  return false;
		  }
		  if(compare(now, end) == 1){
			  return false;
		  }
		  return true;
	  }
}
