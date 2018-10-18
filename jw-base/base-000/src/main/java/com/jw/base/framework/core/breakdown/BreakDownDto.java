/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.breakdown;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import com.jw.base.framework.core.RoundModeEnum;

public class BreakDownDto implements java.io.Serializable {

	
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 5544573932338727555L;
	/** ①输入金额 */
	private BigDecimal rate;
	/** ②加收金额 */
	private BigDecimal extrAmt;
	/** ③折扣 */
	private BigDecimal discPcnt;
	/** ④折扣金额 */
	private BigDecimal discAmt;
	/** 结合①~④计算出的金额 */
	private BigDecimal charge;
	
	/** 服务费收费标记 1内含 2加收 */
	private String svcchargeFlg;
	/** 服务费率 */
	private BigDecimal svcRates;
	/** 税1收费标记 */
	private String tax1chargeFlg;
	/** 税1率 */
	private BigDecimal tax1Rates;
	/** 税2收费标记 */
	private String tax2chargeFlg;
	/** 税2率 */
	private BigDecimal tax2Rates;
	/** 税3收费标记 */
	private String tax3chargeFlg;
	/** 税3率 */
	private BigDecimal tax3Rates;
	/** 税4收费标记 */
	private String tax4chargeFlg;
	/** 税4率 */
	private BigDecimal tax4Rates;
	/** 税5收费标记 */
	private String tax5chargeFlg;
	/** 税5率 */
	private BigDecimal tax5Rates;
	
	/** 服务费税1率 */
	private BigDecimal svctax1Rates;
	/** 服务费税2率 */
	private BigDecimal svctax2Rates;
	/** 服务费税3率 */
	private BigDecimal svctax3Rates;
	/** 服务费税4率 */
	private BigDecimal svctax4Rates;
	/** 服务费税5率 */
	private BigDecimal svctax5Rates;
	
	/** 小数处理方式 */
	private RoundModeEnum roundMode;
	/** 保留小数位数 */
	private int scale;

