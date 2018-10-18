package com.jw.common.framework.m0002.f001.dto.mq.point;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.MqMsgBaseRequestDto;


/**
 * ## 类说明：
 * 	mq 会员积分
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2017年12月29日]
 * @package com.jw.hms.crm.m3540.f010.dto.LpsSetPointpolicy
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2017年12月29日|MiaoDaZhuang|新增|MqMemberPointRequestDto.java新增
*/
public class MqMemberPointRequestDto extends MqMsgBaseRequestDto implements Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5898546840354956211L;
	@DrptField(fieldnm = "memberUnitUid", fielddrpt = "会员酒店uid")
	private String memberUnitUid;
	public String getMemberUnitUid() {
		return memberUnitUid;
	}
	public void setMemberUnitUid(String memberUnitUid) {
		this.memberUnitUid = memberUnitUid;
	}
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
	@DrptField(fieldnm = "pointUnitUid", fielddrpt = "积分发生单位")
	private String pointUnitUid;
	
	public String getPointUnitUid() {
		return pointUnitUid;
	}
	public void setPointUnitUid(String pointUnitUid) {
		this.pointUnitUid = pointUnitUid;
	}
	public String getPointtrnSysid() {
		return pointtrnSysid;
	}
	public void setPointtrnSysid(String pointtrnSysid) {
		this.pointtrnSysid = pointtrnSysid;
	}
	@DrptField(fieldnm = "point", fielddrpt = "使用积分额", logged = ENUM_LOGGED.YES)
	private BigDecimal point;
	public BigDecimal getPoint() {
		return point;
	}
	public void setPoint(BigDecimal point) {
		this.point = point;
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
	 * 1 实体卡卡号
	 * 2 手机号
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
	//手工积分  1
	private String manualPoint;
	public String getManualPoint() {
		return manualPoint;
	}
	public void setManualPoint(String manualPoint) {
		this.manualPoint = manualPoint;
	}
	
}
