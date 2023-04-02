package com.pythonbot.Learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record  Address(String firstLine, String City){}
record  Person(String name, int age , Address address){

}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return  "Ansh";
    }
    @Bean
    public String name2(){
        return  "Ashish";
    }
    @Bean
    public int age(){
        return  22;
    }
    @Bean
    public  Person person(){
        return  new Person("Ravi", 20, new Address("Kolkata", "West Bengal"));
    }
    @Bean(name= "address2")
    public Address address(){
        return new Address("Howrah,West Bengal", "Kolkata");
    }
    @Bean(name= "address3")
    public Address address3(){
        return new Address("Ghoshpara", "Howrah");
    }
    @Bean
    public  Person person2MethodCall(){
        return  new Person(name(),age(), address());
    }
    @Bean
    public  Person person3ParaMeters(String name2, int age, Address address3){
        return  new Person(name2,age, address3);
    }

}
