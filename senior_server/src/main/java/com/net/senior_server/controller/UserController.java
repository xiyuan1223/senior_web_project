package com.net.senior_server.controller;


import com.net.senior_server.service.UserService;
import com.net.senior_server.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-02 14:59
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> lists() {
        return userService.getUsers();
    }

    @GetMapping("/insert")
    public void insertUser(){
        String username = "yindu";
        int age = 123;
        for(int i = 0;i<10;i++){
            userService.insertUser(username,age);
        }

    }

}
