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

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParm.ENUM_PARA_TYPE;
import com.jw.base.framework.core.ConstantParmTran;
import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.ConstantParmTran.ENUM_TRAN_TYPE;

/**
 * 
 * ## 类说明：
 * 	类field接口系统描述注解
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月7日]
 * @package com.jw.platform.framework.core.annotation
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月7日|jianana|新增|DrptField.java新增
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DrptField {
	/** 参数名称 **/
	String fieldnm() default "";

	/** 参数描述【界面名字】 **/
	String fielddrpt() default "";
	
	/** 参数解释说明 **/
	String fieldexplain() default "";
	
	/** 数据库字段名称 **/
	String dbfieldnm() default "";
	
	/** 是否可以为空 **/
	String nullable() default "";
	
	/** 长度 **/
	String length() default "";
	
	/** 精度 **/
	String precision() default "";
	
	/** 字典类型：0：共同参数，1：集团酒店参数，2：集团销售点参数，3：系统参数 **/
	/** 字典类型：10：房含，11：房含分组，12：房型，13：交易代码，14：部门，15：职员，16：职员角色，17：销售员，18：操作员，19：房号，20：房价，21：协议单位，22：权限 **/
	/** 字典类型：30：餐饮：销售点，31：餐饮：统计大类，32：餐饮：统计小类，33：餐饮：菜品，99：税率 **/
	ENUM_PARA_TYPE paramtype() default ConstantParm.ENUM_PARA_TYPE.DEFAULT;

	/** 字典类型：0：共同参数，1：集团酒店参数，2：集团销售点参数，3：系统参数的具体子类**/
	String paramsubtype() default "";
	
	/** 日志拼接文档类型，根据ID，获取整套内容拼接 **/
	ENUM_TRAN_TYPE trantype() default ConstantParmTran.ENUM_TRAN_TYPE.DEFAULT;
	
	/** map中key的描述信息 **/
	String drptmap() default "";
	
	/** 本属性是否记录日志 **/
	ENUM_LOGGED logged() default ConstantParmTran.ENUM_LOGGED.NO;
}
