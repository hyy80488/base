package com.jw.base.framework.core.jasper.dto;

import java.util.List;

public class ListrptdsDto {

	// LIST报表-数据集ID
	private Integer listrptdsId;
	// 数据值ID
	private Integer datasetId;
	// 配置标记 1：报表模板数据集；2：自定义数据集
	private String defflg;
	// 数据集类型 1：主表；2：从表；3：子表
	private String dsflg;
	// 关联主数据集ID
	private Integer rpttmpldsdefId;
	// 数据集配置要求ID
	private Integer secrpttmpldsdefId;
	// 配置要求名
	private String dsdefnm;

	// LIST报表-数据条件
	private List<ListrptDsCondDto> listrptDsCondDto;

	public Integer getListrptdsId() {
		return listrptdsId;
	}

	public void setListrptdsId(Integer listrptdsId) {
		this.listrptdsId = listrptdsId;
	}

	public String getDefflg() {
		return defflg;
	}

	public void setDefflg(String defflg) {
		this.defflg = defflg;
	}

	public List<ListrptDsCondDto> getListrptDsCondDto() {
		return listrptDsCondDto;
	}

	public void setListrptDsCondDto(List<ListrptDsCondDto> listrptDsCondDto) {
		this.listrptDsCondDto = listrptDsCondDto;
	}

	public Integer getDatasetId() {
		return datasetId;
	}

	public void setDatasetId(Integer datasetId) {
		this.datasetId = datasetId;
	}

	public String getDsflg() {
		return dsflg;
	}

	public void setDsflg(String dsflg) {
		this.dsflg = dsflg;
	}

	public Integer getRpttmpldsdefId() {
		return rpttmpldsdefId;
	}

	public void setRpttmpldsdefId(Integer rpttmpldsdefId) {
		this.rpttmpldsdefId = rpttmpldsdefId;
	}

	public Integer getSecrpttmpldsdefId() {
		return secrpttmpldsdefId;
	}

	public void setSecrpttmpldsdefId(Integer secrpttmpldsdefId) {
		this.secrpttmpldsdefId = secrpttmpldsdefId;
	}

	public String getDsdefnm() {
		return dsdefnm;
	}

	public void setDsdefnm(String dsdefnm) {
		this.dsdefnm = dsdefnm;
	}

}
