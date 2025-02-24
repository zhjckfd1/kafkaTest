package com.example.producer;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    KafkaTemplate<String, Map<String, Object>> kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topic;

    public Producer(KafkaTemplate<String, Map<String, Object>> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessageToTopic(Map<String, Object> message)
    {
        kafkaTemplate.send(topic, message);
    }

}
