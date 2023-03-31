package com.pythonbot.Learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record  Person(String name, int age){

};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return  "Ansh";
    }
    @Bean
    public int age(){
        return  22;
    }
    @Bean
    public  Person person(){
        return  new Person("Ravi", 20);
    }
    @Bean
    public  Person person2(){
        return  new Person("Ritwik", 21);
    }

}