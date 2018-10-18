/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.base64;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.util.base64.AESUtil;

public class AESUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEncrypt() throws Exception {
		String s = AESUtil.Encrypt("13425187894", "0000000000000");
		Assert.assertNull(s);
		
		String s1 = AESUtil.Encrypt("13425187894", null);
		Assert.assertNull(s1);
		
		String s2 = AESUtil.Encrypt("13425187894", "0000000000000000");
		Assert.assertEquals("OQDe1RzK6EyhcnYwSxmobg==", s2);
	}

	@Test
	public void testDecrypt() throws Exception {
		String s = AESUtil.Decrypt("13425187894", "0000000000000");
		Assert.assertNull(s);
		
		String s1 = AESUtil.Decrypt("13425187894", null);
		Assert.assertNull(s1);
		
		String s2 = AESUtil.Decrypt("OQDe1RzK6EyhcnYwSxmobg==", "0000000000000000");
		Assert.assertEquals("13425187894", s2);
	}

	@Test
	public void testCrypt() {
		fail("Not yet implemented");
	}

}
