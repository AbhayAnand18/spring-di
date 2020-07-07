package com.example.springdi;
import com.example.springdi.domain.Author;
import com.example.springdi.domain.FictionAuthor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//  We use this class to manually configure
//  the dependencies used in this application
//  Name of the class doesn't matter

//  Step 1: Apply the @Configuration annotation
@Configuration
public class ApplicationConfiguration {
    //  Step 2: Create a method that returns the type of object
    //  you want to use as the dependency. Apply @Bean annotation to
    //  this method
    //  We need Author object

    @Bean
    public Author getAuthor() {
        return new FictionAuthor();
    }
}
