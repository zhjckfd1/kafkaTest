package com.example.producer;

import com.example.bookstarter.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final Producer producer;
    private final Book defaultBook;

    public MessageController(Producer producer, Book defaultBook) {
        this.producer = producer;
        this.defaultBook = defaultBook;
    }

    @PostMapping("/sendMessage")
    public String publishMessage(@RequestBody Book message) {
        System.out.println(message);
        producer.sendMessageToTopic(message);
        return "success";
    }

    @PostMapping("/sendDefaultMessage")
    public String publishDefaultMessage() {
        System.out.println(defaultBook);
        producer.sendMessageToTopic(defaultBook);
        return "success";
    }

}
