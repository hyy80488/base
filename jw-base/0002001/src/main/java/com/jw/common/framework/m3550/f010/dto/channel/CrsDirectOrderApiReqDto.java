
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
import java.util.Date;

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
2018年8月23日|tianpei|新增|CrsDirectOrderApiReqDto.java新增
*/
public class CrsDirectOrderApiReqDto extends RequestBaseDto implements Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -7229203583535881759L;
	/**联系电话*/
	private String contactCtno;
	/**会员编号*/
	private String memberNo;
	/**渠道no*/
	private String channelNo;
	/**订单状态（1 正常；2  取消；0  临时）*/
	private String crsorderStus;
	/**线上订单支付属性（1：现付；2：预付；）*/
	private String onlinepaymentStus;
	/**账户状态（RSV：预订；STY：在店；OUT：已结；CXL：取消）*/
	private String crsacctStus;
	/**订单确认号*/
	private String crsNum;
	/**查询起始日期*/
	private Date startDt;
	/**查询结束日期*/
	private Date endDt;
	/**当前页*/
	private Integer currentPage;
	/**每页大小*/
	private Integer pageSize;
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getCrsorderStus() {
		return crsorderStus;
	}
	public void setCrsorderStus(String crsorderStus) {
		this.crsorderStus = crsorderStus;
	}
	public String getOnlinepaymentStus() {
		return onlinepaymentStus;
	}
	public void setOnlinepaymentStus(String onlinepaymentStus) {
		this.onlinepaymentStus = onlinepaymentStus;
	}
	public String getCrsacctStus() {
		return crsacctStus;
	}
	public void setCrsacctStus(String crsacctStus) {
		this.crsacctStus = crsacctStus;
	}
	public Date getStartDt() {
		return startDt;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	public String getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
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
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getContactCtno() {
		return contactCtno;
	}
	public void setContactCtno(String contactCtno) {
		this.contactCtno = contactCtno;
	}
	
}
