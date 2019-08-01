package com.example.designpatterns.proxy.dynamic;

import com.example.designpatterns.proxy.GamePlayer;
import com.example.designpatterns.proxy.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * 描述:
 * Jdk动态代理场景类
 *
 * @author zed
 * @since 2019-08-01 16:27
 */
public class JdkClient {

    public static void main(String[] args) {

        IGamePlayer proxyPlayer = (IGamePlayer)Proxy.newProxyInstance(IGamePlayer.class.getClassLoader(),
                new Class[]{IGamePlayer.class},new DynamicProxyHandler(new GamePlayer()));
        proxyPlayer.playGame();
    }
}

