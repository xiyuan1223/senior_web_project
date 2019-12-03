package com.net.senior_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by louisgzli on 2019/11/27.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {
    @GetMapping("/login")
    public String sayHello() {
        System.out.println("login target");
        return "forward:/login.html";
    }
}
