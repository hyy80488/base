/**   
* @Title: CrsRsvCrsorderNightCheckResDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月20日 下午8:46:38 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.io.Serializable;

/**
 * ## 类说明：
 * 	夜审pms中查询需要上传ota的字段信息
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|tianpei|新增|CrsRsvCrsorderNightCheckResDto.java新增
*/
public class CrsRsvCrsorderNightCheckResDto implements Serializable{
	
	private static final long serialVersionUID = 7548317644441515898L;

	private String acctNo;

	private String crsNum;
	
	private String acctStus;
	
	private String checkinDt;
	
	private String checkoutDt;
	
	private String roomtypId;
	
	private String roomNum;
	
	private String shareSeq;
	
	private String firstNm;
	
	private String lastNm;
	
	private String altNm;

	public String getCrsNum() {
		return crsNum;
	}

	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}

	public String getAcctStus() {
		return acctStus;
	}

	public void setAcctStus(String acctStus) {
		this.acctStus = acctStus;
	}

	public String getCheckinDt() {
		return checkinDt;
	}

	public void setCheckinDt(String checkinDt) {
		this.checkinDt = checkinDt;
	}

	public String getCheckoutDt() {
		return checkoutDt;
	}

	public void setCheckoutDt(String checkoutDt) {
		this.checkoutDt = checkoutDt;
	}

	public String getRoomtypId() {
		return roomtypId;
	}

	public void setRoomtypId(String roomtypId) {
		this.roomtypId = roomtypId;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getShareSeq() {
		return shareSeq;
	}

	public void setShareSeq(String shareSeq) {
		this.shareSeq = shareSeq;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public String getAltNm() {
		return altNm;
	}

	public void setAltNm(String altNm) {
		this.altNm = altNm;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	
}
