package com.example.producer;

import com.example.bookstarter.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final Producer producer;
    private final Book defaultBook;

    public MessageController(Producer producer, Book defaultBook) {
        this.producer = producer;
        this.defaultBook = defaultBook;
    }

    @GetMapping("/sendMessage")
    public String publishMessage(@RequestBody Book message) {
        System.out.println(message);
        producer.sendMessageToTopic(message);
        return "success";
    }

    @GetMapping("/sendDefaultMessage")
    public String publishDefaultMessage() {
        System.out.println(defaultBook);
        producer.sendMessageToTopic(defaultBook);
        return "success";
    }

}
