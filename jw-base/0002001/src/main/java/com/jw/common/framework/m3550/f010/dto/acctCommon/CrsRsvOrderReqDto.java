/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.util.ListUtil;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class CrsRsvOrderReqDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5170774442390969132L;
	
	private List<CrsRsvAccountDto> accountDtos;
	
	/**渠道订单号*/
	private String chnlNo;
	/**PMS接收的CRS号*/
	private String crsNum;
	/**订单类型*/
	private String crsorderTyp;
	/**订单状态 1 正常；2  取消；0  临时（用于预付、担保未完成时）*/
	private String crsorderStus;
	/**个人团体标志 0个人   1团体*/
	private String igFlg;
	/**订单来源   ‘0’：本地预定 ‘1’:集团中央预定  ‘2’:有房号集团中央预订 ‘3’：switch预定*/
	private String resvsrcTyp;
	/**系统渠道代码*/
	private Integer syschannelId;
	/**switch代码   渠道获取*/
	private String switchNo;
	/**订单来源渠道代码  渠道获取*/
	private String channelNo;
	/**订单来源单位ID  渠道获取*/
	private String unitUid;
	/**协议公司号  渠道获取*/
	private String negoCorpNo;
	/**会员属性*/
	private String memberFlg;
	/**线上订单支付属性*/
	private String onlinepaymentTyp;
	/**线上押金授信机构*/
	private Integer creditinstId;
	/**线上押金金额*/
	private BigDecimal onlinedepositAmt;
	/**接口备注*/
	private String ifMemo;
	/**发送状态*/
	private String sendStus;
	/**入住审核状态*/
	private String checkinCheckStus;
	/**离店审核状态*/
	private String checkoutCheckStus;
	/**现转预 OrderTyp*/
	private String orderStr1;
	/**会员卡号*/
	private String orderStr2;
	/**会员等级*/
	private String orderStr3;
	/**担保标识  0：无担保，1：有担保，9：无需担保**/
	private String guaranteeFlg;
	/**最晚入住时间**/
	private Date latestCheckInTm;
	/**PMS订单前缀**/
	private String crsnoPrefix;
	private Date nowDt;
	/**房费合计**/
	private BigDecimal amountTax;
	/**会员号**/
	private String memberNo;
	/**客史**/
	private String profileNo;
	/**联系方式**/
	private String contactCtno;
	/**支付状态**/
	private String payStus;
	/**最晚支付时间**/
	private Date payEndtm;
	
	
	public Date getPayEndtm() {
		return payEndtm;
	}
	public void setPayEndtm(Date payEndtm) {
		this.payEndtm = payEndtm;
	}
	public String getPayStus() {
		return payStus;
	}
	public void setPayStus(String payStus) {
		this.payStus = payStus;
	}
	public String getContactCtno() {
		return contactCtno;
	}
	public void setContactCtno(String contactCtno) {
		this.contactCtno = contactCtno;
	}
	public String getProfileNo() {
		return profileNo;
	}
	public void setProfileNo(String profileNo) {
		this.profileNo = profileNo;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public BigDecimal getAmountTax() {
		return amountTax;
	}
	public void setAmountTax(BigDecimal amountTax) {
		this.amountTax = amountTax;
	}
	public Date getNowDt() {
		return nowDt;
	}
	public void setNowDt(Date nowDt) {
		this.nowDt = nowDt;
	}
	public String getCrsnoPrefix() {
		return crsnoPrefix;
	}
	public void setCrsnoPrefix(String crsnoPrefix) {
		this.crsnoPrefix = crsnoPrefix;
	}
	public Date getLatestCheckInTm() {
		return latestCheckInTm;
	}
	public void setLatestCheckInTm(Date latestCheckInTm) {
		this.latestCheckInTm = latestCheckInTm;
	}
	public String getGuaranteeFlg() {
		return guaranteeFlg;
	}
	public void setGuaranteeFlg(String guaranteeFlg) {
		this.guaranteeFlg = guaranteeFlg;
	}
	public List<CrsRsvAccountDto> getAccountDtos() {
		if(ListUtil.isEmpty(accountDtos)){
			accountDtos = new ArrayList<>();
		}
		return accountDtos;
	}
	public void setAccountDtos(List<CrsRsvAccountDto> accountDtos) {
		this.accountDtos = accountDtos;
	}
	public String getChnlNo() {
		return chnlNo;
	}
	public void setChnlNo(String chnlNo) {
		this.chnlNo = chnlNo;
	}
	public String getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}
	public String getCrsorderTyp() {
		return crsorderTyp;
	}
	public void setCrsorderTyp(String crsorderTyp) {
		this.crsorderTyp = crsorderTyp;
	}
	public String getCrsorderStus() {
		return crsorderStus;
	}
	public void setCrsorderStus(String crsorderStus) {
		this.crsorderStus = crsorderStus;
	}
	public String getIgFlg() {
		return igFlg;
	}
	public void setIgFlg(String igFlg) {
		this.igFlg = igFlg;
	}
	public String getResvsrcTyp() {
		return resvsrcTyp;
	}
	public void setResvsrcTyp(String resvsrcTyp) {
		this.resvsrcTyp = resvsrcTyp;
	}
	public Integer getSyschannelId() {
		return syschannelId;
	}
	public void setSyschannelId(Integer syschannelId) {
		this.syschannelId = syschannelId;
	}
	public String getSwitchNo() {
		return switchNo;
	}
	public void setSwitchNo(String switchNo) {
		this.switchNo = switchNo;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public String getNegoCorpNo() {
		return negoCorpNo;
	}
	public void setNegoCorpNo(String negoCorpNo) {
		this.negoCorpNo = negoCorpNo;
	}
	public String getMemberFlg() {
		return memberFlg;
	}
	public void setMemberFlg(String memberFlg) {
		this.memberFlg = memberFlg;
	}
	public String getOnlinepaymentTyp() {
		return onlinepaymentTyp;
	}
	public void setOnlinepaymentTyp(String onlinepaymentTyp) {
		this.onlinepaymentTyp = onlinepaymentTyp;
	}
	public Integer getCreditinstId() {
		return creditinstId;
	}
	public void setCreditinstId(Integer creditinstId) {
		this.creditinstId = creditinstId;
	}
	public BigDecimal getOnlinedepositAmt() {
		return onlinedepositAmt;
	}
	public void setOnlinedepositAmt(BigDecimal onlinedepositAmt) {
		this.onlinedepositAmt = onlinedepositAmt;
	}
	public String getIfMemo() {
		return ifMemo;
	}
	public void setIfMemo(String ifMemo) {
		this.ifMemo = ifMemo;
	}
	public String getSendStus() {
		return sendStus;
	}
	public void setSendStus(String sendStus) {
		this.sendStus = sendStus;
	}
	public String getCheckinCheckStus() {
		return checkinCheckStus;
	}
	public void setCheckinCheckStus(String checkinCheckStus) {
		this.checkinCheckStus = checkinCheckStus;
	}
	public String getCheckoutCheckStus() {
		return checkoutCheckStus;
	}
	public void setCheckoutCheckStus(String checkoutCheckStus) {
		this.checkoutCheckStus = checkoutCheckStus;
	}
	public String getOrderStr1() {
		return orderStr1;
	}
	public void setOrderStr1(String orderStr1) {
		this.orderStr1 = orderStr1;
	}
	public String getOrderStr2() {
		return orderStr2;
	}
	public void setOrderStr2(String orderStr2) {
		this.orderStr2 = orderStr2;
	}
	public String getOrderStr3() {
		return orderStr3;
	}
	public void setOrderStr3(String orderStr3) {
		this.orderStr3 = orderStr3;
	}
	
}
