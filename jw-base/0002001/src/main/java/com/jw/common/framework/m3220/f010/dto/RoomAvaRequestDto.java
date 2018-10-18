package com.jw.common.framework.m3220.f010.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.jw.base.framework.core.Constant3290010.ENUM_STAT_TYP;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

@DrptDto(dtonm = "RoomAvaRequestDto",dtodrpt="可用房查询请求dto")
public class RoomAvaRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2146556431677301362L;
	
	@DrptField(fieldnm="unitUid",fielddrpt="单位代码")
    private String unitUid;     
	@DrptField(fieldnm="fromDt",fielddrpt="开始日期")
    private Date fromDt;          
	@DrptField(fieldnm="toDt",fielddrpt="结束日期")
    private Date toDt;         
	@DrptField(fieldnm="areaId",fielddrpt="楼区")
	private Integer areaId;
	@DrptField(fieldnm="roomtypId",fielddrpt="房间类型")
	private Integer roomtypId;
	@DrptField(fieldnm="roomtypIds",fielddrpt="房间类型集合")
	private List<Integer> roomtypIds;
	@DrptField(fieldnm="hasRoomtypIds",fielddrpt="包含房间类型")
	private Set<Integer> hasRoomtypIds;
	public Date getFromDt() {
		return fromDt;
	}
	public void setFromDt(Date fromDt) {
		this.fromDt = fromDt;
	}
	public Date getToDt() {
		return toDt;
	}
	public void setToDt(Date toDt) {
		this.toDt = toDt;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public List<Integer> getRoomtypIds() {
		return roomtypIds;
	}
	public void setRoomtypIds(List<Integer> roomtypIds) {
		this.roomtypIds = roomtypIds;
	}
	
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	@JSONField(serialize=false)
	public Set<Integer> getHasRoomtypIds() {
		return hasRoomtypIds;
	}
	public void setHasRoomtypIds(Set<Integer> hasRoomtypIds) {
		this.hasRoomtypIds = hasRoomtypIds;
	}
	//统计类型
	private Set<String> statTyps;
	public Set<String> getStatTyps() {
		if(CollectionUtils.isEmpty(statTyps)){
			statTyps = new HashSet<>();
			statTyps.add(ENUM_STAT_TYP.ALLR.getValue());
		}
		return statTyps;
	}
	public void setStatTyps(Set<String> statTyps) {
		this.statTyps = statTyps;
	}
	
	
}
