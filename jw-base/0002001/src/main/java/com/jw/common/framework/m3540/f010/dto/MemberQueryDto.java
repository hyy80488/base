package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * 
 * ## 类说明：
 * 	会员查询条件Dto
 * @author    [jianana]   
 * @version   [V1.0, 2018年4月10日]
 * @package com.jw.hms.lps.m3540.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年4月10日|jianana|新增|MemberQueryDto.java新增
 */
public class MemberQueryDto extends RequestBaseDto implements Serializable   {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 4364032407895994696L;
	@DrptField(fieldnm = "memberNo", fielddrpt = "会员号")
	private String memberNo;
	@DrptField(fieldnm = "loginPwd", fielddrpt = "验证密码")
	private String loginPwd;
	@DrptField(fieldnm = "consumeCnt", fielddrpt = "消费记录条数")
	private Integer consumeCnt; 
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public Integer getConsumeCnt() {
		return consumeCnt;
	}
	public void setConsumeCnt(Integer consumeCnt) {
		this.consumeCnt = consumeCnt;
	}
	
}
