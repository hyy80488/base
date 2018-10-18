/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * ## 类说明：
 * 	Controller方法操作所对应系统功能code
 * @author    [liubowen]   
 * @version   [V1.0, 2016年12月7日]
 * @package com.jw.platform.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月7日|liubowen|新增|OperFunCode.java新增
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OperFunCode {
	/**
	 * 单体funCode
	 */
	String funCode() default "";
	/**
	 * 集团funCode
	 */
	String funGroupCode() default "";
	/**
	 * 单店funCode
	 */
	String funHotelCode() default "";
	
	/**
	 * 是否通过部门权限判断funCode
	 */
	boolean isDept() default false;
}
