package com.example.designpatterns.proxy;

/**
 * 描述:
 * 代练玩家
 *
 * @author zed
 * @since 2019-08-01 16:13
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void playGame() {
        System.out.println("代练帮你玩");
        gamePlayer.playGame();
    }
}
