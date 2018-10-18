package com.jw.base.framework.core.zk.config;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.zookeeper.CreateMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jw.base.framework.core.zk.IZKListener;

/**
 * 主要用到Curator的NodeCache类，它的主要功能是用来监听znode本身的变化，并可以获取当前值，而且会自动重复监听，简化了原生API开发的繁琐过程。
 */
public class ServerConfigListener implements IZKListener {

	// 获取logback实例
	Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	private String path;

	private NodeCache cache;
	// Logback日志级别ZNode
	public ServerConfigListener(String path) {
		this.path = path;
	}

	@Override
	public void executor(CuratorFramework client) {
		try {
			if (client.checkExists().forPath(path) == null) {
				client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath(path, "".getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 使用Curator的NodeCache来做ZNode的监听，不用我们自己实现重复监听
		cache = new NodeCache(client, path);
		cache.getListenable().addListener(new NodeCacheListener() {
			@Override
			public void nodeChanged() throws Exception {
				byte[] data = cache.getCurrentData().getData();
				// 设置日志级别
				if (data != null) {
					String level = new String(data);
//					Logger logger = (Logger) LoggerFactory.getLogger("root");
//                  Level newLevel = Level.fromLocationAwareLoggerInteger(Integer.parseInt(level));
//                  logger.setLevel(newLevel);
					System.out.println("Setting logback new level to :" + level);
				}
			}
		});
		try {
			cache.start(true);
		} catch (Exception e) {
			log.error("Start NodeCache error for path: {}, error info: {}", path, e.getMessage());
		}
	}
}
