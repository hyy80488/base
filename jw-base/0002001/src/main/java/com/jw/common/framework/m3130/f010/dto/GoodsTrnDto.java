
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.math.BigDecimal;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/** 
 * ## 类说明：
 * 	故障房表查询列表信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-27]
 * @package com.jw.hms.pms.m3250.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-27|jianana|新增|HptHkRoomRepairResultDto新增
 */
@DrptDto(dtonm = "故障房表查询列表信息数据传输对象",dtodrpt="故障房表查询列表信息数据传输对象")
public class GoodsTrnDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 2658708421411283881L;
	@DrptField(fieldnm="productId ",fielddrpt="消费点Id ")
	private Integer productId;
	@DrptField(fieldnm="goodsId",fielddrpt="商品Id ")
	private Integer goodsId;
	@DrptField(fieldnm="goodsQuant",fielddrpt="商品数量 ")
	private BigDecimal goodsQuant;
	@DrptField(fieldnm = "trnRef", fielddrpt = "参考号")
	private String trnRef;
	public String getTrnRef() {
		return trnRef;
	}
	public void setTrnRef(String trnRef) {
		this.trnRef = trnRef;
	}
	public String getTrnCmnt() {
		return trnCmnt;
	}
	public void setTrnCmnt(String trnCmnt) {
		this.trnCmnt = trnCmnt;
	}
	@DrptField(fieldnm = "trnCmnt", fielddrpt = "交易注释")
	private String trnCmnt;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public BigDecimal getGoodsQuant() {
		return goodsQuant;
	}
	public void setGoodsQuant(BigDecimal goodsQuant) {
		this.goodsQuant = goodsQuant;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

