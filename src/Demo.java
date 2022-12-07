import abstractfactory.AbstractFactoryDemo;
import chainofresponsibility.ChainOfResponsibilityDemo;
import composite.CompositeDemo;
import command.CommandDemo;
import flyweight.FlyweightDemo;

public class Demo {
    public static void main(String[] args) {
        //测试
        AbstractFactoryDemo.startAbstractFactoryDemo();
        CommandDemo.startCommandDemo();
        CompositeDemo.startCompositeDemo();
        FlyweightDemo.startFlyweightDemo();
        ChainOfResponsibilityDemo.startChainOfResponsibilityDemo();
    }
}
