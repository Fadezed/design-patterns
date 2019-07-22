package com.example.designpatterns.templatemethod;

/**
 * 描述:
 * 抽象模板类
 *
 * @author zed
 * @since 2019-07-22 19:53
 */
public abstract class AbstractClass {
    /**
     * 基本方法
     */
    protected abstract void method();

    /**
     * 模板方法
     */
    public void templateMethod(){
        this.method();
    }
}
