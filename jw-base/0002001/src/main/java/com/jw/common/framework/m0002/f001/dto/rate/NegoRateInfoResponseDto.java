package com.jw.common.framework.m0002.f001.dto.rate;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class NegoRateInfoResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5371032157541163631L;

	@DrptField(fieldnm="noCorpGlobalRate",fielddrpt="非全局rate")
	private Map<Integer, Collection<Integer>> noCorpGlobalRate;
	@DrptField(fieldnm="corpGlobalRate",fielddrpt="全局rate")
	private Set<Integer> corpGlobalRate;
	@DrptField(fieldnm="memberRate",fielddrpt="会员价格")
	private Map<Integer, Collection<Integer>> memberRate;
	public Map<Integer, Collection<Integer>> getNoCorpGlobalRate() {
		return noCorpGlobalRate;
	}
	public Set<Integer> getCorpGlobalRate() {
		return corpGlobalRate;
	}
	public Map<Integer, Collection<Integer>> getMemberRate() {
		return memberRate;
	}
	public void setNoCorpGlobalRate(Map<Integer, Collection<Integer>> noCorpGlobalRate) {
		this.noCorpGlobalRate = noCorpGlobalRate;
	}
	public void setCorpGlobalRate(Set<Integer> corpGlobalRate) {
		this.corpGlobalRate = corpGlobalRate;
	}
	public void setMemberRate(Map<Integer, Collection<Integer>> memberRate) {
		this.memberRate = memberRate;
	}
}
