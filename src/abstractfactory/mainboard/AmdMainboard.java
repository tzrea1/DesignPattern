package abstractfactory.mainboard;

public class AmdMainboard implements Mainboard {
    /**
     * @Description TODO: AMD Mainboard类
     * @Author Tzrea1
     * @Date 2022/12/6 21:57
     * @Version 1.0
     **/

    /**
     * AMD主板的插槽数
     */
    private int cpuHoles = 0;

    /**
     * @param cpuHoles
     * @return
     * @Description TODO: 传入插槽数，创建Amd主板实体
     * @Author Tzrea1
     * @Date 2022/12/06 23:21
     * @Version 1.0
     **/
    public AmdMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    /**
     * @return
     * @Description TODO: 打印AMD Mainboard的插槽信息
     * @Author Tzrea1
     * @Date 2022/12/06 22:33
     * @Version 1.0
     **/
    @Override
    public void printInformation() {
        System.out.println("AMD 主板的CPU插槽孔数是：" + cpuHoles);
    }
}
