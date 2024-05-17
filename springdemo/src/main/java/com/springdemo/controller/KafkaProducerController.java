package com.springdemo.controller;


import com.alibaba.fastjson.JSONObject;
import com.jason.common.entity.CalculateCard;
import com.jason.common.util.AtdMachineCarddata;
import com.jason.common.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jason.Chen
 * @create 2024/5/16 11:01
 */
@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    //发送重算请求
    @PostMapping("/sendRecalToFlink")
    public void sendRecalToFlink(@RequestBody JSONObject jsonObject) {
        String personId = jsonObject.getString("personId");
        String tenantCode = jsonObject.getString("tenantCode");
        String date = jsonObject.getString("date");

        CalculateCard calculateCard = new CalculateCard();
        calculateCard.setTenantCode(tenantCode);
        calculateCard.setPersonId(personId);
        calculateCard.setCalculateDate(DateUtils.getYMDDate(date));
        calculateCard.setOpId("");
        //重算伪装成卡
        AtdMachineCarddata atdMachineCardData = new AtdMachineCarddata();
        atdMachineCardData.setCalculateCard(calculateCard);
        atdMachineCardData.setCorrelationId("");
        atdMachineCardData.setBatchRecal(true);
        atdMachineCardData.setSendToAcc(true);
        atdMachineCardData.setStartDate(date);
        atdMachineCardData.setEndDate(date);
        atdMachineCardData.setRecalByLockFlag(false);
        kafkaTemplate.send("TOPIC_DCP_SOURCE_D_LA",personId,JSONObject.toJSONString(atdMachineCardData));
    }

    @GetMapping("/getredis")
    public void getRedis(){
        redisTemplate.opsForValue().set("jason","chen");
        System.out.println(redisTemplate.opsForValue().get("jason"));
    }
}
