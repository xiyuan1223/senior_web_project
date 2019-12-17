package com.senior_web.customer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {
    @RequestMapping("login")
    public String sayHello() {
        return "login";
    }

}
