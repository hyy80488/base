/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.rabbitmq.producer;

import com.jw.base.framework.core.mq.common.DetailRes;

/**
 * ## 类说明：
 * 	RabbitMQ消息生产类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq.rabbitmq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|MessageSender.java新增
*/
public interface MessageSender {
	
    /**
     * ## 方法说明：
	 * 	消息发送
	 * @param exchange
	 * @param routingKey
	 * @param message
	 */
    DetailRes send(String exchange, String routingKey, Object message);
    
}
