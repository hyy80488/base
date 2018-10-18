/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	字典请求dto 
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2017年1月9日]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since 日期|作者|类型|内容
 * :----|:-----|:-----|:-----
 * 2017年1月9日|MiaoDaZhuang|新增|DictionaryRequestDto.java新增
*/
@DrptDto(dtonm = "RequestDictionaryByTypsDto", dtodrpt = "字典请求dto")
public class RequestDictionaryByTypsDto extends RequestBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = -8365729854208874272L;

	/** 
	* @Fields typs :主表字典请求，{typs:["typ1","typ2"]}
	*/
	@DrptField(fieldnm = "typs", fielddrpt = "主表字典请求")
	private List<String> typs;
	@DrptField(fieldnm = "paramTyp", fielddrpt = "类型")
	private String paramTyp;
	@DrptField(fieldnm = "paramgrpId", fielddrpt = "父参数Id")
	private Integer paramgrpId;
	@DrptField(fieldnm = "paramIds", fielddrpt = "参数ID")
	private List<Integer> paramIds = new ArrayList<>();
	@DrptField(fieldnm = "unitUid", fielddrpt = "单位unitUid")
	private String unitUid;
	@DrptField(fieldnm = "languageId", fielddrpt = "多语种ID")
	private Integer languageId;
	@DrptField(fieldnm = "salesId", fielddrpt = "销售点")
	private Integer salesId;
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团")
	private String chainUid;
	@DrptField(fieldnm = "queryParam", fielddrpt = "查询参数")
	private Map<String, String> queryParam;

	@DrptField(fieldnm = "paramgrpIds", fielddrpt = "父参数Ids")
	private List<Integer> paramgrpIds = new ArrayList<>();
	@DrptField(fieldnm = "paramsubgrpIds", fielddrpt = "paramsubgrpIds")
	private List<Integer> paramsubgrpIds = new ArrayList<>();

	private Map<String, Map<String, List<Map<String, Object>>>> mapParam;

	public Map<String, Map<String, List<Map<String, Object>>>> getMapParam() {
		return mapParam;
	}

	public void setMapParam(Map<String, Map<String, List<Map<String, Object>>>> mapParam) {
		this.mapParam = mapParam;
	}

	public Map<String, String> getQueryParam() {
		return queryParam;
	}

	public void setQueryParam(Map<String, String> queryParam) {
		this.queryParam = queryParam;
	}

	public String getChainUid() {
		return chainUid;
	}

	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}

	private String ids;

	/** 系统参数attrValue为String **/
	private List<String> attrValue;

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	/** 级联使用   paramKey  paramTyp  paramgrpId **/
	private List<Map<String, Object>> cascadeMaps;

	/** 字段过滤使用    **/
	private List<Map<String, String>> filterMapList;

	public List<String> getTyps() {
		return typs;
	}

	public void setTyps(List<String> typs) {
		this.typs = typs;
	}

	public String getParamTyp() {
		return paramTyp;
	}

	public void setParamTyp(String paramTyp) {
		this.paramTyp = paramTyp;
	}

	public Integer getParamgrpId() {
		return paramgrpId;
	}

	public void setParamgrpId(Integer paramgrpId) {
		this.paramgrpId = paramgrpId;
	}

	public List<Integer> getParamIds() {
		return paramIds;
	}

	public void setParamIds(List<Integer> paramIds) {
		this.paramIds = paramIds;
	}

	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public Integer getSalesId() {
		return salesId;
	}

	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}

	public List<Map<String, Object>> getCascadeMaps() {
		return cascadeMaps;
	}

	public void setCascadeMaps(List<Map<String, Object>> cascadeMaps) {
		this.cascadeMaps = cascadeMaps;
	}

	public List<String> getAttrValue() {
		return attrValue;
	}

	public void setAttrValue(List<String> attrValue) {
		this.attrValue = attrValue;
	}

	public List<Map<String, String>> getFilterMapList() {
		return filterMapList;
	}

	public void setFilterMapList(List<Map<String, String>> filterMapList) {
		this.filterMapList = filterMapList;
	}

	public List<Integer> getParamgrpIds() {
		return paramgrpIds;
	}

	public void setParamgrpIds(List<Integer> paramgrpIds) {
		this.paramgrpIds = paramgrpIds;
	}

	public List<Integer> getParamsubgrpIds() {
		return paramsubgrpIds;
	}

	public void setParamsubgrpIds(List<Integer> paramsubgrpIds) {
		this.paramsubgrpIds = paramsubgrpIds;
	}
	//标记
	private List<String> paramFlgs;

	public List<String> getParamFlgs() {
		return paramFlgs;
	}

	public void setParamFlgs(List<String> paramFlgs) {
		this.paramFlgs = paramFlgs;
	}
	//创建单位
	private String mng_unit_uid;

	public String getMng_unit_uid() {
		return mng_unit_uid;
	}

	public void setMng_unit_uid(String mng_unit_uid) {
		this.mng_unit_uid = mng_unit_uid;
	}
	
}


