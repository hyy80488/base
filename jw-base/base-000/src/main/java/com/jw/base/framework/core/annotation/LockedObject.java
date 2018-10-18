package com.jw.base.framework.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ## 类说明：
 * 	lockedObject是参数级的注解，用于注解房型ID等基本类型的参数
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.base.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|LockedObject.java新增
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LockedObject {
    //不需要值
}
