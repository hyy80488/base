/**   
* @Title: CrsRsvCrsorderNightCheckReqDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年8月20日 下午6:33:08 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.io.Serializable;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	crs夜审发送mq所需的dto
 * @author    [tianpei]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|tianpei|新增|CrsRsvCrsorderNightCheckReqDto.java新增
*/
public class CrsRsvCrsorderNightCheckReqDto extends RequestBaseDto implements Serializable{

	private static final long serialVersionUID = -5858585674531354365L;
	/** hotelCode **/
	private String hotelCode;
	/** hotelName **/
	private String hotelName;
	/** 订单号**/
	private String crsorderNo;
	/** 渠道订单号**/
	private String chnlNo;
	/** PMS接收的CRS号**/
	private String crsNum;
	/** 线上押金授信机构,有值则是闪付**/
	private Integer creditinstId;
	/** 接口地址**/
	private String ifUrl;
	/** 接口Id**/
	private Integer ifId;
	
	private Integer syschannelId;
	/** checkin_check_stus  checkout_check_stus **/
	private Set<String> checkStus;
	
	public CrsRsvCrsorderNightCheckReqDto() {
		super();
	}
	public CrsRsvCrsorderNightCheckReqDto(String crsorderNo, String chnlNo, String crsNum, Integer creditinstId) {
		super();
		this.crsorderNo = crsorderNo;
		this.chnlNo = chnlNo;
		this.crsNum = crsNum;
		this.creditinstId = creditinstId;
	}
	
	public CrsRsvCrsorderNightCheckReqDto(String hotelCode, String hotelName, String crsorderNo, String chnlNo,
			String crsNum, Integer creditinstId) {
		super();
		this.hotelCode = hotelCode;
		this.hotelName = hotelName;
		this.crsorderNo = crsorderNo;
		this.chnlNo = chnlNo;
		this.crsNum = crsNum;
		this.creditinstId = creditinstId;
	}
	public String getCrsorderNo() {
		return crsorderNo;
	}
	public void setCrsorderNo(String crsorderNo) {
		this.crsorderNo = crsorderNo;
	}
	public String getChnlNo() {
		return chnlNo;
	}
	public void setChnlNo(String chnlNo) {
		this.chnlNo = chnlNo;
	}
	public String getCrsNum() {
		return crsNum;
	}
	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}
	public Integer getCreditinstId() {
		return creditinstId;
	}
	public void setCreditinstId(Integer creditinstId) {
		this.creditinstId = creditinstId;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getIfUrl() {
		return ifUrl;
	}
	public void setIfUrl(String ifUrl) {
		this.ifUrl = ifUrl;
	}
	public Set<String> getCheckStus() {
		return checkStus;
	}
	public void setCheckStus(Set<String> checkStus) {
		this.checkStus = checkStus;
	}
	public Integer getIfId() {
		return ifId;
	}
	public void setIfId(Integer ifId) {
		this.ifId = ifId;
	}
	public Integer getSyschannelId() {
		return syschannelId;
	}
	public void setSyschannelId(Integer syschannelId) {
		this.syschannelId = syschannelId;
	}
	
}
