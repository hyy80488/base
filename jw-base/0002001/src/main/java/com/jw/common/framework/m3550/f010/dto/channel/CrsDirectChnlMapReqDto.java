
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
public class CrsDirectChnlMapReqDto extends RequestBaseDto implements Serializable {

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
	/**支付类型 501预付 16现付*/
	private String paymentTyp;
	/**价格备注*/
	private String memo;
	/**价格id*/
	private Integer rateId;
	/**产品id*/
	private Integer chnlinfoId;
	/**上线状态  0下线 1上线*/
	private String chnlinfoStus;
	/**查询类型  1编辑  0新增*/
	private String type;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getChnlinfoStus() {
		return chnlinfoStus;
	}
	public void setChnlinfoStus(String chnlinfoStus) {
		this.chnlinfoStus = chnlinfoStus;
	}
	public Integer getChnlinfoId() {
		return chnlinfoId;
	}
	public void setChnlinfoId(Integer chnlinfoId) {
		this.chnlinfoId = chnlinfoId;
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
	public String getPaymentTyp() {
		return paymentTyp;
	}
	public void setPaymentTyp(String paymentTyp) {
		this.paymentTyp = paymentTyp;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	
	
}
