/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	退款参数
 * @author    [jianana]   
 * @version   [V1.0, 2018年3月15日]
 * @package com.jw.hms.lps.m3540.f010.dto.LpsBnsMctrnCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月15日|jianana|新增|ConsumeParamDto.java新增
 */
@DrptDto(dtonm = "RefundParamDto",dtodrpt="退款参数")
public class RefundParamDto extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -680343597608166851L;
	@DrptField(fieldnm="memberNo", fielddrpt="会员号")
	private String memberNo;
	@DrptField(fieldnm = "businessStatus", fielddrpt = "业务状态")
	private String businessStatus;
	@DrptField(fieldnm="inputAmt", fielddrpt="金额")
	private BigDecimal inputAmt;
	@DrptField(fieldnm="mctrnSysid", fielddrpt="交易请求系统")
	private String mctrnSysid;
	@DrptField(fieldnm="mctrnCmnt", fielddrpt="交易注释")
	private String mctrnCmnt;
	@DrptField(fieldnm="trncdId", fielddrpt="交易代码")
	private Integer trncdId;
	/**REFND 退款   TREFND代退款**/
	@DrptField(fieldnm="refundFlg", fielddrpt="退款标识")
	private String refundFlg;
	@DrptField(fieldnm="billNo", fielddrpt="单据号")
	private String billNo;
	/**会员密码*/
	@DrptField(fieldnm="loginPwd", fielddrpt="会员密码")
	private String loginPwd;
	/**充值收费策略**/
	@DrptField(fieldnm="chargepolicyId", fielddrpt="充值收费策略")
	private Integer chargepolicyId;
	@DrptField(fieldnm="mctrnIds", fielddrpt="交易明细ID")
	private List<Integer> mctrnIds;
	@DrptField(fieldnm="mmctrnIds", fielddrpt="主交易明细ID")
	private List<Integer> mmctrnIds;
	@DrptField(fieldnm="mctrnRef", fielddrpt="参考号")
	private String mctrnRef;
	@DrptField(fieldnm="bspostDt", fielddrpt="bspostDt")
	private Date bspostDt;
	/**房号**/
	private String roomNum;
	private String acctNo;
	
	
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public Date getBspostDt() {
		return bspostDt;
	}
	public void setBspostDt(Date bspostDt) {
		this.bspostDt = bspostDt;
	}
	
	
	public String getMctrnRef() {
		return mctrnRef;
	}
	public void setMctrnRef(String mctrnRef) {
		this.mctrnRef = mctrnRef;
	}
	public List<Integer> getMmctrnIds() {
		return mmctrnIds;
	}
	public void setMmctrnIds(List<Integer> mmctrnIds) {
		this.mmctrnIds = mmctrnIds;
	}
	public List<Integer> getMctrnIds() {
		return mctrnIds;
	}
	public void setMctrnIds(List<Integer> mctrnIds) {
		this.mctrnIds = mctrnIds;
	}
	public Integer getChargepolicyId() {
		return chargepolicyId;
	}
	public void setChargepolicyId(Integer chargepolicyId) {
		this.chargepolicyId = chargepolicyId;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getRefundFlg() {
		return refundFlg;
	}
	public void setRefundFlg(String refundFlg) {
		this.refundFlg = refundFlg;
	}
	public Integer getTrncdId() {
		return trncdId;
	}
	public void setTrncdId(Integer trncdId) {
		this.trncdId = trncdId;
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
