package com.cassio.learnspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/oi")
    public String helloMessage(){
        return "Hello, i am Cassio";
    }
}
