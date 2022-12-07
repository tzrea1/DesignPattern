package visitor;

/**
 * @Description 用于演示访问者设计模式的类
 * @Author Ice Cream
 * @Date 2022/12/7 9:18
 */
public class VisitorDemo {
    public static void startVisitorDemo() {
        //开始阶段提示
        System.out.println("----------------- [Pattern] Visitor ----------------");
        /*初始化快递中心的顺丰快递柜和京东快递柜*/
        //创建ExpressCenter(快递中心)对象
        ExpressCenter expressCenter = new ExpressCenter();
        //添加元素（快递柜）到ExpressCenter对象中
        expressCenter.add(new JDLocker());
        expressCenter.add(new SFLocker());
        /*开始进行访问*/
        //创建快递员对象
        Courier courier = new Courier();
        //快递员访问所有快递柜
        expressCenter.action(courier);
        //创建买家对象
        Buyer buyer = new Buyer();
        //买家访问所有的快递柜
        expressCenter.action(buyer);
        //结束阶段提示
        System.out.println("----------------------- END ------------------------");
    }
}
