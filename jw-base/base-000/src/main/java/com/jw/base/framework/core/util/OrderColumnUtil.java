/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.base.framework.core.util;

import java.util.List;

import com.jw.base.framework.core.Constant;

/**
 * 
 * ## 类说明：
 * 	拼接排序语句
 * @author    [jianana]   
 * @version   [V1.0, 2017年2月9日]
 * @package com.jw.base.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年2月9日|jianana|新增|OrderColumnUtil.java新增
 */
public class OrderColumnUtil {
	/**
	 * 
	 * ## 方法说明：
	 * 	根据前端传入的排序条件拼接成sql语句
	 * @param orderColumn 传入的查询条件
	 * @return
	 */
	public static String getOrderColumn(List<CodeBean> orderColumn) {
		StringBuilder sql = new StringBuilder();
		if (null != orderColumn) {
			StringBuilder sqlOrder = new StringBuilder();
			// 循环添加排序字段
			for (CodeBean c : orderColumn) {
				// 添加排序字段
				sqlOrder.append(c.getCode());
				if (!StringUtil.isEmpty(c.getName())) {
					// 如果有asc或者desc条件
					String sort = c.getName();
					if (Constant.SORT_ASC.equals(sort) || Constant.SORT_DESC.equals(sort)) {
						// 添加排序方式
						sqlOrder.append(" ");
						sqlOrder.append(c.getName());
					}
				}else{
					sqlOrder.append(" desc");
				}
				sqlOrder.append(",");
			}

			// 删掉最后一个逗号
			if (sqlOrder.length() > 0) {
				sqlOrder.deleteCharAt(sqlOrder.length() - 1);
				sql.append(" order by ");
				sql.append(sqlOrder.toString());
			}

		} else {
			sql.append(" order by id desc");
		}
		return sql.toString();
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	
	 * @param orderColumn   前端传过来的排序字段
	 * @param defaultOrder  orderColumn如果前端没有传   默认排序字段
	 * @param sortString    排序方式 默认asc
	 * @return
	 */
	public static String getOrderColumnByDefault(List<CodeBean> orderColumn,String defaultOrder,String sortString) {
		StringBuilder sql = new StringBuilder();
		if (null != orderColumn) {
			StringBuilder sqlOrder = new StringBuilder();
			// 循环添加排序字段
			for (CodeBean c : orderColumn) {
				// 添加排序字段
				sqlOrder.append(c.getCode());
				if (!StringUtil.isEmpty(c.getName())) {
					// 如果有asc或者desc条件
					String sort = c.getName();
					if (Constant.SORT_ASC.equals(sort) || Constant.SORT_DESC.equals(sort)) {
						// 添加排序方式
						sqlOrder.append(" ");
						sqlOrder.append(c.getName());
					}
				}else{
					sqlOrder.append(" desc");
				}
				sqlOrder.append(",");
			}
			// 删掉最后一个逗号
			if (sqlOrder.length() > 0) {
				sqlOrder.deleteCharAt(sqlOrder.length() - 1);
				sql.append(" order by ");
				sql.append(sqlOrder.toString());
			}

		} else {
			if(StringUtil.isNotEmpty(defaultOrder)){
				if(StringUtil.isNotEmpty(sortString)){
					sql.append(" order by ").append(defaultOrder).append(" ").append(sortString);
				}else{
					sql.append(" order by ").append(defaultOrder).append(" asc ");
				}
			}else{
				sql.append(" order by id desc");
			}
		}
		return sql.toString();
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	根据前端传入的排序条件拼接成sql语句
	 * @param orderColumn 传入的查询条件
	 * @param tableNm 默认排序模块
	 * @return
	 */
	public static String getOrderColumn(List<CodeBean> orderColumn,String tableNm) {
		StringBuilder sql = new StringBuilder();
		if (ListUtil.isNotEmpty(orderColumn)) {
			StringBuilder sqlOrder = new StringBuilder();
			// 循环添加排序字段
			for (CodeBean c : orderColumn) {
				// 添加排序字段
				sqlOrder.append(c.getCode());
				if (!StringUtil.isEmpty(c.getName())) {
					// 如果有asc或者desc条件
					String sort = c.getName();
					if (Constant.SORT_ASC.equals(sort) || Constant.SORT_DESC.equals(sort)) {
						// 添加排序方式
						sqlOrder.append(" ");
						sqlOrder.append(c.getName());
					}
				}else{
					sqlOrder.append(" desc");
				}
				sqlOrder.append(",");
			}

			// 删掉最后一个逗号
			if (sqlOrder.length() > 0) {
				sqlOrder.deleteCharAt(sqlOrder.length() - 1);
				sql.append(" order by ");
				sql.append(sqlOrder.toString());
			}

		} else {
			sql.append(" order by " + tableNm + ".id desc");
		}
		return sql.toString();
	}
}
