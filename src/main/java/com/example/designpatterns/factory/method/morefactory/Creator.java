package com.example.designpatterns.factory.method.morefactory;

/**
 * 描述:
 * 抽象工厂类
 *
 * @author zed
 * @since 2019-07-21 19:57
 */
public abstract class Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * @return T
     */
    public abstract Product  createProduct();
}
