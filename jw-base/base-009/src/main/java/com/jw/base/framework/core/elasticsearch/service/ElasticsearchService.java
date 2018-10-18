package com.jw.base.framework.core.elasticsearch.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.index.query.TermsQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Component;

@Component
public class ElasticsearchService implements InitializingBean {

	private static final Logger logger = LoggerFactory.getLogger(ElasticsearchService.class);

	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;

	@Autowired
	private Client clientElasticsearch;

	/** 查询 id */
	public List<String> queryId(String esIndexName, String type, String[] fields, String content, String sortField, SortOrder order,
			int from, int size) {
		SearchRequestBuilder reqBuilder = clientElasticsearch.prepareSearch(esIndexName).setTypes(type)
				.setSearchType(SearchType.DEFAULT).setExplain(true);
		QueryStringQueryBuilder queryString = QueryBuilders.queryStringQuery("\"" + content + "\"");
		for (String k : fields) {
			queryString.field(k);
		}
		queryString.minimumShouldMatch("10");
		reqBuilder.setQuery(QueryBuilders.boolQuery().should(queryString)).setExplain(true);
		if (StringUtils.isNotEmpty(sortField) && order != null) {
			reqBuilder.addSort(sortField, order);
		}
		if (from >= 0 && size > 0) {
			reqBuilder.setFrom(from).setSize(size);
		}
		SearchResponse resp = reqBuilder.execute().actionGet();
		SearchHit[] hits = resp.getHits().getHits();
		ArrayList<String> results = new ArrayList<String>();
		for (SearchHit hit : hits) {
			results.add(hit.getId());
		}
		return results;
	}

	/**
	 * 查询得到结果为Map集合
	 */
	public List<Map<String, Object>> queryForObject(String esIndexName, String type, String[] fields, String content, String sortField, SortOrder order, int from, int size) {
		SearchRequestBuilder reqBuilder = clientElasticsearch.prepareSearch(esIndexName).setTypes(type).setSearchType(SearchType.DEFAULT).setExplain(true);
		QueryStringQueryBuilder queryString = QueryBuilders.queryStringQuery("\"" + content + "\"");
		for (String k : fields) {
			queryString.field(k);
		}
		queryString.minimumShouldMatch("10");
		reqBuilder.setQuery(QueryBuilders.boolQuery().should(queryString)).setExplain(true);
		if (StringUtils.isNotEmpty(sortField) && order != null) {
			reqBuilder.addSort(sortField, order);
		}
		if (from >= 0 && size > 0) {
			reqBuilder.setFrom(from).setSize(size);
		}

		SearchResponse resp = reqBuilder.execute().actionGet();
		SearchHit[] hits = resp.getHits().getHits();

		List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();
		for (SearchHit hit : hits) {
			results.add(hit.getSource());
		}
		return results;
	}

	/**
	 * QueryBuilders 所有查询入口
	 */
	public List<Map<String, Object>> queryForObjectEq(String esIndexName, String type, String[] fields, String content, String sortField, SortOrder order, int from, int size) {
		SearchRequestBuilder reqBuilder = clientElasticsearch.prepareSearch(esIndexName).setTypes(type).setSearchType(SearchType.DEFAULT).setExplain(true);
		QueryStringQueryBuilder queryString = QueryBuilders.queryStringQuery("\"" + content + "\"");
		for (String k : fields) {
			queryString.field(k);
		}
		queryString.minimumShouldMatch("10");
		reqBuilder.setQuery(QueryBuilders.boolQuery().must(queryString)).setExplain(true);
		if (StringUtils.isNotEmpty(sortField) && order != null) {
			reqBuilder.addSort(sortField, order);
		}
		if (from >= 0 && size > 0) {
			reqBuilder.setFrom(from).setSize(size);
		}

		SearchResponse resp = reqBuilder.execute().actionGet();
		SearchHit[] hits = resp.getHits().getHits();

		List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();
		for (SearchHit hit : hits) {
			results.add(hit.getSource());
		}
		return results;
	}

	/**
	 * 多个文字记不清是那些字,然后放进去查询
	 */
	public List<Map<String, Object>> queryForObjectNotEq(String esIndexName, String type, String field, Collection<String> countents, String sortField, SortOrder order, int from, int size) {

		SearchRequestBuilder reqBuilder = clientElasticsearch.prepareSearch(esIndexName).setTypes(type).setSearchType(SearchType.DEFAULT).setExplain(true);
		List<String> contents = new ArrayList<String>();
		for (String content : countents) {
			contents.add("\"" + content + "\"");
		}
		TermsQueryBuilder inQuery = QueryBuilders.termsQuery(field, contents);
		inQuery.minimumShouldMatch("10");
		reqBuilder.setQuery(QueryBuilders.boolQuery().mustNot(inQuery)).setExplain(true);
		if (StringUtils.isNotEmpty(sortField) && order != null) {
			reqBuilder.addSort(sortField, order);
		}
		if (from >= 0 && size > 0) {
			reqBuilder.setFrom(from).setSize(size);
		}

		SearchResponse resp = reqBuilder.execute().actionGet();
		SearchHit[] hits = resp.getHits().getHits();

		List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();
		for (SearchHit hit : hits) {
			results.add(hit.getSource());
		}
		return results;
	}

	/**
	 * Filters 查询方式
	 * 
	 * 1. 1)QueryBuilders.queryString 获得基本查询 2)FilteredQueryBuilder query =
	 * QueryBuilders.filteredQuery(queryString,FilterBuilder)
	 * 3)通过上面封装成为查询,将这个query插入到reqBuilder中;完成操作
	 * 
	 * 2.在 reqBuilder.setQuery(query);
	 * 
	 * 3.介绍在2)中的FilterBuilder各种构造方式-参数都可以传String类型即可
	 * FilterBuilders.rangeFilter("taskState").lt(20) 小于 、 lte(20) 小于等于
	 * FilterBuilders.rangeFilter("taskState").gt(20)) 大于 、 gte(20) 大于等于
	 * FilterBuilders.rangeFilter("taskState").from(start).to(end))
	 * 范围,也可以指定日期,用字符串就ok了
	 */
	public List<Map<String, Object>> queryForObjectForElasticSerch(String esIndexName, String type, String field, String content, int start, int end) {

		SearchRequestBuilder reqBuilder = clientElasticsearch.prepareSearch(esIndexName).setTypes(type).setSearchType(SearchType.DEFAULT).setExplain(true);
		QueryStringQueryBuilder queryString = QueryBuilders.queryStringQuery("\"" + content + "\"");
		queryString.field(field);
		queryString.minimumShouldMatch("10");

		reqBuilder.setQuery(
				QueryBuilders.filteredQuery(queryString, QueryBuilders.rangeQuery("taskState").from(start).to(end)))
				.setExplain(true);

		SearchResponse resp = reqBuilder.execute().actionGet();
		SearchHit[] hits = resp.getHits().getHits();

		List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();
		for (SearchHit hit : hits) {
			results.add(hit.getSource());
		}
		return results;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init...");
	}
	
}
