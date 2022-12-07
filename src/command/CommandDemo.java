package command;

public class CommandDemo {
    public static void startCommandDemo() {
        System.out.println("---------------- [Pattern] Command ----------------");
        System.out.println("利用裁判向运动员发令来演示Command的设计模式");
        Referee myReferee=new Referee("马库斯");
        Athlete myPlayer =new Athlete("苏炳添") ;
        System.out.println("[ command : 执行命令 execute() ]");
        OrderCommand command = new OrderCommand(myReferee ,myPlayer);
        command.execute();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");
    }
}