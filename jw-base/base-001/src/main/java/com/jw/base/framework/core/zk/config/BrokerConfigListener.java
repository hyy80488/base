package com.jw.base.framework.core.zk.config;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;
import org.apache.curator.utils.ZKPaths;
import org.apache.zookeeper.CreateMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jw.base.framework.core.zk.IZKListener;

/**
 * 主要用到Curator的NodeCache类，它的主要功能是用来监听znode本身的变化，并可以获取当前值，而且会自动重复监听，简化了原生API开发的繁琐过程。
 */
public class BrokerConfigListener implements IZKListener {

	// 获取logback实例
	Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	private String path;

	private PathChildrenCache cache;

	// Logback日志级别ZNode
	public BrokerConfigListener(String path) {
		this.path = path;
	}

	@Override
	public void executor(CuratorFramework client) {
		try {
			if (client.checkExists().forPath(path) == null) {
				client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath(path, "".getBytes());
			}
//			List<String> list = client.getChildren().forPath(path);
//			if(ListUtil.isNotEmpty(list)){
//				for (String childrenPath : list){
//					// 使用Curator的NodeCache来做ZNode的监听，不用我们自己实现重复监听
//					NodeCache cache = new NodeCache(client, path+"/"+childrenPath);
//					cache.getListenable().addListener(new NodeCacheListener() {
//						@Override
//						public void nodeChanged() throws Exception {
//							byte[] data = cache.getCurrentData().getData();
//							// 设置日志级别
//							if (data != null) {
//								System.out.println("Setting " + childrenPath + " to :" + new String(data));
//							}
//						}
//					});
//					try {
//						cache.start(true);
//					} catch (Exception e) {
//						log.error("Start NodeCache error for path: {}, error info: {}", path+"/"+childrenPath, e.getMessage());
//					}
//				}
//			}
			
			cache = new PathChildrenCache(client, path, true);
			PathChildrenCacheListener listener = new PathChildrenCacheListener() {
	            @Override
	            public void childEvent(CuratorFramework client, PathChildrenCacheEvent event) throws Exception {
	                String path = ZKPaths.getNodeFromPath(event.getData().getPath());
	                byte[] data = event.getData().getData();
	                String dataStr = new String(data);
	                switch (event.getType()) {
	                    case CHILD_ADDED: {
	                        System.out.println("Node added: " + path + " data " + dataStr);
	                        break;
	                    }
	                    case CHILD_UPDATED: {
	                        System.out.println("Node changed: " + path + " data " + dataStr);
	                        break;
	                    }
	                    case CHILD_REMOVED: {
	                        System.out.println("Node removed: " + path + " data " + dataStr);
	                        break;
	                    }
						default:
							break;
	                }
	            }
	        };
	        cache.getListenable().addListener(listener);
	        
			try {
				cache.start();
			} catch (Exception e) {
				log.error("Start NodeCache error for path: {}, error info: {}", path, e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
