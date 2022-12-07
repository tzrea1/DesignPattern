package command;

public class OrderCommand implements Command{
    //裁判及运动员信息
    private Referee _referee;
    private Athlete _athlete;
    /**
     * @param referee
     * @param athlete
     * @Description 设置命令信息
     * @return null
     * @Author MXY
     * @Date 2022/12/7 10:39
     **/
    public  OrderCommand(Referee referee,Athlete athlete){
        _referee=referee;
        _athlete=athlete;
    }
    /**
     * @param
     * @Description 绑定起跑命令
     * @return void
     * @Author MXY
     * @Date 2022/12/7 10:40
     **/
    public void execute(){
        System.out.println("裁判"+_referee.getName()+"向运动员"+ _athlete.getName()+"发令起跑");
        _athlete.start();
    }
}
