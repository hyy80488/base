
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3220.f010.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * 
 * ## 类说明：
 * 	单一账户dto
 * @author    [zhangteng]   
 * @version   [V1.0, 2017年4月21日]
 * @package com.jw.hms.pms.m3240.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月21日|zhangteng|新增|AccountDetailDto.java新增
 */
public class AccountDetailDto extends ResponseBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1350256514859389368L;
	/** 应收名称  **/
	@DrptField(fieldnm="arNm",fielddrpt="应收名称")
	private String arNm;
	/** 应收账号  **/
	@DrptField(fieldnm="arNo",fielddrpt="应收账号")
	private String arNo;
	/** 接口备注  **/
	@DrptField(fieldnm="interfaceMemo",fielddrpt="接口备注")
	private String interfaceMemo;
	/** 消费限额  **/
	@DrptField(fieldnm="consumptionLimit",fielddrpt="消费限额")
	private BigDecimal consumptionLimit;
	
	/** 预订账号  **/
	@DrptField(fieldnm="acctNo",fielddrpt="预订账号")
	private String acctNo;
	/** 预订号  **/
	@DrptField(fieldnm="resvNo",fielddrpt="预订号")
	private String resvNo;
	/** 合住号  **/
	@DrptField(fieldnm="shareSeq",fielddrpt="合住号")
	private String shareSeq;
	/** 关联预定号 考虑PMS或CRS系统内订单关联。比如某些原因必须拆分订单 **/
	@DrptField(fieldnm="linkAcctNo",fielddrpt="关联预定号")
	private String linkAcctNo;
	/** 账户状态 RSV：预订；STY：在店；OUT：已离；CXL：取消；NSW：no show；WAT：等候；WAC：等候取消；？？？作废 GRP：团队主单 **/
	@DrptField(fieldnm="acctStus",fielddrpt="账户状态 ",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.RSV_ACCOUNT_ACCT_STUS)
	private String acctStus;
	/** 担保标识 0：无担保，1：有担保 **/
	@DrptField(fieldnm="guaranteeFlg",fielddrpt="担保标识",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.RSV_ACCOUNT_GUARANTEE_FLG)
	private String guaranteeFlg;
	/** 团散区分 I：散客，G：团队 **/
	@DrptField(fieldnm="igFlg",fielddrpt="团散区分",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.RSV_ACCOUNT_IG_FLG)
	private String igFlg;
	/** 团队标识 团队标志 ‘1’：标准团 ‘2’：会议团 **/
	@DrptField(fieldnm="groupFlg",fielddrpt="团队标识",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.RSV_ACCOUNT_GROUP_FLG)
	private String groupFlg;
	@DrptField(fieldnm="acctTyp",fielddrpt="账户类型",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.RSV_ACCOUNT_ACCT_TYP)
	private String acctTyp;
	/** 团队号  **/
	@DrptField(fieldnm="groupNo",fielddrpt="团队号")
	private String groupNo;
	/** 团队类型 ‘1’：挂帐 ‘2’：零余额（电话、商务中心）‘3’：待结帐户 **/
	@DrptField(fieldnm="groupTyp",fielddrpt="团队类型 ",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.RSV_ACCOUNT_GROUP_TYP)
	private String groupTyp;
	/** 团队状态 团队状态 1．Offer 2.option 3.initial(明确) 4.open 宾客时：grp_stus为已发送过户籍 1:开房已发送，2：离店已经发送 **/
	@DrptField(fieldnm="groupStus",fielddrpt="团队状态",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.RSV_ACCOUNT_GROUP_STUS)
	private String groupStus;
	/**	客人姓名	*/
	@DrptField(fieldnm="guestName",fielddrpt="客人姓名")
	private String guestName;
	/**	姓名/别名	*/
	@DrptField(fieldnm="altNm",fielddrpt="姓名/别名")
	private String altNm;
	/**	房间号	*/
	@DrptField(fieldnm="roomNum",fielddrpt="房间号")
	private String roomNum;
	/**	住店人ID	*/
	@DrptField(fieldnm="reguestId",fielddrpt="住店人ID")
	private String reguestId;
	/**	同住人	*/
	@DrptField(fieldnm="stayWithNames",fielddrpt="同住人")
	private String stayWithNames;
	/**	协议单位	*/
	@DrptField(fieldnm="negoCorpName",fielddrpt="协议单位")
	private String negoCorpName;
	/**	协议单位No	*/
	@DrptField(fieldnm="negoCorpNo",fielddrpt="协议单位No")
	private String negoCorpNo;
	/**	团队	*/
	@DrptField(fieldnm="groupNm",fielddrpt="团队")
	private String groupNm;
	/**	价格名称	*/
	@DrptField(fieldnm="rateNm",fielddrpt="价格名称")
	private String rateNm;
	/**	消费项目	*/
	@DrptField(fieldnm="productNm",fielddrpt="消费项目")
	private String productNm;
	/**	消费项目ID	*/
	@DrptField(fieldnm="productId",fielddrpt="消费项目ID")
	private List<Integer> productId;
	/**	房价	*/
	@DrptField(fieldnm="rateAmt",fielddrpt="房价")
	private String rateAmt;
	/**	来期	*/
	@DrptField(fieldnm="arrDateTime",fielddrpt="来期")
	private String arrDateTime;
	/**	离期	*/
	@DrptField(fieldnm="dptDateTime",fielddrpt="离期")
	private String dptDateTime;
	/**	付款方式	*/
	@DrptField(fieldnm="ratepaymentMethod",fielddrpt="付款方式")
	private String ratepaymentMethod;
	/** 付款方式Id	*/
	@DrptField(fieldnm="paymentmethodId",fielddrpt="付款方式Id")
	private Integer paymentmethodId;
	/** 价格代码版本号 **/
	@DrptField(fieldnm="rateVer",fielddrpt="价格代码版本号")
	private String rateVer;
	/** 价格代码  **/
	@DrptField(fieldnm="rateId",fielddrpt="价格代码 ")
	private Integer rateId;
	/** 账单显示内容  **/
	@DrptField(fieldnm="folioDrpt",fielddrpt=" 账单显示内容")
	private String folioDrpt;
	/**	楼区 id */
	@DrptField(fieldnm="areaId",fielddrpt="楼区 id")
	private Integer areaId;
	/**	楼区  描述 */
	@DrptField(fieldnm="areaDrpt",fielddrpt="楼区  描述")
	private String areaDrpt;
	/** 账页 **/
	@DrptField(fieldnm="pages",fielddrpt="账页")
	private List<String> pages;
	/** 原始房型 **/
	@DrptField(fieldnm="orgroomtypId",fielddrpt="原始房型")
	private Integer orgroomtypId;
	/** 销售房型 **/
	@DrptField(fieldnm="saleroomtypId",fielddrpt="销售房型")
	private Integer saleroomtypId;
	/** 物理房型 **/
	@DrptField(fieldnm="roomtypId",fielddrpt="物理房型")
	private Integer roomtypId;
	/** 房型名称**/
	@DrptField(fieldnm="roomtypDrpt",fielddrpt="房型名称")
	private String roomtypDrpt;
	/** 关联价格代码 **/
	@DrptField(fieldnm="rerateId",fielddrpt="关联价格代码")
	private Integer rerateId;
	/** 基础价格代码 **/
	@DrptField(fieldnm="baserateId",fielddrpt="基础价格代码")
	private Integer baserateId;
	/** 关联价格代码版本号 **/
	@DrptField(fieldnm="rerateVer",fielddrpt="关联价格代码版本号")
	private Integer rerateVer;
	/** 基础价格代码版本号 **/
	@DrptField(fieldnm="baserateVer",fielddrpt="基础价格代码版本号")
	private Integer baserateVer;
	/** 成人数 **/
	@DrptField(fieldnm="adultCnt",fielddrpt="adultCnt")
	private Integer adultCnt;
	/** 儿童数 **/
	@DrptField(fieldnm="childrenCnt",fielddrpt="儿童数")
	private Integer childrenCnt;
	/** 假房标志 **/
	@DrptField(fieldnm="pseudoFlg",fielddrpt="假房标志")
	private String pseudoFlg;
	/** 预定备注 **/
	@DrptField(fieldnm="freememo",fielddrpt="预定备注 ")
	private String freememo;
	/** 时候计算房晚 Y：是  N：否 **/
	@DrptField(fieldnm="nightsFlg",fielddrpt="时候计算房晚",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_FIN_BASE_TRNCODE_NIGHTS_FLG)
	private Integer nightsFlg;
	@DrptField(fieldnm = "hrendTm", fielddrpt = "钟点房结束日期和时间 ")
	private Date hrendTm;
	/** 1结束计时 **/
	@DrptField(fieldnm = "rendFlg", fielddrpt = "钟点房结束标志 ")
	private String rendFlg;
	/** 最大账页数 **/
	@DrptField(fieldnm="resultData",fielddrpt="最大账页数 ")
	private Integer maxPageNum;
	/** 客史编号 **/
	@DrptField(fieldnm="profileNo",fielddrpt="客账明细返回值")
	private String profileNo;
	/** 客史ID **/
	@DrptField(fieldnm="profileId",fielddrpt="客史ID")
	private Integer profileId;
	/** 版本号 **/
	@DrptField(fieldnm="version",fielddrpt="版本号")
	private Integer version;
	//预授权交易金额
	@DrptField(fieldnm="amt",fielddrpt="交易金额")
	private BigDecimal amt;
	@DrptField(fieldnm="stayTyp",fielddrpt="长包房标志")
	private String stayTyp;
	@DrptField(fieldnm="clockrmFlg",fielddrpt="钟点房标志")
	private String clockrmFlg;
	@DrptField(fieldnm="cohuFlg",fielddrpt="免费自用标识")
	private String cohuFlg;
	@DrptField(fieldnm="checkoutBdt",fielddrpt="离店日期")
	private Date checkoutBdt;
	
	@DrptField(fieldnm="dptpostFlg",fielddrpt="加收标识",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_FIN_BASE_TRNCODE_NIGHTS_FLG)
	private String dptpostFlg;
	
	@DrptField(fieldnm="debitAmt",fielddrpt="费用类汇总")
	private BigDecimal debitAmt;
	
	@DrptField(fieldnm="creditAmt",fielddrpt="付款类汇总")
	private BigDecimal creditAmt;

	@DrptField(fieldnm="memberNo",fielddrpt="会员号")
	private String memberNo;
	
	//1转出  2转入  3都有
	@DrptField(fieldnm="routingFlg",fielddrpt="转入转出标志")
	private String routingFlg;
	
	

	public String getRoutingFlg() {
		return routingFlg;
	}

	public void setRoutingFlg(String routingFlg) {
		this.routingFlg = routingFlg;
	}

	public String getAcctTyp() {
		return acctTyp;
	}

	public void setAcctTyp(String acctTyp) {
		this.acctTyp = acctTyp;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public BigDecimal getDebitAmt() {
		return debitAmt;
	}

	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}

	public BigDecimal getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}

	public Date getCheckoutBdt() {
		return checkoutBdt;
	}

	public void setCheckoutBdt(Date checkoutBdt) {
		this.checkoutBdt = checkoutBdt;
	}

	public String getDptpostFlg() {
		return dptpostFlg;
	}

	public void setDptpostFlg(String dptpostFlg) {
		this.dptpostFlg = dptpostFlg;
	}

	public String getRendFlg() {
		return rendFlg;
	}

	public void setRendFlg(String rendFlg) {
		this.rendFlg = rendFlg;
	}

	public Date getHrendTm() {
		return hrendTm;
	}

	public void setHrendTm(Date hrendTm) {
		this.hrendTm = hrendTm;
	}

	public String getCohuFlg() {
		return cohuFlg;
	}

	public void setCohuFlg(String cohuFlg) {
		this.cohuFlg = cohuFlg;
	}

	public String getStayTyp() {
		return stayTyp;
	}

	public void setStayTyp(String stayTyp) {
		this.stayTyp = stayTyp;
	}

	public String getClockrmFlg() {
		return clockrmFlg;
	}

	public void setClockrmFlg(String clockrmFlg) {
		this.clockrmFlg = clockrmFlg;
	}

	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getNegoCorpNo() {
		return negoCorpNo;
	}

	public void setNegoCorpNo(String negoCorpNo) {
		this.negoCorpNo = negoCorpNo;
	}

	public String getProfileNo() {
		return profileNo;
	}

	public void setProfileNo(String profileNo) {
		this.profileNo = profileNo;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getRoomtypDrpt() {
		return roomtypDrpt;
	}

	public void setRoomtypDrpt(String roomtypDrpt) {
		this.roomtypDrpt = roomtypDrpt;
	}

	public List<Integer> getProductId() {
		return productId;
	}

	public void setProductId(List<Integer> productId) {
		this.productId = productId;
	}

	public String getAltNm() {
		return altNm;
	}

	public void setAltNm(String altNm) {
		this.altNm = altNm;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}


	public Integer getNightsFlg() {
		return nightsFlg;
	}

	public void setNightsFlg(Integer nightsFlg) {
		this.nightsFlg = nightsFlg;
	}

	public Integer getMaxPageNum() {
		return maxPageNum;
	}

	public void setMaxPageNum(Integer maxPageNum) {
		this.maxPageNum = maxPageNum;
	}

	public String getFreememo() {
		return freememo;
	}

	public void setFreememo(String freememo) {
		this.freememo = freememo;
	}

	public String getPseudoFlg() {
		return pseudoFlg;
	}

	public void setPseudoFlg(String pseudoFlg) {
		this.pseudoFlg = pseudoFlg;
	}

	public Integer getOrgroomtypId() {
		return orgroomtypId;
	}

	public void setOrgroomtypId(Integer orgroomtypId) {
		this.orgroomtypId = orgroomtypId;
	}

	public Integer getSaleroomtypId() {
		return saleroomtypId;
	}

	public void setSaleroomtypId(Integer saleroomtypId) {
		this.saleroomtypId = saleroomtypId;
	}

	public Integer getRoomtypId() {
		return roomtypId;
	}

	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}

	public Integer getRerateId() {
		return rerateId;
	}

	public void setRerateId(Integer rerateId) {
		this.rerateId = rerateId;
	}

	public Integer getBaserateId() {
		return baserateId;
	}

	public void setBaserateId(Integer baserateId) {
		this.baserateId = baserateId;
	}

	public Integer getRerateVer() {
		return rerateVer;
	}

	public void setRerateVer(Integer rerateVer) {
		this.rerateVer = rerateVer;
	}

	public Integer getBaserateVer() {
		return baserateVer;
	}

	public void setBaserateVer(Integer baserateVer) {
		this.baserateVer = baserateVer;
	}

	public Integer getAdultCnt() {
		return adultCnt;
	}

	public void setAdultCnt(Integer adultCnt) {
		this.adultCnt = adultCnt;
	}

	public Integer getChildrenCnt() {
		return childrenCnt;
	}

	public void setChildrenCnt(Integer childrenCnt) {
		this.childrenCnt = childrenCnt;
	}

	public List<String> getPages() {
		return pages;
	}

	public void setPages(List<String> pages) {
		this.pages = pages;
	}

	public Integer getPaymentmethodId() {
		return paymentmethodId;
	}

	public void setPaymentmethodId(Integer paymentmethodId) {
		this.paymentmethodId = paymentmethodId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaDrpt() {
		return areaDrpt;
	}

	public void setAreaDrpt(String areaDrpt) {
		this.areaDrpt = areaDrpt;
	}

	public String getRateVer() {
		return rateVer;
	}

	public void setRateVer(String rateVer) {
		this.rateVer = rateVer;
	}


	public Integer getRateId() {
		return rateId;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	public String getFolioDrpt() {
		return folioDrpt;
	}



	public void setFolioDrpt(String folioDrpt) {
		this.folioDrpt = folioDrpt;
	}









	public String getAcctNo() {
		return acctNo;
	}





	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}





	public String getResvNo() {
		return resvNo;
	}





	public void setResvNo(String resvNo) {
		this.resvNo = resvNo;
	}





	public String getShareSeq() {
		return shareSeq;
	}





	public void setShareSeq(String shareSeq) {
		this.shareSeq = shareSeq;
	}





	public String getLinkAcctNo() {
		return linkAcctNo;
	}





	public void setLinkAcctNo(String linkAcctNo) {
		this.linkAcctNo = linkAcctNo;
	}





	public String getAcctStus() {
		return acctStus;
	}





	public void setAcctStus(String acctStus) {
		this.acctStus = acctStus;
	}





	public String getGuaranteeFlg() {
		return guaranteeFlg;
	}





	public void setGuaranteeFlg(String guaranteeFlg) {
		this.guaranteeFlg = guaranteeFlg;
	}





	public String getIgFlg() {
		return igFlg;
	}





	public void setIgFlg(String igFlg) {
		this.igFlg = igFlg;
	}





	public String getGroupFlg() {
		return groupFlg;
	}





	public void setGroupFlg(String groupFlg) {
		this.groupFlg = groupFlg;
	}





	public String getGroupNo() {
		return groupNo;
	}





	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}





	public String getGroupTyp() {
		return groupTyp;
	}





	public void setGroupTyp(String groupTyp) {
		this.groupTyp = groupTyp;
	}





	public String getGroupStus() {
		return groupStus;
	}





	public void setGroupStus(String groupStus) {
		this.groupStus = groupStus;
	}





	public String getGuestName() {
		return guestName;
	}





	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}





	public String getReguestId() {
		return reguestId;
	}





	public void setReguestId(String reguestId) {
		this.reguestId = reguestId;
	}





	public String getStayWithNames() {
		return stayWithNames;
	}





	public void setStayWithNames(String stayWithNames) {
		this.stayWithNames = stayWithNames;
	}





	public String getNegoCorpName() {
		return negoCorpName;
	}





	public void setNegoCorpName(String negoCorpName) {
		this.negoCorpName = negoCorpName;
	}










	public String getGroupNm() {
		return groupNm;
	}

	public void setGroupNm(String groupNm) {
		this.groupNm = groupNm;
	}

	public String getRateNm() {
		return rateNm;
	}





	public void setRateNm(String rateNm) {
		this.rateNm = rateNm;
	}





	public String getProductNm() {
		return productNm;
	}





	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}





	public String getRateAmt() {
		return rateAmt;
	}





	public void setRateAmt(String rateAmt) {
		this.rateAmt = rateAmt;
	}





	public String getArrDateTime() {
		return arrDateTime;
	}





	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}





	public String getDptDateTime() {
		return dptDateTime;
	}





	public void setDptDateTime(String dptDateTime) {
		this.dptDateTime = dptDateTime;
	}





	public String getRatepaymentMethod() {
		return ratepaymentMethod;
	}





	public void setRatepaymentMethod(String ratepaymentMethod) {
		this.ratepaymentMethod = ratepaymentMethod;
	}





	public String getInterfaceMemo() {
		return interfaceMemo;
	}

	public void setInterfaceMemo(String interfaceMemo) {
		this.interfaceMemo = interfaceMemo;
	}

	public BigDecimal getConsumptionLimit() {
		return consumptionLimit;
	}

	public void setConsumptionLimit(BigDecimal consumptionLimit) {
		this.consumptionLimit = consumptionLimit;
	}

	public String getArNm() {
		return arNm;
	}

	public void setArNm(String arNm) {
		this.arNm = arNm;
	}

	public String getArNo() {
		return arNo;
	}

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

