/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5100.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	会员查询
 * @author    [bwliu]   
 * @version   [V1.0, 2018年4月19日]
 * @package com.jw.common.framework.m5100.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年4月19日|jianana|新增|MemberQueryReqDto.java新增
 */
@DrptDto(dtonm = "MemberQueryReqDto",dtodrpt="会员查询")
public class MemberQueryReqDto extends RequestBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2906874783948939733L;
	//会员卡号（针对crs使用）公共环境：8808900000027818
	private String icNum;
	//参考号（针对门户网站使用配合ic_pwd进行登录和用户信息查询）
	private String icRef;
	//用户密码
	private String icPwd;
	//会员手机号  公共环境：13800138000
	private String mobile;
	//证件号码
	private String crtfNum;
	//综合筛选信息
//	该字段筛选会员卡号、参考号、邮箱、手机号中间关系为”或”
	private String other;
//	是否不为登录操作当为判断会员是否重复的时候随时用true，当为会员登录时用false.
	private Boolean isNotlogin;
	public String getIcNum() {
		return icNum;
	}
	public void setIcNum(String icNum) {
		this.icNum = icNum;
	}
	public String getIcRef() {
		return icRef;
	}
	public void setIcRef(String icRef) {
		this.icRef = icRef;
	}
	public String getIcPwd() {
		return icPwd;
	}
	public void setIcPwd(String icPwd) {
		this.icPwd = icPwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCrtfNum() {
		return crtfNum;
	}
	public void setCrtfNum(String crtfNum) {
		this.crtfNum = crtfNum;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public Boolean getIsNotlogin() {
		return isNotlogin;
	}
	public void setIsNotlogin(Boolean isNotlogin) {
		this.isNotlogin = isNotlogin;
	}
	
	
}
