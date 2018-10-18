/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.Constant.ENUM_STATUS_FLG;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	直销字典请求dto 
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2017年1月9日]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since 日期|作者|类型|内容
 * :----|:-----|:-----|:-----
 * 2017年1月9日|MiaoDaZhuang|新增|DictionaryRequestDto.java新增
*/
@DrptDto(dtonm = "DirectDictionaryReqDto", dtodrpt = "字典请求dto")
public class DirectDictionaryReqDto extends RequestBaseApiDto implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6119781157614347540L;
	/** 请求数据
	 * {
			"字典表typ": 
					{
						"查询条件": 1,查询条件...
					},
				字典表typ...
		}
	 *  **/
	@DrptField(fieldnm = "reqData", fielddrpt = "请求数据")
	private Map<String, Map<String, String>> reqData;
	
	public Map<String, Map<String, String>> getReqData() {
		return reqData;
	}
	public void setReqData(Map<String, Map<String, String>> reqData) {
		this.reqData = reqData;
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
