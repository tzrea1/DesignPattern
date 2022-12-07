package mvc;

import mvc.enums.HeartRate;
import mvc.enums.Sleep;
import mvc.enums.Stress;

/**
 * @Description TODO: 手环的Controller，控制显示信息
 * @Author Tzrea1
 * @Date 2022/12/7 1:59
 * @Version 1.0
 **/
public class BondController {

    /**
    * 本controller绑定的model实体
    */
    private final BondModel model;
    /**
     * 本controller绑定的view实体
     */
    private final BondView view;

    /**
     * @Description TODO: BondController的构造函数，绑定model和view
     * @return
     * @param model
     * @param view
     * @Author Tzrea1
     * @Date 2022/12/07 13:46
     * @Version 1.0
     **/
    public BondController(BondModel model, BondView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * @Description TODO: 与model交互，得到HeartRate心率信息
     * @return HeartRate心率
     * @Author Tzrea1
     * @Date 2022/12/07 14:06
     * @Version 1.0
     **/
    public HeartRate getHeartRate() {
        return model.getHeartRate();
    }

    /**
     * @Description TODO: 传递信息给model，更改HeartRate心率信息
     * @return
     * @param heartRate
     * @Author Tzrea1
     * @Date 2022/12/07 14:07
     * @Version 1.0
     **/
    public void setHeartRate(HeartRate heartRate) {
        this.model.setHeartRate(heartRate);
    }

    /**
     * @Description TODO: 与model交互，得到Sleep睡眠信息
     * @return  Sleep
     * @Author Tzrea1
     * @Date 2022/12/07 14:07
     * @Version 1.0
     **/
    public Sleep getSleep() {
        return model.getSleep();
    }

    /**
     * @Description TODO: 传递信息给model，更改Sleep睡眠信息
     * @return
     * @param sleep
     * @Author Tzrea1
     * @Date 2022/12/07 14:08
     * @Version 1.0
     **/
    public void setSleep(Sleep sleep) {
        this.model.setSleep(sleep);
    }

    /**
     * @Description TODO:与model交互，得到Stress压力信息
     * @return Stress
     * @Author Tzrea1
     * @Date 2022/12/07 14:17
     * @Version 1.0
     **/
    public Stress getStress() {
        return model.getStress();
    }

    /**
     * @Description TODO: 传递信息给model，更改Stress压力信息
     * @return
     * @param stress
     * @Author Tzrea1
     * @Date 2022/12/07 14:17
     * @Version 1.0
     **/
    public void setStress(Stress stress) {
        this.model.setStress(stress);
    }

    /**
     * @Description TODO: 更新View信息(HeartRate、Sleep、Stress)
     * @return
     * @Author Tzrea1
     * @Date 2022/12/07 14:18
     * @Version 1.0
     **/
    public void updateView() {
        this.view.displayInformation(model);
    }
}
