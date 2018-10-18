/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ## 类说明：
 * 	系统运行时异常
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.exception
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|SystemException.java新增
 */
public class SystemException extends RuntimeException {

	private static final long serialVersionUID = 4808346938169248760L;

	/** 容纳所有异常  **/
    private List<Throwable> causes = new ArrayList<Throwable>();   
    /** 异常编码  **/
	private String code;
	/** 异常描述  **/
	private String des;
	/** 异常级别  **/
	private String errorLevel;

	public SystemException() {
		super();
	}

	public SystemException(String message) {
		super(message);
	}
	
	public SystemException(Exception ex, String des, String message, String errorLevel) {
		super(message);
		Map<String, String> map = ExceptionUtil.tranDes(ex.getMessage());
		String error = "未知异常";
		String messageCode = BsProcessErrorCode.ERROR_CODE_000001;
		for (Map.Entry<String, String> entry : map.entrySet()) {
			error = entry.getKey();
			messageCode = entry.getValue();
		}
		this.code = messageCode;
		this.des = error;
		this.errorLevel = errorLevel;
	}
	
	public SystemException(String code, String des, String message, String errorLevel) {
		super(message);
		this.code = code;
		this.des = des;
		this.errorLevel = errorLevel;
	}

	public SystemException(Throwable cause) {
		super(cause);
	}

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemException(Exception ex, String des, String message, String errorLevel, Throwable cause) {
		super(message, cause);
		this.code = ex.getClass().toString();
		this.des = des;
		this.errorLevel = errorLevel;
	}
	
	public SystemException(String code, String des, String message, String errorLevel, Throwable cause) {
		super(message, cause);
		this.code = code;
		this.des = des;
		this.errorLevel = errorLevel;
	}
	
	//构造函数，传递一个异常列表   
    public SystemException(List<? extends Throwable> _causes){   
    	causes.addAll(_causes);   
    } 
	
	// 读取所有的异常
	public List<Throwable> getException() {
		return causes;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getErrorLevel() {
		return errorLevel;
	}

	public void setErrorLevel(String errorLevel) {
		this.errorLevel = errorLevel;
	}
}
