package com.jw.base.framework.core.elasticsearch.domain;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName="log_operate_zh", type="log_operate_zh", shards=1, replicas=1 )
public class LogOperateDomainZh {
	@Id
	@Field(type=FieldType.Long,index=FieldIndex.not_analyzed, store=true)
	private Long id;
	
	@Field(type = FieldType.String, analyzer="ik_smart", searchAnalyzer="ik_smart", store = true)
	private String contentIkSmart;
	
	@Field(type = FieldType.String, analyzer="ik_max_word", searchAnalyzer="ik_max_word", store = true)
	private String contentIkMaxWord;
	
	@Field(type = FieldType.String, analyzer="ik_smart", searchAnalyzer="ik_smart", store = true)
	private String keyContentIkSmart;
	
	@Field(type = FieldType.String, analyzer="ik_max_word", searchAnalyzer="ik_max_word", store = true)
	private String keyContentIkMaxWord;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String tracerId;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String chainUid;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String chainCd;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String chainName;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String unitUid;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String unitCd;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String unitName;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String userUid;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String userCd;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String userName;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String logCd;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String funcCd;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String keyNo;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String languageId;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String clientUid;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String fromIp;
	
	@Field(type=FieldType.Date, index=FieldIndex.not_analyzed, store=true)
	private java.util.Date logDhms;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String paramStr1;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String paramStr2;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String paramStr3;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String paramStr4;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String paramStr5;
	
	@Field(type=FieldType.Double, index=FieldIndex.not_analyzed, store=true)
	private BigDecimal paramNum1;
	
	@Field(type=FieldType.Double, index=FieldIndex.not_analyzed, store=true)
	private BigDecimal paramNum2;
	
	@Field(type=FieldType.Double, index=FieldIndex.not_analyzed, store=true)
	private BigDecimal paramNum3;
	
	@Field(type=FieldType.Date, index=FieldIndex.not_analyzed, store=true)
	private java.util.Date paramDt1;
	
	@Field(type=FieldType.Date, index=FieldIndex.not_analyzed, store=true)
	private java.util.Date paramDt2;
	
	@Field(type=FieldType.Date, index=FieldIndex.not_analyzed, store=true)
	private java.util.Date paramDt3;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String successFlg;
	
	@Field(type=FieldType.String, index=FieldIndex.analyzed, store=true)
	private String submitData;
	
	@Field(type=FieldType.String, index=FieldIndex.analyzed, store=true)
	private String originData;

	@Field(type=FieldType.String, index=FieldIndex.analyzed, store=true)
	private String memo;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the contentIkSmart
	 */
	public String getContentIkSmart() {
		return contentIkSmart;
	}

	/**
	 * @param contentIkSmart the contentIkSmart to set
	 */
	public void setContentIkSmart(String contentIkSmart) {
		this.contentIkSmart = contentIkSmart;
	}

	/**
	 * @return the contentIkMaxWord
	 */
	public String getContentIkMaxWord() {
		return contentIkMaxWord;
	}

	/**
	 * @param contentIkMaxWord the contentIkMaxWord to set
	 */
	public void setContentIkMaxWord(String contentIkMaxWord) {
		this.contentIkMaxWord = contentIkMaxWord;
	}

	/**
	 * @return the keyContentIkSmart
	 */
	public String getKeyContentIkSmart() {
		return keyContentIkSmart;
	}

	/**
	 * @param keyContentIkSmart the keyContentIkSmart to set
	 */
	public void setKeyContentIkSmart(String keyContentIkSmart) {
		this.keyContentIkSmart = keyContentIkSmart;
	}

	/**
	 * @return the keyContentIkMaxWord
	 */
	public String getKeyContentIkMaxWord() {
		return keyContentIkMaxWord;
	}

	/**
	 * @param keyContentIkMaxWord the keyContentIkMaxWord to set
	 */
	public void setKeyContentIkMaxWord(String keyContentIkMaxWord) {
		this.keyContentIkMaxWord = keyContentIkMaxWord;
	}

	/**
	 * @return the chainUid
	 */
	public String getChainUid() {
		return chainUid;
	}

