/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	消费参数
 * @author    [jianana]   
 * @version   [V1.0, 2018年3月15日]
 * @package com.jw.hms.lps.m3540.f010.dto.LpsBnsMctrnCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月15日|jianana|新增|ConsumeParamDto.java新增
 */
@DrptDto(dtonm = "ConsumeParamDto",dtodrpt="消费参数")
public class ConsumeParamDto extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -7452456806002713200L;
	@DrptField(fieldnm="memberNo", fielddrpt="会员号",logged = ENUM_LOGGED.YES)
	private String memberNo;
	@DrptField(fieldnm = "businessStatus", fielddrpt = "业务状态")
	private String businessStatus;
	@DrptField(fieldnm="inputAmt", fielddrpt="金额",logged = ENUM_LOGGED.YES)
	private BigDecimal inputAmt;
	@DrptField(fieldnm="mctrnSysid", fielddrpt="交易请求系统")
	private String mctrnSysid;
	@DrptField(fieldnm="mctrnCmnt", fielddrpt="交易注释",logged = ENUM_LOGGED.YES)
	private String mctrnCmnt;
	@DrptField(fieldnm="bspostDt", fielddrpt="bspostDt")
	private Date bspostDt;
	/**房号**/
	private String roomNum;
	private String acctNo;
	/**会员密码*/
	@DrptField(fieldnm="loginPwd", fielddrpt="会员密码")
	private String loginPwd;
	@DrptField(fieldnm="mcfolioNo", fielddrpt="mcfolioNo")
	private String mcfolioNo;
	/**交易代码**/
	private Integer trncdId;
	//积分对应数据
	private MemberPointRequestDto requestDto;
	
	
	
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public MemberPointRequestDto getRequestDto() {
		return requestDto;
	}
	public void setRequestDto(MemberPointRequestDto requestDto) {
		this.requestDto = requestDto;
	}
	public Integer getTrncdId() {
		return trncdId;
	}
	public void setTrncdId(Integer trncdId) {
		this.trncdId = trncdId;
	}
	public String getMcfolioNo() {
		return mcfolioNo;
	}
	public void setMcfolioNo(String mcfolioNo) {
		this.mcfolioNo = mcfolioNo;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public Date getBspostDt() {
		return bspostDt;
	}
	public void setBspostDt(Date bspostDt) {
		this.bspostDt = bspostDt;
	}
	public String getMctrnCmnt() {
		return mctrnCmnt;
	}
	public void setMctrnCmnt(String mctrnCmnt) {
		this.mctrnCmnt = mctrnCmnt;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getBusinessStatus() {
		return businessStatus;
	}
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}
	public BigDecimal getInputAmt() {
		return inputAmt;
	}
	public void setInputAmt(BigDecimal inputAmt) {
		this.inputAmt = inputAmt;
	}
	public String getMctrnSysid() {
		return mctrnSysid;
	}
	public void setMctrnSysid(String mctrnSysid) {
		this.mctrnSysid = mctrnSysid;
	}
	
	
}
