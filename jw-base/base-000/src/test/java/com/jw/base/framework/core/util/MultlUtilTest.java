/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.util.CodeBean;
import com.jw.base.framework.core.util.MultlUtil;

/**
 * 
 * ## 类说明：
 * 	测试多语种使用的工具类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月13日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月13日|jianana|新增|MultlUtilTest.java新增
 */
public class MultlUtilTest {

	@Test
	public void testUnderscoreName() {
		String s = MultlUtil.underscoreName("MultlUtilTest");
		Assert.assertEquals("MULTL_UTIL_TEST", s);
		
		String s1 = MultlUtil.underscoreName(null);
		Assert.assertEquals("", s1);
		
		String s2 = MultlUtil.underscoreName("");
		Assert.assertEquals("", s2);
		
		String s3 = MultlUtil.underscoreName("multl");
		Assert.assertEquals("MULTL", s3);
	}

	@Test
	public void testCamelName() {
		String s = MultlUtil.camelName("MULTL_UTIL_TEST");
		Assert.assertEquals("multlUtilTest", s);
		
		String s1 = MultlUtil.camelName("");
		Assert.assertEquals("", s1);
		
		String s2 = MultlUtil.camelName(null);
		Assert.assertEquals("", s2);
		
		String s3 = MultlUtil.camelName("MULTL");
		Assert.assertEquals("mULTL", s3);
		
		String s4 = MultlUtil.camelName("_MULTL_UTIL_TEST");
		Assert.assertEquals("multlUtilTest", s4);
	}

	@Test
	public void testMultlFieldDisplay() throws ClassNotFoundException {
		List<CodeBeanMultl> list = MultlUtil.multlFieldDisplay(BsSysUserMult.class.getName(), true);
		Assert.assertNotNull(list);
		Assert.assertEquals(1, list.size());
		
		List<CodeBeanMultl> list1 = MultlUtil.multlFieldDisplay(BsSysUserMult.class.getName(), false);
		Assert.assertNotNull(list1);
	}


}
