package abstractfactory.mainboard;

public class IntelMainboard implements Mainboard {
    /**
     * @Description TODO: Intel Mainboard类
     * @Author Tzrea1
     * @Date 2022/12/6 21:56
     * @Version 1.0
     **/
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     */
    public IntelMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    /**
     * @return
     * @Description TODO: 打印Intel Mainboard的插槽信息
     * @Author Tzrea1
     * @Date 2022/12/06 22:33
     * @Version 1.0
     **/
    @Override
    public void printInformation() {
        System.out.println("Intel 主板的CPU插槽孔数是：" + cpuHoles);
    }
}
