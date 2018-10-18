/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.ObjectUtils;

import com.jw.base.framework.core.ConstantRate;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * 
 * ## 类说明：
 * 	查询价格日历信息数据传输对象
 * @author    [guoc]   
 * @version   [V1.0, 2017年3月30日]
 * @package com.jw.hms.pms.m3210.f010.dto.grpRsvRateCalendar
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月30日|guoc|新增|GrpRsvRateCalendarQueryDto.java新增
 */
@DrptDto(dtonm = "查询价格日历信息数据传输对象",dtodrpt="查询价格日历信息数据传输对象")
public class GrpRsvRateCalendarQueryDto extends RequestBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -6157657602537390617L;
	
	@DrptField(fieldnm="chainUid",fielddrpt="集团uid")
	private String chainUid;
	@DrptField(fieldnm="unitUid",fielddrpt="单位uid")
	private String unitUid;
	@DrptField(fieldnm="rateId",fielddrpt="价格id")
	private Integer rateId;
	@DrptField(fieldnm="roomTypId",fielddrpt="付费房型id")
	private Integer roomTypId;
	@DrptField(fieldnm="frDt",fielddrpt="开始日期")
	private Date frDt;
	@DrptField(fieldnm="toDt",fielddrpt="结束日期")
	private Date toDt;
	@DrptField(fieldnm="selectOfRoomFlg",fielddrpt="选房列表选择")
	private Boolean selectOfRoomFlg = false;
	@DrptField(fieldnm="contractCorpNo",fielddrpt="协议公司号")
	private String contractCorpNo;
	@DrptField(fieldnm="roomTypIds",fielddrpt="付费房型id数组")
	private List<Integer> roomTypIds;
	@DrptField(fieldnm="priceTyp",fielddrpt="定价方式")
	private String priceTyp;
	@DrptField(fieldnm="noCorpGlobalRate",fielddrpt="非全局rate")
	private Map<Integer, Collection<Integer>> noCorpGlobalRate;
	@DrptField(fieldnm="corpGlobalRate",fielddrpt="全局rate")
	private Set<Integer> corpGlobalRate;
	@DrptField(fieldnm="memberRate",fielddrpt="会员价格")
	private Map<Integer, Collection<Integer>> memberRate;
	
	public Boolean getSelectOfRoomFlg() {
		return selectOfRoomFlg;
	}

	public void setSelectOfRoomFlg(Boolean selectOfRoomFlg) {
		this.selectOfRoomFlg = selectOfRoomFlg;
	}

	public String getContractCorpNo() {
		return contractCorpNo;
	}

	public void setContractCorpNo(String contractCorpNo) {
		this.contractCorpNo = contractCorpNo;
	}

	public Date getFrDt() {
		return frDt;
	}

	public void setFrDt(Date frDt) {
		this.frDt = frDt;
	}

	public Date getToDt() {
		return toDt;
	}

	public void setToDt(Date toDt) {
		this.toDt = toDt;
	}

	public String getChainUid() {
		return chainUid;
	}

	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}

	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	public Integer getRateId() {
		return rateId;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	public Integer getRoomTypId() {
		return roomTypId;
	}

	public void setRoomTypId(Integer roomTypId) {
		this.roomTypId = roomTypId;
	}
	/*
	 * 成人数
	 */
	private Integer adultCnt;
	/*
	 *儿童数
	 */
	private Integer childCnt;

	public Integer getAdultCnt() {
		return adultCnt;
	}

	public void setAdultCnt(Integer adultCnt) {
		this.adultCnt = adultCnt;
	}

	public Integer getChildCnt() {
		return childCnt;
	}

	public void setChildCnt(Integer childCnt) {
		this.childCnt = childCnt;
	}
	
	/*
	 * 年
	 */
	private Integer year;
	/*
	 * 月
	 */
	private Integer month;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}
	
	@DrptField(fieldnm="当前页",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="每页记录数量 ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	@DrptField(fieldnm="isLastDaySub",fielddrpt="最后一天是否-1")
	private Boolean isLastDaySub;

	public Boolean getIsLastDaySub() {
		if(isLastDaySub == null){
			return true;
		}
		return isLastDaySub;
	}

	public void setIsLastDaySub(Boolean isLastDaySub) {
		this.isLastDaySub = isLastDaySub;
	}

	public List<Integer> getRoomTypIds() {
		return roomTypIds;
	}

	public void setRoomTypIds(List<Integer> roomTypIds) {
		this.roomTypIds = roomTypIds;
	}

	public String getPriceTyp() {
		return ObjectUtils.firstNonNull(priceTyp, ConstantRate.ENUM_PRICE_TYP.GENERAL.getValue());
	}

	public void setPriceTyp(String priceTyp) {
		this.priceTyp = priceTyp;
	}

	public Map<Integer, Collection<Integer>> getNoCorpGlobalRate() {
		return noCorpGlobalRate;
	}

	public Set<Integer> getCorpGlobalRate() {
		return corpGlobalRate;
	}

	public Map<Integer, Collection<Integer>> getMemberRate() {
		return memberRate;
	}

	public void setNoCorpGlobalRate(Map<Integer, Collection<Integer>> noCorpGlobalRate) {
		this.noCorpGlobalRate = noCorpGlobalRate;
	}

	public void setCorpGlobalRate(Set<Integer> corpGlobalRate) {
		this.corpGlobalRate = corpGlobalRate;
	}

	public void setMemberRate(Map<Integer, Collection<Integer>> memberRate) {
		this.memberRate = memberRate;
	}
}
