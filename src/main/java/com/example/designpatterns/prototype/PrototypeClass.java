package com.example.designpatterns.prototype;

/**
 * 描述:
 * 原型模式
 *
 * @author zed
 * @since 2019-09-04 12:42
 */
public class PrototypeClass implements Cloneable{

    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
