package iterator;

/**
 * @Description 学生类
 * @Author Ice Cream
 * @Date 2022/12/6 21:35
 */
public class Student {

    private String name; //学生姓名
    private String number; //学生学号

    /**
     * 构造函数
     * @param name 学生姓名
     * @param number 学生学号
     */
    public Student(String name,String number){this.name=name;this.number=number;}

    /**
     * 获取学生姓名
     * @return 学生姓名
     */
    public String getName(){return name;}

    /**
     * 获取学生学号
     * @return 学生学号
     */
    public String getnumber(){return number;}

    /**
     * 修改学生姓名
     * @param name 新的姓名
     */
    public void modifyName(String name){this.name=name;}

    /**
     * 修改学生学号
     * @param number 新的学号
     */
    public void modifynumber(String number){this.number=number;}
}
