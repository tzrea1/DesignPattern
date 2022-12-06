package abstractfactory.factory;

import abstractfactory.cpu.Cpu;
import abstractfactory.mainboard.Mainboard;

public interface AbstractFactory {
/**
 * @Description TODO: 作为创建抽象产品对象（CPU/Mainboard）的操作接口
 * @Author Tzrea1
 * @Date 2022/12/6 22:08
 * @Version v1.0
 */

    /**
     * @return
     * @Description TODO: 实现创建CPU产品的操作
     * @Author Tzrea1
     * @Date 2022/12/06 22:39
     * @Version 1.0
     **/
    Cpu createCpu();

    /**
     * @return
     * @Description TODO: 实现创建Mainboard的操作
     * @Author Tzrea1
     * @Date 2022/12/06 22:40
     * @Version 1.0
     **/
    Mainboard createMainBoard();

}
