package com.jw.base.framework.core.breakdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.MapUtils;

public class DiffTaxQuery {
	private PmsFunction<Collection<Integer>,List<Map<String, Object>>> fcn;
	Map<Integer, Map<String, Object>> taxMap = new HashMap<>();
	public Map<String, Object> query(Integer taxId) throws Exception{
		if(Objects.nonNull(taxId)){
			Map<String, Object> map = taxMap.get(taxId);
			if(Objects.nonNull(map)){
				return map;
			}
		}
		return null;
	}
	
	public DiffTaxQuery(PmsFunction<Collection<Integer>, List<Map<String, Object>>> fcn) throws Exception {
		super();
		this.fcn = fcn;
	}
	
	public void exec(Collection<Integer> taxIds) throws Exception{
		if(CollectionUtils.isNotEmpty(taxIds)){
			Collection<Integer>  colls = CollectionUtils.intersection(taxIds, taxMap.keySet());
			if(CollectionUtils.isNotEmpty(colls)){
				taxIds.removeAll(colls);
			}
			if(CollectionUtils.isNotEmpty(taxIds)){
				List<Map<String, Object>>  tmp = fcn.apply(taxIds);
				IterableUtils.forEach(tmp, m -> {
					taxMap.put(MapUtils.getInteger(m, "param_id"), m);
				});
			}
		}
	}
}
