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
import com.jw.base.framework.core.ConstantParmTran;
import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;

/**
 * 
 * ## 类说明：
 * 	接口系统描述注解
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月7日]
 * @package com.jw.platform.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月7日|jianana|新增|DrptAPI.java新增
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DrptAPI {
	/** 接口名称 **/
	String infnm() default "";

	/** 接口描述 **/
	String infdrpt() default "";

	/** 接口URL **/
	//String infurl() default "";

	/** 接口方法 GET,POST,DELETE等 **/
	//String infmethod() default "";

	/** 备注 **/
	String memo() default "";

	/** 单个DTO参数 com.jw.hms.platform.m0001.f001.dto.BsSysUserRequestFormDto **/
	String dtoParam() default "";
	
	/** 返回DTO参数 com.jw.hms.platform.m0001.f001.dto.BsSysUserResponseFormDto **/
	String dtoResponse() default "";
	
	/** 查询列表参数 **/
	String listParam() default "";

	/**
	 * 多个DTO参数 com.jw.hms.platform.m0001.f001.dto.UserInfoDto,
	 * com.jw.hms.platform.m0001.f001.dto.BsSysUserQueryDto
	 **/
	String[] params() default {};
	
	/** 本接口是否记录日志 **/
	ENUM_LOGGED logged() default ConstantParmTran.ENUM_LOGGED.NO;
	
	/** 系统类型标示 **/
	ENUM_SYS_NM systype() default Constant.ENUM_SYS_NM.DEFAULT;
}
