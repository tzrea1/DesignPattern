package mvc;

import mvc.enums.HeartRate;
import mvc.enums.Sleep;
import mvc.enums.Stress;

/**
 * @Description TODO: MVC模式的演示用类
 * @Author Tzrea1
 * @Date 2022/12/7 1:36
 * @Version 1.0
 **/
public class MVCDemo {
    /**
     * @Description TODO: MVC模式的演示函数
     * @return
     * @param
     * @Author Tzrea1
     * @Date 2022/12/07 10:35
     * @Version 1.0
     **/
    public static void stratMVCDemo() {
        // 创建model view controller
        BondModel model = new BondModel(HeartRate.NORMAL, Sleep.HEALTHY, Stress.RELAX);
        BondView view = new BondView();
        BondController controller = new BondController(model, view);
        System.out.println("---------------- [Pattern] MVC ----------------");
        // 初次显示
        System.out.println("初次显示：");
        controller.updateView();

        // Controller 接受到影响Bond的新信息
        controller.setHeartRate(HeartRate.TOOFAST);
        controller.setSleep(Sleep.LACK);
        controller.setStress(Stress.TOOMUCH);
        // 更新显示的信息
        System.out.println("第一次数据更新：");
        controller.updateView();

        // Controller 接受到影响Bond的新信息
        controller.setHeartRate(HeartRate.TOOSLOW);
        controller.setSleep(Sleep.TOOMUCH);
        controller.setStress(Stress.NORMAL);
        // 更新显示的信息
        System.out.println("第二次数据更新：");
        controller.updateView();
        System.out.println("----------------------- END ------------------------" + "\n");
    }
}
