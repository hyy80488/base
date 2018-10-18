/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.protocol;

import java.lang.reflect.Constructor;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.protocol.AbstractProxyProtocol;

/**
 * ## 类说明：
 * 	为dubbo-rpc添加"原生thrift"支持
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.protocol
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|Thrift2Protocol.java新增
 */
public class Thrift2Protocol extends AbstractProxyProtocol {
	public static final int DEFAULT_PORT = 33208;
	private static final Logger logger = LoggerFactory.getLogger(Thrift2Protocol.class);

	@Override
	public int getDefaultPort() {
		return DEFAULT_PORT;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param impl
	 * @param type
	 * @param url
	 * @return
	 * @throws RpcException
	 */
	@Override
	protected <T> Runnable doExport(T impl, Class<T> type, URL url) throws RpcException {

		logger.info("impl => " + impl.getClass());
		logger.info("type => " + type.getName());
		logger.info("url => " + url);

		TProcessor tprocessor;
		TNonblockingServer.Args tArgs = null;
		String iFace = "$Iface";
		String processor = "$Processor";
		String typeName = type.getName();
		TNonblockingServerSocket transport;
		if (typeName.endsWith(iFace)) {
			String processorClsName = typeName.substring(0, typeName.indexOf(iFace)) + processor;
			try {
				Class<?> clazz = Class.forName(processorClsName);
				Constructor constructor = clazz.getConstructor(type);
				try {
					tprocessor = (TProcessor) constructor.newInstance(impl);
					transport = new TNonblockingServerSocket(url.getPort());
					tArgs = new TNonblockingServer.Args(transport);
					tArgs.processor(tprocessor);
					tArgs.transportFactory(new TFramedTransport.Factory());
					tArgs.protocolFactory(new TCompactProtocol.Factory());
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
					throw new RpcException("Fail to create thrift server(" + url + ") : " + e.getMessage(), e);
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				throw new RpcException("Fail to create thrift server(" + url + ") : " + e.getMessage(), e);
			}
		}

		if (tArgs == null) {
			logger.error("Fail to create thrift server(" + url + ") due to null args");
			throw new RpcException("Fail to create thrift server(" + url + ") due to null args");
		}
		final TServer thriftServer = new TNonblockingServer(tArgs);

		new Thread(new Runnable() {
			@Override
			public void run() {
				logger.info("Start Thrift Server");
				thriftServer.serve();
				logger.info("Thrift server started.");
			}
		}).start();

		return new Runnable() {
			@Override
			public void run() {
				try {
					logger.info("Close Thrift Server");
					thriftServer.stop();
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
			TSocket tSocket;
			TTransport transport;
			TProtocol protocol;
			T thriftClient = null;
			String iFace = "$Iface";
			String client = "$Client";

			String typeName = type.getName();
			if (typeName.endsWith(iFace)) {
				String clientClsName = typeName.substring(0, typeName.indexOf(iFace)) + client;
				Class<?> clazz = Class.forName(clientClsName);
				Constructor constructor = clazz.getConstructor(TProtocol.class);
				try {
					tSocket = new TSocket(url.getHost(), url.getPort());
					transport = new TFramedTransport(tSocket);
					protocol = new TCompactProtocol(transport);
					thriftClient = (T) constructor.newInstance(protocol);
					transport.open();
					logger.info("thrift client opened for service(" + url + ")");
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
					throw new RpcException("Fail to create remoting client:" + e.getMessage(), e);
				}
			}
			return thriftClient;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RpcException("Fail to create remoting client for service(" + url + "): " + e.getMessage(), e);
		}
	}

}
