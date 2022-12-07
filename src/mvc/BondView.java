package mvc;
/**
 * @Description TODO: 手环显示屏的View，负责显示信息
 * @Author Tzrea1
 * @Date 2022/12/7 2:00
 * @Version 1.0
 **/
public class BondView {
    /**
     * @Description TODO: 显示相关信息（心率、睡眠状况、压力状况）
     * @return
     * @param model
     * @Author Tzrea1
     * @Date 2022/12/07 10:32
     * @Version 1.0
     **/
    public void displayInformation(BondModel model) {
        System.out.println(model.toString());
    }
}
