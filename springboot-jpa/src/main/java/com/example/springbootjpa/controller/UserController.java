package com.example.springbootjpa.controller;

import com.alibaba.fastjson.JSON;
import com.example.springbootjpa.domain.User;
import com.example.springbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboot-proj
 * @description:
 * @author: huyida
 * @create: 2021-04-23 22:46
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUserByName")
    public String getUser(String name) {
        User user = userRepository.findByNameCustomeQuery(name).orElse(new User());
        return JSON.toJSONString(user);
    }

}
