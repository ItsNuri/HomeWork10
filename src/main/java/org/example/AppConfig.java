package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Horse horse() {
        return new Horse();
    }

    @Bean
    public Person person() {
        return new Person(horse());

    }
}
