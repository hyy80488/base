package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class SpcRateDatasDto implements Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 126571515699493724L;
	//起期
	private Date startDt;
	//止期
	private Date endDt;
	//价格
	private Map<String, BigDecimal> amts;
	//儿童价格
	private Map<String, BigDecimal> childAmts;
	//房含分组
	private Integer pkggroupId;
	public Date getStartDt() {
		return startDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public Map<String, BigDecimal> getAmts() {
		return amts;
	}
	public Integer getPkggroupId() {
		return pkggroupId;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	public void setAmts(Map<String, BigDecimal> amts) {
		this.amts = amts;
	}
	public void setPkggroupId(Integer pkggroupId) {
		this.pkggroupId = pkggroupId;
	}
	public Map<String, BigDecimal> getChildAmts() {
		return childAmts;
	}
	public void setChildAmts(Map<String, BigDecimal> childAmts) {
		this.childAmts = childAmts;
	}
}
