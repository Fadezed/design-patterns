package com.example.designpatterns.methodfactory.lazy;

/**
 * 描述:
 * 场景类
 *
 * @author zed
 * @since 2019-07-21 20:54
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Product product = ProductFactory.createProduct("product2");
        product.method1();
        product.method2();
    }
}
