
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.DateUtil;
import com.jw.base.framework.core.util.NumberUtil;
import com.jw.base.framework.core.util.StringUtil;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseApiDto;

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
public class GrpCmmDirectSellingUnitInfoDto   implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8800323370336798040L;
	@DrptField(fieldnm = "unitUid", fielddrpt = "酒店代码")
	private String unitUid;
	@DrptField(fieldnm = "jwHotelCode", fielddrpt = "众荟酒店编号")
	private String jwHotelCode;
	@DrptField(fieldnm = "unitCd", fielddrpt = "酒店代码")
	private String unitCd;
	@DrptField(fieldnm = "unitNm", fielddrpt = "酒店名称")
	private String unitNm;
	@DrptField(fieldnm = "unitDrpt", fielddrpt = "单位描述")
	private String unitDrpt;
	@DrptField(fieldnm = "indexNm", fielddrpt = "名称关键字")
	private String indexNm;
	@DrptField(fieldnm = "memo", fielddrpt = "备注(酒店介绍)")
	private String memo;
	@DrptField(fieldnm = "unitComp", fielddrpt = "公司")
	private String unitComp;
	@DrptField(fieldnm = "brandDrpt", fielddrpt = "pms品牌名称")
	private String brandDrpt;
	@DrptField(fieldnm = "starDrpt", fielddrpt = "pms星级")
	private String starDrpt;
	@DrptField(fieldnm = "unitTags", fielddrpt = "标签")
	private List<UnitTagsDto> unitTags;
	@DrptField(fieldnm = "unitProps", fielddrpt = "酒店设施")
	private List<UnitPropsDto> unitProps;
	@DrptField(fieldnm = "rateMin", fielddrpt = "最低价格")
	private BigDecimal rateMin;
	@DrptField(fieldnm = "rateMax", fielddrpt = "最高价格")
	private BigDecimal rateMax;
	@DrptField(fieldnm = "businessDt", fielddrpt = "开业日期时间戳")
	private Date businessDt;
	@DrptField(fieldnm = "decorationDt", fielddrpt = "装修日期时间戳")
	private Date decorationDt;
	@DrptField(fieldnm = "longitude", fielddrpt = "精度")
	private BigDecimal longitude;
	@DrptField(fieldnm = "latitude", fielddrpt = "纬度")
	private BigDecimal latitude;
	@DrptField(fieldnm = "guestDistance", fielddrpt = "客人的距离")
	private BigDecimal guestDistance;
	@DrptField(fieldnm = "phone", fielddrpt = "电话")
	private String phone;
	@DrptField(fieldnm = "fax", fielddrpt = "传真")
	private String fax;
	@DrptField(fieldnm = "email", fielddrpt = "邮箱")
	private String email;
	@DrptField(fieldnm = "chkinTm", fielddrpt = "默认入住时间")
	private String chkinTm;
	@DrptField(fieldnm = "chkoutTm", fielddrpt = "默认离店时间")
	private String chkoutTm;
	@DrptField(fieldnm = "countryDrpt", fielddrpt = "国家")
	private String countryDrpt;
	@DrptField(fieldnm = "provinceDrpt", fielddrpt = "省份")
	private String provinceDrpt;
	@DrptField(fieldnm = "cityDrpt", fielddrpt = "城市")
	private String cityDrpt;
	@DrptField(fieldnm = "districtDrpt", fielddrpt = "县市区")
	private String districtDrpt;
	@DrptField(fieldnm = "Address", fielddrpt = "地址")
	private String address;
	@DrptField(fieldnm = "unitNotices", fielddrpt = "酒店备注")
	private List<UnitNoticesDto> unitNotices;
	@DrptField(fieldnm = "unitPics", fielddrpt = "酒店图片")
	private List<UnitPicsDto> unitPics;
	
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public String getUnitDrpt() {
		return unitDrpt;
	}
	public void setUnitDrpt(String unitDrpt) {
		this.unitDrpt = unitDrpt;
	}
	public String getIndexNm() {
		return indexNm;
	}
	public void setIndexNm(String indexNm) {
		this.indexNm = indexNm;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getUnitComp() {
		return unitComp;
	}
	public void setUnitComp(String unitComp) {
		this.unitComp = unitComp;
	}
	public String getBrandDrpt() {
		return brandDrpt;
	}
	public void setBrandDrpt(String brandDrpt) {
		this.brandDrpt = brandDrpt;
	}
	public String getStarDrpt() {
		return starDrpt;
	}
	public void setStarDrpt(String starDrpt) {
		this.starDrpt = starDrpt;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getChkinTm() {
		return chkinTm;
	}
	public void setChkinTm(String chkinTm) {
		this.chkinTm = chkinTm;
	}
	public String getChkoutTm() {
		return chkoutTm;
	}
	public void setChkoutTm(String chkoutTm) {
		this.chkoutTm = chkoutTm;
	}
	public List<UnitNoticesDto> getUnitNotices() {
		return unitNotices;
	}
	public void setUnitNotices(List<UnitNoticesDto> unitNotices) {
		this.unitNotices = unitNotices;
	}
	public List<UnitPicsDto> getUnitPics() {
		return unitPics;
	}
	public void setUnitPics(List<UnitPicsDto> unitPics) {
		this.unitPics = unitPics;
	}
	public String getJwHotelCode() {
		return jwHotelCode;
	}
	public void setJwHotelCode(String jwHotelCode) {
		this.jwHotelCode = jwHotelCode;
	}
	public String getUnitCd() {
		return unitCd;
	}
	public void setUnitCd(String unitCd) {
		this.unitCd = unitCd;
	}
	public String getUnitNm() {
		return unitNm;
	}
	public void setUnitNm(String unitNm) {
		this.unitNm = unitNm;
	}
	public List<UnitTagsDto> getUnitTags() {
		return unitTags;
	}
	public void setUnitTags(List<UnitTagsDto> unitTags) {
		this.unitTags = unitTags;
	}
	public List<UnitPropsDto> getUnitProps() {
		return unitProps;
	}
	public void setUnitProps(List<UnitPropsDto> unitProps) {
		this.unitProps = unitProps;
	}
	public BigDecimal getRateMin() {
		return rateMin;
	}
	public void setRateMin(BigDecimal rateMin) {
		this.rateMin = rateMin;
	}
	public BigDecimal getRateMax() {
		return rateMax;
	}
	public void setRateMax(BigDecimal rateMax) {
		this.rateMax = rateMax;
	}
	public Date getBusinessDt() {
		return businessDt;
	}
	public void setBusinessDt(Date businessDt) {
		this.businessDt = businessDt;
	}
	public Date getDecorationDt() {
		return decorationDt;
	}
	public void setDecorationDt(Date decorationDt) {
		this.decorationDt = decorationDt;
	}
	public BigDecimal getGuestDistance() {
		return guestDistance;
	}
	public void setGuestDistance(BigDecimal guestDistance) {
		this.guestDistance = guestDistance;
	}
	public String getCountryDrpt() {
		return countryDrpt;
	}
	public void setCountryDrpt(String countryDrpt) {
		this.countryDrpt = countryDrpt;
	}
	public String getProvinceDrpt() {
		return provinceDrpt;
	}
	public void setProvinceDrpt(String provinceDrpt) {
		this.provinceDrpt = provinceDrpt;
	}
	public String getCityDrpt() {
		return cityDrpt;
	}
	public void setCityDrpt(String cityDrpt) {
		this.cityDrpt = cityDrpt;
	}
	public String getDistrictDrpt() {
		return districtDrpt;
	}
	public void setDistrictDrpt(String districtDrpt) {
		this.districtDrpt = districtDrpt;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//组装数据
	public void copyMapToDto(Map<String, Object> unitMap) {
//		this.jwHotelCode=;
//		this.unitTags=;
//		this.unitProps=;
//		this.unitNotices=;
//		this.unitPics=;
//		this.rateMin=;
//		this.rateMax=;
//		this.guestDistance=NumberUtil.toBigDecimal(unitMap.get(""), null);
//		this.chkinTm=StringUtil.toString(unitMap.get(""), null);
//		this.chkoutTm=StringUtil.toString(unitMap.get(""), null);
		this.unitUid=StringUtil.toString(unitMap.get("unit_uid"), null);
		this.brandDrpt=StringUtil.toString(unitMap.get("brand_drpt"), null);
		this.starDrpt=StringUtil.toString(unitMap.get("star_drpt"), null);
		this.unitCd=StringUtil.toString(unitMap.get("unit_cd"), null);
		this.unitNm=StringUtil.toString(unitMap.get("unit_nm"), null);
		this.unitDrpt=StringUtil.toString(unitMap.get("unit_drpt"), null);
		this.indexNm=StringUtil.toString(unitMap.get("index_nm"), null);
		this.memo=StringUtil.toString(unitMap.get("memo"), null);
		this.unitComp=StringUtil.toString(unitMap.get("unit_comp"), null);
		this.businessDt=DateUtil.toDate(unitMap.get("business_dt"), null);
		this.decorationDt=DateUtil.toDate(unitMap.get("decoration_dt"), null);
		this.longitude=NumberUtil.toBigDecimal(unitMap.get("longitude"), null);
		this.latitude=NumberUtil.toBigDecimal(unitMap.get("latitude"), null);
		this.phone=StringUtil.toString(unitMap.get("phone"), null);
		this.fax=StringUtil.toString(unitMap.get("fax"), null);
		this.email=StringUtil.toString(unitMap.get("email"), null);
		this.countryDrpt=StringUtil.toString(unitMap.get("country"), null);
		this.provinceDrpt=StringUtil.toString(unitMap.get("province"), null);
		this.cityDrpt=StringUtil.toString(unitMap.get("city"), null);
		this.districtDrpt=StringUtil.toString(unitMap.get("district"), null);
		this.address=StringUtil.toString(unitMap.get("address"), null);
	}

}
