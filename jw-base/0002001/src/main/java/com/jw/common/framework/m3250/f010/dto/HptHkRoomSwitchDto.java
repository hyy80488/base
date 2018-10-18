/**   
* @Title: HptHkRoomSwitchDto.java 
* @Package com.jw.common.framework.m3250.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年9月25日 上午11:48:36 
* @version V1.0   
*/
package com.jw.common.framework.m3250.f010.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年9月25日]
 * @package com.jw.common.framework.m3250.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月25日|tianpei|新增|HptHkRoomSwitchDto.java新增
*/
@DrptDto(dtonm = "房间开关",dtodrpt="房间开关")
public class HptHkRoomSwitchDto implements Serializable {

	private static final long serialVersionUID = -5607289005828847990L;
	
	@DrptField(fieldnm = "roomNums", fielddrpt = "房间号")
	private Set<String> roomNums;
	
	@DrptField(fieldnm = "tdndFlg", fielddrpt = "电话免扰标志")
	private String tdndFlg;
	
	@DrptField(fieldnm = "vocmailFlg", fielddrpt = "语音信箱")
	private String vocmailFlg;
	
	@DrptField(fieldnm = "tvLvl", fielddrpt = "IPTV")
	private String tvLvl;
	
	@DrptField(fieldnm = "netLvl", fielddrpt = "宽带")
	private String netLvl;
	
	@DrptField(fieldnm = "teleLvl", fielddrpt = "电话开通等级")
	private String teleLvl;
	
	@DrptField(fieldnm = "mcallFlg", fielddrpt = "设置叫醒")
	private String mcallFlg;
	
	@DrptField(fieldnm = "beginDt", fielddrpt = "开始日期")
	private Date beginDt;
	
	@DrptField(fieldnm = "endDt", fielddrpt = "结束日期")
	private Date endDt;
	
	@DrptField(fieldnm = "mcallDhms", fielddrpt = "叫醒时间")
	private String mcallDhms;
	
	private Set<RsvAccountTastDto> rsvAccountTastDtos;

	public Set<String> getRoomNums() {
		return roomNums;
	}

	public void setRoomNums(Set<String> roomNums) {
		this.roomNums = roomNums;
	}

	public String getTdndFlg() {
		return tdndFlg;
	}

	public void setTdndFlg(String tdndFlg) {
		this.tdndFlg = tdndFlg;
	}

	public String getVocmailFlg() {
		return vocmailFlg;
	}

	public void setVocmailFlg(String vocmailFlg) {
		this.vocmailFlg = vocmailFlg;
	}

	public String getTvLvl() {
		return tvLvl;
	}

	public void setTvLvl(String tvLvl) {
		this.tvLvl = tvLvl;
	}

	public String getNetLvl() {
		return netLvl;
	}

	public void setNetLvl(String netLvl) {
		this.netLvl = netLvl;
	}

	public String getTeleLvl() {
		return teleLvl;
	}

	public void setTeleLvl(String teleLvl) {
		this.teleLvl = teleLvl;
	}

	public String getMcallFlg() {
		return mcallFlg;
	}

	public void setMcallFlg(String mcallFlg) {
		this.mcallFlg = mcallFlg;
	}

	public Date getBeginDt() {
		return beginDt;
	}

	public void setBeginDt(Date beginDt) {
		this.beginDt = beginDt;
	}

	public Date getEndDt() {
		return endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getMcallDhms() {
		return mcallDhms;
	}

	public void setMcallDhms(String mcallDhms) {
		this.mcallDhms = mcallDhms;
	}

	public Set<RsvAccountTastDto> getRsvAccountTastDtos() {
		return rsvAccountTastDtos;
	}

	public void setRsvAccountTastDtos(Set<RsvAccountTastDto> rsvAccountTastDtos) {
		this.rsvAccountTastDtos = rsvAccountTastDtos;
	}

	
}
