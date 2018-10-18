/**   
* @Title: CrsRsvAccountNightCheckReqDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月18日 下午5:04:40 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.io.Serializable;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	pms夜审查找crs账户设置ota状态请求dto
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月18日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月18日|tianpei|新增|CrsRsvAccountNightCheckReqDto.java新增
*/
public class CrsRsvAccountNightCheckReqDto extends RequestBaseDto implements Serializable {

	private static final long serialVersionUID = -5617869143983118964L;

	private Set<String> crsNums;

	public Set<String> getCrsNums() {
		return crsNums;
	}

	public void setCrsNums(Set<String> crsNums) {
		this.crsNums = crsNums;
	}
	
}
