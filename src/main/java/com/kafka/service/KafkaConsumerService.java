package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "kafka-topic")
    public void consume(String message) {
        System.out.println("Message received: " + message);
    }
}