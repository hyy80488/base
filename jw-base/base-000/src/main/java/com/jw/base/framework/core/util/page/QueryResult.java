/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.page;

import java.io.Serializable;
import java.util.List;

/**
 * ## 类说明：
 * 	查询结果工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.page
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|QueryResult.java新增
 */
public class QueryResult<E> implements Serializable {
	private static final long serialVersionUID = -2050801753454734811L;
	/** 行数 **/
	private List<E> rows;
	/** 条数 **/
	private Long total;


	public List<E> getRows() {
		return rows;
	}

	public void setRows(List<E> rows) {
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}


}
