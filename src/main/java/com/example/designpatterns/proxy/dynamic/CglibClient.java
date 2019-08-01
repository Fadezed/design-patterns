package com.example.designpatterns.proxy.dynamic;

import com.example.designpatterns.proxy.GamePlayer;
import com.example.designpatterns.proxy.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * 描述:
 * Cglib动态代理场景类
 *
 * @author zed
 * @since 2019-08-01 16:27
 */
public class CglibClient {

    public static void main(String[] args) {
        CglibProxyHandler cglibProxyHandler = new CglibProxyHandler();
        IGamePlayer proxyPlayer = (IGamePlayer)cglibProxyHandler.getInstance(new GamePlayer());
        proxyPlayer.playGame();
    }
}

