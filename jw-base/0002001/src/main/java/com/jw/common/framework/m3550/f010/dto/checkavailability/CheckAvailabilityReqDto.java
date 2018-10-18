package com.jw.common.framework.m3550.f010.dto.checkavailability;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 *  可订性检查 请求dto
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年8月17日]
 * @package com.jw.common.framework.m3550.f010.dto.checkavailability
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年8月17日|MiaoDaZhuang|新增|CheckAvailabilityReqDto.java新增
*/
public class CheckAvailabilityReqDto extends RequestBaseDto implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1945337134244912420L;
	
	//价格id
	private Integer rateId;
	//房型id
	private Integer roomtypId;
	//来期
	private Date startDt;
	//离期
	private Date endDt;
	//房数
	private Integer roomCnt;
	//渠道号
	private String  channelNo;
	public Integer getRateId() {
		return rateId;
	}
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public Date getStartDt() {
		return startDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public Integer getRoomCnt() {
		return roomCnt;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	public void setRoomCnt(Integer roomCnt) {
		this.roomCnt = roomCnt;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	
	private Boolean isCreateAcct = false;
	public Boolean getIsCreateAcct() {
		return isCreateAcct;
	}
	public void setIsCreateAcct(Boolean isCreateAcct) {
		this.isCreateAcct = isCreateAcct;
	}
	//先付 预付标记
	private String chnlinfo_str2;
	public String getChnlinfo_str2() {
		return chnlinfo_str2;
	}
	public void setChnlinfo_str2(String chnlinfo_str2) {
		this.chnlinfo_str2 = chnlinfo_str2;
	}

	private List<Integer> rateIds;
	public List<Integer> getRateIds() {
		return rateIds;
	}
	public void setRateIds(List<Integer> rateIds) {
		this.rateIds = rateIds;
	}
	//每日价格
	private Map<Date, BigDecimal> dateAmts;
	public Map<Date, BigDecimal> getDateAmts() {
		return dateAmts;
	}
	public void setDateAmts(Map<Date, BigDecimal> dateAmts) {
		this.dateAmts = dateAmts;
	}
	
	private Integer sysChannelId;
	public Integer getSysChannelId() {
		return sysChannelId;
	}
	public void setSysChannelId(Integer sysChannelId) {
		this.sysChannelId = sysChannelId;
	}
}
