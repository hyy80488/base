/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.exception;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.ExceptionUtil;

/**
 * 
 * ## 类说明：
 * 	异常分析工具类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util.exception
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|ExceptionUtilTest.java新增
 */
public class ExceptionUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTranDes() {
		Map<String,String> map = new HashMap<String,String>();
		map = ExceptionUtil.tranDes("NullPointerException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000002));
		
		map = ExceptionUtil.tranDes("NumberFormatException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000003));
		
		map = ExceptionUtil.tranDes("BadSqlGrammarException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000004));
		
		map = ExceptionUtil.tranDes("DataIntegrityViolationException Caused by: java.sql.BatchUpdateException: Data truncation");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000005));
		
		map = ExceptionUtil.tranDes("ArithmeticExecption");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000006));
		
		map = ExceptionUtil.tranDes("ClassCastException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000007));
		
		map = ExceptionUtil.tranDes("NegativeArrayException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000008));
		
		map = ExceptionUtil.tranDes("ArrayIndexOutOfBoundsException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000009));
		
		map = ExceptionUtil.tranDes("SecturityException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000010));
		
		map = ExceptionUtil.tranDes("EOFException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000011));
		
		map = ExceptionUtil.tranDes("FileNotFoundException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000012));
		
		map = ExceptionUtil.tranDes("SQLException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000013));
		
		map = ExceptionUtil.tranDes("IOException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000014));
		
		map = ExceptionUtil.tranDes("NoSuchMethodException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000015));
		
		map = ExceptionUtil.tranDes("AbstractMethodError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000016));
		
		map = ExceptionUtil.tranDes("AssertionError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000017));
		
		map = ExceptionUtil.tranDes("ClassCircularityError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000018));
		
		map = ExceptionUtil.tranDes("ClassFormatError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000019));
		
		map = ExceptionUtil.tranDes("ExceptionInInitializerError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000020));
		
		map = ExceptionUtil.tranDes("IllegalAccessError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000021));
		
		map = ExceptionUtil.tranDes("IncompatibleClassChangeError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000022));
		
		map = ExceptionUtil.tranDes("InstantiationError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000023));
		
		map = ExceptionUtil.tranDes("InternalError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000024));
		
		map = ExceptionUtil.tranDes("LinkageError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000025));
		
		map = ExceptionUtil.tranDes("NoClassDefFoundError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000026));
		
		map = ExceptionUtil.tranDes("NoSuchFieldError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000027));
		
		map = ExceptionUtil.tranDes("NoSuchMethodError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000028));
		
		map = ExceptionUtil.tranDes("OutOfMemoryError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000029));
		
		map = ExceptionUtil.tranDes("StackOverflowError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000030));
		
		map = ExceptionUtil.tranDes("ThreadDeath");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000031));
		
		map = ExceptionUtil.tranDes("UnknownError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000032));
		
		map = ExceptionUtil.tranDes("UnsatisfiedLinkError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000033));
		
		map = ExceptionUtil.tranDes("UnsupportedClassVersionError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000034));
		
		map = ExceptionUtil.tranDes("VerifyError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000035));
		
		map = ExceptionUtil.tranDes("VirtualMachineError");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000036));
		
		map = ExceptionUtil.tranDes("ArithmeticException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000037));
		
		map = ExceptionUtil.tranDes("ArrayStoreException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000038));
		
		map = ExceptionUtil.tranDes("ClassNotFoundException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000039));
		
		map = ExceptionUtil.tranDes("CloneNotSupportedException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000040));
		
		map = ExceptionUtil.tranDes("EnumConstantNotPresentException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000041));
		
		map = ExceptionUtil.tranDes("IllegalAccessException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000042));
		
		map = ExceptionUtil.tranDes("IllegalMonitorStateException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000043));
		
		map = ExceptionUtil.tranDes("IllegalStateException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000044));
		
		map = ExceptionUtil.tranDes("IllegalThreadStateException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000045));
		
		map = ExceptionUtil.tranDes("IndexOutOfBoundsException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000046));
		
		map = ExceptionUtil.tranDes("InstantiationException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000047));
		
		map = ExceptionUtil.tranDes("InterruptedException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000048));
		
		map = ExceptionUtil.tranDes("NegativeArraySizeException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000049));

		map = ExceptionUtil.tranDes("NoSuchFieldException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000050));
		
		map = ExceptionUtil.tranDes("RuntimeException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000051));
		
		map = ExceptionUtil.tranDes("SecurityException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000052));
		
		map = ExceptionUtil.tranDes("StringIndexOutOfBoundsException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000046));
		
		map = ExceptionUtil.tranDes("TypeNotPresentException");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000054));
		
		map = ExceptionUtil.tranDes("other");
		Assert.assertTrue(map.containsKey(BsProcessErrorCode.ERROR_CODE_000001));
	}

}
