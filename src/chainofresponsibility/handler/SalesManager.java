package chainofresponsibility.handler;

import chainofresponsibility.Request;
import chainofresponsibility.RequestType;
import chainofresponsibility.handler.RequestHandler;

/**
 * @Description TODO: Sales Manager销售经理，拥有第二高优先级的handler
 * @Author Tzrea1
 * @Date 2022/12/7 1:21
 * @Version 1.0
 **/
public class SalesManager implements RequestHandler {

    /**
     * @Description TODO: 返回SalesManager是否可以处理某条request.
     * @return 当可以处理这条request；false，当不能处理这条request.
     * @param req
     * @Author Tzrea1
     * @Date 2022/12/07 09:09
     * @Version 1.0
     **/
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.MALL_SALE;
    }

    /**
     * @Description TODO: 返回SalesManager的Priority
     * @return Priority，handler的权限级别
     * @Author Tzrea1
     * @Date 2022/12/07 09:19
     * @Version 1.0
     **/
    @Override
    public int getPriority() {
        return 3;
    }

    /**
     * @Description TODO: 执行handler，处理一条request
     * @return
     * @param req
     * @Author Tzrea1
     * @Date 2022/12/07 09:22
     * @Version 1.0
     **/
    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " handling request " + req);
    }

    /**
     * @Description TODO: 返回本handler的name
     * @return name,本handler的名称
     * @Author Tzrea1
     * @Date 2022/12/07 09:23
     * @Version 1.0
     **/
    @Override
    public String name() {
        return "销售经理";
    }
}
