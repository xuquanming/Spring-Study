package com.company.demo02;


public class UserServiceProxy implements UserService{
    private UserService userService = new UserServiceImpl();

    public UserServiceProxy(){

    }
    public UserServiceProxy(UserService userService){
        this.userService = userService;
    }
    @Override
    public void add() {


        log("add");
        userService.add();
    }

    @Override
    public void delete() {

        log("delete");
        userService.delete();
    }

    @Override
    public void update() {

        log("update");
        userService.update();
    }

    @Override
    public void query() {

        log("query");
        userService.query();
    }

    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
