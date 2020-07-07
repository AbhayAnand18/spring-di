package com.example.springdi;

public class Book {
    //  This is the dependency
    private Author author;

    public Book(String title) {
        //  Naive approach. Class "creates" its own dependencies.
        //  This class is forever tied to the concrete Author class
        //  This is the violation of open/closed principle
        this.author = new Author();
    }
}
