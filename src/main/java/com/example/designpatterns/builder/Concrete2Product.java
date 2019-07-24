package com.example.designpatterns.builder;

/**
 * 描述:
 * 具体建造者
 *
 * @author zed
 * @since 2019-07-24 20:15
 */
public class Concrete2Product extends Builder {
    private Product product = new Product();

    /**
     * 设置产品零件
     */
    @Override
    public void setPart() {
        System.out.println("设置产品B零件");
    }

    /**
     * 组建一个产品
     * @return product
     */
    @Override
    public Product buildProduct() {
        return product;
    }
}
