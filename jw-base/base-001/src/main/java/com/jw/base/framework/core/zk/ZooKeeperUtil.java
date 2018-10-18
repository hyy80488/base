package com.jw.base.framework.core.zk;

import java.util.List;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.BackgroundCallback;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.framework.api.CuratorListener;
import org.apache.curator.framework.api.UnhandledErrorListener;
import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.framework.state.ConnectionStateListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.URLDecoder;

import com.jw.base.framework.core.ConstantZk;
import com.jw.base.framework.core.util.ListUtil;

/**
 * ## 类说明：
 * 	Curator Framework提供了简化使用zookeeper更高级的API接口。它包涵很多优秀的特性，主要包括以下三点：
 * 1、自动连接管理：自动处理zookeeper的连接和重试存在一些潜在的问题；可以watch NodeDataChanged event和获取updateServerList;Watches可以自动被Cruator recipes删除；
 * 2、更干净的API：简化raw zookeeper方法，事件等；提供现代流式API接口；
 * 3、Recipe实现：leader选举，分布式锁，path缓存，和watcher,分布式队列等。
 * Curator框架通过CuratorFrameworkFactory以工厂模式和builder模式创建CuratorFramework实例。 CuratorFramework实例都是线程安全的。
 * @author    [liubowen]   
 * @version   [V1.0, 2017年6月8日]
 * @package com.jw.base.framework.core.zk
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年6月8日|liubowen|新增|ZooKeeperUtil.java新增
 */
public class ZooKeeperUtil {

	private static final Logger logger = LoggerFactory.getLogger(ZooKeeperUtil.class);

	/**
	 * ## 方法说明：
	 * 	创建节点
	 * @param newClient CuratorFramework实例
	 * @param path 遵循linux文件path格式，创建node时指定的path，父path节点需要存在，否则创建节点失败
	 * @param createMode 用于指定创建节点的类型，zookeeper中节点有两种类型，临时节点和永久节点
	 * CreateMode.PERSISTENT: 创建节点后，不删除就永久存在
	 * CreateMode.PERSISTENT_SEQUENTIAL：节点path末尾会追加一个10位数的单调递增的序列
	 * CreateMode.EPHEMERAL：创建后，回话结束节点会自动删除
	 * CreateMode.EPHEMERAL_SEQUENTIAL：节点path末尾会追加一个10位数的单调递增的序列
	 * @param data 存储的数据
	 */
	public static void createNode(CuratorFramework client, String path, CreateMode createMode, byte[] data) {
		try {
			//forPath函数指定创建节点的path和保存的数据
			//znode中保存的数据需要进行序列化，用户可以选择使用JSON，XML，java内置的序列化机制，或者Hession以及Google的protocal Buffer
			
			//creatingParentsIfNeeded（是否同时创建父节点）、withMode（创建的节点类型）
			client.create().creatingParentsIfNeeded().withMode(createMode).forPath(path, data);
			
			//client.create().withMode(createMode).forPath(path, data);
		} catch (Exception e) {
			logger.error("创建节点失败, elog=" + e.getMessage());
		}
	}

	/**
	 * ## 方法说明：
	 * 	获取节点数据
	 * @param newClient CuratorFramework实例
	 * @param path znode的path
	 */
	public static String getData(CuratorFramework client, String path) {
		try {
			//CuratorFramework提供getData函数，通过指定znode的path，就可以完成数据的获取。
			return new String(client.getData().forPath(path));
		} catch (Exception e) {
			logger.error("获取数据失败, elog=" + e.getMessage());
		}
		return null;
	}

	/**
	 * ## 方法说明：
	 * 	更新节点
	 * @param newClient CuratorFramework实例
	 * @param path znode的path
	 * @param data 存储的数据
	 */
	public static void setData(CuratorFramework client, String path, byte[] data) {
		try {
			//CuratorFramework提供setData函数，通过指定znode的path，可以完成数据的更新。
			client.setData().forPath(path, data);
		} catch (Exception e) {
			logger.error("更新节点数据失败, elog=" + e.getMessage());
		}
	}

	/**
	 * ## 方法说明：
	 * 	异步更新节点【inBackground()+CuratorListener】
	 * @param newClient CuratorFramework实例
	 * @param path znode的path
	 * @param data 存储的数据
	 */
	public static void setDataAsync(CuratorFramework client, String path, byte[] data) throws Exception {
		// this is one method of getting event/async notifications
		CuratorListener listener = new CuratorListener() {
			@Override
			public void eventReceived(CuratorFramework client, CuratorEvent event) throws Exception {
				// examine event for details
			}
		};
		client.getCuratorListenable().addListener(listener);
		// set data for the given node asynchronously. The completion notification is done via the CuratorListener.
		client.setData().inBackground().forPath(path, data);
	}

