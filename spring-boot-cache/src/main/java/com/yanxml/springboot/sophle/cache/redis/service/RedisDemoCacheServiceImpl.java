package com.yanxml.springboot.sophle.cache.redis.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisDemoCacheServiceImpl {
    public static int count = 1;

    /**
     * 进行Cache测试工具.
     */
    @Cacheable(cacheNames = {"test"},key = "test"+count.toString(), cacheManager = "redisCacheManager")
    public String pipCache(String name){
        return "hello"+(count++);
    }
}
