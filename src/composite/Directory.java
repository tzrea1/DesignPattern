package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description 文件夹类
 * @Author MXY
 * @Date 2022/12/6 21:14
 **/
public class Directory extends Entry {
    /**
     * 文件夹名
     */
    private String name;
    /**
     *用于保存文件夹下内容的List
     */
    private ArrayList directory = new ArrayList();
    /**
     * @param name
     * @Description Directory构造函数
     * @return null
     * @Author MXY
     * @Date 2022/12/6 22:24
     **/
    public Directory(String name) {
        this.name = name;
    }
    /**
     * @param
     * @Description 获取文件夹名
     * @return String
     * @Author MXY
     * @Date 2022/12/6 22:24
     **/
    @Override
    public String getName() {
        return name;
    }
    /**
     * @param
     * @Description 获取文件夹下内容总大小
     * @return int
     * @Author MXY
     * @Date 2022/12/6 22:25
     **/
    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    /**
     * @param entry
     * @Description 添加文件夹或文件
     * @return Entry
     * @Author MXY
     * @Date 2022/12/6 22:27
     **/
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
    /**
     * @param prefix
     * @Description 递归打印文件夹下的所有内容及大小
     * @return void
     * @Author MXY
     * @Date 2022/12/6 22:28
     **/
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
        Iterator it = directory.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}

