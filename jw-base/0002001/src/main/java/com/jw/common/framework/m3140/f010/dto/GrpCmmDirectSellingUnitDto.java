
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
public class GrpCmmDirectSellingUnitDto  implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1326376231256407113L;
	@DrptField(fieldnm = "jwHotelCode", fielddrpt = "众荟酒店编号")
	private String jwHotelCode;
	@DrptField(fieldnm = "unitUid", fielddrpt = "酒店代码")
	private String unitUid;
	@DrptField(fieldnm = "unitCd", fielddrpt = "酒店代码")
	private String unitCd;
	@DrptField(fieldnm = "unitNm", fielddrpt = "酒店名称")
	private String unitNm;
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
	@DrptField(fieldnm = "guestDistance", fielddrpt = "客人的距离")
	private BigDecimal guestDistance;
	@DrptField(fieldnm = "cityCenterDistance", fielddrpt = "市中心的距离")
	private BigDecimal cityCenterDistance;
	@DrptField(fieldnm = "countryDrpt", fielddrpt = "国家")
	private String countryDrpt;
	@DrptField(fieldnm = "provinceDrpt", fielddrpt = "省份")
	private String provinceDrpt;
	@DrptField(fieldnm = "cityDrpt", fielddrpt = "城市")
	private String cityDrpt;
	@DrptField(fieldnm = "districtDrpt", fielddrpt = "县市区")
	private String districtDrpt;
	@DrptField(fieldnm = "address", fielddrpt = "地址")
	private String address;
	@DrptField(fieldnm = "longitude", fielddrpt = "酒店经度")
	private BigDecimal longitude;
	@DrptField(fieldnm = "latitude", fielddrpt = "酒店纬度")
	private BigDecimal latitude;
	@DrptField(fieldnm = "cityLongitude", fielddrpt = "城市经度")
	private BigDecimal cityLongitude;
	@DrptField(fieldnm = "cityLatitude", fielddrpt = "城市纬度")
	private BigDecimal cityLatitude;
	@DrptField(fieldnm = "unitPics", fielddrpt = "酒店图片")
	private List<UnitPicsDto> unitPics;
	
	
	public List<UnitPicsDto> getUnitPics() {
		return unitPics;
	}
	public void setUnitPics(List<UnitPicsDto> unitPics) {
		this.unitPics = unitPics;
	}
	public BigDecimal getCityCenterDistance() {
		return cityCenterDistance;
	}
	public void setCityCenterDistance(BigDecimal cityCenterDistance) {
		this.cityCenterDistance = cityCenterDistance;
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
	public BigDecimal getCityLongitude() {
		return cityLongitude;
	}
	public void setCityLongitude(BigDecimal cityLongitude) {
		this.cityLongitude = cityLongitude;
	}
	public BigDecimal getCityLatitude() {
		return cityLatitude;
	}
	public void setCityLatitude(BigDecimal cityLatitude) {
		this.cityLatitude = cityLatitude;
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
	
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	//转换map为dto
	public void copyMapToDto(Map<String,Object> map){
//		this.jwHotelCode = StringUtil.toString(map.get(""), null) ;
//		this.rateMin = NumberUtil.toBigDecimal(map.get(""), null);
//		this.rateMax = NumberUtil.toBigDecimal(map.get(""), null);
//		this.guestDistance = NumberUtil.toBigDecimal(map.get(""), null);
		this.unitUid =  StringUtil.toString(map.get("unit_uid"), null) ;
		this.unitCd =  StringUtil.toString(map.get("unit_cd"), null) ;
		this.unitNm = StringUtil.toString(map.get("unit_nm"), null) ;
		this.businessDt = DateUtil.toDate(map.get("business_dt"), null);
		this.decorationDt = DateUtil.toDate(map.get("decoration_dt"), null);
		this.countryDrpt = StringUtil.toString(map.get("country"), null) ;
		this.provinceDrpt =  StringUtil.toString(map.get("province"), null) ;
		this.cityDrpt =  StringUtil.toString(map.get("city"), null) ;
		this.districtDrpt =  StringUtil.toString(map.get("district"), null) ;
		this.address =  StringUtil.toString(map.get("address"), null) ;
		this.longitude = NumberUtil.toBigDecimal(map.get("longitude"), null);
		this.latitude = NumberUtil.toBigDecimal(map.get("latitude"), null);
		this.cityLongitude = NumberUtil.toBigDecimal(map.get("city_longitude"), null);
		this.cityLatitude = NumberUtil.toBigDecimal(map.get("city_latitude"), null);
	}
}
