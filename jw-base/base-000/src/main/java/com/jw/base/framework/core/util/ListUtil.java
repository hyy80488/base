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
import java.util.List;

/**
 * ## 类说明：
 * 	List工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|ListUtil.java新增
 */
public class ListUtil {
	
	/**
	 * ## 方法说明：
	 * 	获取集合第一个记录
	 * @param l 集合
	 * @return
	 */
	public static Object getOne(List<Object> l){
		if( (l!=null) && !l.isEmpty()){
			if(l.get(0)!=null){
				return l.get(0);
			}else{
				return null;
			}			
		}else{
			return null;
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	集合是否不为空
	 * @param l 集合
	 * @return
	 */
	public static boolean isNotEmpty(List l){
		return (l!=null && !l.isEmpty());
	}
	
	/**
	 * ## 方法说明：
	 * 	集合是否为空
	 * @param l 集合
	 * @return
	 */
	public static boolean isEmpty(List l){
		return (l==null || l.isEmpty());
	}
	
	/**
	 * ## 方法说明：
	 * 	集合转为字符串，用split拼接
	 * @param l 集合
	 * @param split 拼接字符
	 * @return
	 */
	public static String listToString(List l ,String split){
		String r = "";
		if(ListUtil.isNotEmpty(l)){
			for(int i = 0; i < l.size(); i++){
				r += l.get(i)+split;
			}
		}
		return r;
	}
	
	/**
	 * ## 方法说明：
	 * 	深拷贝
	 * @return
	 */
	public static <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(byteOut);
		out.writeObject(src);

		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
		ObjectInputStream in = new ObjectInputStream(byteIn);
		@SuppressWarnings("unchecked")
		List<T> dest = (List<T>) in.readObject();
		return dest;
	}
}
