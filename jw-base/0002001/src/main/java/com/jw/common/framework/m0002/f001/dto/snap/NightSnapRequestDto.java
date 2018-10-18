package com.jw.common.framework.m0002.f001.dto.snap;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	夜审快照请求dto
 * @author    [jianana]   
 * @version   [V1.0, 2017-06-20]
 * @package com.jw.hms.stat.m3290.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-06-20|jianana|新增|NightSnapRequestDto新增
 */
public class NightSnapRequestDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4151382632434171612L;
	/* 集团号*/
	private String chainUid;
	/* 酒店号*/
	private String unitUid;
	/* 营业日*/
	private String businessDt;
	/* 开始index*/
	private Integer fromIndex;
	/* 结束index*/
	private Integer toIndex;
	/* 执行数据*/
	private List<Map<String, Object>> lstExec;
	/* 执行数据*/
	private List<Map<String, Object>> lstExecOther;
	private Map<String, List<Map<String, Object>>> dataMap;
	/* 执行类型*/
	private String execTyp;
	/* 账单删除数据*/
	private Map<String, Integer> acctNoMap;
	/* 删除数据*/
	private Set<String> delSet;


	public Map<String, List<Map<String, Object>>> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, List<Map<String, Object>>> dataMap) {
		this.dataMap = dataMap;
	}
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
	public String getBusinessDt() {
		return businessDt;
	}
	public void setBusinessDt(String businessDt) {
		this.businessDt = businessDt;
	}
	public Integer getFromIndex() {
		return fromIndex;
	}
	public void setFromIndex(Integer fromIndex) {
		this.fromIndex = fromIndex;
	}
	public Integer getToIndex() {
		return toIndex;
	}
	public void setToIndex(Integer toIndex) {
		this.toIndex = toIndex;
	}
	public List<Map<String, Object>> getLstExec() {
		return lstExec;
	}
	public void setLstExec(List<Map<String, Object>> lstExec) {
		this.lstExec = lstExec;
	}
	public String getExecTyp() {
		return execTyp;
	}
	public void setExecTyp(String execTyp) {
		this.execTyp = execTyp;
	}
	public Map<String, Integer> getAcctNoMap() {
		return acctNoMap;
	}
	public void setAcctNoMap(Map<String, Integer> acctNoMap) {
		this.acctNoMap = acctNoMap;
	}
	public List<Map<String, Object>> getLstExecOther() {
		return lstExecOther;
	}
	public void setLstExecOther(List<Map<String, Object>> lstExecOther) {
		this.lstExecOther = lstExecOther;
	}
	public Set<String> getDelSet() {
		return delSet;
	}
	public void setDelSet(Set<String> delSet) {
		this.delSet = delSet;
	}
	
}
