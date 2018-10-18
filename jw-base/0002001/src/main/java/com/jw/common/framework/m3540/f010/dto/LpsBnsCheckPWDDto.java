
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.annotation.EnhanceFieldCrypt;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


public class LpsBnsCheckPWDDto extends RequestBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : gwm
	*/ 
	private static final long serialVersionUID = 4981004526449162778L;

	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "memberNo", fielddrpt = "会员编号",logged = ENUM_LOGGED.YES)
	private String memberNo;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码", nullable = "false", length = "40",logged = ENUM_LOGGED.YES)
	private String chainUid;

	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "loginPwd", fielddrpt = "登陆密码", nullable = "true", length = "100",logged = ENUM_LOGGED.YES)
	private String loginPwd;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "realcardNo", fielddrpt = "物理卡号（存储号，印刷号）", nullable = "true", length = "40",logged = ENUM_LOGGED.YES)
	private String realcardNo;
	
	@EnhanceFieldCrypt
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "loginphone_ctno", fielddrpt = "手机号码", nullable = "true", length = "500",logged = ENUM_LOGGED.YES)
	@Size(max=500)
	private String loginphone_ctno;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "checkPwdStus", fielddrpt = "校验密码结果", nullable = "true", length = "100",logged = ENUM_LOGGED.YES)
	private String checkPwdStus;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "altNm", fielddrpt = "姓名/别名", nullable = "true", length = "200")
	private String altNm;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "validedDate", fielddrpt = "有效结束日期", nullable = "true", length = "13")
	private java.util.Date validedDate;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "mctrnBal", fielddrpt = "可用储值余额", nullable = "true", length = "16")
	private BigDecimal mctrnBal;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "pointBal", fielddrpt = "可用积分余额", nullable = "true", length = "16")
	private BigDecimal pointBal;

	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getChainUid() {
		return chainUid;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getCheckPwdStus() {
		return checkPwdStus;
	}
	public void setCheckPwdStus(String checkPwdStus) {
		this.checkPwdStus = checkPwdStus;
	}
	public String getRealcardNo() {
		return realcardNo;
	}
	public void setRealcardNo(String realcardNo) {
		this.realcardNo = realcardNo;
	}
	public String getLoginphone_ctno() {
		return loginphone_ctno;
	}
	public void setLoginphone_ctno(String loginphone_ctno) {
		this.loginphone_ctno = loginphone_ctno;
	}
	public String getAltNm() {
		return altNm;
	}
	public void setAltNm(String altNm) {
		this.altNm = altNm;
	}
	public java.util.Date getValidedDate() {
		return validedDate;
	}
	public void setValidedDate(java.util.Date validedDate) {
		this.validedDate = validedDate;
	}
	public BigDecimal getMctrnBal() {
		return mctrnBal;
	}
	public void setMctrnBal(BigDecimal mctrnBal) {
		this.mctrnBal = mctrnBal;
	}
	public BigDecimal getPointBal() {
		return pointBal;
	}
	public void setPointBal(BigDecimal pointBal) {
		this.pointBal = pointBal;
	}
	
	

}

