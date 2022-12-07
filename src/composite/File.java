package composite;

/**
 * @Description 文件类
 * @Author MXY
 * @Date 2022/12/6 21:20
 * @Version 1.0
 **/
public class File extends Entry {
    /**
     * 文件名
     */
    private String name;
    /**
     * 文件大小
     */
    private int size;

   /**
    * @param name
    * @param size
    * @Description 构造函数初始化File
    * @return null
    * @Author
    * @Date 2022/12/6 21:38
    **/
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    /**
     * @param
     * @Description 获取文件名
     * @return String
     * @Author MXY
     * @Date 2022/12/6 22:37
     **/
    @Override
    public String getName() {
        return name;
    }
    /**
     * @param
     * @Description 获取文件大小
     * @return int
     * @Author MXY
     * @Date 2022/12/6 22:37
     **/
    @Override
    public int getSize() {
        return size;
    }
    /**
     * @param prefix
     * @Description 打印文件路径及大小
     * @return void
     * @Author MXY
     * @Date 2022/12/6 22:38
     **/
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + '/' + this);
    }

}
