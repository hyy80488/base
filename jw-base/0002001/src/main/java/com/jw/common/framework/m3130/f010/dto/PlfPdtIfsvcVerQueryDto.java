
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	接口服务版本表QUERY信息数据传输对象
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-09-29]
 * @package com.jw.hms.cmm.m3130.f011.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-09-29|zhangteng|新增|PlfPdtIfsvcVerQueryDto新增
 */
@DrptDto(dtonm = "接口服务版本表QUERY信息数据传输对象",dtodrpt="接口服务版本表QUERY信息数据传输对象")
public class PlfPdtIfsvcVerQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2531717838268750500L;
	@DrptField(fieldnm="排序 ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="当前页",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="每页记录数量 ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="id", fielddrpt="id", nullable = "false", length = "10")
	private Integer id;
	
	@DrptField(fieldnm="ifsvcverId", fielddrpt="ifsvcverId", nullable = "true", length = "10")
	private Integer ifsvcverId;
	
	@DrptField(fieldnm="iftypeId", fielddrpt="设备类型", nullable = "true", length = "10")
	private Integer iftypeId;
	
	@DrptField(fieldnm="ifsvcverIds", fielddrpt="ifsvcverId", nullable = "true", length = "10")
	private List<Integer> ifsvcverIds;
	
	@DrptField(fieldnm="ifsvcId", fielddrpt="ifsvcId", nullable = "false", length = "10")
	private Integer ifsvcId;
	
	@DrptField(fieldnm="statusFlg", fielddrpt="statusFlg", nullable = "false", length = "3")
	private String statusFlg;
	
	@DrptField(fieldnm="interfaceVer", fielddrpt="interfaceVer", nullable = "false", length = "40")
	private String interfaceVer;
	
	@DrptField(fieldnm="link", fielddrpt="link", nullable = "true", length = "500")
	private String link;
	
	@DrptField(fieldnm="default1Tmpl", fielddrpt="default1Tmpl", nullable = "true", length = "4000")
	private String default1Tmpl;
	
	@DrptField(fieldnm="default1Path", fielddrpt="default1Path", nullable = "true", length = "500")
	private String default1Path;
	
	@DrptField(fieldnm="default2Tmpl", fielddrpt="default2Tmpl", nullable = "true", length = "4000")
	private String default2Tmpl;
	
	@DrptField(fieldnm="default2Path", fielddrpt="default2Path", nullable = "true", length = "500")
	private String default2Path;
	
	@DrptField(fieldnm="default3Tmpl", fielddrpt="default3Tmpl", nullable = "true", length = "4000")
	private String default3Tmpl;
	
	@DrptField(fieldnm="default3Path", fielddrpt="default3Path", nullable = "true", length = "500")
	private String default3Path;
	
	@DrptField(fieldnm="default4Tmpl", fielddrpt="default4Tmpl", nullable = "true", length = "4000")
	private String default4Tmpl;
	
	@DrptField(fieldnm="default4Path", fielddrpt="default4Path", nullable = "true", length = "500")
	private String default4Path;
	
	@DrptField(fieldnm="default5Tmpl", fielddrpt="default5Tmpl", nullable = "true", length = "4000")
	private String default5Tmpl;
	
	@DrptField(fieldnm="default5Path", fielddrpt="default5Path", nullable = "true", length = "500")
	private String default5Path;
	
	@DrptField(fieldnm="devVer", fielddrpt="devVer", nullable = "true", length = "10")
	private Integer devVer;
	
	
	public Integer getIftypeId() {
		return iftypeId;
	}

	public void setIftypeId(Integer iftypeId) {
		this.iftypeId = iftypeId;
	}

	public List<Integer> getIfsvcverIds() {
		return ifsvcverIds;
	}

	public void setIfsvcverIds(List<Integer> ifsvcverIds) {
		this.ifsvcverIds = ifsvcverIds;
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
	public String getLink() {
		return this.link;
	}
	
	public void setLink(String value) {
		this.link = value;
	}
	public String getDefault1Tmpl() {
		return this.default1Tmpl;
	}
	
	public void setDefault1Tmpl(String value) {
		this.default1Tmpl = value;
	}
	public String getDefault1Path() {
		return this.default1Path;
	}
	
	public void setDefault1Path(String value) {
		this.default1Path = value;
	}
	public String getDefault2Tmpl() {
		return this.default2Tmpl;
	}
	
	public void setDefault2Tmpl(String value) {
		this.default2Tmpl = value;
	}
	public String getDefault2Path() {
		return this.default2Path;
	}
	
	public void setDefault2Path(String value) {
		this.default2Path = value;
	}
	public String getDefault3Tmpl() {
		return this.default3Tmpl;
	}
	
	public void setDefault3Tmpl(String value) {
		this.default3Tmpl = value;
	}
	public String getDefault3Path() {
		return this.default3Path;
	}
	
	public void setDefault3Path(String value) {
		this.default3Path = value;
	}
	public String getDefault4Tmpl() {
		return this.default4Tmpl;
	}
	
	public void setDefault4Tmpl(String value) {
		this.default4Tmpl = value;
	}
	public String getDefault4Path() {
		return this.default4Path;
	}
	
	public void setDefault4Path(String value) {
		this.default4Path = value;
	}
	public String getDefault5Tmpl() {
		return this.default5Tmpl;
	}
	
	public void setDefault5Tmpl(String value) {
		this.default5Tmpl = value;
	}
	public String getDefault5Path() {
		return this.default5Path;
	}
	
	public void setDefault5Path(String value) {
		this.default5Path = value;
	}
	public Integer getDevVer() {
		return this.devVer;
	}
	
	public void setDevVer(Integer value) {
		this.devVer = value;
	}
	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}
	
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

