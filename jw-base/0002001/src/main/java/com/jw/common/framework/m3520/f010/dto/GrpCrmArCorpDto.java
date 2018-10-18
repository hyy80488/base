/**   
* @Title: GrpCrmArCorpDto.java 
* @Package com.jw.common.framework.m3520.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年9月30日 上午11:49:47 
* @version V1.0   
*/
package com.jw.common.framework.m3520.f010.dto;

import java.io.Serializable;

import com.jw.base.framework.core.annotation.DrptDto;

/**
 * ## 类说明：
 * 	应收协议公司Dto供账龄报表查询
 * @author    [tianpei]   
 * @version   [V1.0, 2018年9月30日]
 * @package com.jw.common.framework.m3520.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月30日|tianpei|新增|GrpCrmArCorpDto.java新增
*/
@DrptDto(dtonm="GrpCrmArCorpDto",dtodrpt="应收协议公司Dto")
public class GrpCrmArCorpDto implements Serializable {

	private static final long serialVersionUID = -5576105000270387525L;

	private String corp_no;
	
	private String corp_nm;
	
	private String ar_no;

	public String getCorp_no() {
		return corp_no;
	}

	public void setCorp_no(String corp_no) {
		this.corp_no = corp_no;
	}

	public String getCorp_nm() {
		return corp_nm;
	}

	public void setCorp_nm(String corp_nm) {
		this.corp_nm = corp_nm;
	}

	public String getAr_no() {
		return ar_no;
	}

	public void setAr_no(String ar_no) {
		this.ar_no = ar_no;
	}
	
}
