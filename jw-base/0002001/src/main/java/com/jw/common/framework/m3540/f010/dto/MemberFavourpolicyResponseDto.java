package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class MemberFavourpolicyResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 9135309741443672614L;
	//延迟退房时间类型   1：时长	2：固定时间
	private String delayFlg;
	//延迟退房时间：时长分钟数
	private Integer delayMinute;
	//延迟退房时间：固定时间值
	private String fixedTime;
	public String getDelayFlg() {
		return delayFlg;
	}
	public Integer getDelayMinute() {
		return delayMinute;
	}
	public String getFixedTime() {
		return fixedTime;
	}
	public void setDelayFlg(String delayFlg) {
		this.delayFlg = delayFlg;
	}
	public void setDelayMinute(Integer delayMinute) {
		this.delayMinute = delayMinute;
	}
	public void setFixedTime(String fixedTime) {
		this.fixedTime = fixedTime;
	}
}
