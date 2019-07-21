package com.example.designpatterns.methodfactory.normal;

/**
 * 描述:
 * 抽象产品类
 *
 * @author zed
 * @since 2019-07-21 19:53
 */
public abstract class Product {
    /**
     * 产品公共方法
     */
    public void method1(){
        System.out.println("i'm Product common");
    }

    /**
     * 抽象方法
     */
    public abstract void method2();
}
