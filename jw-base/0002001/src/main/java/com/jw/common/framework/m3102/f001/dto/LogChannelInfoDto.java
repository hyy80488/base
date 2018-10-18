/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */

package com.jw.common.framework.m3102.f001.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.jw.base.framework.core.Constant3220010;
import com.jw.base.framework.core.util.BeanUtil;
import com.jw.base.framework.core.util.StringUtil;
import com.jw.common.framework.m0002.f001.dto.MqParamDto;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [lilin]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.hms.cmm.m3102.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|lilin|新增|LogChannelInfoDto.java新增
*/
public class LogChannelInfoDto extends RequestBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 6988362749671021919L;
	
	/** id **/
	private Integer id;
	/** chainUid **/
	private String chainUid;
	/** unitUid **/
	private String unitUid;
	/** sorFlg **/
	private String sorFlg;
	/** sendUrl **/
	private String sendUrl;
	/** requestDhms **/
	private java.util.Date requestDhms;
	/** responseDhms **/
	private java.util.Date responseDhms;
	/** requestData **/
	private String requestData;
	/** responseData **/
	private String responseData;
	/** retryCnt **/
	private Integer retryCnt;
	/** ifsvcverId **/
	private Integer ifsvcverId;
	/** successFlg **/
	private String successFlg;
	/** ifTyp **/
	private String ifTyp;
	/** syschannelId **/
	private Integer syschannelId;
	/** channelNo **/
	private String channelNo;
	/** chnlNo **/
	private String chnlNo;
	/** crsNum **/
	private String crsNum;
	/** arrDt **/
	private java.util.Date arrDt;
	/** arrTm **/
	private String arrTm;
	/** dptDt **/
	private java.util.Date dptDt;
	/** dptTm **/
	private String dptTm;
	/** memo **/
	private String memo;
	/** ifStr1 **/
	private String ifStr1;
	/** ifStr2 **/
	private String ifStr2;
	/** ifStr3 **/
	private String ifStr3;
	/** ifStr4 **/
	private String ifStr4;
	/** ifStr5 **/
	private String ifStr5;
	/** ifStr6 **/
	private String ifStr6;
	/** ifStr7 **/
	private String ifStr7;
	/** ifStr8 **/
	private String ifStr8;
	/** ifStr9 **/
	private String ifStr9;
	/** ifStr10 **/
	private String ifStr10;
	/** ifNum1 **/
	private BigDecimal ifNum1;
	/** ifNum2 **/
	private BigDecimal ifNum2;
	/** ifNum3 **/
	private BigDecimal ifNum3;
	/** ifNum4 **/
	private BigDecimal ifNum4;
	/** ifNum5 **/
	private BigDecimal ifNum5;
	/** ifDt1 **/
	private java.util.Date ifDt1;
	/** ifDt2 **/
	private java.util.Date ifDt2;
	/** ifDt3 **/
	private java.util.Date ifDt3;
	/** ifDt4 **/
	private java.util.Date ifDt4;
	/** ifDt5 **/
	private java.util.Date ifDt5;
	/** scanStr5 **/
	private String scanStr5;
	/** scanStr6 **/
	private String scanStr6;
	/** scanStr7 **/
	private String scanStr7;
	/** scanStr8 **/
	private String scanStr8;
	/** scanStr9 **/
	private String scanStr9;
	/** scanStr10 **/
	private String scanStr10;
	/** scanNum1 **/
	private BigDecimal scanNum1;
	/** scanNum2 **/
	private BigDecimal scanNum2;
	/** scanNum3 **/
	private BigDecimal scanNum3;
	/** scanNum4 **/
	private BigDecimal scanNum4;
	/** scanNum5 **/
	private BigDecimal scanNum5;
	/** scanDt1 **/
	private java.util.Date scanDt1;
	/** scanDt2 **/
	private java.util.Date scanDt2;
	/** scanDt3 **/
	private java.util.Date scanDt3;
	/** scanDt4 **/
	private java.util.Date scanDt4;
	/** scanDt5 **/
	private java.util.Date scanDt5;
	private String data;
	private String sendTyp;
	private java.util.Date  sendTime;
	private String traceUid;
	private MqParamDto mqParamDto;
	private String hotelCode;
	
	
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public MqParamDto getMqParamDto() {
		return mqParamDto;
	}
	public void setMqParamDto(MqParamDto mqParamDto) {
		this.mqParamDto = mqParamDto;
	}
	public String getTraceUid() {
		return traceUid;
	}
	public void setTraceUid(String traceUid) {
		this.traceUid = traceUid;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getSendTyp() {
		return sendTyp;
	}
	public void setSendTyp(String sendTyp) {
		this.sendTyp = sendTyp;
	}
	public java.util.Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(java.util.Date sendTime) {
		this.sendTime = sendTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getSorFlg() {
		return sorFlg;
	}
	public void setSorFlg(String sorFlg) {
		this.sorFlg = sorFlg;
	}
	public String getSendUrl() {
		return sendUrl;
	}
	public void setSendUrl(String sendUrl) {
		this.sendUrl = sendUrl;
	}
	public java.util.Date getRequestDhms() {
		return requestDhms;
	}
	public void setRequestDhms(java.util.Date requestDhms) {
		this.requestDhms = requestDhms;
	}
	public java.util.Date getResponseDhms() {
		return responseDhms;
	}
	public void setResponseDhms(java.util.Date responseDhms) {
		this.responseDhms = responseDhms;
	}
	public String getRequestData() {
		return requestData;
	}
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}
	public String getResponseData() {
		return responseData;
	}
	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	public Integer getRetryCnt() {
		return retryCnt;
	}
	public void setRetryCnt(Integer retryCnt) {
		this.retryCnt = retryCnt;
	}
	public Integer getIfsvcverId() {
		return ifsvcverId;
	}
	public void setIfsvcverId(Integer ifsvcverId) {
		this.ifsvcverId = ifsvcverId;
	}
	public String getSuccessFlg() {
		return successFlg;
	}
	public void setSuccessFlg(String successFlg) {
		this.successFlg = successFlg;
	}
	public String getIfTyp() {
		return ifTyp;
	}
	public void setIfTyp(String ifTyp) {
		this.ifTyp = ifTyp;
	}
	public Integer getSyschannelId() {
		return syschannelId;
	}
	public void setSyschannelId(Integer syschannelId) {
		this.syschannelId = syschannelId;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getChnlNo() {
		return chnlNo;
	}
	public void setChnlNo(String chnlNo) {
		this.chnlNo = chnlNo;
	}
	public String getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}
	public java.util.Date getArrDt() {
		return arrDt;
	}
	public void setArrDt(java.util.Date arrDt) {
		this.arrDt = arrDt;
	}
	public String getArrTm() {
		return arrTm;
	}
	public void setArrTm(String arrTm) {
		this.arrTm = arrTm;
	}
	public java.util.Date getDptDt() {
		return dptDt;
	}
	public void setDptDt(java.util.Date dptDt) {
		this.dptDt = dptDt;
	}
	public String getDptTm() {
		return dptTm;
	}
	public void setDptTm(String dptTm) {
		this.dptTm = dptTm;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getIfStr1() {
		return ifStr1;
	}
	public void setIfStr1(String ifStr1) {
		this.ifStr1 = ifStr1;
	}
	public String getIfStr2() {
		return ifStr2;
	}
	public void setIfStr2(String ifStr2) {
		this.ifStr2 = ifStr2;
	}
	public String getIfStr3() {
		return ifStr3;
	}
	public void setIfStr3(String ifStr3) {
		this.ifStr3 = ifStr3;
	}
	public String getIfStr4() {
		return ifStr4;
	}
	public void setIfStr4(String ifStr4) {
		this.ifStr4 = ifStr4;
	}
	public String getIfStr5() {
		return ifStr5;
	}
	public void setIfStr5(String ifStr5) {
		this.ifStr5 = ifStr5;
	}
	public String getIfStr6() {
		return ifStr6;
	}
	public void setIfStr6(String ifStr6) {
		this.ifStr6 = ifStr6;
	}
	public String getIfStr7() {
		return ifStr7;
	}
	public void setIfStr7(String ifStr7) {
		this.ifStr7 = ifStr7;
	}
	public String getIfStr8() {
		return ifStr8;
	}
	public void setIfStr8(String ifStr8) {
		this.ifStr8 = ifStr8;
	}
	public String getIfStr9() {
		return ifStr9;
	}
	public void setIfStr9(String ifStr9) {
		this.ifStr9 = ifStr9;
	}
	public String getIfStr10() {
		return ifStr10;
	}
	public void setIfStr10(String ifStr10) {
		this.ifStr10 = ifStr10;
	}
	public BigDecimal getIfNum1() {
		return ifNum1;
	}
	public void setIfNum1(BigDecimal ifNum1) {
		this.ifNum1 = ifNum1;
	}
	public BigDecimal getIfNum2() {
		return ifNum2;
	}
	public void setIfNum2(BigDecimal ifNum2) {
		this.ifNum2 = ifNum2;
	}
	public BigDecimal getIfNum3() {
		return ifNum3;
	}
	public void setIfNum3(BigDecimal ifNum3) {
		this.ifNum3 = ifNum3;
	}
	public BigDecimal getIfNum4() {
		return ifNum4;
	}
	public void setIfNum4(BigDecimal ifNum4) {
		this.ifNum4 = ifNum4;
	}
	public BigDecimal getIfNum5() {
		return ifNum5;
	}
	public void setIfNum5(BigDecimal ifNum5) {
		this.ifNum5 = ifNum5;
	}
	public java.util.Date getIfDt1() {
		return ifDt1;
	}
	public void setIfDt1(java.util.Date ifDt1) {
		this.ifDt1 = ifDt1;
	}
	public java.util.Date getIfDt2() {
		return ifDt2;
	}
	public void setIfDt2(java.util.Date ifDt2) {
		this.ifDt2 = ifDt2;
	}
	public java.util.Date getIfDt3() {
		return ifDt3;
	}
	public void setIfDt3(java.util.Date ifDt3) {
		this.ifDt3 = ifDt3;
	}
	public java.util.Date getIfDt4() {
		return ifDt4;
	}
	public void setIfDt4(java.util.Date ifDt4) {
		this.ifDt4 = ifDt4;
	}
	public java.util.Date getIfDt5() {
		return ifDt5;
	}
	public void setIfDt5(java.util.Date ifDt5) {
		this.ifDt5 = ifDt5;
	}
	public String getScanStr5() {
		return scanStr5;
	}
	public void setScanStr5(String scanStr5) {
		this.scanStr5 = scanStr5;
	}
	public String getScanStr6() {
		return scanStr6;
	}
	public void setScanStr6(String scanStr6) {
		this.scanStr6 = scanStr6;
	}
	public String getScanStr7() {
		return scanStr7;
	}
	public void setScanStr7(String scanStr7) {
		this.scanStr7 = scanStr7;
	}
	public String getScanStr8() {
		return scanStr8;
	}
	public void setScanStr8(String scanStr8) {
		this.scanStr8 = scanStr8;
	}
	public String getScanStr9() {
		return scanStr9;
	}
	public void setScanStr9(String scanStr9) {
		this.scanStr9 = scanStr9;
	}
	public String getScanStr10() {
		return scanStr10;
	}
	public void setScanStr10(String scanStr10) {
		this.scanStr10 = scanStr10;
	}
	public BigDecimal getScanNum1() {
		return scanNum1;
	}
	public void setScanNum1(BigDecimal scanNum1) {
		this.scanNum1 = scanNum1;
	}
	public BigDecimal getScanNum2() {
		return scanNum2;
	}
	public void setScanNum2(BigDecimal scanNum2) {
		this.scanNum2 = scanNum2;
	}
	public BigDecimal getScanNum3() {
		return scanNum3;
	}
	public void setScanNum3(BigDecimal scanNum3) {
		this.scanNum3 = scanNum3;
	}
	public BigDecimal getScanNum4() {
		return scanNum4;
	}
	public void setScanNum4(BigDecimal scanNum4) {
		this.scanNum4 = scanNum4;
	}
	public BigDecimal getScanNum5() {
		return scanNum5;
	}
	public void setScanNum5(BigDecimal scanNum5) {
		this.scanNum5 = scanNum5;
	}
	public java.util.Date getScanDt1() {
		return scanDt1;
	}
	public void setScanDt1(java.util.Date scanDt1) {
		this.scanDt1 = scanDt1;
	}
	public java.util.Date getScanDt2() {
		return scanDt2;
	}
	public void setScanDt2(java.util.Date scanDt2) {
		this.scanDt2 = scanDt2;
	}
	public java.util.Date getScanDt3() {
		return scanDt3;
	}
	public void setScanDt3(java.util.Date scanDt3) {
		this.scanDt3 = scanDt3;
	}
	public java.util.Date getScanDt4() {
		return scanDt4;
	}
	public void setScanDt4(java.util.Date scanDt4) {
		this.scanDt4 = scanDt4;
	}
	public java.util.Date getScanDt5() {
		return scanDt5;
	}
	public void setScanDt5(java.util.Date scanDt5) {
		this.scanDt5 = scanDt5;
	}
	
	public Map<String,Object> coverDtoToMap(LogChannelInfoDto channelInfoDto, boolean flag){
		Map<String,Object> dto = new HashMap<>();
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getChainUid())) dto.put("chain_uid", channelInfoDto.getChainUid());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getUnitUid()))dto.put("unit_uid", channelInfoDto.getUnitUid());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getSorFlg()))dto.put("sor_flg", channelInfoDto.getSorFlg());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getSendUrl()))dto.put("send_url", channelInfoDto.getSendUrl());
		if(Constant3220010.ENUM_LOG_SEND_TYP.REQ.getValue().equals(channelInfoDto.getSendTyp())){
			if(flag || !BeanUtil.isEmpty(channelInfoDto.getSendTime()))dto.put("request_dhms", channelInfoDto.getSendTime());
			if(flag || StringUtil.isNotEmpty(channelInfoDto.getData()))dto.put("request_data", channelInfoDto.getData());
		}else if(Constant3220010.ENUM_LOG_SEND_TYP.REP.getValue().equals(channelInfoDto.getSendTyp())){
			if(flag || !BeanUtil.isEmpty(channelInfoDto.getSendTime()))dto.put("response_dhms", channelInfoDto.getSendTime());
			if(flag || StringUtil.isNotEmpty(channelInfoDto.getData()))dto.put("response_data", channelInfoDto.getData());
		}
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getRetryCnt()))dto.put("retry_cnt", channelInfoDto.getRetryCnt());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfsvcverId()))dto.put("ifsvcver_id", channelInfoDto.getIfsvcverId());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getSuccessFlg()))dto.put("success_flg", channelInfoDto.getSuccessFlg());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfTyp()))dto.put("if_typ", channelInfoDto.getIfTyp());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getSyschannelId()))dto.put("syschannel_id", channelInfoDto.getSyschannelId());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getChannelNo()))dto.put("channel_no", channelInfoDto.getChannelNo());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getChnlNo()))dto.put("chnl_no", channelInfoDto.getChnlNo());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getCrsNum()))dto.put("crs_num", channelInfoDto.getCrsNum());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getArrDt()))dto.put("arr_dt", channelInfoDto.getArrDt());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getArrTm()))dto.put("arr_tm", channelInfoDto.getArrTm());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getDptDt()))dto.put("dpt_dt", channelInfoDto.getDptDt());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getDptTm()))dto.put("dpt_tm", channelInfoDto.getDptTm());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getMemo()))dto.put("memo", channelInfoDto.getMemo());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr1()))dto.put("if_str1", channelInfoDto.getIfStr1());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr2()))dto.put("if_str2", channelInfoDto.getIfStr2());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr3()))dto.put("if_str3", channelInfoDto.getIfStr3());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr4()))dto.put("if_str4", channelInfoDto.getIfStr4());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr5()))dto.put("if_str5", channelInfoDto.getIfStr5());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr6()))dto.put("if_str6", channelInfoDto.getIfStr6());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr7()))dto.put("if_str7", channelInfoDto.getIfStr7());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr8()))dto.put("if_str8", channelInfoDto.getIfStr8());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr9()))dto.put("if_str9", channelInfoDto.getIfStr9());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getIfStr10()))dto.put("if_str10", channelInfoDto.getIfStr10());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfNum1()))dto.put("if_num1", channelInfoDto.getIfNum1());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfNum2()))dto.put("if_num2", channelInfoDto.getIfNum2());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfNum3()))dto.put("if_num3", channelInfoDto.getIfNum3());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfNum4()))dto.put("if_num4", channelInfoDto.getIfNum4());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfNum5()))dto.put("if_num5", channelInfoDto.getIfNum5());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfDt1()))dto.put("if_dt1", channelInfoDto.getIfDt1());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfDt2()))dto.put("if_dt2", channelInfoDto.getIfDt2());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfDt3()))dto.put("if_dt3", channelInfoDto.getIfDt3());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfDt4()))dto.put("if_dt4", channelInfoDto.getIfDt4());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getIfDt5()))dto.put("if_dt5", channelInfoDto.getIfDt5());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getScanStr5()))dto.put("scan_str5", channelInfoDto.getScanStr5());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getScanStr6()))dto.put("scan_str6", channelInfoDto.getScanStr6());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getScanStr7()))dto.put("scan_str7", channelInfoDto.getScanStr7());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getScanStr8()))dto.put("scan_str8", channelInfoDto.getScanStr8());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getScanStr9()))dto.put("scan_str9", channelInfoDto.getScanStr9());
		if(flag || StringUtil.isNotEmpty(channelInfoDto.getScanStr10()))dto.put("scan_str10", channelInfoDto.getScanStr10());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanNum1()))dto.put("scan_num1", channelInfoDto.getScanNum1());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanNum2()))dto.put("scan_num2", channelInfoDto.getScanNum2());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanNum3()))dto.put("scan_num3", channelInfoDto.getScanNum3());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanNum4()))dto.put("scan_num4", channelInfoDto.getScanNum4());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanNum5()))dto.put("scan_num5", channelInfoDto.getScanNum5());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanDt1()))dto.put("scan_dt1", channelInfoDto.getScanDt1());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanDt2()))dto.put("scan_dt2", channelInfoDto.getScanDt2());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanDt3()))dto.put("scan_dt3", channelInfoDto.getScanDt3());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanDt4()))dto.put("scan_dt4", channelInfoDto.getScanDt4());
		if(flag || !BeanUtil.isEmpty(channelInfoDto.getScanDt5()))dto.put("scan_dt5", channelInfoDto.getScanDt5());
		if(StringUtil.isNotEmpty(channelInfoDto.getTraceUid())) dto.put("trace_uid" ,channelInfoDto.getTraceUid());
		return dto;
	}
	
	
}
