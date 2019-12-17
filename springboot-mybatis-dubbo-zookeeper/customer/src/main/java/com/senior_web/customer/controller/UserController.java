package com.senior_web.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.senior_web.common.domin.User;
import com.senior_web.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.findUser();
    }

    @GetMapping("getUserById")
    public User getUserById(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        int id = 3;
        return userService.getUserById(id);
    }

    @GetMapping("saveUser")
    public void saveUser(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        User user = new User();
        user.setName("赵洋");
        user.setAge(12);
        user.setSex("女");
        int i = userService.saveUser(user);
        System.out.println("是否保存成功？-------------"+i);
    }

    @GetMapping("updateUser")
    public void updateUser(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        User user = new User();
        user.setUserId(1);
        user.setName("赵洋");
        user.setAge(13);
        user.setSex("男");
        int i = userService.updateUser(user);
        System.out.println("是否保存成功？-------------"+i);
    }

    @GetMapping("deleteUser")
    public void deleteUser(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        int id = 3;
        int i = userService.deleteUser(id);
        System.out.println("是否保存成功？-------------"+i);
    }

    @GetMapping("findList")
    public List<User> findList(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        User user = new User();
//        user.setUserId(1);
        return userService.findList(user);
    }
}
