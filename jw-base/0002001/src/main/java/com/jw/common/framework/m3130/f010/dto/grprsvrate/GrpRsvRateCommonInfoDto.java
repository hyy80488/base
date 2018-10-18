
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/** 
 * ## 类说明：
 * 	价格/房含数据
 * @author    [jianana]   
 * @version   [V1.0, 2017年3月31日]
 * @package com.jw.hms.cmm.m3130.f010.dto.GrpRsvRate
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月31日|jianana|新增|GrpRsvRateInfoDto.java新增
 */
@DrptDto(dtonm = "价格/房含数据",dtodrpt="价格/房含数据")
public class GrpRsvRateCommonInfoDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -6046410644592692906L;
	@DrptField(fieldnm="objMap",fielddrpt="map对象")
	private Map<String,Object> objMap = new HashMap<>();
	@DrptField(fieldnm="objMaps",fielddrpt="map对象集合")
	private List<Map<String,Object>> objMaps = new ArrayList<>();
	@DrptField(fieldnm="objMapKey",fielddrpt="map对象")
	private Map<String,Map<String,Object>> objMapKey = new HashMap<>();
	public Map<String, Object> getObjMap() {
		return objMap;
	}


	public void setObjMap(Map<String, Object> objMap) {
		this.objMap = objMap;
	}


	public List<Map<String, Object>> getObjMaps() {
		return objMaps;
	}


	public void setObjMaps(List<Map<String, Object>> objMaps) {
		this.objMaps = objMaps;
	}

	public Map<String, Map<String, Object>> getObjMapKey() {
		return objMapKey;
	}


	public void setObjMapKey(Map<String, Map<String, Object>> objMapKey) {
		this.objMapKey = objMapKey;
	}


	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
}

