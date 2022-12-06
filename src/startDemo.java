import abstractfactory.AbstractFactoryDemo;
import composite.CompositeDemo;
import command.CommandDemo;

public class startDemo {
    public static void main(String[] args) {
        //测试
        AbstractFactoryDemo.startAbstractFactoryDemo();
        CommandDemo.startCommandDemo();
        CompositeDemo.startCompositeDemo();
    }
}
