/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.rabbitmq.producer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import javax.annotation.PostConstruct;
//import javax.annotation.Resource;

import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.stereotype.Component;

import com.jw.base.framework.core.ConstantMq;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.mq.JwMessage;
import com.jw.base.framework.core.mq.JwMqDynamicSender;
import com.jw.base.framework.core.mq.common.DetailRes;
import com.jw.base.framework.core.util.FastJsonUtil;
import com.rabbitmq.client.Channel;


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
2016/11/26|liubowen|新增|RabbitDynamicSender.java新增
*/
@Component("rabbitmqDynamicImpl")
public class RabbitDynamicSender implements JwMqDynamicSender {

    /**
     * ## 方法说明：
     * 	通过@PostConstruct和 @PreDestroy方法，实现spring容器初始化和销毁bean之前进行的操作
     * @throws IOException
     * @throws TimeoutException
     */
    @PostConstruct
    public void init() throws IOException, TimeoutException {
    }

    /**
	 * ## 方法说明：
	 * 	指定队列发送MQ
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes send(JwMessage msg) {
		Connection connection = null;
		try {
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
	    	
	    	connection = rabbitConnectionFactory.createConnection();
			// 1 构造template, exchange, routingkey等
			// 客户端使用routing key，在exchange和queue之间建立好绑定关系
			// Channel：消息通道，在客户端的每个连接里，可建立多个channel，每个channel代表一个会话任务。
			buildQueue(msg.getMsgType(), msg.getTopics() + "-routing", msg.getTopics() + "-queue", connection);

			final RabbitTemplate rabbitTemplate = new RabbitTemplate(rabbitConnectionFactory);
			//当Mandatory为true时，如果Exchange根据自身类型和消息RoutingKey无法找到一个符合条件的Queue，那么会调用basic.return方法将消息返还给生产者；当Mandatory为false时，出现上述情景，broker会直接将消息扔掉
			rabbitTemplate.setMandatory(true);
			rabbitTemplate.setExchange(msg.getMsgType());
			rabbitTemplate.setRoutingKey(msg.getTopics() + "-routing");
			
			// 2 设置message序列化方法
			rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());

			// 4 构造sender方法
			try {
				rabbitTemplate.convertAndSend(msg.getMsgType(), msg.getTopics() + "-routing", FastJsonUtil.toJSONStringSerializer(msg));
			} catch (Exception e) {
				return new DetailRes(false, "");
			}
			return new DetailRes(true, "");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if (null != connection){
				connection.close();
			}
		}
		return null;
	}
	
	/**
	 * ## 方法说明：
	 * 	指定队列发送延迟MQ
	 * @param msg
	 * @param dealyExchange
	 * @param dealyTopic
	 * @param dealyRouting
	 * @param dealyQueue
	 * @param xExpires
	 * @return
	 */
	@Override
	public DetailRes sendDelay(JwMessage msg, String delayExchange, String delayTopic, String delayRouting, String delayQueue, long xExpires) {
		Connection connection = null;
		try {
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
	    	
	    	connection = rabbitConnectionFactory.createConnection();
	    	
			// 1 构造template, exchange, routingkey等
			// 客户端使用routing key，在exchange和queue之间建立好绑定关系
			// Channel：消息通道，在客户端的每个连接里，可建立多个channel，每个channel代表一个会话任务。
			buildDelayQueue(msg.getMsgType(), msg.getTopics() + "-routing", msg.getTopics() + "-queue", delayExchange, delayRouting, delayQueue, connection, xExpires);
	
			final RabbitTemplate rabbitTemplate = new RabbitTemplate(rabbitConnectionFactory);
			//当Mandatory为true时，如果Exchange根据自身类型和消息RoutingKey无法找到一个符合条件的Queue，那么会调用basic.return方法将消息返还给生产者；当Mandatory为false时，出现上述情景，broker会直接将消息扔掉
			rabbitTemplate.setMandatory(true);
			rabbitTemplate.setExchange(msg.getMsgType());
			rabbitTemplate.setRoutingKey(msg.getTopics() + "-routing");
			
			// 2 设置message序列化方法
			rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
			
			// 4 构造sender方法
			try {
				rabbitTemplate.convertAndSend(msg.getMsgType(), msg.getTopics() + "-routing", FastJsonUtil.toJSONStringSerializer(msg));
			} catch (Exception e) {
				return new DetailRes(false, "");
			}
			return new DetailRes(true, "");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if (null != connection){
				connection.close();
			}
		}
		return null;
					
	}
	
