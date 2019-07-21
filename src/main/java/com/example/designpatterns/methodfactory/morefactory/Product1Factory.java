package com.example.designpatterns.methodfactory.morefactory;

/**
 * 描述:
 * 产品1工厂类
 *
 * @author zed
 * @since 2019-07-21 20:19
 */
public class Product1Factory extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
