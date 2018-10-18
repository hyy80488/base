
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import java.math.BigDecimal;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	PosSalesDtoT销售点配置传输对象
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.hms.pos.m3310.f010.dto.posConfig
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosResvBillResponseFormDto新增
 */
@DrptDto(dtonm = "PosSalesDtoT",dtodrpt="PosSalesDtoT销售点返回传输对象")
public class PosSalesDtoT extends ResponseBaseDto implements java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4395081568354760514L;
	/** ID  **/
	private Integer id;
	/** 销售点标识  **/
	private Integer salesId;
	/** 集团标识  **/
	private String chainUid;
	/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
	private String unitUid;
	/** 销售点代码  **/
	private String salesCd;
	/** 销售点名称  **/
	private String salesNm;
	/** 销售点类型 0-餐饮,1-会议室,2-康乐, 3-桑拿,4-商务中心,5-商场,6-洗衣,7-多功能厅 **/
	private String salesTyp;
	/** 菜谱标识  **/
	private Integer cookbookId;
	/** 所属部门标识  **/
	private Integer deptId;
	/** 销售点分组标识  **/
	private Integer groupId;
	/** 默认服务费率  **/
	private BigDecimal serviceRate;
	/** 服务费属性 0-普通,1-强行 **/
	private String serviceFlg;
	/** 默认折扣率  **/
	private BigDecimal discountRate;
	/** 折扣属性 0-普通,1-强行 **/
	private String discountFlg;
	/** 销售点顺序  **/
	private Integer salesSeq;
	/** 自动入账控制 0-使用桌台类型控制自动入账项目,1-使用预订区域控制自动入账项目 **/
	private String autoProjectFlg;
	/** 最大容纳人数  **/
	private Integer maxPersonNum;
	/** 服务费参与折扣标识 0-服务费不参与折扣,1-服务费参与折扣 **/
	private String serviceDiscountFlg;
	/** 有效标识 0-无效,1-有效 **/
	private String validFlg;
	/** 服务费税率1 默认为零 **/
	private Integer serviceTax1Id;
	/** 服务费税率2 默认为零 **/
	private Integer serviceTax2Id;
	/** 服务费税率3 默认为零 **/
	private Integer serviceTax3Id;
	/** 服务费税率4 默认为零 **/
	private Integer serviceTax4Id;
	/** 服务费税率5 默认为零 **/
	private Integer serviceTax5Id;
	/** 前台账号  **/
	private String fontAcctNo;
	/** 前台交易代码标识  **/
	private Integer fontTranId;
	/** 厨房打印 0-停用 1-启用 **/
	private String kitchenFlg;
	/** 连接前台 0-停用 1-启用 这里控制销售点是否在现付时将账务挂到前台 **/
	private String fontFlg;
	/** PAD点餐 0-停用 1-启用 **/
	private String padFlg;
	/** 版本号  **/
	private Integer version;
	/** 备注  **/
	private String memo;
	/** 预留字段1 **/
	private Integer obligate1;
	/** 预留字段2 **/
	private Integer obligate2;
	/** 预留字段3 **/
	private Integer obligate3;
	/** 预留字段4 **/
	private Integer obligate4;
	/** 预留字段5 **/
	private Integer obligate5;
	/** 预留字段6 **/
	private String obligate6;
	/** 预留字段7 **/
	private String obligate7;
	/** 预留字段8 **/
	private String obligate8;
	/** 预留字段9 **/
	private String obligate9;
	/** 预留字段10 **/
	private String obligate10;
	/** 预留字段11 **/
	private BigDecimal obligate11;
	/** 预留字段12 **/
	private BigDecimal obligate12;
	/** 预留字段13 **/
	private BigDecimal obligate13;
	/** 预留字段14 **/
	private BigDecimal obligate14;
	/** 预留字段15 **/
	private BigDecimal obligate15;
	/** 点菜打印机标识 **/
	private Integer orderPrintId;
	/** 结账打印机标识 **/
	private Integer checkPrintId;
	/** 预留打印机1标识 **/
	private Integer obligatePrint1Id;
	/** 预留打印机2标识 **/
	private Integer obligatePrint2Id;
	/** 预留打印机3标识 **/
	private Integer obligatePrint3Id;
	/** businessUid **/
	private String businessUid;
	/** businessStus **/
	private String businessStus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSalesId() {
		return salesId;
	}
	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}
	public String getChainUid() {
		return chainUid;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public String getSalesCd() {
		return salesCd;
	}
	public void setSalesCd(String salesCd) {
		this.salesCd = salesCd;
	}
	public String getSalesNm() {
		return salesNm;
	}
	public void setSalesNm(String salesNm) {
		this.salesNm = salesNm;
	}
	public String getSalesTyp() {
		return salesTyp;
	}
	public void setSalesTyp(String salesTyp) {
		this.salesTyp = salesTyp;
	}
	public Integer getCookbookId() {
		return cookbookId;
	}
	public void setCookbookId(Integer cookbookId) {
		this.cookbookId = cookbookId;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public BigDecimal getServiceRate() {
		return serviceRate;
	}
	public void setServiceRate(BigDecimal serviceRate) {
		this.serviceRate = serviceRate;
	}
	public String getServiceFlg() {
		return serviceFlg;
	}
	public void setServiceFlg(String serviceFlg) {
		this.serviceFlg = serviceFlg;
	}
	public BigDecimal getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}
	public String getDiscountFlg() {
		return discountFlg;
	}
	public void setDiscountFlg(String discountFlg) {
		this.discountFlg = discountFlg;
	}
	public Integer getSalesSeq() {
		return salesSeq;
	}
	public void setSalesSeq(Integer salesSeq) {
		this.salesSeq = salesSeq;
	}
	public String getAutoProjectFlg() {
		return autoProjectFlg;
	}
	public void setAutoProjectFlg(String autoProjectFlg) {
		this.autoProjectFlg = autoProjectFlg;
	}
	public Integer getMaxPersonNum() {
		return maxPersonNum;
	}
	public void setMaxPersonNum(Integer maxPersonNum) {
		this.maxPersonNum = maxPersonNum;
	}
	public String getServiceDiscountFlg() {
		return serviceDiscountFlg;
	}
	public void setServiceDiscountFlg(String serviceDiscountFlg) {
		this.serviceDiscountFlg = serviceDiscountFlg;
	}
	public String getValidFlg() {
		return validFlg;
	}
	public void setValidFlg(String validFlg) {
		this.validFlg = validFlg;
	}
	public Integer getServiceTax1Id() {
		return serviceTax1Id;
	}
	public void setServiceTax1Id(Integer serviceTax1Id) {
		this.serviceTax1Id = serviceTax1Id;
	}
	public Integer getServiceTax2Id() {
		return serviceTax2Id;
	}
	public void setServiceTax2Id(Integer serviceTax2Id) {
		this.serviceTax2Id = serviceTax2Id;
	}
	public Integer getServiceTax3Id() {
		return serviceTax3Id;
	}
	public void setServiceTax3Id(Integer serviceTax3Id) {
		this.serviceTax3Id = serviceTax3Id;
	}
	public Integer getServiceTax4Id() {
		return serviceTax4Id;
	}
	public void setServiceTax4Id(Integer serviceTax4Id) {
		this.serviceTax4Id = serviceTax4Id;
	}
	public Integer getServiceTax5Id() {
		return serviceTax5Id;
	}
	public void setServiceTax5Id(Integer serviceTax5Id) {
		this.serviceTax5Id = serviceTax5Id;
	}
	public String getFontAcctNo() {
		return fontAcctNo;
	}
	public void setFontAcctNo(String fontAcctNo) {
		this.fontAcctNo = fontAcctNo;
	}
	public Integer getFontTranId() {
		return fontTranId;
	}
	public void setFontTranId(Integer fontTranId) {
		this.fontTranId = fontTranId;
	}
	public String getKitchenFlg() {
		return kitchenFlg;
	}
	public void setKitchenFlg(String kitchenFlg) {
		this.kitchenFlg = kitchenFlg;
	}
	public String getFontFlg() {
		return fontFlg;
	}
	public void setFontFlg(String fontFlg) {
		this.fontFlg = fontFlg;
	}
	public String getPadFlg() {
		return padFlg;
	}
	public void setPadFlg(String padFlg) {
		this.padFlg = padFlg;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Integer getObligate1() {
		return obligate1;
	}
	public void setObligate1(Integer obligate1) {
		this.obligate1 = obligate1;
	}
	public Integer getObligate2() {
		return obligate2;
	}
	public void setObligate2(Integer obligate2) {
		this.obligate2 = obligate2;
	}
	public Integer getObligate3() {
		return obligate3;
	}
	public void setObligate3(Integer obligate3) {
		this.obligate3 = obligate3;
	}
	public Integer getObligate4() {
		return obligate4;
	}
	public void setObligate4(Integer obligate4) {
		this.obligate4 = obligate4;
	}
	public Integer getObligate5() {
		return obligate5;
	}
	public void setObligate5(Integer obligate5) {
		this.obligate5 = obligate5;
	}
	public String getObligate6() {
		return obligate6;
	}
	public void setObligate6(String obligate6) {
		this.obligate6 = obligate6;
	}
	public String getObligate7() {
		return obligate7;
	}
	public void setObligate7(String obligate7) {
		this.obligate7 = obligate7;
	}
	public String getObligate8() {
		return obligate8;
	}
	public void setObligate8(String obligate8) {
		this.obligate8 = obligate8;
	}
	public String getObligate9() {
		return obligate9;
	}
	public void setObligate9(String obligate9) {
		this.obligate9 = obligate9;
	}
	public String getObligate10() {
		return obligate10;
	}
	public void setObligate10(String obligate10) {
		this.obligate10 = obligate10;
	}
	public BigDecimal getObligate11() {
		return obligate11;
	}
	public void setObligate11(BigDecimal obligate11) {
		this.obligate11 = obligate11;
	}
	public BigDecimal getObligate12() {
		return obligate12;
	}
	public void setObligate12(BigDecimal obligate12) {
		this.obligate12 = obligate12;
	}
	public BigDecimal getObligate13() {
		return obligate13;
	}
	public void setObligate13(BigDecimal obligate13) {
		this.obligate13 = obligate13;
	}
	public BigDecimal getObligate14() {
		return obligate14;
	}
	public void setObligate14(BigDecimal obligate14) {
		this.obligate14 = obligate14;
	}
	public BigDecimal getObligate15() {
		return obligate15;
	}
	public void setObligate15(BigDecimal obligate15) {
		this.obligate15 = obligate15;
	}
	public Integer getOrderPrintId() {
		return orderPrintId;
	}
	public void setOrderPrintId(Integer orderPrintId) {
		this.orderPrintId = orderPrintId;
	}
	public Integer getCheckPrintId() {
		return checkPrintId;
	}
	public void setCheckPrintId(Integer checkPrintId) {
		this.checkPrintId = checkPrintId;
	}
	public Integer getObligatePrint1Id() {
		return obligatePrint1Id;
	}
	public void setObligatePrint1Id(Integer obligatePrint1Id) {
		this.obligatePrint1Id = obligatePrint1Id;
	}
	public Integer getObligatePrint2Id() {
		return obligatePrint2Id;
	}
	public void setObligatePrint2Id(Integer obligatePrint2Id) {
		this.obligatePrint2Id = obligatePrint2Id;
	}
	public Integer getObligatePrint3Id() {
		return obligatePrint3Id;
	}
	public void setObligatePrint3Id(Integer obligatePrint3Id) {
		this.obligatePrint3Id = obligatePrint3Id;
	}
	public String getBusinessUid() {
		return businessUid;
	}
	public void setBusinessUid(String businessUid) {
		this.businessUid = businessUid;
	}
	public String getBusinessStus() {
		return businessStus;
	}
	public void setBusinessStus(String businessStus) {
		this.businessStus = businessStus;
	}
	
	
	

}
