package iterator;

/**
 * @Description 规定抽象的聚合类
 * @Author Ice Cream
 * @Date 2022/12/6 21:34
 */
public interface Aggregate {

    /**
     * 在聚合类中创建相应迭代器对象的接口
     * @return 新创建的迭代器对象
     */
    public abstract Iterator createIterator();
}
