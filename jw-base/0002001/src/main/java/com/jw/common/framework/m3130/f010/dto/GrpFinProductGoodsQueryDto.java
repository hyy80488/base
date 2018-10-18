
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	产品所含商品QUERY信息数据传输对象
 * @author    [sunqihua]   
 * @version   [V1.0, 2017-10-17]
 * @package com.jw.hms.pms.m3280.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-10-17|sunqihua|新增|GrpFinProductGoodsQueryDto新增
 */
@DrptDto(dtonm = "产品所含商品QUERY信息数据传输对象",dtodrpt="产品所含商品QUERY信息数据传输对象")
public class GrpFinProductGoodsQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2264032652295719206L;
	@DrptField(fieldnm="排序 ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="当前页",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="每页记录数量 ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="id", fielddrpt="id", nullable = "false", length = "10")
	private Integer id;
	
	@DrptField(fieldnm="chainUid", fielddrpt="chainUid", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm="unitUid", fielddrpt="unitUid", nullable = "false", length = "40")
	private String unitUid;
	
	@DrptField(fieldnm="productId", fielddrpt="productId", nullable = "false", length = "10")
	private Integer productId;
	
	@DrptField(fieldnm="goodsId", fielddrpt="goodsId", nullable = "true", length = "10")
	private Integer goodsId;
	
	@DrptField(fieldnm="salePrice", fielddrpt="salePrice", nullable = "true", length = "16")
	private BigDecimal salePrice;
	
	@DrptField(fieldnm="stdQuant", fielddrpt="stdQuant", nullable = "true", length = "12")
	private BigDecimal stdQuant;
	
	@DrptField(fieldnm="memo", fielddrpt="memo", nullable = "true", length = "1000")
	private String memo;
	
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
	public Integer getGoodsId() {
		return this.goodsId;
	}
	
	public void setGoodsId(Integer value) {
		this.goodsId = value;
	}
	public BigDecimal getSalePrice() {
		return this.salePrice;
	}
	
	public void setSalePrice(BigDecimal value) {
		this.salePrice = value;
	}
	public BigDecimal getStdQuant() {
		return this.stdQuant;
	}
	
	public void setStdQuant(BigDecimal value) {
		this.stdQuant = value;
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
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

