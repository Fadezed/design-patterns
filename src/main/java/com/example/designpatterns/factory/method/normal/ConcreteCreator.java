package com.example.designpatterns.factory.method.normal;

/**
 * 描述:
 * 具体工厂类
 *
 * @author zed
 * @since 2019-07-21 20:00
 */
public class ConcreteCreator extends Creator {


    @SuppressWarnings("unchecked")
    @Override
    public <T extends Product> T createProduct(Class<T> c) {

        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
