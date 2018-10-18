package com.jw.base.framework.core.mongodb;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Sort.Order;

import com.jw.base.framework.core.util.page.Page;
import com.jw.common.framework.m0002.f001.dto.DataTableDto;

public interface MongoDao<T, PK> {
	public PK save(T entity);
	
	public void update(T entity);
	
	public void saveOrUpdate(T entity);
	
	public void saveOrUpdate(Collection<T> entities);
	
	public void delete(T entity);
	
	public void deleteAll(Collection<T> entities);
	
	public void deleteById(PK id);
	
	public T get(PK id);
	
	public List<T> getAll();
	
	public List<T> findBy(String propertyName, Object value);
	
	public List<T> findBy(Map<String, Object> paramMap, List<Order> orderList);
	
	public T findUniqueBy(String propertyName, Object value);
	
	public T findUniqueBy(Map<String, Object> paramMap, List<Order> orderList);
	
	public DataTableDto pageList(Map<String, Object> paramMap, List<Order> orderList, Page page);
	
}
