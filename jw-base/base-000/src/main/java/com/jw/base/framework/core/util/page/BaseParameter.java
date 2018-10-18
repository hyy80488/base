/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ## 类说明：
 * 	分页参数类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.page
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BaseParameter.java新增
 */
public class BaseParameter implements Serializable {
	private static final long serialVersionUID = -2050801753454734869L;
	public static final String SORTED_ASC = "ASC";
	public static final String SORTED_DESC = "DESC";
	private Integer maxResults = Integer.valueOf(20);

	private Integer firstResult = Integer.valueOf(0);
	private Integer topCount;
	private String cmd;
	private String flag = "AND";

	private Boolean success;
	private String message;

	private Map<String, Object> queryDynamicConditions = new HashMap(4);

	private List<String> sortedList = new ArrayList(0);

	private Map<String, Object> dynamicProperties = new HashMap(4);

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Map<String, Object> getQueryDynamicConditions() {
		return this.queryDynamicConditions;
	}

	public void setQueryDynamicConditions(
			Map<String, Object> queryDynamicConditions) {
		this.queryDynamicConditions = queryDynamicConditions;
	}

	public Integer getTopCount() {
		return this.topCount;
	}

	public void setTopCount(Integer topCount) {
		this.topCount = topCount;
	}

	public Map<String, Object> getDynamicProperties() {
		return this.dynamicProperties;
	}

	public void setDynamicProperties(Map<String, Object> dynamicProperties) {
		this.dynamicProperties = dynamicProperties;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCmd() {
		return this.cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public Integer getFirstResult() {
		return this.firstResult;
	}

	public void setFirstResult(Integer firstResult) {
		this.firstResult = firstResult;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<String> getSortedList() {
		return sortedList;
	}

	public void setSortedList(List<String> sortedList) {
		this.sortedList = sortedList;
	}
}