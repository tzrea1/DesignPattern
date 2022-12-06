package iterator;

/**
 * @Description 用于演示Iterator设计模式的类
 * @Author Ice Cream
 * @Date 2022/12/6 21:36
 */
public class IteratorDemo {
    /**
     * 创建一个学生聚合实例，进行迭代器模式的演示操作
     */
    public static void startAbstractFactoryDemo() {
        //开始阶段提示
        System.out.println("---------------- [Pattern] Iterator ----------------");
        /*初始化学生聚合过程*/
        System.out.println("[ 开始进行初始化工作... ]");
        //设定聚合中学生数最大为4
        StudentAggregate studentAggregate=new StudentAggregate(4);
        //逐个进行添加
        studentAggregate.append(new Student("小红","20123"));
        System.out.println("[ 已添加一个 Student 实例到学生聚合 ]");
        studentAggregate.append(new Student("小蓝","20124"));
        System.out.println("[ 已添加一个 Student 实例到学生聚合 ]");
        studentAggregate.append(new Student("小黄","20125"));
        System.out.println("[ 已添加一个 Student 实例到学生聚合 ]");
        studentAggregate.append(new Student("小白","20126"));
        System.out.println("[ 已添加一个 Student 实例到学生聚合 ]");
        //添加结束
        System.out.println("[ 该学生聚合内容添加完毕 ]");
        //创建获取迭代器对象
        Iterator iterator=studentAggregate.createIterator();
        System.out.println("[ 已创建并获取该学生聚合对应的迭代器 ]");
        /*迭代器开始对学生聚合进行遍历*/
        System.out.println("[ 开始进行遍历... ]");
        while (iterator.hasNext()) {
            Student student = (Student) iterator.currentItem();
            System.out.println("[ Iterator : currentItem() : 当前遍历到的学生为： ]");
            System.out.println("[ 姓名："+student.getName()+"学号："+student.getnumber()+" ]");
            iterator.move();
            System.out.println("[ Iterator : move() : 遍历指针已向后移动一格 ]");
        }
        System.out.println("[ 遍历结束 ]");
        //结束阶段提示
        System.out.println("----------------------- END ------------------------");
    }
}
