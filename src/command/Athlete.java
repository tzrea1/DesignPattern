package command;

public class Athlete {
    /**
     * 运动员姓名
     */
    private String name;
    /**
     * @param _name
     * @Description 构造函数初始化
     * @return null
     * @Author MXY
     * @Date 2022/12/7 10:35
     **/
    public Athlete(String _name){
        name = _name;
    }
    /**
     * @param
     * @Description 获取姓名
     * @return String
     * @Author MXY
     * @Date 2022/12/7 10:36
     **/
    public String getName() {
        return name;
    }
    /**
     * @param
     * @Description 运动员起跑操作，绑定到execute中
     * @return void
     * @Author MXY
     * @Date 2022/12/7 10:36
     **/
    public void start(){
        System.out.println("运动员"+name+"启动！");
    }
}
