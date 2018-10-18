/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.cache;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.util.StringUtil;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

/**
 * ## 类说明：
 * 	Redis单线程池，生成ID用
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.cache
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|RedisIdGenerator.java新增
*/
public class RedisIdGenerator {
	
	private static final ThreadFactory sThreadFactory = new ThreadFactory() {
        private final AtomicInteger mCount = new AtomicInteger(1);
        public Thread newThread(Runnable r) {
            return new Thread(r, "thread_pool_id_generator_" + mCount.getAndIncrement());
//            return new Thread(r, "thread_pool_id_generator_" + r.hashCode());
        }
	};
	
	// 单任务线程池：一个包含单线程的Executor,将多个任务交给此Exector时，这个线程处理完一个任务后接着处理下一个任务，若该线程出现异常，将会有一个新的线程来替代
//	private static ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
	
	//要使用带有ThreadFactory参数的ThreadPoolExecutor构造方法，方便设置线程名称
	private static ExecutorService singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, 
			                                                                     new LinkedBlockingQueue<Runnable>(Constant.BLOCKING_QUEUE_NUMBER), 
			                                                                     sThreadFactory);
	private static JedisCluster jc;
	private static Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();

	static{
		init();
	}
	
	private static void init(){
		// Jedis Cluster will attempt to discover cluster nodes
		// automatically
		String[] redisUrl = StringUtil.split((String)PropertyConfigurer.getContextProperty("redis.url"), ",");
		for (String url : redisUrl){
			String[] urls = StringUtil.split(url, ":");
			jedisClusterNodes.add(new HostAndPort(urls[0], Integer.valueOf(urls[1])));
		}
		jc = new JedisCluster(jedisClusterNodes);
		System.out.println("初始化RedisIdGenerator......"+jedisClusterNodes);
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param table_name 关键字
	 * @param maxId 崩溃时或初始化时，以数据库的序列为准
	 * @param num 区号数量
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static Object getSeq(final String table_name, final String maxId, final Integer num) throws InterruptedException, ExecutionException {
		Callable<Object> c = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				if (StringUtil.isNotEmpty(maxId)) {
					jc.set(table_name, maxId);
				}
				long id = jc.incrBy(table_name, num);
				return id;
			}
		};
		Future<Object> task = singleThreadExecutor.submit(c);
		return task.get();
	}

}
