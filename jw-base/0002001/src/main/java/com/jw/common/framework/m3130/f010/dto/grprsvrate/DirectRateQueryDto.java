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

import org.apache.commons.collections4.KeyValue;
import org.apache.commons.lang3.ObjectUtils;

import com.jw.base.framework.core.ConstantRate;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.common.framework.m0002.f001.dto.rate.CalcPackage;

/**
 * 
 * ## 类说明：
 * 	直销价格获取
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rsvRateQuery
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月11日|guoc|新增|GrpRsvRateListInfoQueryDto.java新增
 */
@DrptDto(dtonm = "查询价格列表数据传输对象",dtodrpt="查询价格列表数据传输对象")
public class DirectRateQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2761272570364087844L;
	@DrptField(fieldnm="chainUid",fielddrpt="集团uid")
	private String chainUid;
	@DrptField(fieldnm="unitUid",fielddrpt="单位uid")
	private String unitUid;
	@DrptField(fieldnm="memberNo",fielddrpt="会员号")
	private String memberNo;
	@DrptField(fieldnm="memberrankId",fielddrpt="会员等级")
	private Integer memberrankId;
	@DrptField(fieldnm="roomtypRate",fielddrpt="房型对应的价格")
	private Map<Integer, List<Integer>> roomtypRate;
	@DrptField(fieldnm="frDt",fielddrpt="开始日期")
	private Date frDt;
	@DrptField(fieldnm="toDt",fielddrpt="结束日期")
	private Date toDt;
	@DrptField(fieldnm="priceTyp",fielddrpt="定价方式")
	private String priceTyp;
	@DrptField(fieldnm="memberRate",fielddrpt="会员价格")
	private Map<Integer, Collection<Integer>> memberRate;
	public String getChainUid() {
		return chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public Integer getMemberrankId() {
		return memberrankId;
	}
	public Map<Integer, List<Integer>> getRoomtypRate() {
		return roomtypRate;
	}
	public Date getFrDt() {
		return frDt;
	}
	public Date getToDt() {
		return toDt;
	}
	public String getPriceTyp() {
		return priceTyp;
	}
	public Map<Integer, Collection<Integer>> getMemberRate() {
		return memberRate;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public void setMemberrankId(Integer memberrankId) {
		this.memberrankId = memberrankId;
	}
	public void setRoomtypRate(Map<Integer, List<Integer>> roomtypRate) {
		this.roomtypRate = roomtypRate;
	}
	public void setFrDt(Date frDt) {
		this.frDt = frDt;
	}
	public void setToDt(Date toDt) {
		this.toDt = toDt;
	}
	public void setPriceTyp(String priceTyp) {
		this.priceTyp = priceTyp;
	}
	public void setMemberRate(Map<Integer, Collection<Integer>> memberRate) {
		this.memberRate = memberRate;
	}
	
}
