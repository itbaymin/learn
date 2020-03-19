package com.byc.learnzk.controller;

import com.byc.learnzk.service.ZKAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZKController {

    @Autowired
    ZKAPI zkapi;

    @RequestMapping("get")
    public String get(String path){
        return zkapi.getData(path);
    }
}