	/** 返回值：净额 */
	private BigDecimal net;
	/** 返回值： 服务费*/
	private BigDecimal svc;
	/** 返回值： 税1*/
	private BigDecimal tax1;
	/** 返回值： 服务费税1*/
	private BigDecimal svcTax1;
	/** 返回值： 税2*/
	private BigDecimal tax2;
	/** 返回值： 服务费税2*/
	private BigDecimal svcTax2;
	/** 返回值： 税3*/
	private BigDecimal tax3;
	/** 返回值： 服务费税3*/
	private BigDecimal svcTax3;
	/** 返回值： 税4*/
	private BigDecimal tax4;
	/** 返回值： 服务费税4*/
	private BigDecimal svcTax4;
	/** 返回值： 税5*/
	private BigDecimal tax5;
	/** 返回值： 服务费税5*/
	private BigDecimal svcTax5;
	/** 返回值： 以上相加总额*/
	private BigDecimal gross;
	
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public BigDecimal getExtrAmt() {
		return extrAmt;
	}
	public void setExtrAmt(BigDecimal extrAmt) {
		this.extrAmt = extrAmt;
	}
	public BigDecimal getDiscPcnt() {
		return discPcnt;
	}
	public void setDiscPcnt(BigDecimal discPcnt) {
		this.discPcnt = discPcnt;
	}
	public BigDecimal getDiscAmt() {
		return discAmt;
	}
	public void setDiscAmt(BigDecimal discAmt) {
		this.discAmt = discAmt;
		//折扣金额不为null  *-1
		if(this.discAmt != null){
			this.discAmt = this.discAmt.multiply(new BigDecimal(-1));
		}
	}
	public BigDecimal getCharge() {
		return charge;
	}
	public void setCharge(BigDecimal charge) {
		this.charge = charge;
	}
	public BigDecimal getNet() {
		return net;
	}
	public void setNet(BigDecimal net) {
		this.net = net;
	}
	public BigDecimal getSvc() {
		return svc;
	}
	public void setSvc(BigDecimal svc) {
		this.svc = svc;
	}
	public BigDecimal getTax1() {
		return tax1;
	}
	public void setTax1(BigDecimal tax1) {
		this.tax1 = tax1;
	}
	public BigDecimal getSvcTax1() {
		return svcTax1;
	}
	public void setSvcTax1(BigDecimal svcTax1) {
		this.svcTax1 = svcTax1;
	}
	public BigDecimal getTax2() {
		return tax2;
	}
	public void setTax2(BigDecimal tax2) {
		this.tax2 = tax2;
	}
	public BigDecimal getSvcTax2() {
		return svcTax2;
	}
	public void setSvcTax2(BigDecimal svcTax2) {
		this.svcTax2 = svcTax2;
	}
	public BigDecimal getTax3() {
		return tax3;
	}
	public void setTax3(BigDecimal tax3) {
		this.tax3 = tax3;
	}
	public BigDecimal getSvcTax3() {
		return svcTax3;
	}
	public void setSvcTax3(BigDecimal svcTax3) {
		this.svcTax3 = svcTax3;
	}
	public BigDecimal getTax4() {
		return tax4;
	}
	public void setTax4(BigDecimal tax4) {
		this.tax4 = tax4;
	}
	public BigDecimal getSvcTax4() {
		return svcTax4;
	}
	public void setSvcTax4(BigDecimal svcTax4) {
		this.svcTax4 = svcTax4;
	}
	public BigDecimal getTax5() {
		return tax5;
	}
	public void setTax5(BigDecimal tax5) {
		this.tax5 = tax5;
	}
	public BigDecimal getSvcTax5() {
		return svcTax5;
	}
	public void setSvcTax5(BigDecimal svcTax5) {
		this.svcTax5 = svcTax5;
	}
	public BigDecimal getGross() {
		return gross;
	}
	public void setGross(BigDecimal gross) {
		this.gross = gross;
	}
	public String getSvcchargeFlg() {
		return svcchargeFlg;
	}
	public void setSvcchargeFlg(String svcchargeFlg) {
		this.svcchargeFlg = svcchargeFlg;
	}
	public BigDecimal getSvcRates() {
		return svcRates;
	}
	public void setSvcRates(BigDecimal svcRates) {
		this.svcRates = svcRates;
	}
	public String getTax1chargeFlg() {
		return tax1chargeFlg;
	}
	public void setTax1chargeFlg(String tax1chargeFlg) {
		this.tax1chargeFlg = tax1chargeFlg;
	}
	public BigDecimal getTax1Rates() {
		return tax1Rates;
	}
	public void setTax1Rates(BigDecimal tax1Rates) {
		this.tax1Rates = tax1Rates;
	}
	public String getTax2chargeFlg() {
		return tax2chargeFlg;
	}
	public void setTax2chargeFlg(String tax2chargeFlg) {
		this.tax2chargeFlg = tax2chargeFlg;
	}
	public BigDecimal getTax2Rates() {
		return tax2Rates;
	}
	public void setTax2Rates(BigDecimal tax2Rates) {
		this.tax2Rates = tax2Rates;
	}
	public String getTax3chargeFlg() {
		return tax3chargeFlg;
	}
	public void setTax3chargeFlg(String tax3chargeFlg) {
		this.tax3chargeFlg = tax3chargeFlg;
	}
	public BigDecimal getTax3Rates() {
		return tax3Rates;
	}
	public void setTax3Rates(BigDecimal tax3Rates) {
		this.tax3Rates = tax3Rates;
	}
	public String getTax4chargeFlg() {
		return tax4chargeFlg;
	}
	public void setTax4chargeFlg(String tax4chargeFlg) {
		this.tax4chargeFlg = tax4chargeFlg;
	}
	public BigDecimal getTax4Rates() {
		return tax4Rates;
	}
	public void setTax4Rates(BigDecimal tax4Rates) {
		this.tax4Rates = tax4Rates;
	}
	public String getTax5chargeFlg() {
		return tax5chargeFlg;
	}
	public void setTax5chargeFlg(String tax5chargeFlg) {
		this.tax5chargeFlg = tax5chargeFlg;
	}
	public BigDecimal getTax5Rates() {
		return tax5Rates;
	}
	public void setTax5Rates(BigDecimal tax5Rates) {
		this.tax5Rates = tax5Rates;
	}
	public BigDecimal getSvctax1Rates() {
		return svctax1Rates;
	}
	public void setSvctax1Rates(BigDecimal svctax1Rates) {
		this.svctax1Rates = svctax1Rates;
	}
	public BigDecimal getSvctax2Rates() {
		return svctax2Rates;
	}
	public void setSvctax2Rates(BigDecimal svctax2Rates) {
		this.svctax2Rates = svctax2Rates;
	}
	public BigDecimal getSvctax3Rates() {
		return svctax3Rates;
	}
	public void setSvctax3Rates(BigDecimal svctax3Rates) {
		this.svctax3Rates = svctax3Rates;
	}
	public BigDecimal getSvctax4Rates() {
		return svctax4Rates;
	}
	public void setSvctax4Rates(BigDecimal svctax4Rates) {
		this.svctax4Rates = svctax4Rates;
	}
	public BigDecimal getSvctax5Rates() {
		return svctax5Rates;
	}
	public void setSvctax5Rates(BigDecimal svctax5Rates) {
		this.svctax5Rates = svctax5Rates;
	}
	public RoundModeEnum getRoundMode() {
		return roundMode;
	}
	public void setRoundMode(RoundModeEnum roundMode) {
		this.roundMode = roundMode;
	}
	public int getScale() {
		return scale;
	}
	public void setScale(int scale) {
		this.scale = scale;
	}

