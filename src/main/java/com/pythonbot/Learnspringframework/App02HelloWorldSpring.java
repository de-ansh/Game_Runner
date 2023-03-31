package com.pythonbot.Learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       //Launch a Spring Context -
       var context=
               new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //Configure the things that we want Spring Framework to manage- @configurationClass
        //Hello WorldConfiguration - @Configuration
        //name - @Bean

        //Retrieving Beans managed by Spring
        System.out.println( context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
    }
}
