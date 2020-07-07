package com.example.springdi;

public class Book {
    private Author author;

    //  Rather than this class creates its dependencies
    //  it get the dependencies "provided"
    //  This is called as Dependency Injection or
    //  Inversion of Control (control stands for ability to create)
    //  This way, Book can be provided with different Author objects
    public Book(Author a) {
        author = a;
    }
}
