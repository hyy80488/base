
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/** 
 * ## 类说明：
 * 	会员返回信息
 * @author    [jianana]   
 * @version   [V1.0, 2018年4月10日]
 * @package com.jw.hms.lps.m3540.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年4月10日|jianana|新增|MemberResultDto.java新增
 */
@DrptDto(dtonm = "MemberResultDto",dtodrpt="会员返回信息")
public class MemberResultDto extends ResponseBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 8973443696477896070L;

	@DrptField(fieldnm="memberNo", fielddrpt="会员号")
	private String memberNo;
	@DrptField(fieldnm="memberrankId", fielddrpt="会员等级")
	private Integer memberrankId;
	@DrptField(fieldnm="memberrankDrpt", fielddrpt="会员等级描述")
	private String memberrankDrpt;
	@DrptField(fieldnm="memberStus", fielddrpt="会员状态")
	private String memberStus;
	@DrptField(fieldnm="unitUid", fielddrpt="单位代码")
	private String unitUid;
	@DrptField(fieldnm="unitNm", fielddrpt="单位名称")
	private String unitNm;
	@DrptField(fieldnm="loginCd", fielddrpt="登录名")
	private String loginCd;
	@DrptField(fieldnm="teleCtno", fielddrpt="电话")
	private String teleCtno;
	@DrptField(fieldnm="emailEml", fielddrpt="邮件")
	private String emailEml;
	@DrptField(fieldnm="contactCtno", fielddrpt="联系方式")
	private String contactCtno;
	@DrptField(fieldnm="loginphoneCtno", fielddrpt="登陆电话")
	private String loginphoneCtno;
	@DrptField(fieldnm="address", fielddrpt="地址")
	private String address;
	@DrptField(fieldnm="memo", fielddrpt="备注")
	private String memo;
	@DrptField(fieldnm = "firstNm", fielddrpt = "firstNm", nullable = "true", length = "100")
	private String firstNm;
	@DrptField(fieldnm = "middleNm", fielddrpt = "middleNm", nullable = "true", length = "100")
	private String middleNm;
	@DrptField(fieldnm = "lastNm", fielddrpt = "lastNm", nullable = "true", length = "100")
	private String lastNm;
	@DrptField(fieldnm = "altNm", fielddrpt = "altNm", nullable = "true", length = "200")
	private String altNm;
	@DrptField(fieldnm="certificateIdcd", fielddrpt="证件号码")
	private String certificateIdcd;
	
	/**积分信息**/
	@DrptField(fieldnm="balPoint", fielddrpt="积分余额")
	private BigDecimal balPoint;
	@DrptField(fieldnm="totalPoint", fielddrpt="累计积分")
	private BigDecimal totalPoint;
	@DrptField(fieldnm="givePoint", fielddrpt="赠送积分")
	private BigDecimal givePoint;
	@DrptField(fieldnm="alreadyUsePoint", fielddrpt="已经使用积分")
	private BigDecimal alreadyUsePoint;
	/**储值信息**/
	@DrptField(fieldnm="balAmt", fielddrpt="储值余额")
	private BigDecimal balAmt;
	@DrptField(fieldnm="giveAmt", fielddrpt="储值余额赠送余额")
	private BigDecimal giveAmt;
	@DrptField(fieldnm="totalAmt", fielddrpt="累计充值")
	private BigDecimal totalAmt;
	@DrptField(fieldnm="totalGiveAmt", fielddrpt="累计充值赠送金额")
	private BigDecimal totalGiveAmt;
	@DrptField(fieldnm="noInvoiceAmt", fielddrpt="未开票金额")
	private BigDecimal noInvoiceAmt;
	
	@DrptField(fieldnm="consumeAmount", fielddrpt="累计消费")
	private BigDecimal consumeAmount;
	@DrptField(fieldnm="authAmt", fielddrpt="冻结金额")
	private BigDecimal authAmt;
	@DrptField(fieldnm="lastconsumeDate", fielddrpt="最近消费日期")
	private Date lastconsumeDate;
	/**卡片信息**/
	@DrptField(fieldnm="mcardDtos", fielddrpt="会员卡信息")
	private List<Map<String, Object>> mcardDtos;
	/**退会信息**/
	@DrptField(fieldnm="quitDate", fielddrpt="退会日期")
	private Date quitDate;
	@DrptField(fieldnm="quitreasonId", fielddrpt="退会原因")
	private Integer quitreasonId;
	@DrptField(fieldnm="lastconsumeDate", fielddrpt="退会原因描述")
	private String quitreasonDrpt;
	
	@DrptField(fieldnm="consumeMaps", fielddrpt="消费记录")
	private List<Map<String, Object>> consumeMaps;
	
	
	
	public BigDecimal getNoInvoiceAmt() {
		return noInvoiceAmt;
	}


	public void setNoInvoiceAmt(BigDecimal noInvoiceAmt) {
		this.noInvoiceAmt = noInvoiceAmt;
	}


	public String getLoginphoneCtno() {
		return loginphoneCtno;
	}


	public void setLoginphoneCtno(String loginphoneCtno) {
		this.loginphoneCtno = loginphoneCtno;
	}


	public String getCertificateIdcd() {
		return certificateIdcd;
	}


	public void setCertificateIdcd(String certificateIdcd) {
		this.certificateIdcd = certificateIdcd;
	}


	public String getMemberNo() {
		return memberNo;
	}


	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}


	public Integer getMemberrankId() {
		return memberrankId;
	}


	public void setMemberrankId(Integer memberrankId) {
		this.memberrankId = memberrankId;
	}


	public String getMemberrankDrpt() {
		return memberrankDrpt;
	}


	public void setMemberrankDrpt(String memberrankDrpt) {
		this.memberrankDrpt = memberrankDrpt;
	}


	public String getMemberStus() {
		return memberStus;
	}


	public void setMemberStus(String memberStus) {
		this.memberStus = memberStus;
	}


	public String getUnitUid() {
		return unitUid;
	}


	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}


	public String getUnitNm() {
		return unitNm;
	}


	public void setUnitNm(String unitNm) {
		this.unitNm = unitNm;
	}


	public String getLoginCd() {
		return loginCd;
	}


	public void setLoginCd(String loginCd) {
		this.loginCd = loginCd;
	}


	public String getTeleCtno() {
		return teleCtno;
	}


	public void setTeleCtno(String teleCtno) {
		this.teleCtno = teleCtno;
	}


	public String getEmailEml() {
		return emailEml;
	}


	public void setEmailEml(String emailEml) {
		this.emailEml = emailEml;
	}


	public String getContactCtno() {
		return contactCtno;
	}


	public void setContactCtno(String contactCtno) {
		this.contactCtno = contactCtno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getFirstNm() {
		return firstNm;
	}


	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}


	public String getMiddleNm() {
		return middleNm;
	}


	public void setMiddleNm(String middleNm) {
		this.middleNm = middleNm;
	}


	public String getLastNm() {
		return lastNm;
	}


	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}


	public String getAltNm() {
		return altNm;
	}


	public void setAltNm(String altNm) {
		this.altNm = altNm;
	}


	public BigDecimal getBalPoint() {
		return balPoint;
	}


	public void setBalPoint(BigDecimal balPoint) {
		this.balPoint = balPoint;
	}


	public BigDecimal getTotalPoint() {
		return totalPoint;
	}


	public void setTotalPoint(BigDecimal totalPoint) {
		this.totalPoint = totalPoint;
	}


	public BigDecimal getGivePoint() {
		return givePoint;
	}


	public void setGivePoint(BigDecimal givePoint) {
		this.givePoint = givePoint;
	}


	public BigDecimal getAlreadyUsePoint() {
		return alreadyUsePoint;
	}


	public void setAlreadyUsePoint(BigDecimal alreadyUsePoint) {
		this.alreadyUsePoint = alreadyUsePoint;
	}


	public BigDecimal getBalAmt() {
		return balAmt;
	}


	public void setBalAmt(BigDecimal balAmt) {
		this.balAmt = balAmt;
	}


	public BigDecimal getGiveAmt() {
		return giveAmt;
	}


	public void setGiveAmt(BigDecimal giveAmt) {
		this.giveAmt = giveAmt;
	}


	public BigDecimal getTotalAmt() {
		return totalAmt;
	}


	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}


	public BigDecimal getTotalGiveAmt() {
		return totalGiveAmt;
	}


	public void setTotalGiveAmt(BigDecimal totalGiveAmt) {
		this.totalGiveAmt = totalGiveAmt;
	}


	public BigDecimal getConsumeAmount() {
		return consumeAmount;
	}


	public void setConsumeAmount(BigDecimal consumeAmount) {
		this.consumeAmount = consumeAmount;
	}


	public BigDecimal getAuthAmt() {
		return authAmt;
	}


	public void setAuthAmt(BigDecimal authAmt) {
		this.authAmt = authAmt;
	}


	public Date getLastconsumeDate() {
		return lastconsumeDate;
	}


	public void setLastconsumeDate(Date lastconsumeDate) {
		this.lastconsumeDate = lastconsumeDate;
	}


	public List<Map<String, Object>> getMcardDtos() {
		return mcardDtos;
	}


	public void setMcardDtos(List<Map<String, Object>> mcardDtos) {
		this.mcardDtos = mcardDtos;
	}


	public Date getQuitDate() {
		return quitDate;
	}


	public void setQuitDate(Date quitDate) {
		this.quitDate = quitDate;
	}


	public Integer getQuitreasonId() {
		return quitreasonId;
	}


	public void setQuitreasonId(Integer quitreasonId) {
		this.quitreasonId = quitreasonId;
	}


	public String getQuitreasonDrpt() {
		return quitreasonDrpt;
	}


	public void setQuitreasonDrpt(String quitreasonDrpt) {
		this.quitreasonDrpt = quitreasonDrpt;
	}


	public List<Map<String, Object>> getConsumeMaps() {
		return consumeMaps;
	}


	public void setConsumeMaps(List<Map<String, Object>> consumeMaps) {
		this.consumeMaps = consumeMaps;
	}

}

