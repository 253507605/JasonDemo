package com.jason.springdemo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Jason.Chen
 * @create 2024/5/30 15:23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringDemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoConsumerApplication.class);
    }
}