	//房含net
	private Double pkgNet;
	public Double getPkgNet() {
		if(Objects.isNull(pkgNet)){
			return 0d;
		}
		return pkgNet;
	}
	public void setPkgNet(Double pkgNet) {
		this.pkgNet = pkgNet;
	}

	private Integer adultCnt; 
	private Integer childCnt;

	public Integer getAdultCnt() {
		if(Objects.isNull(adultCnt)){
			return 0;
		}
		return adultCnt;
	}
	public Integer getChildCnt() {
		if(Objects.isNull(childCnt)){
			return 0;
		}
		return childCnt;
	}
	public void setAdultCnt(Integer adultCnt) {
		this.adultCnt = adultCnt;
	}
	public void setChildCnt(Integer childCnt) {
		this.childCnt = childCnt;
	}
	//收费基准：0：无关，1：每房间；2：成人携儿童；3：每人（含儿童）；4：纯儿童
	private Map<String, String>  taxMap_str1;
	//是否阶梯：0：不是；1：是
	private Map<String, String>  taxMap_str2;

	public Map<String, String> getTaxMap_str1() {
		return taxMap_str1;
	}
	public Map<String, String> getTaxMap_str2() {
		return taxMap_str2;
	}
	public void setTaxMap_str1(Map<String, String> taxMap_str1) {
		this.taxMap_str1 = taxMap_str1;
	}
	public void setTaxMap_str2(Map<String, String> taxMap_str2) {
		this.taxMap_str2 = taxMap_str2;
	}
	
	//阶梯基准：价格
	private Map<String, String> taxMap_str3;
	//阶梯税 价格
	private Map<String,TreeMap<Double, BreakDownDiffDto>> taxMap_diff;
/*	//阶梯基准： 服务费税
	private Map<String, String> svcTaxMap_str3;
	//阶梯税  服务费税
	private LinkedHashMap<String,TreeMap<Double, BreakDownDiffDto>>  svcTaxMap_diff;*/

	public Map<String, String> getTaxMap_str3() {
		return taxMap_str3;
	}
	public Map<String, TreeMap<Double, BreakDownDiffDto>> getTaxMap_diff() {
		return taxMap_diff;
	}
	public void setTaxMap_str3(Map<String, String> taxMap_str3) {
		this.taxMap_str3 = taxMap_str3;
	}
	public void setTaxMap_diff(Map<String, TreeMap<Double, BreakDownDiffDto>> taxMap_diff) {
		this.taxMap_diff = taxMap_diff;
	}
	//包含税
	private Set<String> taxFields = new HashSet<>();
	public Set<String> getTaxFields() {
		return taxFields;
	}
	public void setTaxFields(Set<String> taxFields) {
		this.taxFields = taxFields;
	}
	
	
	//收费方式/阶梯①收费方式：0固定金额；1百分比
	private Map<String, String> taxMap_str5 ;

	public Map<String, String> getTaxMap_str5() {
		return taxMap_str5;
	}
	public void setTaxMap_str5(Map<String, String> taxMap_str5) {
		this.taxMap_str5 = taxMap_str5;
	}
}
