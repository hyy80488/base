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
 * 	房量推送(ARI规则)
 * @author    [lilin]   
 * @version   [V1.0, 2018年8月6日]
 * @package com.jw.common.framework.m5300.f010.dto.HotelInvCountNotifInfoDto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月6日|lilin|新增|HotelInvCountNotifInfoDto.java新增 	**/
public class HotelInvCountNotifInfoDto  implements Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 6175683452938966480L;
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
	/**房量类型，默认为2实时房量**/
	private String countType;
	/**房量值**/
	private String count;
	/**价格代码**/
	private String ratePlanCode;
	/**渠道代码**/
	private List<String> destinationSystemCodes;
	/**支付类型**/
	private String blanceType;
	/**是否更新保留房数据（T则更新保留以下保留房字段，F则不更新以下保留房字段）**/
	private String updateType;
	
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
	public String getCountType() {
		return countType;
	}
	public void setCountType(String countType) {
		this.countType = countType;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
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
	public String getBlanceType() {
		return blanceType;
	}
	public void setBlanceType(String blanceType) {
		this.blanceType = blanceType;
	}
	public String getUpdateType() {
		return updateType;
	}
	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}
}
