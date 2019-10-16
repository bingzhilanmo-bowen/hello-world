package com.test.app;

import java.util.Set;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtil {
private static JedisPool pool;
	
	static {

		GenericObjectPoolConfig jedisConfig = new GenericObjectPoolConfig();
		jedisConfig.setMaxTotal(1000);
		jedisConfig.setMaxIdle(100);
		jedisConfig.setMaxWaitMillis(30 * 1000);
		jedisConfig.setMinIdle(50);
		jedisConfig.setTestOnBorrow(true);
		jedisConfig.setTestOnReturn(true);
		pool = new JedisPool(jedisConfig, "127.0.0.1",6379);
	}

	public static String get(String key){
		Jedis jedis = null;
		String result = null;
		try {
			jedis = pool.getResource();
			result = jedis.get(key);
		} catch (Exception e) {
			throw e;
		} finally {
		}
		return result;
	}


	public static void set(String key ,String value){
		Jedis jedis = null;
		Set<String> keys = null;
		try {
			jedis = pool.getResource();
			 jedis.set(key, value);
		} catch (Exception e) {
			throw e;
		} finally {

		}
	}

	public static Set<String> hkeys(String keyPattern) {
		Jedis jedis = null;
		Set<String> keys = null;
		try {
			jedis = pool.getResource();
			keys = jedis.hkeys(keyPattern);
		} catch (Exception e) {
			throw e;
		} finally {

		}
		return keys;
	}
	


}
