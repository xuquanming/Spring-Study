package com.company.pojo;

public class Hello {
    private String str;

    public void setStr(String name) {
        this.str = name;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
