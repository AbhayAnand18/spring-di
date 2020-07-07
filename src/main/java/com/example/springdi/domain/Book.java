package com.example.springdi.domain;

public class Book {
    private final Author author;

    public Book(Author a) {
        author = a;
    }

    public Author getAuthor() {
        return author;
    }
}
