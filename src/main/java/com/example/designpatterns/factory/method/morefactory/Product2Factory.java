package com.example.designpatterns.factory.method.morefactory;

/**
 * 描述:
 * 产品1工厂类
 *
 * @author zed
 * @since 2019-07-21 20:19
 */
public class Product2Factory extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
