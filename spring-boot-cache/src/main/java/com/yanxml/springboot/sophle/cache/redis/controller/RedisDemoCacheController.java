package com.yanxml.springboot.sophle.cache.redis.controller;

import com.yanxml.springboot.sophle.cache.redis.service.RedisDemoCacheServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisDemoCacheController {

    @Autowired
    private RedisDemoCacheServiceImpl redisDemoCacheService;

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String redisHello(){
        // return "hello";
        return redisDemoCacheService.pipCache("hello");
    }

}
