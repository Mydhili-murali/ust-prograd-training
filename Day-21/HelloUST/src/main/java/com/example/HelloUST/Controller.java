package com.example.HelloUST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String hello(){
        return "Hello UST-Prograd team , Let's start with Spring Boot";
    }


}
