package com.jw.base.framework.core.zk;

import org.apache.curator.framework.CuratorFramework;

/**
 * ## 类说明：
 * 	所有需要在ZK客户端链接成功后需要做的事件，需要实现这个接口，由上面的ZookeeperFactoryBean统一调度。
 * @author    [liubowen]   
 * @version   [V1.0, 2017年6月8日]
 * @package com.jw.base.framework.core.zk
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年6月8日|liubowen|新增|IZKListener.java新增
 */
public interface IZKListener {
	void executor(CuratorFramework client);
}
