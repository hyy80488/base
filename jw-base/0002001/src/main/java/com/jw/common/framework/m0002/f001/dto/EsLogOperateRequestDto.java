/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

/**
 * ## 类说明：
 * 	EsLogOperate请求DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2017/10/06]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017/10/06|liubowen|新增|EsLogOperateRequestDto.java新增
 */
//@Getter
//@Setter
//@Data
//@AllArgsConstructor
@DrptDto(dtonm = "EsLogOperateRequestDto", dtodrpt = "EsLogOperate请求DTO")
public class EsLogOperateRequestDto extends RequestBaseDto implements java.io.Serializable{
	
	private static final long serialVersionUID = -6038954825378015588L;
	
	@DrptField(fieldnm = "queryKeyName", fielddrpt = "关键字")
	private String queryKeyName;
	
	@DrptField(fieldnm = "queryContent", fielddrpt = "关键键值")
	private String queryContent;
	
	@DrptField(fieldnm = "queryFunCode", fielddrpt = "功能号")
	private String queryFunCode;
	
	@DrptField(fieldnm = "queryLogCd", fielddrpt = "日志号")
	private String queryLogCd;
	
	@DrptField(fieldnm = "queryBeginDate", fielddrpt = "日志开始时间")
	private Date queryBeginDate;
	
	@DrptField(fieldnm = "queryEndDate", fielddrpt = "日志结束时间")
	private Date queryEndDate;
	
	@DrptField(fieldnm = "queryAcctNo", fielddrpt = "账号")
	private String queryAcctNo;
	
	@DrptField(fieldnm = "queryRoomNo", fielddrpt = "房号")
	private String queryRoomNo;

	@DrptField(fieldnm = "languages", fielddrpt = "语种")
	private String languages;
	
	@DrptField(fieldnm = "orderColumn ", fielddrpt = "排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;

	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	private Integer currentPage;

	@DrptField(fieldnm = "pageSize", fielddrpt = "每页记录数量")
	private Integer pageSize;
	
//	@Builder
//    public EsLogOperateRequestDto() {
//    }
	
	public String getQueryContent() {
		return queryContent;
	}

	public void setQueryContent(String queryContent) {
		this.queryContent = queryContent;
	}

	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getQueryKeyName() {
		return queryKeyName;
	}

	public void setQueryKeyName(String queryKeyName) {
		this.queryKeyName = queryKeyName;
	}

	public String getQueryFunCode() {
		return queryFunCode;
	}

	public void setQueryFunCode(String queryFunCode) {
		this.queryFunCode = queryFunCode;
	}

	public String getQueryLogCd() {
		return queryLogCd;
	}

	public void setQueryLogCd(String queryLogCd) {
		this.queryLogCd = queryLogCd;
	}

	public Date getQueryBeginDate() {
		return queryBeginDate;
	}

	public void setQueryBeginDate(Date queryBeginDate) {
		this.queryBeginDate = queryBeginDate;
	}

	public Date getQueryEndDate() {
		return queryEndDate;
	}

	public void setQueryEndDate(Date queryEndDate) {
		this.queryEndDate = queryEndDate;
	}

	public String getQueryAcctNo() {
		return queryAcctNo;
	}

	public void setQueryAcctNo(String queryAcctNo) {
		this.queryAcctNo = queryAcctNo;
	}

	public String getQueryRoomNo() {
		return queryRoomNo;
	}

	public void setQueryRoomNo(String queryRoomNo) {
		this.queryRoomNo = queryRoomNo;
	}

}
