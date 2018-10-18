/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto.rate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.Size;

import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.ConstantRate.ENUM_PACKAGE_FLG;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;
import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * 
 * ## 类说明：
 * 	房含
 * @author    [mdz]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rate
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月30日|mdz|新增|CalcPackageDto.java新增
 */
@DrptDto(dtonm = "CalcPackage",dtodrpt="房含dto")
public class CalcPackage  implements Cloneable, java.io.Serializable  {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5510236336711231754L;			
	@DrptField(fieldnm="packageId",fielddrpt="房含id")
	private Integer packageId;

	@DrptField(fieldnm="pkgchargeFlg",fielddrpt="房含加收标记")
	private String pkgchargeFlg;
	@DrptField(fieldnm="quantity",fielddrpt="房含数量")
	private Integer quantity;
	
	@DrptField(fieldnm="price",fielddrpt="房含价格")
	private BigDecimal price;
	@DrptField(fieldnm = "allowanceAmt", fielddrpt = "抛账金额 同上", nullable = "true", length = "16")
	private BigDecimal allowanceAmt;
	@DrptField(fieldnm = "frequency", fielddrpt = "次数 同上", nullable = "true", length = "10")
	private Integer frequency;
	
	@DrptField(fieldnm = "bucket2Price", fielddrpt = "价格 同上", nullable = "true", length = "16")
	private BigDecimal bucket2Price;
	@DrptField(fieldnm = "bucket2AllowanceAmt", fielddrpt = "抛账金额 同上", nullable = "true", length = "16")
	private BigDecimal bucket2AllowanceAmt;
	@DrptField(fieldnm = "bucket2Frequency", fielddrpt = "次数 同上", nullable = "true", length = "10")
	private Integer bucket2Frequency;
	
	@DrptField(fieldnm = "bucket3Price", fielddrpt = "价格 同上", nullable = "true", length = "16")
	private BigDecimal bucket3Price;
	@DrptField(fieldnm = "bucket3AllowanceAmt", fielddrpt = "抛账金额 同上", nullable = "true", length = "16")
	private BigDecimal bucket3AllowanceAmt;
	@DrptField(fieldnm = "bucket3Frequency", fielddrpt = "次数 同上", nullable = "true", length = "10")
	private Integer bucket3Frequency;
	
	@DrptField(fieldnm = "bucket4Price", fielddrpt = "价格 同上", nullable = "true", length = "16")
	private BigDecimal bucket4Price;
	@DrptField(fieldnm = "bucket4AllowanceAmt", fielddrpt = "抛账金额 同上", nullable = "true", length = "16")
	private BigDecimal bucket4AllowanceAmt;
	@DrptField(fieldnm = "bucket4Frequency", fielddrpt = "次数 同上", nullable = "true", length = "10")
	private Integer bucket4Frequency;
	
