package com.example.producer;

import com.example.bookstarter.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private final KafkaTemplate<String, Book> kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topic;

    public Producer(KafkaTemplate<String, Book> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessageToTopic(Book message)
    {
        kafkaTemplate.send(topic, message);
    }

}
