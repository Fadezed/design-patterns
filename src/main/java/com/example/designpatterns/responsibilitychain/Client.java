package com.example.designpatterns.responsibilitychain;

/**
 * 描述:
 * 责任链模式场景类
 *
 * @author zed
 * @since 2019-10-23 11:08
 */
public class Client {

    public static void main(String[] args) {
        AbstractHandler handler = new ConcreteHandler1();
        AbstractHandler handler1 = new ConcreteHandler2();

        handler.setNext(handler1);
        Response res = handler.handleMessage(new Request());
    }
}
