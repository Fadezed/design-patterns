package com.example.designpatterns.intermediary;

/**
 * 描述:
 * 抽象同事类
 *
 * @author zed
 * @since 2019-08-09 13:06
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
