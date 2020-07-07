package com.example.springdi;

public class Book {
    private String title;

    //  This is the dependency
    private Author author;

    public Book(String title) {
        this.title = title;

        //  Naive approach. Class "creates" its own dependencies.
        //  This class is forever tied to the concrete Author class
        //  This is the violation of open/closed principle
        this.author = new Author("Default Author");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
