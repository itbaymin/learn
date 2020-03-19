package com.byc.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("consumer")
public class MyConsumer {

    @Reference
    private MyService myService;

    public String getValue(String name) {
        return myService.getValue(name);
    }
}