	private void buildQueue(String exchange, String routingKey, final String queue, Connection connection) throws IOException {
		//客户端连接到消息队列服务器，打开一个channel(事务false)
		Channel channel = connection.createChannel(false);
		
		String mqtype = "direct";
		if (exchange.equals(ConstantMq.EXCHANGE_FANOUT)){
			mqtype = "fanout";
		}else if (exchange.equals(ConstantMq.EXCHANGE_TOPIC)){
			mqtype = "topic";
		}
		channel.exchangeDeclare(exchange, mqtype, true, false, null);
		
		//客户端声明一个queue，并设置相关属性
		//Durable是该Exchange的持久化属性（当RabbitMQ退出时，默认会将消息和队列都清除，所以需要在第一次声明队列和发送消息时指定其持久化属性为true，这样RabbitMQ会将队列、消息和状态存到RabbitMQ本地的数据库，重启后会恢复）
		//注：当声明的队列已经存在时，尝试重新定义它的durable是不生效的
		Boolean durable = true;
		channel.queueDeclare(queue, durable, false, false, null);
		//客户端使用routing key，在exchange和queue之间建立好绑定关系
		channel.queueBind(queue, exchange, routingKey);

		try {
			channel.close();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	private void buildDelayQueue(String exchange, String routingKey, String queue, String delayExchange, String delayRoutingKey, String delayQueue, Connection connection, long x_expires) throws IOException {
		//客户端连接到消息队列服务器，打开一个channel(事务false)
		Channel channel = connection.createChannel(false);
		
		String mqtype = "direct";
		if (exchange.equals(ConstantMq.EXCHANGE_FANOUT)){
			mqtype = "fanout";
		}else if (exchange.equals(ConstantMq.EXCHANGE_TOPIC)){
			mqtype = "topic";
		}
		channel.exchangeDeclare(exchange, mqtype, true, false, null);
		
		Map<String, Object> args = new HashMap<String, Object>();
		//Queue TTL (对整个队列设置一个过期时间)
		args.put("x-message-ttl", x_expires);
		//设置死信的转发规则（如果没有任何规则，则直接丢弃死信） 
		//声明一个队列，当myqueue队列中有死信产生时，会转发到交换器some.exchange.name
		channel.exchangeDeclare(delayExchange, mqtype, true, false, null);
		args.put("x-dead-letter-exchange", delayExchange);
		//如果设置死信会以路由键some-routing-key转发到some.exchange.name，如果没设默认为消息发送到本队列时用的routing key
		args.put("x-dead-letter-routing-key", delayRoutingKey);
		
		//客户端声明一个queue，并设置相关属性
		//Durable是该Exchange的持久化属性（当RabbitMQ退出时，默认会将消息和队列都清除，所以需要在第一次声明队列和发送消息时指定其持久化属性为true，这样RabbitMQ会将队列、消息和状态存到RabbitMQ本地的数据库，重启后会恢复）
		//注：当声明的队列已经存在时，尝试重新定义它的durable是不生效的
		Boolean durable = true;
		channel.queueDeclare(delayQueue, durable, false, false, null);
		channel.queueDeclare(queue, durable, false, false, args);
		//客户端使用routing key，在exchange和queue之间建立好绑定关系
		channel.queueBind(delayQueue, delayExchange, delayRoutingKey);
		channel.queueBind(queue, exchange, routingKey);

		try {
			channel.close();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}