	/**
	 * @param chainUid the chainUid to set
	 */
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}

	/**
	 * @return the chainCd
	 */
	public String getChainCd() {
		return chainCd;
	}

	/**
	 * @param chainCd the chainCd to set
	 */
	public void setChainCd(String chainCd) {
		this.chainCd = chainCd;
	}

	/**
	 * @return the chainName
	 */
	public String getChainName() {
		return chainName;
	}

	/**
	 * @param chainName the chainName to set
	 */
	public void setChainName(String chainName) {
		this.chainName = chainName;
	}

	/**
	 * @return the unitUid
	 */
	public String getUnitUid() {
		return unitUid;
	}

	/**
	 * @param unitUid the unitUid to set
	 */
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	/**
	 * @return the unitCd
	 */
	public String getUnitCd() {
		return unitCd;
	}

	/**
	 * @param unitCd the unitCd to set
	 */
	public void setUnitCd(String unitCd) {
		this.unitCd = unitCd;
	}

	/**
	 * @return the unitName
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * @param unitName the unitName to set
	 */
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	/**
	 * @return the userUid
	 */
	public String getUserUid() {
		return userUid;
	}

	/**
	 * @param userUid the userUid to set
	 */
	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

	/**
	 * @return the userCd
	 */
	public String getUserCd() {
		return userCd;
	}

	/**
	 * @param userCd the userCd to set
	 */
	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the logCd
	 */
	public String getLogCd() {
		return logCd;
	}

	/**
	 * @param logCd the logCd to set
	 */
	public void setLogCd(String logCd) {
		this.logCd = logCd;
	}

	/**
	 * @return the funcCd
	 */
	public String getFuncCd() {
		return funcCd;
	}

	/**
	 * @param funcCd the funcCd to set
	 */
	public void setFuncCd(String funcCd) {
		this.funcCd = funcCd;
	}

	/**
	 * @return the keyNo
	 */
	public String getKeyNo() {
		return keyNo;
	}

	/**
	 * @param keyNo the keyNo to set
	 */
	public void setKeyNo(String keyNo) {
		this.keyNo = keyNo;
	}

	/**
	 * @return the languageId
	 */
	public String getLanguageId() {
		return languageId;
	}

	/**
	 * @param languageId the languageId to set
	 */
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	/**
	 * @return the clientUid
	 */
	public String getClientUid() {
		return clientUid;
	}

	/**
	 * @param clientUid the clientUid to set
	 */
	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
	}

	/**
	 * @return the fromIp
	 */
	public String getFromIp() {
		return fromIp;
	}

	/**
	 * @param fromIp the fromIp to set
	 */
	public void setFromIp(String fromIp) {
		this.fromIp = fromIp;
	}

	/**
	 * @return the logDhms
	 */
	public java.util.Date getLogDhms() {
		return logDhms;
	}

	/**
	 * @param logDhms the logDhms to set
	 */
	public void setLogDhms(java.util.Date logDhms) {
		this.logDhms = logDhms;
	}

	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return the paramStr1
	 */
	public String getParamStr1() {
		return paramStr1;
	}

	/**
	 * @param paramStr1 the paramStr1 to set
	 */
	public void setParamStr1(String paramStr1) {
		this.paramStr1 = paramStr1;
	}

	/**
	 * @return the paramStr2
	 */
	public String getParamStr2() {
		return paramStr2;
	}

	/**
	 * @param paramStr2 the paramStr2 to set
	 */
	public void setParamStr2(String paramStr2) {
		this.paramStr2 = paramStr2;
	}

	/**
	 * @return the paramStr3
	 */
	public String getParamStr3() {
		return paramStr3;
	}

	/**
	 * @param paramStr3 the paramStr3 to set
	 */
	public void setParamStr3(String paramStr3) {
		this.paramStr3 = paramStr3;
	}

	/**
	 * @return the paramStr4
	 */
	public String getParamStr4() {
		return paramStr4;
	}

	/**
	 * @param paramStr4 the paramStr4 to set
	 */
	public void setParamStr4(String paramStr4) {
		this.paramStr4 = paramStr4;
	}

	/**
	 * @return the paramStr5
	 */
	public String getParamStr5() {
		return paramStr5;
	}

	/**
	 * @param paramStr5 the paramStr5 to set
	 */
	public void setParamStr5(String paramStr5) {
		this.paramStr5 = paramStr5;
	}

	/**
	 * @return the paramNum1
	 */
	public BigDecimal getParamNum1() {
		return paramNum1;
	}

	/**
	 * @param paramNum1 the paramNum1 to set
	 */
	public void setParamNum1(BigDecimal paramNum1) {
		this.paramNum1 = paramNum1;
	}

	/**
	 * @return the paramNum2
	 */
	public BigDecimal getParamNum2() {
		return paramNum2;
	}

	/**
	 * @param paramNum2 the paramNum2 to set
	 */
	public void setParamNum2(BigDecimal paramNum2) {
		this.paramNum2 = paramNum2;
	}

	/**
	 * @return the paramNum3
	 */
	public BigDecimal getParamNum3() {
		return paramNum3;
	}

	/**
	 * @param paramNum3 the paramNum3 to set
	 */
	public void setParamNum3(BigDecimal paramNum3) {
		this.paramNum3 = paramNum3;
	}

	/**
	 * @return the paramDt1
	 */
	public java.util.Date getParamDt1() {
		return paramDt1;
	}

	/**
	 * @param paramDt1 the paramDt1 to set
	 */
	public void setParamDt1(java.util.Date paramDt1) {
		this.paramDt1 = paramDt1;
	}

	/**
	 * @return the paramDt2
	 */
	public java.util.Date getParamDt2() {
		return paramDt2;
	}

	/**
	 * @param paramDt2 the paramDt2 to set
	 */
	public void setParamDt2(java.util.Date paramDt2) {
		this.paramDt2 = paramDt2;
	}

	/**
	 * @return the paramDt3
	 */
	public java.util.Date getParamDt3() {
		return paramDt3;
	}

	/**
	 * @param paramDt3 the paramDt3 to set
	 */
	public void setParamDt3(java.util.Date paramDt3) {
		this.paramDt3 = paramDt3;
	}

	/**
	 * @return the successFlg
	 */
	public String getSuccessFlg() {
		return successFlg;
	}

	/**
	 * @param successFlg the successFlg to set
	 */
	public void setSuccessFlg(String successFlg) {
		this.successFlg = successFlg;
	}

	/**
	 * @return the submitData
	 */
	public String getSubmitData() {
		return submitData;
	}

	/**
	 * @param submitData the submitData to set
	 */
	public void setSubmitData(String submitData) {
		this.submitData = submitData;
	}

	/**
	 * @return the originData
	 */
	public String getOriginData() {
		return originData;
	}

	/**
	 * @param originData the originData to set
	 */
	public void setOriginData(String originData) {
		this.originData = originData;
	}

	/**
	 * @return the tracerId
	 */
	public String getTracerId() {
		return tracerId;
	}

	/**
	 * @param tracerId the tracerId to set
	 */
	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}
}
