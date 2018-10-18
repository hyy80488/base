/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;

import com.jw.base.framework.core.Constant;

/**
 * 
 * ## 类说明：
 * 	排序工具类
 * @author    [guoc]   
 * @version   [V1.0, 2017年3月14日]
 * @package com.jw.hms.group.m3140.f010.service
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月14日|guoc|新增|CompareUtil.java新增
 */
public class CompareUtil {

	/**
	 * 
	 * ## 方法说明：
	 * 	List<Map<String,Object>>排序
	 * @param sort	Constant.ENUM_SORT.ASC.getValue()	升序
	 * 				Constant.ENUM_SORT.DESC.getValue()	降序
	 * @param filed	字段名
	 * @return
	 */
	public static <T> Comparator<Map<String,Object>> createMapComparator(int sort, String... filed) {
		return new MapComparator(sort, filed);
	}

	public static class MapComparator implements Comparator<Map<String,Object>> {
		int sort = Constant.ENUM_SORT.ASC.getValue();
		String[] filed;

		public MapComparator(int sort, String... filed) {
			this.sort = sort == Constant.ENUM_SORT.DESC.getValue() ? Constant.ENUM_SORT.DESC.getValue()
					: Constant.ENUM_SORT.ASC.getValue();
			this.filed = filed;
		}
		
		@Override
		public int compare(Map<String,Object> m1, Map<String,Object> m2) {
			int result = 0;
			for (String file : filed) {
				Object value1 = m1.get(file);
				Object value2 = m2.get(file);
				if (value1 == null || value2 == null) {
					continue;
				}
				if (value1 instanceof Integer) { // Integer整数序排序
					int v1 = Integer.valueOf(value1.toString());
					int v2 = Integer.valueOf(value2.toString());
					if (v1 == v2){
						continue;
					}
					if (sort == Constant.ENUM_SORT.ASC.getValue()) {
						return v1 - v2;
					} else if (sort == Constant.ENUM_SORT.DESC.getValue()) {
						return v2 - v1;
					}
					
				} else if (value1 instanceof String) { // String类型排序
					String s1 = (String) value1;
					String s2 = (String) value2;
					if (s1.equals(s2)){
						continue;
					}
					if (sort == Constant.ENUM_SORT.ASC.getValue()) {
						return s1.compareTo(s2);
					} else if (sort == Constant.ENUM_SORT.DESC.getValue()) {
						return s2.compareTo(s1);
					}
					
				} else if (value1 instanceof Date) { // Date类型排序
					Date d1 = (Date) value1;
					Date d2 = (Date) value2;
					if (d1.equals(d2)){
						continue;
					}
					if (sort == Constant.ENUM_SORT.ASC.getValue()) {
						return d1.compareTo(d2);
					} else if (sort == Constant.ENUM_SORT.DESC.getValue()) {
						return d2.compareTo(d1);
					}
				} else if (value1 instanceof Long) { // Long排序
					long v1 = Long.valueOf(value1.toString());
					long v2 = Long.valueOf(value2.toString());
					if (v1 == v2){
						continue;
					}
					if (sort == Constant.ENUM_SORT.ASC.getValue()) {
						return v1 > v2 ? 1 : -1;
					} else if (sort == Constant.ENUM_SORT.DESC.getValue()) {
						return v2 > v1 ? 1 : -1;
					}
				} else if (value1 instanceof Double) { // Double排序
					Double v1 = Double.valueOf(value1.toString());
					Double v2 = Double.valueOf(value2.toString());
					if (v1.equals(v2)){
						continue;
					}
					if (sort == Constant.ENUM_SORT.ASC.getValue()) {
						return v1 > v2 ? 1 : -1;
					} else if (sort == Constant.ENUM_SORT.DESC.getValue()) {
						return v2 > v1 ? 1 : -1;
					}
				}
			}

			return result;
		}
	}
	
	public static void main(String[] args) {
		Map<String, Object> m1 = new HashMap<String, Object>();
		m1.put("userId", 1);
		m1.put("userName", "张三");
		m1.put("createDate", System.currentTimeMillis());
		m1.put("date", new Date());
		m1.put("money", new BigDecimal(100.01));
		
		Map<String, Object> m2 = new HashMap<String, Object>();
		m2.put("userId", 2);
		m2.put("userName", "李四");
		m2.put("createDate", System.currentTimeMillis());
		m2.put("date", new Date());
		m2.put("money", new BigDecimal(200.01));
		
		Map<String, Object> m3 = new HashMap<String, Object>();
		m3.put("userId", 3);
		m3.put("userName", "王五");
		m3.put("createDate", System.currentTimeMillis());
		m3.put("date", new Date());
		m3.put("money", new BigDecimal(100.09));
		
		
		List<Map<String, Object>> newlist = new ArrayList<Map<String, Object>>();
		newlist.add(m1);
		newlist.add(m2);
		newlist.add(m3);
		
		List<Map<String, Object>> newlist2 = new ArrayList<Map<String, Object>>();
		CollectionUtils.select(newlist, (object) -> {
			Map<String, Object> n = (Map<String, Object>) object;
			String id = n.get("userId").toString();
			Date yymd = (Date) n.get("date");

			if ("3".equals(id) && DateUtil.date2String(DateUtil.FMT_YMD_S, yymd).equals("2017/03/18")) {
				return true;
			}
			return false;
		}, newlist2);
		
		for(Map<String, Object> a :newlist){
			System.out.println("newlist: "+a);
		}
		for(Map<String, Object> a :newlist2){
			System.out.println("newlist2: "+a);
		}
	}
}
