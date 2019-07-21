package com.example.designpatterns.abstractfactory;

/**
 * 描述:
 * 产品等级1的实现类
 *
 * @author zed
 * @since 2019-07-21 21:37
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
