/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
/**
 * ## 类说明：
 * 	EsLogOperate查询返回dto
 * @author    [liubowen]   
 * @version   [V1.0, 2017/10/06]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017/10/06|liubowen|新增|EsLogOperateDomainDto.java新增
 */
@DrptDto(dtonm = "EsLogOperateDomainDto", dtodrpt = "EsLogOperate查询返回dto")
public class EsLogOperateDomainDto implements java.io.Serializable{

	private static final long serialVersionUID = -1512311704943102344L;

	@DrptField(fieldnm = "esId", fielddrpt = "esId")
	private Long esId;
	
	@DrptField(fieldnm = "content", fielddrpt = "内容")
	private String content;
	
	@DrptField(fieldnm = "contentHighlight", fielddrpt = "高亮内容")
	private String contentHighlight;
	
	@DrptField(fieldnm = "chainUid", fielddrpt = "chainUid")
	private String chainUid;
	
	@DrptField(fieldnm = "chainCd", fielddrpt = "chainCd")
	private String chainCd;
	
	@DrptField(fieldnm = "chainName", fielddrpt = "chainName")
	private String chainName;
	
	@DrptField(fieldnm = "unitUid", fielddrpt = "unitUid")
	private String unitUid;
	
	@DrptField(fieldnm = "unitCd", fielddrpt = "unitCd")
	private String unitCd;
	
	@DrptField(fieldnm = "unitName", fielddrpt = "unitName")
	private String unitName;
	
	@DrptField(fieldnm = "userUid", fielddrpt = "unitUid")
	private String userUid;
	
	@DrptField(fieldnm = "userCd", fielddrpt = "unitCd")
	private String userCd;
	
	@DrptField(fieldnm = "userName", fielddrpt = "unitName")
	private String userName;
	
	@DrptField(fieldnm = "logCd", fielddrpt = "logCd")
	private String logCd;
	
	@DrptField(fieldnm = "funcCd", fielddrpt = "funcCd")
	private String funcCd;
	
	@DrptField(fieldnm = "logDhms", fielddrpt = "日期")
	private java.util.Date logDhms;
	
	@DrptField(fieldnm = "memo", fielddrpt = "备注")
	private String memo;

	@DrptField(fieldnm = "tracerId", fielddrpt = "tracerId")
	private String tracerId;
	/**
	 * @return the esId
	 */
	public Long getEsId() {
		return esId;
	}

	/**
	 * @param esId the esId to set
	 */
	public void setEsId(Long esId) {
		this.esId = esId;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the contentHighlight
	 */
	public String getContentHighlight() {
		return contentHighlight;
	}

	/**
	 * @param contentHighlight the contentHighlight to set
	 */
	public void setContentHighlight(String contentHighlight) {
		this.contentHighlight = contentHighlight;
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
