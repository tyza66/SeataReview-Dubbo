package com.tyza66.controller;

import com.tyza66.service.impl.OneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/7/12 19:17
 * Github: https://github.com/tyza66
 **/


@RestController
public class OneController {
    @Autowired
    OneServiceImpl oneService;

    @GetMapping("/test")
    public String test(){
        oneService.updateTwo();
        return "test";
    }
}
