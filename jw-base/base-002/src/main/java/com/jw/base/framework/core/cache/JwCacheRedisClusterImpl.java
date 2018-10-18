/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.cache;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jw.base.framework.core.util.BeanUtil;
import com.jw.base.framework.core.util.StringUtil;
import com.jw.base.framework.core.util.TSerUtils;

import redis.clients.jedis.BinaryClient.LIST_POSITION;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisClusterCommand;
import redis.clients.jedis.JedisClusterConnectionHandler;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.SortingParams;

/**
 * ## 类说明：
 * 	缓存Redis实现
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.cache
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JwCacheRedisImpl.java新增
*/
@Component("redisImpl")
public class JwCacheRedisClusterImpl implements JwCache {

	@Autowired
	JedisCluster jedisCluster;

	public JwCacheRedisClusterImpl(){
	}
	
	public JwCacheRedisClusterImpl(JedisCluster jedisCluster) {
		this.jedisCluster = jedisCluster;
	}

	/**
	 * ## 方法说明：
	 * 	设置单体 Byte
	 * @param key String to Byte
	 * @param value Convert object to byte array
	 */
	@Override
	public <T> String setObj(String key, T value) {
		String str = "";
		if (!StringUtil.isEmpty(key) && null != value) {
			str = jedisCluster.set(key.getBytes(Charset.forName("utf-8")), TSerUtils.serial(value));
		}
		return str;
	}

	/**
	 * ## 方法说明：
	 * 	获取单体 Byte
	 * @param key String to Byte
	 * @return Byte Array to Object
	 */
	@Override
	public <T> T getObj(String key) {
		T value = null;
		if (!StringUtil.isEmpty(key)) {
			byte[] values = jedisCluster.get(key.getBytes(Charset.forName("utf-8")));
			if (values == null || (values != null && values.length <= 0)) {
				return null;
			}
			value = TSerUtils.byteArr2T(values);
		}
		return value;
	}

	/**
	 * ## 方法说明：
	 * 	设置单体
	 * @param key
	 * @param value
	 */
	@Override
	public String setString(String key, String value) {
		return jedisCluster.set(key, value);
	}
	
	/** 
	 * ## 方法说明：
	 * 	查询相似的可以
	 * @param key
	 * @return
	*/
	@Override
	public Set<String> keys(final String key) {
		Set<String> keys = new HashSet<>();
		Map<String, JedisPool> clusterNodes = jedisCluster.getClusterNodes();
		for(String k : clusterNodes.keySet()){
			JedisPool jp = clusterNodes.get(k);
			Jedis connection = jp.getResource();
			try {
				keys.addAll(connection.keys(key));
			} catch(Exception e){
			} finally{
				connection.close();//用完一定要close这个链接！！！
			}
		}
		return keys;
	}
	
	/** 
	 * ## 方法说明：
	 * 	设置单体值
	 * @param key
	 * @param value
	 * @param nxxx
	 * @param expx
	 * @param time
	 * @return
	*/
	@Override
	public String set(final String key, final String value, final String nxxx, final String expx, final long time) {
		return jedisCluster.set(key, value, nxxx, expx, time);
	}

	/**
	 * ## 方法说明：
	 * 	获取单体
	 * @param key
	 * @return
	 */
	@Override
	public String getString(String key) {
		return jedisCluster.get(key);
	}

	/**
	 * ## 方法说明：
	 * 	删除单体
	 * 	keySlot算法中，如果key包含{}，就会使用第一个{}内部的字符串作为hash key，这样就可以保证拥有同样{}内部字符串的key就会拥有相同slot。
	 * @param key
	 * @return
	 */
	@Override
	public <T> Long del(String key) {
		return jedisCluster.del(key.getBytes(Charset.forName("utf-8")));
	}

	/**
	 * ## 方法说明：
	 * 	清空所有key
	 * @return
	 */
	//	public String flushAll() {
	//		return jedisCluster.flushAll();
	//	}

	/**
	 * ## 方法说明：
	 * 	更改key
	 * @param oldkey
	 * @param newkey
	 * @return 状态码
	 */
	@Override
	public String rename(String oldkey, String newkey) {
		return jedisCluster.rename(oldkey, newkey);
	}

