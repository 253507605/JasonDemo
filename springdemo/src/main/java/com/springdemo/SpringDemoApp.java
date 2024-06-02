package com.springdemo;

import org.dromara.dynamictp.core.spring.EnableDynamicTp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Jason.Chen
 * @create 2024/5/15 11:07
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.springdemo.controller","com.jason.common.config"})
@EnableDiscoveryClient
@EnableDynamicTp
public class SpringDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApp.class);
    }
}
