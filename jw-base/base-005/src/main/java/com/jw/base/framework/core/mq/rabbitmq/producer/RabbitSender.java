/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.rabbitmq.producer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.jw.base.framework.core.ConstantMq;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.mq.JwMessage;
import com.jw.base.framework.core.mq.JwMqSender;
import com.jw.base.framework.core.mq.common.DetailRes;
import com.jw.base.framework.core.util.FastJsonUtil;


/**
 * ## 类说明：
 * 	RabbitMQ消息发送类
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
2016/11/26|liubowen|新增|RabbitSender.java新增
*/
@Component("rabbitmqImpl")
public class RabbitSender implements JwMqSender {
	//Exchange：消息交换机，它指定消息按什么规则，路由到哪个队列。
    //private static final String EXCHANGE = "default-exchange";
	//Routing Key：路由关键字，exchange根据这个关键字进行消息投递。
    //private static final String ROUTING = "default-routing";
	//Queue：消息队列载体，每个消息都会被投入到一个或多个队列。
    //private static final String QUEUE = "default-queue";

//    @Resource(name = "rabbitConnFactoryA")
//    ConnectionFactory rabbitConnectionFactoryA;
//    @Resource(name = "rabbitConnFactoryB")
//    ConnectionFactory rabbitConnectionFactoryB;
//    @Resource(name = "rabbitConnFactoryC")
//    ConnectionFactory rabbitConnectionFactoryC;
    
    /** 电话计费 **/
    private MessageSender messageSenderJobPbxByDirect;
    /** 公安 **/
    private MessageSender messageSenderJobResidenceByDirect;
    /** 房控系统 **/
    private MessageSender messageSenderJobRoomByDirect;
    /** CRM **/
    private MessageSender messageSenderJobCrmByDirect;
    /** CRS **/
    private MessageSender messageSenderJobCrsByDirect;
    /** 短信 **/
    private MessageSender messageSenderJobMessageByDirect;
    
    /** 任务分发 **/
    private MessageSender messageSenderMissionByDirect;
    /** 操作日志、DAO日志 **/
    private MessageSender messageSenderEntityLogByDirect;
    /** 报表日志 **/
    private MessageSender messageSenderReporttLogByDirect;
    /** 发番 **/
    private MessageSender messageSenderNumbertLogByDirect;
    /** 登录日志 **/
    private MessageSender messageSenderLoginLogByDirect;
    /** Websocket **/
    private MessageSender messageSenderWebsocketByDirect;
    /** 厨打 **/
    private MessageSender messageSenderPosPrinterTaskByDirect;
    /** 通知 **/
    private MessageSender messageSenderNoticeTaskByDirect;
    /** 接口定义 **/
    private MessageSender messageSenderApidocByDirect;
    /** 积分[发消息，增加减少积分] **/
    private MessageSender messageSenderPointsByDirect;
    /** 补偿处理，及时队列 **/
    private MessageSender messageSenderCompensatingByDirect;
    
    /** 携程OTA **/
    private MessageSender messageSenderCtripOTAByDirect;
    /** 渠道调用日志，如webservice **/
    private MessageSender messageSenderLogChannelInfoByDirect;
    
    /** 夜审通知 **/
    private MessageSender messageSenderAuditNoticeByDirect;
    /** 从RMS中获取"间夜量"、"房费收入"等预测数据 **/
    private MessageSender messageSenderGetRMSDataByDirect;
    /** 计算会员保级 **/
    private MessageSender messageSenderKeepLevelByDirect;
    /** 计算会员积分过期清零**/
    private MessageSender messageSenderPointsExpiredByDirect;
    
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
    	
//    	factory.setAutomaticRecoveryEnabled(true);//启用自动连接恢复
//    	factory.setNetworkRecoveryInterval(10000);//如果恢复因异常失败(如. RabbitMQ节点仍然不可达),它会在固定时间间隔后进行重试(默认是5秒)
//    	factory.setTopologyRecoveryEnabled(true);//设置重新声明交换器，队列等信息。

    	org.springframework.amqp.rabbit.connection.CachingConnectionFactory rabbitConnectionFactory = new org.springframework.amqp.rabbit.connection.CachingConnectionFactory();
    	rabbitConnectionFactory.setAddresses(rabbitmqUrl);//当提供了address列表时,将会在所有address上逐个进行尝试
    	rabbitConnectionFactory.setUsername(rabbitmqUsername);
    	rabbitConnectionFactory.setPassword(rabbitmqPassword);
    	rabbitConnectionFactory.setConnectionTimeout(10000);
    	rabbitConnectionFactory.setChannelCacheSize(25);
    	rabbitConnectionFactory.setPublisherConfirms(true);
    	
