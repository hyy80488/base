package com.jw.common.framework.m3310.f010.dto;

import java.util.Date;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class PosNightRequestDto extends RequestBaseDto implements java.io.Serializable {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -5791184940305023074L;
	/**
	 * @Fields 新酒店日期
	 */
	private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
