package com.example.designpatterns.decorator;

/**
 * 描述:
 * 场景类
 *
 * @author fadezed
 * @since 2019-08-01 10:52
 */
public class Client {
    public static void main(String[] args) {
        IDecorator decorator = new Decorator();
        //窗帘装饰类实例化
    	IDecorator curtainDecorator = new CurtainDecorator(decorator);
    	curtainDecorator.decorate();
    }

}
