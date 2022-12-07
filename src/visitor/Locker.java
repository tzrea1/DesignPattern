package visitor;

/**
 * @Description 元素，此处为一个抽象的元素，即储物柜，在此定义accept操作
 * @Author Ice Cream
 * @Date 2022/12/7 9:42
 */
public interface Locker {
    /**
     * 接受访问者访问的功能
     */
    void accept(Person person);
}
