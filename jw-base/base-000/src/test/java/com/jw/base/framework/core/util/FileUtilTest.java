/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.util.FileUtil;
/**
 * 
 * ## 类说明：
 * 	文件处理工具类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|FileUtilTest.java新增
 */
public class FileUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWriteFile() {
		FileUtil.writeFile("src/test/resources/filetest.txt", "文件处理工具类测试");
		String txt = FileUtil.readFile("src/test/resources/filetest.txt");
		Assert.assertEquals("文件处理工具类测试", txt.trim());
		
		FileUtil.readFile("src/test/filetest.txt");
	}

	@Test
	public void testCopyFile() {
		File file1 = new File("src/test/resources/filetest.txt");
		File file2 = new File("src/main/resources/filetest.txt");
		FileUtil.copyFile(file1, file2);
		String txt = FileUtil.readFile("src/main/resources/filetest.txt");
		Assert.assertEquals("文件处理工具类测试", txt.trim());
		FileUtil.deleteFile("src/main/resources/filetest.txt");
		String txt1 = FileUtil.readFile("src/main/resources/filetest.txt");
		Assert.assertEquals("", txt1);
		
		FileUtil.copyFile(file1, null);
	}

	@Test
	public void testGetFilePrefix() {
		String s = FileUtil.getFilePrefix("filetest.txt");
		Assert.assertEquals("filetest", s);
		
		String s1 = FileUtil.getFilePrefix("filetest");
		Assert.assertEquals("", s1);
	}

	@Test
	public void testGetFileSufix() {
		String s = FileUtil.getFileSufix("filetest.txt");
		Assert.assertEquals("txt", s);
		
		String s1 = FileUtil.getFileSufix("filetest");
		Assert.assertEquals("", s1);
	}

	@Test
	public void testMkDir() {
		boolean b = FileUtil.mkDir("src/test/resources");
		Assert.assertTrue(b);
		
		boolean b1 = FileUtil.mkDir("src/test/resources/testdir");
		Assert.assertTrue(b1);
		FileUtil.deleteFile("src/test/resources/testdir");
	}

	@Test
	public void testZipFile() throws Exception {
		FileUtil.zipFile("src/test/resources/filetest.zip", "src/test/resources");
		FileUtil.deleteFile("src/test/resources/filetest.zip");
	}

	@Test
	public void testDelAllFile() throws IOException {
		FileUtil.mkDir("src/test/resources/tmp");
		FileUtil.mkDir("src/test/resources/tmp/a");
		File file = new File("src/test/resources/tmp","a.txt");
		file.createNewFile();
		File file1 = new File("src/test/resources/tmp","b.txt");
		file1.createNewFile();
		File file2 = new File("src/test/resources/tmp/a","c.txt");
		file2.createNewFile();
		FileUtil.delAllFile("src/test/resources/tmp");
	}



}
