/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ## 类说明：
 * 	序列化转化工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|TSerUtils.java新增
 */
public final class TSerUtils {

	/**
	 * ## 方法说明：
	 * 	Convert object to byte array.
	 * @param t object to be converted
	 * @param <T> some class
	 * @return can be null
	 */
	public static <T> byte[] serial(T t) {
		if (t == null) {
			return null;
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ObjectOutputStream out = null;

		byte[] res = null;
		try {
			out = new ObjectOutputStream(baos);
			out.writeObject(t);

			res = baos.toByteArray();
		} catch (Throwable e) {
			//throw new Exception("Object cannot be converted to bytes!", e);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					return res;
				}
			}
			if (baos != null) {
				try {
					baos.close();
				} catch (IOException e) {
					return res;
				}
			}
		}
		return res;
	}

	/**
	 * ## 方法说明：
	 * 	Byte Array to Object.
	 * @param in object bytes
	 * @param <T> some class
	 * @return can be null
	 */
	public static <T> T byteArr2T(byte[] in) {
		ObjectInputStream oin = null;
		T t = null;
		try {
			oin = new ObjectInputStream(new ByteArrayInputStream(in));
			t = (T) oin.readObject();
		} catch (Throwable e) {
			/*throw new Exception(
					"Object cannot be converted back from bytes!", e);*/
		} finally {
			if (oin != null) {
				try {
					oin.close();
				} catch (IOException e) {
					return t;
				}
			}
		}
		return t;
	}

}
