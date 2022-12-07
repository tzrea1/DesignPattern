package visitor;

/**
 * @Description 具体元素，此处为京东储物柜，接受访问者的访问
 * @Author Ice Cream
 * @Date 2022/12/7 9:29
 */
public class JDLocker implements Locker{
    /**
     * 接受访问者的访问操作
     * @param person 实际访问者
     */
    public void accept(Person person) {
        person.visit(this); //访问者访问京东储物柜
        System.out.println("[ 京东储物柜被使用 ]");
    }
}
