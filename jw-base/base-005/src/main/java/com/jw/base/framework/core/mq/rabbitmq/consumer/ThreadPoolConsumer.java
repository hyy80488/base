/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.base.framework.core.mq.rabbitmq.consumer;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.mq.JwMessageProcess;
import com.jw.base.framework.core.mq.common.DetailRes;
import com.jw.base.framework.core.mq.rabbitmq.consumer.MessageConsumer;

public class ThreadPoolConsumer<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(ThreadPoolConsumer.class);
	
    private ExecutorService executor;
    private volatile boolean stop = false;
    private final ThreadPoolConsumerBuilder<T> infoHolder;

    /**
     * ## 类说明：
     * 	构造器
     * @author    [liubowen]   
     * @version   [V1.0, 2016年12月30日]
     * @package com.jw.base.framework.core.mq.rabbitmq.consumer
     * @since
    日期|作者|类型|内容
    :----|:-----|:-----|:-----
    2016年12月30日|liubowen|新增|ThreadPoolConsumer.java新增
     */
    public static class ThreadPoolConsumerBuilder<T> {
        int threadCount;
        long intervalMils;
        MQConsumerAccessBuilder mqAccessBuilder;
        String exchange;
        String routingKey;
        String queue;
        JwMessageProcess<T> messageProcess;

        public ThreadPoolConsumerBuilder<T> setThreadCount(int threadCount) {
            this.threadCount = threadCount;

            return this;
        }

        public ThreadPoolConsumerBuilder<T> setIntervalMils(long intervalMils) {
            this.intervalMils = intervalMils;

            return this;
        }

        public ThreadPoolConsumerBuilder<T> setMQAccessBuilder(MQConsumerAccessBuilder mqAccessBuilder) {
            this.mqAccessBuilder = mqAccessBuilder;

            return this;
        }

        public ThreadPoolConsumerBuilder<T> setExchange(String exchange) {
            this.exchange = exchange;

            return this;
        }

        public ThreadPoolConsumerBuilder<T> setRoutingKey(String routingKey) {
            this.routingKey = routingKey;

            return this;
        }

        public ThreadPoolConsumerBuilder<T> setQueue(String queue) {
            this.queue = queue;

            return this;
        }

        public ThreadPoolConsumerBuilder<T> setMessageProcess(JwMessageProcess<T> messageProcess) {
            this.messageProcess = messageProcess;

            return this;
        }

        public ThreadPoolConsumer<T> build() {
            return new ThreadPoolConsumer<T>(this);
        }
    }

    private ThreadPoolConsumer(ThreadPoolConsumerBuilder<T> threadPoolConsumerBuilder) {
        this.infoHolder = threadPoolConsumerBuilder;
//        executor = Executors.newFixedThreadPool(threadPoolConsumerBuilder.threadCount);
        executor = new ThreadPoolExecutor(threadPoolConsumerBuilder.threadCount, threadPoolConsumerBuilder.threadCount,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(Constant.BLOCKING_QUEUE_NUMBER));
    }

    /**
     * ## 方法说明：
     * 	1 构造messageConsumer
     * 	2 执行consume
     * @throws IOException
     */
    public void start() throws IOException {
        for (int i = 0; i < infoHolder.threadCount; i++) {
            //1 构造messageConsumer
            final MessageConsumer messageConsumer = infoHolder.mqAccessBuilder.buildMessageConsumer(infoHolder.exchange,
                    infoHolder.routingKey, infoHolder.queue, infoHolder.messageProcess);

            executor.execute(new Runnable() {
                @Override
                public void run() {
                    while (!stop) {
                        try {
                            //2 执行consume
                            DetailRes detailRes = messageConsumer.consume();

                            if (infoHolder.intervalMils > 0) {
                                try {
                                    Thread.sleep(infoHolder.intervalMils);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    //log.info("interrupt " + e);
                                }
                            }

                            if (!detailRes.isSuccess()) {
                            	logger.info("run error " + detailRes.getErrMsg());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            //log.info("run exception " + e);
                        }
                    }
                }
            });
        }
    }

    /**
     * ## 方法说明：
     * 	描述
     */
    public void stop() {
        this.stop = true;
    }
}

