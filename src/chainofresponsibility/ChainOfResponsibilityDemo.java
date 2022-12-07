package chainofresponsibility;

/**
 * @Description TODO: Chain of responsibility的演示用类
 * @Author Tzrea1
 * @Date 2022/12/7 1:28
 * @Version 1.0
 **/
public class ChainOfResponsibilityDemo {

    /**
     * @Description TODO: Chain of responsibility的演示函数
     * @return
     * @Author Tzrea1
     * @Date 2022/12/07 08:33
     * @Version 1.0
     **/
    public static void startChainOfResponsibilityDemo() {
        //Chain of responsibility 模式演示开始
        System.out.println("---------------- [Pattern] Chain of Responsibility ----------------");
        // 创建Client对象：Boss
        Boss boss = new Boss();
        // Boss发出request，内容是网上销售
        boss.makeRequest(new Request(RequestType.ONLINE_SALE, "负责产品的网上销售"));
        // Boss发出request，内容是商场销售
        boss.makeRequest(new Request(RequestType.MALL_SALE, "负责产品的商场销售"));
        // Boss发出request，内容是专卖店销售
        boss.makeRequest(new Request(RequestType.STORE_SALE, "负责产品的专卖店销售"));
        //Chain of responsibility模式演示结束
        System.out.println("----------------------- END ------------------------" + "\n");
    }
}
