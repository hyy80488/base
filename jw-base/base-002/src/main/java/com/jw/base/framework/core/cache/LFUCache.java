package com.jw.base.framework.core.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * LFU(Least Frequently Used，最不经常使用)
 * 算法根据数据的历史访问频率来淘汰数据，其原理是如果数据过去被访问次数越多，将来被访问的几概率相对比较高。LFU的每个数据块都有一个引用计数，所有数据块按照引用计数排序，具有相同引用计数的数据块则按照时间排序。
 * 具体算法如下： 1. 新加入数据插入到队列尾部（因为引用计数为1）； 2. 队列中的数据被访问后，引用计数增加，队列重新排序； 3.
 * 当需要淘汰数据时，将已经排序的列表最后的数据块删除；
 * 
 * 用HashMap保存关系{key值 : 命中次数与上次命中时间}，当需要淘汰某个key值时，调用map.remove(key)
 * @param <K,V>
 */
public class LFUCache<K, V> extends HashMap<K, V> {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 4447626124611959884L;

	private static final int DEFAULT_MAX_SIZE = 3;
	private int maxSize = DEFAULT_MAX_SIZE;
	Map<K, HitRate> km = new HashMap<K, HitRate>();

	public LFUCache() {
		this(DEFAULT_MAX_SIZE);
	}

	public LFUCache(int maxSize) {
		super(maxSize);
		this.maxSize = maxSize;
	}

	@Override
	public V get(Object key) {
		V v = super.get(key);
		if (v != null) {
			HitRate hitRate = km.get(key);
			hitRate.hitCount += 1;
			hitRate.atime = System.nanoTime();
		}
		return v;
	}

	@Override
	public V put(K key, V value) {
		while (km.size() >= maxSize) {
			K k = getLFUAging();
			km.remove(k);
			this.remove(k);
		}
		V v = super.put(key, value);
		km.put(key, new HitRate(key, 1, System.nanoTime()));
		return v;
	}

	private K getLFUAging() {
		HitRate min = Collections.min(km.values());
		return min.key;
	}

	class HitRate implements Comparable<HitRate> {
		K key;
		Integer hitCount; // 命中次数
		Long atime; // 上次命中时间

		public HitRate(K key, Integer hitCount, Long atime) {
			this.key = key;
			this.hitCount = hitCount;
			this.atime = atime;
		}

		@Override
		public int compareTo(HitRate o) {
			int hr = hitCount.compareTo(o.hitCount);
			return hr != 0 ? hr : atime.compareTo(o.atime);
		}
	}

	public static void main(String[] as) throws Exception {
		LFUCache<String, String> cache = new LFUCache<String, String>(3);
		cache.put("a", "a");
		cache.put("b", "b");
		cache.put("c", "c");

		cache.get("a");
		cache.get("a");

		cache.put("d", "d");
		cache.get("d");
		cache.get("d");
		cache.get("d");
		cache.get("d");
		cache.get("d");
		cache.get("d");
		cache.get("c");
		cache.get("c");
		cache.get("c");
		cache.get("c");
		cache.get("c");
		cache.get("c");
		cache.put("e", "e");
		for (String key : cache.keySet()) {
			System.out.println(key);
		}

//		for (String key : cache.keySet()) {
//			System.out.println(key);
//		}
	}
}
