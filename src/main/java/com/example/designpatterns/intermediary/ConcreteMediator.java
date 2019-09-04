package com.example.designpatterns.intermediary;

/**
 * 描述:
 * 通用中介者
 *
 * @author zed
 * @since 2019-08-09 13:02
 */
public class ConcreteMediator extends Mediator {
    @Override
    protected void method1() {
        super.concreteMediator1.method1();
        super.concreteMediator2.method2();
    }

    @Override
    protected void method2() {
        super.concreteMediator1.method1();
        super.concreteMediator2.method2();
    }
}
