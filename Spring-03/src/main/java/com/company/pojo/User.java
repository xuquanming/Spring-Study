package com.company.pojo;

public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        System.out.println("有参构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("name"+name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}