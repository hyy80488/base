/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	查询会员相关信息
 * @author    [jianana]   
 * @version   [V1.0, 2017年12月19日]
 * @package com.jw.hms.crm.m3540.f010.dto.LpsBnsMember
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年12月19日|jianana|新增|MemberParamDto.java新增
 */
@DrptDto(dtonm = "MemberParamDto",dtodrpt="查询会员相关信息")
public class MemberParamDto extends RequestBaseDto implements Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 8132214251463640304L;
	@DrptField(fieldnm = "memberNo", fielddrpt = "会员号")
	private String memberNo;
	@DrptField(fieldnm = "mcardNo", fielddrpt = "卡号")
	private String mcardNo;
	@DrptField(fieldnm = "memberNos", fielddrpt = "会员号集合")
	private List<String> memberNos;
	
	public String getMcardNo() {
		return mcardNo;
	}
	public void setMcardNo(String mcardNo) {
		this.mcardNo = mcardNo;
	}
	public List<String> getMemberNos() {
		return memberNos;
	}
	public void setMemberNos(List<String> memberNos) {
		this.memberNos = memberNos;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
}
