package abstractfactory.factory;

import abstractfactory.cpu.Cpu;
import abstractfactory.cpu.IntelCpu;
import abstractfactory.mainboard.IntelMainboard;
import abstractfactory.mainboard.Mainboard;

public class IntelFactory implements AbstractFactory {
    /**
     * @Description TODO: IntelFactory，用于实现创建Intel系列产品对象的操作
     * @Author Tzrea1
     * @Date 2022/12/6 22:09
     * @Version 1.0
     **/

    /**
     * @return
     * @Description TODO: 创建Intel CPU
     * @Author Tzrea1
     * @Date 2022/12/06 22:59
     * @Version 1.0
     **/
    @Override
    public Cpu createCpu() {
        return new IntelCpu(2333);
    }

    /**
     * @return
     * @Description TODO: 创建Intel MainBoard
     * @Author Tzrea1
     * @Date 2022/12/06 23:00
     * @Version 1.0
     **/
    @Override
    public Mainboard createMainBoard() {
        return new IntelMainboard(2333);
    }
}
