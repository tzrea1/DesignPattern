package command;

public class Athlete {
    private String name;
    public Athlete(String _name){
        name = _name;
    }

    public String getName() {
        return name;
    }

    public void start(){
        System.out.println("运动员"+name+"启动！");
    }
}
