package com.example.bookstarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BookProperties.class)
public class BookAutoconfiguration {

    private final BookProperties bookProperties;

    public BookAutoconfiguration(BookProperties bookProperties) {
        this.bookProperties = bookProperties;
    }

    //public Book book(@Value("author1") String author, @Value("name1") String name, @Value("111") int price)
    @Bean
    public Book defaultBook() {
        return new Book(bookProperties.getName(), bookProperties.getAuthor(), bookProperties.getPrice());
    }

}
