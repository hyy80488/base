/**   
* @Title: RoomProductInfoResultDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.ProductInfo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月8日 下午2:38:47 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import java.io.Serializable;
import java.util.List;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;
import com.jw.common.framework.m5300.f010.dto.GetRoomProductInfo.RoomProductInfoDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月8日]
 * @package com.jw.common.framework.m5300.f010.dto.ProductInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月8日|tianpei|新增|RoomProductInfoResultDto.java新增
*/
public class RoomProductInfoResultDto extends ResponseBaseDto implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -3768320887211481217L;
	private List<RoomProductInfoDto> resultData;
	public List<RoomProductInfoDto> getResultData() {
		return resultData;
	}
	public void setResultData(List<RoomProductInfoDto> resultData) {
		this.resultData = resultData;
	}
	
}
