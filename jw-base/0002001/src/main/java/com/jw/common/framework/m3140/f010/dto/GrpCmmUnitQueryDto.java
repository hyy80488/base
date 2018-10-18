
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	GrpCmmUnitQUERY信息数据传输对象
 * @author    [guoc]   
 * @version   [V1.0, 2017-02-15]
 * @package com.jw.hms.group.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-15|guoc|新增|GrpCmmUnitQueryDto新增
 */
@DrptDto(dtonm = "GrpCmmUnitQUERY信息数据传输对象", dtodrpt = "GrpCmmUnitQUERY信息数据传输对象")
public class GrpCmmUnitQueryDto extends RequestBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID
	*/
	private static final long serialVersionUID = -1461986447690019637L;

	@DrptField(fieldnm = "排序 ", fielddrpt = "排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	private Integer currentPage;
	@DrptField(fieldnm = "pageSize", fielddrpt = "每页记录数量")
	private Integer pageSize;

	// 0 ：查询子集团 1：查询父集团
	@DrptField(fieldnm = "fastQuery", fielddrpt = "快速查询")
	private String fastQuery;
	// 0 ：查询子集团 1：查询父集团
	@DrptField(fieldnm = "pcFlg", fielddrpt = "查询子父结果集")
	private String pcFlg;
	@DrptField(fieldnm = "id", fielddrpt = "id")
	private java.lang.Integer id;
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码")
	private String chainUid;
	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码")
	private String unitUid;
	@DrptField(fieldnm = "statusFlg", fielddrpt = "状态标识")
	private String statusFlg;
	@DrptField(fieldnm = "seq", fielddrpt = "序号")
	private java.lang.Integer seq;
	@DrptField(fieldnm = "unitCd", fielddrpt = "单位编号")
	private String unitCd;
	@DrptField(fieldnm = "unitNm", fielddrpt = "单位名称")
	private String unitNm;
	@DrptField(fieldnm = "unitDrpt", fielddrpt = "单位描述")
	private String unitDrpt;
	@DrptField(fieldnm = "mntFlg", fielddrpt = "管理模式")
	private String mntFlg;
	// 0:集团 1：单店
	@DrptField(fieldnm = "unitFlg", fielddrpt = "单位属性")
	private String unitFlg;
	@DrptField(fieldnm = "unitFlg", fielddrpt = "单位属性")
	private List<String> unitFlgs;
	@DrptField(fieldnm = "mntUnitUid", fielddrpt = "上级管理单位代码")
	private String mntUnitUid;
	@DrptField(fieldnm = "indexNm", fielddrpt = "名称关键字")
	private String indexNm;
	@DrptField(fieldnm = "memo", fielddrpt = "备注")
	private String memo;
	@DrptField(fieldnm = "unitComp", fielddrpt = "公司")
	private String unitComp;
	@DrptField(fieldnm = "brandId", fielddrpt = "品牌")
	private java.lang.Integer brandId;
	@DrptField(fieldnm = "开业日期", fielddrpt = "开业日期")
	private java.util.Date businessDt;
	@DrptField(fieldnm = "星级", fielddrpt = "星级")
	private java.lang.Integer starsId;
	@DrptField(fieldnm = "职能区域", fielddrpt = "职能区域")
	private java.lang.Integer regionId;
	@DrptField(fieldnm = "国籍", fielddrpt = "国籍")
	private java.lang.Integer countryId;
	@DrptField(fieldnm = "省", fielddrpt = "省")
	private java.lang.Integer provinceId;
	@DrptField(fieldnm = "市", fielddrpt = "市")
	private java.lang.Integer cityId;
	@DrptField(fieldnm = "区县", fielddrpt = "区县")
	private java.lang.Integer districtId;
	@DrptField(fieldnm = "地址", fielddrpt = "地址")
	private String address;
	@DrptField(fieldnm = "电话", fielddrpt = "电话")
	private String phone;
	@DrptField(fieldnm = "传真", fielddrpt = "传真")
	private String fax;
	@DrptField(fieldnm = "邮箱", fielddrpt = "邮箱")
	private String email;
	@DrptField(fieldnm = "账号", fielddrpt = "账号")
	private String bankNo;
	@DrptField(fieldnm = "建立方式", fielddrpt = "建立方式")
	private String createTyp;
	@DrptField(fieldnm = "语种ID", fielddrpt = "语种ID")
	private java.lang.Integer languageId;
	@DrptField(fieldnm = "语种代码", fielddrpt = "语种代码")
	private String languageCd;
	private List<String> unitUids = new ArrayList<>();

	@DrptField(fieldnm = "selectFlg", fielddrpt = "已选标志 1已选 0未选")
	private String selectFlg;

	@DrptField(fieldnm = "userUid", fielddrpt = "userUid", nullable = "false", length = "40")
	private String userUid;

	public String getUserUid() {
		return userUid;
	}

	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

	public String getSelectFlg() {
		return selectFlg;
	}

	public void setSelectFlg(String selectFlg) {
		this.selectFlg = selectFlg;
	}

	public String getPcFlg() {
		return pcFlg;
	}

	public void setPcFlg(String pcFlg) {
		this.pcFlg = pcFlg;
	}

	public List<String> getUnitUids() {
		return unitUids;
	}

	public void setUnitUids(List<String> unitUids) {
		this.unitUids = unitUids;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}

	public String getChainUid() {
		return this.chainUid;
	}

	public void setChainUid(String value) {
		this.chainUid = value;
	}

	public String getUnitUid() {
		return this.unitUid;
	}

	public void setUnitUid(String value) {
		this.unitUid = value;
	}

	public String getStatusFlg() {
		return this.statusFlg;
	}

	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}

	public java.lang.Integer getSeq() {
		return this.seq;
	}

	public void setSeq(java.lang.Integer value) {
		this.seq = value;
	}

	public String getUnitCd() {
		return this.unitCd;
	}

	public void setUnitCd(String value) {
		this.unitCd = value;
	}

	public String getUnitNm() {
		return this.unitNm;
	}

	public void setUnitNm(String value) {
		this.unitNm = value;
	}

	public String getUnitDrpt() {
		return this.unitDrpt;
	}

	public void setUnitDrpt(String value) {
		this.unitDrpt = value;
	}

	public String getMntFlg() {
		return this.mntFlg;
	}

	public void setMntFlg(String value) {
		this.mntFlg = value;
	}

	public String getUnitFlg() {
		return this.unitFlg;
	}

	public void setUnitFlg(String value) {
		this.unitFlg = value;
	}

	public List<String> getUnitFlgs() {
		return unitFlgs;
	}

	public void setUnitFlgs(List<String> unitFlgs) {
		this.unitFlgs = unitFlgs;
	}

	public String getMntUnitUid() {
		return this.mntUnitUid;
	}

	public void setMntUnitUid(String value) {
		this.mntUnitUid = value;
	}

	public String getIndexNm() {
		return this.indexNm;
	}

	public void setIndexNm(String value) {
		this.indexNm = value;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String value) {
		this.memo = value;
	}

	public String getUnitComp() {
		return this.unitComp;
	}

	public void setUnitComp(String value) {
		this.unitComp = value;
	}

	public java.lang.Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(java.lang.Integer value) {
		this.brandId = value;
	}

	public java.util.Date getBusinessDt() {
		return this.businessDt;
	}

	public void setBusinessDt(java.util.Date value) {
		this.businessDt = value;
	}

	public java.lang.Integer getStarsId() {
		return this.starsId;
	}

	public void setStarsId(java.lang.Integer value) {
		this.starsId = value;
	}

	public java.lang.Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(java.lang.Integer value) {
		this.regionId = value;
	}

	public java.lang.Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(java.lang.Integer value) {
		this.countryId = value;
	}

	public java.lang.Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(java.lang.Integer value) {
		this.provinceId = value;
	}

	public java.lang.Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(java.lang.Integer value) {
		this.cityId = value;
	}

	public java.lang.Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(java.lang.Integer value) {
		this.districtId = value;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String value) {
		this.address = value;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String value) {
		this.phone = value;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String value) {
		this.fax = value;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String value) {
		this.bankNo = value;
	}

	public String getCreateTyp() {
		return this.createTyp;
	}

	public void setCreateTyp(String value) {
		this.createTyp = value;
	}

	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}

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

	/**
	 * @return the fastQuery
	 */
	public String getFastQuery() {
		return fastQuery;
	}

	/**
	 * @param fastQuery the fastQuery to set
	 */
	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public java.lang.Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(java.lang.Integer languageId) {
		this.languageId = languageId;
	}

	public String getLanguageCd() {
		return languageCd;
	}

	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}

}
