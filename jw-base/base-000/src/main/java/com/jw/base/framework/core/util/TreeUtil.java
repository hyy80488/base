/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

/**
 * ## 类说明：
 * 	TreeCode工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|TreeUtil.java新增
 */
public class TreeUtil {
	
	/**
	 * ## 方法说明：
	 * 	获取树形代码最后一段的整形值 
	 * 例如:root.0001.0002.0015 则返回15
	 * @param treeCode
	 * @return
	 */
	public static int getCount(String treeCode){
		String str = treeCode.substring(treeCode.lastIndexOf(".")+1,treeCode.length());
		return Integer.parseInt(str);
	};
	
	/**
	 * ## 方法说明：
	 * 	生成树形代码最后一段 
	 * 例如 createCode("0000",15) => 0015   createCode("00000",102) => 00102 ;
	 * @param baseCode 树形代码段的基础位数 例如:000或0000或00000根据这个位数生成新代码
	 * @param ct 树形代码值 
	 * @return 形代码最后一段
	 */
	public static String createCode(String baseCode,int ct){
		String allStr = baseCode + ct;
		return allStr.substring(allStr.length() - baseCode.length() , allStr.length());
	};
	
	/**
	 * ## 方法说明：
	 * 	获取父节点的code
	 * 例如 root.0001.0002 => root.0001    root.0003.0005.002 => root.0003.0005
	 * @param code 属性编码
	 * @return
	 */
	public static String parentCode(String code){
		return code.substring(0,code.lastIndexOf("."));
	};
}
