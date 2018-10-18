/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.rabbitmq.consumer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.support.DefaultMessagePropertiesConverter;
import org.springframework.amqp.rabbit.support.MessagePropertiesConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;

import com.jw.base.framework.core.ConstantMq;
import com.jw.base.framework.core.mq.JwMessage;
import com.jw.base.framework.core.mq.JwMessageProcess;
import com.jw.base.framework.core.mq.common.Constants;
import com.jw.base.framework.core.mq.common.DetailRes;
import com.jw.base.framework.core.util.FastJsonUtil;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

/**
 * ## 类说明：
 * 	RabbitMQ消息build类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq.rabbitmq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|MQAccessBuilder.java新增
*/
public class MQConsumerAccessBuilder {
	
	private static final Logger logger = LoggerFactory.getLogger(MQConsumerAccessBuilder.class);
	
	private ConnectionFactory connectionFactory;

	public MQConsumerAccessBuilder(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	/**
	 * ## 方法说明：
	 * 	1 创建连接和channel
	 * 	2 设置message序列化方法
	 * 	3 构造consumer
	 * @param exchange
	 * @param routingKey
	 * @param queue
	 * @param messageProcess
	 * @return
	 * @throws IOException
	 */
	public <T> MessageConsumer buildMessageConsumer(String exchange, String routingKey, final String queue,
			final JwMessageProcess<T> messageProcess) throws IOException {
		final Connection connection = connectionFactory.createConnection();

		// 1 创建连接和channel
		// 客户端使用routing key，在exchange和queue之间建立好绑定关系
		buildQueue(exchange, routingKey, queue, connection);

		// 2 设置message序列化方法
		final MessagePropertiesConverter messagePropertiesConverter = new DefaultMessagePropertiesConverter();
		final MessageConverter messageConverter = new Jackson2JsonMessageConverter();

		// 3 构造consumer
		return new MessageConsumer() {
			QueueingConsumer consumer;
			{
				consumer = buildQueueConsumer(connection, queue);
			}

			/**
			 * ## 方法说明：
			 * 	1 通过delivery获取原始数据
			 * 	2 将原始数据转换为特定类型的包
			 * 	3 处理数据
			 * 	4 手动发送ack确认
			 * @return
			 */
			@Override
			public DetailRes consume() {
				QueueingConsumer.Delivery delivery = null;
				Channel channel = consumer.getChannel();

				try {
					// 1 通过delivery获取原始数据
					delivery = consumer.nextDelivery();
					Message message = new Message(delivery.getBody(), messagePropertiesConverter.toMessageProperties(delivery.getProperties(), delivery.getEnvelope(), "UTF-8"));

					// 2 将原始数据转换为特定类型的包
					T messageBean = (T) messageConverter.fromMessage(message);

					// 3 处理数据
					DetailRes detailRes = messageProcess.process(FastJsonUtil.toBean((String)messageBean, JwMessage.class));

					// 4 手动发送ack确认
					if (detailRes.isSuccess()) {
						channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
					} else {
						// 避免过多失败log
						Thread.sleep(Constants.ONE_SECOND);
						logger.info("process message failed: " + detailRes.getErrMsg());
						//拒收消息，并要求 broker 将其 requeue
						channel.basicNack(delivery.getEnvelope().getDeliveryTag(), false, true);
					}

					return detailRes;
				} catch (InterruptedException e) {
					e.printStackTrace();
					return new DetailRes(false, "interrupted exception " + e.toString());
				} catch (ShutdownSignalException | ConsumerCancelledException | IOException e) {
					e.printStackTrace();

					try {
						channel.close();
					} catch (IOException | TimeoutException ex) {
						ex.printStackTrace();
					}
					
					//重新生成channel，ShutdownSignalException时自动重连
					consumer = buildQueueConsumer(connection, queue);

					return new DetailRes(false, "shutdown or cancelled exception " + e.toString());
				} catch (Exception e) {
					e.printStackTrace();
					// log.info("exception : " + e);

					try {
						channel.close();
					} catch (IOException | TimeoutException ex) {
						ex.printStackTrace();
					}

					consumer = buildQueueConsumer(connection, queue);

					return new DetailRes(false, "exception " + e.toString());
				}
			}
		};
	}

	/**
	 * 
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
		 * @see com.rabbitmq.client.AMQP.Queue.Declare
		 * @see com.rabbitmq.client.AMQP.Queue.DeclareOk
		 * @param queue the name of the queue
		 * @param durable true if we are declaring a durable queue (the queue will survive a server restart)
		 * @param exclusive true if we are declaring an exclusive queue (restricted to this connection)
		 * @param autoDelete true if we are declaring an autodelete queue (server will delete it when no longer in use)
		 * @param arguments other properties (construction arguments) for the queue
		 * @return a declaration-confirm method to indicate the queue was successfully declared
		 * @throws java.io.IOException if an error is encountered
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

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param connection
	 * @param queue
	 * @return
	 */
	private QueueingConsumer buildQueueConsumer(Connection connection, String queue) {
		try {
			Channel channel = connection.createChannel(false);
			QueueingConsumer consumer = new QueueingConsumer(channel);

			// 通过 BasicQos 方法设置prefetchCount = 1。这样RabbitMQ就会使得每个Consumer在同一个时间点最多处理一个Message。
			// 换句话说，在接收到该Consumer的ack前，他它不会将新的Message分发给它
			channel.basicQos(1);
			channel.basicConsume(queue, false, consumer);

			return consumer;
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("build queue consumer error : " + e);

			try {
				Thread.sleep(Constants.ONE_SECOND);
			} catch (InterruptedException inE) {
				inE.printStackTrace();
			}

			return buildQueueConsumer(connection, queue);
		}
	}

	/**
	 * ## 方法说明：
	 * 	for test
	 * @param queue
	 * @return
	 * @throws IOException
	 */
	public int getMessageCount(final String queue) throws IOException {
		Connection connection = connectionFactory.createConnection();
		final Channel channel = connection.createChannel(false);
		final AMQP.Queue.DeclareOk declareOk = channel.queueDeclarePassive(queue);

		return declareOk.getMessageCount();
	}
}
