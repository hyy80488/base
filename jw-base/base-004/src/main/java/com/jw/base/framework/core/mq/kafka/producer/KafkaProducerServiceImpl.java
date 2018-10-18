/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.jw.base.framework.core.mq.JwMessage;
import com.jw.base.framework.core.mq.JwMqSender;
import com.jw.base.framework.core.mq.common.DetailRes;
import com.jw.base.framework.core.util.FastJsonUtil;

/**
 * ## 类说明：
 * 	Kafka消息Producer实现类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq.kafka
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|KafkaProducerServiceImpl.java新增
*/
@Component("kafkaImpl")
public class KafkaProducerServiceImpl implements JwMqSender {
	
	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;
	
	@Override
	public DetailRes sendJobPbxByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobResidenceByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobRoomByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobCrmByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobCrsByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobMessageByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendMissionByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendEntityLogByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendReporttLogByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendNumbertLogByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendWebsocketByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendPosPrinterTaskByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendNoticeTaskByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendApidocByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendPointsByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	

	@Override
	public DetailRes sendLoginLogByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendCompensatingByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendCtripOTA(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendLogChannelInfo(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendAuditNoticeByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendGetRMSDataByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendKeepLevelByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendPointsExpiredByDirect(JwMessage msg) {
		kafkaTemplate.setDefaultTopic(msg.getTopics());
		kafkaTemplate.sendDefault(FastJsonUtil.toJSONStringSerializer(msg));
		return new DetailRes(true, "");
	}
	

}
