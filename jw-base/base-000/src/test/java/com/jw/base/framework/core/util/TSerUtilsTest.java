/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.util.TSerUtils;
/**
 * 
 * ## 类说明：
 * 	序列化转化工具类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|TSerUtilsTest.java新增
 */
public class TSerUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSerial() {
		byte[] bt = TSerUtils.serial("test");
		Assert.assertNotNull(bt);
		
		byte[] bt1 = TSerUtils.serial(null);
		Assert.assertNull(bt1);
	}

	@Test
	public void testByteArr2T() {
		byte[] bt = TSerUtils.serial("test");
		String s = TSerUtils.byteArr2T(bt);
		Assert.assertEquals("test", s);
	}

}
