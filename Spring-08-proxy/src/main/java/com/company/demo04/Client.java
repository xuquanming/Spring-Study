package com.company.demo04;

import com.company.demo02.UserService;
import com.company.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
