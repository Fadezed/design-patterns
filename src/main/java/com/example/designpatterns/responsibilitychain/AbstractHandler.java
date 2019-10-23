package com.example.designpatterns.responsibilitychain;


/**
 * 描述:
 * 抽象处理类
 *
 * @author zed
 * @since 2019-10-23 11:09
 */
public abstract class AbstractHandler {
    /**
     * 下个处理人
     */
    private AbstractHandler nextHandler;
    /**
     * 统一处理类入口
     * @param request request
     * @return response
     */
    public final Response handleMessage(Request request){
        Response response;
        if (request.getHandlerLevel().equals(this.getHandlerLevel())){
            return this.echo(request);
        }else{
            if (this.nextHandler !=null){
                response = this.nextHandler.handleMessage(request);
            }else{
                //
                return null;
            }
        }
        return response;
    }
    /**
     * 设置下一个处理者
     * @param handler handler
     */
    public void setNext(AbstractHandler handler){
        this.nextHandler = handler;
    }
    /**
     * 各自等级
     * @return level
     */
    protected abstract Level getHandlerLevel();
    /**
     * 独立实现处理
     * @param request req
     * @return res
     */
    protected abstract Response echo(Request request);
}
