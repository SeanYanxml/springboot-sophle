package com.yanxml.springboot.sophle.cache.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.yanxml.springboot.sophle.cache.redis"})
public class Application {

    public static void main(String[] args) {
        // 启动 SpringBoot
        SpringApplication.run(Application.class, args);
    }
}
