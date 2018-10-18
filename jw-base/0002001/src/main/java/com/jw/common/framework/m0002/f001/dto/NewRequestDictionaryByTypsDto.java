/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.Constant.ENUM_STATUS_FLG;
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
@DrptDto(dtonm = "NewRequestDictionaryByTypsDto", dtodrpt = "字典请求dto")
public class NewRequestDictionaryByTypsDto extends RequestBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = -8365729854208874272L;

	@DrptField(fieldnm = "unitUid", fielddrpt = "单位unitUid")
	private String unitUid;

	@DrptField(fieldnm = "languageId", fielddrpt = "多语种ID")
	private Integer languageId;

	@DrptField(fieldnm = "salesId", fielddrpt = "销售点")
	private Integer salesId;
	/** 请求数据
	 * {
			"前端自定义类型  返回需要相同类型": {
				"字典表typ": 
					{
						"查询条件": 1,查询条件...
					},
				字典表typ...
			},
			前端自定义类型...
		}
	 *  **/
	@DrptField(fieldnm = "reqData", fielddrpt = "请求数据")
	private Map<String, Map<String, Map<String, String>>> reqData;

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

	public Map<String, Map<String, Map<String, String>>> getReqData() {
		return reqData;
	}

	public void setReqData(Map<String, Map<String, Map<String, String>>> reqData) {
		this.reqData = reqData;
	}
	
	public void add(String paramNm, String paramNm1, String key, String value){
		if(Objects.isNull(reqData)){
			reqData = new HashMap<>();
		}
		reqData.put(paramNm, new HashMap<>());
		reqData.get(paramNm).put(paramNm1, new HashMap<>());
		if(StringUtils.isNotEmpty(key)){
			reqData.get(paramNm).get(paramNm1).put(key, value);
		}
	}
	//全局有效标记
	private String statusFlg;
	public String getStatusFlg() {
		if(StringUtils.isBlank(statusFlg)){
			return ENUM_STATUS_FLG.VALID.getValue();
		}
		return statusFlg;
	}
	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}
}
