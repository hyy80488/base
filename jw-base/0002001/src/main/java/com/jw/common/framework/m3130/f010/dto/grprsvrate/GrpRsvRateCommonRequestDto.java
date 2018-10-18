/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	价格/房含参数
 * @author    [jianana]   
 * @version   [V1.0, 2017年3月31日]
 * @package com.jw.hms.cmm.m3130.f010.dto.GrpRsvRate
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月31日|jianana|新增|GrpRsvRateCommonRequestDto.java新增
 */
@DrptDto(dtonm = "价格/房含参数",dtodrpt="价格/房含参数")
public class GrpRsvRateCommonRequestDto extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 7132446858858799189L;
	@DrptField(fieldnm="languageId",fielddrpt="语种ID")
	private Integer languageId;
	@DrptField(fieldnm="intIds",fielddrpt="Integer参数集合")
	private List<Integer> intIds = new ArrayList<>();
	@DrptField(fieldnm="strNos",fielddrpt="String参数集合")
	private List<String> strNos = new ArrayList<>();
	@DrptField(fieldnm="objMaps",fielddrpt="map对象集合")
	private List<Map<String,Object>> objMaps = new ArrayList<>();
	@DrptField(fieldnm="statusFlg",fielddrpt="有效无效")
	private String statusFlg;
	
	public Integer getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	public List<Integer> getIntIds() {
		return intIds;
	}
	public void setIntIds(List<Integer> intIds) {
		this.intIds = intIds;
	}
	public List<String> getStrNos() {
		return strNos;
	}
	public void setStrNos(List<String> strNos) {
		this.strNos = strNos;
	}
	public List<Map<String, Object>> getObjMaps() {
		return objMaps;
	}
	public void setObjMaps(List<Map<String, Object>> objMaps) {
		this.objMaps = objMaps;
	}
	public String getStatusFlg() {
		if(StringUtils.isEmpty(statusFlg)){
			return Constant.ENUM_STATUS_FLG.VALID.getValue();
		}
		return statusFlg;
	}
	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

}
