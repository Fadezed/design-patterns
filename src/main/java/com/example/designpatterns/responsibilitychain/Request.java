package com.example.designpatterns.responsibilitychain;

/**
 * 描述:
 * 请求类
 *
 * @author zed
 * @since 2019-10-23 11:10
 */
public class Request {
    /**
     * 当前等级
     */
    private Level level;

    /**
     * 返回处理等级
     * @return level
     */
    public Level getHandlerLevel(){
        return this.level;
    }
}
