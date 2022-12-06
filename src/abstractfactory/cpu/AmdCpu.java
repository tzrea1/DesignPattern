package abstractfactory.cpu;

public class AmdCpu implements Cpu {
    /**
     * @Description TODO: AMD CPU类
     * @Author Tzrea1
     * @Date 2022/12/6 21:55
     * @Version 1.0
     **/

    /**
     * AMD CPU的针脚数
     */
    private final int pins;

    /**
     * @param pins
     * @return
     * @Description TODO: AMD Cpu的构造函数
     * @Author Tzrea1
     * @Date 2022/12/06 22:27
     * @Version 1.0
     **/
    public AmdCpu(int pins) {
        this.pins = pins;
    }

    /**
     * @return
     * @Description TODO: 打印AMD CPU的针脚信息
     * @Author Tzrea1
     * @Date 2022/12/06 22:33
     * @Version 1.0
     **/
    @Override
    public void printInformation() {
        System.out.println("AMD CPU的针脚数为：" + pins);
    }
}
