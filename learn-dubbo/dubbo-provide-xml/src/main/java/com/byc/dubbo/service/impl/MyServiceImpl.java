package com.byc.dubbo.service.impl;


import com.byc.dubbo.service.MyService;

public class MyServiceImpl implements MyService {
    public String getValue(String key) {
        return "test";
    }
}
