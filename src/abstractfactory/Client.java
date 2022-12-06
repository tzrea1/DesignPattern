package abstractfactory;

import abstractfactory.cpu.Cpu;
import abstractfactory.factory.AbstractFactory;
import abstractfactory.mainboard.Mainboard;

public class Client {
/**
 * @Description TODO: Client类，供演示时创建使用。调用先前创建好的类。
 * @Author Tzrea1
 * @Date 2022/12/6 22:04
 * @Version 1.0
 **/
    /**
     * 装机时使用的Cpu
     */
    private Cpu cpu;
    /**
     * 装机时使用的MainBoard
     */
    private Mainboard mainboard;

    public void buildComputer(AbstractFactory factory) {
        /**
         * @Description TODO: 进行装机，调用prepareHardwares函数，准备相关硬件
         * @return
         * @param factory
         * @Author Tzrea1
         * @Date 2022/12/06 23:08 
         * @Version 1.0
         **/
        prepareHardwares(factory);
        // 输出获取产品（CPU、Mainboard）的信息
        this.cpu.printInformation();
        this.mainboard.printInformation();
    }

    private void prepareHardwares(AbstractFactory factory) {
        /**
         * @Description TODO: 准备装机所需要的硬件，向相应的共产获取产品
         * @return
         * @param factory
         * @Author Tzrea1
         * @Date 2022/12/06 23:14
         * @Version 1.0
         **/
        // 向相应的工厂获取所需产品（CPU、Mainboard）
        this.cpu = factory.createCpu();
        this.mainboard = factory.createMainBoard();
    }
}
