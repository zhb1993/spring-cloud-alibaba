package com.example;

public class UserServiceImpl implements IUserService{
    public String getNameById(String uid) {
        System.out.println("收到请求参数:"+uid);
        return "zhb";
    }
}