	/**
	 * ## 方法说明：
	 * 	更改key,仅当新key不存在时才执行
	 * @param oldkey
	 * @param newkey
	 * @return 状态码
	 */
	@Override
	public long renamenx(String oldkey, String newkey) {
		return jedisCluster.renamenx(oldkey, newkey);
	}

	/**
	 * ## 方法说明：
	 * 	设置key的过期时间，以秒为单位
	 * @param key
	 * @param seconds
	 * @return 影响的记录数
	 */
	@Override
	public long expired(String key, int seconds) {
		return jedisCluster.expire(key, seconds);
	}

	/**
	 * ## 方法说明：
	 * 	查询key的过期时间
	 * @param key
	 * @return 以秒为单位的时间表示
	 */
	@Override
	public long ttl(String key) {
		return jedisCluster.ttl(key);
	}

	/**
	 * ## 方法说明：
	 * 	取消对key过期时间的设置
	 * @param key
	 * @return 影响的记录数
	 */
	@Override
	public long persist(String key) {
		return jedisCluster.persist(key);
	}

	/**
	 * ## 方法说明：
	 * 	判断key是否存在
	 * @param key
	 * @return boolean
	 */
	@Override
	public boolean exists(String key) {
		return jedisCluster.exists(key);
	}

	/**
	 * ## 方法说明：
	 * 	对List,Set,SortSet进行排序,如果集合数据较大应避免使用这个方法
	 * @param key
	 * @return List 集合的全部记录
	 */
	@Override
	public List<String> sort(String key) {
		return jedisCluster.sort(key);
	}

	/**
	 * ## 方法说明：
	 * 	对List,Set,SortSet进行排序或limit
	 * @param key
	 * @param parame 定义排序类型或limit的起止位置
	 * @return List 全部或部分记录
	 */
	@Override
	public List<String> sort(String key, SortingParams parame) {
		return jedisCluster.sort(key, parame);
	}

	/**
	 * ## 方法说明：
	 * 	返回指定key存储的类型
	 * @param key
	 * @return String string|list|set|zset|hash
	 */
	@Override
	public String type(String key) {
		return jedisCluster.type(key);
	}

	/**
	 * ## 方法说明：
	 * 	向Set添加一条记录，如果member已存在返回0,否则返回1
	 * @param key
	 * @param member
	 * @return 操作码,0或1
	 */
	@Override
	public long sadd(String key, String member) {
		return jedisCluster.sadd(key, member);
	}

	/**
	 * ## 方法说明：
	 * 	获取给定key中元素个数
	 * @param key
	 * @return 元素个数
	 */
	@Override
	public long scard(String key) {
		return jedisCluster.scard(key);
	}

	/**
	 * ## 方法说明：
	 * 	返回从第一组和所有的给定集合之间的差异的成员
	 * @param keys
	 * @return 差异的成员集合
	 */
	@Override
	public Set<String> sdiff(String... keys) {
		return jedisCluster.sdiff(keys);
	}

	/**
	 * ## 方法说明：
	 * 	这个命令等于sdiff,但返回的不是结果集,而是将结果集存储在新的集合中，如果目标已存在，则覆盖。
	 * @param newkey 新结果集的key
	 * @param keys 比较的集合
	 * @return 新集合中的记录数
	 */
	@Override
	public long sdiffstore(String newkey, String... keys) {
		return jedisCluster.sdiffstore(newkey, keys);
	}

	/**
	 * ## 方法说明：
	 * 	返回给定集合交集的成员,如果其中一个集合为不存在或为空，则返回空Set
	 * @param keys
	 * @return 交集成员的集合
	 */
	@Override
	public Set<String> sinter(String... keys) {
		return jedisCluster.sinter(keys);
	}

	/**
	 * ## 方法说明：
	 * 	这个命令等于sinter,但返回的不是结果集,而是将结果集存储在新的集合中，如果目标已存在，则覆盖。
	 * @param newkey 新结果集的key
	 * @param keys 比较的集合
	 * @return 新集合中的记录数
	 */
	@Override
	public long sinterstore(String newkey, String... keys) {
		return jedisCluster.sinterstore(newkey, keys);
	}

