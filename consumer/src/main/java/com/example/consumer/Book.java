package com.example.consumer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    private String author;
    private String name;
    private int price;

    public Book() {}

    @JsonCreator
    public Book(@JsonProperty("name") String name, @JsonProperty("author") String author, @JsonProperty("price") int price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
