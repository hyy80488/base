/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.cache;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.util.StringUtil;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

/**
 * ## 类说明：
 * 	Redis集群工厂类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.cache
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JedisClusterFactory.java新增
*/

/**
 * JedisCluster源码解读:
 程序启动初始化集群环境：
1)、读取配置文件中的节点配置，无论是主从，无论多少个，只拿第一个，获取redis连接实例
2)、用获取的redis连接实例执行clusterNodes()方法，实际执行redis服务端cluster nodes命令，获取主从配置信息
3)、解析主从配置信息，先把所有节点存放到nodes的map集合中，key为节点的ip:port，value为当前节点的jedisPool
4)、解析主节点分配的slots区间段，把slot对应的索引值作为key，第三步中拿到的jedisPool作为value，存储在slots的map集合中
综上，就实现了slot槽索引值与jedisPool的映射，这个jedisPool包含了master的节点信息，所以槽和节点是对应的，与redis服务端一致

从集群环境存取值：
1)、把key作为参数，执行CRC16算法，获取key对应的slot值
2)、通过该slot值，去slots的map集合中获取jedisPool实例
3)、通过jedisPool实例获取jedis实例，最终完成redis数据存取工作

上述蓝色字体结论部分有错误，经过重新验证，得出一下结论： 
jediscluster可以实现客户端程序高可用，当出现master挂机，客户端程序通过catch语句块形式进行回调，完成重连操作，实现高可用机制； 
但是，redis集群环境是通过哨兵机制进行监控的，要考虑的哨兵机制的延迟性（替换挂机的master），客户端程序需要对因哨兵机制的延迟造成的影响进行处理（比如增加延迟重试、对指定jedisCluster异常进行捕获后再重试等），充分保证客户端程序高可用 
 */

public class JedisClusterFactory implements FactoryBean<JedisCluster>, InitializingBean {

	private GenericObjectPoolConfig genericObjectPoolConfig;
	private JedisCluster jedisCluster;
	private int connectionTimeout = 2000;
	private int soTimeout = 3000;
	private int maxRedirections = 5;
	private Set<String> jedisClusterNodes;

	/**
	 * 
	 * ## 方法说明：
	 * 	初始化
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		if (jedisClusterNodes == null || jedisClusterNodes.size() == 0) {
			jedisClusterNodes = new HashSet<String>();
			String[] redisUrl = StringUtil.split((String)PropertyConfigurer.getContextProperty("redis.url"), ",");
			for (String url : redisUrl){
				jedisClusterNodes.add(url);
			}
		}
		Set<HostAndPort> haps = new HashSet<HostAndPort>();
		for (String node : jedisClusterNodes) {
			String[] arr = node.split(":");
			if (arr.length != 2) {
				throw new ParseException("node address error !", node.length() - 1);
			}
			haps.add(new HostAndPort(arr[0], Integer.valueOf(arr[1])));
		}
		System.out.println("初始化JedisCluster......"+jedisClusterNodes);
		jedisCluster = new JedisCluster(haps, connectionTimeout, soTimeout, maxRedirections, genericObjectPoolConfig);
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 * @throws Exception
	 */
	@Override
	public JedisCluster getObject() throws Exception {
		return jedisCluster;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	@Override
	public Class<?> getObjectType() {
		return (this.jedisCluster != null ? this.jedisCluster.getClass() : JedisCluster.class);
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	public GenericObjectPoolConfig getGenericObjectPoolConfig() {
		return genericObjectPoolConfig;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param genericObjectPoolConfig
	 */
	public void setGenericObjectPoolConfig(GenericObjectPoolConfig genericObjectPoolConfig) {
		this.genericObjectPoolConfig = genericObjectPoolConfig;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	public JedisCluster getJedisCluster() {
		return jedisCluster;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param jedisCluster
	 */
	public void setJedisCluster(JedisCluster jedisCluster) {
		this.jedisCluster = jedisCluster;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param connectionTimeout
	 */
	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	public int getSoTimeout() {
		return soTimeout;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param soTimeout
	 */
	public void setSoTimeout(int soTimeout) {
		this.soTimeout = soTimeout;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	public int getMaxRedirections() {
		return maxRedirections;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param maxRedirections
	 */
	public void setMaxRedirections(int maxRedirections) {
		this.maxRedirections = maxRedirections;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	public Set<String> getJedisClusterNodes() {
		return jedisClusterNodes;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param jedisClusterNodes
	 */
	public void setJedisClusterNodes(Set<String> jedisClusterNodes) {
		this.jedisClusterNodes = jedisClusterNodes;
	}
}