	/**
	 * ## 方法说明：
	 * 	确定一个给定的值集合中是否存在
	 * @param key
	 * @param member
	 * @return 存在返回1，不存在返回0
	 */
	@Override
	public boolean sismember(String key, String member) {
		return jedisCluster.sismember(key, member);
	}

	/**
	 * ## 方法说明：
	 * 	返回集合中的所有成员
	 * @param key
	 * @return 成员集合
	 */
	@Override
	public Set<String> smembers(String key) {
		return jedisCluster.smembers(key);
	}

	/**
	 * ## 方法说明：
	 * 	将成员从源集合移出放入目标集合 
	 * 	如果源集合不存在或不包哈指定成员，不进行任何操作，返回0
	 * 	否则该成员从源集合上删除，并添加到目标集合，如果目标集合中成员已存在，则只在源集合进行删除
	 * @param srckey 源集合
	 * @param dstkey 目标集合
	 * @param member 源集合中的成员
	 * @return 状态码，1成功，0失败
	 */
	@Override
	public long smove(String srckey, String dstkey, String member) {
		return jedisCluster.smove(srckey, dstkey, member);
	}

	/**
	 * ## 方法说明：
	 * 	从集合中删除成员
	 * @param key
	 * @return 被删除的成员
	 */
	@Override
	public String spop(String key) {
		return jedisCluster.spop(key);
	}

	/**
	 * ## 方法说明：
	 * 	从集合中删除指定成员
	 * @param key
	 * @param member 要删除的成员
	 * @return 状态码，成功返回1，成员不存在返回0
	 */
	@Override
	public long srem(String key, String member) {
		return jedisCluster.srem(key, member);
	}

	/**
	 * ## 方法说明：
	 * 	合并多个集合并返回合并后的结果，合并后的结果集合并不保存<p>
	 * @param keys
	 * @return 合并后的结果集合
	 */
	@Override
	public Set<String> sunion(String... keys) {
		return jedisCluster.sunion(keys);
	}

	/**
	 * ## 方法说明：
	 * 	合并多个集合并将合并后的结果集保存在指定的新集合中，如果新集合已经存在则覆盖
	 * @param newkey 新集合的key
	 * @param keys 要合并的集合
	 * @return 
	 */
	@Override
	public long sunionstore(String newkey, String... keys) {
		return jedisCluster.sunionstore(newkey, keys);
	}

	/**
	 * ## 方法说明：
	 * 	向集合中增加一条记录,如果这个值已存在，这个值对应的权重将被置为新的权重
	 * @param key
	 * @param score 权重
	 * @param member 要加入的值
	 * @return 状态码 1成功，0已存在member的值
	 */
	@Override
	public long zadd(String key, double score, String member) {
		return jedisCluster.zadd(key, score, member);
	}

	/**
	 * ## 方法说明：
	 * 	获取集合中元素的数量
	 * @param key
	 * @return 如果返回0则集合不存在
	 */
	@Override
	public long zcard(String key) {
		return jedisCluster.zcard(key);
	}

	/**
	 * ## 方法说明：
	 * 	获取指定权重区间内集合的数量
	 * @param key
	 * @param min 最小排序位置
	 * @param max 最大排序位置
	 * @return 
	 */
	@Override
	public long zcount(String key, double min, double max) {
		return jedisCluster.zcount(key, min, max);
	}

	/**
	 * ## 方法说明：
	 * 	返回指定位置的集合元素,0为第一个元素，-1为最后一个元素
	 * @param key
	 * @param start 开始位置(包含)
	 * @param end 结束位置(包含)
	 * @return Set
	 */
	@Override
	public Set<String> zrange(String key, int start, int end) {
		return jedisCluster.zrange(key, start, end);
	}

	/**
	 * ## 方法说明：
	 * 	获得set的长度
	 * @param key
	 * @return 
	 */
	@Override
	public long zlength(String key) {
		long len = 0;
		Set<String> set = zrange(key, 0, -1);
		len = set.size();
		return len;
	}

