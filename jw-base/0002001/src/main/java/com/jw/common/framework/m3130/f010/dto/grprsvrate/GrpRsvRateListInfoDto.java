/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * 
 * ## 类说明：
 * 	价格列表信息对象
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rsvRateQuery
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月11日|guoc|新增|GrpRsvRateListInfo.java新增
 */
@DrptDto(dtonm = "价格列表信息对象",dtodrpt="价格列表信息对象")
public class GrpRsvRateListInfoDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -8538490861735445572L;
	
	@DrptField(fieldnm="rateId",fielddrpt="价格id")
	private Integer rateId;
	@DrptField(fieldnm="rateNm",fielddrpt="价格名称")
	private String rateNm;
	@DrptField(fieldnm="packagegroupNm",fielddrpt="房含分组描述")
	private String packagegroupNm;
	@DrptField(fieldnm="marketId",fielddrpt="市场编码")
	private Integer marketId;
	@DrptField(fieldnm="sourceId",fielddrpt="客源编码")
	private Integer sourceId;
	@DrptField(fieldnm="rateVer",fielddrpt="价格版本")
	private Integer rateVer;
	@DrptField(fieldnm="rateCd",fielddrpt="价格cd")
	private String rateCd;
	@DrptField(fieldnm="cohuFlg",fielddrpt="免费自用标识")
	private String cohuFlg;
	
	
	
	public Integer getRateVer() {
		return rateVer;
	}

	public void setRateVer(Integer rateVer) {
		this.rateVer = rateVer;
	}

	public Integer getRateId() {
		return rateId;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	public String getRateNm() {
		return rateNm;
	}

	public void setRateNm(String rateNm) {
		this.rateNm = rateNm;
	}

	public String getPackagegroupNm() {
		return packagegroupNm;
	}

	public void setPackagegroupNm(String packagegroupNm) {
		this.packagegroupNm = packagegroupNm;
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

	public String getRateCd() {
		return rateCd;
	}

	public void setRateCd(String rateCd) {
		this.rateCd = rateCd;
	}

	public String getCohuFlg() {
		return cohuFlg;
	}

	public void setCohuFlg(String cohuFlg) {
		this.cohuFlg = cohuFlg;
	}
	
	
	
}
