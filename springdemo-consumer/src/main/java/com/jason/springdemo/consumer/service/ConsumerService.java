package com.jason.springdemo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Jason.Chen
 * @create 2024/5/31 11:43
 */
@FeignClient("springdemo")
public interface ConsumerService {
    @GetMapping("/hello")
    String yourMethod();
}
