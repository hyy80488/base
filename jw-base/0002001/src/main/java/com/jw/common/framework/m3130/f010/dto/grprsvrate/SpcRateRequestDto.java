package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	特殊价格请求dto
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年8月1日]
 * @package com.jw.hms.cmm.m3130.f010.dto.rateconfig
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年8月1日|MiaoDaZhuang|新增|SpcRateRequestDto.java新增
*/
public class SpcRateRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 190656817140083328L;
	//价格
	private Integer rateId;
	//房型
	private Integer roomtypId;
	//请求数据
	private List<SpcRateDatasDto> datas;
	public Integer getRateId() {
		return rateId;
	}
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public List<SpcRateDatasDto> getDatas() {
		return datas;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public void setDatas(List<SpcRateDatasDto> datas) {
		this.datas = datas;
	}
	//星期
	private List<String> dow;
	public List<String> getDow() {
		return dow;
	}
	public void setDow(List<String> dow) {
		this.dow = dow;
	}
	
	private String unitUid;
    /**
     * @return the unitUid
     */
    public String getUnitUid() {
        return unitUid;
    }
    /**
     * @param unitUid the unitUid to set
     */
    public void setUnitUid(String unitUid) {
        this.unitUid = unitUid;
    }
	
	
}
