package com.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jason.Chen
 * @create 2024/5/16 9:55
 */
@RestController()
public class HelloWroldController {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "hello World!";
    }
}
