/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.util.Date;

public class CrsRsvAccountPackageDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5937078181119207327L;

	/**账号**/
	private String crsacctNo;
	/**价格日期**/
	private Date beginDt;
	/**价格日期**/
	private Date endDt;
	/**价格ID**/
	private Integer rateId;
	/**预订房含设定序号**/
	private String packageSeq;
	/**数量**/
	private Integer quantity;
	public String getCrsacctNo() {
		return crsacctNo;
	}
	public void setCrsacctNo(String crsacctNo) {
		this.crsacctNo = crsacctNo;
	}
	public Date getBeginDt() {
		return beginDt;
	}
	public void setBeginDt(Date beginDt) {
		this.beginDt = beginDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public String getPackageSeq() {
		return packageSeq;
	}
	public void setPackageSeq(String packageSeq) {
		this.packageSeq = packageSeq;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
