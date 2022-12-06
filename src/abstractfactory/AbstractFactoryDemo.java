package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.AmdFactory;
import abstractfactory.factory.IntelFactory;

public class AbstractFactoryDemo {
    /**
     * @Description TODO: AbstractFactory的演示用类
     * @Author Tzrea1
     * @Date 2022/12/6 21:08
     * @Version 1.0
     **/
    public static void startAbstractFactoryDemo() {
        /**
         * @Description TODO: AbstractFactory演示用类的运行函数
         * @return
         * @Author Tzrea1
         * @Date 2022/12/06 21:39
         * @Version 1.0
         **/
        //AbstractFactory模式演示开始
        System.out.println("---------------- [Pattern] AbstractFactory ----------------");
        // 创建Client1对象
        Client client1 = new Client();
        // 客户选择并创建Amd系列的产品对象
        AbstractFactory amdFactory = new AmdFactory();
        System.out.println("客户1选择AMD系列产品");
        // 组装电脑
        client1.buildComputer(amdFactory);
        System.out.println("AMD系列产品的信息如下：");
        System.out.println("产品型号匹配，客户1电脑组装成功！");

        // 创建Client2对象
        Client client2 = new Client();
        // 客户选择并创建Intel系列的产品对象
        AbstractFactory intelFactory = new IntelFactory();
        System.out.println("\n" + "客户2选择Intel系列产品");
        // 客户2组装电脑
        client2.buildComputer(intelFactory);
        System.out.println("Intel系列产品的信息如下：");
        System.out.println("产品型号匹配，客户2电脑组装成功！");
        //AbstractFactory模式演示结束
        System.out.println("----------------------- END ------------------------" + "\n");
    }
}
