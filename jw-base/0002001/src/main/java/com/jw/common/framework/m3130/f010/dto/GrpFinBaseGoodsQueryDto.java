
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
 * 	商品定义QUERY信息数据传输对象
 * @author    [sunqihua]   
 * @version   [V1.0, 2017-10-17]
 * @package com.jw.hms.pms.m3280.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-10-17|sunqihua|新增|GrpFinBaseGoodsQueryDto新增
 */
@DrptDto(dtonm = "商品定义QUERY信息数据传输对象", dtodrpt = "商品定义QUERY信息数据传输对象")
public class GrpFinBaseGoodsQueryDto extends RequestBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/
	private static final long serialVersionUID = 8423259020693584913L;
	@DrptField(fieldnm = "排序 ", fielddrpt = "排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm = "当前页", fielddrpt = "当前页")
	private Integer currentPage;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	@DrptField(fieldnm = "每页记录数量 ", fielddrpt = "每页记录数量")
	private Integer pageSize;
	@DrptField(fieldnm = "ids", fielddrpt = "多个id")
	private List<Integer> ids;
	@DrptField(fieldnm = "goodsIds", fielddrpt = "goodsId", nullable = "true", length = "10")
	private List<Integer> goodsIds;

	@DrptField(fieldnm = "id", fielddrpt = "id", nullable = "false", length = "10")
	private Integer id;

	@DrptField(fieldnm = "chainUid", fielddrpt = "chainUid", nullable = "false", length = "40")
	private String chainUid;

	@DrptField(fieldnm = "goodsId", fielddrpt = "goodsId", nullable = "true", length = "10")
	private Integer goodsId;

	@DrptField(fieldnm = "goodsCd", fielddrpt = "goodsCd", nullable = "true", length = "20")
	private String goodsCd;

	@DrptField(fieldnm = "goodsDrpt", fielddrpt = "goodsDrpt", nullable = "true", length = "200")
	private String goodsDrpt;

	@DrptField(fieldnm = "seq", fielddrpt = "seq", nullable = "true", length = "10")
	private Integer seq;

	@DrptField(fieldnm = "goodsFlg", fielddrpt = "goodsFlg", nullable = "true", length = "3")
	private String goodsFlg;

	@DrptField(fieldnm = "goodsclsId", fielddrpt = "goodsclsId", nullable = "true", length = "10")
	private Integer goodsclsId;

	@DrptField(fieldnm = "goodssubclsId", fielddrpt = "goodssubclsId", nullable = "true", length = "16")
	private BigDecimal goodssubclsId;

	@DrptField(fieldnm = "goodsunitId", fielddrpt = "goodsunitId", nullable = "true", length = "10")
	private Integer goodsunitId;

	@DrptField(fieldnm = "goodsSpec", fielddrpt = "goodsSpec", nullable = "true", length = "200")
	private String goodsSpec;

	@DrptField(fieldnm = "inventoryFlg", fielddrpt = "inventoryFlg", nullable = "true", length = "3")
	private String inventoryFlg;
	@DrptField(fieldnm = "fastQuery", fielddrpt = "快速查询 ", nullable = "true", length = "500")
	private String fastQuery;

	@DrptField(fieldnm = "unitUid", fielddrpt = "unitUid", nullable = "false", length = "40")
	private String unitUid;

	@DrptField(fieldnm = "statusFlg", fielddrpt = "有效标识 0：无效；1：有效（默认）", nullable = "false", length = "1")
	private String statusFlg;

	public List<Integer> getGoodsIds() {
		return goodsIds;
	}

	public void setGoodsIds(List<Integer> goodsIds) {
		this.goodsIds = goodsIds;
	}

	public String getFastQuery() {
		return fastQuery;
	}

	public void setFastQuery(String fastSearch) {
		this.fastQuery = fastSearch;
	}

	@DrptField(fieldnm = "memo", fielddrpt = "memo", nullable = "true", length = "1000")
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

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer value) {
		this.goodsId = value;
	}

	public String getGoodsCd() {
		return this.goodsCd;
	}

	public void setGoodsCd(String value) {
		this.goodsCd = value;
	}

	public String getGoodsDrpt() {
		return this.goodsDrpt;
	}

	public void setGoodsDrpt(String value) {
		this.goodsDrpt = value;
	}

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer value) {
		this.seq = value;
	}

	public String getGoodsFlg() {
		return this.goodsFlg;
	}

	public void setGoodsFlg(String value) {
		this.goodsFlg = value;
	}

	public Integer getGoodsclsId() {
		return this.goodsclsId;
	}

	public void setGoodsclsId(Integer value) {
		this.goodsclsId = value;
	}

	public BigDecimal getGoodssubclsId() {
		return this.goodssubclsId;
	}

	public void setGoodssubclsId(BigDecimal value) {
		this.goodssubclsId = value;
	}

	public Integer getGoodsunitId() {
		return this.goodsunitId;
	}

	public void setGoodsunitId(Integer value) {
		this.goodsunitId = value;
	}

	public String getGoodsSpec() {
		return this.goodsSpec;
	}

	public void setGoodsSpec(String value) {
		this.goodsSpec = value;
	}

	public String getInventoryFlg() {
		return this.inventoryFlg;
	}

	public void setInventoryFlg(String value) {
		this.inventoryFlg = value;
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

	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
