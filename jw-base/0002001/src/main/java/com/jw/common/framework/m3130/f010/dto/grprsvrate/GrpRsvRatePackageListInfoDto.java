/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * 
 * ## 类说明：
 * 	房含列表信息对象
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rsvRateQuery
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月11日|guoc|新增|GrpRsvRatePackageListInfo.java新增
 */
@DrptDto(dtonm = "房含列表信息对象",dtodrpt="房含列表信息对象")
public class GrpRsvRatePackageListInfoDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 2870991450456617017L;
	@DrptField(fieldnm="packageId",fielddrpt="房含ID")
	private Integer packageId;	
	@DrptField(fieldnm="packageCd",fielddrpt="房含编号")
	private String packageCd;	
	@DrptField(fieldnm="packageNm",fielddrpt="房含描述")
	private String packageNm;	
	@DrptField(fieldnm="pkgchargeFlg",fielddrpt="收费方式")
	private String pkgchargeFlg;	
	@DrptField(fieldnm="quantity",fielddrpt="房含数量")
	private Integer quantity;	
	@DrptField(fieldnm="postRhythm",fielddrpt="过费方式 1：每天过费，2：第一天过")
	private String postRhythm;	
	@DrptField(fieldnm="pkgStd",fielddrpt="收费基准")
	private String pkgStd;	
	@DrptField(fieldnm="listPackageDayInfo",fielddrpt="每日房含价格列表")
	private List<GrpRsvRatePackageDayInfoDto> listPackageDayInfo;

	public Integer getPackageId() {
		return packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public String getPackageCd() {
		return packageCd;
	}

	public void setPackageCd(String packageCd) {
		this.packageCd = packageCd;
	}

	public String getPackageNm() {
		return packageNm;
	}

	public void setPackageNm(String packageNm) {
		this.packageNm = packageNm;
	}

	public String getPkgchargeFlg() {
		return pkgchargeFlg;
	}

	public void setPkgchargeFlg(String pkgchargeFlg) {
		this.pkgchargeFlg = pkgchargeFlg;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public List<GrpRsvRatePackageDayInfoDto> getListPackageDayInfo() {
		return listPackageDayInfo;
	}

	public void setListPackageDayInfo(List<GrpRsvRatePackageDayInfoDto> listPackageDayInfo) {
		this.listPackageDayInfo = listPackageDayInfo;
	}

	public String getPostRhythm() {
		return postRhythm;
	}

	public void setPostRhythm(String postRhythm) {
		this.postRhythm = postRhythm;
	}

	public String getPkgStd() {
		return pkgStd;
	}

	public void setPkgStd(String pkgStd) {
		this.pkgStd = pkgStd;
	}
}
