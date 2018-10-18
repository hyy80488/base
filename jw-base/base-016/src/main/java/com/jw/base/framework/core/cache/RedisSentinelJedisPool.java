package com.jw.base.framework.core.cache;

import java.util.List;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;

public class RedisSentinelJedisPool extends RedisSentinel implements FactoryBean<Jedis>, InitializingBean {

	private Jedis jwJedis;
	
	private String host;
	private int port;
	private List<String> clusterName;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		RedisSentinel redisSentinelJedisPool = new RedisSentinelJedisPool(host, port, clusterName);
		jwJedis = (Jedis) redisSentinelJedisPool.getResource();
	}
	
	@Override
	public Jedis getObject() throws Exception {
		return jwJedis;
	}
	
	@Override
	public Class<?> getObjectType() {
		return (this.jwJedis != null ? this.jwJedis.getClass() : Jedis.class);
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}
	
	/**
	 * 创建redis集群客户端
	 * @param host ip地址
	 * @param port 端口
	 * @param clusterName 群集名
	 */
	public RedisSentinelJedisPool(String host, int port, List<String> clusterName) {
		this.jedisSentinel = new Jedis(host, port);
		this.createJedisPool(clusterName);
		this.checkRedisSentinelServer(this, 5000, clusterName);
	}

	@Override
	public Object getResource() {
		return jedisPool.getResource();
	}

	@Override
	public void returnBrokenResource(ShardedJedis resource) {

	}

	@Override
	public void returnBrokenResource(Jedis resource) {
		jedisPool.returnBrokenResource(resource);
	}

	public Jedis getJwJedis() {
		return jwJedis;
	}

	public void setJwJedis(Jedis jwJedis) {
		this.jwJedis = jwJedis;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public List<String> getClusterName() {
		return clusterName;
	}

	public void setClusterName(List<String> clusterName) {
		this.clusterName = clusterName;
	}

}
