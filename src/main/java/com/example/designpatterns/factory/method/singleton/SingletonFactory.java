package com.example.designpatterns.factory.method.singleton;

import java.lang.reflect.Constructor;

/**
 * 描述:
 * 单例工厂模式
 *
 * @author zed
 * @since 2019-07-21 20:40
 */
@SuppressWarnings("unchecked")
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class clz = Class.forName(Singleton.class.getName());
            //无参构造
            Constructor constructor = clz.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton)constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取单例对象
     * @return singleton
     */
    public static Singleton getSingleton(){
        return singleton;
    }
}
