/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.util.StringUtil;

import redis.clients.jedis.Jedis;


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

	// 单任务线程池：一个包含单线程的Executor,将多个任务交给此Exector时，这个线程处理完一个任务后接着处理下一个任务，若该线程出现异常，将会有一个新的线程来替代
//	private static ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
	private static ExecutorService singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(Constant.BLOCKING_QUEUE_NUMBER));
	private static Jedis jc;

	static{
		init();
	}
	
	private static void init(){
		String host = (String) PropertyConfigurer.getContextProperty("redisSentinel.host");
		int port = (Integer) PropertyConfigurer.getContextProperty("redisSentinel.port");
		String clusterName = (String) PropertyConfigurer.getContextProperty("redisSentinel.clusterName");
		List<String> serverName = new ArrayList<String>();
		serverName.add(clusterName);
		RedisSentinel redisSentinelJedisPool = new RedisSentinelJedisPool(host, port, serverName);
		jc = (Jedis) redisSentinelJedisPool.getResource();
		System.out.println("初始化RedisIdGenerator......");
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param table_name
	 * @param maxId
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static Object getSeq(final String table_name, final String maxId) throws InterruptedException, ExecutionException {
		Callable<Object> c = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				if (StringUtil.isNotEmpty(maxId)) {
					jc.set(table_name, maxId);
				}
				long id = jc.incrBy(table_name, 1);
				return id;
			}
		};
		Future<Object> task = singleThreadExecutor.submit(c);
		return task.get();
	}

}
