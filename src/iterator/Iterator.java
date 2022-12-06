package iterator;

/**
 * @Description 迭代器，用以定义访问和遍历元素的接口
 * @Author Ice Cream
 * @Date 2022/12/6 21:33
 */
public interface Iterator {

    /**
     * 判断是否有下一个元素
     * @return 存在——true 不存在——false
     */
    public abstract boolean hasNext();

    /**
     * 迭代器指针向后移动一格
     */
    public abstract void move();

    /**
     * 返回迭代器当前遍历到的元素
     * @return 当前元素
     */
    public abstract Object currentItem();
}
