/**   
* @Title: RsvAccountTastDto.java 
* @Package com.jw.common.framework.m3250.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年9月25日 下午6:24:55 
* @version V1.0   
*/
package com.jw.common.framework.m3250.f010.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * ## 类说明：
 * 	供开关任务调用
 * @author    [tianpei]   
 * @version   [V1.0, 2018年9月25日]
 * @package com.jw.common.framework.m3250.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月25日|tianpei|新增|RsvAccountTastDto.java新增
*/
public class RsvAccountTastDto implements Serializable {

	private static final long serialVersionUID = -8175755727794723023L;
	
	private String acctNo;
	
	private String roomNum;
	
	private String guestNm;
	
	private String acctStus;
	
	private Date arrDt;
	
	private Date dptDt;

	private String lastNm;
	
	private String vip;
	
	private String title;
	
	private String otherMsg;

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getGuestNm() {
		return guestNm;
	}

	public void setGuestNm(String guestNm) {
		this.guestNm = guestNm;
	}

	public String getAcctStus() {
		return acctStus;
	}

	public void setAcctStus(String acctStus) {
		this.acctStus = acctStus;
	}

	public Date getArrDt() {
		return arrDt;
	}

	public void setArrDt(Date arrDt) {
		this.arrDt = arrDt;
	}

	public Date getDptDt() {
		return dptDt;
	}

	public void setDptDt(Date dptDt) {
		this.dptDt = dptDt;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOtherMsg() {
		return otherMsg;
	}

	public void setOtherMsg(String otherMsg) {
		this.otherMsg = otherMsg;
	}

	/** 
	 * ## 方法说明：
	 * 	一个房间只能有一条记录
	 * @return
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roomNum == null) ? 0 : roomNum.hashCode());
		return result;
	}

	/** 
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @param obj
	 * @return
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RsvAccountTastDto other = (RsvAccountTastDto) obj;
		if (roomNum == null) {
			if (other.roomNum != null)
				return false;
		} else if (!roomNum.equals(other.roomNum))
			return false;
		return true;
	}

}
