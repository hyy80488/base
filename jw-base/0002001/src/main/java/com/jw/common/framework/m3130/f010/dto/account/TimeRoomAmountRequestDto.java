package com.jw.common.framework.m3130.f010.dto.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.ObjectUtils;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	TimeRoomAmountRequestDto 钟点房价格计算
 * @author    [mdz]   
 * @version   [V1.0, 2017-05-18]
 * @package com.jw.hms.cmm.m3130.f010.dto.account
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-05-18|mdz|新增|TimeRoomAmountRequestDto新增
 */
@DrptDto(dtonm = "TimeRoomAmountRequestDto",dtodrpt="钟点房价格计算请求")
public class TimeRoomAmountRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8197758219324289504L;
	@DrptField(fieldnm="rateId",fielddrpt="价格id")
	private Integer rateId;
	@DrptField(fieldnm="roomTypId",fielddrpt="房型id")
	private Integer roomTypId;
	@DrptField(fieldnm="start_dt",fielddrpt="开始时间")
	private Date start_dt;
	@DrptField(fieldnm="hrstart_dhms",fielddrpt="钟点房开始时间")
	private Date hrstart_dhms;
	@DrptField(fieldnm="hrstart_dhms",fielddrpt="钟点房结束时间")
	private Date hrend_tm;
	@DrptField(fieldnm="extrAmt",fielddrpt="加收金额")
	private BigDecimal extrAmt;
	@DrptField(fieldnm="discPcnt",fielddrpt="折扣")
	private BigDecimal discPcnt;
	@DrptField(fieldnm="discAmt",fielddrpt="折扣金额")
	private BigDecimal discAmt;
	
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public Integer getRoomTypId() {
		return roomTypId;
	}
	public void setRoomTypId(Integer roomTypId) {
		this.roomTypId = roomTypId;
	}
	public Date getStart_dt() {
		return start_dt;
	}
	public void setStart_dt(Date start_dt) {
		this.start_dt = start_dt;
	}
	public Date getHrstart_dhms() {
		return ObjectUtils.firstNonNull(hrstart_dhms, new Date());
	}
	public void setHrstart_dhms(Date hrstart_dhms) {
		this.hrstart_dhms = hrstart_dhms;
	}
	public Date getHrend_tm() {
		return ObjectUtils.firstNonNull(hrend_tm, new Date());
	}
	public void setHrend_tm(Date hrend_tm) {
		this.hrend_tm = hrend_tm;
	}
	public BigDecimal getExtrAmt() {
		return extrAmt;
	}
	public void setExtrAmt(BigDecimal extrAmt) {
		this.extrAmt = extrAmt;
	}
	public BigDecimal getDiscPcnt() {
		return discPcnt;
	}
	public void setDiscPcnt(BigDecimal discPcnt) {
		this.discPcnt = discPcnt;
	}
	public BigDecimal getDiscAmt() {
		return discAmt;
	}
	public void setDiscAmt(BigDecimal discAmt) {
		this.discAmt = discAmt;
	}
	
	private Integer adultCnt; 
	private Integer childCnt;

	public Integer getAdultCnt() {
		if(Objects.isNull(adultCnt)){
			return 0;
		}
		return adultCnt;
	}
	public Integer getChildCnt() {
		if(Objects.isNull(childCnt)){
			return 0;
		}
		return childCnt;
	}
	public void setAdultCnt(Integer adultCnt) {
		this.adultCnt = adultCnt;
	}
	public void setChildCnt(Integer childCnt) {
		this.childCnt = childCnt;
	}
}
