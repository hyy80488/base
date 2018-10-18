/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.util.ListUtil;
/**
 * 
 * ## 类说明：
 * 	List工具类测试类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|ListUtilTest.java新增
 */
public class ListUtilTest {

	@Test
	public void testGetOne() {
		List<Object> list = new ArrayList<Object>();
		list.add(new BsSysUserMult("0", "zhangsan"));
		list.add(new BsSysUserMult("1", "李四"));
		list.add(new BsSysUserMult("2", "王五"));
		BsSysUserMult bsu = (BsSysUserMult)ListUtil.getOne(list);
		Assert.assertEquals("0", bsu.getLanguageType());
		
		Object obj = ListUtil.getOne(null);
		Assert.assertNull(obj);
		
		List<Object> list1 = new ArrayList<Object>();
		list1.add(null);
		list1.add(new BsSysUserMult("1", "李四"));
		list1.add(new BsSysUserMult("2", "王五"));
		Object obj1 = ListUtil.getOne(list1);
		Assert.assertNull(obj1);
		
		Object obj2 = ListUtil.getOne(new ArrayList<Object>());
		Assert.assertNull(obj2);
		
	}

	@Test
	public void testIsNotEmpty() {
		List<Object> list = new ArrayList<Object>();
		list.add(new BsSysUserMult("0", "zhangsan"));
		list.add(new BsSysUserMult("1", "李四"));
		list.add(new BsSysUserMult("2", "王五"));
		boolean b = ListUtil.isNotEmpty(list);
		Assert.assertTrue(b);
		
		boolean b1 = ListUtil.isNotEmpty(new ArrayList<Object>());
		Assert.assertFalse(b1);
		
		boolean b2 = ListUtil.isNotEmpty(null);
		Assert.assertFalse(b2);
	}

	@Test
	public void testIsEmpty() {
		List<Object> list = new ArrayList<Object>();
		list.add(new BsSysUserMult("0", "zhangsan"));
		list.add(new BsSysUserMult("1", "李四"));
		list.add(new BsSysUserMult("2", "王五"));
		boolean b = ListUtil.isEmpty(list);
		Assert.assertFalse(b);
		
		boolean b1 = ListUtil.isEmpty(new ArrayList<Object>());
		Assert.assertTrue(b1);
		
		boolean b2 = ListUtil.isEmpty(null);
		Assert.assertTrue(b2);
	}

	@Test
	public void testListToString() {
		List<Object> list = new ArrayList<Object>();
		list.add(new BsSysUserMult("0", "zhangsan"));
		list.add(new BsSysUserMult("1", "李四"));
		list.add(new BsSysUserMult("2", "王五"));
		String s = ListUtil.listToString(list, "-");
		System.out.println(s.length());
		
		String s1 = ListUtil.listToString(null, "-");
		Assert.assertEquals("", s1);
	}

}
