package com.example.designpatterns.decorator;

/**
 * 描述:
 * 窗帘装饰类
 *
 * @author zed
 * @since 2019-08-01 10:51
 */
public class CurtainDecorator extends BaseDecorator {
    public CurtainDecorator(IDecorator decorator) {
        super(decorator);
    }
    @Override
    public void decorate(){
        System.out.println("装饰窗帘");
        super.decorate();
    }
}
