package com.jw.common.framework.m3310.f010.dto;

/**   
* @Title: PosGoodsDto.java 
* @Package com.jw.hms.pos.m3310.f010.dto.posTran.forIPad 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年9月4日 下午1:56:22 
* @version V1.0   
*/

import java.math.BigDecimal;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m3130.f010.dto.PosMakeForIPadInfo;

/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年9月13日]
 * @package com.jw.hms.pos.m3310.f010.dto.posTran.forIPad
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月13日|yingw|新增|PosGoodsDto.java新增
*/
@DrptDto(dtonm = "PosGoodsDto",dtodrpt="PosGoodsDto菜品传输对象")
public class PosGoodsDto implements java.io.Serializable {

    private static final long serialVersionUID = 6176954452292034538L;
    
    @DrptField(fieldnm="goodsId",fielddrpt="菜品id -- itemId")
    private Integer goodsId;
    
    @DrptField(fieldnm="orderGoodsId",fielddrpt="账单中菜品id -- tranId")
    private Integer orderGoodsId;
    
    @DrptField(fieldnm="goodsName",fielddrpt="菜品名称")
    private String goodsName;
    
    @DrptField(fieldnm="goodsCd",fielddrpt="菜品代码")
    private String goodsCd;
    
    @DrptField(fieldnm="goodsPrice",fielddrpt="菜品单价")
    private BigDecimal goodsPrice;
    
    @DrptField(fieldnm="rePrice",fielddrpt="是否开价菜 true-是, false-否")
    private Boolean rePrice;
    
    @DrptField(fieldnm="makeIds",fielddrpt="菜品制法数组")
    private List<Integer> makeIds;
    
    @DrptField(fieldnm="tasteIds",fielddrpt="菜品口味数组(需求)")
    private List<Integer> tasteIds;
    
    @DrptField(fieldnm="remark",fielddrpt="菜品备注")
    private String remark;
    
    @DrptField(fieldnm="priceId",fielddrpt="菜品价格id")
    private Integer priceId;
    
    @DrptField(fieldnm="specId",fielddrpt="菜品规格id")
    private Integer specId;
    
    @DrptField(fieldnm="specName",fielddrpt="菜品规格name")
    private String specName;
    
    @DrptField(fieldnm="quantity",fielddrpt="菜品数量")
    private BigDecimal quantity;
    
    @DrptField(fieldnm="attachAmount",fielddrpt="加收金额")
    private BigDecimal attachAmount;
    
    @DrptField(fieldnm="itemAmount",fielddrpt="项目金额 项目金额为单价*数量")
    private BigDecimal itemAmount;
    
    @DrptField(fieldnm="consumeAmount",fielddrpt="消费金额 = 项目金额+折扣+服务费+制法费用+加收金额")
    private BigDecimal consumeAmount;
    
    @DrptField(fieldnm="serviceAmount",fielddrpt="服务费")
    private BigDecimal serviceAmount;
    
    @DrptField(fieldnm="goodsStatus",fielddrpt="菜品状态 0-作废,1-有效,2-冲消")
    private String goodsStatus;
    
    @DrptField(fieldnm="sendFlg",fielddrpt="送单 状态  0-未送单,1-已送单")
    private String sendFlg;
    
    @DrptField(fieldnm="wakeFlg",fielddrpt="叫起 状态   0-等叫，1-叫起")
    private String wakeFlg;
    
    @DrptField(fieldnm="urgeCnt",fielddrpt="催菜次数")
    private Integer urgeCnt;
    
    @DrptField(fieldnm="makeAmount",fielddrpt="制法金额(加工费)")
    private BigDecimal makeAmount;
    
    @DrptField(fieldnm="taxGoodsAmount1",fielddrpt="税金1")
    private BigDecimal taxGoodsAmount1;
    
    @DrptField(fieldnm="taxGoodsAmount2",fielddrpt="税金2")
    private BigDecimal taxGoodsAmount2;
    
    @DrptField(fieldnm="taxGoodsAmount3",fielddrpt="税金3")
    private BigDecimal taxGoodsAmount3;
    
    @DrptField(fieldnm="taxGoodsAmount4",fielddrpt="税金4")
    private BigDecimal taxGoodsAmount4;
    
    @DrptField(fieldnm="taxGoodsAmount5",fielddrpt="税金5")
    private BigDecimal taxGoodsAmount5;
    
    @DrptField(fieldnm="serviceTaxAmount1",fielddrpt="服务费税金1")
    private BigDecimal serviceTaxAmount1;
    
    @DrptField(fieldnm="serviceTaxAmount2",fielddrpt="服务费税金2")
    private BigDecimal serviceTaxAmount2;
    
    @DrptField(fieldnm="serviceTaxAmount3",fielddrpt="服务费税金3")
    private BigDecimal serviceTaxAmount3;
    
    @DrptField(fieldnm="serviceTaxAmount4",fielddrpt="服务费税金4")
    private BigDecimal serviceTaxAmount4;

    @DrptField(fieldnm="serviceTaxAmount5",fielddrpt="服务费税金5")
    private BigDecimal serviceTaxAmount5;
    
