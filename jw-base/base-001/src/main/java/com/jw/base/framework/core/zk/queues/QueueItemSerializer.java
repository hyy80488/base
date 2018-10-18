package com.jw.base.framework.core.zk.queues;

import org.apache.curator.framework.recipes.queue.QueueSerializer;

/**
 * 数据系列化处理工具类
 */
public class QueueItemSerializer implements QueueSerializer<String> {
	@Override
	public byte[] serialize(String item) {
		return item.getBytes();
	}

	@Override
	public String deserialize(byte[] bytes) {
		return new String(new String(bytes));
	}
}