	/**
	 * ## 方法说明：
	 * 	异步更新节点【inBackground(BackgroundCallback)】
	 * @param newClient CuratorFramework实例
	 * @param path znode的path
	 * @param data 存储的数据
	 */
	public static void setDataAsyncWithCallback(CuratorFramework client, BackgroundCallback callback, String path, byte[] data) throws Exception {
		// this is another method of getting notification of an async completion
		// inBackground绑定异步回调方法。比如在创建节点时绑定一个回调方法，该回调方法可以输出服务器的状态码以及服务器的事件类型等信息，还可以加入一个线程池进行优化操作。
		client.setData().inBackground(callback).forPath(path, data);
	}

	/**
	 * ## 方法说明：
	 * 	删除节点
	 * @param newClient CuratorFramework实例
	 * @param path znode的path
	 */
	public static void deleteNode(CuratorFramework client, String path) {
		try {
			client.delete().forPath(path);
		} catch (Exception e) {
			logger.error("删除节点失败, elog=" + e.getMessage());
		}
	}

	/**
	 * ## 方法说明：
	 * 	安全删除节点
	 * @param newClient CuratorFramework实例
	 * @param path znode的path
	 */
	public static void guaranteedDelete(CuratorFramework client, String path) throws Exception {
		// delete the given node and guarantee that it completes
		//deletingChildrenIfNeeded（是否同时删除子节点）、guaranteed（安全删除）、withVersion（版本检查）
		client.delete().guaranteed().deletingChildrenIfNeeded().forPath(path);
	}

	/**
	 * ## 方法说明：
	 * 	获得状态watch的ZNode的子节点列表
	 * @param newClient CuratorFramework实例
	 * @param path znode的path
	 */
	public static List<String> watchedGetChildren(CuratorFramework client, String path) throws Exception {
        /**
         * Get children and set a watcher on the node. The watcher notification
         * will come through the CuratorListener (see setDataAsync() above).
         */
        return client.getChildren().watched().forPath(path);
    }

	/**
	 * ## 方法说明：
	 * 	获得某个watch的ZNode的子节点列表
	 * @param newClient CuratorFramework实例
	 * @param path znode的path
	 */
    public static List<String> watchedGetChildren(CuratorFramework client, String path, Watcher watcher) throws Exception {
        /**
         * Get children and set the given watcher on the node.
         */
        return client.getChildren().usingWatcher(watcher).forPath(path);
    }
    
	private static List<IZKListener> listeners;

	//设置Zookeeper启动后需要调用的监听或者，或者需要做的初始化工作。
	public void setListeners(List<IZKListener> listeners) {
		ZooKeeperUtil.listeners = listeners;
	}

	/**
	 * ## 方法说明：
	 * 	注册需要监听的监听者对象
	 * @param newClient CuratorFramework实例
	 */
	public static void registerListeners(CuratorFramework client) {
		client.getConnectionStateListenable().addListener(new ConnectionStateListener() {
			@Override
			public void stateChanged(CuratorFramework client, ConnectionState newState) {
				logger.info("CuratorFramework state changed: {}", newState);
				if (newState == ConnectionState.CONNECTED || newState == ConnectionState.RECONNECTED) {
					for (IZKListener listener : listeners) {
						listener.executor(client);
						logger.info("Listener {} executed!", listener.getClass().getName());
					}
				}
			}
		});
		client.getUnhandledErrorListenable().addListener(new UnhandledErrorListener() {
			@Override
			public void unhandledError(String message, Throwable e) {
				logger.info("CuratorFramework unhandledError: {}", message);
			}
		});
	}
	
	public static void main(String[] args) {
		try {
			RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
			CuratorFramework client = CuratorFrameworkFactory.builder()
															 .connectString("localhost:2181")
															 .retryPolicy(retryPolicy)
															 .connectionTimeoutMs(2000)
															 .sessionTimeoutMs(10000).build();
			client.start();
//			String dataStr = DateUtil.formatDate(new Date(), DateUtil.FMT_YMD);
//			ZooKeeperUtil.createNode(client, "/"+dataStr+"/0391d276-c341-4b60-b3c2-c9032015e480/serverA", CreateMode.PERSISTENT, "uncommit".getBytes());
			List<String> listServer = ZooKeeperUtil.watchedGetChildren(client, "/"+ConstantZk.JW_API_SERVER);
			if(ListUtil.isNotEmpty(listServer)){
				for (String server : listServer){
					List<String> list = ZooKeeperUtil.watchedGetChildren(client, "/"+ConstantZk.JW_API_SERVER+"/"+server);
					if(ListUtil.isNotEmpty(list)){
						for (String s : list){
							System.out.println("==================string======================"+URLDecoder.decode(s, "UTF-8"));
							String value = ZooKeeperUtil.getData(client, "/"+ConstantZk.JW_API_SERVER+"/192.168.18.31_3160001RA-1.0.0-SNAPSHOT/"+s);
							System.out.println("==================value======================"+value);
						}
					}
				}
			}
			client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
