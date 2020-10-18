package com.company.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component 组件
@Component
public class User {

    @Value("ming")
    public String name;

}
