package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    //запускаем ConsumerApplication - появляется топик
    @KafkaListener(topics = {"${kafka.topic.name}"}, groupId = "${kafka.topic.name}")
    public void listenToTopic(String message)
    {
        System.out.println("Message arrived! Message: " + message);
    }

}
