package com.jw.base.framework.core;

/**
 * ## 类说明：
 * 	MQ系统常量
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|ConstantMq.java新增
 */
public class ConstantMq {
	/**
	 * RabbiteMq
	 * 如果是Direct类型，则会将消息中的RoutingKey与该Exchange关联的所有Binding中的BindingKey进行比较，如果相等，则发送到该Binding对应的Queue中
	 */
	public static final String EXCHANGE_DIRECT                  = "default-exchange";
	public static final String EXCHANGE_DIRECT_DELAY            = "default-exchange-delay";

	/**
	 * RabbiteMq
	 * 如果是Fanout类型，则会将消息发送给所有与该Exchange定义过 Binding的所有 Queues中去，其实是一种广播行为
	 */
	public static final String EXCHANGE_FANOUT                  = "default-exchange-fanout";
	public static final String EXCHANGE_FANOUT_DELAY            = "default-exchange-fanout-delay";
	
	/**
	 * RabbiteMq
	 * 如果是Topic类型，则会按照正则表达式，对RoutingKey与BindingKey进行匹配，如果匹配成功，则发送到对应的Queue中。
	 */
	public static final String EXCHANGE_TOPIC                   = "default-exchange-topic";
	public static final String EXCHANGE_TOPIC_DELAY             = "default-exchange-topic-delay";

	public static final String TOPIC_TEST                       = "test";
	public static final String TOPIC_TEST2                      = "test2";
	public static final String TOPIC_TEST2_DELAY                = "test2-delay";
	
	/** RabbiteMq 电话计费 */
	public static final String TOPIC_JOB_PBX                    = "job-pbx-new";
	/** RabbiteMq 公安 */
	public static final String TOPIC_JOB_RESIDENCE              = "job-residence-new";
	/** RabbiteMq 房控系统 */
	public static final String TOPIC_JOB_ROOM                   = "job-room-new";
	/** RabbiteMq CRM */
	public static final String TOPIC_JOB_CRM                    = "job-crm-new";
	/** RabbiteMq CRS */
	public static final String TOPIC_JOB_CRS                    = "job-crs-new";
	/** RabbiteMq 短信 */
	public static final String TOPIC_JOB_MESSAGE                = "job-message-new";
	/** RabbiteMq 任务分发 */
	public static final String TOPIC_MISSION                    = "mission-new";
	/** RabbiteMq entity日志 */
	public static final String TOPIC_ENTITY_LOG                 = "entity-log-new";
	/** RabbiteMq report日志 */
	public static final String TOPIC_REPORT_LOG                 = "report-log-new";
	/** RabbiteMq number日志 */
	public static final String TOPIC_NUMBER_LOG                 = "number-log-new";
	/** RabbiteMq websocket */
	public static final String TOPIC_WEBSOCKET                  = "websocket";
	/** RabbiteMq 厨打 */
	public static final String TOPIC_POS_PRINTER_TASK           = "pos-printer-task-new";
	/** RabbiteMq websocket通知 */
	public static final String TOPIC_NOTICE_TASK                = "notice-task-new";
	/** apidoc */
	public static final String TOPIC_APIDOC                     = "apidoc-new";
	/** 登录日志 */
	public static final String TOPIC_LOGIN_LOG                  = "login-log-new";
	/** 积分消费 */
	public static final String TOPIC_POINTS                     = "points-new";
	/** 补偿处理，及时队列 */
	public static final String TOPIC_COMPENSATING               = "compensating-new";
	
	/** 携程OTA */
	public static final String TOPIC_CTRIP_OTA                  = "ctrip-ota-new";
	/** 渠道调用日志，如webservice */
	public static final String TOPIC_LOG_CHANNEL_INFO           = "log-channel-info-new";
	
