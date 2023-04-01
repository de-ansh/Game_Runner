package com.pythonbot.Learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record  Address(String firstLine, String City){}
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
    @Bean(name= "address2")
    public Address address(){
        return new Address("Howrah,West Bengal", "Kolkata");
    }
    @Bean
    public  Person person2(){
        return  new Person("Ritwik", 21);
    }
    @Bean(name= "person2 address")
    public Address address2(){
        return new Address("Bankura", ",West Bengal");
    }

}
