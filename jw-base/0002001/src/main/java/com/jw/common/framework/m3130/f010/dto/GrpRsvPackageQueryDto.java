
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	房含项目表QUERY信息数据传输对象
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-05-19]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-05-19|zhangteng|新增|GrpRsvPackageQueryDto新增
 */
@DrptDto(dtonm = "房含项目表QUERY信息数据传输对象", dtodrpt = "房含项目表QUERY信息数据传输对象")
public class GrpRsvPackageQueryDto extends RequestBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/
	private static final long serialVersionUID = 2907567086356862813L;
	// 例如：{字段1,升序},{字段2,降序}
	@DrptField(fieldnm = "orderColumn", fielddrpt = "排序字段 ")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	private Integer currentPage;
	@DrptField(fieldnm = "pageSize", fielddrpt = "每页记录数量")
	private Integer pageSize;

	@DrptField(fieldnm = "exclusiveFlg", fielddrpt = "独享标记", nullable = "true", length = "40")
	private String exclusiveFlg;
	@DrptField(fieldnm = "exclusiveFlg", fielddrpt = "使用标识", nullable = "true", length = "40")
	private String useFlg;

	@DrptField(fieldnm = "fastQuery", fielddrpt = "快速查找", nullable = "true", length = "40")
	private String fastQuery;

	@DrptField(fieldnm = "ids", fielddrpt = "ids", nullable = "true")
	private List<Integer> ids = new ArrayList<Integer>();

	@DrptField(fieldnm = "id", fielddrpt = "ID ID字段", nullable = "false", length = "10")
	private Integer id;
	
	@DrptField(fieldnm = "posId", fielddrpt = "消费地点 ", nullable = "true", length = "10")
	private Integer posId;
	@DrptField(fieldnm = "posIds", fielddrpt = "消费地点 ", nullable = "true", length = "10")
	private List<Integer> posIds;
	
	@DrptField(fieldnm = "auditTyp", fielddrpt = "记账方式 ", nullable = "true", length = "10")
	private String auditTyp;
	
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码 ", nullable = "false", length = "40")
	private String chainUid;

	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码 ", nullable = "false", length = "40")
	private String unitUid;

	@DrptField(fieldnm = "packageId", fielddrpt = "房含代码 ", nullable = "true", length = "10")
	private Integer packageId;

	@DrptField(fieldnm = "packageIds", fielddrpt = "房含ID集合 ", nullable = "true")
	private List<Integer> packageIds;
	// 0：无效；1：有效（默认）
	@DrptField(fieldnm = "statusFlg", fielddrpt = "有效标识 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_STATUS_FLG, nullable = "false", length = "1")
	private String statusFlg;
	// 0：禁用；1:启用（默认）
	@DrptField(fieldnm = "flg", fielddrpt = "启用禁用标志 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_STATUS_FLG, nullable = "false", length = "1")
	private String flg;

	@DrptField(fieldnm = "productId", fielddrpt = "消费品ID ", nullable = "false", length = "10")
	private Integer productId;

//	0：普通，1：早餐，2：晚餐
//	RS：客房服务(MINIBAR、洗衣、客房赔偿等）
	@DrptField(fieldnm = "producFlg", fielddrpt = "产品属性 ", nullable = "true", length = "20")
	private String producFlg;
	
	@DrptField(fieldnm = "packageCd", fielddrpt = "房含编码 ", nullable = "true", length = "20")
	private String packageCd;

	@DrptField(fieldnm = "packageNm", fielddrpt = "房含名称 ", nullable = "true", length = "200")
	private String packageNm;

	@DrptField(fieldnm = "packageDrpt", fielddrpt = "描述 ", nullable = "true", length = "400")
	private String packageDrpt;
	// 1：每房间，2：每人，3：每成人，4：每儿童，5：每账户
	@DrptField(fieldnm = "pkgStd", fielddrpt = "收费基准 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_PKG_STD, nullable = "true", length = "3")
	private String pkgStd;
	// 1：包含在房价内，2：另外加收
	@DrptField(fieldnm = "pkgchargeFlg", fielddrpt = "收费方式 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_PKGCHARGE_FLG, nullable = "true", length = "3")
	private String pkgchargeFlg;
	// 0：不显示（默认）；1：显示
	@DrptField(fieldnm = "pkgfolioFlg", fielddrpt = "账单显示", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_PKGFOLIO_FLG, nullable = "true", length = "3")
	private String pkgfolioFlg;
	// 1：每天过费，2：第一天过
	@DrptField(fieldnm = "postRhythm", fielddrpt = "过费方式 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_POST_RHYTHM, nullable = "true", length = "3")
	private String postRhythm;
	// 0：不可以，1：可以
	@DrptField(fieldnm = "addonFlg", fielddrpt = "自定义价格可用 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_ADDON_FLG, nullable = "true", length = "3")
	private String addonFlg;
	// 0：不可以，1：可以
	@DrptField(fieldnm = "allowanceFlg", fielddrpt = "可自定义抛账金额 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_ALLOWANCE_FLG, nullable = "true", length = "3")
	private String allowanceFlg;

	@DrptField(fieldnm = "currencyId", fielddrpt = "报价币种 ", nullable = "true", length = "10")
	private Integer currencyId;

	@DrptField(fieldnm = "validstartDt", fielddrpt = "有效起期 ", nullable = "true", length = "13")
	private java.util.Date validstartDt;

	@DrptField(fieldnm = "validendDt", fielddrpt = "有效止期 ", nullable = "true", length = "13")
	private java.util.Date validendDt;
	// 0：普通项目，1：积分兑换项目
	@DrptField(fieldnm = "redemptionFlg", fielddrpt = "积分兑换项目 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_REDEMPTION_FLG, nullable = "true", length = "3")
	private String redemptionFlg;
	// 0：不影响Fixed Rate，1：影响
	@DrptField(fieldnm = "fixedrateFlg", fielddrpt = "影响Fixed Rate ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_FIXEDRATE_FLG, nullable = "true", length = "3")
	private String fixedrateFlg;

	@DrptField(fieldnm = "memo", fielddrpt = "备注 ", nullable = "true", length = "500")
	private String memo;

	@DrptField(fieldnm = "calendarId", fielddrpt = "calendarId", nullable = "true", length = "10")
	private Integer calendarId;

	@DrptField(fieldnm = "websellFlg", fielddrpt = "websellFlg", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_RSV_PACKAGE_WEBSELL_FLG, nullable = "true", length = "3")
	private String websellFlg;
	@DrptField(fieldnm = "containParamId", fielddrpt = "需要包含的id")
	private List<Integer> containParamId;

	@DrptField(fieldnm = "dicFlg", fielddrpt = "获取的字典数据标记")
	private Boolean dicFlg = true;
	
	@DrptField(fieldnm = "ctrlFlg", fielddrpt = "管控属性")
	private String ctrlFlg;

	public String getProducFlg() {
		return producFlg;
	}

	public void setProducFlg(String producFlg) {
		this.producFlg = producFlg;
	}

	public List<Integer> getPackageIds() {
		return packageIds;
	}

	public void setPackageIds(List<Integer> packageIds) {
		this.packageIds = packageIds;
	}

	public String getFlg() {
		return flg;
	}

	public void setFlg(String flg) {
		this.flg = flg;
	}

	/** 多语种ID */
	@DrptField(fieldnm = "languageId", fielddrpt = "语种", paramtype = ConstantParm.ENUM_PARA_TYPE.COMMON_PARA, paramsubtype = ConstantParm.LANGUAGE)
	private Integer languageId;

	public String getUseFlg() {
		return useFlg;
	}

	public void setUseFlg(String useFlg) {
		this.useFlg = useFlg;
	}

	public String getExclusiveFlg() {
		return exclusiveFlg;
	}

	public void setExclusiveFlg(String exclusiveFlg) {
		this.exclusiveFlg = exclusiveFlg;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public String getFastQuery() {
		return fastQuery;
	}

	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer value) {
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

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer value) {
		this.packageId = value;
	}

	public String getStatusFlg() {
		return this.statusFlg;
	}

	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer value) {
		this.productId = value;
	}

	public String getPackageCd() {
		return this.packageCd;
	}

	public void setPackageCd(String value) {
		this.packageCd = value;
	}

	public String getPackageNm() {
		return this.packageNm;
	}

	public void setPackageNm(String value) {
		this.packageNm = value;
	}

	public String getPackageDrpt() {
		return this.packageDrpt;
	}

	public void setPackageDrpt(String value) {
		this.packageDrpt = value;
	}

	public String getPkgStd() {
		return this.pkgStd;
	}

	public void setPkgStd(String value) {
		this.pkgStd = value;
	}

	public String getPkgchargeFlg() {
		return this.pkgchargeFlg;
	}

	public void setPkgchargeFlg(String value) {
		this.pkgchargeFlg = value;
	}

	public String getPkgfolioFlg() {
		return this.pkgfolioFlg;
	}

	public void setPkgfolioFlg(String value) {
		this.pkgfolioFlg = value;
	}

	public String getPostRhythm() {
		return this.postRhythm;
	}

	public void setPostRhythm(String value) {
		this.postRhythm = value;
	}

	public String getAddonFlg() {
		return this.addonFlg;
	}

	public void setAddonFlg(String value) {
		this.addonFlg = value;
	}

	public String getAllowanceFlg() {
		return this.allowanceFlg;
	}

	public void setAllowanceFlg(String value) {
		this.allowanceFlg = value;
	}

	public Integer getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Integer value) {
		this.currencyId = value;
	}

	public java.util.Date getValidstartDt() {
		return this.validstartDt;
	}

	public void setValidstartDt(java.util.Date value) {
		this.validstartDt = value;
	}

	public java.util.Date getValidendDt() {
		return this.validendDt;
	}

	public void setValidendDt(java.util.Date value) {
		this.validendDt = value;
	}

	public String getRedemptionFlg() {
		return this.redemptionFlg;
	}

	public void setRedemptionFlg(String value) {
		this.redemptionFlg = value;
	}

	public String getFixedrateFlg() {
		return this.fixedrateFlg;
	}

	public void setFixedrateFlg(String value) {
		this.fixedrateFlg = value;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String value) {
		this.memo = value;
	}

	public Integer getCalendarId() {
		return this.calendarId;
	}

	public void setCalendarId(Integer value) {
		this.calendarId = value;
	}

	public String getWebsellFlg() {
		return this.websellFlg;
	}

	public void setWebsellFlg(String value) {
		this.websellFlg = value;
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

	public List<Integer> getPosIds() {
		return posIds;
	}

	public void setPosIds(List<Integer> posIds) {
		this.posIds = posIds;
	}

	public Integer getPosId() {
		return posId;
	}

	public void setPosId(Integer posId) {
		this.posId = posId;
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

	public List<Integer> getContainParamId() {
		return containParamId;
	}

	public void setContainParamId(List<Integer> containParamId) {
		this.containParamId = containParamId;
	}

	public Boolean getDicFlg() {
		return dicFlg;
	}

	public void setDicFlg(Boolean dicFlg) {
		this.dicFlg = dicFlg;
	}

	public String getCtrlFlg() {
		return ctrlFlg;
	}

	public void setCtrlFlg(String ctrlFlg) {
		this.ctrlFlg = ctrlFlg;
	}

	public String getAuditTyp() {
		return auditTyp;
	}

	public void setAuditTyp(String auditTyp) {
		this.auditTyp = auditTyp;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
