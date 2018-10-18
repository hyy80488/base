/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif;

import java.io.Serializable;
import java.util.List;

/**
 * ## 类说明：
 * 	描述
 * @author    [lilin]   
 * @version   [V1.0, 2018年8月7日]
 * @package com.jw.common.framework.m5300.f010.dto.OTAHotelNotif
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月7日|lilin|新增|HotelAvailNotifInfoDto.java新增
*/
public class HotelAvailNotifInfoDto implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5803465617208215271L;

	/**房量生效开始时间**/
	private String start;
	/**房量生效结束时间**/
	private String end;
	/**PMS 房型代码**/
	private String invTypeCode;
	/**星期一  该天是否有效(0为不生效，1为生效)**/
	private String mon;
	/**星期二  该天是否有效(0为不生效，1为生效)**/
	private String tue;
	/**星期三  该天是否有效(0为不生效，1为生效)**/
	private String weds;
	/**星期四  该天是否有效(0为不生效，1为生效)**/
	private String thur;
	/**星期五  该天是否有效(0为不生效，1为生效)**/
	private String fri;
	/**星期六  该天是否有效(0为不生效，1为生效)**/
	private String sat;
	/**星期七  该天是否有效(0为不生效，1为生效)**/
	private String sun;
	/**房间状态 开房：Open、关房：Close**/
	private String status ;
	private String restriction ;
	/**价格代码**/
	private String ratePlanCode;
	/**渠道代码**/
	private List<String> destinationSystemCodes;
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getInvTypeCode() {
		return invTypeCode;
	}
	public void setInvTypeCode(String invTypeCode) {
		this.invTypeCode = invTypeCode;
	}
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public String getTue() {
		return tue;
	}
	public void setTue(String tue) {
		this.tue = tue;
	}
	public String getWeds() {
		return weds;
	}
	public void setWeds(String weds) {
		this.weds = weds;
	}
	public String getThur() {
		return thur;
	}
	public void setThur(String thur) {
		this.thur = thur;
	}
	public String getFri() {
		return fri;
	}
	public void setFri(String fri) {
		this.fri = fri;
	}
	public String getSat() {
		return sat;
	}
	public void setSat(String sat) {
		this.sat = sat;
	}
	public String getSun() {
		return sun;
	}
	public void setSun(String sun) {
		this.sun = sun;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRestriction() {
		return restriction;
	}
	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}
	public String getRatePlanCode() {
		return ratePlanCode;
	}
	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}
	public List<String> getDestinationSystemCodes() {
		return destinationSystemCodes;
	}
	public void setDestinationSystemCodes(List<String> destinationSystemCodes) {
		this.destinationSystemCodes = destinationSystemCodes;
	}
	
	
}
