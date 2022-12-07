import abstractfactory.AbstractFactoryDemo;
import composite.CompositeDemo;
import command.CommandDemo;
import flyweight.FlyweightDemo;
import interpreter.InterpreterDemo;

public class Demo {
    public static void main(String[] args) {
        //测试
        AbstractFactoryDemo.startAbstractFactoryDemo();
        CommandDemo.startCommandDemo();
        CompositeDemo.startCompositeDemo();
        FlyweightDemo.startFlyweightDemo();
        InterpreterDemo.startInterpreterDome();
    }
}
