
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	消费品配置表QUERY信息数据传输对象
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-05-09]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-05-09|zhangteng|新增|GrpFinProductQueryDto新增
 */
@DrptDto(dtonm = "消费品配置表QUERY信息数据传输对象",dtodrpt="消费品配置表QUERY信息数据传输对象")
public class GrpFinProductQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2135760319065637744L;
	@DrptField(fieldnm="排序 ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="当前页",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="每页记录数量 ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="id", fielddrpt="ID ID字段", nullable = "false", length = "10")
	private Integer id;
	
	@DrptField(fieldnm="chainUid", fielddrpt="集团代码 ", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm="unitUid", fielddrpt="单位代码 ", nullable = "false", length = "40")
	private String unitUid;
	
	@DrptField(fieldnm="productId", fielddrpt="消费品ID ", nullable = "false", length = "10")
	private Integer productId;
	@DrptField(fieldnm="productIds", fielddrpt="消费品IDs,查询 多条 ", nullable = "true", length = "10")
	private List<Integer> productIds;
	
	@DrptField(fieldnm="statusFlg", fielddrpt="有效标识 0：无效；1：有效（默认）", nullable = "false", length = "1")
	private String statusFlg;
	
	@DrptField(fieldnm="productCd", fielddrpt="消费品编码 ", nullable = "false", length = "20")
	private String productCd;
	
	@DrptField(fieldnm="productNm", fielddrpt="消费品名称 ", nullable = "true", length = "200")
	private String productNm;
	
	@DrptField(fieldnm="seq", fielddrpt="显示顺序 ", nullable = "true", length = "10")
	private Integer seq;
	
	@DrptField(fieldnm="productFlg", fielddrpt="房含属性 0：普通，1：早餐，2：晚餐", nullable = "true", length = "3")
	private String productFlg;
	
	@DrptField(fieldnm="auditTyp", fielddrpt="记账方式 0：当日消费，1：次日消费", nullable = "true", length = "3")
	private String auditTyp;
	
	@DrptField(fieldnm="audittrncdId", fielddrpt="过费科目代码 抛账方式=0时，只能选择营收科目，=1时只能选择非营收科目", nullable = "true", length = "10")
	private Integer audittrncdId;
	
	@DrptField(fieldnm="permitpostFlg", fielddrpt="是否允许抛账 0：不允许，1：允许", nullable = "true", length = "3")
	private String permitpostFlg;
	
	@DrptField(fieldnm="postTyp", fielddrpt="消费方式 1：按金额消费，2：按次消费", nullable = "true", length = "3")
	private String postTyp;
	
	@DrptField(fieldnm="poststartDt", fielddrpt="允许抛账起始时间 ", nullable = "true", length = "13")
	private java.util.Date poststartDt;
	
	@DrptField(fieldnm="postendDt", fielddrpt="允许抛账结束时间 ", nullable = "true", length = "13")
	private java.util.Date postendDt;
	
	@DrptField(fieldnm="inventoryFlg", fielddrpt="库存控制 0：无库存管理，1：库存管理", nullable = "true", length = "3")
	private String inventoryFlg;
	
	@DrptField(fieldnm="arrangementId", fielddrpt="客房安排ID ", nullable = "true", length = "10")
	private Integer arrangementId;
	
	@DrptField(fieldnm="note", fielddrpt="注释 ", nullable = "true", length = "500")
	private String note;
	
	@DrptField(fieldnm="memo", fielddrpt="备注 ", nullable = "true", length = "500")
	private String memo;
	
	public List<Integer> getProductIds() {
		return productIds;
	}

	public void setProductIds(List<Integer> productIds) {
		this.productIds = productIds;
	}

	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer value) {
		this.id = value;
	}
	public String getChainUid() {
		return this.chainUid;
	}
	
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}
	
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public Integer getProductId() {
		return this.productId;
	}
	
	public void setProductId(Integer value) {
		this.productId = value;
	}
	public String getStatusFlg() {
		return this.statusFlg;
	}
	
	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}
	public String getProductCd() {
		return this.productCd;
	}
	
	public void setProductCd(String value) {
		this.productCd = value;
	}
	public String getProductNm() {
		return this.productNm;
	}
	
	public void setProductNm(String value) {
		this.productNm = value;
	}
	public Integer getSeq() {
		return this.seq;
	}
	
	public void setSeq(Integer value) {
		this.seq = value;
	}
	public String getProductFlg() {
		return this.productFlg;
	}
	
	public void setProductFlg(String value) {
		this.productFlg = value;
	}
	public String getAuditTyp() {
		return this.auditTyp;
	}
	
	public void setAuditTyp(String value) {
		this.auditTyp = value;
	}
	public Integer getAudittrncdId() {
		return this.audittrncdId;
	}
	
	public void setAudittrncdId(Integer value) {
		this.audittrncdId = value;
	}
	public String getPermitpostFlg() {
		return this.permitpostFlg;
	}
	
	public void setPermitpostFlg(String value) {
		this.permitpostFlg = value;
	}
	public String getPostTyp() {
		return this.postTyp;
	}
	
	public void setPostTyp(String value) {
		this.postTyp = value;
	}
	public java.util.Date getPoststartDt() {
		return this.poststartDt;
	}
	
	public void setPoststartDt(java.util.Date value) {
		this.poststartDt = value;
	}
	public java.util.Date getPostendDt() {
		return this.postendDt;
	}
	
	public void setPostendDt(java.util.Date value) {
		this.postendDt = value;
	}
	public String getInventoryFlg() {
		return this.inventoryFlg;
	}
	
	public void setInventoryFlg(String value) {
		this.inventoryFlg = value;
	}
	public Integer getArrangementId() {
		return this.arrangementId;
	}
	
	public void setArrangementId(Integer value) {
		this.arrangementId = value;
	}
	public String getNote() {
		return this.note;
	}
	
	public void setNote(String value) {
		this.note = value;
	}
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String value) {
		this.memo = value;
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
	@JsonIgnore(true)
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

