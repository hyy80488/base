package com.jw.base.framework.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ## 类说明：
 * 	是否验证夜审
 * @author    [jianana]   
 * @version   [V1.0, 2018年8月15日]
 * @package com.jw.base.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月15日|jianana|新增|IgnoreNight.java新增
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreNight {
}
