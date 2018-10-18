
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3220.f010.dto;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	客账明细QUERY信息数据传输对象 远程调用
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-09-01]
 * @package com.jw.hms.pms.m3240.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-04-18|zhangteng|新增|HptFinTransactionQueryDto新增
 */
@DrptDto(dtonm = "客账明细QUERY信息数据传输对象 远程调用",dtodrpt="客账明细QUERY信息数据传输对象 远程调用")
public class HptFinTransactionQueryRemoteDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -7736497569963233141L;
	
	@DrptField(fieldnm="chainUid", fielddrpt="集团代码 ", nullable = "false", length = "40")
	private String chainUid;
	@DrptField(fieldnm="unitUid", fielddrpt="单位代码 ", nullable = "false", length = "40")
	private String unitUid;
	//房间号
	@DrptField(fieldnm="roomNum", fielddrpt="房间号 ")
	private String roomNum;
	//协议公司号
	@DrptField(fieldnm="corpNo", fielddrpt="协议公司号")
	private String corpNo;
	/** 价格代码  **/
	@DrptField(fieldnm="rateId", fielddrpt="价格代码")
	private Integer rateId;
	/**	消费项目ID	*/
	@DrptField(fieldnm="productId", fielddrpt="消费项目ID ")
	private List<Integer> productId;
	/** 付款方式Id	*/
	@DrptField(fieldnm="paymentmethodId", fielddrpt="付款方式Id ")
	private Integer paymentmethodId;
	/**	楼区 id */
	@DrptField(fieldnm="areaId", fielddrpt="楼区 id")
	private Integer areaId;
	//客史编号
	@DrptField(fieldnm="profileNo", fielddrpt="客史编号 ")
	private String profileNo;
	/** 物理房型 **/
	@DrptField(fieldnm="roomtypId", fielddrpt="物理房型")
	private Integer roomtypId;
	//账号
	@DrptField(fieldnm="acctNo", fielddrpt="账号 ")
	private String acctNo;
	
	
	public String getChainUid() {
		return chainUid;
	}


	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}


	public String getUnitUid() {
		return unitUid;
	}


	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}


	public String getRoomNum() {
		return roomNum;
	}


	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}




	public String getCorpNo() {
		return corpNo;
	}


	public void setCorpNo(String corpNo) {
		this.corpNo = corpNo;
	}


	public Integer getRateId() {
		return rateId;
	}


	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}


	public List<Integer> getProductId() {
		return productId;
	}


	public void setProductId(List<Integer> productId) {
		this.productId = productId;
	}


	public Integer getPaymentmethodId() {
		return paymentmethodId;
	}


	public void setPaymentmethodId(Integer paymentmethodId) {
		this.paymentmethodId = paymentmethodId;
	}


	public Integer getAreaId() {
		return areaId;
	}


	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}


	public String getProfileNo() {
		return profileNo;
	}


	public void setProfileNo(String profileNo) {
		this.profileNo = profileNo;
	}


	public Integer getRoomtypId() {
		return roomtypId;
	}


	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}


	public String getAcctNo() {
		return acctNo;
	}


	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}


	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

