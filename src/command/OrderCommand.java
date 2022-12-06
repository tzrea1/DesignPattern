package command;

public class OrderCommand implements Command{

    //裁判及运动员信息
    private Referee _referee;
    private Athlete _athlete;
    /*
    设置信息
     */
    public  OrderCommand(Referee referee,Athlete athlete){
        _referee=referee;
        _athlete=athlete;
    }
    public void execute(){
        System.out.println("裁判"+_referee.getName()+"向运动员"+ _athlete.getName()+"发令起跑");
        _athlete.start();
    }
}
