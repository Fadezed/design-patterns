package com.example.designpatterns.builder;

/**
 * 描述:
 * 抽象建造者
 *
 * @author zed
 * @since 2019-07-24 20:14
 */
public abstract class Builder {
    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    public abstract void setPart();

    /**
     * 建造产品
     * @return product
     */
    public abstract Product buildProduct();
}
