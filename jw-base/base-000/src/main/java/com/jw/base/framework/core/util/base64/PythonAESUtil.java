/**   
* @Title: PythonAESUtil.java 
* @Package com.jw.base.framework.core.util.base64 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2017年11月28日 下午1:09:10 
* @version V1.0   
*/
package com.jw.base.framework.core.util.base64;


/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2017年11月28日]
 * @package com.jw.base.framework.core.util.base64
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年11月28日|bwliu|新增|PythonAESUtil.java新增
*/
public class PythonAESUtil {
	public static void main(String[] args) throws Exception {
		if ("Encrypt".equals(args[0])){
			System.out.println(AESUtil.Encrypt(args[1], args[2]));
		}
		if ("Decrypt".equals(args[0])){
			System.out.println(AESUtil.Decrypt(args[1], args[2]));
		}
		if ("InitSecBook".equals(args[0])){
			System.out.println(SymmetricUtil.getInitSecBook(args[1]));
		}
	}
}
