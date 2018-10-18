/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

public class CrsRsvAccountGuestDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 6145932226786735422L;

	/**宾客ID**/
	private String firstNm;
	private String lastNm;
	private String altNm;
	private String tele_ctno;
	
	public String getAltNm() {
		return altNm;
	}
	public void setAltNm(String altNm) {
		this.altNm = altNm;
	}
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public String getTele_ctno() {
		return tele_ctno;
	}
	public void setTele_ctno(String tele_ctno) {
		this.tele_ctno = tele_ctno;
	}
	
}
