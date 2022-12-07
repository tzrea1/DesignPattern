package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 对象结构，提供高层的接口给访问者访问，含有元素集合
 * @Author Ice Cream
 * @Date 2022/12/7 9:40
 */
public class ExpressCenter {
    /**
     * 声明一个集合对象（储物柜集合），用来存储元素对象
     */
    private List<Locker> nodeList = new ArrayList<Locker>();

    /**
     * 添加元素（具体储物柜）功能
     * @param Locker 具体储物柜
     */
    public void add(Locker Locker) {
        nodeList.add(Locker);
    }

    /**
     * 供访问者遍历访问储物柜集合中所有储物柜的操作
     * @param person 具体访问者
     */
    public void action(Person person) {
        //遍历集合，获取每一个元素，让访问者访问每一个元素
        for (Locker Locker : nodeList) {
            Locker.accept(person);
        }
    }
}
