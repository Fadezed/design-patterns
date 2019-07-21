package com.example.designpatterns.methodfactory.normal;

/**
 * 描述:
 * 场景类
 *
 * @author zed
 * @since 2019-07-21 20:02
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();

        Product product1 = creator.createProduct(ConcreteProduct1.class);
        product1.method1();
        product1.method2();

        Product product2 = creator.createProduct(ConcreteProduct2.class);
        product2.method1();
        product2.method2();

    }
}
