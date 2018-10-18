/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m7550.f011.order.dto;
/**
 * ## 类说明：
 * 	订单宾客
 * @author    [jianana]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m7550.f011.order.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|jianana|新增|OrderGuestDto.java新增
 */
public class OrderGuestDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -6058479193271327403L;
	private String altNm;
	private String lastNm;
	private String firstNm;
	private String contantCtno;
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getContantCtno() {
		return contantCtno;
	}
	public void setContantCtno(String contantCtno) {
		this.contantCtno = contantCtno;
	}
	public String getAltNm() {
		return altNm;
	}
	public void setAltNm(String altNm) {
		this.altNm = altNm;
	}
	
}
