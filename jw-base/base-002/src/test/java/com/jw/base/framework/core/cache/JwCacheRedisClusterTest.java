package com.jw.base.framework.core.cache;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.CombinableMatcher.either;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.ConstantParm;

@ContextConfiguration(locations = { "classpath:conf_test/app-include.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class JwCacheRedisClusterTest {
	@Resource(name = "redisImpl")
	private JwCache redisCache;

	
	//5381（001 010 100 000 101），据说hash后的分布更好一些
	public String time33(String skey) {
        if (skey == null) {
        	return null;
        }
        int hash = 5381;
        for (int i = 0, len = skey.length(); i < len; ++i) {
            int cc = skey.charAt(i);
            hash += (hash << 5) + cc;
        }
        hash &= 0x7fffffff;
        return String.valueOf(hash);
    }
	
	@Test
	public void testSetGetString_liubowen() throws Exception {
		System.out.println(time33("OK"));
		Assert.assertEquals("OK", redisCache.setString("foo", "bar"));
		Assert.assertEquals("bar", redisCache.getString("foo"));
		
//		String grpDev = "_grp_dev";
//		String num = "4000";
//		redisCache.setString("trncd_id"+grpDev, num);
	}
	
	@Test
	public void testSetGetDelObject_liubowen() throws Exception {
		Assert.assertEquals("OK", redisCache.setObj("object", "bar"));
		Assert.assertEquals("bar", redisCache.getObj("object"));
		Assert.assertEquals((long)1, (long)redisCache.del("object"));
	}

	@Test
	public void testTime_liubowen() throws Exception {
		Assert.assertEquals("OK", redisCache.setString("renameA", "bar"));
		Assert.assertEquals((long)1, (long)redisCache.expired("renameA", 60));
		Assert.assertEquals((long)60, (long)redisCache.ttl("renameA"));
		Assert.assertEquals((long)1, (long)redisCache.persist("renameA"));
		Assert.assertEquals((long)-1, (long)redisCache.ttl("renameA"));
		
		Assert.assertTrue(redisCache.exists("renameA"));
		Assert.assertFalse(redisCache.exists("renameB"));
		
		redisCache.setString(Constant.KEY_SLOT + "renameC", "bar");
		Assert.assertEquals("OK", redisCache.rename(Constant.KEY_SLOT + "renameC", Constant.KEY_SLOT + "renameD"));
		Assert.assertEquals("bar", redisCache.getString(Constant.KEY_SLOT + "renameD"));
		
		Assert.assertEquals("string", redisCache.type("renameA"));
	}
	
	@Test
	public void testHash_liubowen() throws Exception {
		//************hash*******************
		Map<String, String> map = new HashMap<String, String>();
		map.put("personName", "刘博文");
		map.put("loginName", "bwliu");
		map.put("age", "35");
		map.put("birthday", "19830928");
		Assert.assertEquals("OK", redisCache.hmset("person.001",map));
		Assert.assertEquals("hash", redisCache.type("person.001"));
		Assert.assertEquals("刘博文", redisCache.hget("person.001", "personName"));
		Assert.assertThat(redisCache.hmget("person.001", new String[]{"age","birthday","test"}), hasItems("35", "19830928", null));
		Assert.assertEquals((long)38, (long)redisCache.hincrby("person.001", "age", 3));
		Assert.assertThat(redisCache.hgetAll("person.001"), hasEntry("personName", "刘博文"));
	}
	
	@Test
	public void testList_liubowen() throws Exception {
		//************list*******************
		redisCache.rpush("mylist", "A");
		redisCache.rpush("mylist", "B");
		redisCache.rpush("mylist", "C");
		redisCache.rpush("mylist", "D");
		redisCache.rpush("mylist", "E");
		Assert.assertEquals("list", redisCache.type("mylist"));
		Assert.assertEquals((long)5, (long)redisCache.llen("mylist"));
		
		Assert.assertThat(redisCache.lrange("mylist", 0, -1), hasItems("A", "B", "C", "D", "E"));
		Assert.assertEquals("OK", redisCache.ltrim("mylist", 0, 2));
		Assert.assertThat(redisCache.lrange("mylist", 0, -1), hasItems("A", "B", "C"));
		Assert.assertEquals("A", redisCache.lpop("mylist"));
		Assert.assertEquals("B", redisCache.lpop("mylist"));
		Assert.assertEquals("C", redisCache.lpop("mylist"));
//		System.out.println(redisCache.lrange("mylist", 0, -1));
		Assert.assertNull(redisCache.lpop("mylist"));
		
		Assert.assertFalse(redisCache.exists("mylist"));
		Assert.assertEquals((long)0, (long)redisCache.llen("mylist"));
		Assert.assertEquals((long)0, (long)redisCache.del("mylist"));
	}
	
	@Test
	public void testSet_liubowen() throws Exception {
		//************set*******************
		Assert.assertEquals((long)1, (long)redisCache.sadd(Constant.KEY_SLOT + "用户A", "好友A1"));
		Assert.assertEquals((long)1, (long)redisCache.sadd(Constant.KEY_SLOT + "用户A", "好友A2"));
		Assert.assertEquals((long)1, (long)redisCache.sadd(Constant.KEY_SLOT + "用户A", "好友A3"));
		
		redisCache.sadd(Constant.KEY_SLOT + "用户B", "好友A1");
		redisCache.sadd(Constant.KEY_SLOT + "用户B", "好友B2");
		redisCache.sadd(Constant.KEY_SLOT + "用户B", "好友B3");
		
		Assert.assertThat(redisCache.smembers(Constant.KEY_SLOT + "用户A"), hasItems("好友A1", "好友A2", "好友A3"));
		Assert.assertFalse(redisCache.sismember(Constant.KEY_SLOT + "用户A", "好友A0"));
		Assert.assertTrue(redisCache.sismember(Constant.KEY_SLOT + "用户A", "好友A1"));
		
		List<String> list = new ArrayList<String>();
	    list.add(Constant.KEY_SLOT + "用户A");
	    list.add(Constant.KEY_SLOT + "用户B");
	    Assert.assertThat(redisCache.sinter((String[])list.toArray(new String[list.size()])), hasItems("好友A1"));
	    
	    Assert.assertThat(redisCache.sdiff((String[])list.toArray(new String[list.size()])), hasItems("好友A2","好友A3"));
	    Assert.assertEquals((long)5, redisCache.sunionstore(Constant.KEY_SLOT + "用户C",(String[])list.toArray(new String[list.size()])));
	    redisCache.spop(Constant.KEY_SLOT + "用户C");
	    redisCache.spop(Constant.KEY_SLOT + "用户C");
	    redisCache.spop(Constant.KEY_SLOT + "用户C");
	    redisCache.spop(Constant.KEY_SLOT + "用户C");
	    redisCache.spop(Constant.KEY_SLOT + "用户C");
		Assert.assertEquals((long)1, (long)redisCache.del(Constant.KEY_SLOT + "用户A"));
		Assert.assertEquals((long)1, (long)redisCache.del(Constant.KEY_SLOT + "用户B"));
		Assert.assertEquals((long)0, (long)redisCache.del(Constant.KEY_SLOT + "用户C"));
		
//		List<String> list2 = new ArrayList<String>(list);
//		List<String> sub1 = list2.subList(0, 1);
//		list.add(Constant.KEY_SLOT + "用户C");
//		for(String s : sub1){
//			System.out.println("sub1======"+s);
//		}
//		for(String s : list){
//			System.out.println("list1======"+s);
//		}
//		for(String s : list2){
//			System.out.println("list2======"+s);
//		}
	}
	
	@Test
	public void testSortedSet_liubowen() throws Exception {
		//************Sorted sets*******************
		System.out.println(redisCache.zadd("hackers", 1940, "\"Alan Kay\""));
		System.out.println(redisCache.zadd("hackers", 1957, "\"Sophie Wilson\""));
		System.out.println(redisCache.zadd("hackers", 1953, "\"Richard Stallman\""));
		System.out.println(redisCache.zrange("hackers", 0, -1));
		System.out.println(redisCache.zrevrange("hackers", 0, -1));
		System.out.println(redisCache.zrangeByScore("hackers", 1953, 1957));
		System.out.println(redisCache.zrank("hackers", "\"Sophie Wilson\""));
	}
	@Test
	public void testSortedSet() throws Exception {
		//************Sorted sets*******************
		System.out.println("==================="+redisCache.exists("f038f3b7-4c93-4708-ae2a-24f19bfac201")+"================");
	}
	
	// **************************************************************************************
	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "trial".getBytes();
		byte[] actual = "trial".getBytes();
		Assert.assertArrayEquals("failure - byte arrays not same", expected, actual);
	}

	@Test
	public void testAssertEquals() {
		Assert.assertEquals("failure - strings not same", 5L, 5L);
	}

	@Test
	public void testAssertFalse() {
		Assert.assertFalse("failure - should be false", false);
	}

	@Test
	public void testAssertNotNull() {
		Assert.assertNotNull("should not be null", new Object());
	}

	@Test
	public void testAssertNotSame() {
		Assert.assertNotSame("should not be same Object", new Object(), new Object());
	}

	@Test
	public void testAssertNull() {
		Assert.assertNull("should be null", null);
	}

	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(768);
		Assert.assertSame("should be same", aNumber, aNumber);
	}

	// JUnit Matchers assertThat
	@Test
	public void testAssertThatBothContainsString() {
		Assert.assertThat("albumen", both(containsString("a")).and(containsString("b")));
	}

	@Test
	public void testAssertThathasItemsContainsString() {
		Assert.assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
	}

	@Test
	public void testAssertThatEveryItemContainsString() {
		Assert.assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
	}

	// Core Hamcrest Matchers with assertThat
	@Test
	public void testAssertThatHamcrestCoreMatchers() {
		Assert.assertThat("good", allOf(equalTo("good"), startsWith("good")));
		Assert.assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
		Assert.assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
		Assert.assertThat(7, not(either(equalTo(3)).or(equalTo(4))));
		Assert.assertThat(new Object(), not(sameInstance(new Object())));
		
		
		// 比较50是否和50相等
		Assert.assertThat(50, equalTo(50));
		// 50是否大于30并且小于60
		Assert.assertThat("错误",50, allOf(greaterThan(30), lessThan(60)));
		// 判断字符串是否以.txt结尾
		Assert.assertThat("错误", "abc.txt", endsWith(".txt"));
		
		/**Map匹配**/
		Map<String,String> userMap = new HashMap<String,String>();
		userMap.put("key1", "value1");
		userMap.put("key2", "value2");
		                  
		//测试map中是否还有指定键值对
		Assert.assertThat(userMap, hasEntry("key1", "value1"));
		//测试map中是否还有指定键
		Assert.assertThat(userMap, hasKey("key2"));
		//测试map中是否还有指定值
		Assert.assertThat(userMap, hasValue("value2"));
	}
}
