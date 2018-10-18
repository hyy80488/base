/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;
/**
 * ## 类说明：
 * 	会员优惠政策返回值
 * @author    [jianana]   
 * @version   [V1.0, 2017年12月12日]
 * @package com.jw.hms.crm.m3540.f010.dto.LpsSetFavourpolicy
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年12月12日|jianana|新增|LpsSetFavourpolicyResultDto.java新增
 */
@DrptDto(dtonm = "LpsSetFavourpolicyResultDto",dtodrpt="会员优惠政策返回值")
public class LpsSetFavourpolicyResultDto implements Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -8931546762577814689L;
	
	@DrptField(fieldnm = "favourpolicyId", fielddrpt = "优惠策略ID")
	private Integer favourpolicyId;
	
	@DrptField(fieldnm = "favourpolicyCd", fielddrpt = "代码")
	private String favourpolicyCd;
	
	@DrptField(fieldnm = "favourpolicyNm", fielddrpt = "名称")
	private String favourpolicyNm;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "seq", fielddrpt = "序号")
	private Integer seq;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "beginDt", fielddrpt = "开始日期")
	private java.util.Date beginDt;
	
	@DrptField(fieldnm = "endDt", fielddrpt = "结束日期")
	private java.util.Date endDt;
	
	@DrptField(fieldnm = "favourpolicyTyp", fielddrpt = "优惠策略类型")
	private String favourpolicyTyp;
	
	@DrptField(fieldnm = "favourpolicygrpId", fielddrpt = "优惠策略分组")
	private Integer favourpolicygrpId;
	
	@DrptField(fieldnm = "exclusiveFlg", fielddrpt = "独享标记")
	private String exclusiveFlg;
	
	@DrptField(fieldnm = "policyLevel", fielddrpt = "策略等级")
	private Integer policyLevel;
	
	@DrptField(fieldnm = "favourpolicyFlg", fielddrpt = "优惠策略属性")
	private String favourpolicyFlg;
	
	@DrptField(fieldnm = "favourpolicyVer", fielddrpt = "优惠策略版本")
	private Integer favourpolicyVer;
	
	@DrptField(fieldnm = "reFavourpolicyId", fielddrpt = "关联优惠策略ID")
	private Integer reFavourpolicyId;
	
	@DrptField(fieldnm = "paramMap", fielddrpt = "接收其他参数")
	private Map<String, Object> paramMap;
	
	@DrptField(fieldnm = "rankDtos", fielddrpt = "会员等级")
	private List<FavourpolicyRankDto> rankDtos;
	
	/**key:明细类型 fpitemTyp   vlu:明细列表 List<Map<String,Object>>**/
	@DrptField(fieldnm = "itemMap", fielddrpt = "附加明细Map")
	private Map<String, List<Map<String, Object>>> itemMap;
	
	@DrptField(fieldnm = "units", fielddrpt = "酒店代码")
	private List<Map<String, Object>> units;
	@DrptField(fieldnm = "memo", fielddrpt = "备注")
	private String memo;
	
	@DrptField(fieldnm = "note", fielddrpt = "描述")
	private String note;
	@DrptField(fieldnm = "version", fielddrpt = "版本号")
	private Integer version;
	

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Map<String, List<Map<String, Object>>> getItemMap() {
		return itemMap;
	}

	public void setItemMap(Map<String, List<Map<String, Object>>> itemMap) {
		this.itemMap = itemMap;
	}

	public Integer getFavourpolicyId() {
		return favourpolicyId;
	}

	public void setFavourpolicyId(Integer favourpolicyId) {
		this.favourpolicyId = favourpolicyId;
	}

	public String getFavourpolicyCd() {
		return favourpolicyCd;
	}

	public void setFavourpolicyCd(String favourpolicyCd) {
		this.favourpolicyCd = favourpolicyCd;
	}

	public String getFavourpolicyNm() {
		return favourpolicyNm;
	}

	public void setFavourpolicyNm(String favourpolicyNm) {
		this.favourpolicyNm = favourpolicyNm;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public java.util.Date getBeginDt() {
		return beginDt;
	}

	public void setBeginDt(java.util.Date beginDt) {
		this.beginDt = beginDt;
	}

	public java.util.Date getEndDt() {
		return endDt;
	}

	public void setEndDt(java.util.Date endDt) {
		this.endDt = endDt;
	}

	public String getFavourpolicyTyp() {
		return favourpolicyTyp;
	}

	public void setFavourpolicyTyp(String favourpolicyTyp) {
		this.favourpolicyTyp = favourpolicyTyp;
	}

	public Integer getFavourpolicygrpId() {
		return favourpolicygrpId;
	}

	public void setFavourpolicygrpId(Integer favourpolicygrpId) {
		this.favourpolicygrpId = favourpolicygrpId;
	}

	public String getExclusiveFlg() {
		return exclusiveFlg;
	}

	public void setExclusiveFlg(String exclusiveFlg) {
		this.exclusiveFlg = exclusiveFlg;
	}

	public Integer getPolicyLevel() {
		return policyLevel;
	}

	public void setPolicyLevel(Integer policyLevel) {
		this.policyLevel = policyLevel;
	}

	public Map<String, Object> getParamMap() {
		return paramMap;
	}

	public void setParamMap(Map<String, Object> paramMap) {
		this.paramMap = paramMap;
	}

	public List<FavourpolicyRankDto> getRankDtos() {
		return rankDtos;
	}

	public void setRankDtos(List<FavourpolicyRankDto> rankDtos) {
		this.rankDtos = rankDtos;
	}

	public List<Map<String, Object>> getUnits() {
		return units;
	}

	public void setUnits(List<Map<String, Object>> units) {
		this.units = units;
	}

	public String getFavourpolicyFlg() {
		return favourpolicyFlg;
	}

	public void setFavourpolicyFlg(String favourpolicyFlg) {
		this.favourpolicyFlg = favourpolicyFlg;
	}

	public Integer getFavourpolicyVer() {
		return favourpolicyVer;
	}

	public void setFavourpolicyVer(Integer favourpolicyVer) {
		this.favourpolicyVer = favourpolicyVer;
	}

	public Integer getReFavourpolicyId() {
		return reFavourpolicyId;
	}

	public void setReFavourpolicyId(Integer reFavourpolicyId) {
		this.reFavourpolicyId = reFavourpolicyId;
	}
	
}
