package iterator;

/**
 * @Description 具体迭代器
 * @Author Ice Cream
 * @Date 2022/12/6 21:33
 */
public class StudentIterator implements Iterator{

    /**
     * 学生的聚合
     */
    private StudentAggregate students;
    /**
     * 迭代器的指针，指示遍历到哪个位置了
     */
    private int index;

    /**
     * 构造函数，传入学生的聚合体
     * @param SA
     */
    public StudentIterator(StudentAggregate SA) {
        this.students = SA;
        this.index = 0;
    }

    /**
     * 判断是否有下一个元素
     * @return 存在——true 不存在——false
     */
    public boolean hasNext(){
        if(index < this.students.count()){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * 迭代器指针向后移动一格
     */
    public void move(){
        index++;
    }

    /**
     * 返回迭代器当前遍历到的元素
     * @return 当前元素
     */
    public Object currentItem(){
        Student current=this.students.getStudentAt(index);
        return current;
    }
}
