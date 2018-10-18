/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	请求头DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|RequestHeadDto.java新增
*/
public class RequestHeadDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8621274471689340670L;

	private String sessionKey;
	
	private String jwToken;
	
	private String jwUid;
	
	private Long jwHotelDt;
	
	private String jwChain;
	
	private String jwUnit;
	
	private String jwWsno;
	
	private String jwBusinessid;
	
	private String jwTracerid;
	
	/** 头信息的摘要信息 */
	private String jwSummary;
	
	/**
	 * @return the sessionKey
	 */
	public String getSessionKey() {
		return sessionKey;
	}

	/**
	 * @param sessionKey the sessionKey to set
	 */
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	/**
	 * @return the jwToken
	 */
	public String getJwToken() {
		return jwToken;
	}

	/**
	 * @param jwToken the jwToken to set
	 */
	public void setJwToken(String jwToken) {
		this.jwToken = jwToken;
	}

	/**
	 * @return the jwUid
	 */
	public String getJwUid() {
		return jwUid;
	}

	/**
	 * @param jwUid the jwUid to set
	 */
	public void setJwUid(String jwUid) {
		this.jwUid = jwUid;
	}

	/**
	 * @return the jwHotelDt
	 */
	public Long getJwHotelDt() {
		return jwHotelDt;
	}

	/**
	 * @param jwHotelDt the jwHotelDt to set
	 */
	public void setJwHotelDt(Long jwHotelDt) {
		this.jwHotelDt = jwHotelDt;
	}

	/**
	 * @return the jwChain
	 */
	public String getJwChain() {
		return jwChain;
	}

	/**
	 * @param jwChain the jwChain to set
	 */
	public void setJwChain(String jwChain) {
		this.jwChain = jwChain;
	}

	/**
	 * @return the jwUnit
	 */
	public String getJwUnit() {
		return jwUnit;
	}

	/**
	 * @param jwUnit the jwUnit to set
	 */
	public void setJwUnit(String jwUnit) {
		this.jwUnit = jwUnit;
	}

	/**
	 * @return the jwWsno
	 */
	public String getJwWsno() {
		return jwWsno;
	}

	/**
	 * @param jwWsno the jwWsno to set
	 */
	public void setJwWsno(String jwWsno) {
		this.jwWsno = jwWsno;
	}

	/**
	 * @return the jwBusinessid
	 */
	public String getJwBusinessid() {
		return jwBusinessid;
	}

	/**
	 * @param jwBusinessid the jwBusinessid to set
	 */
	public void setJwBusinessid(String jwBusinessid) {
		this.jwBusinessid = jwBusinessid;
	}

	/**
	 * @return the jwTracerid
	 */
	public String getJwTracerid() {
		return jwTracerid;
	}

	/**
	 * @param jwTracerid the jwTracerid to set
	 */
	public void setJwTracerid(String jwTracerid) {
		this.jwTracerid = jwTracerid;
	}

	/**
	 * @return the jwSummary
	 */
	public String getJwSummary() {
		return jwSummary;
	}

	/**
	 * @param jwSummary the jwSummary to set
	 */
	public void setJwSummary(String jwSummary) {
		this.jwSummary = jwSummary;
	}

}
