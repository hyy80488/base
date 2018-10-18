/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.Serializable;

/**
 * ## 类说明：
 * 	保存code和code值（表示文字）用于国际化显示字段
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.base.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|CodeBeanMultl.java新增
 */
public class CodeBeanMultl implements Serializable {

	/** UID */
	private static final long serialVersionUID = -382862647733709180L;
	
	/** key */
	private String key = "";
	
	/** code */
	private String code = "";

	/** name */
	private String name = "";

	/** type */
	private String type = "";
	
	private int len = 0;
	
	private boolean status;
	
	/** paramFlg 参数属性 */
	private String paramFlg;
	
	public String getParamFlg() {
		return paramFlg;
	}

	public void setParamFlg(String paramFlg) {
		this.paramFlg = paramFlg;
	}
	
	
	public CodeBeanMultl() {
		super();
	}
	
	public CodeBeanMultl(String className, boolean status) {
		super();
		this.name = className;
		this.status = status;
	}
	
	public int getLen() {
		return len;
	}
	
	public void setLen(int len) {
		this.len = len;
	}
	
	public void setCode(String code) {
		this.code = (code == null) ? "" : code;
	}

	public String getCode() {
		return this.code;
	}

	public void setName(String name) {
		this.name = (name == null) ? "" : name;
	}

	public String getName() {
		return name;
	}

	public void setKey(String key) {
		this.key = (key == null) ? "" : key;
	}
	
	public String getKey() {
		return key;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * ## 方法说明：
	 * 	取得表示文字
	 * @return 用空格分开的各个属性
	 */
	public String getLabel() {
		return key + " " + type + " " + code + " " + name;
	}

	/**
	 * ## 方法说明：
	 * 	取得表示用文字
	 * @return 用逗号分开的各个属性
	 */
	public String getCodeCommaName() {
		return key + "," + type + "," + code + "," + name;
	}
}
