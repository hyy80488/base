package com.jw.base.framework.core.zk.config;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.TreeCache;
import org.apache.curator.framework.recipes.cache.TreeCacheEvent;
import org.apache.curator.framework.recipes.cache.TreeCacheListener;
import org.apache.curator.utils.ZKPaths;
import org.apache.zookeeper.CreateMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jw.base.framework.core.zk.IZKListener;

/**
 * 主要用到Curator的NodeCache类，它的主要功能是用来监听znode本身的变化，并可以获取当前值，而且会自动重复监听，简化了原生API开发的繁琐过程。
 */
public class APIConfigListener implements IZKListener {

	// 获取logback实例
	Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	private String path;

	private TreeCache cache;
	// Logback日志级别ZNode
	public APIConfigListener(String path) {
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
		//TreeCache
		//（1）永久监听指定节点下的节点的变化 
		//（2）可以监听到指定节点下所有节点的变化，比如说指定节点”/example”, 在下面添加”node1”可以监听到，但是添加”node1/n1”也能被监听到 
		//（3）可以监听到的事件：节点创建、节点数据的变化、节点删除等
		cache = new TreeCache(client, path);
		TreeCacheListener treeCacheListener = new TreeCacheListener() {
            @Override
            public void childEvent(CuratorFramework client, TreeCacheEvent event) throws Exception {
                switch (event.getType()) {
                    case NODE_ADDED:
                        System.out.println("Node add " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
                    case NODE_REMOVED:
                        System.out.println("Node removed " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
                    case NODE_UPDATED:
                        System.out.println("Node updated " + ZKPaths.getNodeFromPath(event.getData().getPath()));
                        break;
					default:
						break;
                }
            }
        };
        cache.getListenable().addListener(treeCacheListener);
		try {
			cache.start();
		} catch (Exception e) {
			log.error("Start NodeCache error for path: {}, error info: {}", path, e.getMessage());
		}
	}
}
