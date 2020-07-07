package com.example.springdi;
import com.example.springdi.domain.Author;
import com.example.springdi.domain.FictionAuthor;
import com.example.springdi.domain.TechAuthor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    //  When multiple Beans are configured for the same return type
    //  the user code should use the name
    //  If context is not used explicitly, @Qualifier can be used

    @Bean(name = "fiction")
    public Author getFictionAuthor() {
        return new FictionAuthor();
    }

    @Bean(name = "tech")
    public Author getTechAuthor() {
        return new TechAuthor();
    }
}
