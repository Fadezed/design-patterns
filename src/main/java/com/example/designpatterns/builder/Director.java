package com.example.designpatterns.builder;

/**
 * 描述:
 * 导演类
 *
 * @author zed
 * @since 2019-07-24 20:17
 */
public class Director {
    private Builder builder1 = new Concrete1Product();
    private Builder builder2 = new Concrete2Product();

    /**
     * 构建不同的产品
     * @return
     */
    public Product getAProduct(){
        /**
         * 设置不同的零件，产生不同的产品
         */
        builder1.setPart();
        return builder1.buildProduct();
    }
    /**
     * 构建不同的产品
     * @return
     */
    public Product getBProduct(){
        /**
         * 设置不同的零件，产生不同的产品
         */
        builder2.setPart();
        return builder2.buildProduct();
    }

}
