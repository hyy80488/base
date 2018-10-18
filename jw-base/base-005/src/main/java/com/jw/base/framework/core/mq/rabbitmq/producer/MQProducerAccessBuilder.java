/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.rabbitmq.producer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ConfirmCallback;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ReturnCallback;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.amqp.rabbit.support.DefaultMessagePropertiesConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;

import com.jw.base.framework.core.ConstantMq;
import com.jw.base.framework.core.mq.common.Constants;
import com.jw.base.framework.core.mq.common.DetailRes;
//import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.QueueingConsumer;

/**
 * ## 类说明：
 * 	RabbitMQ消息build类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq.rabbitmq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|MQProducerAccessBuilder.java新增
*/
public class MQProducerAccessBuilder {
	
	private static final Logger logger = LoggerFactory.getLogger(MQProducerAccessBuilder.class);
	
	@Autowired
	private ConnectionFactory rabbitConnectionFactory;

	public MQProducerAccessBuilder(ConnectionFactory rabbitConnectionFactory) {
		this.rabbitConnectionFactory = rabbitConnectionFactory;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	1 构造template, exchange, routingkey等
	 * 	2 设置message序列化方法
	 * 	3 设置发送确认
	 * 	4 构造sender方法
	 * @param exchange
	 * @param routingKey
	 * @param queue
	 * @return
	 * @throws IOException
	 */
	public MessageSender buildMessageSender(final String exchange, final String routingKey, final String queue) throws IOException {
		Connection connection = rabbitConnectionFactory.createConnection();
		// 1 构造template, exchange, routingkey等
		// 客户端使用routing key，在exchange和queue之间建立好绑定关系
		// Channel：消息通道，在客户端的每个连接里，可建立多个channel，每个channel代表一个会话任务。
		buildQueue(exchange, routingKey, queue, connection);

		final RabbitTemplate rabbitTemplate = new RabbitTemplate(rabbitConnectionFactory);
		//当Mandatory为true时，如果Exchange根据自身类型和消息RoutingKey无法找到一个符合条件的Queue，那么会调用basic.return方法将消息返还给生产者；当Mandatory为false时，出现上述情景，broker会直接将消息扔掉
		rabbitTemplate.setMandatory(true);
		rabbitTemplate.setExchange(exchange);
		rabbitTemplate.setRoutingKey(routingKey);
		
		// 2 设置message序列化方法
		rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
		
		final RetryCache retryCache = new RetryCache();
		
		// 3 设置发送确认
		// 确认消息是否到达broker服务器，即确认是否正确到达Exchange中，只要正确到达Exchange中，broker即可确认该消息，并返回给客户端ack
		rabbitTemplate.setConfirmCallback(new ConfirmCallback() {
			@Override
			public void confirm(CorrelationData correlationData, boolean ack, String cause) {
				if (!ack) {
					//处理丢失的消息（nack）
					System.err.println("setConfirmCallback==============send message failed: " + cause + correlationData.toString());
					logger.info("send message failed: " + cause + correlationData.toString());
				} else {
					//将消息从重发集合中删除
					retryCache.del(correlationData.getId());
				}
			}
		});

		// publisherConfirms手工确认模式 ，不走下面
		rabbitTemplate.setReturnCallback(new ReturnCallback() {
			@Override
			public void returnedMessage(Message message, int replyCode, String replyText, String tmpExchange, String tmpRoutingKey) {
				try {
					Thread.sleep(Constants.ONE_SECOND);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.err.println("setReturnCallback==============send message failed: " + replyCode + " " + replyText + ", message=" + message);
				logger.info("send message failed: " + replyCode + " " + replyText);
				rabbitTemplate.send(message);
			}
		});

		// 4 构造sender方法
		return new MessageSender() {
			{
				retryCache.setSender(this, exchange, routingKey);
			}
			@Override
			public DetailRes send(String exchange, String routingKey, Object message) {
				try {
					String id = retryCache.generateId();
					//将发送消息放到重发集合中
					retryCache.add(id, message);
					
					//消息设为持久化
//					MessageProperties source = new MessageProperties();
//					source.setContentType("text/plain");
//					source.setDeliveryMode(MessageDeliveryMode.PERSISTENT);
//					source.setPriority(0);
//					DefaultMessagePropertiesConverter messageConverter = new DefaultMessagePropertiesConverter();
//					messageConverter.fromMessageProperties(source, "UTF-8");
//					rabbitTemplate.setMessagePropertiesConverter(messageConverter);
					
					rabbitTemplate.convertAndSend(exchange, routingKey, message, new CorrelationData(id));
				} catch (Exception e) {
					return new DetailRes(false, "");
				}
				return new DetailRes(true, "");
			}
		};
	}

	/**
	 * ## 方法说明：
	 * 	描述
	 * @param exchange
	 * @param routingKey
	 * @param queue
	 * @param connection
	 * @throws IOException
	 */
	private void buildQueue(String exchange, String routingKey, final String queue, Connection connection)
			throws IOException {
		//客户端连接到消息队列服务器，打开一个channel(事务false)
		Channel channel = connection.createChannel(false);
		
		String mqtype = "direct";
		if (exchange.equals(ConstantMq.EXCHANGE_FANOUT)){
			mqtype = "fanout";
		}else if (exchange.equals(ConstantMq.EXCHANGE_TOPIC)){
			mqtype = "topic";
		}
		//客户端声明一个exchange，并设置相关属性
		//ExchangeName是该Exchange的名字，该属性在创建Binding和生产者通过publish推送消息时需要指定
		//ExchangeType指Exchange的类型：direct、fanout、topic
		//如果是Direct类型，则会将消息中的RoutingKey与该Exchange关联的所有Binding中的BindingKey进行比较，如果相等，则发送到该Binding对应的Queue中
		//如果是Fanout类型，则会将消息发送给所有与该Exchange定义过 Binding的所有 Queues中去，其实是一种广播行为
		//如果是Topic类型，则会按照正则表达式，对RoutingKey与BindingKey进行匹配，如果匹配成功，则发送到对应的Queue中。
		channel.exchangeDeclare(exchange, mqtype, true, false, null);
		
		/**
		 * Declare a queue
		 * @param queue the name of the queue
		 * @param durable true if we are declaring a durable queue (the queue will survive a server restart)
		 * @param exclusive true if we are declaring an exclusive queue (restricted to this connection)
		 * @param autoDelete true if we are declaring an autodelete queue (server will delete it when no longer in use)
		 * @param arguments other properties (construction arguments) for the queue
		 * @return a declaration-confirm method to indicate the queue was successfully declared
		 */
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
			logger.info("close channel time out " + e);
		}
	}

//	private QueueingConsumer buildQueueConsumer(Connection connection, String queue) {
//		try {
//			Channel channel = connection.createChannel(false);
//			QueueingConsumer consumer = new QueueingConsumer(channel);
//
//			// 通过 BasicQos 方法设置prefetchCount = 1。这样RabbitMQ就会使得每个Consumer在同一个时间点最多处理一个Message。
//			// 换句话说，在接收到该Consumer的ack前，他它不会将新的Message分发给它
//			channel.basicQos(1);
//			channel.basicConsume(queue, false, consumer);
//
//			return consumer;
//		} catch (Exception e) {
//			e.printStackTrace();
//			TraceLogUtil.info("build queue consumer error : " + e);
//
//			try {
//				Thread.sleep(Constants.ONE_SECOND);
//			} catch (InterruptedException inE) {
//				inE.printStackTrace();
//			}
//
//			return buildQueueConsumer(connection, queue);
//		}
//	}

	// for test
//	public int getMessageCount(final String queue) throws IOException {
//		Connection connection = rabbitConnectionFactory.createConnection();
//		final Channel channel = connection.createChannel(false);
//		final AMQP.Queue.DeclareOk declareOk = channel.queueDeclarePassive(queue);
//
//		return declareOk.getMessageCount();
//	}
}
