/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3410.f010.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	当天统计信息
 * @author    [jianana]   
 * @version   [V1.0, 2017年10月10日]
 * @package com.jw.hms.pms.m3220.f010.dto.rsvAccount
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年10月10日|jianana|新增|AcctNoDto.java新增
 */
@DrptDto(dtonm = "StatParamDto",dtodrpt="当天统计信息")
public class StatParamDto extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 7066484327889312395L;
	@DrptField(fieldnm="startDt", fielddrpt="开始日期")
	private Date startDt;
	@DrptField(fieldnm="endDt", fielddrpt="结束日期")
	private Date endDt;
	@DrptField(fieldnm="nowDt", fielddrpt="当前日期")
	private Date nowDt;
	@DrptField(fieldnm="statTyp", fielddrpt="请求类型  0当天   1本周   2本月")
	private String statTyp;
	/**
	 * ALLR：全部房数，COR：免费房数，HUR：自用房数，VIPR：VIP房数，
	 * ONER：1人住房数，TWOR：2人住房数，TOMR：3人及以上住房数（Three Or More），
	 * CHLDR：纯儿童房数，HCHR：带儿童房数，CLKR：钟点房数，LSR：长包房数
	 * ALLP：全部人数，COP：免费人数，HOP：自用人数，VIPP：VIP人数，CLKP：钟点房人数，LSP：长包房人数
	 */
	@DrptField(fieldnm="statTyps", fielddrpt="统计类型")
	private List<String> statTyps;
	/**
	 * 预计出租率
	 * 预计收入
	 * 房费
	 * 已售房数
	 */
	@DrptField(fieldnm="fieldNms", fielddrpt="显示集合")
	private Map<String, List<String>> fieldNms;
	
	@DrptField(fieldnm="unitUid", fielddrpt="酒店代码")
	private String unitUid;
	
	
	
	public String getStatTyp() {
		return statTyp;
	}
	public void setStatTyp(String statTyp) {
		this.statTyp = statTyp;
	}
	public Date getNowDt() {
		return nowDt;
	}
	public void setNowDt(Date nowDt) {
		this.nowDt = nowDt;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public Date getStartDt() {
		return startDt;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	public List<String> getStatTyps() {
		return statTyps;
	}
	public void setStatTyps(List<String> statTyps) {
		this.statTyps = statTyps;
	}
	public Map<String, List<String>> getFieldNms() {
		return fieldNms;
	}
	public void setFieldNms(Map<String, List<String>> fieldNms) {
		this.fieldNms = fieldNms;
	}
	
}