	/**
	 * ## 方法说明：
	 * 	权重增加给定值，如果给定的member已存在
	 * @param key
	 * @param score 要增的权重
	 * @param member 要插入的值
	 * @return 增后的权重
	 */
	@Override
	public double zincrby(String key, double score, String member) {
		return jedisCluster.zincrby(key, score, member);
	}

	/**
	 * ## 方法说明：
	 * 	返回指定权重区间的元素集合
	 * @param key
	 * @param min 上限权重
	 * @param max 下限权重
	 * @return Set
	 */
	@Override
	public Set<String> zrangeByScore(String key, double min, double max) {
		return jedisCluster.zrangeByScore(key, min, max);
	}

	/**
	 * ## 方法说明：
	 * 	获取指定值在集合中的位置，集合排序从低到高
	 * @param key
	 * @param member
	 * @return long 位置
	 */
	@Override
	public long zrank(String key, String member) {
		return jedisCluster.zrank(key, member);
	}

	/**
	 * ## 方法说明：
	 * 	获取指定值在集合中的位置，集合排序从高到低
	 * @param key
	 * @param member
	 * @return long 位置
	 */
	@Override
	public long zrevrank(String key, String member) {
		return jedisCluster.zrevrank(key, member);
	}

	/**
	 * ## 方法说明：
	 * 	从集合中删除成员
	 * @param key
	 * @param member
	 * @return long 返回1成功
	 */
	@Override
	public long zrem(String key, String member) {
		return jedisCluster.zrem(key, member);
	}

	/**
	 * ## 方法说明：
	 * 	删除给定位置区间的元素
	 * @param key
	 * @param start 开始区间，从0开始(包含)
	 * @param end 结束区间,-1为最后一个元素(包含)
	 * @return 删除的数量
	 */
	@Override
	public long zremrangeByRank(String key, int start, int end) {
		return jedisCluster.zremrangeByRank(key, start, end);
	}

	/**
	 * ## 方法说明：
	 * 	删除给定权重区间的元素
	 * @param key
	 * @param min 下限权重(包含)
	 * @param max 上限权重(包含)
	 * @return 删除的数量
	 */
	@Override
	public long zremrangeByScore(String key, double min, double max) {
		return jedisCluster.zremrangeByScore(key, min, max);
	}

	/**
	 * ## 方法说明：
	 * 	获取给定区间的元素，原始按照权重由高到低排序
	 * 
	 * @param key
	 * @param start
	 * @param end
	 * @return Set
	 */
	@Override
	public Set<String> zrevrange(String key, int start, int end) {
		return jedisCluster.zrevrange(key, start, end);
	}

	/**
	 * ## 方法说明：
	 * 	获取给定值在集合中的权重
	 * @param key
	 * @param memeber
	 * @return double 权重
	 */
	@Override
	public double zscore(String key, String memeber) {
		return jedisCluster.zscore(key, memeber);
	}

	/**
	 * ## 方法说明：
	 * 	从hash中删除指定的存储
	 * @param key
	 * @param fieid 存储的名字
	 * @return 状态码，1成功，0失败
	 */
	@Override
	public long hdel(String key, String fieid) {
		return jedisCluster.hdel(key, fieid);
	}

	/**
	 * ## 方法说明：
	 * 	测试hash中指定的存储是否存在
	 * @param key
	 * @param fieid 存储的名字
	 * @return 1存在，0不存在
	 */
	@Override
	public boolean hexists(String key, String fieid) {
		return jedisCluster.hexists(key, fieid);
	}

	/**
	 * ## 方法说明：
	 * 	返回hash中指定存储位置的值
	 * @param key
	 * @param fieid 存储的名字
	 * @return 存储对应的值
	 */
	@Override
	public String hget(String key, String fieid) {
		return jedisCluster.hget(key, fieid);
	}

	/**
	 * ## 方法说明：
	 * 	以Map的形式返回hash中的存储和值
	 * @param key
	 * @return Map
	 */
	@Override
	public Map<String, String> hgetAll(String key) {
		return jedisCluster.hgetAll(key);
	}

