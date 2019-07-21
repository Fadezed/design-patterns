package com.example.designpatterns.methodfactory.lazy;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 延迟加载工厂类
 *
 * @author zed
 * @since 2019-07-21 20:50
 */
public class ProductFactory {
    private static final Map<String,Product> productMap = new HashMap<>();

    /**
     * 同步获取产品
     * @param type type
     * @return product
     * @throws Exception e
     */
    public static synchronized Product createProduct(String type)throws Exception{
        Product product;
        if (productMap.containsKey(type)){
            return productMap.get(type);
        }else {
            if("product1".equals(type)){
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
            productMap.put(type,product);

        }
        return product;
    }
}
