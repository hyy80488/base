package com.jw.common.framework.m3130.f010.dto.distribute;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class DistributeRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 6732315849454959503L;
	@DrptField(fieldnm = "paramTyp", fielddrpt = "导入类型")
	private String paramTyp;
	@DrptField(fieldnm = "paramIds", fielddrpt = "导入id数组")
	private List<Integer> paramIds;
	@DrptField(fieldnm = "units", fielddrpt = "酒店")
	private List<String> units;
	public String getParamTyp() {
		return paramTyp;
	}
	public List<Integer> getParamIds() {
		return paramIds;
	}
	public List<String> getUnits() {
		return units;
	}
	public void setParamTyp(String paramTyp) {
		this.paramTyp = paramTyp;
	}
	public void setParamIds(List<Integer> paramIds) {
		this.paramIds = paramIds;
	}
	public void setUnits(List<String> units) {
		this.units = units;
	}
	
	private String unitUid;
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	
	@DrptField(fieldnm="beCtrlFeilds",fielddrpt="被管控字段")
	private List<String> beCtrlFeilds;
	public List<String> getBeCtrlFeilds() {
		return beCtrlFeilds;
	}
	public void setBeCtrlFeilds(List<String> beCtrlFeilds) {
		this.beCtrlFeilds = beCtrlFeilds;
	}
	@DrptField(fieldnm="ctrlUnits",fielddrpt="管控酒店")
	private List<String> ctrlUnits;
	public List<String> getCtrlUnits() {
		return ctrlUnits;
	}
	public void setCtrlUnits(List<String> ctrlUnits) {
		this.ctrlUnits = ctrlUnits;
	}
	
	private String useFlg;
	public String getUseFlg() {
		return useFlg;
	}
	public void setUseFlg(String useFlg) {
		this.useFlg = useFlg;
	}
	
	private String mngUnitUid;
	public String getMngUnitUid() {
		return mngUnitUid;
	}
	public void setMngUnitUid(String mngUnitUid) {
		this.mngUnitUid = mngUnitUid;
	}
	
	private Boolean isCheckUse = true;
	public Boolean getIsCheckUse() {
		return isCheckUse;
	}
	public void setIsCheckUse(Boolean isCheckUse) {
		this.isCheckUse = isCheckUse;
	}
	//导入中存在的类型 id
	private Map<String, List<Integer>> paramTypId = new HashMap<>();
	public Map<String, List<Integer>> getParamTypId() {
		return paramTypId;
	}
	public void setParamTypId(Map<String, List<Integer>> paramTypId) {
		this.paramTypId = paramTypId;
	}
	//是否分发
	private Boolean distFlg = true;
	public Boolean getDistFlg() {
		return distFlg;
	}
	public void setDistFlg(Boolean distFlg) {
		this.distFlg = distFlg;
	}
	//税制
	private String taxation;
	public String getTaxation() {
		return taxation;
	}
	public void setTaxation(String taxation) {
		this.taxation = taxation;
	}
	
}
