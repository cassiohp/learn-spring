package com.cassio.learnspring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${ENV_DB_URL:Blank}")
    private String dbEnviromentVariable;

    @GetMapping("/oi")
    public String helloMessage(){
        return "Hello, i am Cassio";
    }

    @GetMapping("/ambient")
    public String getDbEnviromentVariable(){
        return "The ambient variable is: " +dbEnviromentVariable;
    }



}
