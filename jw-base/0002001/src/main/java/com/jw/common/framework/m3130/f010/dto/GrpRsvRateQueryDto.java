
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	价格表QUERY信息数据传输对象
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-05-09]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-05-09|zhangteng|新增|GrpRsvRateQueryDto新增
 */
@DrptDto(dtonm = "价格表QUERY信息数据传输对象", dtodrpt = "价格表QUERY信息数据传输对象")
public class GrpRsvRateQueryDto extends RequestBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/
	private static final long serialVersionUID = -8773995857533845303L;
	@DrptField(fieldnm = "orderColumn", fielddrpt = "排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	private Integer currentPage;
	@DrptField(fieldnm = "pageSize", fielddrpt = "每页记录数量")
	private Integer pageSize;

	@DrptField(fieldnm = "id", fielddrpt = "ID ID字段", nullable = "false", length = "10")
	private Integer id;

	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码 ", nullable = "false", length = "40")
	private String chainUid;

	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码 ", nullable = "false", length = "40")
	private String unitUid;

	@DrptField(fieldnm = "rateId", fielddrpt = "价格编码 ", nullable = "false", length = "10")
	private Integer rateId;

	@DrptField(fieldnm = "rateVer", fielddrpt = "价格版本 每次提交审批，都要复制一条未提交的数据，版本加一。一旦提交，版本不再变化", nullable = "false", length = "10")
	private Integer rateVer;

	@DrptField(fieldnm = "statusFlg", fielddrpt = "有效标识 0：无效；1：有效（默认）", nullable = "false", length = "1")
	private String statusFlg;

	@DrptField(fieldnm = "publishStus", fielddrpt = "发布状态 0：未提交（默认）；1：待审核；2：已发布", nullable = "false", length = "3")
	private String publishStus;

	@DrptField(fieldnm = "templateFlg", fielddrpt = "模板标识 0：模板；1：价格（默认）", nullable = "false", length = "3")
	private String templateFlg;

	@DrptField(fieldnm = "grpTemplateId", fielddrpt = "集团模板代码 使用集团价格的时候，价格模板的代码", nullable = "true", length = "10")
	private Integer grpTemplateId;

	@DrptField(fieldnm = "rateCd", fielddrpt = "价格代码 ", nullable = "false", length = "20")
	private String rateCd;

	@DrptField(fieldnm = "rateNm", fielddrpt = "价格名称 ", nullable = "true", length = "100")
	private String rateNm;

	@DrptField(fieldnm = "seq", fielddrpt = "序号 页面显示顺序", nullable = "true", length = "10")
	private Integer seq;

	@DrptField(fieldnm = "rerateId", fielddrpt = "关联价格代码 ", nullable = "true", length = "10")
	private Integer rerateId;

	@DrptField(fieldnm = "baserateId", fielddrpt = "基础价格 rate_flg=2、3时，对应的基础价格id", nullable = "true", length = "10")
	private Integer baserateId;

	@DrptField(fieldnm = "rategrpId", fielddrpt = "价格大分类 ", nullable = "false", length = "10")
	private Integer rategrpId;

	@DrptField(fieldnm = "ratesubgrpId", fielddrpt = "价格小分类 ", nullable = "false", length = "10")
	private Integer ratesubgrpId;

	@DrptField(fieldnm = "rateFlg", fielddrpt = "价格属性 1：基础价格；2：Bar价；3：销售策略；一期无3：销售策略；界面不显示；", nullable = "false", length = "3")
	private String rateFlg;

	@DrptField(fieldnm = "rateTyp", fielddrpt = "价格类型 0：门市价；1：普通价（默认）；？：成本价；。同一酒店只能有一套成本价和门市价；门市价、成本价只能是基础价格", nullable = "false", length = "3")
	private String rateTyp;

	@DrptField(fieldnm = "rateStd", fielddrpt = "房费价格基准 1：每房间；2：成人携儿童；3：每人（含儿童）；4：纯儿童", nullable = "false", length = "3")
	private String rateStd;

	@DrptField(fieldnm = "priceTyp", fielddrpt = "定价方式 0：普通定价，1：分段定价；2：小时定价", nullable = "true", length = "3")
	private String priceTyp;

	@DrptField(fieldnm = "rateLevel", fielddrpt = "开关级别 关价格时，按照Rate Level关闭；主表配置，属性中可输入分级Level，可自行输入1-99；分级Level集团自行确定等级表示的含义，要集团统一管理；", nullable = "true", length = "5")
	private Integer rateLevel;

	@DrptField(fieldnm = "useTyp", fielddrpt = "价格使用方式 0：内部价,1：发布价，2：都可用（默认）", nullable = "false", length = "3")
	private String useTyp;

	@DrptField(fieldnm = "crsrateId", fielddrpt = "发布价格ID 当use_flg=2时，此字段记录CRS中对应的价格代码ID", nullable = "true", length = "10")
	private Integer crsrateId;

	@DrptField(fieldnm = "negotiatedFlg", fielddrpt = "协议价标识 0：非协议价；1：协议价；2：都可用（默认）", nullable = "false", length = "3")
	private String negotiatedFlg;

	@DrptField(fieldnm = "cohuFlg", fielddrpt = "免费自用标识 0：普通（默认）；1：免费；2：自用。只有在0：非协议价、特价标识是普通的情况下才能选择；与自用房互斥；", nullable = "false", length = "3")
	private String cohuFlg;

	@DrptField(fieldnm = "calendarId", fielddrpt = "酒店日历编码 如果是酒店日历，则需要选择一个已经选好的酒店日历；如果是空，则无酒店日历；", nullable = "true", length = "10")
	private Integer calendarId;

	@DrptField(fieldnm = "tierFlg", fielddrpt = "使用Tier标识 0：不使用；1：使用；默认0：不使用", nullable = "false", length = "3")
	private String tierFlg;

	@DrptField(fieldnm = "suppressFlg", fielddrpt = "保密标记 0：不保密，1：保密", nullable = "true", length = "3")
	private String suppressFlg;

	@DrptField(fieldnm = "publishDt", fielddrpt = "公布日期 ", nullable = "true", length = "13")
	private java.util.Date publishDt;

	@DrptField(fieldnm = "startDt", fielddrpt = "有效期起期 ", nullable = "true", length = "13")
	private java.util.Date startDt;

	@DrptField(fieldnm = "endDt", fielddrpt = "有效期止期 ", nullable = "true", length = "13")
	private java.util.Date endDt;

	@DrptField(fieldnm = "promstartDt", fielddrpt = "促销起期 ", nullable = "true", length = "13")
	private java.util.Date promstartDt;

	@DrptField(fieldnm = "promendDt", fielddrpt = "促销止期 ", nullable = "true", length = "13")
	private java.util.Date promendDt;

	@DrptField(fieldnm = "bookstartDhms", fielddrpt = "预订期起期 日期+时间", nullable = "true", length = "13")
	private java.util.Date bookstartDhms;

	@DrptField(fieldnm = "bookendDhms", fielddrpt = "预订期止期 日期+时间", nullable = "true", length = "13")
	private java.util.Date bookendDhms;

	@DrptField(fieldnm = "folioFlg", fielddrpt = "账单打印标识 0：不打印（默认）；1：打印表示账单名称是否按folio_drpt打印", nullable = "false", length = "3")
	private String folioFlg;

	@DrptField(fieldnm = "folioDrpt", fielddrpt = "账单显示内容 Folio Text；在客人账单上显示的是此价格代码在账单显示内容上面输入的信息，如果没有输入则显示价格名称", nullable = "true", length = "200")
	private String folioDrpt;

	@DrptField(fieldnm = "resvnoticeId", fielddrpt = "预订须知模板 ①根据选择的集团代码或酒店代码取得②选择模板，显示详细信息③详细信息内容需要冗余记录，可以更改④最终以界面显示为准", nullable = "true", length = "10")
	private Integer resvnoticeId;

	@DrptField(fieldnm = "resvnotice", fielddrpt = "预订须知 ", nullable = "true", length = "500")
	private String resvnotice;

	@DrptField(fieldnm = "marketId", fielddrpt = "市场编码 ", nullable = "true", length = "10")
	private Integer marketId;

	@DrptField(fieldnm = "sourceId", fielddrpt = "客源编码 ", nullable = "true", length = "10")
	private Integer sourceId;

	@DrptField(fieldnm = "suggestTyp", fielddrpt = "推荐类型 0：普通，1：推荐，2：强烈推荐", nullable = "true", length = "3")
	private String suggestTyp;

	@DrptField(fieldnm = "commissionId", fielddrpt = "佣金编码 ", nullable = "true", length = "10")
	private Integer commissionId;

	@DrptField(fieldnm = "nocreditFlg", fielddrpt = "禁止积分标识 0：禁止；1：不禁止；默认不禁止", nullable = "false", length = "3")
	private String nocreditFlg;

	@DrptField(fieldnm = "currencyId", fielddrpt = "报价币种 可选择酒店房价报价的币种（本位币+报价币种）  1）进行酒店价格设定时，默认为酒店所在国家的本位币  2）进行酒店价格设定时，如果为其它币种，需在PMS端按照PMS酒店统一设置的外币换算方式进行外币换算成酒店的本位币；一期仅为可选出中国的本位币人民币；", nullable = "false", length = "10")
	private Integer currencyId;

	@DrptField(fieldnm = "multicurrencyFlg", fielddrpt = "多币种标记 0：否（默认）；1：是。仅在报价的币种是本位币时，才可以选择是否支持外币报价", nullable = "false", length = "3")
	private String multicurrencyFlg;

	@DrptField(fieldnm = "discFlg", fielddrpt = "折扣标识 0：可折扣；1：不可折扣；默认0：可折扣", nullable = "false", length = "3")
	private String discFlg;

	@DrptField(fieldnm = "disctNet", fielddrpt = "折扣后最低价 折扣后的最低限制，取三者的最低值", nullable = "true", length = "12")
	private BigDecimal disctNet;

	@DrptField(fieldnm = "discVlu", fielddrpt = "折扣金额 ", nullable = "true", length = "12")
	private BigDecimal discVlu;

	@DrptField(fieldnm = "discPcts", fielddrpt = "折扣率 ", nullable = "true", length = "12")
	private BigDecimal discPcts;

	@DrptField(fieldnm = "baseRound", fielddrpt = "非基础价小数点收取方式 ", nullable = "true", length = "3")
	private String baseRound;

	@DrptField(fieldnm = "minPers", fielddrpt = "最大人数 ", nullable = "true", length = "5")
	private Integer minPers;

	@DrptField(fieldnm = "maxPers", fielddrpt = "最小人数 ", nullable = "true", length = "5")
	private Integer maxPers;

	@DrptField(fieldnm = "rctrncdId", fielddrpt = "房费入账代码 ", nullable = "true", length = "10")
	private Integer rctrncdId;

	@DrptField(fieldnm = "foliotrncdId", fielddrpt = "账单入账代码 ", nullable = "true", length = "10")
	private Integer foliotrncdId;

	@DrptField(fieldnm = "svctypId", fielddrpt = "服务费费率代码 ", nullable = "true", length = "10")
	private Integer svctypId;

	@DrptField(fieldnm = "svcfolioFlg", fielddrpt = "服务费账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	private String svcfolioFlg;

	@DrptField(fieldnm = "svcchargeFlg", fielddrpt = "服务费收费方式 1：内含；2：另收所有服务费都是按照房价的费率代码收取消费税；", nullable = "false", length = "3")
	private String svcchargeFlg;

	@DrptField(fieldnm = "tax1Id", fielddrpt = "税1率代码 ", nullable = "true", length = "10")
	private Integer tax1Id;

	@DrptField(fieldnm = "tax1folioFlg", fielddrpt = "税1账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	private String tax1folioFlg;

	@DrptField(fieldnm = "tax1chargeFlg", fielddrpt = "税1收费方式 1：内含；2：另收所有服务费都是按照房价的费率代码收取消费税；", nullable = "false", length = "3")
	private String tax1chargeFlg;

	@DrptField(fieldnm = "tax2Id", fielddrpt = "税2率代码 ", nullable = "true", length = "10")
	private Integer tax2Id;

	@DrptField(fieldnm = "tax2folioFlg", fielddrpt = "税2账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	private String tax2folioFlg;

	@DrptField(fieldnm = "tax2chargeFlg", fielddrpt = "税2收费方式 1：内含；2：另收所有服务费都是按照房价的费率代码收取消费税；", nullable = "false", length = "3")
	private String tax2chargeFlg;

	@DrptField(fieldnm = "tax3Id", fielddrpt = "税3率代码 ", nullable = "true", length = "10")
	private Integer tax3Id;

	@DrptField(fieldnm = "tax3folioFlg", fielddrpt = "税3账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	private String tax3folioFlg;

	@DrptField(fieldnm = "tax3chargeFlg", fielddrpt = "税3收费方式 1：内含；2：另收所有服务费都是按照房价的费率代码收取消费税；", nullable = "false", length = "3")
	private String tax3chargeFlg;

	@DrptField(fieldnm = "tax4Id", fielddrpt = "税4率代码 ", nullable = "true", length = "10")
	private Integer tax4Id;

	@DrptField(fieldnm = "tax4folioFlg", fielddrpt = "税4账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	private String tax4folioFlg;

	@DrptField(fieldnm = "tax4chargeFlg", fielddrpt = "税4收费方式 1：内含；2：另收所有服务费都是按照房价的费率代码收取消费税；", nullable = "false", length = "3")
	private String tax4chargeFlg;

	@DrptField(fieldnm = "tax5Id", fielddrpt = "税5率代码 ", nullable = "true", length = "10")
	private Integer tax5Id;

	@DrptField(fieldnm = "tax5folioFlg", fielddrpt = "税5账单显示 0：不显示（默认）；1：显示", nullable = "true", length = "3")
	private String tax5folioFlg;

	@DrptField(fieldnm = "tax5chargeFlg", fielddrpt = "税5收费方式 1：内含；2：另收所有服务费都是按照房价的费率代码收取消费税；", nullable = "false", length = "3")
	private String tax5chargeFlg;

	@DrptField(fieldnm = "pkggroupId", fielddrpt = "房含分组id ", nullable = "true", length = "10")
	private Integer pkggroupId;

	@DrptField(fieldnm = "note", fielddrpt = "注释 ", nullable = "true", length = "500")
	private String note;

	@DrptField(fieldnm = "displayColor", fielddrpt = "显示颜色 ", nullable = "true", length = "100")
	private String displayColor;

	@DrptField(fieldnm = "memo", fielddrpt = "备注 ", nullable = "true", length = "2000")
	private String memo;

	@DrptField(fieldnm = "ids", fielddrpt = "参数ID集合")
	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

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

	public Integer getRateId() {
		return this.rateId;
	}

	public void setRateId(Integer value) {
		this.rateId = value;
	}

	public Integer getRateVer() {
		return this.rateVer;
	}

	public void setRateVer(Integer value) {
		this.rateVer = value;
	}

	public String getStatusFlg() {
		return this.statusFlg;
	}

	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}

	public String getPublishStus() {
		return this.publishStus;
	}

	public void setPublishStus(String value) {
		this.publishStus = value;
	}

	public String getTemplateFlg() {
		return this.templateFlg;
	}

	public void setTemplateFlg(String value) {
		this.templateFlg = value;
	}

	public Integer getGrpTemplateId() {
		return this.grpTemplateId;
	}

	public void setGrpTemplateId(Integer value) {
		this.grpTemplateId = value;
	}

	public String getRateCd() {
		return this.rateCd;
	}

	public void setRateCd(String value) {
		this.rateCd = value;
	}

	public String getRateNm() {
		return this.rateNm;
	}

	public void setRateNm(String value) {
		this.rateNm = value;
	}

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer value) {
		this.seq = value;
	}

	public Integer getRerateId() {
		return this.rerateId;
	}

	public void setRerateId(Integer value) {
		this.rerateId = value;
	}

	public Integer getBaserateId() {
		return this.baserateId;
	}

	public void setBaserateId(Integer value) {
		this.baserateId = value;
	}

	public Integer getRategrpId() {
		return this.rategrpId;
	}

	public void setRategrpId(Integer value) {
		this.rategrpId = value;
	}

	public Integer getRatesubgrpId() {
		return this.ratesubgrpId;
	}

	public void setRatesubgrpId(Integer value) {
		this.ratesubgrpId = value;
	}

	public String getRateFlg() {
		return this.rateFlg;
	}

	public void setRateFlg(String value) {
		this.rateFlg = value;
	}

	public String getRateTyp() {
		return this.rateTyp;
	}

	public void setRateTyp(String value) {
		this.rateTyp = value;
	}

	public String getRateStd() {
		return this.rateStd;
	}

	public void setRateStd(String value) {
		this.rateStd = value;
	}

	public String getPriceTyp() {
		return this.priceTyp;
	}

	public void setPriceTyp(String value) {
		this.priceTyp = value;
	}

	public Integer getRateLevel() {
		return this.rateLevel;
	}

	public void setRateLevel(Integer value) {
		this.rateLevel = value;
	}

	public String getUseTyp() {
		return this.useTyp;
	}

	public void setUseTyp(String value) {
		this.useTyp = value;
	}

	public Integer getCrsrateId() {
		return this.crsrateId;
	}

	public void setCrsrateId(Integer value) {
		this.crsrateId = value;
	}

	public String getNegotiatedFlg() {
		return this.negotiatedFlg;
	}

	public void setNegotiatedFlg(String value) {
		this.negotiatedFlg = value;
	}

	public String getCohuFlg() {
		return this.cohuFlg;
	}

	public void setCohuFlg(String value) {
		this.cohuFlg = value;
	}

	public Integer getCalendarId() {
		return this.calendarId;
	}

	public void setCalendarId(Integer value) {
		this.calendarId = value;
	}

	public String getTierFlg() {
		return this.tierFlg;
	}

	public void setTierFlg(String value) {
		this.tierFlg = value;
	}

	public String getSuppressFlg() {
		return this.suppressFlg;
	}

	public void setSuppressFlg(String value) {
		this.suppressFlg = value;
	}

	public java.util.Date getPublishDt() {
		return this.publishDt;
	}

	public void setPublishDt(java.util.Date value) {
		this.publishDt = value;
	}

	public java.util.Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(java.util.Date value) {
		this.startDt = value;
	}

	public java.util.Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(java.util.Date value) {
		this.endDt = value;
	}

	public java.util.Date getPromstartDt() {
		return this.promstartDt;
	}

	public void setPromstartDt(java.util.Date value) {
		this.promstartDt = value;
	}

	public java.util.Date getPromendDt() {
		return this.promendDt;
	}

	public void setPromendDt(java.util.Date value) {
		this.promendDt = value;
	}

	public java.util.Date getBookstartDhms() {
		return this.bookstartDhms;
	}

	public void setBookstartDhms(java.util.Date value) {
		this.bookstartDhms = value;
	}

	public java.util.Date getBookendDhms() {
		return this.bookendDhms;
	}

	public void setBookendDhms(java.util.Date value) {
		this.bookendDhms = value;
	}

	public String getFolioFlg() {
		return this.folioFlg;
	}

	public void setFolioFlg(String value) {
		this.folioFlg = value;
	}

	public String getFolioDrpt() {
		return this.folioDrpt;
	}

	public void setFolioDrpt(String value) {
		this.folioDrpt = value;
	}

	public Integer getResvnoticeId() {
		return this.resvnoticeId;
	}

	public void setResvnoticeId(Integer value) {
		this.resvnoticeId = value;
	}

	public String getResvnotice() {
		return this.resvnotice;
	}

	public void setResvnotice(String value) {
		this.resvnotice = value;
	}

	public Integer getMarketId() {
		return this.marketId;
	}

	public void setMarketId(Integer value) {
		this.marketId = value;
	}

	public Integer getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(Integer value) {
		this.sourceId = value;
	}

	public String getSuggestTyp() {
		return this.suggestTyp;
	}

	public void setSuggestTyp(String value) {
		this.suggestTyp = value;
	}

	public Integer getCommissionId() {
		return this.commissionId;
	}

	public void setCommissionId(Integer value) {
		this.commissionId = value;
	}

	public String getNocreditFlg() {
		return this.nocreditFlg;
	}

	public void setNocreditFlg(String value) {
		this.nocreditFlg = value;
	}

	public Integer getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Integer value) {
		this.currencyId = value;
	}

	public String getMulticurrencyFlg() {
		return this.multicurrencyFlg;
	}

	public void setMulticurrencyFlg(String value) {
		this.multicurrencyFlg = value;
	}

	public String getDiscFlg() {
		return this.discFlg;
	}

	public void setDiscFlg(String value) {
		this.discFlg = value;
	}

	public BigDecimal getDisctNet() {
		return this.disctNet;
	}

	public void setDisctNet(BigDecimal value) {
		this.disctNet = value;
	}

	public BigDecimal getDiscVlu() {
		return this.discVlu;
	}

	public void setDiscVlu(BigDecimal value) {
		this.discVlu = value;
	}

	public BigDecimal getDiscPcts() {
		return this.discPcts;
	}

	public void setDiscPcts(BigDecimal value) {
		this.discPcts = value;
	}

	public String getBaseRound() {
		return this.baseRound;
	}

	public void setBaseRound(String value) {
		this.baseRound = value;
	}

	public Integer getMinPers() {
		return this.minPers;
	}

	public void setMinPers(Integer value) {
		this.minPers = value;
	}

	public Integer getMaxPers() {
		return this.maxPers;
	}

	public void setMaxPers(Integer value) {
		this.maxPers = value;
	}

	public Integer getRctrncdId() {
		return this.rctrncdId;
	}

	public void setRctrncdId(Integer value) {
		this.rctrncdId = value;
	}

	public Integer getFoliotrncdId() {
		return this.foliotrncdId;
	}

	public void setFoliotrncdId(Integer value) {
		this.foliotrncdId = value;
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

	public Integer getPkggroupId() {
		return this.pkggroupId;
	}

	public void setPkggroupId(Integer value) {
		this.pkggroupId = value;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String value) {
		this.note = value;
	}

	public String getDisplayColor() {
		return this.displayColor;
	}

	public void setDisplayColor(String value) {
		this.displayColor = value;
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

	@JsonIgnore(true)
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