	/**
	 * ## 方法说明：
	 * 	添加一个对应关系
	 * @param key
	 * @param fieid
	 * @param value
	 * @return 状态码 1成功，0失败，fieid已存在将更新，也返回0
	 */
	@Override
	public long hset(String key, String fieid, String value) {
		return jedisCluster.hset(key, fieid, value);
	}

	/**
	 * ## 方法说明：
	 * 	添加对应关系，只有在fieid不存在时才执行
	 * @param key
	 * @param fieid
	 * @param value
	 * @return 状态码 1成功，0失败fieid已存
	 */
	@Override
	public long hsetnx(String key, String fieid, String value) {
		return jedisCluster.hsetnx(key, fieid, value);
	}

	/**
	 * ## 方法说明：
	 * 	获取hash中value的集合
	 * @param key
	 * @return List
	 */
	@Override
	public List<String> hvals(String key) {
		return jedisCluster.hvals(key);
	}

	/**
	 * ## 方法说明：
	 * 	在指定的存储位置加上指定的数字，存储位置的值必须可转为数字类型
	 * @param key
	 * @param fieid 存储位置
	 * @param value 要增加的值,可以是负数
	 * @return 增加指定数字后，存储位置的值
	 */
	@Override
	public long hincrby(String key, String fieid, long value) {
		return jedisCluster.hincrBy(key, fieid, value);
	}

	/**
	 * ## 方法说明：
	 * 	返回指定hash中的所有存储名字,类似Map中的keySet方法
	 * @param key
	 * @return Set 存储名称的集合
	 */
	@Override
	public Set<String> hkeys(String key) {
		return jedisCluster.hkeys(key);
	}

	/**
	 * ## 方法说明：
	 * 	获取hash中存储的个数，类似Map中size方法
	 * @param key
	 * @return long 存储的个数
	 */
	@Override
	public long hlen(String key) {
		return jedisCluster.hlen(key);
	}

	/**
	 * ## 方法说明：
	 * 	根据多个key，获取对应的value，返回List,如果指定的key不存在,List对应位置为null
	 * @param key
	 * @param fieids 存储位置
	 * @return List
	 */
	@Override
	public List<String> hmget(String key, String... fieids) {
		return jedisCluster.hmget(key, fieids);
	}

	/**
	 * ## 方法说明：
	 * 	添加对应关系，如果对应关系已存在，则覆盖
	 * @param key
	 * @param map 对应关系
	 * @return 状态，成功返回OK
	 */
	@Override
	public String hmset(String key, Map<String, String> map) {
		return jedisCluster.hmset(key, map);
	}

	/**
	 * ## 方法说明：
	 * 	添加对应关系，如果对应关系已存在，则覆盖
	 * @param key
	 * @param map 对应关系
	 * @return 状态，成功返回OK
	 */
	@Override
	public String hmset(byte[] key, Map<byte[], byte[]> map) {
		return jedisCluster.hmset(key, map);
	}

	/**
	 * ## 方法说明：
	 * 	添加有过期时间的记录
	 * @param key
	 * @param seconds 过期时间，以秒为单位
	 * @param value
	 * @return String 操作状态
	 */
	@Override
	public String setEx(String key, int seconds, String value) {
		return jedisCluster.setex(key, seconds, value);
	}

	/**
	 * ## 方法说明：
	 * 	添加一条记录，仅当给定的key不存在时才插入
	 * @param key
	 * @param value
	 * @return long 状态码，1插入成功且key不存在，0未插入，key存在
	 */
	@Override
	public long setnx(String key, String value) {
		return jedisCluster.setnx(key, value);
	}

	/**
	 * ## 方法说明：
	 * 	从指定位置开始插入数据，插入的数据会覆盖指定位置以后的数据
	 * 	例:String str1="123456789";
	 * 	对str1操作后setRange(key,4,0000)，str1="123400009";
	 * @param key
	 * @param offset
	 * @param value
	 * @return long value的长度
	 */
	@Override
	public long setRange(String key, long offset, String value) {
		return jedisCluster.setrange(key, offset, value);
	}

