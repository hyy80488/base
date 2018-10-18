
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/** 
 * ## 类说明：
 * 	税率配置DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosTaxResultDto新增
 */
@DrptDto(dtonm = "菜品类别FORM信息数据传输对象",dtodrpt="菜品类别FORM信息数据传输对象")
public class PosTaxDtoRequestT extends RequestBaseDto implements  java.io.Serializable{
	/** ID  **/
	private Integer id;
	/** 集团标识  **/
	private String chainUid;
	/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
	private String unitUid;
	/** 税率标识  **/
	private Integer taxId;
	/** 销售点标识  **/
	private Integer salesId;
	/** 餐点标识  **/
	private Integer periodId;
	/** 统计类别标识  **/
	private Integer statsTypId;
	/** 税率1 默认为零 **/
	private Integer tax1Id;
	/** 税率2 默认为零 **/
	private Integer tax2Id;
	/** 税率3 默认为零 **/
	private Integer tax3Id;
	/** 税率4 默认为零 **/
	private Integer tax4Id;
	/** 税率5 默认为零 **/
	private Integer tax5Id;
	/** 删除标记 0-未删除,1-已删除 **/
	private String delFlg;
	/** 版本号  **/
	private Integer version;
	/** 备注  **/
	private String memo;
	/** businessUid **/
	private String businessUid;
	/** businessStus **/
	private String businessStus;
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
	public Integer getTaxId() {
		return this.taxId;
	}	
	public void setTaxId(Integer value) {
		this.taxId = value;
	}
	public Integer getSalesId() {
		return this.salesId;
	}	
	public void setSalesId(Integer value) {
		this.salesId = value;
	}
	public Integer getPeriodId() {
		return this.periodId;
	}	
	public void setPeriodId(Integer value) {
		this.periodId = value;
	}
	public Integer getStatsTypId() {
		return this.statsTypId;
	}	
	public void setStatsTypId(Integer value) {
		this.statsTypId = value;
	}
	public Integer getTax1Id() {
		return this.tax1Id;
	}	
	public void setTax1Id(Integer value) {
		this.tax1Id = value;
	}
	public Integer getTax2Id() {
		return this.tax2Id;
	}	
	public void setTax2Id(Integer value) {
		this.tax2Id = value;
	}
	public Integer getTax3Id() {
		return this.tax3Id;
	}	
	public void setTax3Id(Integer value) {
		this.tax3Id = value;
	}
	public Integer getTax4Id() {
		return this.tax4Id;
	}	
	public void setTax4Id(Integer value) {
		this.tax4Id = value;
	}
	public Integer getTax5Id() {
		return this.tax5Id;
	}	
	public void setTax5Id(Integer value) {
		this.tax5Id = value;
	}
	public String getDelFlg() {
		return this.delFlg;
	}	
	public void setDelFlg(String value) {
		this.delFlg = value;
	}
	public Integer getVersion() {
		return this.version;
	}	
	public void setVersion(Integer value) {
		this.version = value;
	}
	public String getMemo() {
		return this.memo;
	}	
	public void setMemo(String value) {
		this.memo = value;
	}
	public String getBusinessUid() {
		return this.businessUid;
	}	
	public void setBusinessUid(String value) {
		this.businessUid = value;
	}
	public String getBusinessStus() {
		return this.businessStus;
	}	
	public void setBusinessStus(String value) {
		this.businessStus = value;
	}
	
	
}

