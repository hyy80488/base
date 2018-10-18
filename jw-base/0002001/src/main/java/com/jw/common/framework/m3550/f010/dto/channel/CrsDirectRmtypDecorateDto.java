/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.channel;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
@DrptDto(dtonm = "CrsDirectRmtypDecorateDto",dtodrpt="单位房型摆设")
public class CrsDirectRmtypDecorateDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -3158371423612180942L;
	@DrptField(fieldnm="decorateTyp",fielddrpt="摆设类型（BEDTYP：摆床）")
	private String decorateTyp;
	@DrptField(fieldnm="entityNums",fielddrpt="数量")
	private Integer entityNums;
	@DrptField(fieldnm="entitySize",fielddrpt="宽度")
	private String entitySize;
	@DrptField(fieldnm="bedtypDrpt",fielddrpt="摆设名称")
	private String bedtypDrpt;
	@DrptField(fieldnm="bedtypCd",fielddrpt="摆设cd")
	private String bedtypCd;
	@DrptField(fieldnm="bedtypId",fielddrpt="摆设名称")
	private Integer bedtypId;
	@DrptField(fieldnm="memo",fielddrpt="备注")
	private String memo;
	
	public String getBedtypCd() {
		return bedtypCd;
	}
	public void setBedtypCd(String bedtypCd) {
		this.bedtypCd = bedtypCd;
	}
	public String getBedtypDrpt() {
		return bedtypDrpt;
	}
	public void setBedtypDrpt(String bedtypDrpt) {
		this.bedtypDrpt = bedtypDrpt;
	}
	public Integer getBedtypId() {
		return bedtypId;
	}
	public void setBedtypId(Integer bedtypId) {
		this.bedtypId = bedtypId;
	}
	public String getDecorateTyp() {
		return decorateTyp;
	}
	public void setDecorateTyp(String decorateTyp) {
		this.decorateTyp = decorateTyp;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Integer getEntityNums() {
		return entityNums;
	}
	public void setEntityNums(Integer entityNums) {
		this.entityNums = entityNums;
	}
	public String getEntitySize() {
		return entitySize;
	}
	public void setEntitySize(String entitySize) {
		this.entitySize = entitySize;
	}
	
}
