package com.example.designpatterns.decorator;

/**
 * 描述:
 * 装饰实现类
 *
 * @author zed
 * @since 2019-08-01 10:49
 */
public class Decorator implements IDecorator {
    @Override
    public void decorate() {
        System.out.println("装饰基本操作");
    }
}
