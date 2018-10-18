package com.jw.common.framework.m3102.f001.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 * 	户籍发送
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年6月15日]
 * @package com.jw.common.framework.m3102.f001.dto
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年6月15日|MiaoDaZhuang|新增|LogResidenceGuestRequestDto.java新增
*/
public class LogResidenceGuestRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 9142839723616077332L;
	private String chainUid;
	private String unitUid;
	//宾客
	private List<Map<String, Object>> guests;
	//消息
	private List<Map<String, Object>> msgs;
	public String getChainUid() {
		return chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public List<Map<String, Object>> getGuests() {
		return guests;
	}
	public List<Map<String, Object>> getMsgs() {
		return msgs;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public void setGuests(List<Map<String, Object>> guests) {
		this.guests = guests;
	}
	public void setMsgs(List<Map<String, Object>> msgs) {
		this.msgs = msgs;
	}
}
