package com.example.designpatterns.decorator;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * 描述:
 * 抽象装饰类
 *
 * @author fadezed
 * @since 2019-08-01 10:50
 */
public abstract class BaseDecorator implements IDecorator{
    private IDecorator decorator;

    public BaseDecorator(IDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorate() {
        if (decorator!=null){
            decorator.decorate();
        }
    }
}
