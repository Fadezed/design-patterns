package com.example.designpatterns.responsibilitychain;

/**
 * 描述:
 * 实际处理类2
 *
 * @author zed
 * @since 2019-10-23 11:19
 */
public class ConcreteHandler2 extends AbstractHandler {



    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
