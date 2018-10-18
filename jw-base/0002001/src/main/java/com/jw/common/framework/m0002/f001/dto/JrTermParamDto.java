/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
/**
 * ## 类说明：
 * 	报表查询条件
 * @author    [liubowen]   
 * @version   [V1.0, 2017年5月22日]
 * @package com.jw.hms.cmm.m3104.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年5月22日|liubowen|新增|JasperQueryFieldParamDto.java新增
 */
@DrptDto(dtonm="JrTermParamDto", dtodrpt="报表查询条件")
public class JrTermParamDto implements java.io.Serializable {
	
	private static final long serialVersionUID = -6114050167303068624L;

	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码 UUID", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm = "unitUidPos", fielddrpt = "单位代码 UUID", nullable = "false", length = "40")
	private String unitUidPos;
	
	@DrptField(fieldnm = "paramTyp", fielddrpt = "配置类型 对应主表中param_typ值，或者开关表的option_typ值", nullable = "false", length = "20")
	private String paramTyp;
	
	@DrptField(fieldnm = "id", fielddrpt = "id值")
	private Integer id;
	
	@DrptField(fieldnm = "fieldNm", fielddrpt = "字段名 ", nullable = "false", length = "30")
	private String fieldNm;
	
	//例如是国家  指向 省，市的字段域  【PROVINCE,CITY】
	@DrptField(fieldnm = "childFieldNm", fielddrpt = "指向子字段名 ")
	private List<String> childFieldNm;
	
	@DrptField(fieldnm = "fielddispNm", fielddrpt = "字段配置显示名 ", nullable = "false", length = "30")
	private String fielddispNm;
	
	@DrptField(fieldnm = "seq", fielddrpt = "序号 ", nullable = "true", length = "5")
	private Integer seq;
	
	@DrptField(fieldnm = "fielddataTyp", fielddrpt = "字段数据类型【1、文本】【2、整形】【3、浮点型】【4、日期】【5、时间】", nullable = "false", length = "3")
	private String fielddataTyp;
	
	@DrptField(fieldnm = "fielddataLen", fielddrpt = "字段数据长度 ", nullable = "false", length = "5")
	private Integer fielddataLen;
	
	@DrptField(fieldnm = "fielddecimalLen", fielddrpt = "字段小数位数 ", nullable = "true", length = "5")
	private Integer fielddecimalLen;
	
	@DrptField(fieldnm = "datapickTyp", fielddrpt = "取值方式 【0:输入】【1:单选】【2:多选】", nullable = "false", length = "3")
	private String datapickTyp;
	
	@DrptField(fieldnm = "datapickParam", fielddrpt = "取值方式【P：主表取值】【A：固定配置取值】【J自定义json数据】", nullable = "false", length = "3")
	private String datapickParam;
	
	@DrptField(fieldnm = "datapickField", fielddrpt = "取值参数 ", nullable = "true", length = "2000")
	private String datapickField;
	
	@DrptField(fieldnm = "dataRange", fielddrpt = "取值范围 正则，判断是否符合范围", nullable = "true", length = "2000")
	private String dataRange;
	
	@DrptField(fieldnm = "mustFlg", fielddrpt = "是否必填域 【1:必填】【0:非必填】。默认：0", nullable = "false", length = "1")
	private String mustFlg;
	
	@DrptField(fieldnm = "musHidden", fielddrpt = "是否隐藏 【1:隐藏】【0:非隐藏】。默认：0", nullable = "true", length = "1")
	private String musHidden;
	
	@DrptField(fieldnm = "filedsettingTyp", fielddrpt = "字段配置参数 【0：列表和配置都不显示】【 1：列表显示，配置不显示】【 2：列表不显示，配置显示】【 3：列表不显示，配置修改 】【4：列表显示，配置显示】【 5：列表显示，配置修改】", nullable = "false", length = "3")
	private String filedsettingTyp;
	
	@DrptField(fieldnm = "displayFlg", fielddrpt = "是否显示 【1:是】【0:否】。默认：1", nullable = "true", length = "1")
	private String displayFlg;
	
