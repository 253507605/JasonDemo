package com.jason.springdemo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2024/5/30 15:31
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer")
    public String consumer(){
        List<String> services = discoveryClient.getServices();
        for(String service : services) {
            System.out.println(service);
        }
        return restTemplate.getForObject("http://springdemo:8081/hello",String.class);
    }
}
