package com.example.springbootmybatis.domain;

import lombok.Data;


/**
 * @program: springboot-proj
 * @description: 用户实体类
 * @author: huyida
 * @create: 2021-04-23 00:21
 **/
@Data
public class User {

    private Long id;

    private String name;

    private Integer age;

}