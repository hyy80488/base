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
 * 	查询价格列表数据传输对象
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rsvRateQuery
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月11日|guoc|新增|GrpRsvRateListInfoQueryDto.java新增
 */
@DrptDto(dtonm = "查询价格列表数据传输对象",dtodrpt="查询价格列表数据传输对象")
public class GrpRsvRateListInfoQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -5269250325256302784L;
	
	@DrptField(fieldnm="chainUid",fielddrpt="集团uid")
	private String chainUid;
	@DrptField(fieldnm="unitUid",fielddrpt="单位uid")
	private String unitUid;
	@DrptField(fieldnm="rateRoomtypId",fielddrpt="付费房型id")
	private Integer rateRoomtypId;
	@DrptField(fieldnm="contractCorpNo",fielddrpt="协议公司号")
	private String contractCorpNo;
	@DrptField(fieldnm="memberNo",fielddrpt="会员号")
	private String memberNo;
	@DrptField(fieldnm="rateId",fielddrpt="价格编码id")
	private Integer rateId;
	@DrptField(fieldnm="acctRateId",fielddrpt="预定价格")
	private Integer acctRateId;
	@DrptField(fieldnm="frDt",fielddrpt="开始日期")
	private Date frDt;
	@DrptField(fieldnm="toDt",fielddrpt="结束日期")
	private Date toDt;
	
	@DrptField(fieldnm="noCorpGlobalRate",fielddrpt="非全局rate")
	private Map<Integer, Collection<Integer>> noCorpGlobalRate;
	@DrptField(fieldnm="corpGlobalRate",fielddrpt="全局rate")
	private Set<Integer> corpGlobalRate;
	@DrptField(fieldnm="memberRate",fielddrpt="会员价格")
	private Map<Integer, Collection<Integer>> memberRate;
	
	@DrptField(fieldnm="priceTyp",fielddrpt="定价方式")
	private String priceTyp;
	
	@DrptField(fieldnm="pkgIds",fielddrpt="房含id")
	private List<Integer> pkgIds;
	/** 市场代码  **/
	@DrptField(fieldnm="marketId",fielddrpt="市场代码")
	private Integer marketId;
	/** 客源代码  **/
	@DrptField(fieldnm="sourceId",fielddrpt="客源代码")
	private Integer sourceId;
	@DrptField(fieldnm="setrtSeq",fielddrpt="设定序号")
	private Integer setrtSeq;
	@DrptField(fieldnm="pkgSeq",fielddrpt="房含设定标记")
	private String pkgSeq;
	
	@DrptField(fieldnm="hasRatePkg",fielddrpt="是否包含价格房含")
	private String hasRatePkg;
	@DrptField(fieldnm="customizeFlg",fielddrpt="价格自定义标记")
	private String customizeFlg;	
	@DrptField(fieldnm="lstPkgIdsToRate",fielddrpt="价格房含")
	private List<KeyValue<Integer, Integer>> lstPkgIdsToRate;
	@DrptField(fieldnm="pkgGrpToRate",fielddrpt="价格房含分组")
	private Integer pkgGrpToRate;
	@DrptField(fieldnm="lstPkgIds",fielddrpt="自定义房含")
	private List<KeyValue<Integer, Integer>> lstPkgIds;
	
	@DrptField(fieldnm="lstPackByInval",fielddrpt="无效房含")
	private List<CalcPackage> lstPackInval;
	
	@DrptField(fieldnm="lstPack",fielddrpt="房含List")
	private List<CalcPackage> lstPack;

	
	

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

	public Integer getRateRoomtypId() {
		return rateRoomtypId;
	}
	public void setRateRoomtypId(Integer rateRoomtypId) {
		this.rateRoomtypId = rateRoomtypId;
	}
	

	public String getContractCorpNo() {
		return contractCorpNo;
	}
	public void setContractCorpNo(String contractCorpNo) {
		this.contractCorpNo = contractCorpNo;
	}

	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	public String getPriceTyp() {
		return ObjectUtils.firstNonNull(priceTyp, ConstantRate.ENUM_PRICE_TYP.GENERAL.getValue());
	}
	public void setPriceTyp(String priceTyp) {
		this.priceTyp = priceTyp;
	}
	
	public List<Integer> getPkgIds() {
		return pkgIds;
	}
	public void setPkgIds(List<Integer> pkgIds) {
		this.pkgIds = pkgIds;
	}

	public Integer getMarketId() {
		return marketId;
	}
	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}

	public Integer getSourceId() {
		return sourceId;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getSetrtSeq() {
		return setrtSeq;
	}
	public void setSetrtSeq(Integer setrtSeq) {
		this.setrtSeq = setrtSeq;
	}

	public String getPkgSeq() {
		return pkgSeq;
	}
	public void setPkgSeq(String pkgSeq) {
		this.pkgSeq = pkgSeq;
	}

	public String getHasRatePkg() {
		return hasRatePkg;
	}
	public void setHasRatePkg(String hasRatePkg) {
		this.hasRatePkg = hasRatePkg;
	}

	public List<KeyValue<Integer, Integer>> getLstPkgIdsToRate() {
		return lstPkgIdsToRate;
	}
	public void setLstPkgIdsToRate(List<KeyValue<Integer, Integer>> lstPkgIdsToRate) {
		this.lstPkgIdsToRate = lstPkgIdsToRate;
	}
	
	public Integer getPkgGrpToRate() {
		return pkgGrpToRate;
	}
	public void setPkgGrpToRate(Integer pkgGrpToRate) {
		this.pkgGrpToRate = pkgGrpToRate;
	}

	public List<KeyValue<Integer, Integer>> getLstPkgIds() {
		return lstPkgIds;
	}
	public void setLstPkgIds(List<KeyValue<Integer, Integer>> lstPkgIds) {
		this.lstPkgIds = lstPkgIds;
	}

	public String getCustomizeFlg() {
		return customizeFlg;
	}
	public void setCustomizeFlg(String customizeFlg) {
		this.customizeFlg = customizeFlg;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
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
	public List<CalcPackage> getLstPackInval() {
		return lstPackInval;
	}
	public List<CalcPackage> getLstPack() {
		return lstPack;
	}
	public void setLstPackInval(List<CalcPackage> lstPackInval) {
		this.lstPackInval = lstPackInval;
	}
	public void setLstPack(List<CalcPackage> lstPack) {
		this.lstPack = lstPack;
	}
	public Integer getAcctRateId() {
		return acctRateId;
	}
	public void setAcctRateId(Integer acctRateId) {
		this.acctRateId = acctRateId;
	}
	
	@DrptField(fieldnm="memberrankId",fielddrpt="会员等级")
	private Integer memberrankId;
	public Integer getMemberrankId() {
		return memberrankId;
	}
	public void setMemberrankId(Integer memberrankId) {
		this.memberrankId = memberrankId;
	}
	
}
