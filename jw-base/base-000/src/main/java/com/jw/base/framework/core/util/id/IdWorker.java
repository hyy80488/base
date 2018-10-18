/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.id;

/**
 * generates IDs. This is broken into a separate class in case we ever want to support multiple worker threads per process
 * 0 - 0000000000 0000000000 0000000000 0000000000 0 - 00000 - 00000 - 000000000000
 * 第一位为未使用，
 * 接下来的41位为毫秒级时间(41位的长度可以使用69年)，
 * 然后是5位datacenterId和5位workerId(10位的长度最多支持部署1024个节点） ，
 * 最后12位是毫秒内的计数（12位的计数顺序号支持每个节点每毫秒产生4096个ID序号）（自增码在多线程环境中，需要加锁，避免同一毫秒内产生冲突）
 * 一共加起来刚好64位，为一个Long型。(转换成字符串长度为18)
 */
/**
 * ## 类说明：
 * 	Twitter的SnowFlake算法本身设计不依赖数据库，生成的ID是64Bits整型数，同时满足高性能（>10K ids/s），低延迟（<2ms）和高可用。多台机器上部署时，要保证机器的时间一致
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.id
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|IdWorker.java新增
 */
public class IdWorker {

	//& 两个操作数中位都为1，结果才为1，否则结果为0
	//| 两个位只要有一个为1，那么结果就是1，否则就为0
	//~ 如果位为0，结果是1，如果位为1，结果是0
	//^ 两个操作数的位中，相同则结果为0，不同则结果为1

	private long workerId;
	private long datacenterId;
	private long sequence = 0L;

	private long twepoch = 1288834974657L;//初始时间2010-10-04

	private long workerIdBits = 5L;//5位workerId
	private long datacenterIdBits = 5L;//5位datacenterId
	private long maxWorkerId = -1L ^ (-1L << workerIdBits);//-1L ^ -32L = 31(5位“1”)
	private long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);//-1L ^ -32L = 31(5位“1”)
	private long sequenceBits = 12L;//12位的计数顺序号

	private long workerIdShift = sequenceBits;//12位
	private long datacenterIdShift = sequenceBits + workerIdBits;//17位
	private long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;//22位
	private long sequenceMask = -1L ^ (-1L << sequenceBits);//-1L ^ -4096L = 4095(12位“1”)

	private long lastTimestamp = -1L;

	//初始化workerId，不能超过31
	//初始化datacenterId，不能超过31
	public IdWorker(long workerId, long datacenterId) {
		// sanity check for workerId
		if (workerId > maxWorkerId || workerId < 0) {
			throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
		}
		if (datacenterId > maxDatacenterId || datacenterId < 0) {
			throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
		}
		this.workerId = workerId;
		this.datacenterId = datacenterId;
		//LOG.info(String.format("worker starting. timestamp left shift %d, datacenter id bits %d, worker id bits %d, sequence bits %d, workerid %d", timestampLeftShift, datacenterIdBits, workerIdBits, sequenceBits, workerId));
	}

	/**
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	public synchronized long nextId() {
		long timestamp = timeGen();

		//时间后退抛出异常
		if (timestamp < lastTimestamp) {
			//LOG.error(String.format("clock is moving backwards.  Rejecting requests until %d.", lastTimestamp));
			throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
		}

		//同毫秒内生成顺序号
		if (lastTimestamp == timestamp) {
			sequence = (sequence + 1) & sequenceMask;// +1 & 12位“1”
			//满号，拿下一个时间
			if (sequence == 0) {
				timestamp = tilNextMillis(lastTimestamp);
			}
		} else {
			sequence = 0L;
		}

		lastTimestamp = timestamp;

		return ((timestamp - twepoch) << timestampLeftShift) //移位22位，保留时间前41位
				| (datacenterId << datacenterIdShift) //移位17位，保留datacenterId的5位
				| (workerId << workerIdShift) //移位12位，保留workerId的5位
				| sequence;//最后12位顺序号
	}

	/**
	 * ## 方法说明：
	 * 	描述
	 * @param lastTimestamp
	 * @return
	 */
	protected long tilNextMillis(long lastTimestamp) {
		long timestamp = timeGen();
		while (timestamp <= lastTimestamp) {
			timestamp = timeGen();
		}
		return timestamp;
	}

	/**
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	protected long timeGen() {
		return System.currentTimeMillis();
	}
}
