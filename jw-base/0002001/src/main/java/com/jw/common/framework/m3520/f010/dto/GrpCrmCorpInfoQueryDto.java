/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3520.f010.dto;

import java.util.ArrayList;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class GrpCrmCorpInfoQueryDto extends RequestBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 4441900879335034072L;
	@DrptField(fieldnm="corpNos",fielddrpt="协议公司号集合")
	private List<String> corpNos = new ArrayList<>();
	@DrptField(fieldnm="fastQuery",fielddrpt="fastQuery")
	private String fastQuery;
	@DrptField(fieldnm="statusFlg",fielddrpt="statusFlg")
	private String statusFlg;
	
	public String getStatusFlg() {
		return statusFlg;
	}
	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}
	public String getFastQuery() {
		return fastQuery;
	}
	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}
	@DrptField(fieldnm="corpNm",fielddrpt="协议公司名称")
	private String corpNm;
	@DrptField(fieldnm="corpclsId",fielddrpt="协议公司分类")
	private Integer corpclsId;
	@DrptField(fieldnm="corptypId",fielddrpt="客户类型")
	private Integer corptypId;
	
	public Integer getCorpclsId() {
		return corpclsId;
	}
	public void setCorpclsId(Integer corpclsId) {
		this.corpclsId = corpclsId;
	}
	public Integer getCorptypId() {
		return corptypId;
	}
	public void setCorptypId(Integer corptypId) {
		this.corptypId = corptypId;
	}
	public String getCorpNm() {
		return corpNm;
	}
	public void setCorpNm(String corpNm) {
		this.corpNm = corpNm;
	}
	public List<String> getCorpNos() {
		return corpNos;
	}
	public void setCorpNos(List<String> corpNos) {
		this.corpNos = corpNos;
	}
	
}
