/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.exception;

import javax.validation.ValidationException;

/**
 * ## 类说明：
 * 	自定义Entity校验异常类
 * @author    [guoc]   
 * @version   [V1.0, 2016/12/21]
 * @package com.jw.base.framework.core.exception
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/12/21|guoc|新增|EntityValidationException.java新增
 */
public class EntityValidationException extends ValidationException {

	private static final long serialVersionUID = -1568671349057148255L;

	public EntityValidationException() {
		super();
	}

	public EntityValidationException(String message) {
		super(message);
	}
	
	public EntityValidationException(String message, Throwable cause) {
		super( message, cause );
	}

	public EntityValidationException(Throwable cause) {
		super( cause );
	}
}
