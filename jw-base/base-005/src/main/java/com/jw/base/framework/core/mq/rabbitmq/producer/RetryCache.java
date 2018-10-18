/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.rabbitmq.producer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jw.base.framework.core.mq.common.Constants;
import com.jw.base.framework.core.mq.common.DetailRes;

/**
 * ## 类说明：
 * 	RabbitMQ消息发送重试类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq.rabbitmq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|RetryCache.java新增
*/
public class RetryCache {
	private static final Logger logger = LoggerFactory.getLogger(RetryCache.class);
	
    private MessageSender sender;
    private boolean stop = false;
    private Map<String, MessageWithTime> map = new ConcurrentHashMap<>();
    private AtomicLong id = new AtomicLong();

    private String exchange;
    private String routingKey;
    
    /**
     * 
     * ## 类说明：
     * 	描述
     * @author    [liubowen]   
     * @version   [V1.0, 2016年12月30日]
     * @package com.jw.base.framework.core.mq.rabbitmq.producer
     * @since
    日期|作者|类型|内容
    :----|:-----|:-----|:-----
    2016年12月30日|liubowen|新增|RetryCache.java新增
     */
    private static class MessageWithTime {
        public MessageWithTime(long currentTimeMillis, Object message2) {
        	this.time = currentTimeMillis;
        	this.message = message2;
		}
        
		long time;
		
        Object message;
        
		public long getTime() {
			return time;
		}
		
		public void setTime(long time) {
			this.time = time;
		}
		
		public Object getMessage() {
			return message;
		}
		
		public void setMessage(Object message) {
			this.message = message;
		}
    }

    public void setSender(MessageSender sender, String exchange, String routingKey) {
        this.sender = sender;
        this.exchange = exchange;
        this.routingKey = routingKey;
        startRetry(exchange, routingKey);
    }

    public String generateId() {
        return "" + id.incrementAndGet();
    }

    public void add(String id, Object message) {
        map.put(id, new MessageWithTime(System.currentTimeMillis(), message));
    }

    public void del(String id) {
        map.remove(id);
    }
    
    public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getRoutingKey() {
		return routingKey;
	}

	public void setRoutingKey(String routingKey) {
		this.routingKey = routingKey;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param exchange
	 * @param routingKey
	 */
	private void startRetry(String exchange, String routingKey) {
        new Thread(new Runnable() {
			@Override
			public void run() {
			    while (!stop) {
			        try {
			            Thread.sleep(Constants.RETRY_TIME_INTERVAL);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }

			        long now = System.currentTimeMillis();
			        
			        //发送数据集合，成功删除，如果集合还有，则发送不成功，需重发
			        for (Map.Entry<String, MessageWithTime> entry : map.entrySet()){
			        	MessageWithTime messageWithTime = entry.getValue();
			        	if (null != messageWithTime) {
			        		//当前时间超过n倍有效时间，不再重发
			        		if (messageWithTime.getTime() + (Constants.RETRYTIMES + 1) * Constants.VALID_TIME < now) {
			        			System.err.println("send message failed after 3 min " + messageWithTime);
			        			logger.info("send message failed after 3 min " + messageWithTime);
			        			del(entry.getKey());
			        		} else if (messageWithTime.getTime() + Constants.VALID_TIME < now) {
			        			DetailRes detailRes = sender.send(exchange, routingKey, messageWithTime.getMessage());
			        			//发送成功删除
			        			if (detailRes.isSuccess()) {
			        				del(entry.getKey());
			        			}
			        		}
			        	}
			        }
			    }
			}
		}).start();
    }
}

