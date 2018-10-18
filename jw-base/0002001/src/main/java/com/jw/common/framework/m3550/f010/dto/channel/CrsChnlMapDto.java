/**   
* @Title: CrsChnlMapDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.channel 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月23日 下午8:24:04 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.channel;

import java.io.Serializable;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月23日]
 * @package com.jw.common.framework.m3550.f010.dto.channel
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月23日|tianpei|新增|CrsChnlMapDto.java新增
*/
public class CrsChnlMapDto implements Serializable {

	private static final long serialVersionUID = 8513310720950278249L;

	private String chnlinfo_stus;
	
	private Integer roomtyp_id;
	
	private Integer rate_id;

	public String getChnlinfo_stus() {
		return chnlinfo_stus;
	}

	public void setChnlinfo_stus(String chnlinfo_stus) {
		this.chnlinfo_stus = chnlinfo_stus;
	}

	public Integer getRoomtyp_id() {
		return roomtyp_id;
	}

	public void setRoomtyp_id(Integer roomtyp_id) {
		this.roomtyp_id = roomtyp_id;
	}

	public Integer getRate_id() {
		return rate_id;
	}

	public void setRate_id(Integer rate_id) {
		this.rate_id = rate_id;
	}

	/** 
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @return
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chnlinfo_stus == null) ? 0 : chnlinfo_stus.hashCode());
		result = prime * result + ((rate_id == null) ? 0 : rate_id.hashCode());
		result = prime * result + ((roomtyp_id == null) ? 0 : roomtyp_id.hashCode());
		return result;
	}

	/** 
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @param obj
	 * @return
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrsChnlMapDto other = (CrsChnlMapDto) obj;
		if (chnlinfo_stus == null) {
			if (other.chnlinfo_stus != null)
				return false;
		} else if (!chnlinfo_stus.equals(other.chnlinfo_stus))
			return false;
		if (rate_id == null) {
			if (other.rate_id != null)
				return false;
		} else if (!rate_id.equals(other.rate_id))
			return false;
		if (roomtyp_id == null) {
			if (other.roomtyp_id != null)
				return false;
		} else if (!roomtyp_id.equals(other.roomtyp_id))
			return false;
		return true;
	}
	
}
