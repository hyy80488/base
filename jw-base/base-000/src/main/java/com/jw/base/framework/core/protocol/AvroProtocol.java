/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.protocol;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.protocol.AbstractProxyProtocol;
import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.reflect.ReflectRequestor;
import org.apache.avro.ipc.reflect.ReflectResponder;
 
import java.net.InetSocketAddress;
 
/**
 * ## 类说明：
 * 	为dubbo-rpc添加avro支持
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.protocol
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|AvroProtocol.java新增
 */
public class AvroProtocol extends AbstractProxyProtocol {
    public static final int DEFAULT_PORT = 40881;
    private static final Logger logger = LoggerFactory.getLogger(AvroProtocol.class);

    @Override
    public int getDefaultPort() {
        return DEFAULT_PORT;
    }
 
    /**
     * ## 方法说明：
     * 	描述
     * @param impl
     * @param type
     * @param url
     * @return
     * @throws RpcException
     */
    @Override
    protected <T> Runnable doExport(T impl, Class<T> type, URL url)
            throws RpcException {
 
        logger.info("impl => " + impl.getClass());
        logger.info("type => " + type.getName());
        logger.info("url => " + url);
 
        final Server server = new NettyServer(new ReflectResponder(type, impl),
                new InetSocketAddress(url.getHost(), url.getPort()));
        server.start();
 
        return new Runnable() {
        	@Override
            public void run() {
                try {
                    logger.info("Close Avro Server");
                    server.close();
                } catch (Throwable e) {
                    logger.warn(e.getMessage(), e);
                }
            }
        };
    }
 
    /**
     * 
     * ## 方法说明：
     * 	描述
     * @param type
     * @param url
     * @return
     * @throws RpcException
     */
    @Override
    protected <T> T doRefer(Class<T> type, URL url) throws RpcException {
 
        logger.info("type => " + type.getName());
        logger.info("url => " + url);
 
        try {
            NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(url.getHost(), url.getPort()));
            T ref = ReflectRequestor.getClient(type, client);
            logger.info("Create Avro Client");
            return ref;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RpcException("Fail to create remoting client for service(" + url + "): " + e.getMessage(), e);
        }
    }
 
}