package com.example.designpatterns.factory.abstractpattern;

/**
 * 描述:
 * 场景类
 *
 * @author zed
 * @since 2019-07-21 21:39
 */
public class Client {
    public static void main(String[] args) {
        //工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        //创建产品
        AbstractProductA productA1 = creator1.createProductA();
        productA1.method();
        AbstractProductA productA2 = creator2.createProductA();
        productA2.method();
        AbstractProductB productB1 = creator1.createProductB();
        productB1.method();
        AbstractProductB productB2 = creator2.createProductB();
        productB2.method();
    }
}