    @DrptField(fieldnm="makes",fielddrpt="制法list")
    private List<PosMakeForIPadInfo> makes;
    
    @DrptField(fieldnm="tastes",fielddrpt="口味、需求list")
    private List<PosDemandDto> tastes;
    
    @DrptField(fieldnm="prices",fielddrpt="价格list")
    private List<PosGoodsPriceDto> prices;
    
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsCd() {
        return goodsCd;
    }

    public void setGoodsCd(String goodsCd) {
        this.goodsCd = goodsCd;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Boolean getRePrice() {
        return rePrice;
    }

    public void setRePrice(Boolean rePrice) {
        this.rePrice = rePrice;
    }

    public List<Integer> getMakeIds() {
        return makeIds;
    }

    public void setMakeIds(List<Integer> makeIds) {
        this.makeIds = makeIds;
    }

    public List<Integer> getTasteIds() {
        return tasteIds;
    }

    public void setTasteIds(List<Integer> tasteIds) {
        this.tasteIds = tasteIds;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public BigDecimal getAttachAmount() {
        return attachAmount;
    }

    public void setAttachAmount(BigDecimal attachAmount) {
        this.attachAmount = attachAmount;
    }

    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(BigDecimal itemAmount) {
        this.itemAmount = itemAmount;
    }

    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public BigDecimal getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(BigDecimal serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getSendFlg() {
        return sendFlg;
    }

    public void setSendFlg(String sendFlg) {
        this.sendFlg = sendFlg;
    }

    public BigDecimal getMakeAmount() {
        return makeAmount;
    }

    public void setMakeAmount(BigDecimal makeAmount) {
        this.makeAmount = makeAmount;
    }

    public BigDecimal getTaxGoodsAmount1() {
        return taxGoodsAmount1;
    }

    public void setTaxGoodsAmount1(BigDecimal taxGoodsAmount1) {
        this.taxGoodsAmount1 = taxGoodsAmount1;
    }

    public BigDecimal getTaxGoodsAmount2() {
        return taxGoodsAmount2;
    }

    public void setTaxGoodsAmount2(BigDecimal taxGoodsAmount2) {
        this.taxGoodsAmount2 = taxGoodsAmount2;
    }

    public BigDecimal getTaxGoodsAmount3() {
        return taxGoodsAmount3;
    }

    public void setTaxGoodsAmount3(BigDecimal taxGoodsAmount3) {
        this.taxGoodsAmount3 = taxGoodsAmount3;
    }

    public BigDecimal getTaxGoodsAmount4() {
        return taxGoodsAmount4;
    }

    public void setTaxGoodsAmount4(BigDecimal taxGoodsAmount4) {
        this.taxGoodsAmount4 = taxGoodsAmount4;
    }

    public BigDecimal getTaxGoodsAmount5() {
        return taxGoodsAmount5;
    }

    public void setTaxGoodsAmount5(BigDecimal taxGoodsAmount5) {
        this.taxGoodsAmount5 = taxGoodsAmount5;
    }

    public BigDecimal getServiceTaxAmount1() {
        return serviceTaxAmount1;
    }

    public void setServiceTaxAmount1(BigDecimal serviceTaxAmount1) {
        this.serviceTaxAmount1 = serviceTaxAmount1;
    }

    public BigDecimal getServiceTaxAmount2() {
        return serviceTaxAmount2;
    }

    public void setServiceTaxAmount2(BigDecimal serviceTaxAmount2) {
        this.serviceTaxAmount2 = serviceTaxAmount2;
    }

    public BigDecimal getServiceTaxAmount3() {
        return serviceTaxAmount3;
    }

    public void setServiceTaxAmount3(BigDecimal serviceTaxAmount3) {
        this.serviceTaxAmount3 = serviceTaxAmount3;
    }

    public BigDecimal getServiceTaxAmount4() {
        return serviceTaxAmount4;
    }

    public void setServiceTaxAmount4(BigDecimal serviceTaxAmount4) {
        this.serviceTaxAmount4 = serviceTaxAmount4;
    }

    public BigDecimal getServiceTaxAmount5() {
        return serviceTaxAmount5;
    }

    public void setServiceTaxAmount5(BigDecimal serviceTaxAmount5) {
        this.serviceTaxAmount5 = serviceTaxAmount5;
    }

    public String getWakeFlg() {
        return wakeFlg;
    }

    public void setWakeFlg(String wakeFlg) {
        this.wakeFlg = wakeFlg;
    }

    public List<PosMakeForIPadInfo> getMakes() {
        return makes;
    }

    public void setMakes(List<PosMakeForIPadInfo> makes) {
        this.makes = makes;
    }

    public List<PosDemandDto> getTastes() {
        return tastes;
    }

    public void setTastes(List<PosDemandDto> tastes) {
        this.tastes = tastes;
    }

    public Integer getUrgeCnt() {
        return urgeCnt;
    }

    public void setUrgeCnt(Integer urgeCnt) {
        this.urgeCnt = urgeCnt;
    }

    public List<PosGoodsPriceDto> getPrices() {
        return prices;
    }

    public void setPrices(List<PosGoodsPriceDto> prices) {
        this.prices = prices;
    }
    
}
