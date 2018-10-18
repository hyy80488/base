/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	字典请求dto 
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2017年1月9日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since 日期|作者|类型|内容
 * :----|:-----|:-----|:-----
 * 2017年1月9日|MiaoDaZhuang|新增|DictionaryRequestDto.java新增
*/
@DrptDto(dtonm = "RequestDictionaryDto", dtodrpt = "字典请求dto")
public class RequestDictionaryDto extends RequestBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/
	private static final long serialVersionUID = -8365729854208874272L;

	@DrptField(fieldnm = "groupCd", fielddrpt = "集团代码")
	private String groupCd;

	@DrptField(fieldnm = "unitCd", fielddrpt = "酒店代码")
	private String unitCd;

	/** 
	* @Fields typs :主表字典请求，{typs:["typ1","typ2"]}
	*/
	@DrptField(fieldnm = "typs", fielddrpt = "主表字典请求")
	private List<String> typs;
	@DrptField(fieldnm = "paramTyp", fielddrpt = "参数类型")
	private String paramTyp;

	public List<String> getTyps() {
		return typs;
	}

	public void setTyps(List<String> typs) {
		this.typs = typs;
	}

	public String getGroupCd() {
		return groupCd;
	}

	public void setGroupCd(String groupCd) {
		this.groupCd = groupCd;
	}

	public String getUnitCd() {
		return unitCd;
	}

	public void setUnitCd(String unitCd) {
		this.unitCd = unitCd;
	}

	public String getParamTyp() {
		return paramTyp;
	}

	public void setParamTyp(String paramTyp) {
		this.paramTyp = paramTyp;
	}

}
