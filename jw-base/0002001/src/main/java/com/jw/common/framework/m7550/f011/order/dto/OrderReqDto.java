/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m7550.f011.order.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	直销订单
 * @author    [jianana]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m7550.f011.order.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|jianana|新增|OrderReqDto.java新增
 */
public class OrderReqDto extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 6227001763668321863L;
	/**分配的授权码**/
	private String jwAccessToken;
	/**客户号*/
	private String jwClientCode;
	/**网站号**/
	private String jwUniqCode;
	/**语种（例如zh-CN）**/
	private String language;
	/**众荟酒店编号**/
	private String jwHotelCode;
	/**订单号（新增没有）**/
	private String crsNum;
	/**支付金额（支付订单）**/
	private BigDecimal payAm;
	private Date arrDt;
	private String arrTm;
	private Date dptDt;
	private String dtpTm;
	private Integer roomQuant;
	private Integer roomtypId;
	private String onlinepaymentTyp;
	private String profileNo;
	private String negoCorpNo;
	private String memberNo;
	private String contactCtno;
	private List<OrderGuestDto> guests;
	private List<OrderRateDto> rates;
	
	
	
	public String getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}
	public BigDecimal getPayAm() {
		return payAm;
	}
	public void setPayAm(BigDecimal payAm) {
		this.payAm = payAm;
	}
	public String getJwAccessToken() {
		return jwAccessToken;
	}
	public void setJwAccessToken(String jwAccessToken) {
		this.jwAccessToken = jwAccessToken;
	}
	public String getJwClientCode() {
		return jwClientCode;
	}
	public void setJwClientCode(String jwClientCode) {
		this.jwClientCode = jwClientCode;
	}
	public String getJwUniqCode() {
		return jwUniqCode;
	}
	public void setJwUniqCode(String jwUniqCode) {
		this.jwUniqCode = jwUniqCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getJwHotelCode() {
		return jwHotelCode;
	}
	public void setJwHotelCode(String jwHotelCode) {
		this.jwHotelCode = jwHotelCode;
	}
	public Date getArrDt() {
		return arrDt;
	}
	public void setArrDt(Date arrDt) {
		this.arrDt = arrDt;
	}
	public String getArrTm() {
		return arrTm;
	}
	public void setArrTm(String arrTm) {
		this.arrTm = arrTm;
	}
	public Date getDptDt() {
		return dptDt;
	}
	public void setDptDt(Date dptDt) {
		this.dptDt = dptDt;
	}
	public String getDtpTm() {
		return dtpTm;
	}
	public void setDtpTm(String dtpTm) {
		this.dtpTm = dtpTm;
	}
	public Integer getRoomQuant() {
		return roomQuant;
	}
	public void setRoomQuant(Integer roomQuant) {
		this.roomQuant = roomQuant;
	}
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public String getOnlinepaymentTyp() {
		return onlinepaymentTyp;
	}
	public void setOnlinepaymentTyp(String onlinepaymentTyp) {
		this.onlinepaymentTyp = onlinepaymentTyp;
	}
	public String getProfileNo() {
		return profileNo;
	}
	public void setProfileNo(String profileNo) {
		this.profileNo = profileNo;
	}
	public String getNegoCorpNo() {
		return negoCorpNo;
	}
	public void setNegoCorpNo(String negoCorpNo) {
		this.negoCorpNo = negoCorpNo;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getContactCtno() {
		return contactCtno;
	}
	public void setContactCtno(String contactCtno) {
		this.contactCtno = contactCtno;
	}
	public List<OrderGuestDto> getGuests() {
		return guests;
	}
	public void setGuests(List<OrderGuestDto> guests) {
		this.guests = guests;
	}
	public List<OrderRateDto> getRates() {
		return rates;
	}
	public void setRates(List<OrderRateDto> rates) {
		this.rates = rates;
	}
}
