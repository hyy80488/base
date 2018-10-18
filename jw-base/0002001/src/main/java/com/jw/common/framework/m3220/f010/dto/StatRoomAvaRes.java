/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3220.f010.dto;

import java.io.Serializable;
/**
 * ## 类说明：
 * 	描述
 * @author    [jianana]   
 * @version   [V1.0, 2018年8月6日]
 * @package com.jw.common.framework.m3220.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月6日|jianana|新增|StatRoomAvaRes.java新增
 */
public class StatRoomAvaRes extends RoomAvaRes implements Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -1063966905555989808L;
	private Integer bs_sdbid;//在店当日预订当日入住散客
	private Integer bs_sdbgr;//在店当日预订当日入住团队
	private Integer bs_dudepwiid;//Dayuse预离walkin散客
	private Integer bs_dudepwigr;//Dayuse预离walkin团队
	private Integer bs_duoutwiid;//Dayuse已离walkin散客
	private Integer bs_duoutwigr;//Dayuse已离walkin团队
	private Integer bs_dudepsdbid;//Dayuse预离当日预订当日入住散客
	private Integer bs_dudepsdbgr;//Dayuse预离当日预订当日入住团队
	private Integer bs_duoutsdbid;//Dayuse已离当日预订当日入住散客
	private Integer bs_duoutsdbgr;//Dayuse已离当日预订当日入住团队
	public Integer getBs_sdbid() {
		return bs_sdbid;
	}
	public void setBs_sdbid(Integer bs_sdbid) {
		this.bs_sdbid = bs_sdbid;
	}
	public Integer getBs_sdbgr() {
		return bs_sdbgr;
	}
	public void setBs_sdbgr(Integer bs_sdbgr) {
		this.bs_sdbgr = bs_sdbgr;
	}
	public Integer getBs_dudepwiid() {
		return bs_dudepwiid;
	}
	public void setBs_dudepwiid(Integer bs_dudepwiid) {
		this.bs_dudepwiid = bs_dudepwiid;
	}
	public Integer getBs_dudepwigr() {
		return bs_dudepwigr;
	}
	public void setBs_dudepwigr(Integer bs_dudepwigr) {
		this.bs_dudepwigr = bs_dudepwigr;
	}
	public Integer getBs_duoutwiid() {
		return bs_duoutwiid;
	}
	public void setBs_duoutwiid(Integer bs_duoutwiid) {
		this.bs_duoutwiid = bs_duoutwiid;
	}
	public Integer getBs_duoutwigr() {
		return bs_duoutwigr;
	}
	public void setBs_duoutwigr(Integer bs_duoutwigr) {
		this.bs_duoutwigr = bs_duoutwigr;
	}
	public Integer getBs_dudepsdbid() {
		return bs_dudepsdbid;
	}
	public void setBs_dudepsdbid(Integer bs_dudepsdbid) {
		this.bs_dudepsdbid = bs_dudepsdbid;
	}
	public Integer getBs_dudepsdbgr() {
		return bs_dudepsdbgr;
	}
	public void setBs_dudepsdbgr(Integer bs_dudepsdbgr) {
		this.bs_dudepsdbgr = bs_dudepsdbgr;
	}
	public Integer getBs_duoutsdbid() {
		return bs_duoutsdbid;
	}
	public void setBs_duoutsdbid(Integer bs_duoutsdbid) {
		this.bs_duoutsdbid = bs_duoutsdbid;
	}
	public Integer getBs_duoutsdbgr() {
		return bs_duoutsdbgr;
	}
	public void setBs_duoutsdbgr(Integer bs_duoutsdbgr) {
		this.bs_duoutsdbgr = bs_duoutsdbgr;
	}
	
}
