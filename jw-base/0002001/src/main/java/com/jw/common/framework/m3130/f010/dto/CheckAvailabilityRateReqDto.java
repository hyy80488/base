package com.jw.common.framework.m3130.f010.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.KeyValue;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 * 	可订性检查 价格
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年8月17日]
 * @package com.jw.common.framework.m3130.f010.dto
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年8月17日|MiaoDaZhuang|新增|CheckAvailabilityRateReqDto.java新增
*/
public class CheckAvailabilityRateReqDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -7954511781450393995L;
	private Set<Map<Integer, Integer>> lstRoom;
	public Set<Map<Integer, Integer>> getLstRoom() {
		return lstRoom;
	}
	public void setLstRoom(Set<Map<Integer, Integer>> lstRoom) {
		this.lstRoom = lstRoom;
	}
	
	private Date startDt;
	private Date endDt;
	public Date getStartDt() {
		return startDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	//全部价格校验
	private Boolean isFullRate = true;
	public Boolean getIsFullRate() {
		return isFullRate;
	}
	public void setIsFullRate(Boolean isFullRate) {
		this.isFullRate = isFullRate;
	}
	
}
