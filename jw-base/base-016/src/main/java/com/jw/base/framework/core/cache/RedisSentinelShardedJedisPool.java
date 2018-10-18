package com.jw.base.framework.core.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * 创建redis集群客户端 (这是一个集群并分片的连接池)
 */
public class RedisSentinelShardedJedisPool extends RedisSentinel implements FactoryBean<ShardedJedis>, InitializingBean {

	private ShardedJedis jwShardedJedis;
	
	private String host;
	private int port;
	private List<String> clusterName;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		RedisSentinel redisSentinelShardedJedisPool = new RedisSentinelShardedJedisPool(host, port, clusterName);
		jwShardedJedis = (ShardedJedis) redisSentinelShardedJedisPool.getResource();
	}

	@Override
	public ShardedJedis getObject() throws Exception {
		return jwShardedJedis;
	}

	@Override
	public Class<?> getObjectType() {
		return (this.jwShardedJedis != null ? this.jwShardedJedis.getClass() : ShardedJedis.class);
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
	public RedisSentinelShardedJedisPool(String host, int port, List<String> clusterName) {
		this.jedisSentinel = new Jedis(host, port);
		this.createShardedJedisPool();
		this.checkRedisSentinelServer(this, 5000, clusterName);
	}

	/**
	 * 创建多个集群共享的连接池
	 */
	private void createShardedJedisPool() {
		List<RedisInfo> redisInfos = new ArrayList<RedisInfo>();
		List<Map<String, String>> lists = jedisSentinel.sentinelMasters();
		for (int i = 0; i < lists.size(); i++) {
			Map<String, String> map = lists.get(i);
			System.out.println(map);
			RedisInfo redisInfo = new RedisInfo();
			redisInfo.setHost(map.get(IP));
			redisInfo.setPort(Integer.parseInt(map.get(PORT)));
			redisInfo.setName(map.get(NAME));
			redisInfos.add(redisInfo);
		}
		List<JedisShardInfo> shards = new ArrayList<JedisShardInfo>();
		for (int i = 0; i < redisInfos.size(); i++) {
			RedisInfo redisInfo = redisInfos.get(i);
			shards.add(new JedisShardInfo(redisInfo.getHost(), redisInfo.getPort(), redisInfo.getName()));
		}
		shardedJedisPool = new ShardedJedisPool(poolConfig, shards);
	}

	/**
	 * 返回redis 客户端资源
	 * 
	 * @return
	 */
	@Override
	public ShardedJedis getResource() {
		return shardedJedisPool.getResource();
	}

	/**
	 * 把资源返回连接池
	 * 
	 * @param shardedJedis
	 */
	@Override
	public void returnBrokenResource(ShardedJedis shardedJedis) {
		shardedJedisPool.returnBrokenResource(shardedJedis);
	}

	@Override
	public void returnBrokenResource(Jedis resource) {
		// TODO Auto-generated method stub
	}

	public ShardedJedisPool getShardedJedisPool() {
		return shardedJedisPool;
	}

	public Jedis getJedisSentinel() {
		return jedisSentinel;
	}

	public void setJedisSentinel(Jedis jedisSentinel) {
		this.jedisSentinel = jedisSentinel;
	}

	public ShardedJedis getJwShardedJedis() {
		return jwShardedJedis;
	}

	public void setJwShardedJedis(ShardedJedis jwShardedJedis) {
		this.jwShardedJedis = jwShardedJedis;
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
