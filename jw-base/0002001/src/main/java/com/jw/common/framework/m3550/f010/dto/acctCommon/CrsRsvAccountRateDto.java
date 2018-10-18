/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.util.ListUtil;

public class CrsRsvAccountRateDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5432159581285454464L;

	private List<CrsRsvAccountPackageDto> packageDtos;
	/**价格日期**/
	private Date resvBdt;
	/**价格代码**/
	private Integer rateId;
	/**自定义价格类型RT***/
	private String customizeFlg;
	/**实收房价**/
	private BigDecimal rateAmt;
	/**折扣金额**/
	private BigDecimal discAmt;
	/**折扣原因**/
	private Integer ratersnId;
	
	public List<CrsRsvAccountPackageDto> getPackageDtos() {
		if(ListUtil.isEmpty(packageDtos)){
			packageDtos = new ArrayList<>();
		}
		return packageDtos;
	}
	
	public BigDecimal getDiscAmt() {
		return discAmt;
	}

	public void setDiscAmt(BigDecimal discAmt) {
		this.discAmt = discAmt;
	}

	public Integer getRatersnId() {
		return ratersnId;
	}

	public void setRatersnId(Integer ratersnId) {
		this.ratersnId = ratersnId;
	}

	public void setPackageDtos(List<CrsRsvAccountPackageDto> packageDtos) {
		this.packageDtos = packageDtos;
	}
	public Date getResvBdt() {
		return resvBdt;
	}
	public void setResvBdt(Date resvBdt) {
		this.resvBdt = resvBdt;
	}
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public String getCustomizeFlg() {
		return customizeFlg;
	}
	public void setCustomizeFlg(String customizeFlg) {
		this.customizeFlg = customizeFlg;
	}
	public BigDecimal getRateAmt() {
		return rateAmt;
	}
	public void setRateAmt(BigDecimal rateAmt) {
		this.rateAmt = rateAmt;
	}

}
