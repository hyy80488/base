package com.jw.common.framework.m0002.f001.dto.rate;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 * 	协议价获取
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年1月22日]
 * @package com.jw.common.framework.m0002.f001.dto.rate
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年1月22日|MiaoDaZhuang|新增|NegoRateRequestDto.java新增
*/
public class NegoRateInfoRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -7979168677828895928L;
	
	@DrptField(fieldnm="chainUid",fielddrpt="集团uid")
	private String chainUid;
	@DrptField(fieldnm="unitUid",fielddrpt="单位uid")
	private String unitUid;
	
	@DrptField(fieldnm="rateRoomtypId",fielddrpt="付费房型id")
	private List<Integer> rateRoomtypId;
	@DrptField(fieldnm="rateId",fielddrpt="价格编码id")
	private Integer rateId;
	
	@DrptField(fieldnm="corpNo",fielddrpt="协议公司号")
	private String corpNo;
	@DrptField(fieldnm="memberNo",fielddrpt="会员号")
	private String memberNo;
	@DrptField(fieldnm="memberrankId",fielddrpt="会员等级")
	private Integer memberrankId;

	@DrptField(fieldnm="frDt",fielddrpt="开始日期")
	private Date frDt;
	@DrptField(fieldnm="toDt",fielddrpt="结束日期")
	private Date toDt;
	public String getChainUid() {
		return chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public List<Integer> getRateRoomtypId() {
		return rateRoomtypId;
	}
	public Integer getRateId() {
		return rateId;
	}
	public String getCorpNo() {
		return corpNo;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public Date getFrDt() {
		return frDt;
	}
	public Date getToDt() {
		return toDt;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public void setRateRoomtypId(List<Integer> rateRoomtypId) {
		this.rateRoomtypId = rateRoomtypId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public void setCorpNo(String corpNo) {
		this.corpNo = corpNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public void setFrDt(Date frDt) {
		this.frDt = frDt;
	}
	public void setToDt(Date toDt) {
		this.toDt = toDt;
	}
	public Integer getMemberrankId() {
		return memberrankId;
	}
	public void setMemberrankId(Integer memberrankId) {
		this.memberrankId = memberrankId;
	}
	//价格类型
	private String priceTyp;
	public String getPriceTyp() {
		return priceTyp;
	}
	public void setPriceTyp(String priceTyp) {
		this.priceTyp = priceTyp;
	}
	
	
}
