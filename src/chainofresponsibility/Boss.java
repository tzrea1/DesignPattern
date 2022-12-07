package chainofresponsibility;

import chainofresponsibility.handler.RequestHandler;
import chainofresponsibility.handler.SalesAdministrator;
import chainofresponsibility.handler.SalesManager;
import chainofresponsibility.handler.SalesPerson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Description TODO: request的发出者，向销售人员们发出要求
 * @Author Tzrea1
 * @Date 2022/12/7 1:20
 * @Version 1.0
 **/
public class Boss {
    /**
    * 链表，存储request的所有Handler
    */
    private List<RequestHandler> handlers;

    /**
     * @Description TODO: BOSS的构造函数，调用buildChain
     * @return
     * @Author Tzrea1
     * @Date 2022/12/07 08:38
     * @Version 1.0
     **/
    public Boss() {
        buildChain();
    }

    /**
     * @Description TODO: 建立起Chain of Responsibility职责链
     * @return
     * @Author Tzrea1
     * @Date 2022/12/07 08:38
     * @Version 1.0
     **/
    private void buildChain() {
        handlers = Arrays.asList(new SalesAdministrator(), new SalesManager(), new SalesPerson());
    }

    /**
     * @Description TODO: 按照预设好的Chain of Responsibility处理request
     * @param req
     * @Author Tzrea1
     * @Date 2022/12/07 08:40
     * @Version 1.0
     **/
    public void makeRequest(Request req) {
        handlers
                .stream()
                // 按照handler的优先级进行排序
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                // 寻找有能力处理本条request的handler
                .filter(handler -> handler.canHandleRequest(req))
                // 链上的第一个满足要求handler来处理这条request
                .findFirst()
                .ifPresent(handler -> handler.handle(req));
    }
}
