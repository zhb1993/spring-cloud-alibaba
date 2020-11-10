package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Order {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:MATA-INF/spring/consumer.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        System.out.println(userService.getNameById("1111"));
    }
}
