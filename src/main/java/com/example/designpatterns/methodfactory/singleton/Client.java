package com.example.designpatterns.methodfactory.singleton;

/**
 * 描述:
 * 场景类
 *
 * @author zed
 * @since 2019-07-21 20:43
 */
public class Client {
    public static void main(String[] args) {
        SingletonFactory.getSingleton().method();
    }
}
