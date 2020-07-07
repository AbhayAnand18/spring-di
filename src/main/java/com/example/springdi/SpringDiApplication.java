package com.example.springdi;

import com.example.springdi.domain.Book;
import com.example.springdi.domain.FictionAuthor;
import com.example.springdi.domain.TechAuthor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDiApplication.class, args);

        //  Using Book

        //  This is more dynamic and customizable
        Book book1 = new Book(new FictionAuthor());
        Book book2 = new Book(new TechAuthor());

        //  What about authors?
        book1.getAuthor().getDetails();
        book2.getAuthor().getDetails();
    }

}
