
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
@DrptDto(dtonm = "酒店图片信息数据传输对象", dtodrpt ="酒店图片信息数据传输对象")
public class UnitPicsDto  implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8098087867942321765L;
	@DrptField(fieldnm="picgrpId", fielddrpt="图片分组id")
	public Integer picgrpId;
	@DrptField(fieldnm="picgrpCd", fielddrpt="图片分组代码")
	public String picgrpCd;
	@DrptField(fieldnm="picgrpDrpt", fielddrpt="图片分组描述")
	public String picgrpDrpt;
	@DrptField(fieldnm="medialUrl", fielddrpt="酒店图片url")
	public String medialUrl;
	@DrptField(fieldnm="seq", fielddrpt="图片顺序号")
	public Integer seq;
//	（0：非头图标志，1：头图标志）
	@DrptField(fieldnm="firstFlg", fielddrpt="头图标志")
	public String firstFlg;
	public Integer getPicgrpId() {
		return picgrpId;
	}
	public void setPicgrpId(Integer picgrpId) {
		this.picgrpId = picgrpId;
	}
	public String getPicgrpCd() {
		return picgrpCd;
	}
	public void setPicgrpCd(String picgrpCd) {
		this.picgrpCd = picgrpCd;
	}
	public String getPicgrpDrpt() {
		return picgrpDrpt;
	}
	public void setPicgrpDrpt(String picgrpDrpt) {
		this.picgrpDrpt = picgrpDrpt;
	}
	public String getMedialUrl() {
		return medialUrl;
	}
	public void setMedialUrl(String medialUrl) {
		this.medialUrl = medialUrl;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getFirstFlg() {
		return firstFlg;
	}
	public void setFirstFlg(String firstFlg) {
		this.firstFlg = firstFlg;
	}

}
