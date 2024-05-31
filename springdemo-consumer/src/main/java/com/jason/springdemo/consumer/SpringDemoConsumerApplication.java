package com.jason.springdemo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Jason.Chen
 * @create 2024/5/30 15:23
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SpringDemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoConsumerApplication.class);
    }
}
