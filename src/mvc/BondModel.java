package mvc;

import mvc.enums.HeartRate;
import mvc.enums.Sleep;
import mvc.enums.Stress;

/**
 * @Description TODO: 手环的Model，内含业务规则
 * @Author Tzrea1
 * @Date 2022/12/7 1:59
 * @Version 1.0
 **/
public class BondModel {

    /**
     * 本model的heartRate实体
     */
    private HeartRate heartRate;
    /**
     * 本model的Sleep实体
     */
    private Sleep sleep;
    /**
     * 本model的Stress实体
     */
    private Stress stress;

    /**
     * @Description TODO: model的构造函数
     * @return
     * @param heartRate
     * @param sleep
     * @param stress
     * @Author Tzrea1
     * @Date 2022/12/07 14:20
     * @Version 1.0
     **/
    public BondModel(HeartRate heartRate, Sleep sleep, Stress stress) {
        this.heartRate = heartRate;
        this.sleep = sleep;
        this.stress = stress;
    }

    /**
     * @Description TODO: 得到HeartRate心率信息，供controller调用
     * @return  heartRate
     * @Author Tzrea1
     * @Date 2022/12/07 14:21 
     * @Version 1.0
     **/
    public HeartRate getHeartRate() {
        return heartRate;
    }

    /**
     * @Description TODO: 设定HeartRate心率信息，供controller调用
     * @return
     * @param heartRate
     * @Author Tzrea1
     * @Date 2022/12/07 14:23
     * @Version 1.0
     **/
    public void setHeartRate(HeartRate heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * @Description TODO: 得到Sleep睡眠信息，供controller调用
     * @return Sleep
     * @Author Tzrea1
     * @Date 2022/12/07 14:23
     * @Version 1.0
     **/
    public Sleep getSleep() {
        return sleep;
    }

    /**
     * @Description TODO: 设定Sleep睡眠信息，供controller调用
     * @return
     * @param sleep
     * @Author Tzrea1
     * @Date 2022/12/07 14:23
     * @Version 1.0
     **/
    public void setSleep(Sleep sleep) {
        this.sleep = sleep;
    }

    /**
     * @Description TODO: 得到Stress压力信息，供controller调用
     * @return
     * @Author Tzrea1
     * @Date 2022/12/07 14:24
     * @Version 1.0
     **/
    public Stress getStress() {
        return stress;
    }

    /**
     * @Description TODO: 设定Stress压力信息，供controller调用
     * @return
     * @param stress
     * @Author Tzrea1
     * @Date 2022/12/07 14:24
     * @Version 1.0
     **/
    public void setStress(Stress stress) {
        this.stress = stress;
    }

    @Override
    public String toString() {
        return String.format("心率等级："+heartRate+"  睡眠等级："+sleep+"  压力等级："+stress);
    }
}
