
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import com.jw.base.framework.core.annotation.DrptEntity;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	交易代码总表基础字段
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-04-18]
 * @package com.jw.hms.cmm.m3130.f010.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-04-18|zhangteng|新增|GrpFinBaseTrncode新增
 */
@DrptEntity(ennm = "交易代码总表基础字段", endrpt = "交易代码总表基础字段")
public class GrpFinBaseTrncodeDto implements  java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -7358583898280067593L;
	
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码 ", nullable = "false", length = "40")
	
	
	private String chainUid;
	
	@DrptField(fieldnm = "statusFlg", fielddrpt = "有效标记 ", nullable = "true", length = "3")
	
	private String statusFlg;
	
	@DrptField(fieldnm = "trncdId", fielddrpt = "科目ID ", nullable = "true", length = "32")
	private Integer trncdId;
	
	@DrptField(fieldnm = "trnCd", fielddrpt = "科目编码 ", nullable = "true", length = "20")
	
	private String trnCd;
	
	@DrptField(fieldnm = "trnDrpt", fielddrpt = "科目名称 ", nullable = "true", length = "200")
	
	private String trnDrpt;
	
	@DrptField(fieldnm = "trnclsId", fielddrpt = "科目大分类 ", nullable = "true", length = "10")
	private Integer trnclsId;
	
	@DrptField(fieldnm = "trnsubclsId", fielddrpt = "科目小分类 ", nullable = "true", length = "10")
	private Integer trnsubclsId;
	
	@DrptField(fieldnm = "normal", fielddrpt = "科目借贷属性 C：CREDIT；D：DEBIT", nullable = "true", length = "3")
	
	private String normal;
	
	@DrptField(fieldnm = "trnTyp", fielddrpt = "科目类型 10.房费 11.餐费 12.娱乐 13.电话费 14. 商务中心 15.迷你吧 20..非营业收入 21..服务费 22.. 税费1 23.税费2 24.税费3 25.税费4 25.税费5 30.其它 31.系统用 32.NAR 99.付款41.现金 42.支票 43.银行卡 （信用卡，借记卡）44会员卡 45.转应收 46.免费券  47.金额转账 48.Paid Out 49 微信 50 支付宝 99.其它结算方式", nullable = "true", length = "3")
	
	private String trnTyp;
	
	@DrptField(fieldnm = "trndtypId", fielddrpt = "费用科目分类？ ", nullable = "true", length = "10")
	private Integer trndtypId;
	
	@DrptField(fieldnm = "taxtypeId", fielddrpt = "税种ID ", nullable = "true", length = "10")
	private Integer taxtypeId;
	
	@DrptField(fieldnm = "apuseFlg", fielddrpt = "Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String apuseFlg;
	
	@DrptField(fieldnm = "mcuseFlg", fielddrpt = "Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String mcuseFlg;
	
	@DrptField(fieldnm = "crsuseFlg", fielddrpt = "Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String crsuseFlg;
	
	@DrptField(fieldnm = "loguseFlg", fielddrpt = "Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String loguseFlg;
	
	@DrptField(fieldnm = "gfcuseFlg", fielddrpt = "Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String gfcuseFlg;
	public String getApuseFlg() {
		return apuseFlg;
	}
	public void setApuseFlg(String apuseFlg) {
		this.apuseFlg = apuseFlg;
	}
	public String getMcuseFlg() {
		return mcuseFlg;
	}
	public void setMcuseFlg(String mcuseFlg) {
		this.mcuseFlg = mcuseFlg;
	}
	public String getCrsuseFlg() {
		return crsuseFlg;
	}
	public void setCrsuseFlg(String crsuseFlg) {
		this.crsuseFlg = crsuseFlg;
	}
	public String getLoguseFlg() {
		return loguseFlg;
	}
	public void setLoguseFlg(String loguseFlg) {
		this.loguseFlg = loguseFlg;
	}
	public String getGfcuseFlg() {
		return gfcuseFlg;
	}
	public void setGfcuseFlg(String gfcuseFlg) {
		this.gfcuseFlg = gfcuseFlg;
	}
	public String getEbsuseFlg() {
		return ebsuseFlg;
	}
	public void setEbsuseFlg(String ebsuseFlg) {
		this.ebsuseFlg = ebsuseFlg;
	}
	
	@DrptField(fieldnm = "ebsuseFlg", fielddrpt = "Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String ebsuseFlg;
	
	@DrptField(fieldnm = "psncntFlg", fielddrpt = "必输人数 Y：是，N：否", nullable = "true", length = "3")
	
	private String psncntFlg;
	
	public Integer getTaxtypeId() {
		return taxtypeId;
	}
	public void setTaxtypeId(Integer taxtypeId) {
		this.taxtypeId = taxtypeId;
	}
	public String getPsncntFlg() {
		return psncntFlg;
	}
	public void setPsncntFlg(String psncntFlg) {
		this.psncntFlg = psncntFlg;
	}
	
	@DrptField(fieldnm = "frontuseFlg", fielddrpt = "允许前台使用 Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String frontuseFlg;
	
	@DrptField(fieldnm = "aruseFlg", fielddrpt = "允许应收使用 Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String aruseFlg;
	
	@DrptField(fieldnm = "posuseFlg", fielddrpt = "允许POS使用 Y：允许，N：不允许", nullable = "true", length = "3")
	
	private String posuseFlg;
	
	@DrptField(fieldnm = "advdepositFlg", fielddrpt = "是否定金科目 normal=C时有效；Y：是，N：不是", nullable = "true", length = "3")
	
	private String advdepositFlg;
	
	@DrptField(fieldnm = "depositFlg", fielddrpt = "是否押金科目 normal=C时有效；Y：是，N：不是", nullable = "true", length = "3")
	
	private String depositFlg;
	
	@DrptField(fieldnm = "postFlg", fielddrpt = "是否入账科目 不算收入的付款、费用类型的科目都不能是入账科目", nullable = "true", length = "3")
	
	private String postFlg;
	
	@DrptField(fieldnm = "plusFlg", fielddrpt = "是否加收项目 dc_flg=D时有效，Y：是（能作为自动挂账、入/离店收费结构），N：否", nullable = "true", length = "3")
	
	private String plusFlg;
	
	@DrptField(fieldnm = "checkFlg", fielddrpt = "是否结账科目 normal=C时有效；Y：是，N：不是", nullable = "true", length = "3")
	
	private String checkFlg;
	
	@DrptField(fieldnm = "arreceiptFlg", fielddrpt = "是否应收回款科目 normal=C时有效；Y：是，N：不是", nullable = "true", length = "3")
	
	private String arreceiptFlg;
	
	@DrptField(fieldnm = "revenueFlg", fielddrpt = "是否算收入（Revenue） Y：是，N：不是 当是结账的付款科目时check_flg=Y，表示以该科目结账的费用是否算收入。结账时，本标记不同的付款方式不能同时结账", nullable = "true", length = "3")
	
	private String revenueFlg;
	
	@DrptField(fieldnm = "nightsFlg", fielddrpt = "是否计算房晚 Y：是，N：不是", nullable = "true", length = "3")
	
	private String nightsFlg;
	
	@DrptField(fieldnm = "internalFlg", fielddrpt = "是否内部使用 Y：是，N：不是 系统用的都不允许人为操作入账（包括定金、押金、入账、结账等）", nullable = "true", length = "3")
	
	private String internalFlg;
	
	@DrptField(fieldnm = "onlineFlg", fielddrpt = "是否调用接口 Y：是，N：不是", nullable = "true", length = "3")
	
	private String onlineFlg;
	
	@DrptField(fieldnm = "pointFlg", fielddrpt = "是否可积分 normal=DEBIT时必填。Y：可以，N：不可以。", nullable = "true", length = "3")
	
	private String pointFlg;
	
	@DrptField(fieldnm = "rvntrncdId", fielddrpt = "对应营收科目 trn_typ=NAR科目必填，其他为空", nullable = "true", length = "10")
	private Integer rvntrncdId;
	
	@DrptField(fieldnm = "adjtrncdId", fielddrpt = "调账科目 ", nullable = "true", length = "10")
	private Integer adjtrncdId;
	
	@DrptField(fieldnm = "svctypId", fielddrpt = "服务费费率代码 ", nullable = "true", length = "10")
	private Integer svctypId;
	
	@DrptField(fieldnm = "svcfolioFlg", fielddrpt = "服务费账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	
	private String svcfolioFlg;
	
	@DrptField(fieldnm = "svcchargeFlg", fielddrpt = "服务费收费方式 1：内含；2：另收", nullable = "true", length = "3")
	
	private String svcchargeFlg;
	
	@DrptField(fieldnm = "tax1Id", fielddrpt = "税1率代码 ", nullable = "true", length = "10")
	private Integer tax1Id;
	
	@DrptField(fieldnm = "tax1folioFlg", fielddrpt = "税1账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	
	private String tax1folioFlg;
	
	@DrptField(fieldnm = "tax1chargeFlg", fielddrpt = "税1收费方式 1：内含；2：另收", nullable = "true", length = "3")
	
	private String tax1chargeFlg;
	
	@DrptField(fieldnm = "tax2Id", fielddrpt = "税2率代码 ", nullable = "true", length = "10")
	private Integer tax2Id;
	
	@DrptField(fieldnm = "tax2folioFlg", fielddrpt = "税2账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	
	private String tax2folioFlg;
	
	@DrptField(fieldnm = "tax2chargeFlg", fielddrpt = "税2收费方式 1：内含；2：另收", nullable = "true", length = "3")
	
	private String tax2chargeFlg;
	
	@DrptField(fieldnm = "tax3Id", fielddrpt = "税3率代码 ", nullable = "true", length = "10")
	private Integer tax3Id;
	
	@DrptField(fieldnm = "tax3folioFlg", fielddrpt = "税3账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	
	private String tax3folioFlg;
	
	@DrptField(fieldnm = "tax3chargeFlg", fielddrpt = "税3收费方式 1：内含；2：另收", nullable = "true", length = "3")
	
	private String tax3chargeFlg;
	
	@DrptField(fieldnm = "tax4Id", fielddrpt = "税4率代码 ", nullable = "true", length = "10")
	private Integer tax4Id;
	
	@DrptField(fieldnm = "tax4folioFlg", fielddrpt = "税4账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	
	private String tax4folioFlg;
	
	@DrptField(fieldnm = "tax4chargeFlg", fielddrpt = "税4收费方式 1：内含；2：另收", nullable = "true", length = "3")
	
	private String tax4chargeFlg;
	
	@DrptField(fieldnm = "tax5Id", fielddrpt = "税5率代码 ", nullable = "true", length = "10")
	private Integer tax5Id;
	
	@DrptField(fieldnm = "tax5folioFlg", fielddrpt = "税5账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	
	private String tax5folioFlg;
	
	@DrptField(fieldnm = "tax5chargeFlg", fielddrpt = "税5收费方式 1：内含；2：另收", nullable = "true", length = "3")
	
	private String tax5chargeFlg;

	
	
	@DrptField(fieldnm = "seq", fielddrpt = "显示顺序 ", nullable = "true", length = "32")
	private Integer seq;
	
	
	@DrptField(fieldnm = "trnctypId", fielddrpt = "类型id ", nullable = "true", length = "32")
	private Integer trnctypId;
	
	public Integer getTrnctypId() {
		return trnctypId;
	}
	public void setTrnctypId(Integer trnctypId) {
		this.trnctypId = trnctypId;
	}
	public Integer getSeq() {
		return this.seq;
	}
	public void setSeq(Integer value) {
		this.seq = value;
	}

	public GrpFinBaseTrncodeDto(){
	}
	
	public String getChainUid() {
		return this.chainUid;
	}
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getStatusFlg() {
		return this.statusFlg;
	}
	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}
	public Integer getTrncdId() {
		return this.trncdId;
	}
	public void setTrncdId(Integer value) {
		this.trncdId = value;
	}
	public String getTrnCd() {
		return this.trnCd;
	}
	public void setTrnCd(String value) {
		this.trnCd = value;
	}
	public String getTrnDrpt() {
		return this.trnDrpt;
	}
	public void setTrnDrpt(String value) {
		this.trnDrpt = value;
	}
	public Integer getTrnclsId() {
		return this.trnclsId;
	}
	public void setTrnclsId(Integer value) {
		this.trnclsId = value;
	}
	public Integer getTrnsubclsId() {
		return this.trnsubclsId;
	}
	public void setTrnsubclsId(Integer value) {
		this.trnsubclsId = value;
	}
	public String getNormal() {
		return this.normal;
	}
	public void setNormal(String value) {
		this.normal = value;
	}
	public String getTrnTyp() {
		return this.trnTyp;
	}
	public void setTrnTyp(String value) {
		this.trnTyp = value;
	}
	public Integer getTrndtypId() {
		return this.trndtypId;
	}
	public void setTrndtypId(Integer value) {
		this.trndtypId = value;
	}
	public String getFrontuseFlg() {
		return this.frontuseFlg;
	}
	public void setFrontuseFlg(String value) {
		this.frontuseFlg = value;
	}
	public String getAruseFlg() {
		return this.aruseFlg;
	}
	public void setAruseFlg(String value) {
		this.aruseFlg = value;
	}
	public String getPosuseFlg() {
		return this.posuseFlg;
	}
	public void setPosuseFlg(String value) {
		this.posuseFlg = value;
	}
	public String getAdvdepositFlg() {
		return this.advdepositFlg;
	}
	public void setAdvdepositFlg(String value) {
		this.advdepositFlg = value;
	}
	public String getDepositFlg() {
		return this.depositFlg;
	}
	public void setDepositFlg(String value) {
		this.depositFlg = value;
	}
	public String getPostFlg() {
		return this.postFlg;
	}
	public void setPostFlg(String value) {
		this.postFlg = value;
	}
	public String getPlusFlg() {
		return plusFlg;
	}
	public void setPlusFlg(String plusFlg) {
		this.plusFlg = plusFlg;
	}
	public String getCheckFlg() {
		return this.checkFlg;
	}
	public void setCheckFlg(String value) {
		this.checkFlg = value;
	}
	public String getArreceiptFlg() {
		return this.arreceiptFlg;
	}
	public void setArreceiptFlg(String value) {
		this.arreceiptFlg = value;
	}
	public String getRevenueFlg() {
		return this.revenueFlg;
	}
	public void setRevenueFlg(String value) {
		this.revenueFlg = value;
	}
	public String getNightsFlg() {
		return this.nightsFlg;
	}
	public void setNightsFlg(String value) {
		this.nightsFlg = value;
	}
	public String getInternalFlg() {
		return this.internalFlg;
	}
	public void setInternalFlg(String value) {
		this.internalFlg = value;
	}
	public String getOnlineFlg() {
		return this.onlineFlg;
	}
	public void setOnlineFlg(String value) {
		this.onlineFlg = value;
	}
	public String getPointFlg() {
		return this.pointFlg;
	}
	public void setPointFlg(String value) {
		this.pointFlg = value;
	}
	public Integer getRvntrncdId() {
		return this.rvntrncdId;
	}
	public void setRvntrncdId(Integer value) {
		this.rvntrncdId = value;
	}
	public Integer getAdjtrncdId() {
		return this.adjtrncdId;
	}
	public void setAdjtrncdId(Integer value) {
		this.adjtrncdId = value;
	}
	
	public Integer getSvctypId() {
		return this.svctypId;
	}
	public void setSvctypId(Integer value) {
		this.svctypId = value;
	}
	
	public String getSvcfolioFlg() {
		return this.svcfolioFlg;
	}
	public void setSvcfolioFlg(String value) {
		this.svcfolioFlg = value;
	}
	
	public String getSvcchargeFlg() {
		return this.svcchargeFlg;
	}
	public void setSvcchargeFlg(String value) {
		this.svcchargeFlg = value;
	}
	
	public Integer getTax1Id() {
		return this.tax1Id;
	}
	public void setTax1Id(Integer value) {
		this.tax1Id = value;
	}
	
	public String getTax1folioFlg() {
		return this.tax1folioFlg;
	}
	public void setTax1folioFlg(String value) {
		this.tax1folioFlg = value;
	}
	
	public String getTax1chargeFlg() {
		return this.tax1chargeFlg;
	}
	public void setTax1chargeFlg(String value) {
		this.tax1chargeFlg = value;
	}
	
	public Integer getTax2Id() {
		return this.tax2Id;
	}
	public void setTax2Id(Integer value) {
		this.tax2Id = value;
	}
	
	public String getTax2folioFlg() {
		return this.tax2folioFlg;
	}
	public void setTax2folioFlg(String value) {
		this.tax2folioFlg = value;
	}
	
	public String getTax2chargeFlg() {
		return this.tax2chargeFlg;
	}
	public void setTax2chargeFlg(String value) {
		this.tax2chargeFlg = value;
	}
	
	public Integer getTax3Id() {
		return this.tax3Id;
	}
	public void setTax3Id(Integer value) {
		this.tax3Id = value;
	}
	
	public String getTax3folioFlg() {
		return this.tax3folioFlg;
	}
	public void setTax3folioFlg(String value) {
		this.tax3folioFlg = value;
	}
	
	public String getTax3chargeFlg() {
		return this.tax3chargeFlg;
	}
	public void setTax3chargeFlg(String value) {
		this.tax3chargeFlg = value;
	}
	
	public Integer getTax4Id() {
		return this.tax4Id;
	}
	public void setTax4Id(Integer value) {
		this.tax4Id = value;
	}
	
	public String getTax4folioFlg() {
		return this.tax4folioFlg;
	}
	public void setTax4folioFlg(String value) {
		this.tax4folioFlg = value;
	}
	
	public String getTax4chargeFlg() {
		return this.tax4chargeFlg;
	}
	public void setTax4chargeFlg(String value) {
		this.tax4chargeFlg = value;
	}
	
	public Integer getTax5Id() {
		return this.tax5Id;
	}
	public void setTax5Id(Integer value) {
		this.tax5Id = value;
	}
	
	public String getTax5folioFlg() {
		return this.tax5folioFlg;
	}
	public void setTax5folioFlg(String value) {
		this.tax5folioFlg = value;
	}
	
	public String getTax5chargeFlg() {
		return this.tax5chargeFlg;
	}
	public void setTax5chargeFlg(String value) {
		this.tax5chargeFlg = value;
	}
	/**GrpFinBaseTrncode对应的子DTO**/
	private SubDto grpFinBaseTrncodeSubDto;
	/**
	 * 
	 * ## 方法说明：
	 * 	GrpFinBaseTrncode对应的子DTO
	 * @return
	 */
	
	public SubDto getSubDto() {
		return grpFinBaseTrncodeSubDto;
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	GrpFinBaseTrncode对应的子DTO
	 * @param
	 */
	public void setSubDto(SubDto grpFinBaseTrncodeSubDto) {
		this.grpFinBaseTrncodeSubDto = grpFinBaseTrncodeSubDto;
	}
	

	
	

}

