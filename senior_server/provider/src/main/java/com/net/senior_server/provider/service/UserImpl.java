package com.net.senior_server.provider.service;

import com.net.senior_server.common.domin.User;
import com.net.senior_server.common.service.UserService;
import com.net.senior_server.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return userMapper.getOne(1l);
    }
}