	/**
	 * ## 方法说明：
	 * 	在指定的key中追加value
	 * @param key
	 * @param value
	 * @return long 追加后value的长度
	 */
	@Override
	public long append(String key, String value) {
		return jedisCluster.append(key, value);
	}

	/**
	 * ## 方法说明：
	 * 	将key对应的value减去指定的值，只有value可以转为数字时该方法才可用
	 * @param key
	 * @param number 要减去的值
	 * @return long 减指定值后的值
	 */
	@Override
	public long decrBy(String key, long number) {
		return jedisCluster.decrBy(key, number);
	}

	/**
	 * ## 方法说明：
	 * 	可以作为获取唯一id的方法
	 * 	将key对应的value加上指定的值，只有value可以转为数字时该方法才可用
	 * @param key
	 * @param number 要减去的值
	 * @return long 相加后的值
	 */
	@Override
	public long incrBy(String key, long number) {
		return jedisCluster.incrBy(key, number);
	}

	/**
	 * ## 方法说明：
	 * 	对指定key对应的value进行截取 
	 * @param key
	 * @param startOffset 开始位置(包含)
	 * @param endOffset 结束位置(包含)
	 * @return String 截取的值
	 */
	@Override
	public String getrange(String key, long startOffset, long endOffset) {
		return jedisCluster.getrange(key, startOffset, endOffset);
	}

	/**
	 * ## 方法说明：
	 * 	获取并设置指定key对应的value
	 * 	如果key存在返回之前的value,否则返回null
	 * @param key
	 * @param value
	 * @return String 原始value或null
	 */
	@Override
	public String getSet(String key, String value) {
		return jedisCluster.getSet(key, value);
	}

	/**
	 * ## 方法说明：
	 * 	批量获取记录,如果指定的key不存在返回List的对应位置将是null
	 * @param keys
	 * @return List 值得集合
	 */
	@Override
	public List<String> mget(String... keys) {
		return jedisCluster.mget(keys);
	}

	/**
	 * ## 方法说明：
	 * 	批量存储记录
	 * 	keySlot算法中，如果key包含{}，就会使用第一个{}内部的字符串作为hash key，这样就可以保证拥有同样{}内部字符串的key就会拥有相同slot。
	 * @param keysvalues 例:keysvalues="key1","value1","key2","value2";
	 * @return String 状态码 
	 */
	@Override
	public String mset(String... keysvalues) {
		return jedisCluster.mset(keysvalues);
	}

	/**
	 * ## 方法说明：
	 * 	获取key对应的值的长度
	 * @param key
	 * @return value值得长度
	 */
	@Override
	public long strlen(String key) {
		return jedisCluster.strlen(key);
	}

	/**
	 * ## 方法说明：
	 * 	List长度
	 * @param key
	 * @return 长度
	 */
	@Override
	public long llen(byte[] key) {
		return jedisCluster.llen(key);
	}

	/**
	 * ## 方法说明：
	 * 	List长度
	 * @param key
	 * @return 长度
	 */
	@Override
	public long llen(String key) {
		return jedisCluster.llen(key);
	}

	/**
	 * ## 方法说明：
	 * 	覆盖操作,将覆盖List中指定位置的值
	 * @param key
	 * @param index 位置
	 * @param value 值
	 * @return 状态码
	 */
	@Override
	public String lset(byte[] key, int index, byte[] value) {
		return jedisCluster.lset(key, index, value);
	}

	/**
	 * ## 方法说明：
	 * 	在指定位置插入记录
	 * @param key
	 * @param where 前面插入或后面插入
	 * @param pivot 相对位置的内容
	 * @param value 插入的内容
	 * @return 记录总数
	 */
	@Override
	public long linsert(byte[] key, LIST_POSITION where, byte[] pivot, byte[] value) {
		return jedisCluster.linsert(key, where, pivot, value);
	}

	/**
	 * ## 方法说明：
	 * 	获取List中指定位置的值 
	 * @param key
	 * @param index 位置
	 * @return 值
	 */
	@Override
	public byte[] lindex(byte[] key, int index) {
		return jedisCluster.lindex(key, index);
	}

