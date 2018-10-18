/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * ## 类说明：
 * 	自定义业务异常
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.exception
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BusinessException.java新增
 */
public class BusinessException extends Exception {

	private static final long serialVersionUID = 2332608236621015980L;
	/** 容纳所有异常 **/
	private List<Throwable> causes = new ArrayList<Throwable>();
	/** 异常编码 **/
	private String code;
	/** 异常描述 **/
	private String des;
	/** 异常级别 **/
	private String errorLevel;

	public BusinessException() {
		super();
	}

	public BusinessException(String code, String des, String message, String errorLevel) {
		super(message);
		this.code = code;
		this.des = des;
		this.errorLevel = errorLevel;
	}
	
	public BusinessException(String code, String des, String message, String errorLevel, Throwable cause) {
		super(message, cause);
		this.code = code;
		this.des = des;
		this.errorLevel = errorLevel;
	}

	/**
     * Constructs a new exception with the specified detail message,
     * cause, suppression enabled or disabled, and writable stack
     * trace enabled or disabled.
     * @param message the detail message.
     * @param cause the cause.  (A {@code null} value is permitted, and indicates that the cause is nonexistent or unknown.)
     * @param enableSuppression whether or not suppression is enabled or disabled
     * @param writableStackTrace whether or not the stack trace should be writable
     */
	public BusinessException(String code, String des, String message, String errorLevel, Throwable cause, 
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
		this.des = des;
		this.errorLevel = errorLevel;
	}
	
	/** 构造函数，传递一个异常列表 **/
	public BusinessException(List<? extends Throwable> _causes) {
		causes.addAll(_causes);
	}

	/** 读取所有的异常 **/
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
	
	//Throwable.fillInStackTrace本是一个 synchronized native 方法
	//在 Throwable 对象中 填充 执行堆栈信息。此方法在 Throwable 对象中 记录 当前线程的栈帧的 当前状态信息
	//当抛出此异常时，就会通过这个方法填充当前线程的栈帧信息。
	//如果，我们重写了此方法（native实现是将线程的栈帧信息记录到此 Throwable 对象中），不记录当前线程的栈帧信息，那么，当此异常被抛出时，就无法保存堆栈信息了
	
	//异常性能差是因为fillInStackTrace方法，该方法是带锁的并且需要填充线程异常栈信息。
	//而我们的业务类异常是不需要记录异常栈的，可以考虑覆写fillInStackTrace方法减小性能开支（据说覆写该方法能提高10倍性能）。
//	@Override
//	public Throwable fillInStackTrace() {
//		return this;
//	}
}
