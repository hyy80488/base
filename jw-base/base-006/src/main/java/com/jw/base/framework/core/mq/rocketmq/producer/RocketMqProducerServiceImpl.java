/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.rocketmq.producer;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.jw.base.framework.core.mq.JwMessage;
import com.jw.base.framework.core.mq.JwMqSender;
import com.jw.base.framework.core.mq.common.DetailRes;
import com.jw.base.framework.core.util.FastJsonUtil;

/**
 * ## 类说明：
 * 	Rocket消息Producer实现类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.base.framework.core.mq.rocketmq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|RocketMqProducerServiceImpl.java新增
*/
public class RocketMqProducerServiceImpl implements JwMqSender {
	
	private String namesrvAddr;
    private String producerGroup;
    private String topic;
    private String keys;
    private String tags;
    private DefaultMQProducer producer;

    public String getNamesrvAddr() {
        return namesrvAddr;
    }

    public void setNamesrvAddr(String namesrvAddr) {
        this.namesrvAddr = namesrvAddr;
    }

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 */
	public void init(){
        producer = new DefaultMQProducer(producerGroup);
        producer.setNamesrvAddr(namesrvAddr);
        producer.setProducerGroup(producerGroup);
        try {
            producer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        }
    }

	@Override
	public DetailRes sendJobPbxByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobResidenceByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	
	@Override
	public DetailRes sendJobRoomByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobCrmByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobCrsByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendJobMessageByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendMissionByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendEntityLogByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendReporttLogByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendNumbertLogByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendWebsocketByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendPosPrinterTaskByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendNoticeTaskByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendApidocByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendPointsByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}

	@Override
	public DetailRes sendLoginLogByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendCompensatingByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendCtripOTA(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendLogChannelInfo(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendAuditNoticeByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendGetRMSDataByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendKeepLevelByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
	@Override
	public DetailRes sendPointsExpiredByDirect(JwMessage msg) {
		try {
			Message message = new Message();
			message.setBuyerId(msg.getMsgId());
			message.setKeys(msg.getKeys());
			message.setTopic(msg.getTopics());
			message.setTags(msg.getTags());
			message.setBody(FastJsonUtil.toJSONStringSerializer(msg).getBytes());
			SendResult result = producer.send(message);
		} catch (MQClientException e) {
			e.printStackTrace();
		} catch (RemotingException e) {
			e.printStackTrace();
		} catch (MQBrokerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new DetailRes(true, "");
	}
	
}
