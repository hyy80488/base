/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	通用common响应DTO
 * @author    [liubowen]   
 * @version   [版本号, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|ResponseCommonDto.java新增
*/
public class ResponseCommonDto implements java.io.Serializable {
	private static final long serialVersionUID = -7450855754852517322L;
	/** 共享SessionKey **/
	private String sessionKey;
	/** 重复提交 **/
	private String token;
	/** 操作员身份 **/
	private String userUid;
	/** 信息 **/
	private String message;
	/** 返回状态 0成功 1失败 2校验失败 3重复提交 **/
	private String resultCode;
	/** 语种 **/
	private String lans;
	/** 等级： 0普通 5中间等级 9严重(退出) **/
	private String errorLevel;
	/** 追踪Id **/
	private String tracerId;
	/** asyncId **/
	private String asyncId;
	/** api调用结束时间 **/
	private long invokerEndTime;
	
	/**
	 * ## 方法说明：
	 * 	设置消息
	 * @param message 消息
	 * @param resultCode 国际化CODE
	 * @param errorLevel 等级
	 */
	public void setMessageStatus(String message, String resultCode, String errorLevel) {
		this.message = message;
		this.resultCode = resultCode;
		this.errorLevel = errorLevel;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLans() {
		return lans;
	}

	public void setLans(String lans) {
		this.lans = lans;
	}

	public String getTracerId() {
		return tracerId;
	}

	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getErrorLevel() {
		return errorLevel;
	}

	public void setErrorLevel(String errorLevel) {
		this.errorLevel = errorLevel;
	}

	public String getUserUid() {
		return userUid;
	}

	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

	public String getAsyncId() {
		return asyncId;
	}

	public void setAsyncId(String asyncId) {
		this.asyncId = asyncId;
	}

	/**
	 * @return the invokerEndTime
	 */
	public long getInvokerEndTime() {
		return invokerEndTime;
	}

	/**
	 * @param invokerEndTime the invokerEndTime to set
	 */
	public void setInvokerEndTime(long invokerEndTime) {
		this.invokerEndTime = invokerEndTime;
	}

}
