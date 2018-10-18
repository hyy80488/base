/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Objects;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.api.LogDiffer;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

/**
 * ## 类说明：
 * 	直销通用请求DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|DirectRequestBaseDto.java新增
*/
//@Getter
//@Setter
//@Data
@DrptDto(dtonm = "DirectRequestBaseDto", dtodrpt = "通用请求DTO")
public class DirectRequestBaseDto extends RequestBaseDto  implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1029643830245783447L;
	/**分配的授权码**/
	private String jwAccessToken;
	/**客户号*/
	private String jwClientCode;
	/**网站号**/
	private String jwUniqCode;
	/**语种（例如zh-CN）**/
	private String language;
	/**众荟酒店编号**/
	private String jwHotelCode;

	public String getJwAccessToken() {
		return jwAccessToken;
	}

	public String getJwClientCode() {
		return jwClientCode;
	}

	public String getJwUniqCode() {
		return jwUniqCode;
	}

	public String getLanguage() {
		return language;
	}

	public String getJwHotelCode() {
		return jwHotelCode;
	}

	public void setJwAccessToken(String jwAccessToken) {
		this.jwAccessToken = jwAccessToken;
	}

	public void setJwClientCode(String jwClientCode) {
		this.jwClientCode = jwClientCode;
	}

	public void setJwUniqCode(String jwUniqCode) {
		this.jwUniqCode = jwUniqCode;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setJwHotelCode(String jwHotelCode) {
		this.jwHotelCode = jwHotelCode;
	}
	
	

}