	/**
	 * ## 方法说明：
	 * 	将List中的第一条记录移出List
	 * @param key
	 * @return 移出的记录
	 */
	@Override
	public byte[] lpop(byte[] key) {
		return jedisCluster.lpop(key);
	}

	/**
	 * ## 方法说明：
	 * 	将List中的第一条记录移出List
	 * @param key
	 * @return 移出的记录
	 */
	@Override
	public String lpop(String key) {
		return jedisCluster.lpop(key);
	}

	/**
	 * ## 方法说明：
	 * 	将List中最后第一条记录移出List
	 * @param key
	 * @return 移出的记录
	 */
	@Override
	public byte[] rpop(byte[] key) {
		return jedisCluster.rpop(key);
	}

	/**
	 * ## 方法说明：
	 * 	将List中最后第一条记录移出List
	 * @param key
	 * @return 移出的记录
	 */
	@Override
	public String rpop(String key) {
		return jedisCluster.rpop(key);
	}

	/**
	 * ## 方法说明：
	 * 	向List头部追加记录
	 * @param key
	 * @param value
	 * @return 记录总数
	 */
	@Override
	public long rpush(String key, String value) {
		return jedisCluster.rpush(key, value);
	}

	/**
	 * ## 方法说明：
	 * 	向List头部追加记录
	 * @param key
	 * @param value
	 * @return 记录总数
	 */
	@Override
	public long rpush(byte[] key, byte[] value) {
		return jedisCluster.rpush(key, value);
	}

	/**
	 * ## 方法说明：
	 * 	向List中追加记录
	 * @param key
	 * @param value
	 * @return 记录总数
	 */
	@Override
	public long lpush(String key, String value) {
		return jedisCluster.lpush(key, value);
	}
	
	/**
	 * ## 方法说明：
	 * 	向List中追加记录
	 * @param key
	 * @param value
	 * @return 记录总数
	 */
	@Override
	public long lpush(byte[] key, byte[] value) {
		return jedisCluster.lpush(key, value);
	}

	/**
	 * ## 方法说明：
	 * 	获取指定范围的记录，可以做为分页使用
	 * @param key
	 * @param start
	 * @param end
	 * @return List
	 */
	@Override
	public List<String> lrange(String key, long start, long end) {
		return jedisCluster.lrange(key, start, end);
	}

	/**
	 * ## 方法说明：
	 * 	获取指定范围的记录，可以做为分页使用
	 * @param key
	 * @param start
	 * @param end 如果为负数，则尾部开始计算
	 * @return List
	 */
	@Override
	public List<byte[]> lrange(byte[] key, int start, int end) {
		return jedisCluster.lrange(key, start, end);
	}

	/**
	 * ## 方法说明：
	 * 	删除List中c条记录，被删除的记录值为value
	 * @param key
	 * @param c 要删除的数量，如果为负数则从List的尾部检查并删除符合的记录
	 * @param value 要匹配的值
	 * @return 删除后的List中的记录数
	 */
	@Override
	public long lrem(byte[] key, int c, byte[] value) {
		return jedisCluster.lrem(key, c, value);
	}

	/**
	 * ## 方法说明：
	 * 	算是删除吧，只保留start与end之间的记录
	 * @param key
	 * @param start 记录的开始位置(0表示第一条记录)
	 * @param end 记录的结束位置（如果为-1则表示最后一个，-2，-3以此类推）
	 * @return 执行状态码
	 */
	@Override
	public String ltrim(byte[] key, int start, int end) {
		return jedisCluster.ltrim(key, start, end);
	}

	/**
	 * ## 方法说明：
	 * 	算是删除吧，只保留start与end之间的记录
	 * @param key
	 * @param start 记录的开始位置(0表示第一条记录)
	 * @param end 记录的结束位置（如果为-1则表示最后一个，-2，-3以此类推）
	 * @return 执行状态码
	 */
	@Override
	public String ltrim(String key, int start, int end) {
		return jedisCluster.ltrim(key, start, end);
	}

	/**
	 * ## 方法说明：
	 * 	Destroy the pool.
	 */
	@Override
	public void destroy() {
		if (null != jedisCluster) {
			try {
				this.jedisCluster.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
