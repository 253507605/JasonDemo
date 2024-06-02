package com.springdemo.controller;

import org.dromara.dynamictp.core.executor.DtpExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Jason.Chen
 * @create 2024/5/30 15:29
 */
@RestController
@RefreshScope//nacos自动刷新
public class HelloController {

    @Value("${jason.chen}")
    private String jason;

    @Resource
    private DtpExecutor dtpExecutor;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(jason);
        dtpExecutor.execute(()->{
            System.out.println("hello world");
        });
        return "hello world!";
    }
}
