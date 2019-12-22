package com.senior_web.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.senior_web.common.domin.User;
import com.senior_web.common.service.UserService;
import org.json.JSONException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/lr")
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

    @RequestMapping(value = "/login",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public String login(@RequestBody Map<String,Object> map) throws JSONException {
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status","1");

        return jsonObject.toString();

    }
    @RequestMapping(value = "/register",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public Object register(@RequestBody Map<String,Object> map) throws JSONException {
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status","2");
        return jsonObject.toString();

    }

    @RequestMapping(value = "/tj",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public Object testJson(@RequestBody Map<String,Object> map) throws JSONException {
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));
        System.out.println(map.get("openid"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a","a");
        jsonObject.put("tttt","tttt");
        jsonObject.put("bbbbb","bbbbb");
        System.out.println(jsonObject.getString("a"));
        return jsonObject.toString();

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
