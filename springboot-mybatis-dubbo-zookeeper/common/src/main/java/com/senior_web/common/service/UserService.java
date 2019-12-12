package com.senior_web.common.service;

import com.senior_web.common.domin.User;

import java.util.List;

/**
* @author gaopeng
* @date 2018/8/28 0028 18:04
*/
public interface UserService {
    User findUser();
    User getUserById(int id);
    List<User> findList(User user);
    int saveUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
