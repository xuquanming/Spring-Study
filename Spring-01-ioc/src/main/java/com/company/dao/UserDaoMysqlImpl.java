package com.company.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("默认获取Mysql的数据");
    }
}
