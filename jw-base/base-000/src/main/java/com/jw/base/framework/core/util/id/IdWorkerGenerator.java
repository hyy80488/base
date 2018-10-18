/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.id;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.jw.base.framework.core.Constant;

/**
 * ## 类说明：
 * 	生成Id，多台机器上部署时，要保证机器的时间一致
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.id
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|IdWorkerGenerator.java新增
 */
public class IdWorkerGenerator {
	//单任务线程池：一个包含单线程的Executor,将多个任务交给此Exector时，这个线程处理完一个任务后接着处理下一个任务，若该线程出现异常，将会有一个新的线程来替代
//	private static ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
	private static ExecutorService singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(Constant.BLOCKING_QUEUE_NUMBER));

	/**
	 * ## 方法说明：
	 * 	描述
	 * @param workerId
	 * @param datacenterId
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
    public static Object getSeq(final long workerId,final long datacenterId) throws InterruptedException, ExecutionException {
        Callable<Object> c = new Callable<Object>() {
            @Override
            public Object call() throws Exception {
            	final IdWorker idWorker = new IdWorker(workerId, datacenterId);
                return idWorker.nextId();
            }
        };
        Future<Object> task = singleThreadExecutor.submit(c);
        return task.get();
    }

}
