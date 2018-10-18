/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	充值参数
 * @author    [jianana]   
 * @version   [V1.0, 2018年3月7日]
 * @package com.jw.hms.lps.m3540.f010.dto.LpsSetChargepolicy
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月7日|jianana|新增|RechargeReqDto.java新增
 */
@DrptDto(dtonm = "RechargeReqDto",dtodrpt="充值参数")
public class RechargeReqDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 685959111899531765L;
	@DrptField(fieldnm="unitUid", fielddrpt="单位名称")
	private String unitUid;
	@DrptField(fieldnm="trncdId", fielddrpt="交易代码")
	private Integer trncdId;
	@DrptField(fieldnm="ccardtypId", fielddrpt="银行卡类型")
	private Integer ccardtypId;
	@DrptField(fieldnm="inputAmt", fielddrpt="金额")
	private BigDecimal inputAmt;
	@DrptField(fieldnm="mctrnRef", fielddrpt="参考号")
	private String mctrnRef;
	@DrptField(fieldnm="mctrnCmnt", fielddrpt="交易注释")
	private String mctrnCmnt;
	@DrptField(fieldnm="memberNo", fielddrpt="会员号")
	private String memberNo;
	@DrptField(fieldnm="acctNo", fielddrpt="账号")
	private String acctNo;
	@DrptField(fieldnm="roomNum", fielddrpt="房号")
	private String roomNum;
	@DrptField(fieldnm="arNo", fielddrpt="应收账号")
	private String arNo;
	@DrptField(fieldnm="mctrnSysid", fielddrpt="交易请求系统")
	private String mctrnSysid;
	@DrptField(fieldnm = "businessStatus", fielddrpt = "业务状态")
	private String businessStatus;
	/**CHRG充值    TCHRG代充值**/
	@DrptField(fieldnm = "rechageFlg", fielddrpt = "充值类型")
	private String rechageFlg;
	@DrptField(fieldnm="billNo", fielddrpt="单据号")
	private String billNo;
	/**会员密码*/
	@DrptField(fieldnm="loginPwd", fielddrpt="会员密码")
	private String loginPwd;
	/**充值收费策略**/
	@DrptField(fieldnm="chargepolicyId", fielddrpt="充值收费策略")
	private Integer chargepolicyId;
	@DrptField(fieldnm="finvcFlg", fielddrpt="开发票标识")
	private String finvcFlg;
	@DrptField(fieldnm="bstrnId", fielddrpt="bstrnId")
	private Integer bstrnId;
	@DrptField(fieldnm="bspostDt", fielddrpt="bspostDt")
	private Date bspostDt;
	
	public Integer getBstrnId() {
		return bstrnId;
	}
	public void setBstrnId(Integer bstrnId) {
		this.bstrnId = bstrnId;
	}
	public Date getBspostDt() {
		return bspostDt;
	}
	public void setBspostDt(Date bspostDt) {
		this.bspostDt = bspostDt;
	}
	public String getFinvcFlg() {
		return finvcFlg;
	}
	public void setFinvcFlg(String finvcFlg) {
		this.finvcFlg = finvcFlg;
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
	
	
	public String getRechageFlg() {
		return rechageFlg;
	}
	public void setRechageFlg(String rechageFlg) {
		this.rechageFlg = rechageFlg;
	}
	public String getBusinessStatus() {
		return businessStatus;
	}
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}
	public String getMctrnSysid() {
		return mctrnSysid;
	}
	public void setMctrnSysid(String mctrnSysid) {
		this.mctrnSysid = mctrnSysid;
	}
	public String getArNo() {
		return arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	
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
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public Integer getTrncdId() {
		return trncdId;
	}
	public void setTrncdId(Integer trncdId) {
		this.trncdId = trncdId;
	}
	public Integer getCcardtypId() {
		return ccardtypId;
	}
	public void setCcardtypId(Integer ccardtypId) {
		this.ccardtypId = ccardtypId;
	}
	public BigDecimal getInputAmt() {
		return inputAmt;
	}
	public void setInputAmt(BigDecimal inputAmt) {
		this.inputAmt = inputAmt;
	}
	
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMctrnRef() {
		return mctrnRef;
	}
	public void setMctrnRef(String mctrnRef) {
		this.mctrnRef = mctrnRef;
	}
	public String getMctrnCmnt() {
		return mctrnCmnt;
	}
	public void setMctrnCmnt(String mctrnCmnt) {
		this.mctrnCmnt = mctrnCmnt;
	}
	
}
