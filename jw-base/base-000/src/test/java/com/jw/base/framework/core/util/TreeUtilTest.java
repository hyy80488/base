/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.util.TreeUtil;

/**
 * 
 * ## 类说明：
 * 	TreeCode工具类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月13日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月13日|jianana|新增|TreeUtilTest.java新增
 */
public class TreeUtilTest {

	@Test
	public void testGetCount() {
		int i = TreeUtil.getCount("root.0001.0002.0015");
		Assert.assertEquals(15, i);
	}

	@Test
	public void testCreateCode() {
		String s = TreeUtil.createCode("0000",15);
		Assert.assertEquals("0015", s);
	}

	@Test
	public void testParentCode() {
		String s = TreeUtil.parentCode("root.0001.0002");
		Assert.assertEquals("root.0001", s);
	}

}
