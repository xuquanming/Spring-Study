package com.company.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    private String name;
}
