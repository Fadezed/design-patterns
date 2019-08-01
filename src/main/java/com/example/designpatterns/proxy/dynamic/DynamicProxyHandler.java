package com.example.designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 描述:
 * jdk动态代理
 *
 * @author zed
 * @since 2019-08-01 16:26
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代练Jdk动态帮你打游戏");

        return method.invoke(object, args);
    }
}
