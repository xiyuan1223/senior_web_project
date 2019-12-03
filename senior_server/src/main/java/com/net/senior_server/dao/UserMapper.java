package com.net.senior_server.dao;

import com.net.senior_server.vo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getUsers();
    void insertUser(String username,int age);
}