	/** 夜审通知 */
	public static final String TOPIC_AUDIT_NOTICE               = "audit-notice-new";
	/** 从RMS中获取"间夜量"、"房费收入"等预测数据 */
	public static final String TOPIC_GET_RMS_DATA               = "get-rms-data-new";
	/** 计算会员保级 */
	public static final String TOPIC_KEEP_LEVEL                 = "keep-level-new";
	/** 计算会员积分过期清零 */
	public static final String TOPIC_POINTS_EXPIRED             = "points-expired-new";
	
	/** 强一致性校验延迟队列 **/
//	public static final String TOPIC_STRONG_CONSISTENCY         = "strong-consistency-new";
//	public static final String TOPIC_STRONG_CONSISTENCY_DELAY   = "strong-consistency-delay";
	/** 弱一致性校验延迟队列 **/
//	public static final String TOPIC_WEAK_CONSISTENCY           = "weak-consistency-new";
//	public static final String TOPIC_WEAK_CONSISTENCY_DELAY     = "weak-consistency-delay";
	/** 长延迟队列 **/
	public static final String TOPIC_LONG                       = "long-new";
	public static final String TOPIC_LONG_DELAY                 = "long-delay";
	/** 短延迟队列 **/
	public static final String TOPIC_SHORT                      = "short-new";
	public static final String TOPIC_SHORT_DELAY                = "short-delay";
	/** 订单处理延迟队列，1小时零1分，（直销订单预付超一小时取消） **/
	public static final String TOPIC_ORDER_DEAL                 = "order-deal-new";
	public static final String TOPIC_ORDER_DEAL_DELAY           = "order-deal-delay";

	public static final String ROUTING_TEST                     = "test-routing";
	public static final String ROUTING_TEST2                    = "test2-routing";
	public static final String ROUTING_TEST2_DELAY              = "test2-delay-routing";
	
	public static final String ROUTING_JOB_PBX                  = "job-pbx-new-routing";
	public static final String ROUTING_JOB_RESIDENCE            = "job-residence-new-routing";
	public static final String ROUTING_JOB_ROOM                 = "job-room-new-routing";
	public static final String ROUTING_JOB_CRM                  = "job-crm-new-routing";
	public static final String ROUTING_JOB_CRS                  = "job-crs-new-routing";
	public static final String ROUTING_JOB_MESSAGE              = "job-message-new-routing";
	public static final String ROUTING_MISSION                  = "mission-new-routing";
	public static final String ROUTING_ENTITY_LOG               = "entity-log-new-routing";
	public static final String ROUTING_REPORT_LOG               = "report-log-new-routing";
	public static final String ROUTING_NUMBER_LOG               = "number-log-new-routing";
	public static final String ROUTING_WEBSOCKET                = "websocket-routing";
	public static final String ROUTING_POS_PRINTER_TASK         = "pos-printer-task-new-routing";
	public static final String ROUTING_NOTICE_TASK              = "notice-task-new-routing";
	public static final String ROUTING_APIDOC                   = "apidoc-routing-new";
	public static final String ROUTING_LOGIN_LOG                = "login-log-new-routing";
	public static final String ROUTING_POINTS                   = "points-new-routing";
	public static final String ROUTING_COMPENSATING             = "compensating-new-routing";
//	public static final String ROUTING_STRONG_CONSISTENCY       = "strong-consistency-new-routing";
//	public static final String ROUTING_STRONG_CONSISTENCY_DELAY = "strong-consistency-delay-routing";
//	public static final String ROUTING_WEAK_CONSISTENCY         = "weak-consistency-new-routing";
//	public static final String ROUTING_WEAK_CONSISTENCY_DELAY   = "weak-consistency-delay-routing";
	public static final String ROUTING_LONG                     = "long-new-routing";
	public static final String ROUTING_LONG_DELAY               = "long-delay-routing";
	public static final String ROUTING_SHORT                    = "short-new-routing";
	public static final String ROUTING_SHORT_DELAY              = "short-delay-routing";
	public static final String ROUTING_ORDER_DEAL               = "order-deal-new-routing";
	public static final String ROUTING_ORDER_DEAL_DELAY         = "order-deal-delay-routing";
	public static final String ROUTING_CTRIP_OTA                = "ctrip-ota-new-routing";
	public static final String ROUTING_LOG_CHANNEL_INFO         = "log-channel-info-new-routing";
	public static final String ROUTING_AUDIT_NOTICE             = "audit-notice-new-routing";
	public static final String ROUTING_GET_RMS_DATA             = "get-rms-data-new-routing";
	public static final String ROUTING_KEEP_LEVEL               = "keep-level-new-routing";
	public static final String ROUTING_POINTS_EXPIRED           = "points-expired-new-routing";

