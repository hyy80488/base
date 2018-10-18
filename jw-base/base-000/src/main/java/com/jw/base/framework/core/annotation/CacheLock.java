package com.jw.base.framework.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ## 类说明：
 * 	cachelock是方法级的注解，用于注解会产生并发问题的方法
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.base.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|CacheLock.java新增
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheLock {
	
    String lockedPrefix() default "";//redis 锁key的前缀
    
    long timeOut() default 2000;//轮询锁的时间，2000ms
    
    int expireTime() default 100;//key在redis里存在的时间，100S
    
}
