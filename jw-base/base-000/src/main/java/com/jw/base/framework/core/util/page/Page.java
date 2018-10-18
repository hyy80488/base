/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.page;

/**
 * ## 类说明：
 * 	分页工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.page
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|Page.java新增
 */
public class Page implements java.io.Serializable{
	private static final long serialVersionUID = 1L;

	public Page(){
		this.currentPage = 1;
		if(pageSize == 0){
			pageSize = 5;
		}
	}
	
	/** 最大页数 */
	private int maxPage;
	/** 当前页 */
	private int currentPage;
	/** 一页记录数 */
	private int pageSize;
	/** 最大记录数 */
	private int listSize;
	
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
}
