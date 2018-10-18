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

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.Constant.ENUM_SYS_NM;

/**
 * 
 * ## 类说明：
 * 	标示本API的对应补偿方法URL
 * @author    [liubowen]   
 * @version   [V1.0, 2016年12月7日]
 * @package com.jw.platform.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月7日|liubowen|新增|CompensatingAPI.java新增
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CompensatingAPI {
	/**
	 * dealURL【置状态URL】
	 */
	String dealUrl() default "";
	/**
	 * rollbackURL【回滚URL】
	 */
	String rollbackUrl() default "";
	/**
	 * 所属系统
	 */
	ENUM_SYS_NM sysType() default Constant.ENUM_SYS_NM.PMS;
}
