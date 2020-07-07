package com.example.springdi;

public class Book {
    private final Author author;

    //  Author is now an abstract class (an interface)
    //  Now, the Book doesn't depend on any concrete implementation
    //  but depends on the most minimal interface
    //  Dependency injection and programming-to-interface principle
    //  always go hand in hand
    public Book(Author a) {
        author = a;
    }

    public Author getAuthor() {
        return author;
    }
}
