package com.example.designpatterns.methodfactory.singleton;

/**
 * 描述:
 *  单例对象
 *
 *  @author zed
 *  @since 2019-07-21 20:00
 */
public class Singleton {

    public void method(){
        System.out.println("i'm singleton ");
    }

    private Singleton() {
    }
}
