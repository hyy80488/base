
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * 
 * ## 类说明：
 * 	往来挂账日志QUERY信息数据传输对象
 * @author    [liyunlong]   
 * @version   [V1.0, 2018年9月28日]
 * @package com.jw.common.framework.m3260.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月28日|liyunlong|新增|GrpArAccountReportQueryDto.java新增
 */
@DrptDto(dtonm = "往来挂账日志QUERY信息数据传输对象",dtodrpt="往来挂账日志QUERY信息数据传输对象")
public class GrpArAccountLogReportQueryDto extends RequestBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1879700074922109192L;
	/**
	 * 操作员
	 */
	@DrptField(fieldnm="orderColumn ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;

	@DrptField(fieldnm="currentPage",fielddrpt="当前页")
	private  Integer currentPage;
	
	
	@DrptField(fieldnm="pageSize ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	
	
	/**
	 * 开始日期
	 */
	@DrptField(fieldnm="beginTime", fielddrpt="GRP_AR_INVCTRN_JRNL 表的业务日期 business_dt")
	private String beginTime;	
	
	
	/**
	 * 结束日期
	 */
	@DrptField(fieldnm="endTime", fielddrpt="GRP_AR_INVCTRN_JRNL 表的业务日期 business_dt")
	private String endTime;	
	
	/**
	 * 账务类型
	 */
	@DrptField(fieldnm="ledgerFlg", fielddrpt="GRP_AR_INVOICE 表的 分类账属性 ledger_flg ")
	private String ledgerFlg;	
	
	/**
	 * 账户类型
	 */
	@DrptField(fieldnm="artypeIds", fielddrpt="GRP_AR_INVCTRN_JRNL表应收账户类型")
	private List<Integer> artypeIds;
	
	/**
	 * 应收账号
	 */
	@DrptField(fieldnm="arNo", fielddrpt="GRP_AR_INVCTRN_JRNL表应收账户编码")
	private String arNo;
	
	/**
	 * 交易代码
	 */
	@DrptField(fieldnm="trncdIds", fielddrpt="GRP_AR_INVCTRN_JRNL表交易代码")
	private List<Integer> trncdIds;
	
	/**
	 * 前台交易代码
	 */
	@DrptField(fieldnm="frttrncdIds", fielddrpt="GRP_AR_INVCTRN 表的 前台科目ID")
	private List<Integer> frttrncdIds;
	
	/**
	 * 操作员
	 */
	@DrptField(fieldnm="createdBys", fielddrpt="GRP_AR_INVCTRN_JRNL 表的  created_by")
	private List<String> createdBys;
	
	/**
	 * 单据类型
	 */
	@DrptField(fieldnm="invcTyps", fielddrpt="GRP_AR_INVOICE 表的 发票收据标志 invc_typ")
	private List<String> invcTyps;
	
	/**
	 * 挂账方式
	 */
	@DrptField(fieldnm="funcTyps", fielddrpt="GRP_AR_INVCTRN_JRNL 表的 入账方式")
	private List<String> funcTyps;
	
	/**
	 * 日志类型
	 */
	@DrptField(fieldnm="jrnlTyps", fielddrpt="GRP_AR_INVCTRN_JRNL 表的 账务明细类型")
	private List<String> jrnlTyps;

	/**
	 * @return the orderColumn
	 */
	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}

	/**
	 * @param orderColumn the orderColumn to set
	 */
	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}

	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the beginTime
	 */
	public String getBeginTime() {
		return beginTime;
	}

	/**
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the ledgerFlg
	 */
	public String getLedgerFlg() {
		return ledgerFlg;
	}

	/**
	 * @param ledgerFlg the ledgerFlg to set
	 */
	public void setLedgerFlg(String ledgerFlg) {
		this.ledgerFlg = ledgerFlg;
	}

	/**
	 * @return the artypeIds
	 */
	public List<Integer> getArtypeIds() {
		return artypeIds;
	}

	/**
	 * @param artypeIds the artypeIds to set
	 */
	public void setArtypeIds(List<Integer> artypeIds) {
		this.artypeIds = artypeIds;
	}

	/**
	 * @return the arNo
	 */
	public String getArNo() {
		return arNo;
	}

	/**
	 * @param arNo the arNo to set
	 */
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	/**
	 * @return the trncdIds
	 */
	public List<Integer> getTrncdIds() {
		return trncdIds;
	}

	/**
	 * @param trncdIds the trncdIds to set
	 */
	public void setTrncdIds(List<Integer> trncdIds) {
		this.trncdIds = trncdIds;
	}

	/**
	 * @return the frttrncdIds
	 */
	public List<Integer> getFrttrncdIds() {
		return frttrncdIds;
	}

	/**
	 * @param frttrncdIds the frttrncdIds to set
	 */
	public void setFrttrncdIds(List<Integer> frttrncdIds) {
		this.frttrncdIds = frttrncdIds;
	}

	/**
	 * @return the createdBys
	 */
	public List<String> getCreatedBys() {
		return createdBys;
	}

	/**
	 * @param createdBys the createdBys to set
	 */
	public void setCreatedBys(List<String> createdBys) {
		this.createdBys = createdBys;
	}

	/**
	 * @return the invcTyps
	 */
	public List<String> getInvcTyps() {
		return invcTyps;
	}

	/**
	 * @param invcTyps the invcTyps to set
	 */
	public void setInvcTyps(List<String> invcTyps) {
		this.invcTyps = invcTyps;
	}

	/**
	 * @return the funcTyps
	 */
	public List<String> getFuncTyps() {
		return funcTyps;
	}

	/**
	 * @param funcTyps the funcTyps to set
	 */
	public void setFuncTyps(List<String> funcTyps) {
		this.funcTyps = funcTyps;
	}

	/**
	 * @return the jrnlTyps
	 */
	public List<String> getJrnlTyps() {
		return jrnlTyps;
	}

	/**
	 * @param jrnlTyps the jrnlTyps to set
	 */
	public void setJrnlTyps(List<String> jrnlTyps) {
		this.jrnlTyps = jrnlTyps;
	}

	
}

