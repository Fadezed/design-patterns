package com.example.designpatterns.proxy;

/**
 * 描述:
 * 场景类
 *
 * @author zed
 * @since 2019-08-01 16:15
 */
public class Client {
    public static void main(String[] args) {
        //实际玩家
        IGamePlayer player = new GamePlayer();
        //代练玩家
        IGamePlayer proxyPlayer = new GamePlayerProxy(player);
        proxyPlayer.playGame();
    }
}
