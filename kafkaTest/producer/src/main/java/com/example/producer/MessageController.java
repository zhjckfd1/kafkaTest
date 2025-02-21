package com.example.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final Producer producer;

    public MessageController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/sendMessage")
    public String publishMessage(@RequestParam("message") String message) {

        producer.sendMessageToTopic(message);
        return "success";
    }

}
