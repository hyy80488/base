/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import com.jw.common.framework.m0002.f001.dto.RequestBaseApiDto;

public class CrsDirectMemberDto extends RequestBaseApiDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 644652703922050928L;

	private String phoneNo;
	private String loginFlg;
	private String verificationCode;
	private String loginPwd;
	private String memberNo;
	private String fastQuery;
	
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getFastQuery() {
		return fastQuery;
	}
	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(String loginFlg) {
		this.loginFlg = loginFlg;
	}
	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
}
