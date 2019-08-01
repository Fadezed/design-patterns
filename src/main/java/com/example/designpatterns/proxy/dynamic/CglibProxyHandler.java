package com.example.designpatterns.proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述:
 * Cglib 动态代理
 *
 * @author zed
 * @since 2019-08-01 16:34
 */
public class CglibProxyHandler implements MethodInterceptor {
    /**
     * 代理目标类
     */
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代练Cglib动态帮你打游戏");
        return methodProxy.invokeSuper(o,objects);
    }
}
