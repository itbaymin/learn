package com.byc.dubbo;

import com.byc.dubbo.configuration.ConsumerConfiguration;
import com.byc.dubbo.service.MyConsumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start(); // 启动
        MyConsumer consumerAnnotationService = context.getBean(MyConsumer.class);
        String hello = consumerAnnotationService.getValue("annotation"); // 调用方法
        System.out.println("result: " + hello); // 输出结果
    }
}
