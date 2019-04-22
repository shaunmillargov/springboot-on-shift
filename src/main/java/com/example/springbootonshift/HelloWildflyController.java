package com.example.springbootonshift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildflyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Openshift");
    }
}