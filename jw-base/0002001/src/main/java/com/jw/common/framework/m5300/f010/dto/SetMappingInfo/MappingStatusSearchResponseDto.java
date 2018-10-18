/**   
* @Title: MappingStatusSearchResponseDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.SetMappingInfo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月3日 下午4:29:59 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.SetMappingInfo;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;
import com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo.StatusSearchList;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月3日]
 * @package com.jw.common.framework.m5300.f010.dto.SetMappingInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月3日|tianpei|新增|MappingStatusSearchResponseDto.java新增
*/
public class MappingStatusSearchResponseDto extends ResponseBaseDto implements Serializable {

	private static final long serialVersionUID = -584523966755507915L;
	
	/** 返回代码**/
	private Integer retCode;
	
	/** 错误描述**/
	private String msg;
	
	/** 结果集合**/
	private List<StatusSearchList> list;
	

	public Integer getRetCode() {
		return retCode;
	}

	public void setRetCode(Integer retCode) {
		this.retCode = retCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<StatusSearchList> getList() {
		return list;
	}

	public void setList(List<StatusSearchList> list) {
		this.list = list;
	}
	
}
