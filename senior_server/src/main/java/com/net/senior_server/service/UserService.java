package com.net.senior_server.service;

import com.net.senior_server.dao.UserMapper;
import com.net.senior_server.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-02 15:01
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.getUsers();
    }
    public void insertUser(String username,int age){
        userMapper.insertUser(username,age);
    }
}
