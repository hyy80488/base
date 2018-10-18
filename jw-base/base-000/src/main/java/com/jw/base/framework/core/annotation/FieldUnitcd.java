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
 * 	entity酒店代码字段必须存在此注解
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月8日]
 * @package com.jw.platform.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月8日|jianana|新增|FieldUnitcd.java新增
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldUnitcd {
	/**
	 * 系统类型：PMS或者CRS
	 */
	String systyp() default "";
}
