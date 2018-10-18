package com.jw.common.framework.m5100.f010.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class IdealMemberResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 3773387037558284493L;
	@DrptField(fieldnm = "altNm", fielddrpt = "姓名/别名", nullable = "true", length = "200")
	private String altNm;
	@DrptField(fieldnm = "memberNo", fielddrpt = "会员编号",logged = ENUM_LOGGED.YES)
	private String memberNo;
	@DrptField(fieldnm = "validedDate", fielddrpt = "有效结束日期", nullable = "true", length = "13")
	private java.util.Date validedDate;
	@DrptField(fieldnm = "loginphoneCtno", fielddrpt = "手机号码", nullable = "true", length = "500")
	private String loginphoneCtno;
	
	
	@DrptField(fieldnm = "point", fielddrpt = "本次积分", nullable = "true")
	private BigDecimal point;
	@DrptField(fieldnm = "cost", fielddrpt = "本次消费", nullable = "true")
	private BigDecimal cost;
	@DrptField(fieldnm = "pointBal", fielddrpt = "积分余额", nullable = "true", length = "16")
	private BigDecimal pointBal;
	@DrptField(fieldnm = "totalPoint", fielddrpt = "累计积分")
	private BigDecimal totalPoint ;
	@DrptField(fieldnm = "usePoint", fielddrpt = "已使用积分")
	private BigDecimal usePoint ;
	@DrptField(fieldnm = "totoalBal", fielddrpt = "累计充值")
	private BigDecimal totoalBal; 
	@DrptField(fieldnm = "giveBal", fielddrpt = "赠送金额")
	private BigDecimal giveBal;  
	@DrptField(fieldnm = "mctrnBal", fielddrpt = "储值余额", nullable = "true", length = "16")
	private BigDecimal mctrnBal;
	
	
	@DrptField(fieldnm = "teleCtno", fielddrpt = "电话号码", nullable = "true", length = "500")
	private String teleCtno;
	
	private String emailEml;
	
	@DrptField(fieldnm = "contacttypId", fielddrpt = "联系方式", nullable = "true", length = "4")
	private Integer contacttypId;

	@DrptField(fieldnm = "contactCtno", fielddrpt = "联系号码", nullable = "true", length = "500")
	private String contactCtno;
	
	@DrptField(fieldnm = "memo", fielddrpt = "备注")
	private String memo;  
	@DrptField(fieldnm = "card", fielddrpt = "卡号")
	private String card;  
	@DrptField(fieldnm = "recard", fielddrpt = "实体卡号")
	private String recard;  
	@DrptField(fieldnm = "identityCard", fielddrpt = "身份证")
	private String identityCard;  
	@DrptField(fieldnm = "memberRank", fielddrpt = "会员等级")
	private String memberRank;
	public String getAltNm() {
		return altNm;
	}
	public void setAltNm(String altNm) {
		this.altNm = altNm;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public java.util.Date getValidedDate() {
		return validedDate;
	}
	public void setValidedDate(java.util.Date validedDate) {
		this.validedDate = validedDate;
	}
	public String getLoginphoneCtno() {
		return loginphoneCtno;
	}
	public void setLoginphoneCtno(String loginphoneCtno) {
		this.loginphoneCtno = loginphoneCtno;
	}
	public BigDecimal getPoint() {
		return point;
	}
	public void setPoint(BigDecimal point) {
		this.point = point;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public BigDecimal getPointBal() {
		return pointBal;
	}
	public void setPointBal(BigDecimal pointBal) {
		this.pointBal = pointBal;
	}
	public BigDecimal getTotalPoint() {
		return totalPoint;
	}
	public void setTotalPoint(BigDecimal totalPoint) {
		this.totalPoint = totalPoint;
	}
	public BigDecimal getUsePoint() {
		return usePoint;
	}
	public void setUsePoint(BigDecimal usePoint) {
		this.usePoint = usePoint;
	}
	public BigDecimal getTotoalBal() {
		return totoalBal;
	}
	public void setTotoalBal(BigDecimal totoalBal) {
		this.totoalBal = totoalBal;
	}
	public BigDecimal getGiveBal() {
		return giveBal;
	}
	public void setGiveBal(BigDecimal giveBal) {
		this.giveBal = giveBal;
	}
	public BigDecimal getMctrnBal() {
		return mctrnBal;
	}
	public void setMctrnBal(BigDecimal mctrnBal) {
		this.mctrnBal = mctrnBal;
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
	public Integer getContacttypId() {
		return contacttypId;
	}
	public void setContacttypId(Integer contacttypId) {
		this.contacttypId = contacttypId;
	}
	public String getContactCtno() {
		return contactCtno;
	}
	public void setContactCtno(String contactCtno) {
		this.contactCtno = contactCtno;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getRecard() {
		return recard;
	}
	public void setRecard(String recard) {
		this.recard = recard;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getMemberRank() {
		return memberRank;
	}
	public void setMemberRank(String memberRank) {
		this.memberRank = memberRank;
	}  
	
}
