/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m7550.f011.order.dto;

import java.math.BigDecimal;
import java.util.Date;
/**
 * ## 类说明：
 * 	订单价格
 * @author    [jianana]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m7550.f011.order.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|jianana|新增|OrderRateDto.java新增
 */
public class OrderRateDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 7400984881587261856L;
	/**成人数**/
	private Integer adultCnt;
	/**儿童数**/
	private Integer childrenCnt;
	/**价格ID**/
	private Integer rateId;
	/**价格**/
	private BigDecimal rsvAmt;
	/**日期**/
	private Date rateDate;
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
	public Integer getAdultCnt() {
		return adultCnt;
	}
	public void setAdultCnt(Integer adultCnt) {
		this.adultCnt = adultCnt;
	}
	public Integer getChildrenCnt() {
		return childrenCnt;
	}
	public void setChildrenCnt(Integer childrenCnt) {
		this.childrenCnt = childrenCnt;
	}
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public BigDecimal getRsvAmt() {
		return rsvAmt;
	}
	public void setRsvAmt(BigDecimal rsvAmt) {
		this.rsvAmt = rsvAmt;
	}
	public Date getRateDate() {
		return rateDate;
	}
	public void setRateDate(Date rateDate) {
		this.rateDate = rateDate;
	}

}