    	MQProducerAccessBuilder mqAccessBuilderDynamic = new MQProducerAccessBuilder(rabbitConnectionFactory);
    	
    	messageSenderJobPbxByDirect         = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_JOB_PBX+"-routing", ConstantMq.TOPIC_JOB_PBX+"-queue");
    	messageSenderJobResidenceByDirect   = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_JOB_RESIDENCE+"-routing", ConstantMq.TOPIC_JOB_RESIDENCE+"-queue");
    	messageSenderJobRoomByDirect        = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_JOB_ROOM+"-routing", ConstantMq.TOPIC_JOB_ROOM+"-queue");
    	messageSenderJobCrmByDirect         = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_JOB_CRM+"-routing", ConstantMq.TOPIC_JOB_CRM+"-queue");
    	messageSenderJobCrsByDirect         = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_JOB_CRS+"-routing", ConstantMq.TOPIC_JOB_CRS+"-queue");
    	messageSenderJobMessageByDirect     = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_JOB_MESSAGE+"-routing", ConstantMq.TOPIC_JOB_MESSAGE+"-queue");

    	messageSenderMissionByDirect        = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_MISSION+"-routing", ConstantMq.TOPIC_MISSION+"-queue");
    	messageSenderEntityLogByDirect      = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_ENTITY_LOG+"-routing", ConstantMq.TOPIC_ENTITY_LOG+"-queue");
    	messageSenderReporttLogByDirect     = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_REPORT_LOG+"-routing", ConstantMq.TOPIC_REPORT_LOG+"-queue");
    	messageSenderNumbertLogByDirect     = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_NUMBER_LOG+"-routing", ConstantMq.TOPIC_NUMBER_LOG+"-queue");
    	messageSenderLoginLogByDirect       = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_LOGIN_LOG+"-routing", ConstantMq.TOPIC_LOGIN_LOG+"-queue");
    	messageSenderWebsocketByDirect      = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_WEBSOCKET+"-routing", ConstantMq.TOPIC_WEBSOCKET+"-queue");
    	messageSenderPosPrinterTaskByDirect = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_POS_PRINTER_TASK+"-routing", ConstantMq.TOPIC_POS_PRINTER_TASK+"-queue");
    	messageSenderNoticeTaskByDirect     = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_NOTICE_TASK+"-routing", ConstantMq.TOPIC_NOTICE_TASK+"-queue");
    	messageSenderApidocByDirect         = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_APIDOC+"-routing", ConstantMq.TOPIC_APIDOC+"-queue");
    	messageSenderPointsByDirect         = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_POINTS+"-routing", ConstantMq.TOPIC_POINTS+"-queue");
    	messageSenderCompensatingByDirect   = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_COMPENSATING+"-routing", ConstantMq.TOPIC_COMPENSATING+"-queue");
    	
    	messageSenderCtripOTAByDirect       = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_CTRIP_OTA+"-routing", ConstantMq.TOPIC_CTRIP_OTA+"-queue");
    	messageSenderLogChannelInfoByDirect = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_LOG_CHANNEL_INFO+"-routing", ConstantMq.TOPIC_LOG_CHANNEL_INFO+"-queue");
    	
    	messageSenderAuditNoticeByDirect    = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_AUDIT_NOTICE+"-routing", ConstantMq.TOPIC_AUDIT_NOTICE+"-queue");
    	messageSenderGetRMSDataByDirect     = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_GET_RMS_DATA+"-routing", ConstantMq.TOPIC_GET_RMS_DATA+"-queue");
    	messageSenderKeepLevelByDirect      = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_KEEP_LEVEL+"-routing", ConstantMq.TOPIC_KEEP_LEVEL+"-queue");
    	messageSenderPointsExpiredByDirect  = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, ConstantMq.TOPIC_POINTS_EXPIRED+"-routing", ConstantMq.TOPIC_POINTS_EXPIRED+"-queue");
    	System.out.println("初始化rabbitmq connect......"+rabbitConnectionFactory);
    }

    /**
     * ## 方法说明：
     * 	电话计费\视频点播\宽带计费\酒店功能
     * @param msg
     * @return
     */
	@Override
	public DetailRes sendJobPbxByDirect(JwMessage msg) {
		return messageSenderJobPbxByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	/**
	 * ## 方法说明：
	 * 	公安
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendJobResidenceByDirect(JwMessage msg) {
		return messageSenderJobResidenceByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	/**
	 * ## 方法说明：
	 * 	房控系统
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendJobRoomByDirect(JwMessage msg) {
		return messageSenderJobRoomByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	/**
	 * ## 方法说明：
	 * 	CRM
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendJobCrmByDirect(JwMessage msg) {
		return messageSenderJobCrmByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	/**
	 * ## 方法说明：
	 * 	CRS
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendJobCrsByDirect(JwMessage msg) {
		return messageSenderJobCrsByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	/**
	 * ## 方法说明：
	 * 	短信
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendJobMessageByDirect(JwMessage msg) {
		return messageSenderJobMessageByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	/**
	 * ## 方法说明：
	 * 	任务分发
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendMissionByDirect(JwMessage msg) {
		return messageSenderMissionByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
	 * ## 方法说明：
	 * 	发送EntiytLog消息
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendEntityLogByDirect(JwMessage msg) {
		return messageSenderEntityLogByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
     * ## 方法说明：
     * 	发送ReporttLog消息
     * @param msg
     * @return
     */
	@Override
	public DetailRes sendReporttLogByDirect(JwMessage msg) {
		return messageSenderReporttLogByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
     * ## 方法说明：
     * 	发送NumbertLog消息
     * @param msg
     * @return
     */
	@Override
	public DetailRes sendNumbertLogByDirect(JwMessage msg) {
		return messageSenderNumbertLogByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	/**
	 * ## 方法说明：
	 * 	发送LoginLog消息
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendLoginLogByDirect(JwMessage msg) {
		return messageSenderLoginLogByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
     * ## 方法说明：
     * 	发送websocket消息
     * @param msg
     * @return
     */
	@Override
	public DetailRes sendWebsocketByDirect(JwMessage msg) {
		return messageSenderWebsocketByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
     * ## 方法说明：
     * 	发送厨打消息
     * @param msg
     * @return
     */
	@Override
	public DetailRes sendPosPrinterTaskByDirect(JwMessage msg) {
		return messageSenderPosPrinterTaskByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
     * ## 方法说明：
     * 	发送通知消息
     * @param msg
     * @return
     */
	@Override
	public DetailRes sendNoticeTaskByDirect(JwMessage msg) {
		return messageSenderNoticeTaskByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
     * ## 方法说明：
     * 	发送apidoc
     * @param msg
     * @return
     */
	@Override
	public DetailRes sendApidocByDirect(JwMessage msg) {
		return messageSenderApidocByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
     * ## 方法说明：
     * 	发送积分
     * @param msg
     * @return
     */
	@Override
	public DetailRes sendPointsByDirect(JwMessage msg) {
		return messageSenderPointsByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
	 * ## 方法说明：
	 * 	补偿处理，及时队列
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendCompensatingByDirect(JwMessage msg) {
		return messageSenderCompensatingByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
	 * ## 方法说明：
	 * 	ARI、EBK【发送房态、房价、房量】
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendCtripOTA(JwMessage msg) {
		return messageSenderCtripOTAByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
	 * ## 方法说明：
	 * 	渠道调用日志，如webservice
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendLogChannelInfo(JwMessage msg) {
		return messageSenderLogChannelInfoByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
	 * ## 方法说明：
	 * 	夜审通知
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendAuditNoticeByDirect(JwMessage msg) {
		return messageSenderAuditNoticeByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
	 * ## 方法说明：
	 * 	从RMS中获取"间夜量"、"房费收入"等预测数据
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendGetRMSDataByDirect(JwMessage msg) {
		return messageSenderGetRMSDataByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}

	/**
	 * ## 方法说明：
	 * 	计算会员保级
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendKeepLevelByDirect(JwMessage msg) {
		return messageSenderKeepLevelByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
	/**
	 * ## 方法说明：
	 * 	计算会员积分过期清零
	 * @param msg
	 * @return
	 */
	@Override
	public DetailRes sendPointsExpiredByDirect(JwMessage msg) {
		return messageSenderPointsExpiredByDirect.send(msg.getMsgType(), msg.getTopics()+"-routing", FastJsonUtil.toJSONStringSerializer(msg));
	}
	
//	/**
//	 * 
//	 * ## 方法说明：
//	 * 	发送消息反馈消息，只是direct模式的
//	 * @param msg
//	 * @return
//	 */
//	@Override
//	public DetailRes sendAck(JwMessage msg) {
//		try {
//			MQProducerAccessBuilder mqAccessBuilderDynamic = new MQProducerAccessBuilder(rabbitConnectionFactory);
//			MessageSender messageSenderDynamic = mqAccessBuilderDynamic.buildMessageSender(ConstantMq.EXCHANGE_DIRECT, msg.getTopics()+"-routing-ack", msg.getTopics()+"-queue-ack");
//			return messageSenderDynamic.send(ConstantMq.EXCHANGE_DIRECT, msg.getTopics()+"-routing-ack", FastJsonUtil.toJSONString(msg));
//		} catch (IOException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
}

