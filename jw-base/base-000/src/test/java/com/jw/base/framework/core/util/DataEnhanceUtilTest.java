/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.util.DataEnhanceUtil;
/**
 * 
 * ## 类说明：
 * 	数据增强处理工具类测试类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|DataEnhanceUtilTest.java新增
 */
public class DataEnhanceUtilTest {

	@Test
	public void testDecryptString() throws Exception {
		String s = DataEnhanceUtil.decryptString("OQDe1RzK6EyhcnYwSxmobg==", "0000000000000000", "3", "4","*");
		Assert.assertEquals("134****7894", s);
		
		String s1 = DataEnhanceUtil.decryptString("", "0000000000000000", "3", "4","*");
		Assert.assertEquals("", s1);
		
		String s2 = DataEnhanceUtil.decryptString(null, "0000000000000000", "3", "4","*");
		Assert.assertEquals("", s2);
		
		String s3 = DataEnhanceUtil.decryptString("OQDe1RzK6EyhcnYwSxmobg==", "", "3", "4","*");
		Assert.assertEquals("************************", s3);
		
		//String s4 = DataEnhanceUtil.decryptString("OQDe1RzK6EyhcnYwSxmobg==", "0000000000000000", "", "$1****$2");
		//Assert.assertEquals("13425187894", s4);
		
		
		String s5 = DataEnhanceUtil.decryptString("OQDe1RzK6EyhcnYwSxmobg==", "000000000000", "3", "4","*");
		Assert.assertEquals("OQDe1RzK6EyhcnYwSxmobg==", s5);
	}

	@Test
	public void testEncryptString() throws Exception {
		String s = DataEnhanceUtil.encryptString("13425187894", "0000000000000000");
		Assert.assertEquals("OQDe1RzK6EyhcnYwSxmobg==", s);
		
		String s1 = DataEnhanceUtil.encryptString("", "0000000000000000");
		Assert.assertEquals("", s1);
		
		String s2 = DataEnhanceUtil.encryptString("13425187894", "");
		Assert.assertEquals("", s2);
		
		String s3 = DataEnhanceUtil.encryptString("13425187894","000000000");
		Assert.assertEquals("13425187894", s3);
	
	}

	@Test
	public void testAnalysisCryptType() {
		String s = DataEnhanceUtil.analysisCryptType(Constant.CRYPT_FIELD_SUFFIX_TLNO);
		Assert.assertEquals(Constant.CRYPT_TYPE_MAPKEY_TLNO, s);
		
		String s1 = DataEnhanceUtil.analysisCryptType(Constant.CRYPT_FIELD_SUFFIX_PHNO);
		Assert.assertEquals(Constant.CRYPT_TYPE_MAPKEY_PHNO, s1);
		
		String s2 = DataEnhanceUtil.analysisCryptType(Constant.CRYPT_FIELD_SUFFIX_MBNO);
		Assert.assertEquals(Constant.CRYPT_TYPE_MAPKEY_MBNO, s2);
		
		String s3 = DataEnhanceUtil.analysisCryptType(Constant.CRYPT_FIELD_SUFFIX_CDNO);
		Assert.assertEquals(Constant.CRYPT_TYPE_MAPKEY_CDNO, s3);
		
		String s4 = DataEnhanceUtil.analysisCryptType(Constant.CRYPT_FIELD_SUFFIX_IDCD);
		Assert.assertEquals(Constant.CRYPT_TYPE_MAPKEY_IDCD, s4);
		
		String s5 = DataEnhanceUtil.analysisCryptType("_qw");
		Assert.assertEquals("", s5);
		
	}

}
