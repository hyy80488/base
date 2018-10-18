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
 * 	Entity类接口系统描述注解
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月7日]
 * @package com.jw.platform.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月7日|jianana|新增|DrptEntity.java新增
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DrptEntity {
	/** 名称 **/
	String ennm() default "";

	/** 描述 **/
	String endrpt() default "";

	/** 备注 **/
	String memo() default "";
}
