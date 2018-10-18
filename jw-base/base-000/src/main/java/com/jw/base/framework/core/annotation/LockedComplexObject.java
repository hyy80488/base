package com.jw.base.framework.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ## 类说明：
 * 	LockedComplexObject是参数级的注解，用于注解自定义类型的参数
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.base.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|LockedComplexObject.java新增
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LockedComplexObject {
    String field() default "";//含有成员变量的复杂对象中需要加锁的成员变量，如一个房型对象的房型ID
}
