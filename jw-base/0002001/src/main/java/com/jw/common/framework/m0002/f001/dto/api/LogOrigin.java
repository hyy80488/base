/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto.api;

/**
 * ## 类说明：
 * 	日志还原
 * @author    [jianana]   
 * @version   [V1.0, 2017年6月13日]
 * @package com.jw.common.framework.m0002.f001.dto.api
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年6月13日|jianana|新增|LogOrigin.java新增
 */
public interface LogOrigin<T,E> {
	public T getSubmitData();
	public void setSubmitData(T submitData);
	public E getOriginData();
	public void setOriginData(E originData);
}
