
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;


/** 
 * ## 类说明：
 * 	故障房表查询列表信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-27]
 * @package com.jw.hms.pms.m3250.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-27|jianana|新增|HptHkRoomRepairResultDto新增
 */
@DrptDto(dtonm = "故障房表查询列表信息数据传输对象",dtodrpt="故障房表查询列表信息数据传输对象")
public class GoodsParentTrnDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 2658708421411283881L;
	@DrptField(fieldnm="单位商品定义新值",fielddrpt="单位商品定义新值")
	private List<GoodsTrnDto> goodsTrnDto;
	@DrptField(fieldnm="acctNo",fielddrpt="前台帐号")
	private String acctNo;
	@DrptField(fieldnm = "pageNo", fielddrpt = "账页")
	private String pageNo;
	@DrptField(fieldnm = "trnRef", fielddrpt = "参考号")
	private String trnRef;
	public String getTrnRef() {
		return trnRef;
	}
	public void setTrnRef(String trnRef) {
		this.trnRef = trnRef;
	}
	public String getTrnCmnt() {
		return trnCmnt;
	}
	public void setTrnCmnt(String trnCmnt) {
		this.trnCmnt = trnCmnt;
	}
	@DrptField(fieldnm = "trnCmnt", fielddrpt = "交易注释")
	private String trnCmnt;
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	//	@DrptField(fieldnm="trncdId",fielddrpt="入账代码")
//	private Integer trncdId;
//	public Integer getTrncdId() {
//		return trncdId;
//	}
//	public void setTrncdId(Integer trncdId) {
//		this.trncdId = trncdId;
//	}
	/** 0 正常；1挂当前账户；2挂目的账户 **/
	@DrptField(fieldnm="postFlg", fielddrpt="超限挂账标识", nullable = "true")
	private String postFlg;
	
	
	public String getPostFlg() {
		return StringUtils.defaultIfEmpty(postFlg, "0");
	}
	public void setPostFlg(String postFlg) {
		this.postFlg = postFlg;
	}
	@DrptField(fieldnm="rsvAccountVersion",fielddrpt="版本号")
	private Integer rsvAccountVersion;
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public Integer getRsvAccountVersion() {
		return rsvAccountVersion;
	}
	public void setRsvAccountVersion(Integer rsvAccountVersion) {
		this.rsvAccountVersion = rsvAccountVersion;
	}
	public List<GoodsTrnDto> getGoodsTrnDto() {
		return goodsTrnDto;
	}
	public void setGoodsTrnDto(List<GoodsTrnDto> goodsTrnDto) {
		this.goodsTrnDto = goodsTrnDto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

