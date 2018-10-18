package com.jw.base.framework.core.elasticsearch;


import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;

import com.jw.base.framework.core.elasticsearch.domain.OrderDomain;
import com.jw.base.framework.core.util.FastJsonUtil;

public class ESTest {

	private Client client;

	public ESTest() {
		this("192.168.18.200", 9300);
	}

	public ESTest(String ip, int port) {
		Settings settings = Settings.settingsBuilder().put("cluster.name", "my-elk-2.4.4").build();
		client = TransportClient.builder().settings(settings).build();
		client = ((TransportClient) client)
				.addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress(ip, port)));
	}

	public List<IndexResponse> createIndex(String indexName, String type, List<String> jsonArray) {
		IndexRequestBuilder builder = client.prepareIndex(indexName, type);
		List<IndexResponse> response = new ArrayList<IndexResponse>();
		for (String jsonTemp : jsonArray) {
			System.out.println(jsonTemp);
			builder = builder.setSource(jsonTemp);
			response.add(builder.execute().actionGet());
		}
		return response;
	}

	public List<OrderDomain> search(QueryBuilder queryBuilder, String indexName, String type) {
		List<OrderDomain> order = new ArrayList<>();

		SearchResponse sResponse = client.prepareSearch(indexName).setTypes(type).setQuery(queryBuilder).execute().actionGet();
		SearchHits hits = sResponse.getHits();

		System.out.println(hits.getTotalHits());
		SearchHit[] hitArray = hits.hits();
		for (SearchHit hit : hitArray) {
			Map<String, Object> map = hit.getSource();
			System.out.println(map);
			OrderDomain p = new OrderDomain();
			p.setId(Long.valueOf((Integer)map.get("id")) );
			p.setSkuName((String)map.get("skuName"));
			p.setUserName((String)map.get("userName"));
			order.add(p);
		}
		return order;
	}

	public static void main(String[] args) {
		ESTest esTest = new ESTest();

		OrderDomain o1 = new OrderDomain();
		o1.setId(1L);
		o1.setSkuName("skuName1");
		o1.setUserName("userName1");
		o1.setMemo("测试1");
		OrderDomain o2 = new OrderDomain();
		o2.setId(2L);
		o2.setSkuName("skuName2");
		o2.setUserName("userName2");
		o2.setMemo("测试2");
		List<String> jsonArray = new ArrayList<String>();
		jsonArray.add(FastJsonUtil.toJSONStringSerializer(o1));
		jsonArray.add(FastJsonUtil.toJSONStringSerializer(o2));
		
		String indexName = "lbw'sindex";// 要小写
		String type = "lbw'sType";
//		System.out.println(esTest.createIndex(indexName, type, jsonArray));

		QueryBuilder builder = QueryBuilders.matchAllQuery();
//		QueryBuilder builder = QueryBuilders.termQuery("age", "20");
		
		List<OrderDomain> list = esTest.search(builder, indexName, type);
		System.out.println(list);

	}

}
