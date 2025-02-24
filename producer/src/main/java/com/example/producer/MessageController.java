package com.example.producer;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String publishMessage(@RequestBody Map<String, Object> message) {
        System.out.println(message);
        producer.sendMessageToTopic(message);
        return "success";
    }

}
