import abstractfactory.AbstractFactoryDemo;
import chainofresponsibility.ChainOfResponsibilityDemo;
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
<<<<<<< HEAD
        InterpreterDemo.startInterpreterDome();
=======
        ChainOfResponsibilityDemo.startChainOfResponsibilityDemo();
>>>>>>> origin/main
    }
}
