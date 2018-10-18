
/**   
* @Title: CrsChnlMapReqDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.channel 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月23日 下午8:25:59 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.channel;

import java.io.Serializable;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月23日]
 * @package com.jw.common.framework.m3550.f010.dto.channel
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月23日|tianpei|新增|CrsDirectChnlMapReqDto.java新增
*/
public class CrsDirectChnlMapApiReqDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1490117446974015100L;

	/**渠道no*/
	private String channelNo;
	/**酒店uid*/
	private String unitUid;
	/**房型id*/
	private Integer roomtypId;
	/**来店日期时间戳（毫秒）*/
	private Long arrDt;
	/**离店日期时间戳（毫秒）*/
	private Long dptDt;
	/**会员号*/
	private String memberNo;
	/**快速查询条件（暂支持房型名称）*/
	private String fastQuery;
	/**当前页*/
	private Integer currentPage;
	/**每页大小*/
	private Integer pageSize;
	/**查询类型：1房型房价*/
	private String getRate;
	//是否按照房型分组
	private String isGroup;
	/**房型id*/
	private Set<Integer> roomtypIds;
	
	
	public Set<Integer> getRoomtypIds() {
		return roomtypIds;
	}
	public void setRoomtypIds(Set<Integer> roomtypIds) {
		this.roomtypIds = roomtypIds;
	}
	public String getIsGroup() {
		return isGroup;
	}
	public void setIsGroup(String isGroup) {
		this.isGroup = isGroup;
	}
	public String getGetRate() {
		return getRate;
	}
	public void setGetRate(String getRate) {
		this.getRate = getRate;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public Long getArrDt() {
		return arrDt;
	}
	public void setArrDt(Long arrDt) {
		this.arrDt = arrDt;
	}
	public Long getDptDt() {
		return dptDt;
	}
	public void setDptDt(Long dptDt) {
		this.dptDt = dptDt;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getFastQuery() {
		return fastQuery;
	}
	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
}
