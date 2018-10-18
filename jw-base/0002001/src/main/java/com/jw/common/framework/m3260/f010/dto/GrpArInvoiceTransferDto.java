
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	应收票据转单信息数据传输对象
 * @author    [lilin]   
 * @version   [V1.0, 2018-08-24]
 * @package com.jw.hms.group.m3260.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018-08-24|lilin|新增|GrpArInvoiceTransferDto新增
 */
@DrptDto(dtonm = "应收票据转单信息数据传输对象",dtodrpt="应收票据转单信息数据传输对象")
public class GrpArInvoiceTransferDto extends RequestBaseDto implements java.io.Serializable{
	
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5973473171814688366L;
	
	@DrptField(fieldnm="invcNo", fielddrpt="应收票据编码 发番", nullable = "false", length = "20")
	private String invcNo;
	@DrptField(fieldnm="arNos", fielddrpt="应收账户编码 ", nullable = "true", length = "20")
	private List<String> arNos;
	@DrptField(fieldnm="invcNos", fielddrpt="票据号编码 ", nullable = "true", length = "20")
	private List<String> invcNos;
	@DrptField(fieldnm="toArNo", fielddrpt="目的应收账号 ", nullable = "false", length = "20")
	private String toArNo;
	@DrptField(fieldnm="fromArNo", fielddrpt="原应收账户编号 ", nullable = "false", length = "20")
	private String fromArNo;
	@DrptField(fieldnm="version", fielddrpt="原应收账号的版本 ", nullable = "true", length = "3")
	private Integer version;
	
	public String getInvcNo() {
		return invcNo;
	}

	public void setInvcNo(String invcNo) {
		this.invcNo = invcNo;
	}

	public List<String> getArNos() {
		return arNos;
	}

	public void setArNos(List<String> arNos) {
		this.arNos = arNos;
	}

	public List<String> getInvcNos() {
		return invcNos;
	}

	public void setInvcNos(List<String> invcNos) {
		this.invcNos = invcNos;
	}

	public String getToArNo() {
		return toArNo;
	}

	public void setToArNo(String toArNo) {
		this.toArNo = toArNo;
	}

	public String getFromArNo() {
		return fromArNo;
	}

	public void setFromArNo(String fromArNo) {
		this.fromArNo = fromArNo;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

