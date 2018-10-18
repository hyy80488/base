/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.util.BeanUtil;

/**
 * 
 * ## 类说明：
 * 	Bean工具类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|BeanUtilTest.java新增
 */
public class BeanUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDescribeObject() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Map<String, Object> map = BeanUtil.describe(new BsSysUserMult("0", "ceshi"));
		Assert.assertEquals("ceshi", map.get("userName"));
		
		Map<String, Object> map1 = BeanUtil.describe(null);
		Assert.assertEquals(0, map1.size());
	}

	@Test
	public void testCopyPropertiesObjectObject() throws IllegalAccessException, InvocationTargetException {
		BsSysUserMult dest = new BsSysUserMult();
		BsSysUserMult orig = new BsSysUserMult("0", "ceshi");
		BeanUtil.copyProperties(dest, orig);
		Assert.assertEquals("ceshi", dest.getUserName());
		
		try {
			BeanUtil.copyProperties(null, orig);
		} catch (IllegalArgumentException e) {
			Assert.assertEquals("No destination bean specified", e.getMessage().trim());
		}
		
		try {
			BeanUtil.copyProperties(dest, null);
		} catch (IllegalArgumentException e) {
			Assert.assertEquals("No origin bean specified", e.getMessage().trim());
		}
		
		BsSysUserMult destMap = new BsSysUserMult();
		Map<String,String> origMap = new HashMap<String,String>();
		origMap.put("userName", "zhangsan");
		BeanUtil.copyProperties(destMap, origMap);
		Assert.assertEquals("zhangsan", destMap.getUserName());
	}

	@Test
	public void testSetObjNullProperties() throws Exception {
		BsSysUserMult obj = new BsSysUserMult("0", "ceshi");
		BeanUtil.setObjNullProperties(obj, new Object[]{"userName"});
		Assert.assertNull(obj.getUserName());
		
		BeanUtil.setObjNullProperties(obj, null);
		
		BeanUtil.setObjNullProperties(obj, new Object[]{});
	}

	@Test
	public void testCopyPropertiesExceptNull() throws IllegalAccessException, InvocationTargetException {
		BsSysUserMult dest = new BsSysUserMult();
		BsSysUserMult orig = new BsSysUserMult("0", "ceshi");
		BeanUtil.copyPropertiesExceptNull(dest, orig);
		Assert.assertEquals("ceshi", dest.getUserName());
		
		
		try {
			BeanUtil.copyPropertiesExceptNull(null, orig);
		} catch (IllegalArgumentException e) {
			Assert.assertEquals("No destination bean specified", e.getMessage().trim());
		}
		
		try {
			BeanUtil.copyPropertiesExceptNull(dest, null);
		} catch (IllegalArgumentException e) {
			Assert.assertEquals("No origin bean specified", e.getMessage().trim());
		}
		
		BsSysUserMult destMap = new BsSysUserMult("0", "ceshi1");
		Map<String,String> origMap = new HashMap<String,String>();
		origMap.put("userName", "zhangsan");
		BeanUtil.copyPropertiesExceptNull(destMap, origMap);
		Assert.assertEquals("zhangsan", destMap.getUserName());
	}

	@Test
	public void testCopyPropertiesObjectObjectListOfString() throws IllegalAccessException, InvocationTargetException {
		List<String> excludedProp = new ArrayList<String>();
		excludedProp.add("userName");
		BsSysUserMult dest = new BsSysUserMult();
		BsSysUserMult orig = new BsSysUserMult("0", "ceshi");
		BeanUtil.copyProperties(dest, orig, excludedProp);
		Assert.assertEquals("0", dest.getLanguageType());

		try {
			BeanUtil.copyProperties(null, orig, excludedProp);
		} catch (IllegalArgumentException e) {
			Assert.assertEquals("No destination bean specified", e.getMessage().trim());
		}

		try {
			BeanUtil.copyProperties(dest, null, excludedProp);
		} catch (IllegalArgumentException e) {
			Assert.assertEquals("No origin bean specified", e.getMessage().trim());
		}

		BsSysUserMult destMap = new BsSysUserMult("1", "ceshi1");
		Map<String, String> origMap = new HashMap<String, String>();
		origMap.put("userName", "zhangsan");
		origMap.put("languageType", "0");
		BeanUtil.copyProperties(destMap, origMap, excludedProp);
		Assert.assertEquals("0", destMap.getLanguageType());
	}

	@Test
	public void testTrimProperties() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		BsSysUserMult destMap = new BsSysUserMult("1", " ceshi ");
		BeanUtil.trimProperties(destMap);
		Assert.assertEquals("ceshi", destMap.getUserName());
	}


	@Test
	public void testGetStringProperty() throws Exception {
		BsSysUserMult destMap = new BsSysUserMult("1", "ceshi");
		String s = BeanUtil.getStringProperty(destMap, "userName");
		Assert.assertEquals("ceshi", s);
		
		String s1 = BeanUtil.getStringProperty(null, "userName");
		Assert.assertEquals("", s1);
		
		String s2 = BeanUtil.getStringProperty(destMap, "");
		Assert.assertEquals("", s2);
		
	}

	@Test
	public void testSetStringProperty() throws Exception {
		BsSysUserMult destMap = new BsSysUserMult("1", "ceshi");
		BeanUtil.setStringProperty(destMap, "userName", "zhangsan");
		Assert.assertEquals("zhangsan", destMap.getUserName());
		
		BeanUtil.setStringProperty(null, "userName", "zhangsan");
		
		BeanUtil.setStringProperty(destMap, "", "zhangsan");
	}

	@Test
	public void testGetDecimalProperty() throws Exception {
		BsSysUserMult destMap = new BsSysUserMult("1", "ceshi");
		destMap.setBigDec(new BigDecimal("12"));
		BigDecimal b = BeanUtil.getDecimalProperty(destMap, "bigDec");
		Assert.assertEquals(new BigDecimal("12"), b);
		
		BigDecimal b1 = BeanUtil.getDecimalProperty(null, "bigDec");
		Assert.assertNull(b1);
		
		BigDecimal b2 = BeanUtil.getDecimalProperty(destMap, "");
		Assert.assertNull(b2);
	}

	@Test
	public void testSetDecimalProperty() throws Exception {
		BsSysUserMult destMap = new BsSysUserMult("1", "ceshi");
		BeanUtil.setDecimalProperty(destMap, "bigDec", new BigDecimal("12"));
		Assert.assertEquals(new BigDecimal("12"), destMap.getBigDec());
		
		BeanUtil.setDecimalProperty(null, "bigDec", new BigDecimal("12"));
		
		BeanUtil.setDecimalProperty(destMap, "", new BigDecimal("12"));
	}

}
