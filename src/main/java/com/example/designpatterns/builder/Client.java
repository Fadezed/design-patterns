package com.example.designpatterns.builder;

/**
 * 描述:
 * 场景类
 *
 * @author zed
 * @since 2019-07-24 20:21
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getAProduct().method();
        director.getBProduct().method();
    }
}
