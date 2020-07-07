package com.example.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDiApplication.class, args);

        //  Get the Spring context created by XML file
        ApplicationContext context = new
                ClassPathXmlApplicationContext( "beans.xml" );


        //  Get the dependencies by bean id
        Author fictionAuthor = context.getBean("fiction", Author.class);
        Author techAuthor = context.getBean("tech", Author.class);

        //  Using the dependencies
        Book book1 = new Book(fictionAuthor);
        Book book2 = new Book(techAuthor);

        //  What about authors?
        book1.getAuthor().getDetails();
        book2.getAuthor().getDetails();
    }

}
