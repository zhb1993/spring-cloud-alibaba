package com.zhb;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboMain {
    public static void main(String[] args) throws IOException{
        //第一种方式
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/MATA-INF/spring/user-provider.xml");
        context.start();
        System.in.read();
        //第二种方式
        //Main.main(args);
    }
}
