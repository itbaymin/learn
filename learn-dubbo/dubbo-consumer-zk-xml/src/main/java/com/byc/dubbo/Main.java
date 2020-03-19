package com.byc.dubbo;

import com.byc.dubbo.service.MyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        MyService providerService = (MyService) context.getBean("providerService");
        String str = providerService.getValue("hello");
        System.out.println(str);
        System.in.read();

    }
}
