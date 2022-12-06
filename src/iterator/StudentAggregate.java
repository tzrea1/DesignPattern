package iterator;

/**
 * @Description 具体的聚合类
 * @Author Ice Cream
 * @Date 2022/12/6 21:33
 */
public class StudentAggregate implements Aggregate {

    /** 学生的聚合 */
    private Student[] students;
    /** anchor用来表示数组实际已有学生数量，也即有意义的实际数量 */
    private int anchor = 0;

    /**
     * 构造函数
     * @param maxsize 学生最大数量
     */
    public StudentAggregate(int maxsize) {
        this.students = new Student[maxsize];
    }

    /**
     * 返回index处的学生
     * @param index 所处位置
     * @return 学生
     */
    public Student getStudentAt(int index) {
        return this.students[index];
    }

    /**
     * 计算当前有多少学生
     * @return 学生数量
     */
    public int count(){
        return this.anchor;
    }

    /**
     * 添加学生
     * @param student 新添加的学生
     */
    public void append(Student student) {
        this.students[anchor] = student;
        anchor++;
    }

    /**
     * 在具体的聚合类中实现创建相应迭代器的接口
     * @return 一个新建的具体的合适的迭代器
     */
    public Iterator createIterator(){
        return new StudentIterator(this);
    }
}