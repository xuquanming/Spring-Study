package com.company.mapper;

import com.company.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    //添加用户
    int addUser(User user);
    int deleteUser(int id);
}
