package com.example.springdi;

import com.example.springdi.domain.Author;
import com.example.springdi.domain.Book;
import com.example.springdi.domain.FictionAuthor;
import com.example.springdi.domain.TechAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDiApplication.class, args);

        //  Get the context
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        //  Get the dependency from the context
        Author author = context.getBean(Author.class);

        //  Use the dependency
        Book book = new Book(author);

        book.getAuthor().getDetails();
    }

}
