/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.rabbitmq.producer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import javax.annotation.PostConstruct;
//import javax.annotation.Resource;

//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jw.base.framework.core.ConstantMq;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.mq.JwMessage;
import com.jw.base.framework.core.mq.JwMqDealySender;
import com.jw.base.framework.core.mq.common.DetailRes;
import com.jw.base.framework.core.util.FastJsonUtil;


/**
 * ## 类说明：
 * 	RabbitMQ消息延迟发送类
 * 	Broker：简单来说就是消息队列服务器实体。
 * 	Binding：绑定，它的作用就是把exchange和queue按照路由规则绑定起来。
 * 	Vhost：虚拟主机，一个broker里可以开设多个vhost，用作不同用户的权限分离。
 * 	Producer：消息生产者，就是投递消息的程序。
 * 	Consumer：消息消费者，就是接受消息的程序。
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq.rabbitmq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|RabbitDelaySender.java新增
*/
@Component("rabbitmqDelayImpl")
public class RabbitDelaySender implements JwMqDealySender {

//    @Resource(name = "rabbitConnFactoryA")
//    ConnectionFactory rabbitConnectionFactoryA;
//    @Resource(name = "rabbitConnFactoryB")
//    ConnectionFactory rabbitConnectionFactoryB;
//    @Resource(name = "rabbitConnFactoryC")
//    ConnectionFactory rabbitConnectionFactoryC;
    
    /** 强一致性校验延迟队列  **/
//  private MessageSender messageSenderStrongConsistencyByDirect;
    /** 弱一致性校验延迟队列 **/
//  private MessageSender messageSenderWeakConsistencyByDirect;
    /** 强一致性校验延迟队列  **/
    private MessageSender messageSenderLongByDirect;
    /** 弱一致性校验延迟队列 **/
    private MessageSender messageSenderShortByDirect;
    /** 订单处理延迟队列，1小时零1分，（直销订单预付超一小时取消） **/
    private MessageSender messageSenderOrderDealByDirect;
    
