
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.NumberUtil;
import com.jw.base.framework.core.util.StringUtil;

/**
 * 
 * ## 类说明：
 * 	直销查询酒店列表
 * @author    [zteng]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|zteng|新增|unitTagsDto.java新增
 */
@DrptDto(dtonm = "酒店标签信息数据传输对象", dtodrpt ="酒店标签信息数据传输对象")
public class UnitTagsDto  implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1553348809931130219L;
	@DrptField(fieldnm="tagId", fielddrpt="标签id")
	public Integer tagId;
	@DrptField(fieldnm="tagCd", fielddrpt="标签CD")
	public String tagCd;
	@DrptField(fieldnm="tagDrpt", fielddrpt="标签")
	public String tagDrpt;
	
	public String getTagCd() {
		return tagCd;
	}
	public void setTagCd(String tagCd) {
		this.tagCd = tagCd;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public String getTagDrpt() {
		return tagDrpt;
	}
	public void setTagDrpt(String tagDrpt) {
		this.tagDrpt = tagDrpt;
	}
	
	public void copyMapToDto(Map<String,Object> map){
		if(map!=null){
			this.tagId = NumberUtil.toInt(map.get("unittag_id"), null);
			this.tagDrpt = StringUtil.toString(map.get("param_drpt"), null);
			this.tagCd = StringUtil.toString(map.get("param_cd"), null);
		}
	}

}
