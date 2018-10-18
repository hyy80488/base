/**   
* @Title: GrpCrmArProfileDto.java 
* @Package com.jw.common.framework.m3520.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年9月30日 上午11:53:15 
* @version V1.0   
*/
package com.jw.common.framework.m3520.f010.dto;

import java.io.Serializable;

import com.jw.base.framework.core.annotation.DrptDto;

/**
 * ## 类说明：
 * 	应收账户客史，供应收账龄报表使用
 * @author    [tianpei]   
 * @version   [V1.0, 2018年9月30日]
 * @package com.jw.common.framework.m3520.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月30日|tianpei|新增|GrpCrmArProfileDto.java新增
*/
@DrptDto(dtonm="GrpCrmArProfileDto",dtodrpt="应收账户客史Dto")
public class GrpCrmArProfileDto implements Serializable {

	private static final long serialVersionUID = -7185337093119230061L;

	private String profile_no;
	
	private String first_nm;
	
	private String alt_nm;
	
	private String last_nm;
	
	private String middle_nm;
	
	private String index_nm;

	public String getProfile_no() {
		return profile_no;
	}

	public void setProfile_no(String profile_no) {
		this.profile_no = profile_no;
	}

	public String getFirst_nm() {
		return first_nm;
	}

	public void setFirst_nm(String first_nm) {
		this.first_nm = first_nm;
	}

	public String getAlt_nm() {
		return alt_nm;
	}

	public void setAlt_nm(String alt_nm) {
		this.alt_nm = alt_nm;
	}

	public String getLast_nm() {
		return last_nm;
	}

	public void setLast_nm(String last_nm) {
		this.last_nm = last_nm;
	}

	public String getMiddle_nm() {
		return middle_nm;
	}

	public void setMiddle_nm(String middle_nm) {
		this.middle_nm = middle_nm;
	}

	public String getIndex_nm() {
		return index_nm;
	}

	public void setIndex_nm(String index_nm) {
		this.index_nm = index_nm;
	}
	
	
}
