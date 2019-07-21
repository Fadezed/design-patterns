package com.example.designpatterns.methodfactory.simple;


/**
 * 描述:
 * 具体工厂类（简单工厂或者静态工厂）
 *
 * @author zed
 * @since 2019-07-21 20:00
 */
public class ConcreteCreator {

    @SuppressWarnings("unchecked")
    public static <T extends Product> T createProduct(Class<T> c) {

        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
