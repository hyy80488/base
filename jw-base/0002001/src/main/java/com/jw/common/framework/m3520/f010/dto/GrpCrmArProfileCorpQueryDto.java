/**   
* @Title: GrpCrmArProfileCorpQueryDto.java 
* @Package com.jw.common.framework.m3520.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年9月30日 上午11:40:38 
* @version V1.0   
*/
package com.jw.common.framework.m3520.f010.dto;

import java.io.Serializable;
import java.util.Set;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	应收账龄报表查询协议客户和个人客史
 * @author    [tianpei]   
 * @version   [V1.0, 2018年9月30日]
 * @package com.jw.common.framework.m3520.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月30日|tianpei|新增|GrpCrmArProfileCorpQueryDto.java新增
*/
@DrptDto(dtonm="GrpCrmArProfileCorpQueryDto",dtodrpt="应收账龄报表查询协议客户和个人客史")
public class GrpCrmArProfileCorpQueryDto extends RequestBaseDto implements Serializable {

	private static final long serialVersionUID = -5059585807934133598L;

	@DrptField(fieldnm="profileNos",fielddrpt="协议公司号集合")
	private Set<String> profileNos;
	
	@DrptField(fieldnm="arNos",fielddrpt="应收账户集合")
	private Set<String> arNos;
	
	@DrptField(fieldnm="unitUid",fielddrpt="unitUid")
	private String unitUid;
	
	public Set<String> getProfileNos() {
		return profileNos;
	}
	public void setProfileNos(Set<String> profileNos) {
		this.profileNos = profileNos;
	}
	public Set<String> getArNos() {
		return arNos;
	}
	public void setArNos(Set<String> arNos) {
		this.arNos = arNos;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	
}
