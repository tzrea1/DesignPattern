package abstractfactory.factory;

import abstractfactory.cpu.AmdCpu;
import abstractfactory.cpu.Cpu;
import abstractfactory.mainboard.AmdMainboard;
import abstractfactory.mainboard.Mainboard;

public class AmdFactory implements AbstractFactory {
    /**
     * @Description TODO: AmdFactory，用于实现创建AMD系列产品对象的操作
     * @Author Tzrea1
     * @Date 2022/12/6 22:09
     * @Version 1.0
     **/

    /**
     * @return
     * @Description TODO: 创建AMD CPU
     * @Author Tzrea1
     * @Date 2022/12/06 22:52
     * @Version 1.0
     **/
    @Override
    public Cpu createCpu() {
        return new AmdCpu(1234);
    }

    /**
     * @return
     * @Description TODO: 创建AMD MainBoard
     * @Author Tzrea1
     * @Date 2022/12/06 22:57
     * @Version 1.0
     **/
    @Override
    public Mainboard createMainBoard() {
        return new AmdMainboard(1234);
    }
}
