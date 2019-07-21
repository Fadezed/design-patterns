package com.example.designpatterns.methodfactory.simple;


/**
 * 描述:
 * 简单工厂模式场景类
 *
 * @author zed
 * @since 2019-07-21 20:02
 */
public class Client {
    public static void main(String[] args) {
        Product product1 = ConcreteCreator.createProduct(ConcreteProduct1.class);
        product1.method1();
        product1.method2();

        Product product2 = ConcreteCreator.createProduct(ConcreteProduct2.class);
        product2.method1();
        product2.method2();

    }
}
