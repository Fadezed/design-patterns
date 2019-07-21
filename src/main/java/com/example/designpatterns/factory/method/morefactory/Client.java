package com.example.designpatterns.factory.method.morefactory;



/**
 * 描述:
 * 简单工厂模式场景类
 *
 * @author zed
 * @since 2019-07-21 20:02
 */
public class Client {
    public static void main(String[] args) {
        Product product1 = new Product1Factory().createProduct();
        product1.method1();
        product1.method2();

        Product product2 = new Product2Factory().createProduct();
        product2.method1();
        product2.method2();

    }
}
