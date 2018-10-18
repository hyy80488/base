/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

/**
 * ## 类说明：
 * 	apidoc例子的请求dto
 * @author    [liubowen]   
 * @version   [V1.0, 2017-02-08]
 * @package com.jw.hms.cmm.m3101.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-08|liubowen|新增|ApidocInputDto新增
 */
public class ApidocOutputDto extends RequestBaseDto implements java.io.Serializable{
	
	private static final long serialVersionUID = -7543484839810353678L;
	
	private String active;
	private String clsnm;
	private String infnm;
	private String examplenm;
	private String exampletyp;
	private String infurl;
	private String bussiness_id;
	
	private String returnvalue;
	private String paramnm;
	
	public ApidocOutputDto(){
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getClsnm() {
		return clsnm;
	}

	public void setClsnm(String clsnm) {
		this.clsnm = clsnm;
	}

	public String getInfnm() {
		return infnm;
	}

	public void setInfnm(String infnm) {
		this.infnm = infnm;
	}

	public String getExamplenm() {
		return examplenm;
	}

	public void setExamplenm(String examplenm) {
		this.examplenm = examplenm;
	}

	public String getExampletyp() {
		return exampletyp;
	}

	public void setExampletyp(String exampletyp) {
		this.exampletyp = exampletyp;
	}

	public String getInfurl() {
		return infurl;
	}

	public void setInfurl(String infurl) {
		this.infurl = infurl;
	}

	public String getBussiness_id() {
		return bussiness_id;
	}

	public void setBussiness_id(String bussiness_id) {
		this.bussiness_id = bussiness_id;
	}

	public String getParamnm() {
		return paramnm;
	}

	public void setParamnm(String paramnm) {
		this.paramnm = paramnm;
	}

	public String getReturnvalue() {
		return returnvalue;
	}

	public void setReturnvalue(String returnvalue) {
		this.returnvalue = returnvalue;
	}

}

