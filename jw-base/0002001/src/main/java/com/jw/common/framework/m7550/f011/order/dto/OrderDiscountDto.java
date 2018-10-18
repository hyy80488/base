/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m7550.f011.order.dto;

import java.math.BigDecimal;

/**
 * ## 类说明：
 * 	订单折扣
 * @author    [jianana]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m7550.f011.order.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|jianana|新增|OrderDiscountDto.java新增
 */
public class OrderDiscountDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -9025046684169592222L;
	private Integer discountId;
	private BigDecimal discountAmt;
	public Integer getDiscountId() {
		return discountId;
	}
	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}
	public BigDecimal getDiscountAmt() {
		return discountAmt;
	}
	public void setDiscountAmt(BigDecimal discountAmt) {
		this.discountAmt = discountAmt;
	}
	
}
