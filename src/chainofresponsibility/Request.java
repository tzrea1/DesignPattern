package chainofresponsibility;

import java.util.Objects;

/**
 * @Description TODO:
 * @Author Tzrea1
 * @Date 2022/12/7 1:17
 * @Version 1.0
 **/
public class Request {

    /**
     * request的类型，被链上的每个对象使用，用以判断其是否能处理某条request
     */
    private final RequestType requestType;

    /**
     * request的描述
     */
    private final String requestDescription;

    /**
     * 标识：标记一条request是否已被handled
     * 一条request的状态只能从unhandled转换为handled
     */
    private boolean handled;

    /**
     * @Description TODO: 创建一条新的request，赋予其type和description
     * @return
     * @param requestType
     * @param requestDescription
     * @Author Tzrea1
     * @Date 2022/12/07 08:50
     * @Version 1.0
     **/
    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    /**
     * @Description TODO: 得到一条request的描述
     * @return requestDescription，request的描述
     * @Author Tzrea1
     * @Date 2022/12/07 08:51
     * @Version 1.0
     **/
    public String getRequestDescription() {
        return requestDescription;
    }

    /**
     * @Description TODO: 得到一条request的描述
     * @return  requestType，request的类型
     * @Author Tzrea1
     * @Date 2022/12/07 08:52
     * @Version 1.0
     **/
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * @Description TODO: 标记一条request的状态为handled
     * @return  requestType，request的类型
     * @Author Tzrea1
     * @Date 2022/12/07 08:52
     * @Version 1.0
     **/
    public void markHandled() {
        this.handled = true;
    }

    /**
     * @Description TODO: 返回一条request是否已被andled
     * @return  true，当一条request的状态是handled; false，当一条request的状态是unhandled
     * @Author Tzrea1
     * @Date 2022/12/07 08:55
     * @Version 1.0
     **/
    public boolean isHandled() {
        return this.handled;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