	public static final String QUEUE_TEST                       = "test-queue";
	public static final String QUEUE_TEST2                      = "test2-queue";
	public static final String QUEUE_TEST2_DELAY                = "test2-delay-queue";
	
	public static final String QUEUE_JOB_PBX                    = "job-pbx-new-queue";
	public static final String QUEUE_JOB_RESIDENCE              = "job-residence-new-queue";
	public static final String QUEUE_JOB_ROOM                   = "job-room-new-queue";
	public static final String QUEUE_JOB_CRM                    = "job-crm-new-queue";
	public static final String QUEUE_JOB_CRS                    = "job-crs-new-queue";
	public static final String QUEUE_JOB_MESSAGE                = "job-message-new-queue";
	public static final String QUEUE_MISSION                    = "mission-new-queue";
	public static final String QUEUE_ENTITY_LOG                 = "entity-log-new-queue";
	public static final String QUEUE_REPORT_LOG                 = "report-log-new-queue";
	public static final String QUEUE_NUMBER_LOG                 = "number-log-new-queue";
	public static final String QUEUE_WEBSOCKET                  = "websocket-queue";
	public static final String QUEUE_POS_PRINTER_TASK           = "pos-printer-task-new-queue";
	public static final String QUEUE_NOTICE_TASK                = "notice-task-new-queue";
	public static final String QUEUE_APIDOC                     = "apidoc-new-queue";
	public static final String QUEUE_LOGIN_LOG                  = "login-log-new-queue";
	public static final String QUEUE_POINTS                     = "points-new-queue";
	public static final String QUEUE_COMPENSATING               = "compensating-new-queue";
//	public static final String QUEUE_STRONG_CONSISTENCY         = "strong-consistency-new-queue";
//	public static final String QUEUE_STRONG_CONSISTENCY_DELAY   = "strong-consistency-delay-queue";
//	public static final String QUEUE_WEAK_CONSISTENCY           = "weak-consistency-new-queue";
//	public static final String QUEUE_WEAK_CONSISTENCY_DELAY     = "weak-consistency-delay-queue";
	public static final String QUEUE_LONG                       = "long-new-queue";
	public static final String QUEUE_LONG_DELAY                 = "long-delay-queue";
	public static final String QUEUE_SHORT                      = "short-new-queue";
	public static final String QUEUE_SHORT_DELAY                = "short-delay-queue";
	public static final String QUEUE_ORDER_DEAL                 = "order-deal-new-queue";
	public static final String QUEUE_ORDER_DEAL_DELAY           = "order-deal-delay-queue";
	public static final String QUEUE_CTRIP_OTA                  = "ctrip-ota-new-queue";
	public static final String QUEUE_LOG_CHANNEL_INFO           = "log-channel-info-new-queue";
	public static final String QUEUE_AUDIT_NOTICE               = "audit-notice-new-queue";
	public static final String QUEUE_GET_RMS_DATA               = "get-rms-data-new-queue";
	public static final String QUEUE_KEEP_LEVEL                 = "keep-level-new-queue";
	public static final String QUEUE_POINTS_EXPIRED             = "points-expired-new-queue";
	
	/** Queue TTL (对整个队列设置一个过期时间) */
	public static final long X_EXPIRES_6   = 6000;
	public static final long X_EXPIRES_60  = 60000;
	public static final long X_EXPIRES_180 = 180000;
	public static final long X_EXPIRES_300 = 300000;
	public static final long X_EXPIRES_3660 = 3660000;
}
