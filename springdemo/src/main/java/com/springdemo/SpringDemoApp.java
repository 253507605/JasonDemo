package com.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Jason.Chen
 * @create 2024/5/15 11:07
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.springdemo.controller","com.jason.common.config"})
public class SpringDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApp.class);
    }
}
