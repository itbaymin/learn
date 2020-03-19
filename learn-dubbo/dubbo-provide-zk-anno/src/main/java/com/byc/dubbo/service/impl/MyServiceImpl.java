package com.byc.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.byc.dubbo.service.MyService;

@Service(timeout = 5000)
public class MyServiceImpl implements MyService {
    public String getValue(String key) {
        return "test";
    }
}
