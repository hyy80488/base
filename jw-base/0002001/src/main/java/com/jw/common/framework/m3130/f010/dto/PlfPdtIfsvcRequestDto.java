package com.jw.common.framework.m3130.f010.dto;

import java.io.Serializable;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class PlfPdtIfsvcRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5869466174110855535L;
	@DrptField(fieldnm="iftypeId", fielddrpt="设备类型", nullable = "true", length = "10")
	private Integer iftypeId;
	@DrptField(fieldnm="iftypeIds", fielddrpt="设备类型", nullable = "true", length = "10")
	private List<Integer> iftypeIds;
	@DrptField(fieldnm="ifsvcverId", fielddrpt="接口版本编号", nullable = "true", length = "10")
	private List<Integer> ifsvcverIds;
	@DrptField(fieldnm="wsNos", fielddrpt="工作站号", nullable = "true", length = "10")
	private List<String> wsNos;
	@DrptField(fieldnm="ifexeTyps", fielddrpt="接口实现类型", nullable = "true", length = "10")
	private  List<String> ifexeTyps;
	@DrptField(fieldnm="paramNms", fielddrpt="接口名称", nullable = "true", length = "10")
	private  List<String> paramNms;
	private List<String> unitUids;
	private String unitUid;
	private String chainUid;
	@DrptField(fieldnm="channelIds", fielddrpt="渠道id", nullable = "true", length = "10")
	private List<Integer> channelIds;
	public List<Integer> getChannelIds() {
		return channelIds;
	}
	public void setChannelIds(List<Integer> channelIds) {
		this.channelIds = channelIds;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public Integer getIftypeId() {
		return iftypeId;
	}
	public void setIftypeId(Integer iftypeId) {
		this.iftypeId = iftypeId;
	}
	public String getChainUid() {
		return chainUid;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public List<String> getUnitUids() {
		return unitUids;
	}
	public void setUnitUids(List<String> unitUids) {
		this.unitUids = unitUids;
	}
	public List<Integer> getIftypeIds() {
		return iftypeIds;
	}
	public void setIftypeIds(List<Integer> iftypeIds) {
		this.iftypeIds = iftypeIds;
	}
	public List<Integer> getIfsvcverIds() {
		return ifsvcverIds;
	}
	public void setIfsvcverIds(List<Integer> ifsvcverIds) {
		this.ifsvcverIds = ifsvcverIds;
	}
	public List<String> getWsNos() {
		return wsNos;
	}
	public void setWsNos(List<String> wsNos) {
		this.wsNos = wsNos;
	}
	public List<String> getIfexeTyps() {
		return ifexeTyps;
	}
	public void setIfexeTyps(List<String> ifexeTyps) {
		this.ifexeTyps = ifexeTyps;
	}
	public List<String> getParamNms() {
		return paramNms;
	}
	public void setParamNms(List<String> paramNms) {
		this.paramNms = paramNms;
	}
	
}
