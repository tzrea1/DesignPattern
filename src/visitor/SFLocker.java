package visitor;

/**
 * @Description 具体元素，此处为顺丰储物柜，接受访问者的访问
 * @Author Ice Cream
 * @Date 2022/12/7 9:44
 */
public class SFLocker implements Locker{
    /**
     * 接受访问者的访问操作
     * @param person 实际访问者
     */
    public void accept(Person person) {
        person.visit(this); //访问者访问顺丰储物柜
        System.out.println("[ 顺丰储物柜被使用 ]");
    }
}
