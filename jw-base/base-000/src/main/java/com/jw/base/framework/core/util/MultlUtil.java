/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.jw.base.framework.core.annotation.CustomEditDisplayField;
import com.jw.base.framework.core.annotation.CustomInputTypeField;
import com.jw.base.framework.core.annotation.CustomListDisplayField;

/**
 * ## 类说明：
 * 	国际化工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|MultlUtil.java新增
 */
public class MultlUtil {
	
	/**
	 * ## 方法说明：
	 * 	将驼峰式命名的字符串转换为下划线大写方式。如果转换前的驼峰式命名的字符串为空，则返回空字符串。</br>
	 * 	例如：HelloWorld->HELLO_WORLD
	 * @param name 转换前的驼峰式命名的字符串
	 * @return 转换后下划线大写方式命名的字符串
	 */
	public static String underscoreName(String name) {
	    StringBuilder result = new StringBuilder();
	    if (name != null && name.length() > 0) {
	        // 将第一个字符处理成大写
	        result.append(name.substring(0, 1).toUpperCase());
	        // 循环处理其余字符
	        for (int i = 1; i < name.length(); i++) {
	            String s = name.substring(i, i + 1);
	            // 在大写字母前添加下划线
	            if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
	                result.append("_");
	            }
	            // 其他字符直接转成大写
	            result.append(s.toUpperCase());
	        }
	    }
	    return result.toString();
	}
	 
	/**
	 * ## 方法说明：
	 * 	将下划线大写方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。</br>
	 * 	例如：HELLO_WORLD->HelloWorld
	 * @param name 转换前的下划线大写方式命名的字符串
	 * @return 转换后的驼峰式命名的字符串
	 */
	public static String camelName(String name) {
	    StringBuilder result = new StringBuilder();
	    // 快速检查
	    if (name == null || name.isEmpty()) {
	        // 没必要转换
	        return "";
	    } else if (!name.contains("_")) {
	        // 不含下划线，仅将首字母小写
	        return name.substring(0, 1).toLowerCase() + name.substring(1);
	    }
	    // 用下划线将原始字符串分割
	    String camels[] = name.split("_");
	    for (String camel :  camels) {
	        // 跳过原始字符串中开头、结尾的下换线或双重下划线
	        if (camel.isEmpty()) {
	            continue;
	        }
	        // 处理真正的驼峰片段
	        if (result.length() == 0) {
	            // 第一个驼峰片段，全部字母都小写
	            result.append(camel.toLowerCase());
	        } else {
	            // 其他的驼峰片段，首字母大写
	            result.append(camel.substring(0, 1).toUpperCase());
	            result.append(camel.substring(1).toLowerCase());
	        }
	    }
	    return result.toString();
	}

	/**
	 * ## 方法说明：
	 * 	列表与维护页面，获取要显示的字段
	 * @param cla
	 * @param isList
	 * @throws ClassNotFoundException 
	 */
	public static List<CodeBeanMultl> multlFieldDisplay(String cla, boolean isList) throws ClassNotFoundException {
		List<CodeBeanMultl> fieldslist = new ArrayList<CodeBeanMultl>();
		Class clazz =  Class.forName(cla);
		 // 获取该类所有的字段
        Field[] fields = clazz.getDeclaredFields();
        // 遍历赋值
        for(Field f : fields){
            String filedName = f.getName();
            CodeBeanMultl cb = new CodeBeanMultl();
            if(isList){
            	CustomListDisplayField cd = f.getAnnotation(CustomListDisplayField.class);
    			if(cd!=null && cd.isDisplay()){
    				cb.setName(underscoreName(filedName));
    				cb.setType(getType(f));
    				fieldslist.add(cb);
    			}
            }else{
            	CustomEditDisplayField cd = f.getAnnotation(CustomEditDisplayField.class);
    			if(cd==null || cd.isDisplay()){
    				cb.setName(filedName);
    				cb.setType(getType(f));
    				cb.setLen(getLength(f));
    				fieldslist.add(cb);
    			}
            }
        }
        return fieldslist;
	}

	/**
	 * ## 方法说明：
	 * 	获取列类型
	 * @param field
	 * @return
	 */
	public static String getType(Field field){
		String result = "input";
		CustomInputTypeField ctf = field.getAnnotation(CustomInputTypeField.class);
		if(ctf!=null && "textarea".equals(ctf.inputType())){
			result = "textarea";
		}
		return result;
	}
	
	/**
	 * ## 方法说明：
	 * 	获取长度
	 * @param field
	 * @return
	 */
	public static int getLength(Field field){
		Length ctf = field.getAnnotation(Length.class);
		int result = 0;
		if(ctf!=null && ctf.max()!=0){
			result = ctf.max();
		}
		return result;
	}

	
}
