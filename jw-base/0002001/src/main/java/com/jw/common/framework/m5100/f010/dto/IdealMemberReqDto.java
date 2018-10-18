/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5100.f010.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.common.framework.m0002.f001.dto.mq.point.LpsBnsConsumeDto;

/**
 * ## 类说明：
 * 	会员交易
 * @author    [bwliu]   
 * @version   [V1.0, 2018年4月19日]
 * @package com.jw.common.framework.m5100.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年4月19日|jianana|新增|IdealMemberReqDto.java新增
 */
@DrptDto(dtonm = "IdealMemberReqDto",dtodrpt="会员交易")
public class IdealMemberReqDto extends RequestBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2132009419468005653L;
	//
	String htlCd;
	String icNum; 
	//积分和金额暂时不传，传消费明细项，然后计算金额和积分
	BigDecimal trnAmt;
	BigDecimal score; 
	
	//预定账号
	String acctNum;
	String notice;
	String operCd;
	String operPwd;
	//流水单号
	String billNo;
	String overLimit;//允许超限  0： 默认不超限，1：超限
	
	
	
	@DrptField(fieldnm = "memberUnitUid", fielddrpt = "会员酒店uid")
	private String memberUnitUid;
	@DrptField(fieldnm = "pointpolicyTyp", fielddrpt = "积分类型")
	private String pointpolicyTyp;
	@DrptField(fieldnm = "date", fielddrpt = "日期")
	private Date date;
	@DrptField(fieldnm = "channelNo", fielddrpt = "渠道代码")
	private String channelNo;
	@DrptField(fieldnm = "profileNo", fielddrpt = "客使号")
	private String profileNo;
	
	@DrptField(fieldnm = "consumeDto", fielddrpt = "消费数据")
	private LpsBnsConsumeDto consumeDto;
	@DrptField(fieldnm = "memberPwd", fielddrpt = "会员密码")
	private String memberPwd;
	//默认不校验 0：不校验   1：校验
	@DrptField(fieldnm = "checkPwd", fielddrpt = "是否校验")
	private String checkPwd;
	//默认处理：0：不处理   1：处理
	@DrptField(fieldnm = "pointDealFlg", fielddrpt = "积分处理标志")
	private String pointDealFlg;
	
	
	
	public String getPointDealFlg() {
		return pointDealFlg;
	}
	public void setPointDealFlg(String pointDealFlg) {
		this.pointDealFlg = pointDealFlg;
	}
	public String getCheckPwd() {
		return checkPwd;
	}
	public void setCheckPwd(String checkPwd) {
		this.checkPwd = checkPwd;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberUnitUid() {
		return memberUnitUid;
	}
	public void setMemberUnitUid(String memberUnitUid) {
		this.memberUnitUid = memberUnitUid;
	}
	public String getPointpolicyTyp() {
		return pointpolicyTyp;
	}
	public void setPointpolicyTyp(String pointpolicyTyp) {
		this.pointpolicyTyp = pointpolicyTyp;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getProfileNo() {
		return profileNo;
	}
	public void setProfileNo(String profileNo) {
		this.profileNo = profileNo;
	}
	public LpsBnsConsumeDto getConsumeDto() {
		return consumeDto;
	}
	public void setConsumeDto(LpsBnsConsumeDto consumeDto) {
		this.consumeDto = consumeDto;
	}
	public String getOverLimit() {
		return overLimit;
	}
	public void setOverLimit(String overLimit) {
		this.overLimit = overLimit;
	}
	public String getHtlCd() {
		return htlCd;
	}
	public void setHtlCd(String htlCd) {
		this.htlCd = htlCd;
	}
	public String getIcNum() {
		return icNum;
	}
	public void setIcNum(String icNum) {
		this.icNum = icNum;
	}
	public BigDecimal getTrnAmt() {
		return trnAmt;
	}
	public void setTrnAmt(BigDecimal trnAmt) {
		this.trnAmt = trnAmt;
	}
	public BigDecimal getScore() {
		return score;
	}
	public void setScore(BigDecimal score) {
		this.score = score;
	}
	public String getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getOperCd() {
		return operCd;
	}
	public void setOperCd(String operCd) {
		this.operCd = operCd;
	}
	public String getOperPwd() {
		return operPwd;
	}
	public void setOperPwd(String operPwd) {
		this.operPwd = operPwd;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

}
