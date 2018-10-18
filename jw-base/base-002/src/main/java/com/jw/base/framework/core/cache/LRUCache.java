package com.jw.base.framework.core.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 缓存类（最近最少未使用） 利用LinkedHashMap实现简单的缓存， 必须实现removeEldestEntry方法，具体参见JDK文档
 * LRU(Least Recently Used ，最近最少使用)
 * 算法根据数据的最近访问记录来淘汰数据，其原理是如果数据最近被访问过，将来被访问的几概率相对比较高，最常见的实现是使用一个链表保存缓存数据，详细具体算法如下：
 * 1. 新数据插入到链表头部；
 * 2. 每当缓存数据命中，则将数据移到链表头部；
 * 3. 当链表满的时候，将链表尾部的数据丢弃。
 * @param <K,V>
 */
public class LRUCache<K, V> implements Serializable {
	
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -1638009075329900870L;
	
	/**
	 * 缓存实际大小
	 */
	private int cacheSize = 20;
	
	/**
	 * 加载因子：加载因子是表示Hash表中元素的填满的程度
	 * 若:加载因子越大,填满的元素越多,好处是,空间利用率高了,但:冲突的机会加大了.反之,加载因子越小,填满的元素越少,好处是:冲突的机会减小了,但:空间浪费多了
	 * 冲突的机会越大,则查找的成本越高.反之,查找的成本越小.因而,查找时间就越小.
	 * HashMap默认的加载因子是0.75，最大容量是16，因此可以得出HashMap的默认容量是：0.75*16=12
	 */
	private static final float DEFAULT_LOAD_FACTOR = 0.75f;  
	
	/**
	 * 线程同步锁
	 */
	private static final Lock lock = new ReentrantLock();

	private LinkedHashMap<K,V> map;  
	
	public LRUCache(int size) {
		this.cacheSize = size;

		int hashTableCapacity = (int) Math.ceil(size / DEFAULT_LOAD_FACTOR) + 1;
		map = new LinkedHashMap<K, V>(hashTableCapacity, DEFAULT_LOAD_FACTOR, true) {
			private static final long serialVersionUID = 1;

			@Override
			protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
				try {
					lock.lock();
					return size() > LRUCache.this.cacheSize;
				} finally {
					lock.unlock();
				}
			}
		};
	}

	/*
	 * 清空緩存
	 * @see java.util.LinkedHashMap#clear()
	 */
	public void clear() {
		try {
			lock.lock();
			map.clear();
		} finally {
			lock.unlock();
		}
	}

	/*
	 * 判断是否包含该对象
	 * @see java.util.LinkedHashMap#containsValue(java.lang.Object)
	 */
	public boolean containsValue(Object value) {
		try {
			lock.lock();
			return map.containsValue(value);
		} finally {
			lock.unlock();
		}
	}

	/*
	 * 从缓存中查询对象
	 * @see java.util.LinkedHashMap#get(java.lang.Object)
	 */
	public V get(Object key) {
		try {
			lock.lock();
			return map.get(key);
		} finally {
			lock.unlock();
		}
	}

	/*
	 * 判断缓存中是否包含该key
	 * @see java.util.HashMap#containsKey(java.lang.Object)
	 */
	public boolean containsKey(Object key) {
		try {
			lock.lock();
			return map.containsKey(key);
		} finally {
			lock.unlock();
		}
	}

	/*
	 * 判断缓存是否为空
	 * @see java.util.HashMap#isEmpty()
	 */
	public boolean isEmpty() {
		try {
			lock.lock();
			return map.isEmpty();
		} finally {
			lock.unlock();
		}
	}

	/*
	 * 放入缓存
	 * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
	 */
	public V put(K key, V value) {
		try {
			lock.lock();
			return map.put(key, value);
		} finally {
			lock.unlock();
		}
	}

	/*
	 * 从缓存中删除
	 * @see java.util.HashMap#remove(java.lang.Object)
	 */
	public V remove(Object key) {
		try {
			lock.lock();
			return map.remove(key);
		} finally {
			lock.unlock();
		}
	}

	/*
	 * 缓存大小
	 * @see java.util.HashMap#size()
	 */
	public int size() {
		try {
			lock.lock();
			return map.size();
		} finally {
			lock.unlock();
		}
	}
	
	public Collection<Map.Entry<K, V>> getAll() {
		try {
			lock.lock();
			return new ArrayList<Map.Entry<K, V>>(map.entrySet());
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		LRUCache<String, String> c = new LRUCache<String, String>(3);
		c.put("1", "one"); // 1
		c.put("2", "two"); // 2 1
		c.put("3", "three"); // 3 2 1
		c.put("4", "four"); // 4 3 2
		
		if (c.get("2") == null) {
			throw new Error(); // 2 4 3
		}
		
		c.put("5", "five"); // 5 2 4
		c.put("4", "second four"); // 4 5 2
		
		// Verify cache content.
		if (c.size() != 3) {
			throw new Error();
		}
		if (!c.get("4").equals("second four")) {
			throw new Error();
		}
		if (!c.get("5").equals("five")) {
			throw new Error();
		}
		if (!c.get("2").equals("two")) {
			throw new Error();
		}
		
		// List cache content.
		for (Map.Entry<String, String> e : c.getAll()){
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
	}
}
