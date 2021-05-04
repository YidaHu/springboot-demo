package com.example.springbootbase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-demo
 * @description:
 * @author: huyida
 * @create: 2021-05-04 23:41
 **/
@RestController
@RequestMapping("springboot")
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello SpringBoot !";
    }

}
