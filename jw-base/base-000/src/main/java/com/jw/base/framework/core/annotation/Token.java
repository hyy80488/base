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
 * 	用于防止重复提交
 * @author    [guoc]   
 * @version   [版本号, 2016/12/01]
 * @package com.jw.platform.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/12/01|guoc|新增|Token.java新增
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Token {
}
