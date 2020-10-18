package com.company.config;


import com.company.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//这个也会被Spring容器托管，注册到容器中，因为他本来就是一个Component，
// @Configuration 代表这是一个配置类，
@ComponentScan("com.company.pojo")
public class MingConfig {


    //注册一个bean，id是这个方法的名字，class是这个方法的返回值
    @Bean
    public User getUser(){
        return new User();
    }
}