	@DrptField(fieldnm = "updateFlg", fielddrpt = "是否可修改 【1:是】【0:否】。默认：1", nullable = "true", length = "1")
	private String updateFlg;
	
	@DrptField(fieldnm = "dtdomaintyp", fielddrpt = "校验类型：DTDOMAINTYP：【1、不限】【2、范围】【3、参数值集合】【4、数据值集合】【5、系统域集合】", nullable = "true")
	private String dtdomaintyp;
	
	@DrptField(fieldnm = "operatorstyp", fielddrpt = "校验范围比较符：OPERATORSTYP：【1、=】【2、>】【3、>=】【4、<】【5、<=】【6、<>】【7、>X AND Y<】【8、>X AND Y<=】【9、>=X AND Y<】【10、>=X AND Y<=】【11、<X AND Y<】【12、<X AND Y<=】【13、<=X AND Y<】【14、<=X AND Y<=】", nullable = "true")
	private String operatorstyp;
	
	@DrptField(fieldnm = "checkSvlu", fielddrpt = "校验字符串", nullable = "true")
	private String checkSvlu;
	
	@DrptField(fieldnm = "checkNvlu", fielddrpt = "校验数值", nullable = "true")
	private BigDecimal checkNvlu;
	
	@DrptField(fieldnm = "checkDvlu", fielddrpt = "校验时间", nullable = "true")
	private Date checkDvlu;
	
	@DrptField(fieldnm = "svlu", fielddrpt = "字符串文本默认值", nullable = "true")
	private String svlu;
	
	@DrptField(fieldnm = "nvlu", fielddrpt = "数值默认值", nullable = "true")
	private BigDecimal nvlu;
	
	@DrptField(fieldnm = "dvlu", fielddrpt = "时间默认值", nullable = "true")
	private Date dvlu;
	
	@DrptField(fieldnm = "memo", fielddrpt = "暂存字典类型，如@FLOOR@", nullable = "true")
	private String memo;
	@DrptField(fieldnm = "dataTyp", fielddrpt = "类型：1 条件   2样式", nullable = "true")
	private String dataTyp;
	@DrptField(fieldnm = "propcondtyp", fielddrpt = "条件类型 0、报表副标题 	1、分组条件 	2、排序条件 ", nullable = "true")
	private String propcondtyp;
	
	@DrptField(fieldnm = "defVlu", fielddrpt = "默认值", nullable = "true")
	private Object defVlu;
	@DrptField(fieldnm = "datapickView", fielddrpt = "取值显示方式", nullable = "true")
	private Integer datapickView;
	@DrptField(fieldnm = "datapickQuery", fielddrpt = "取值窗口查询", nullable = "true")
	private String datapickQuery;
	@DrptField(fieldnm = "datapickQuerycond", fielddrpt = "取值窗口查询参数", nullable = "true")
	private String datapickQuerycond;
	

	
	public Integer getDatapickView() {
		return datapickView;
	}

	public void setDatapickView(Integer datapickView) {
		this.datapickView = datapickView;
	}

	public String getDatapickQuery() {
		return datapickQuery;
	}

	public void setDatapickQuery(String datapickQuery) {
		this.datapickQuery = datapickQuery;
	}

	public String getDatapickQuerycond() {
		return datapickQuerycond;
	}

	public void setDatapickQuerycond(String datapickQuerycond) {
		this.datapickQuerycond = datapickQuerycond;
	}

	public Object getDefVlu() {
		return defVlu;
	}

	public void setDefVlu(Object defVlu) {
		this.defVlu = defVlu;
	}

	public String getPropcondtyp() {
		return propcondtyp;
	}

	public void setPropcondtyp(String propcondtyp) {
		this.propcondtyp = propcondtyp;
	}

	public String getDataTyp() {
		return dataTyp;
	}

	public void setDataTyp(String dataTyp) {
		this.dataTyp = dataTyp;
	}

	public List<String> getChildFieldNm() {
		return childFieldNm;
	}

	public void setChildFieldNm(List<String> childFieldNm) {
		this.childFieldNm = childFieldNm;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChainUid() {
		return chainUid;
	}

	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}

