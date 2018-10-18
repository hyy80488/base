package com.jw.base.framework.core;


/**
 * ## 类说明：
 * 	获取发番号
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年1月4日]
 * @package com.jw.base.framework.core
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年1月4日|MiaoDaZhuang|新增|PmsGetNumber.java新增
*/
public interface PmsGetNumber<O,I> {
	O getNumber(I i) throws Exception;
}
