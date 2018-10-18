
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

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
public class UnitNoticesDto  implements java.io.Serializable {

/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7358541358689060969L;
	//	备注类型（101，交通路线，102，周边生活，103，周边景点）
	@DrptField(fieldnm="noticeTyp", fielddrpt="备注类型")
	public String noticeTyp;
	@DrptField(fieldnm="noticeCmnt", fielddrpt="备注内容")
	public String noticeCmnt;
	public String getNoticeTyp() {
		return noticeTyp;
	}
	public void setNoticeTyp(String noticeTyp) {
		this.noticeTyp = noticeTyp;
	}
	public String getNoticeCmnt() {
		return noticeCmnt;
	}
	public void setNoticeCmnt(String noticeCmnt) {
		this.noticeCmnt = noticeCmnt;
	}

}
