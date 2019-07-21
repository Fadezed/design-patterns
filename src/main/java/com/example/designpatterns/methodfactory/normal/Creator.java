package com.example.designpatterns.methodfactory.normal;

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
     * @param c class
     * @param <T> Generic
     * @return T
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
