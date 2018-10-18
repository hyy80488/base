
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/** 
 * ## 类说明：
 * 	接口服务版本表查询列表信息数据传输对象
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-09-29]
 * @package com.jw.hms.cmm.m3130.f011.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-09-29|zhangteng|新增|PlfPdtIfsvcVerResultDto新增
 */
@DrptDto(dtonm = "接口服务版本表查询列表信息数据传输对象",dtodrpt="接口服务版本表查询列表信息数据传输对象")
public class PlfPdtIfsvcVerSimpleResultDto extends ResponseBaseDto implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1121570797965545501L;

	@DrptField(fieldnm="id", fielddrpt="id", nullable = "false", length = "10")
	private Integer id;
	
	@DrptField(fieldnm="ifsvcverId", fielddrpt="ifsvcverId", nullable = "true", length = "10")
	private Integer ifsvcverId;
	
	@DrptField(fieldnm="ifsvcId", fielddrpt="ifsvcId", nullable = "false", length = "10")
	private Integer ifsvcId;
	
	@DrptField(fieldnm="statusFlg", fielddrpt="statusFlg", nullable = "false", length = "3")
	private String statusFlg;
	
	@DrptField(fieldnm="interfaceVer", fielddrpt="interfaceVer", nullable = "false", length = "40")
	private String interfaceVer;
	
	@DrptField(fieldnm="devVer", fielddrpt="devVer", nullable = "true", length = "10")
	private Integer devVer;
	
	@DrptField(fieldnm="version", fielddrpt="version", nullable = "true", length = "10")
	private Integer version;
	
	@DrptField(fieldnm="ifexeTyp", fielddrpt="ifexeTyp", nullable = "true", length = "3")
	private String ifexeTyp;
	
	@DrptField(fieldnm="iftypeId", fielddrpt="iftypeId", nullable = "false", length = "10")
	private Integer iftypeId;
	
	@DrptField(fieldnm="ifsubtypeId", fielddrpt="ifsubtypeId", nullable = "true", length = "10")
	private Integer ifsubtypeId;
	
	@DrptField(fieldnm="ifbrandId", fielddrpt="ifbrandId", nullable = "false", length = "10")
	private Integer ifbrandId;
	
	@DrptField(fieldnm="ifmanufacturerId", fielddrpt="ifmanufacturerId", nullable = "true", length = "10")
	private Integer ifmanufacturerId;
	
	@DrptField(fieldnm="interfaceModel", fielddrpt="interfaceModel", nullable = "false", length = "200")
	private String interfaceModel;
	
	@DrptField(fieldnm="guidCd",fielddrpt="插件的guid")
	private String guidCd;
	
	@DrptField(fieldnm="link",fielddrpt="下载地址")
	private String link;
	
	@DrptField(fieldnm="memo", fielddrpt="memo", nullable = "true", length = "4000")
	private String memo;
	@DrptField(fieldnm="brandDrpt", fielddrpt="品牌", nullable = "true", length = "200")
	private String brandDrpt;
	@DrptField(fieldnm="facturerDrpt", fielddrpt="厂商", nullable = "true", length = "200")
	private String facturerDrpt;
	@DrptField(fieldnm="ifParam", fielddrpt="参数", nullable = "true", length = "4000")
	private String ifParam;
	
	
	
	public String getIfParam() {
		return ifParam;
	}
	public void setIfParam(String ifParam) {
		this.ifParam = ifParam;
	}
	public String getBrandDrpt() {
		return brandDrpt;
	}
	public void setBrandDrpt(String brandDrpt) {
		this.brandDrpt = brandDrpt;
	}
	public String getFacturerDrpt() {
		return facturerDrpt;
	}
	public void setFacturerDrpt(String facturerDrpt) {
		this.facturerDrpt = facturerDrpt;
	}
	public String getGuidCd() {
		return guidCd;
	}
	public void setGuidCd(String guidCd) {
		this.guidCd = guidCd;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getId() {
		return this.id;
	}	
	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getIfsvcverId() {
		return this.ifsvcverId;
	}	
	public void setIfsvcverId(Integer value) {
		this.ifsvcverId = value;
	}
	public Integer getIfsvcId() {
		return this.ifsvcId;
	}	
	public void setIfsvcId(Integer value) {
		this.ifsvcId = value;
	}
	public String getStatusFlg() {
		return this.statusFlg;
	}	
	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}
	public String getInterfaceVer() {
		return this.interfaceVer;
	}	
	public void setInterfaceVer(String value) {
		this.interfaceVer = value;
	}
	public Integer getDevVer() {
		return this.devVer;
	}	
	public void setDevVer(Integer value) {
		this.devVer = value;
	}
	public Integer getVersion() {
		return this.version;
	}	
	public void setVersion(Integer value) {
		this.version = value;
	}
	
	
	public String getIfexeTyp() {
		return ifexeTyp;
	}
	public void setIfexeTyp(String ifexeTyp) {
		this.ifexeTyp = ifexeTyp;
	}
	public Integer getIftypeId() {
		return iftypeId;
	}
	public void setIftypeId(Integer iftypeId) {
		this.iftypeId = iftypeId;
	}
	public Integer getIfsubtypeId() {
		return ifsubtypeId;
	}
	public void setIfsubtypeId(Integer ifsubtypeId) {
		this.ifsubtypeId = ifsubtypeId;
	}
	public Integer getIfbrandId() {
		return ifbrandId;
	}
	public void setIfbrandId(Integer ifbrandId) {
		this.ifbrandId = ifbrandId;
	}
	public Integer getIfmanufacturerId() {
		return ifmanufacturerId;
	}
	public void setIfmanufacturerId(Integer ifmanufacturerId) {
		this.ifmanufacturerId = ifmanufacturerId;
	}
	public String getInterfaceModel() {
		return interfaceModel;
	}
	public void setInterfaceModel(String interfaceModel) {
		this.interfaceModel = interfaceModel;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

