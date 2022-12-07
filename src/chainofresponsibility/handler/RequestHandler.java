package chainofresponsibility.handler;

import chainofresponsibility.Request;

/**
 * @Description TODO: 接口定义，用于处理request的handler
 * @Author Tzrea1
 * @Date 2022/12/7 1:13
 * @Version v1.0
 */
public interface RequestHandler {
    /**
     * @Description TODO: 返回本handler是否可以处理某条request.
     * @return true，当可以处理这条request；false，当不能处理这条request.
     * @param req
     * @Author Tzrea1
     * @Date 2022/12/07 08:59
     * @Version 1.0
     **/
    boolean canHandleRequest(Request req);

    /**
     * @Description TODO: 返回本handler的Priority
     * @return  Priority，handler的权限级别
     * @Author Tzrea1
     * @Date 2022/12/07 09:01
     * @Version 1.0
     **/
    int getPriority();

    /**
     * @Description TODO: 执行handler，处理一条request
     * @return
     * @param req
     * @Author Tzrea1
     * @Date 2022/12/07 09:03
     * @Version 1.0
     **/
    void handle(Request req);

    /**
     * @Description TODO: 返回本handler的name
     * @return name,本handler的名称
     * @Author Tzrea1
     * @Date 2022/12/07 09:03
     * @Version 1.0
     **/
    String name();
}
