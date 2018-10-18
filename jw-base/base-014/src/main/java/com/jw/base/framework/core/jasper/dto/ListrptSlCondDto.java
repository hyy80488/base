package com.jw.base.framework.core.jasper.dto;

import java.util.List;

public class ListrptSlCondDto {
	private Integer id;
	// LIST报表ID
	private Integer listrptId;
	// 默认值输入方式 1：无默认值；2：有默认值；
	private String inputflg;
	// 默认值显示标志 0：否；1：是
	private String displayflg;
	// 修改标志 0：不可修改；1：可修改；
	private String updateflg;
	// 数据类型(1、文本；2、整型；3、浮点型)
	private String datatyp;
	// 报表模板-元素ID
	private Integer rpttmplelemId;
	// 元素名
	private String elementnm;
	// 元素描述
	private String elementdrpt;
	// 样式属性ID
	private Integer stylepropId;
	// 参数类型 1：样式参数；2：条件参数
	private String propflg;
	// 设置类型 1：手工输入；2：从值表中选择；3：范围值（整型、浮点型数使用）
	private String setflg;
	// 长度
	private Integer length;
	// 值
	private String val;
	// 样式属性
	private String propvalue;
	private Boolean propvaluelistflg;
	private List<String> propvaluelist;
	// 最小值
	private long minvlu;
	// 最大值
	private long maxvlu;
	// 样式名
	private String propnm;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getListrptId() {
		return listrptId;
	}

	public void setListrptId(Integer listrptId) {
		this.listrptId = listrptId;
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

	public Integer getRpttmplelemId() {
		return rpttmplelemId;
	}

	public void setRpttmplelemId(Integer rpttmplelemId) {
		this.rpttmplelemId = rpttmplelemId;
	}

	public String getElementnm() {
		return elementnm;
	}

	public void setElementnm(String elementnm) {
		this.elementnm = elementnm;
	}

	public String getElementdrpt() {
		return elementdrpt;
	}

	public void setElementdrpt(String elementdrpt) {
		this.elementdrpt = elementdrpt;
	}

	public Integer getStylepropId() {
		return stylepropId;
	}

	public void setStylepropId(Integer stylepropId) {
		this.stylepropId = stylepropId;
	}

	public String getPropflg() {
		return propflg;
	}

	public void setPropflg(String propflg) {
		this.propflg = propflg;
	}

	public String getSetflg() {
		return setflg;
	}

	public void setSetflg(String setflg) {
		this.setflg = setflg;
	}

	public String getPropvalue() {
		return propvalue;
	}

	public void setPropvalue(String propvalue) {
		this.propvalue = propvalue;
	}

	public Boolean getPropvaluelistflg() {
		return propvaluelistflg;
	}

	public void setPropvaluelistflg(Boolean propvaluelistflg) {
		this.propvaluelistflg = propvaluelistflg;
	}

	public List<String> getPropvaluelist() {
		return propvaluelist;
	}

	public void setPropvaluelist(List<String> propvaluelist) {
		this.propvaluelist = propvaluelist;
	}

	public long getMinvlu() {
		return minvlu;
	}

	public void setMinvlu(long minvlu) {
		this.minvlu = minvlu;
	}

	public long getMaxvlu() {
		return maxvlu;
	}

	public void setMaxvlu(long maxvlu) {
		this.maxvlu = maxvlu;
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

	public String getPropnm() {
		return propnm;
	}

	public void setPropnm(String propnm) {
		this.propnm = propnm;
	}

}
