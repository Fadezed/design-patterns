package com.example.designpatterns.intermediary;

/**
 * 描述:
 * 抽象中介者
 *
 * @author zed
 * @since 2019-08-09 12:54
 */
public abstract class Mediator {
    protected ConcreteMediator concreteMediator1;
    protected ConcreteMediator concreteMediator2;

    public ConcreteMediator getConcreteMediator1() {
        return concreteMediator1;
    }

    public void setConcreteMediator1(ConcreteMediator concreteMediator1) {
        this.concreteMediator1 = concreteMediator1;
    }

    public ConcreteMediator getConcreteMediator2() {
        return concreteMediator2;
    }

    public void setConcreteMediator2(ConcreteMediator concreteMediator2) {
        this.concreteMediator2 = concreteMediator2;
    }

    protected abstract void method1();
    protected abstract void method2();
}
