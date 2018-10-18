package com.jw.base.framework.core.cache;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.rubyeye.xmemcached.GetsResponse;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;

/**
 * memcached 缓存工具类
 */
@Component
public class MemcachedUtil {
	private static final Logger logger = LoggerFactory.getLogger(MemcachedUtil.class);
	
	@Autowired
	private MemcachedClient memcachedClient;

	/**
	* 获取数据
	* @param key 关键字
	* @return 字符串
	*/
	public Object get(String key) {
		Object result = null;
		try {
			result = memcachedClient.get(key);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 设置数据过期时间
	* @param key 关键字
	* @param value 值
	* @param expire 生存时间 1000
	* @return boolean
	*/
	public boolean set(String key, Object value, int expire) {
		boolean result = false;
		try {
			result = memcachedClient.set(key, expire, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 设置数据
	* @param key 关键字
	* @param value 值
	* @return boolean
	*/
	public boolean set(String key, Object value) {
		boolean result = false;
		try {
			result = memcachedClient.set(key, 0, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 替换更新数据
	* @param key 关键字
	* @param value 值
	* @return boolean
	*/
	public boolean update(String key, Object value) {
		boolean result = false;
		try {
			result = memcachedClient.replace(key, 0, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 替换更新数据 过期时间
	* @param key 关键字
	* @param value 值
	* @param expire 100
	* @return boolean
	*/
	public boolean replace(String key, Object value, int expire) {
		boolean result = false;
		try {
			result = memcachedClient.replace(key, expire, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 增加数据
	* @param key 关键字
	* @param value 值
	* @return boolean
	*/
	public boolean add(String key, Object value, int expire) {
		boolean result = false;
		try {
			result = memcachedClient.add(key, expire, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 增加数据
	* @param key 关键字
	* @param value 值
	* @return boolean
	*/
	public boolean add(String key, Object value) {
		boolean result = false;
		try {
			result = memcachedClient.add(key, 0, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 向后追加数据
	* @param key 关键字
	* @param value 值
	* @return boolean
	*/
	public boolean append(String key, Object value) {
		boolean result = false;
		try {
			result = memcachedClient.append(key, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 向前追加数据
	* @param key 关键字
	* @param value 值
	* @return boolean
	*/
	public boolean prepend(String key, Object value) {
		boolean result = false;
		try {
			result = memcachedClient.prepend(key, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 递增
	* @param key 关键字
	* @param value 值
	* @return LONG
	*/
	public long incr(String key, long value) {
		long result = 0L;
		try {
			result = memcachedClient.incr(key, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 递减
	* @param key 关键字
	* @param value 值
	* @return LONG
	*/
	public long decr(String key, long value) {
		long result = 0L;
		try {
			result = memcachedClient.decr(key, value);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 删除
	* @param key 关键字
	* @return
	*/
	public boolean del(String key) {
		boolean result = true;
		try {
			result = memcachedClient.delete(key);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 删除
	* @param key 关键字
	* @return
	*/
	public void deleteWithNoReply(String key) {
		try {
			memcachedClient.deleteWithNoReply(key);
		} catch (InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	* 查询此缓存是否存在
	* @param <T>
	* @param key
	* @param secondsToExpire
	* @param value
	* @return
	*/
	public <T> boolean cas(String key, int secondsToExpire, T value) {
		boolean flag = false;
		long cas = 0;
		//notNullValue("key", key);
		try {
			GetsResponse<Long> result = memcachedClient.gets(key);
			if (result != null) {
				cas = result.getCas();
			}
			if (memcachedClient.cas(key, secondsToExpire, value, cas)) {
				flag = true;// 说明此值被修改过
			}
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return flag;
	}

	/**
	* 统计具体的项目
	* @param projectName 项目名
	* @return
	*/
	public Map<InetSocketAddress, Map<String, String>> getStatsByItem(String projectName) {
		Map<InetSocketAddress, Map<String, String>> result = null;
		try {
			result = memcachedClient.getStatsByItem(projectName);
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	* 统计协议用于查看统计信息
	* @return
	*/
	public Map<InetSocketAddress, Map<String, String>> getStatsByItem() {
		Map<InetSocketAddress, Map<String, String>> result = null;
		try {
			result = memcachedClient.getStats();
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			logger.error("get error：[{}]" + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		MemcachedClientBuilder builder = new XMemcachedClientBuilder("192.168.18.213:11211");
		net.rubyeye.xmemcached.MemcachedClient memcachedClient = null;
		try {
			memcachedClient = builder.build();
			memcachedClient.set("hello", 0, "Hello,xmemcached");
			String value = memcachedClient.get("hello");
			System.out.println("hello=" + value);
			memcachedClient.delete("hello");
			value = memcachedClient.get("hello");
			System.out.println("hello=" + value);
		} catch (MemcachedException e) {
			System.err.println("MemcachedClient operation fail");
			e.printStackTrace();
		} catch (java.util.concurrent.TimeoutException e) {
			System.err.println("MemcachedClient operation timeout");
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				memcachedClient.shutdown();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
