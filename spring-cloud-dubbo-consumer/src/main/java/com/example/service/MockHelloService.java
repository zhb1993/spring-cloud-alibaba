package com.example.service;

import com.example.IHelloService;

public class MockHelloService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "服务暂时无法访问，请稍后再试";
    }
}
