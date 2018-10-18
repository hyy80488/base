
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.collections4.MapUtils;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import com.alibaba.fastjson.annotation.JSONField;
import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.annotation.DrptEntity;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.annotation.EnhanceEntity;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;
import com.jw.base.framework.core.util.NumberUtil;
import com.jw.base.framework.core.util.StringUtil;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;



/**
 * ## 类说明：
 * 	商品定义基础字段
 * @author    [sunqihua]   
 * @version   [V1.0, 2017-10-17]
 * @package com.jw.hms.pms.m3280.f010.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-10-17|sunqihua|新增|GrpFinBaseGoods新增
 */
@DrptEntity(ennm = "商品定义基础字段", endrpt = "商品定义基础字段")
public class GrpFinBaseGoodsDto extends ResponseBaseDto implements  java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8376641201416204618L;


	@DrptField(fieldnm = "chainUid", fielddrpt = "chainUid", nullable = "false", length = "40")
	private String chainUid;
	

	@DrptField(fieldnm = "goodsId", fielddrpt = "goodsId", nullable = "true", length = "10")
	private Integer goodsId;
	

	@DrptField(fieldnm = "商品代码", fielddrpt = "商品代码", nullable = "true", length = "20")
	private String goodsCd;
	

	@DrptField(fieldnm = "goodsDrpt", fielddrpt = "goodsDrpt", nullable = "true", length = "200")
	private String goodsDrpt;
	
	@DrptField(fieldnm = "statusFlg", fielddrpt = "状态")

	private String statusFlg;
	
	public String getStatusFlg() {
		return this.statusFlg;
	}
	
	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}
	private BigDecimal costAmt;
	@Transient
	public BigDecimal getCostAmt() {
		return costAmt;
	}

	public void setCostAmt(BigDecimal costAmt) {
		this.costAmt = costAmt;
	}
	@Transient
	public BigDecimal getSuggestPrice() {
		return suggestPrice;
	}

	public void setSuggestPrice(BigDecimal suggestPrice) {
		this.suggestPrice = suggestPrice;
	}
	@Transient
	public BigDecimal getInitQuantity() {
		return initQuantity;
	}

	public void setInitQuantity(BigDecimal initQuantity) {
		this.initQuantity = initQuantity;
	}


	private BigDecimal suggestPrice;
	private BigDecimal initQuantity;
	
	
	
	@DrptField(fieldnm = "seq", fielddrpt = "seq", nullable = "true", length = "10")
	private Integer seq;
	

	@DrptField(fieldnm = "goodsFlg", fielddrpt = "goodsFlg", nullable = "true", length = "3")
	@Size(max=3)
	private String goodsFlg;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "goodsclsId", fielddrpt = "goodsclsId", nullable = "true", length = "10")
	private Integer goodsclsId;
	

	@DrptField(fieldnm = "goodssubclsId", fielddrpt = "goodssubclsId", nullable = "true", length = "16")
	private Integer goodssubclsId;
	

	@DrptField(fieldnm = "goodsunitId", fielddrpt = "goodsunitId", nullable = "true", length = "10")
	private Integer goodsunitId;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "goodsSpec", fielddrpt = "goodsSpec", nullable = "true", length = "200")
	@Size(max=200)
	private String goodsSpec;
	

	@DrptField(fieldnm = "inventoryFlg", fielddrpt = "inventoryFlg", nullable = "true", length = "3")
	@Size(max=3)
	private String inventoryFlg;
	
	
	@DrptField(fieldnm = "memo", fielddrpt = "memo", nullable = "true", length = "1000")
	@Size(max=1000)
	private String memo;
	


	public GrpFinBaseGoodsDto(){
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
	
	public Integer getGoodssubclsId() {
		return this.goodssubclsId;
	}
	public void setGoodssubclsId(Integer value) {
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
	@Column(name = "memo", unique = false, nullable = true, insertable = true, updatable = true, length = 1000)
	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String value) {
		this.memo = value;
	}
	/**GrpFinBaseGoods对应的子DTO**/
	private GrpFinBaseGoodsSubDto grpFinBaseGoodsSubDto;
	/**
	 * 
	 * ## 方法说明：
	 * 	GrpFinBaseGoods对应的子DTO
	 * @return
	 */
	@Transient
	public GrpFinBaseGoodsSubDto getGrpFinBaseGoodsSubDto() {
		return grpFinBaseGoodsSubDto;
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	GrpFinBaseGoods对应的子DTO
	 * @param
	 */
	public void setGrpFinBaseGoodsSubDto(GrpFinBaseGoodsSubDto grpFinBaseGoodsSubDto) {
		this.grpFinBaseGoodsSubDto = grpFinBaseGoodsSubDto;
	}
	

	
	/**
	 * ## 方法说明：
	 * 	复制字段值
	 * @param submitData 传入数据
	 * @param isNullCopy 是否复制空值   true：复制   false：不复制
	 */
	@Transient
	public void copyEntity(GrpFinBaseGoodsDto submitData, Boolean isNullCopy) {
		if (submitData != null) {
//			String chainUid = submitData.getChainUid() != null ? submitData.getChainUid().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(chainUid)) {
//				setChainUid(submitData.getChainUid());
//			}
//			String goodsId = submitData.getGoodsId() != null ? submitData.getGoodsId().toString() : null;
//			if (isNullCopy || StringUtil.isNotEmpty(goodsId)) {
//				setGoodsId(submitData.getGoodsId());
//			}
			String goodsCd = submitData.getGoodsCd() != null ? submitData.getGoodsCd().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(goodsCd)) {
				setGoodsCd(submitData.getGoodsCd());
			}
			String goodsDrpt = submitData.getGoodsDrpt() != null ? submitData.getGoodsDrpt().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(goodsDrpt)) {
				setGoodsDrpt(submitData.getGoodsDrpt());
			}
			String seq = submitData.getSeq() != null ? submitData.getSeq().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(seq)) {
				setSeq(submitData.getSeq());
			}
			String goodsFlg = submitData.getGoodsFlg() != null ? submitData.getGoodsFlg().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(goodsFlg)) {
				setGoodsFlg(submitData.getGoodsFlg());
			}
			String goodsclsId = submitData.getGoodsclsId() != null ? submitData.getGoodsclsId().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(goodsclsId)) {
				setGoodsclsId(submitData.getGoodsclsId());
			}
			String goodssubclsId = submitData.getGoodssubclsId() != null ? submitData.getGoodssubclsId().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(goodssubclsId)) {
				setGoodssubclsId(submitData.getGoodssubclsId());
			}
			String goodsunitId = submitData.getGoodsunitId() != null ? submitData.getGoodsunitId().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(goodsunitId)) {
				setGoodsunitId(submitData.getGoodsunitId());
			}
			String goodsSpec = submitData.getGoodsSpec() != null ? submitData.getGoodsSpec().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(goodsSpec)) {
				setGoodsSpec(submitData.getGoodsSpec());
			}
			String inventoryFlg = submitData.getInventoryFlg() != null ? submitData.getInventoryFlg().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(inventoryFlg)) {
				setInventoryFlg(submitData.getInventoryFlg());
			}
			String memo = submitData.getMemo() != null ? submitData.getMemo().toString() : null;
			if (isNullCopy || StringUtil.isNotEmpty(memo)) {
				setMemo(submitData.getMemo());
			}
			
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	将数据拼接成select 
	 * @param index 索引
	 * @param map 参数值
	 */
	@Transient
	public String selectSql(Integer index,Map<String, Map<Object, Type>> map){
		StringBuilder insertSql = new StringBuilder("insert into grp_fin_base_goods (id,chain_uid,goods_id,goods_cd,goods_drpt,seq,goods_flg,goodscls_id,goodssubcls_id,goodsunit_id,goods_spec,inventory_flg,memo,created_by_uid,created_date,created_by,created_by_cd,created_unit_cd,created_unit_uid,modified_by_uid,modified_date,modified_by,modified_by_cd,modified_unit_cd,modified_unit_uid,trace_uid,version)");
		StringBuilder sql=new StringBuilder(" SELECT ");
		sql.append(String.format(":chain_uid_%s,",index));
		map.put("chain_uid_"+index, new HashMap<>());
		map.get("chain_uid_"+index).put(getChainUid(), StandardBasicTypes.STRING);
		sql.append(String.format(":goods_id_%s,",index));
		map.put("goods_id_"+index, new HashMap<>());
		map.get("goods_id_"+index).put(getGoodsId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":goods_cd_%s,",index));
		map.put("goods_cd_"+index, new HashMap<>());
		map.get("goods_cd_"+index).put(getGoodsCd(), StandardBasicTypes.STRING);
		sql.append(String.format(":goods_drpt_%s,",index));
		map.put("goods_drpt_"+index, new HashMap<>());
		map.get("goods_drpt_"+index).put(getGoodsDrpt(), StandardBasicTypes.STRING);
		sql.append(String.format(":seq_%s,",index));
		map.put("seq_"+index, new HashMap<>());
		map.get("seq_"+index).put(getSeq(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":goods_flg_%s,",index));
		map.put("goods_flg_"+index, new HashMap<>());
		map.get("goods_flg_"+index).put(getGoodsFlg(), StandardBasicTypes.STRING);
		sql.append(String.format(":goodscls_id_%s,",index));
		map.put("goodscls_id_"+index, new HashMap<>());
		map.get("goodscls_id_"+index).put(getGoodsclsId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":goodssubcls_id_%s,",index));
		map.put("goodssubcls_id_"+index, new HashMap<>());
		map.get("goodssubcls_id_"+index).put(getGoodssubclsId(), StandardBasicTypes.BIG_DECIMAL);
		sql.append(String.format(":goodsunit_id_%s,",index));
		map.put("goodsunit_id_"+index, new HashMap<>());
		map.get("goodsunit_id_"+index).put(getGoodsunitId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":goods_spec_%s,",index));
		map.put("goods_spec_"+index, new HashMap<>());
		map.get("goods_spec_"+index).put(getGoodsSpec(), StandardBasicTypes.STRING);
		sql.append(String.format(":inventory_flg_%s,",index));
		map.put("inventory_flg_"+index, new HashMap<>());
		map.get("inventory_flg_"+index).put(getInventoryFlg(), StandardBasicTypes.STRING);
		sql.append(String.format(":memo_%s,",index));
		map.put("memo_"+index, new HashMap<>());
		map.get("memo_"+index).put(getMemo(), StandardBasicTypes.STRING);
		
		
		return sql.toString();
	}
	
	/**
	 * ## 方法说明：
	 * 	字典字段获取
	 * @param submitData 传入数据
	 * @param isNullCopy 是否复制空值   true：复制   false：不复制
	 */
	@Transient
	@JSONField(serialize = false)
	public Map<String, List<Integer>> getDictionary() {
		Map<String, List<Integer>> map=new HashMap<>();
		String GoodsId = goodsId != null ? goodsId.toString() : null;
		if (StringUtil.isNotEmpty(GoodsId)) {
			String key="goods_id".substring(0,"goods_id".indexOf("_id")).toUpperCase();
			if(!map.containsKey(key))
				map.put(key, new ArrayList<Integer>());
			map.get(key).add(goodsId);
		}
		String GoodsclsId = goodsclsId != null ? goodsclsId.toString() : null;
		if (StringUtil.isNotEmpty(GoodsclsId)) {
			String key="goodscls_id".substring(0,"goodscls_id".indexOf("_id")).toUpperCase();
			if(!map.containsKey(key))
				map.put(key, new ArrayList<Integer>());
			map.get(key).add(goodsclsId);
		}
//		String GoodssubclsId = goodssubclsId != null ? goodssubclsId.toString() : null;
//		if (StringUtil.isNotEmpty(GoodssubclsId)) {
//			String key="goodssubcls_id".substring(0,"goodssubcls_id".indexOf("_id")).toUpperCase();
//			if(!map.containsKey(key))
//				map.put(key, new ArrayList<Integer>());
//			map.get(key).add(goodssubclsId);
//		}
		String GoodsunitId = goodsunitId != null ? goodsunitId.toString() : null;
		if (StringUtil.isNotEmpty(GoodsunitId)) {
			String key="goodsunit_id".substring(0,"goodsunit_id".indexOf("_id")).toUpperCase();
			if(!map.containsKey(key))
				map.put(key, new ArrayList<Integer>());
			map.get(key).add(goodsunitId);
		}
		return map;
	}
	
	@Transient
	public void conventMapToEntity(Map<String, Object> map) throws Exception {
		if(MapUtils.isNotEmpty(map)){
				
				setChainUid(Objects.toString(map.get("chain_uid"), null));
				setGoodsId(NumberUtil.toInt(map.get("goods_id"), null));
				setGoodsCd(Objects.toString(map.get("goods_cd"), null));
				setGoodsDrpt(Objects.toString(map.get("goods_drpt"), null));
				setSeq(NumberUtil.toInt(map.get("seq"), null));
				setGoodsFlg(Objects.toString(map.get("goods_flg"), null));
				setGoodsclsId(NumberUtil.toInt(map.get("goodscls_id"), null));
				setGoodssubclsId(NumberUtil.toInt(map.get("goodssubcls_id"), null));
				setGoodsunitId(NumberUtil.toInt(map.get("goodsunit_id"), null));
				setGoodsSpec(Objects.toString(map.get("goods_spec"), null));
				setInventoryFlg(Objects.toString(map.get("inventory_flg"), null));
				setMemo(Objects.toString(map.get("memo"), null));
			
		}
	}

	


}

