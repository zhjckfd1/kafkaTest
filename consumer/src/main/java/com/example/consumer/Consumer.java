package com.example.consumer;

import com.example.bookstarter.Book;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    //запускаем ConsumerApplication - появляется топик
    @KafkaListener(topics = {"${kafka.topic.name}"}, groupId = "${kafka.topic.name}")
    public void listenToTopic(Book message)
    {
        System.out.println("Message arrived! Message: " + message);
    }

}
