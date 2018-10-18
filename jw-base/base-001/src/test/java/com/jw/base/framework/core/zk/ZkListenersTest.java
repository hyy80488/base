package com.jw.base.framework.core.zk;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jw.base.framework.core.zk.queues.ItemSerializer;
import com.jw.base.framework.core.zk.queues.QueueItemSerializer;

//@ContextConfiguration(locations = { "classpath:conf_test/app-include.xml" })
//@RunWith(SpringJUnit4ClassRunner.class)
public class ZkListenersTest {
	
	
	@Test
	public void testSetParamType_liubowen() throws Exception {
		// 1000 是重试间隔时间基数，3 是重试次数
		RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
		CuratorFramework zkClient = createWithOptions("localhost:2181", retryPolicy, 2000, 10000);
		zkClient.start();
		//需要使用特定的格式来添加数据到队列，使用ItemSerializer来做格式化生成byte。
        byte[] bytes = ItemSerializer.serialize("1111111111", new QueueItemSerializer());
        //创建znode并添加数据
        String path = zkClient.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT_SEQUENTIAL).forPath("/jw_queues/queues/queue-");
        zkClient.setData().forPath(path, bytes);
	}
	
	/**
	 * 通过自定义参数创建
	 */
	public CuratorFramework createWithOptions(String connectionString, RetryPolicy retryPolicy, int connectionTimeoutMs, int sessionTimeoutMs) {
		return CuratorFrameworkFactory.builder().connectString(connectionString).retryPolicy(retryPolicy).connectionTimeoutMs(connectionTimeoutMs).sessionTimeoutMs(sessionTimeoutMs).build();
	}
}
