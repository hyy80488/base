/**   
* @Title: GrpCrmArProfileCorpResponseFormDto.java 
* @Package com.jw.common.framework.m3520.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年9月30日 上午11:57:26 
* @version V1.0   
*/
package com.jw.common.framework.m3520.f010.dto;

import java.io.Serializable;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	应收账龄报表查询协议客户和个人客史返回
 * @author    [tianpei]   
 * @version   [V1.0, 2018年9月30日]
 * @package com.jw.common.framework.m3520.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月30日|tianpei|新增|GrpCrmArProfileCorpResponseFormDto.java新增
*/
@DrptDto(dtonm="GrpCrmArProfileCorpResponseFormDto",dtodrpt="应收账龄报表查询协议客户和个人客史返回dto")
public class GrpCrmArProfileCorpResponseFormDto extends ResponseBaseDto implements Serializable {
 
	private static final long serialVersionUID = -3342687125856482343L;

	@DrptField(fieldnm="grpCrmArCorpMap",fielddrpt="协议公司号集合")
	private Map<String, GrpCrmArCorpDto> grpCrmArCorpMap;
	
	@DrptField(fieldnm="grpCrmArProfileMap",fielddrpt="客史集合")
	private Map<String, GrpCrmArProfileDto> grpCrmArProfileMap;

	public Map<String, GrpCrmArCorpDto> getGrpCrmArCorpMap() {
		return grpCrmArCorpMap;
	}

	public void setGrpCrmArCorpMap(Map<String, GrpCrmArCorpDto> grpCrmArCorpMap) {
		this.grpCrmArCorpMap = grpCrmArCorpMap;
	}

	public Map<String, GrpCrmArProfileDto> getGrpCrmArProfileMap() {
		return grpCrmArProfileMap;
	}

	public void setGrpCrmArProfileMap(Map<String, GrpCrmArProfileDto> grpCrmArProfileMap) {
		this.grpCrmArProfileMap = grpCrmArProfileMap;
	}
	
}
