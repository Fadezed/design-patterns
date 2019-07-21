package com.example.designpatterns.factory.abstractpattern;

/**
 * 描述:
 * 抽象工厂类
 *
 * @author zed
 * @since 2019-07-21 21:35
 */
public abstract class AbstractCreator {
    /**
     *
     * @return AbstractProductA
     */
    public abstract AbstractProductA createProductA();

    /**
     *
     * @return AbstractProductB
     */
    public abstract AbstractProductB createProductB();

}
