
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import java.math.BigDecimal;

/**
 * ## 类说明：
 * 	单位接口表QUERY信息数据传输对象
 * @author    [zteng]   
 * @version   [V1.0, 2018-06-07]
 * @package com.jw.hms.group.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018-06-07|zteng|新增|GrpUnitIfsvcQueryDto新增
 */
@DrptDto(dtonm = "单位接口表QUERY信息数据传输对象",dtodrpt="单位接口表QUERY信息数据传输对象")
public class GrpUnitIfsvcQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8388610508938583352L;
	@DrptField(fieldnm="排序 ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="当前页",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="每页记录数量 ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="id", fielddrpt="id", nullable = "false", length = "10")
	private Integer id;
	
	@DrptField(fieldnm="chainUid", fielddrpt="chainUid", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm="unitUid", fielddrpt="unitUid", nullable = "false", length = "40")
	private String unitUid;
	
	@DrptField(fieldnm="ifsvcverId", fielddrpt="ifsvcverId", nullable = "false", length = "10")
	private Integer ifsvcverId;
	
	@DrptField(fieldnm="ifParam", fielddrpt="ifParam", nullable = "true", length = "4000")
	private String ifParam;
	
	@DrptField(fieldnm="ifParamFlg", fielddrpt="ifParamFlg", nullable = "true", length = "3")
	private String ifParamFlg;
	
	@DrptField(fieldnm="businessUid", fielddrpt="businessUid", nullable = "true", length = "40")
	private String businessUid;
	
	@DrptField(fieldnm="businessStus", fielddrpt="businessStus", nullable = "true", length = "3")
	private String businessStus;
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer value) {
		this.id = value;
	}
	public String getChainUid() {
		return this.chainUid;
	}
	
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}
	
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public Integer getIfsvcverId() {
		return this.ifsvcverId;
	}
	
	public void setIfsvcverId(Integer value) {
		this.ifsvcverId = value;
	}
	public String getIfParam() {
		return this.ifParam;
	}
	
	public void setIfParam(String value) {
		this.ifParam = value;
	}
	public String getIfParamFlg() {
		return this.ifParamFlg;
	}
	
	public void setIfParamFlg(String value) {
		this.ifParamFlg = value;
	}
	public String getBusinessUid() {
		return this.businessUid;
	}
	
	public void setBusinessUid(String value) {
		this.businessUid = value;
	}
	public String getBusinessStus() {
		return this.businessStus;
	}
	
	public void setBusinessStus(String value) {
		this.businessStus = value;
	}
	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
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
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

