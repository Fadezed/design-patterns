package com.example.designpatterns.templatemethod;

/**
 * 描述:
 * 场景类
 *
 * @author zed
 * @since 2019-07-22 19:56
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass clz1 = new ConcreteClass1();
        AbstractClass clz2 = new ConcreteClass2();
        clz1.templateMethod();
        clz2.templateMethod();

    }
}