	@DrptField(fieldnm = "bucket5Price", fielddrpt = "价格 同上", nullable = "true", length = "16")
	private BigDecimal bucket5Price;
	@DrptField(fieldnm = "bucket5AllowanceAmt", fielddrpt = "抛账金额 同上", nullable = "true", length = "16")
	private BigDecimal bucket5AllowanceAmt;
	@DrptField(fieldnm = "bucket5Frequency", fielddrpt = "次数 同上", nullable = "true", length = "10")
	private Integer bucket5Frequency;
	@DrptField(fieldnm="pkggroupId",fielddrpt="房含分组")
	private Integer pkggroupId;
	@DrptField(fieldnm="pkgFlg",fielddrpt="房含标志")
	private String pkgFlg;
	@DrptField(fieldnm="orgQuantity",fielddrpt="原始数量")
	private Integer orgQuantity;
	@DrptField(fieldnm="productId",fielddrpt="消费品id")
	private Integer productId;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "pkgStd", fielddrpt = "收费基准 1：每房间，2：每人，3：每成人，4：每儿童，5：每账户", nullable = "true", length = "3")
	@Size(max=3)
	private String pkgStd;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "pkgfolioFlg", fielddrpt = "账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	@Size(max=3)
	private String pkgfolioFlg;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "postRhythm", fielddrpt = "过费方式 1：每天过费，2：第一天过", nullable = "true", length = "3")
	@Size(max=3)
	private String postRhythm;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "addonFlg", fielddrpt = "自定义价格可用", nullable = "true", length = "3")
	@Size(max=3)
	private String addonFlg;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "allowanceFlg", fielddrpt = "可自定义抛账金额", nullable = "true", length = "3")
	@Size(max=3)
	private String allowanceFlg;
	
	@DrptField(fieldnm = "fromDay", fielddrpt = "从第几天开始", nullable = "true", length = "10")
	private Integer fromDay;
	
	@DrptField(fieldnm = "everyDay", fielddrpt = "每几天收取", nullable = "true", length = "10")
	private Integer everyDay;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "day1", fielddrpt = "星期一", nullable = "true", length = "3")
	@Size(max=3)
	private String day1;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "day2", fielddrpt = "星期二", nullable = "true", length = "3")
	@Size(max=3)
	private String day2;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "day3", fielddrpt = "星期三", nullable = "true", length = "3")
	@Size(max=3)
	private String day3;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "day4", fielddrpt = "星期四", nullable = "true", length = "3")
	@Size(max=3)
	private String day4;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "day5", fielddrpt = "星期五", nullable = "true", length = "3")
	@Size(max=3)
	private String day5;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "day6", fielddrpt = "星期六", nullable = "true", length = "3")
	@Size(max=3)
	private String day6;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "day7", fielddrpt = "星期日", nullable = "true", length = "3")
	@Size(max=3)
	private String day7;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date1", fielddrpt = "1日", nullable = "true", length = "3")
	@Size(max=3)
	private String date1;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date2", fielddrpt = "2日", nullable = "true", length = "3")
	@Size(max=3)
	private String date2;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date3", fielddrpt = "3日", nullable = "true", length = "3")
	@Size(max=3)
	private String date3;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date4", fielddrpt = "4日", nullable = "true", length = "3")
	@Size(max=3)
	private String date4;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date5", fielddrpt = "5日", nullable = "true", length = "3")
	@Size(max=3)
	private String date5;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date6", fielddrpt = "6日", nullable = "true", length = "3")
	@Size(max=3)
	private String date6;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date7", fielddrpt = "7日", nullable = "true", length = "3")
	@Size(max=3)
	private String date7;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date8", fielddrpt = "8日", nullable = "true", length = "3")
	@Size(max=3)
	private String date8;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date9", fielddrpt = "9日", nullable = "true", length = "3")
	@Size(max=3)
	private String date9;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date10", fielddrpt = "10日", nullable = "true", length = "3")
	@Size(max=3)
	private String date10;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date11", fielddrpt = "11日", nullable = "true", length = "3")
	@Size(max=3)
	private String date11;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date12", fielddrpt = "12日", nullable = "true", length = "3")
	@Size(max=3)
	private String date12;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date13", fielddrpt = "13日", nullable = "true", length = "3")
	@Size(max=3)
	private String date13;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date14", fielddrpt = "14日", nullable = "true", length = "3")
	@Size(max=3)
	private String date14;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date15", fielddrpt = "15日", nullable = "true", length = "3")
	@Size(max=3)
	private String date15;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date16", fielddrpt = "16日", nullable = "true", length = "3")
	@Size(max=3)
	private String date16;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date17", fielddrpt = "17日", nullable = "true", length = "3")
	@Size(max=3)
	private String date17;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date18", fielddrpt = "18日", nullable = "true", length = "3")
	@Size(max=3)
	private String date18;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date19", fielddrpt = "19日", nullable = "true", length = "3")
	@Size(max=3)
	private String date19;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date20", fielddrpt = "20日", nullable = "true", length = "3")
	@Size(max=3)
	private String date20;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date21", fielddrpt = "21日", nullable = "true", length = "3")
	@Size(max=3)
	private String date21;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date22", fielddrpt = "22日", nullable = "true", length = "3")
	@Size(max=3)
	private String date22;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date23", fielddrpt = "23日", nullable = "true", length = "3")
	@Size(max=3)
	private String date23;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date24", fielddrpt = "24日", nullable = "true", length = "3")
	@Size(max=3)
	private String date24;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date25", fielddrpt = "25日", nullable = "true", length = "3")
	@Size(max=3)
	private String date25;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date26", fielddrpt = "26日", nullable = "true", length = "3")
	@Size(max=3)
	private String date26;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date27", fielddrpt = "27日", nullable = "true", length = "3")
	@Size(max=3)
	private String date27;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date28", fielddrpt = "28日", nullable = "true", length = "3")
	@Size(max=3)
	private String date28;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date29", fielddrpt = "29日", nullable = "true", length = "3")
	@Size(max=3)
	private String date29;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date30", fielddrpt = "30日", nullable = "true", length = "3")
	@Size(max=3)
	private String date30;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "date31", fielddrpt = "31日", nullable = "true", length = "3")
	@Size(max=3)
	private String date31;
	//来期
	private Date arrDt;
	@DrptField(fieldnm = "pkgfixFlg", fielddrpt = "房含项目固定", nullable = "true", length = "3")
	private String pkgfixFlg;
	@DrptField(fieldnm = "fixedrateFlg", fielddrpt = "影响Fixed Rate", nullable = "true", length = "3")
	private String fixedrateFlg;
	@DrptField(fieldnm = "redemptionFlg", fielddrpt = "积分兑换项目", nullable = "true", length = "3")
	private String redemptionFlg;
	@DrptField(fieldnm = "productFlg", fielddrpt = "房含属性", nullable = "true", length = "3")
	private String productFlg;
	@DrptField(fieldnm = "auditTyp", fielddrpt = "记账方式", nullable = "true", length = "3")
	private String auditTyp;

	
	
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public String getPkgchargeFlg() {
		return pkgchargeFlg;
	}
	public void setPkgchargeFlg(String pkgchargeFlg) {
		this.pkgchargeFlg = pkgchargeFlg;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getAllowanceAmt() {
		return allowanceAmt;
	}
	public void setAllowanceAmt(BigDecimal allowanceAmt) {
		this.allowanceAmt = allowanceAmt;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	
	public BigDecimal getBucket2Price() {
		return bucket2Price;
	}
	public void setBucket2Price(BigDecimal bucket2Price) {
		this.bucket2Price = bucket2Price;
	}
	public BigDecimal getBucket2AllowanceAmt() {
		return bucket2AllowanceAmt;
	}
	public void setBucket2AllowanceAmt(BigDecimal bucket2AllowanceAmt) {
		this.bucket2AllowanceAmt = bucket2AllowanceAmt;
	}
	public Integer getBucket2Frequency() {
		return bucket2Frequency;
	}
	public void setBucket2Frequency(Integer bucket2Frequency) {
		this.bucket2Frequency = bucket2Frequency;
	}
	
	public BigDecimal getBucket3Price() {
		return bucket3Price;
	}
	public void setBucket3Price(BigDecimal bucket3Price) {
		this.bucket3Price = bucket3Price;
	}
	public BigDecimal getBucket3AllowanceAmt() {
		return bucket3AllowanceAmt;
	}
	public void setBucket3AllowanceAmt(BigDecimal bucket3AllowanceAmt) {
		this.bucket3AllowanceAmt = bucket3AllowanceAmt;
	}
	public Integer getBucket3Frequency() {
		return bucket3Frequency;
	}
	public void setBucket3Frequency(Integer bucket3Frequency) {
		this.bucket3Frequency = bucket3Frequency;
	}
	
	public BigDecimal getBucket4Price() {
		return bucket4Price;
	}
	public void setBucket4Price(BigDecimal bucket4Price) {
		this.bucket4Price = bucket4Price;
	}
	public BigDecimal getBucket4AllowanceAmt() {
		return bucket4AllowanceAmt;
	}
	public void setBucket4AllowanceAmt(BigDecimal bucket4AllowanceAmt) {
		this.bucket4AllowanceAmt = bucket4AllowanceAmt;
	}
	public Integer getBucket4Frequency() {
		return bucket4Frequency;
	}
	public void setBucket4Frequency(Integer bucket4Frequency) {
		this.bucket4Frequency = bucket4Frequency;
	}
	
	public BigDecimal getBucket5Price() {
		return bucket5Price;
	}
	public void setBucket5Price(BigDecimal bucket5Price) {
		this.bucket5Price = bucket5Price;
	}
	public BigDecimal getBucket5AllowanceAmt() {
		return bucket5AllowanceAmt;
	}
	public void setBucket5AllowanceAmt(BigDecimal bucket5AllowanceAmt) {
		this.bucket5AllowanceAmt = bucket5AllowanceAmt;
	}
	public Integer getBucket5Frequency() {
		return bucket5Frequency;
	}
	public void setBucket5Frequency(Integer bucket5Frequency) {
		this.bucket5Frequency = bucket5Frequency;
	}
	public Integer getPkggroupId() {
		return pkggroupId;
	}
	public void setPkggroupId(Integer pkggroupId) {
		this.pkggroupId = pkggroupId;
	}
	public String getPkgFlg() {
	/*	if(StringUtils.isEmpty(pkgFlg)){
			return ENUM_PACKAGE_FLG.NONHAS_VALID.getValue();
		}*/
		return pkgFlg;
	}
	public Integer getOrgQuantity() {
		return orgQuantity;
	}
	public void setPkgFlg(String pkgFlg) {
		this.pkgFlg = pkgFlg;
	}
	public void setOrgQuantity(Integer orgQuantity) {
		this.orgQuantity = orgQuantity;
	}
	@Override
	public String toString() {
		return "CalcPackage [packageId=" + packageId + ", quantity=" + quantity + ", pkgFlg=" + pkgFlg
				+ ", orgQuantity=" + orgQuantity + "]";
	}
	public String getPkgStd() {
		return pkgStd;
	}
	public String getPkgfolioFlg() {
		return pkgfolioFlg;
	}
	public String getPostRhythm() {
		return postRhythm;
	}
	public String getAddonFlg() {
		return addonFlg;
	}
	public String getAllowanceFlg() {
		return allowanceFlg;
	}
	public Integer getFromDay() {
		return fromDay;
	}
	public Integer getEveryDay() {
		return everyDay;
	}
	public String getDay1() {
		return day1;
	}
	public String getDay2() {
		return day2;
	}
	public String getDay3() {
		return day3;
	}
	public String getDay4() {
		return day4;
	}
	public String getDay5() {
		return day5;
	}
	public String getDay6() {
		return day6;
	}
	public String getDay7() {
		return day7;
	}
	public String getDate1() {
		return date1;
	}
	public String getDate2() {
		return date2;
	}
	public String getDate3() {
		return date3;
	}
	public String getDate4() {
		return date4;
	}
	public String getDate5() {
		return date5;
	}
	public String getDate6() {
		return date6;
	}
	public String getDate7() {
		return date7;
	}
	public String getDate8() {
		return date8;
	}
	public String getDate9() {
		return date9;
	}
	public String getDate10() {
		return date10;
	}
	public String getDate11() {
		return date11;
	}
	public String getDate12() {
		return date12;
	}
	public String getDate13() {
		return date13;
	}
	public String getDate14() {
		return date14;
	}
	public String getDate15() {
		return date15;
	}
	public String getDate16() {
		return date16;
	}
	public String getDate17() {
		return date17;
	}
	public String getDate18() {
		return date18;
	}
	public String getDate19() {
		return date19;
	}
	public String getDate20() {
		return date20;
	}
	public String getDate21() {
		return date21;
	}
	public String getDate22() {
		return date22;
	}
	public String getDate23() {
		return date23;
	}
	public String getDate24() {
		return date24;
	}
	public String getDate25() {
		return date25;
	}
	public String getDate26() {
		return date26;
	}
	public String getDate27() {
		return date27;
	}
	public String getDate28() {
		return date28;
	}
	public String getDate29() {
		return date29;
	}
	public String getDate30() {
		return date30;
	}
	public String getDate31() {
		return date31;
	}
	public void setPkgStd(String pkgStd) {
		this.pkgStd = pkgStd;
	}
	public void setPkgfolioFlg(String pkgfolioFlg) {
		this.pkgfolioFlg = pkgfolioFlg;
	}
	public void setPostRhythm(String postRhythm) {
		this.postRhythm = postRhythm;
	}
	public void setAddonFlg(String addonFlg) {
		this.addonFlg = addonFlg;
	}
	public void setAllowanceFlg(String allowanceFlg) {
		this.allowanceFlg = allowanceFlg;
	}
	public void setFromDay(Integer fromDay) {
		this.fromDay = fromDay;
	}
	public void setEveryDay(Integer everyDay) {
		this.everyDay = everyDay;
	}
	public void setDay1(String day1) {
		this.day1 = day1;
	}
	public void setDay2(String day2) {
		this.day2 = day2;
	}
	public void setDay3(String day3) {
		this.day3 = day3;
	}
	public void setDay4(String day4) {
		this.day4 = day4;
	}
	public void setDay5(String day5) {
		this.day5 = day5;
	}
	public void setDay6(String day6) {
		this.day6 = day6;
	}
	public void setDay7(String day7) {
		this.day7 = day7;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public void setDate3(String date3) {
		this.date3 = date3;
	}
	public void setDate4(String date4) {
		this.date4 = date4;
	}
	public void setDate5(String date5) {
		this.date5 = date5;
	}
	public void setDate6(String date6) {
		this.date6 = date6;
	}
	public void setDate7(String date7) {
		this.date7 = date7;
	}
	public void setDate8(String date8) {
		this.date8 = date8;
	}
	public void setDate9(String date9) {
		this.date9 = date9;
	}
	public void setDate10(String date10) {
		this.date10 = date10;
	}
	public void setDate11(String date11) {
		this.date11 = date11;
	}
	public void setDate12(String date12) {
		this.date12 = date12;
	}
	public void setDate13(String date13) {
		this.date13 = date13;
	}
	public void setDate14(String date14) {
		this.date14 = date14;
	}
	public void setDate15(String date15) {
		this.date15 = date15;
	}
	public void setDate16(String date16) {
		this.date16 = date16;
	}
	public void setDate17(String date17) {
		this.date17 = date17;
	}
	public void setDate18(String date18) {
		this.date18 = date18;
	}
	public void setDate19(String date19) {
		this.date19 = date19;
	}
	public void setDate20(String date20) {
		this.date20 = date20;
	}
	public void setDate21(String date21) {
		this.date21 = date21;
	}
	public void setDate22(String date22) {
		this.date22 = date22;
	}
	public void setDate23(String date23) {
		this.date23 = date23;
	}
	public void setDate24(String date24) {
		this.date24 = date24;
	}
	public void setDate25(String date25) {
		this.date25 = date25;
	}
	public void setDate26(String date26) {
		this.date26 = date26;
	}
	public void setDate27(String date27) {
		this.date27 = date27;
	}
	public void setDate28(String date28) {
		this.date28 = date28;
	}
	public void setDate29(String date29) {
		this.date29 = date29;
	}
	public void setDate30(String date30) {
		this.date30 = date30;
	}
	public void setDate31(String date31) {
		this.date31 = date31;
	}
	public Date getArrDt() {
		return arrDt;
	}
	public void setArrDt(Date arrDt) {
		this.arrDt = arrDt;
	}
	//是否新建  用于判断是否使用系统配置价格
	private Boolean isNew = false;
	public Boolean getIsNew() {
		return isNew;
	}
	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}
	//是否删除
	private Boolean isDel = false;
	public Boolean getIsDel() {
		return isDel;
	}
	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}
	public String getPkgfixFlg() {
		return pkgfixFlg;
	}
	public String getFixedrateFlg() {
		return fixedrateFlg;
	}
	public String getRedemptionFlg() {
		return redemptionFlg;
	}
	public String getProductFlg() {
		return productFlg;
	}
	public String getAuditTyp() {
		return auditTyp;
	}
	public void setPkgfixFlg(String pkgfixFlg) {
		this.pkgfixFlg = pkgfixFlg;
	}
	public void setFixedrateFlg(String fixedrateFlg) {
		this.fixedrateFlg = fixedrateFlg;
	}
	public void setRedemptionFlg(String redemptionFlg) {
		this.redemptionFlg = redemptionFlg;
	}
	public void setProductFlg(String productFlg) {
		this.productFlg = productFlg;
	}
	public void setAuditTyp(String auditTyp) {
		this.auditTyp = auditTyp;
	}
	//当前数据库数据
	private Map<String, Object> map;
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	
	
}
