/**   
* @Title: CrsAccountPackageDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月17日 下午6:21:31 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年8月17日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月17日|yingw|新增|CrsAccountPackageDto.java新增
*/
public class CrsAccountPackageDto implements java.io.Serializable {
   
    private static final long serialVersionUID = -8472683225366575118L;

    @DrptField(fieldnm="packageId",fielddrpt="房含项目ID",paramtype=ConstantParm.ENUM_PARA_TYPE.COMMON_PARA, 
            paramsubtype=ConstantParm.PARA_PACKAGE,logged = ENUM_LOGGED.YES)
    private Integer packageId;
    
    @DrptField(fieldnm="packageCd",fielddrpt="房含编码",logged = ENUM_LOGGED.YES)
    private String packageCd;
    
    @DrptField(fieldnm="packageNm",fielddrpt="房含名称",logged = ENUM_LOGGED.YES)
    private String packageNm;
    
    @DrptField(fieldnm="packageDrpt",fielddrpt="房含描述",logged = ENUM_LOGGED.YES)
    private String packageDrpt;
    
    @DrptField(fieldnm="quantity",fielddrpt="数量",logged = ENUM_LOGGED.YES)
    private Integer quantity;
    
    @DrptField(fieldnm="pkgchargeFlg",fielddrpt="收费标识",logged = ENUM_LOGGED.YES)
    private String pkgchargeFlg;
    
    @DrptField(fieldnm="price",fielddrpt="金额",logged = ENUM_LOGGED.YES)
    private BigDecimal price;
    
    /** 剩余抛账金额 **/
    @DrptField(fieldnm="allowanceAmt",fielddrpt="抛账金额")
    private BigDecimal allowanceAmt;
    
    /** 剩余次数 **/
    @DrptField(fieldnm="frequency",fielddrpt="次数")
    private Integer frequency;
    
    /** 价格 age_group2价格 **/
    @DrptField(fieldnm="bucket2Price",fielddrpt="价格2")
    private BigDecimal bucket2Price;
    
    @DrptField(fieldnm="bucket2AllowanceAmt",fielddrpt="抛账金额 2")
    private BigDecimal bucket2AllowanceAmt;
    
    @DrptField(fieldnm="bucket2Frequency",fielddrpt="次数2")
    private Integer bucket2Frequency;
    
    /** 价格 age_group3价格 **/
    @DrptField(fieldnm="bucket3Price",fielddrpt="价格3")
    private BigDecimal bucket3Price;
    
    @DrptField(fieldnm="bucket3AllowanceAmt",fielddrpt="抛账金额3")
    private BigDecimal bucket3AllowanceAmt;
    
    @DrptField(fieldnm="bucket3Frequency",fielddrpt="次数3")
    private Integer bucket3Frequency;
    
    /** 价格 age_group4价格 **/
    @DrptField(fieldnm="bucket4Price",fielddrpt="价格4")
    private BigDecimal bucket4Price;
    
    @DrptField(fieldnm="bucket4AllowanceAmt",fielddrpt="抛账金额4")
    private BigDecimal bucket4AllowanceAmt;
    
    @DrptField(fieldnm="bucket4Frequency",fielddrpt="次数4")
    private Integer bucket4Frequency;
    
    /** 价格 age_group5价格 **/
    @DrptField(fieldnm="bucket5Price",fielddrpt="价格5")
    private BigDecimal bucket5Price;
    
    @DrptField(fieldnm="bucket5AllowanceAmt",fielddrpt="抛账金额5")
    private BigDecimal bucket5AllowanceAmt;
    
    @DrptField(fieldnm="bucket5Frequency",fielddrpt="次数5")
    private Integer bucket5Frequency;
    
    @DrptField(fieldnm="packageFlg",fielddrpt="房含标示")
    private String packageFlg;
    
    @DrptField(fieldnm="statusFlg",fielddrpt="有效无效")
    private String statusFlg;
    
    
    
    @DrptField(fieldnm="drptMap",fielddrpt="所有描述信息")
    private Map<String,String> drptMap = new HashMap<>();
    
    public CrsAccountPackageDto() {
        drptMap.put("packageCd", null);
        drptMap.put("packageNm", null);
        drptMap.put("packageDrpt", null);
        drptMap.put("pkgchargeFlg", null);
    }
    public Map<String, String> getDrptMap() {
        return drptMap;
    }
    public void setDrptMap(Map<String, String> drptMap) {
        this.drptMap = drptMap;
    }
    public Integer getPackageId() {
        return packageId;
    }
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }
    public String getPackageCd() {
        return packageCd;
    }
    public void setPackageCd(String packageCd) {
        this.packageCd = packageCd;
    }
    public String getPackageNm() {
        return packageNm;
    }
    public void setPackageNm(String packageNm) {
        this.packageNm = packageNm;
    }
    public String getPackageDrpt() {
        return packageDrpt;
    }
    public void setPackageDrpt(String packageDrpt) {
        this.packageDrpt = packageDrpt;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPkgchargeFlg() {
        return pkgchargeFlg;
    }
    public void setPkgchargeFlg(String pkgchargeFlg) {
        this.pkgchargeFlg = pkgchargeFlg;
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
    public String getPackageFlg() {
        return packageFlg;
    }
    public void setPackageFlg(String packageFlg) {
        this.packageFlg = packageFlg;
    }
    @DrptField(fieldnm="postRhythm",fielddrpt="过费方式 1：每天过费，2：第一天过")
    private String postRhythm;

    public String getPostRhythm() {
        return postRhythm;
    }
    public void setPostRhythm(String postRhythm) {
        this.postRhythm = postRhythm;
    }
    
    @DrptField(fieldnm="pkgStd",fielddrpt="收费基准")
    private String pkgStd;

    public String getPkgStd() {
        return pkgStd;
    }
    public void setPkgStd(String pkgStd) {
        this.pkgStd = pkgStd;
    }
    
    public String getStatusFlg() {
        return statusFlg;
    }
    public void setStatusFlg(String statusFlg) {
        this.statusFlg = statusFlg;
    }
    
}