    /**
     * ## 方法说明：
     * 	通过@PostConstruct和 @PreDestroy方法，实现spring容器初始化和销毁bean之前进行的操作
     * @throws IOException
     * @throws TimeoutException
     */
    @PostConstruct
    public void init() throws IOException, TimeoutException {
    	
    	String rabbitmqUrl = (String)PropertyConfigurer.getContextProperty("rabbitmq.url");
    	String rabbitmqUsername = (String)PropertyConfigurer.getContextProperty("rabbitmq.username");
    	String rabbitmqPassword = (String)PropertyConfigurer.getContextProperty("rabbitmq.password");
    	
    	org.springframework.amqp.rabbit.connection.CachingConnectionFactory rabbitConnectionFactory = new org.springframework.amqp.rabbit.connection.CachingConnectionFactory();
    	rabbitConnectionFactory.setAddresses(rabbitmqUrl);//当提供了address列表时,将会在所有address上逐个进行尝试
    	rabbitConnectionFactory.setUsername(rabbitmqUsername);
    	rabbitConnectionFactory.setPassword(rabbitmqPassword);
    	rabbitConnectionFactory.setConnectionTimeout(10000);
    	rabbitConnectionFactory.setChannelCacheSize(25);
    	rabbitConnectionFactory.setPublisherConfirms(true);
    	
    	MQProducerDelayBuilder mqAccessBuilderDelay = new MQProducerDelayBuilder(rabbitConnectionFactory);
//    	messageSenderStrongConsistencyByDirect = mqAccessBuilderDelay.buildMessageDelaySender(ConstantMq.EXCHANGE_DIRECT, 
//    																						  ConstantMq.TOPIC_STRONG_CONSISTENCY+"-routing", 
//    																						  ConstantMq.TOPIC_STRONG_CONSISTENCY+"-queue", 
//    																						  ConstantMq.EXCHANGE_DIRECT_DEALY, 
//    																						  ConstantMq.TOPIC_STRONG_CONSISTENCY_DELAY+"-routing", 
//    																						  ConstantMq.TOPIC_STRONG_CONSISTENCY_DELAY+"-queue", 
//    																						  ConstantMq.X_EXPIRES_60);
//    	messageSenderWeakConsistencyByDirect = mqAccessBuilderDelay.buildMessageDelaySender(ConstantMq.EXCHANGE_DIRECT, 
//    																						ConstantMq.TOPIC_WEAK_CONSISTENCY+"-routing", 
//    																						ConstantMq.TOPIC_WEAK_CONSISTENCY+"-queue", 
//    																						ConstantMq.EXCHANGE_DIRECT_DEALY, 
//    																						ConstantMq.TOPIC_WEAK_CONSISTENCY_DELAY+"-routing", 
//    																						ConstantMq.TOPIC_WEAK_CONSISTENCY_DELAY+"-queue", 
//    																						ConstantMq.X_EXPIRES_180);
    	messageSenderLongByDirect = mqAccessBuilderDelay.buildMessageDelaySender(ConstantMq.EXCHANGE_DIRECT, 
    																			 ConstantMq.TOPIC_LONG+"-routing", 
    																			 ConstantMq.TOPIC_LONG+"-queue", 
    																			 ConstantMq.EXCHANGE_DIRECT_DELAY, 
    																			 ConstantMq.TOPIC_LONG_DELAY+"-routing", 
    																			 ConstantMq.TOPIC_LONG_DELAY+"-queue", 
    																			 ConstantMq.X_EXPIRES_300);
    	messageSenderShortByDirect = mqAccessBuilderDelay.buildMessageDelaySender(ConstantMq.EXCHANGE_DIRECT, 
    																			 ConstantMq.TOPIC_SHORT+"-routing", 
    																			 ConstantMq.TOPIC_SHORT+"-queue", 
    																			 ConstantMq.EXCHANGE_DIRECT_DELAY, 
    																			 ConstantMq.TOPIC_SHORT_DELAY+"-routing", 
    																			 ConstantMq.TOPIC_SHORT_DELAY+"-queue", 
    																			 ConstantMq.X_EXPIRES_6);
    	messageSenderOrderDealByDirect = mqAccessBuilderDelay.buildMessageDelaySender(ConstantMq.EXCHANGE_DIRECT, 
																    			ConstantMq.TOPIC_ORDER_DEAL+"-routing", 
																    			ConstantMq.TOPIC_ORDER_DEAL+"-queue", 
																    			ConstantMq.EXCHANGE_DIRECT_DELAY, 
																    			ConstantMq.TOPIC_ORDER_DEAL_DELAY+"-routing", 
																    			ConstantMq.TOPIC_ORDER_DEAL_DELAY+"-queue", 
																    			ConstantMq.X_EXPIRES_3660);
    	
    	System.out.println("初始化rabbitmq connect(延迟队列)......"+rabbitConnectionFactory);
    }

	/** 
	 * ## 方法说明：
	 * 	强一致性校验延迟队列
	 * @param msg
	 * @return
	*/
//	@Override
//	public DetailRes sendStrongConsistencyDealy(JwMessage msg) {
//		return messageSenderStrongConsistencyByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
//	}

	/** 
	 * ## 方法说明：
	 * 	弱一致性校验延迟队列
	 * @param msg
	 * @return
	*/
//	@Override
//	public DetailRes sendWeakConsistencyDealy(JwMessage msg) {
//		return messageSenderWeakConsistencyByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
//	}
	
	/** 
	 * ## 方法说明：
	 * 	长延迟队列
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendLongDealy(JwMessage msg) {
		return messageSenderLongByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/** 
	 * ## 方法说明：
	 * 	短延迟队列
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendShortDealy(JwMessage msg) {
		return messageSenderShortByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/** 
	 * ## 方法说明：
	 * 	订单处理延迟队列，1小时零1分，（直销订单预付超一小时取消）
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendOrderDealDealy(JwMessage msg) {
		return messageSenderOrderDealByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
}

