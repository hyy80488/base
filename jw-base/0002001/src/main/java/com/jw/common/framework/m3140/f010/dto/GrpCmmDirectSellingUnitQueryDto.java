
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseApiDto;

/**
 * 
 * ## 类说明：
 * 	直销查询酒店列表
 * @author    [zteng]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|zteng|新增|GrpCmmDirectSellingUnitQueryDto.java新增
 */
@DrptDto(dtonm = "直销查询酒店列表信息数据传输对象", dtodrpt = "直销查询酒店列表信息数据传输对象")
public class GrpCmmDirectSellingUnitQueryDto extends RequestBaseApiDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6405562537978598258L;
	@DrptField(fieldnm = "unitUid", fielddrpt = "酒店uid")
	private String unitUid;
	@DrptField(fieldnm = "unitUids", fielddrpt = "酒店uid")
	private List<String> unitUids;
	@DrptField(fieldnm = "快速查询", fielddrpt = "快速查询")
	private String fastQuery;
	@DrptField(fieldnm = "longitude", fielddrpt = "客人的经度")
	private BigDecimal longitude;
	@DrptField(fieldnm = "latitude", fielddrpt = "客人的纬度")
	private BigDecimal latitude;
	@DrptField(fieldnm = "arrDt", fielddrpt = "入住日期时间")
	private Date arrDt;
	@DrptField(fieldnm = "dptDt", fielddrpt = "离店日期时间")
	private Date dptDt;
	@DrptField(fieldnm="memberNo",fielddrpt="会员号")
	private String memberNo;
	@DrptField(fieldnm = "cityId", fielddrpt = "城市")
	private Integer cityId;
	//（标签id）
	@DrptField(fieldnm = "unitTagIds", fielddrpt = "酒店类型")
	private List<Integer> unitTagIds;
	@DrptField(fieldnm = "keyword", fielddrpt = "关键字")
	private String keyword;
//	0-距离,1-距离市中心的距离，2-价格
	@DrptField(fieldnm = "sortTyp", fielddrpt = "排序类型")
	private String sortTyp;
//	0-正序，1-倒叙
	@DrptField(fieldnm = "sortFlg", fielddrpt = "排序方式")
	private String sortFlg;
	@DrptField(fieldnm = "channelFlg", fielddrpt = "渠道属性")
	private String channelFlg;
	
	
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getChannelFlg() {
		return channelFlg;
	}
	public void setChannelFlg(String channelFlg) {
		this.channelFlg = channelFlg;
	}
	public List<String> getUnitUids() {
		return unitUids;
	}
	public void setUnitUids(List<String> unitUids) {
		this.unitUids = unitUids;
	}
	public String getFastQuery() {
		return fastQuery;
	}
	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
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
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public List<Integer> getUnitTagIds() {
		return unitTagIds;
	}
	public void setUnitTagIds(List<Integer> unitTagIds) {
		this.unitTagIds = unitTagIds;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getSortTyp() {
		return sortTyp;
	}
	public void setSortTyp(String sortTyp) {
		this.sortTyp = sortTyp;
	}
	public String getSortFlg() {
		return sortFlg;
	}
	public void setSortFlg(String sortFlg) {
		this.sortFlg = sortFlg;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}


}
