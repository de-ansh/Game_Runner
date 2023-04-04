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
       // System.out.println(context.getBean(Address.class));

       // we will find the answer now about the error we got due to beans
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3ParaMeters"));
        //Sping container :manages sping beans and their life cycles
        //Sping container/sping context/ spring ios container are the same
        //Types of String conatier:
        //1. Bean Factory   : Basic Sping      Container
        // 2.Application Context: Advance Container with enterprise-specific features
        //Easy to use in web, Easy internationalization, easy integration with spring aop
        //
        }
}
