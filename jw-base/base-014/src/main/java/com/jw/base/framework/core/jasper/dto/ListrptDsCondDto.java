package com.jw.base.framework.core.jasper.dto;

import java.util.List;

public class ListrptDsCondDto {

	private Integer id;
	// LIST报表-数据集ID
	private Integer listrptdsId;
	// 数据值ID
	private Integer datasetId;
	// 数据值-条件参数ID
	private Integer datasetparamId;
	// 默认值输入方式 1：无默认值；2：有默认值-输入；3：报表条件参数（表示和别人共用参数）
	private String inputflg;
	// 默认值显示标志
	private String displayflg;
	// 修改标志
	private String updateflg;
	// 数据类型(1、文本；2、整型；3、浮点型；4、日期；5、时间；)
	private String datatyp;
	// 长度
	private Integer length;
	// 值
	private String val;
	// 描述
	private String desc;
	// 下拉列表
	private Boolean selectflg;
	// 结果集列表
	private List<ListrptDatalistDto> datalist;
	// 值域类型(1：不限；2：范围；3：参数值集合；4：数据值集合；9：系统域集合；)
	private Integer dtdomaintyp;
	// 比较符类型
	private String operatorstyp;
	// 阈值
	private String tsval;
	// 左阈值
	private String leftval;
	// 右阈值
	private String rightval;
	// 关联LIST报表-数据集ID
	private Integer maplistrptdsId;
	// 关联数据集的条件参数ID
	private Integer mapparamId;
	// 父ID集合
	private String pIds = "";
	// 子ID集合
	private String cIds = "";
	// 级联标志 0：不级联；1：级联
	private Integer cascadeflg = 0;
	// 值类型 20以上为系统级条件
	private Integer datastrudtlvlutyp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getListrptdsId() {
		return listrptdsId;
	}

	public void setListrptdsId(Integer listrptdsId) {
		this.listrptdsId = listrptdsId;
	}

	public Integer getDatasetId() {
		return datasetId;
	}

	public void setDatasetId(Integer datasetId) {
		this.datasetId = datasetId;
	}

	public Integer getDatasetparamId() {
		return datasetparamId;
	}

	public void setDatasetparamId(Integer datasetparamId) {
		this.datasetparamId = datasetparamId;
	}

	public String getInputflg() {
		return inputflg;
	}

	public void setInputflg(String inputflg) {
		this.inputflg = inputflg;
	}

	public String getDisplayflg() {
		return displayflg;
	}

	public void setDisplayflg(String displayflg) {
		this.displayflg = displayflg;
	}

	public String getUpdateflg() {
		return updateflg;
	}

	public void setUpdateflg(String updateflg) {
		this.updateflg = updateflg;
	}

	public String getDatatyp() {
		return datatyp;
	}

	public void setDatatyp(String datatyp) {
		this.datatyp = datatyp;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Boolean getSelectflg() {
		return selectflg;
	}

	public void setSelectflg(Boolean selectflg) {
		this.selectflg = selectflg;
	}

	public List<ListrptDatalistDto> getDatalist() {
		return datalist;
	}

	public void setDatalist(List<ListrptDatalistDto> datalist) {
		this.datalist = datalist;
	}

	public Integer getDtdomaintyp() {
		return dtdomaintyp;
	}

	public void setDtdomaintyp(Integer dtdomaintyp) {
		this.dtdomaintyp = dtdomaintyp;
	}

	public String getOperatorstyp() {
		return operatorstyp;
	}

	public void setOperatorstyp(String operatorstyp) {
		this.operatorstyp = operatorstyp;
	}

	public String getTsval() {
		return tsval;
	}

	public void setTsval(String tsval) {
		this.tsval = tsval;
	}

	public String getLeftval() {
		return leftval;
	}

	public void setLeftval(String leftval) {
		this.leftval = leftval;
	}

	public String getRightval() {
		return rightval;
	}

	public void setRightval(String rightval) {
		this.rightval = rightval;
	}

	public Integer getMaplistrptdsId() {
		return maplistrptdsId;
	}

	public void setMaplistrptdsId(Integer maplistrptdsId) {
		this.maplistrptdsId = maplistrptdsId;
	}

	public Integer getMapparamId() {
		return mapparamId;
	}

	public void setMapparamId(Integer mapparamId) {
		this.mapparamId = mapparamId;
	}

	public String getpIds() {
		return pIds;
	}

	public void setpIds(String pIds) {
		this.pIds = pIds;
	}

	public String getcIds() {
		return cIds;
	}

	public void setcIds(String cIds) {
		this.cIds = cIds;
	}

	public Integer getCascadeflg() {
		return cascadeflg;
	}

	public void setCascadeflg(Integer cascadeflg) {
		this.cascadeflg = cascadeflg;
	}

	public Integer getDatastrudtlvlutyp() {
		return datastrudtlvlutyp;
	}

	public void setDatastrudtlvlutyp(Integer datastrudtlvlutyp) {
		this.datastrudtlvlutyp = datastrudtlvlutyp;
	}

}
