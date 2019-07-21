package com.example.designpatterns.factory.abstractpattern;

/**
 * 描述:
 * 产品等级2的实现类
 *
 * @author zed
 * @since 2019-07-21 21:37
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
