package com.example.designpatterns.proxy;

/**
 * 描述:
 * 玩家
 *
 * @author zed
 * @since 2019-08-01 16:12
 */
public class GamePlayer implements IGamePlayer {
    @Override
    public void playGame() {
        System.out.println("开始玩游戏");
    }
}
