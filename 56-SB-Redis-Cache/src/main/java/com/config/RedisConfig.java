package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.dto.Country;

@Configuration
public class RedisConfig {
	
	@Bean
	public JedisConnectionFactory getConnectionFactory()
	{
		return new JedisConnectionFactory();
	}
	
	@Bean
	public RedisTemplate<String,Country> getRedisTemplate()
	{
		RedisTemplate rt=new RedisTemplate();
		rt.setConnectionFactory(getConnectionFactory());
		return rt;
	}
	
}
