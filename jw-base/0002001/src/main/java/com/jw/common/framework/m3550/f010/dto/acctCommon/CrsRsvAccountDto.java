/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.util.ListUtil;

public class CrsRsvAccountDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 1271806605798716225L;
	/**预订账号**/
	private String crsacctNo;
	/**账户状态**/
	private String crsacctStus;
	/**长包房标志**/
	private String stayTyp;
	/**预订类型**/
	private String resvtypId;
	/**来店日期**/
	private Date arrDt;
	/**离店日期**/
	private Date dptDt;
	private String arrTm;
	private String dptTm;
	/**销售房型**/
	private Integer saleroomtypId;
	/**价格ID**/
	private Integer rateId;
	/**房间数量**/
	private Integer roomQuant;
	/**成人数**/
	private Integer adultCnt;
	/**儿童数**/
	private Integer childrenCnt;
	/**房含项目ID**/
	private Integer packageId;
	
	private List<CrsRsvAccountGuestDto> guestDtos;
	private List<CrsRsvAccountRateDto> rateDtos;
	
	
	public String getArrTm() {
		return arrTm;
	}
	public void setArrTm(String arrTm) {
		this.arrTm = arrTm;
	}
	public String getDptTm() {
		return dptTm;
	}
	public void setDptTm(String dptTm) {
		this.dptTm = dptTm;
	}
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public List<CrsRsvAccountGuestDto> getGuestDtos() {
		if(ListUtil.isEmpty(guestDtos)){
			guestDtos = new ArrayList<>();
		}
		return guestDtos;
	}
	public void setGuestDtos(List<CrsRsvAccountGuestDto> guestDtos) {
		this.guestDtos = guestDtos;
	}
	public List<CrsRsvAccountRateDto> getRateDtos() {
		if(ListUtil.isEmpty(rateDtos)){
			rateDtos = new ArrayList<>();
		}
		return rateDtos;
	}
	public void setRateDtos(List<CrsRsvAccountRateDto> rateDtos) {
		this.rateDtos = rateDtos;
	}
	public String getCrsacctNo() {
		return crsacctNo;
	}
	public void setCrsacctNo(String crsacctNo) {
		this.crsacctNo = crsacctNo;
	}
	public String getCrsacctStus() {
		return crsacctStus;
	}
	public void setCrsacctStus(String crsacctStus) {
		this.crsacctStus = crsacctStus;
	}
	public String getStayTyp() {
		return stayTyp;
	}
	public void setStayTyp(String stayTyp) {
		this.stayTyp = stayTyp;
	}
	public String getResvtypId() {
		return resvtypId;
	}
	public void setResvtypId(String resvtypId) {
		this.resvtypId = resvtypId;
	}
	public Date getArrDt() {
		return arrDt;
	}
	public void setArrDt(Date arrDt) {
		this.arrDt = arrDt;
	}
	public Date getDptDt() {
		return dptDt;
	}
	public void setDptDt(Date dptDt) {
		this.dptDt = dptDt;
	}
	public Integer getSaleroomtypId() {
		return saleroomtypId;
	}
	public void setSaleroomtypId(Integer saleroomtypId) {
		this.saleroomtypId = saleroomtypId;
	}
	public Integer getRoomQuant() {
		return roomQuant;
	}
	public void setRoomQuant(Integer roomQuant) {
		this.roomQuant = roomQuant;
	}
	public Integer getAdultCnt() {
		return adultCnt;
	}
	public void setAdultCnt(Integer adultCnt) {
		this.adultCnt = adultCnt;
	}
	public Integer getChildrenCnt() {
		return childrenCnt;
	}
	public void setChildrenCnt(Integer childrenCnt) {
		this.childrenCnt = childrenCnt;
	}	
}
