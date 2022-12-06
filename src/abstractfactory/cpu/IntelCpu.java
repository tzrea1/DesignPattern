package abstractfactory.cpu;

public class IntelCpu implements Cpu {
    /**
     * @Description TODO: Intel CPU类
     * @Author Tzrea1
     * @Date 2022/12/6 21:49
     * @Version 1.0
     **/

    /**
     * Intel CPU的针脚数
     */
    private final int pins;

    /**
     * @param pins
     * @return
     * @Description TODO: Intel Cpu的构造函数
     * @Author Tzrea1
     * @Date 2022/12/06 22:27
     * @Version 1.0
     **/
    public IntelCpu(int pins) {
        this.pins = pins;
    }

    /**
     * @return
     * @Description TODO: 打印Intel CPU的针脚信息
     * @Author Tzrea1
     * @Date 2022/12/06 22:33
     * @Version 1.0
     **/
    @Override
    public void printInformation() {
        System.out.println("Intel Cpu的针脚数：" + pins);
    }
}