	public String getUnitUidPos() {
		return unitUidPos;
	}

	public void setUnitUidPos(String unitUidPos) {
		this.unitUidPos = unitUidPos;
	}

	public String getParamTyp() {
		return paramTyp;
	}

	public void setParamTyp(String paramTyp) {
		this.paramTyp = paramTyp;
	}

	public String getFieldNm() {
		return fieldNm;
	}

	public void setFieldNm(String fieldNm) {
		this.fieldNm = fieldNm;
	}

	public String getFielddispNm() {
		return fielddispNm;
	}

	public void setFielddispNm(String fielddispNm) {
		this.fielddispNm = fielddispNm;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getFielddataTyp() {
		return fielddataTyp;
	}

	public void setFielddataTyp(String fielddataTyp) {
		this.fielddataTyp = fielddataTyp;
	}

	public Integer getFielddataLen() {
		return fielddataLen;
	}

	public void setFielddataLen(Integer fielddataLen) {
		this.fielddataLen = fielddataLen;
	}

	public Integer getFielddecimalLen() {
		return fielddecimalLen;
	}

	public void setFielddecimalLen(Integer fielddecimalLen) {
		this.fielddecimalLen = fielddecimalLen;
	}

	public String getDatapickTyp() {
		return datapickTyp;
	}

	public void setDatapickTyp(String datapickTyp) {
		this.datapickTyp = datapickTyp;
	}

	public String getDatapickParam() {
		return datapickParam;
	}

	public void setDatapickParam(String datapickParam) {
		this.datapickParam = datapickParam;
	}

	public String getDatapickField() {
		return datapickField;
	}

	public void setDatapickField(String datapickField) {
		this.datapickField = datapickField;
	}

	public String getDataRange() {
		return dataRange;
	}

	public void setDataRange(String dataRange) {
		this.dataRange = dataRange;
	}

	public String getMustFlg() {
		return mustFlg;
	}

	public void setMustFlg(String mustFlg) {
		this.mustFlg = mustFlg;
	}

	public String getMusHidden() {
		return musHidden;
	}

	public void setMusHidden(String musHidden) {
		this.musHidden = musHidden;
	}

	public String getFiledsettingTyp() {
		return filedsettingTyp;
	}

	public void setFiledsettingTyp(String filedsettingTyp) {
		this.filedsettingTyp = filedsettingTyp;
	}

	public String getDisplayFlg() {
		return displayFlg;
	}

	public void setDisplayFlg(String displayFlg) {
		this.displayFlg = displayFlg;
	}

	public String getUpdateFlg() {
		return updateFlg;
	}

	public void setUpdateFlg(String updateFlg) {
		this.updateFlg = updateFlg;
	}

	public String getDtdomaintyp() {
		return dtdomaintyp;
	}

	public void setDtdomaintyp(String dtdomaintyp) {
		this.dtdomaintyp = dtdomaintyp;
	}

	public String getOperatorstyp() {
		return operatorstyp;
	}

	public void setOperatorstyp(String operatorstyp) {
		this.operatorstyp = operatorstyp;
	}

	public String getCheckSvlu() {
		return checkSvlu;
	}

	public void setCheckSvlu(String checkSvlu) {
		this.checkSvlu = checkSvlu;
	}

	public BigDecimal getCheckNvlu() {
		return checkNvlu;
	}

	public void setCheckNvlu(BigDecimal checkNvlu) {
		this.checkNvlu = checkNvlu;
	}

	public Date getCheckDvlu() {
		return checkDvlu;
	}

	public void setCheckDvlu(Date checkDvlu) {
		this.checkDvlu = checkDvlu;
	}

	public String getSvlu() {
		return svlu;
	}

	public void setSvlu(String svlu) {
		this.svlu = svlu;
	}

	public BigDecimal getNvlu() {
		return nvlu;
	}

	public void setNvlu(BigDecimal nvlu) {
		this.nvlu = nvlu;
	}

	public Date getDvlu() {
		return dvlu;
	}

	public void setDvlu(Date dvlu) {
		this.dvlu = dvlu;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
