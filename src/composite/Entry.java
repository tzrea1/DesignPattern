package composite;

/**
 * @Description 目录条目抽象类
 * @Author MXY
 * @Date 2022/12/6 21:18
 **/
public abstract class Entry {
    /**
     * @param
     * @Description 获取条目名
     * @return String
     * @Author MXY
     * @Date 2022/12/6 22:31
     **/
    public abstract String getName();
    /**
     * @param
     * @Description 获取大小
     * @return int
     * @Author MXY
     * @Date 2022/12/6 22:31
     **/
    public abstract int getSize();
    /**
     * @param entry
     * @Description 添加子文件或子目录
     * @return Entry
     * @Author MXY
     * @Date 2022/12/6 22:32
     **/
    public Entry add(Entry entry) {
        return this;
    }
    /**
     * @param
     * @Description 递归打印
     * @return void
     * @Author MXY
     * @Date 2022/12/6 22:32
     **/
    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);
    /**
     * @param
     * @Description 转字符
     * @return String
     * @Author MXY
     * @Date 2022/12/6 22:34
     **/
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}

