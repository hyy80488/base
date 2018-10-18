package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.common.framework.m0002.f001.dto.mq.point.LpsBnsConsumeDto;


/**
 * ## 类说明：
 * 	mq 会员积分
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2017年12月29日]
 * @package com.jw.hms.crm.m3540.f010.dto.LpsSetPointpolicy
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2017年12月29日|MiaoDaZhuang|新增|MqMemberPointRequestDto.java新增
*/
public class MemberPointRequestDto extends RequestBaseDto implements Serializable {
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5100770172611644331L;
	@DrptField(fieldnm = "memberNo", fielddrpt = "会员号")
	private String memberNo;
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	@DrptField(fieldnm = "pointpolicyTyp", fielddrpt = "积分类型")
	private String pointpolicyTyp;
	@DrptField(fieldnm = "date", fielddrpt = "日期")
	private Date date;
	@DrptField(fieldnm = "channelNo", fielddrpt = "渠道代码")
	private String channelNo;
	@DrptField(fieldnm = "profileNo", fielddrpt = "客使号")
	private String profileNo;
	@DrptField(fieldnm = "folioNo", fielddrpt = "前台结账单号", nullable = "true", length = "20")
	private String folioNo;
	@DrptField(fieldnm = "consumeDto", fielddrpt = "消费数据")
	private LpsBnsConsumeDto consumeDto;
	
	public String getFolioNo() {
		return folioNo;
	}
	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}
	public String getPointpolicyTyp() {
		return pointpolicyTyp;
	}
	public Date getDate() {
		return date;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public String getProfileNo() {
		return profileNo;
	}
	public void setPointpolicyTyp(String pointpolicyTyp) {
		this.pointpolicyTyp = pointpolicyTyp;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
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
	
	
	@DrptField(fieldnm = "funcTyp", fielddrpt = "积分记录类型")
	private String funcTyp;
	public String getFuncTyp() {
		return funcTyp;
	}
	public void setFuncTyp(String funcTyp) {
		this.funcTyp = funcTyp;
	}
	
	@DrptField(fieldnm = "pointtrnSysid", fielddrpt = "交易请求系统")
	private String pointtrnSysid;
	public String getPointtrnSysid() {
		return pointtrnSysid;
	}
	public void setPointtrnSysid(String pointtrnSysid) {
		this.pointtrnSysid = pointtrnSysid;
	}
	@DrptField(fieldnm = "pointUnitUid", fielddrpt = "积分发生单位")
	private String pointUnitUid;
	public String getPointUnitUid() {
		return pointUnitUid;
	}
	public void setPointUnitUid(String pointUnitUid) {
		this.pointUnitUid = pointUnitUid;
	}
	
	@DrptField(fieldnm = "lastconsumeDate", fielddrpt = "最后消费日")
	private Date lastconsumeDate;
	@DrptField(fieldnm = "consumeAmount", fielddrpt = "总消费金额")
	private BigDecimal consumeAmount;
	@DrptField(fieldnm = "consumeTimes", fielddrpt = "总消费次数")
	private BigDecimal consumeTimes;
	@DrptField(fieldnm = "consumeNights", fielddrpt = "总消费间夜数")
	private BigDecimal consumeNights;
	public Date getLastconsumeDate() {
		return lastconsumeDate;
	}
	public BigDecimal getConsumeAmount() {
		return consumeAmount;
	}
	public BigDecimal getConsumeTimes() {
		return consumeTimes;
	}
	public BigDecimal getConsumeNights() {
		return consumeNights;
	}
	public void setLastconsumeDate(Date lastconsumeDate) {
		this.lastconsumeDate = lastconsumeDate;
	}
	public void setConsumeAmount(BigDecimal consumeAmount) {
		this.consumeAmount = consumeAmount;
	}
	public void setConsumeTimes(BigDecimal consumeTimes) {
		this.consumeTimes = consumeTimes;
	}
	public void setConsumeNights(BigDecimal consumeNights) {
		this.consumeNights = consumeNights;
	}

	@DrptField(fieldnm = "wsNo", fielddrpt = "工作站号")
	private String wsNo;
	public String getWsNo() {
		return wsNo;
	}
	public void setWsNo(String wsNo) {
		this.wsNo = wsNo;
	}
	@DrptField(fieldnm = "memberPwd", fielddrpt = "会员密码")
	private String memberPwd;
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	
	/*
	 * 0 会员号
	 * 1 手机号
	 * 2 实体卡卡号
	 */
	@DrptField(fieldnm = "checkTyp", fielddrpt = "check方式")
	private String checkTyp;
	public String getCheckTyp() {
		if(StringUtils.isBlank(checkTyp)){
			return "0";
		}
		return checkTyp;
	}
	public void setCheckTyp(String checkTyp) {
		this.checkTyp = checkTyp;
	}
	/*
	 * 0 不检验
	 * 1 校验
	 */
	@DrptField(fieldnm = "checkHasPwd", fielddrpt = "check是否包含密码")
	private String checkHasPwd ;
	public String getCheckHasPwd() {
		return checkHasPwd;
	}
	public void setCheckHasPwd(String checkHasPwd) {
		this.checkHasPwd = checkHasPwd;
	}
	@DrptField(fieldnm = "loginphone", fielddrpt = "登陆手机")
	private String loginphone;
	@DrptField(fieldnm = "memberCard", fielddrpt = "会员卡")
	private String memberCard;

	public String getLoginphone() {
		return loginphone;
	}
	public String getMemberCard() {
		return memberCard;
	}
	public void setLoginphone(String loginphone) {
		this.loginphone = loginphone;
	}
	public void setMemberCard(String memberCard) {
		this.memberCard = memberCard;
	}
	//消费类型
	private String consumeTyp;
	public String getConsumeTyp() {
		return consumeTyp;
	}
	public void setConsumeTyp(String consumeTyp) {
		this.consumeTyp = consumeTyp;
	}
	
	//手工积分  1
	private String manualPoint;
	public String getManualPoint() {
		return manualPoint;
	}
	public void setManualPoint(String manualPoint) {
		this.manualPoint = manualPoint;
	}
	
	//酒店
	private String ppItemStr1;
	//销售点
	private Integer ppItemInt2;
	public String getPpItemStr1() {
		return ppItemStr1;
	}
	public Integer getPpItemInt2() {
		return ppItemInt2;
	}
	public void setPpItemStr1(String ppItemStr1) {
		this.ppItemStr1 = ppItemStr1;
	}
	public void setPpItemInt2(Integer ppItemInt2) {
		this.ppItemInt2 = ppItemInt2;
	}

	

}
