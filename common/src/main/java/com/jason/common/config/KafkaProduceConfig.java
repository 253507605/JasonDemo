package com.jason.common.config;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.CollectionUtils;
import org.springframework.util.unit.DataSize;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Author Jason.Chen
 * @create 2024/5/16 10:04
 */
@Configuration
public class KafkaProduceConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${spring.kafka.producer.retries}")
    private Integer retries;

    @Value("${spring.kafka.producer.batch-size}")
    private DataSize batchSize;

    @Value("${spring.kafka.producer.buffer-memory}")
    private DataSize bufferMemory;


    public Map<String,Object> buildProducerProperties(){
        Map<String, Object> properties = new HashMap<>();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.put(ProducerConfig.RETRIES_CONFIG, retries);
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, batchSize);
        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG, bufferMemory);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, String.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, String.class);
        return properties;
    }

    @Bean
    public DefaultKafkaProducerFactory defaultKafkaProducerFactory(){
        DefaultKafkaProducerFactory defaultKafkaProducerFactory = new DefaultKafkaProducerFactory(buildProducerProperties());
        return defaultKafkaProducerFactory;
    }


    @Bean
    public KafkaTemplate<String,String> kafkaTemplate(DefaultKafkaProducerFactory defaultKafkaProducerFactory){
        KafkaTemplate<String,String> kafkaTemplate = new KafkaTemplate<>(defaultKafkaProducerFactory);
        return kafkaTemplate;
    }
}
