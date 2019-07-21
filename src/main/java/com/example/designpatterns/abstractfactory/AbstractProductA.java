package com.example.designpatterns.abstractfactory;

/**
 * 描述:
 * 抽象产品类A
 *
 * @author zed
 * @since 2019-07-21 21:32
 */
public abstract class AbstractProductA {
    /**
     * 产品公共方法
     */
    public void shareMethod(){

    }

    /**
     * 每个产品相同的方法，不同的实现
     */
    public abstract void method();
}
